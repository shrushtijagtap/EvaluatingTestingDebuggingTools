package org.apache.commons.math3.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(0, 0, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((-1), (int) (short) -1, 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = hypergeometricDistribution3.inverseCumulativeProbability(1.7385873367861712E43d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 17,385,873,367,861,712,000,000,000,000,000,000,000,000,000 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, (-1737377827), 0, 3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1,737,377,827)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextHexString(50);
        double double8 = randomDataImpl0.nextCauchy((-0.0d), 2.718281828459045d);
        randomDataImpl0.reSeedSecure(1L);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = randomDataImpl0.nextHypergeometric(4, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (10) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.8465416895472542E44d) + "'", double3 == (-2.8465416895472542E44d));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "f469e4609072a7380463aa12d8cdfb05d3d3b9593aaca7c19a" + "'", str5, "f469e4609072a7380463aa12d8cdfb05d3d3b9593aaca7c19a");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.039908191859363d + "'", double8 == 8.039908191859363d);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = randomDataImpl0.nextHypergeometric(10, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7586143266522085E43d) + "'", double3 == (-1.7586143266522085E43d));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = hypergeometricDistribution3.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        int[] intArray3 = randomDataGenerator0.nextPermutation(3, 1);
        java.lang.String str5 = randomDataGenerator0.nextSecureHexString(100);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = randomDataGenerator0.nextHypergeometric(32, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0806c5daaf3f981f1456b1f0327523889d3227f83da168c743f9de1efd9f58d866a5fabb790b45d3f3633328276d7b10e963" + "'", str5, "0806c5daaf3f981f1456b1f0327523889d3227f83da168c743f9de1efd9f58d866a5fabb790b45d3f3633328276d7b10e963");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, (int) (short) -1, 34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        int int7 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((-1737377827));
        // The following exception was thrown during execution in test generation
        try {
            double double11 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        randomDataImpl0.reSeedSecure((long) (byte) -1);
        randomDataImpl0.reSeedSecure((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = randomDataImpl0.nextHypergeometric(0, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        boolean boolean4 = well19937c1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution8 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, (int) (short) 1, 32, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (32) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        well19937c1.setSeed((long) 4);
        double double8 = well19937c1.nextDouble();
        double double9 = well19937c1.nextGaussian();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator10 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = randomDataGenerator10.getRandomGenerator();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = randomDataGenerator10.nextHypergeometric(4, 32, 329628523);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (32) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0454649723986138d + "'", double8 == 0.0454649723986138d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.2595165042982135d) + "'", double9 == (-1.2595165042982135d));
        org.junit.Assert.assertNotNull(randomGenerator11);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(3, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (10) must be less than or equal to population size (3)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability(3);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution3.sample((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 10, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (52) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextSecureHexString(10);
        java.lang.String str7 = randomDataImpl0.nextSecureHexString((int) (short) 1);
        randomDataImpl0.reSeedSecure();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = randomDataImpl0.nextHypergeometric(0, (int) (byte) 100, 11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1410024917140132E43d) + "'", double3 == (-1.1410024917140132E43d));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8d06cb06a1" + "'", str5, "8d06cb06a1");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7" + "'", str7, "7");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistribution3.inverseCumulativeProbability((-0.9999999999999999d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -1 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        int int8 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double8 = hypergeometricDistribution3.cumulativeProbability(4, (int) (short) 100);
        int int12 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.0d, 34, (int) (short) 10);
        double double13 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistribution3.cumulativeProbability(4, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (4) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.probability(10);
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = hypergeometricDistribution3.sample((-1737377827));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1,737,377,827)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(0, 50, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        int int7 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double2 = randomDataGenerator0.nextChiSquare(100000.0d);
        randomDataGenerator0.reSeedSecure(0L);
        double double6 = randomDataGenerator0.nextExponential(Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = randomDataGenerator0.nextHypergeometric(4, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (52) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99887.30650808732d + "'", double2 == 99887.30650808732d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 0);
        int int13 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        int int7 = hypergeometricDistribution3.sample();
        double double9 = hypergeometricDistribution3.probability((int) '#');
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability(63.37488998997757d, (-1), 11);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution3.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.cumulativeProbability(3);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(7714721797284111626L);
        int int10 = hypergeometricDistribution3.getNumberOfSuccesses();
        hypergeometricDistribution3.reseedRandomGenerator((long) (-127));
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability(3);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl11 = hypergeometricDistribution3.randomData;
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.cumulativeProbability(3);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(7714721797284111626L);
        int int13 = hypergeometricDistribution3.solveInverseCumulativeProbability(52.00000000000001d, 1433862686, 2061458278);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2061458278 + "'", int13 == 2061458278);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double8 = hypergeometricDistribution3.cumulativeProbability(4, (int) (short) 100);
        int int12 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.0d, 34, (int) (short) 10);
        double double15 = hypergeometricDistribution3.cumulativeProbability(34, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistribution3.cumulativeProbability(998139946, 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (998,139,946) must be less than or equal to upper endpoint (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        int[] intArray3 = randomDataGenerator0.nextPermutation(3, 1);
        int int7 = randomDataGenerator0.nextHypergeometric((int) (short) 100, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double10 = randomDataGenerator0.nextWeibull((double) 0.0f, 147.4131591025766d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: shape (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        double double6 = randomDataImpl0.nextCauchy(0.9927182648585196d, 0.2625525980804741d);
        double double9 = randomDataImpl0.nextCauchy((-4.0597202497451813E43d), 1.2165965492641364d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = hypergeometricDistribution13.random;
        int[] intArray16 = hypergeometricDistribution13.sample((int) (byte) 10);
        int int17 = hypergeometricDistribution13.sample();
        double double19 = hypergeometricDistribution13.probability((int) '#');
        int int20 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = randomDataImpl0.nextSecureLong(96L, 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (96) must be strictly less than upper bound (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.900263228093629E43d + "'", double3 == 5.900263228093629E43d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8583675327501705d + "'", double6 == 0.8583675327501705d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-4.0597202497451813E43d) + "'", double9 == (-4.0597202497451813E43d));
        org.junit.Assert.assertNotNull(randomGenerator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        double double6 = randomDataImpl0.nextCauchy(0.9927182648585196d, 0.2625525980804741d);
        double double9 = randomDataImpl0.nextCauchy((-4.0597202497451813E43d), 1.2165965492641364d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = hypergeometricDistribution13.random;
        int[] intArray16 = hypergeometricDistribution13.sample((int) (byte) 10);
        int int17 = hypergeometricDistribution13.sample();
        double double19 = hypergeometricDistribution13.probability((int) '#');
        int int20 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = randomDataImpl0.nextInt(42, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (42) must be strictly less than upper bound (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7087826206199477E43d + "'", double3 == 1.7087826206199477E43d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0439552117743436d + "'", double6 == 1.0439552117743436d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-4.0597202497451813E43d) + "'", double9 == (-4.0597202497451813E43d));
        org.junit.Assert.assertNotNull(randomGenerator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        double double6 = randomDataImpl0.nextCauchy(0.9927182648585196d, 0.2625525980804741d);
        double double9 = randomDataImpl0.nextCauchy((-4.0597202497451813E43d), 1.2165965492641364d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = hypergeometricDistribution13.random;
        int[] intArray16 = hypergeometricDistribution13.sample((int) (byte) 10);
        int int17 = hypergeometricDistribution13.sample();
        double double19 = hypergeometricDistribution13.probability((int) '#');
        int int20 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        int int21 = hypergeometricDistribution13.getSupportLowerBound();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.2716718450483787E44d) + "'", double3 == (-3.2716718450483787E44d));
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7066247765728412d + "'", double6 == 0.7066247765728412d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-4.0597202497451813E43d) + "'", double9 == (-4.0597202497451813E43d));
        org.junit.Assert.assertNotNull(randomGenerator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomGenerator randomGenerator8 = hypergeometricDistribution3.random;
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(randomGenerator8);
        org.junit.Assert.assertNotNull(randomGenerator9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        randomDataImpl0.reSeed();
        double double6 = randomDataImpl0.nextT(5.673098562899312E43d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution10 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution10.random;
        double double13 = hypergeometricDistribution10.cumulativeProbability(3);
        int int14 = hypergeometricDistribution10.getSupportLowerBound();
        boolean boolean15 = hypergeometricDistribution10.isSupportConnected();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution10);
        double double19 = randomDataImpl0.nextWeibull(2.4607106926121284E43d, 15.427060643992895d);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.9311408409044714E41d) + "'", double3 == (-1.9311408409044714E41d));
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0524864894564768E-9d) + "'", double6 == (-1.0524864894564768E-9d));
        org.junit.Assert.assertNotNull(randomGenerator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 15.427060643992895d + "'", double19 == 15.427060643992895d);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomGenerator randomGenerator8 = hypergeometricDistribution3.random;
        float float9 = randomGenerator8.nextFloat();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(randomGenerator8);
// flaky:         org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.21855497f + "'", float9 == 0.21855497f);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(0.7615941559557649d, 100.03693845824617d);
        int int6 = randomDataImpl0.nextInt(50, 2061458278);
        randomDataImpl0.reSeed();
        long long10 = randomDataImpl0.nextSecureLong(1L, (long) 11);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = randomDataImpl0.nextHypergeometric((-127), 0, 1433862686);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-127)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.08595940571567d) + "'", double3 == (-97.08595940571567d));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 245093908 + "'", int6 == 245093908);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        double double10 = hypergeometricDistribution3.cumulativeProbability((-2));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution3.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.cumulativeProbability(3);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(7714721797284111626L);
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability(63.37488998997757d, (-1), 11);
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        int int12 = hypergeometricDistribution3.sample();
        double double13 = hypergeometricDistribution3.getNumericalMean();
        hypergeometricDistribution3.reseedRandomGenerator((long) 1);
        double double17 = hypergeometricDistribution3.probability(137470501);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability(3);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution3.random;
        randomGenerator11.setSeed((int) (short) 100);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(randomGenerator11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        randomDataImpl0.reSeedSecure((long) (byte) -1);
        randomDataImpl0.reSeedSecure();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = randomDataImpl0.nextHypergeometric((-127), 7, 998139946);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-127)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0L);
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0L);
        double double10 = hypergeometricDistribution3.calculateNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator((long) 4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        well19937c1.setSeed((long) 4);
        double double8 = well19937c1.nextDouble();
        double double9 = well19937c1.nextGaussian();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator10 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        int int13 = randomDataGenerator10.nextPascal(4, 0.4098245272112848d);
        long long16 = randomDataGenerator10.nextSecureLong((-1L), 79L);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = randomDataGenerator10.nextHypergeometric(4, 1394374653, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (1,394,374,653) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0454649723986138d + "'", double8 == 0.0454649723986138d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.2595165042982135d) + "'", double9 == (-1.2595165042982135d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        int int9 = hypergeometricDistribution3.getPopulationSize();
        int int10 = hypergeometricDistribution3.sample();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution3.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, 0, 277264246);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (277,264,246) must be less than or equal to population size (34)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        int[] intArray3 = randomDataGenerator0.nextPermutation(3, 1);
        int int7 = randomDataGenerator0.nextHypergeometric((int) (short) 100, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = randomDataGenerator0.nextInt(10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (10) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        long long2 = well19937c1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution6 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 52, 870630129, 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (870,630,129) must be less than or equal to population size (52)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5141685311728891869L + "'", long2 == 5141685311728891869L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        double double9 = hypergeometricDistribution3.cumulativeProbability((int) '4', 551019857);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        boolean boolean4 = well19937c1.nextBoolean();
        boolean boolean5 = well19937c1.nextBoolean();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution9.random;
        int[] intArray12 = hypergeometricDistribution9.sample((int) (byte) 10);
        well19937c1.setSeed(intArray12);
        int int14 = well19937c1.nextInt();
        org.apache.commons.math3.random.Well19937c well19937c16 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int18 = well19937c16.nextInt(100);
        well19937c16.clear();
        int int20 = well19937c16.nextInt();
        well19937c16.setSeed((long) 4);
        double double23 = well19937c16.nextDouble();
        org.apache.commons.math3.random.Well19937c well19937c25 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int27 = well19937c25.nextInt(100);
        byte[] byteArray28 = new byte[] {};
        well19937c25.nextBytes(byteArray28);
        well19937c16.nextBytes(byteArray28);
        well19937c1.nextBytes(byteArray28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(randomGenerator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 429570717 + "'", int14 == 429570717);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1737377827) + "'", int20 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0454649723986138d + "'", double23 == 0.0454649723986138d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 50 + "'", int27 == 50);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double2 = randomDataGenerator0.nextChiSquare(100000.0d);
        randomDataGenerator0.reSeedSecure(0L);
        double double7 = randomDataGenerator0.nextCauchy(275.0d, 100000.0d);
        double double9 = randomDataGenerator0.nextT(1612.3358528512497d);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = randomDataGenerator0.nextHypergeometric(10, (int) (short) 100, 9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100053.22009238662d + "'", double2 == 100053.22009238662d);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-116298.44448425715d) + "'", double7 == (-116298.44448425715d));
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.29846824021405355d) + "'", double9 == (-0.29846824021405355d));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double8 = hypergeometricDistribution3.cumulativeProbability(4, (int) (short) 100);
        int int12 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.0d, 34, (int) (short) 10);
        double double15 = hypergeometricDistribution3.cumulativeProbability(34, (int) 'a');
        int int16 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextHexString(50);
        double double8 = randomDataImpl0.nextCauchy((-0.0d), 2.718281828459045d);
        randomDataImpl0.reSeedSecure(1L);
        double double13 = randomDataImpl0.nextGaussian(52.00000000000001d, 0.8414709848078966d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = hypergeometricDistribution17.random;
        int int19 = hypergeometricDistribution17.getSupportUpperBound();
        double double21 = hypergeometricDistribution17.probability(10);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = randomDataImpl0.nextInt(998139946, 14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (998,139,946) must be strictly less than upper bound (14)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.859900533512313E44d) + "'", double3 == (-4.859900533512313E44d));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "14fab9dd95bc3aeccf16a2722159a8f8bbb28675d9ce262790" + "'", str5, "14fab9dd95bc3aeccf16a2722159a8f8bbb28675d9ce262790");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.5848764548181713d) + "'", double8 == (-1.5848764548181713d));
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.40401446773674d + "'", double13 == 52.40401446773674d);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability(100);
        int int9 = hypergeometricDistribution3.getSampleSize();
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = hypergeometricDistribution3.random;
        java.lang.Class<?> wildcardClass6 = randomGenerator5.getClass();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(randomGenerator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = hypergeometricDistribution3.random;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = hypergeometricDistribution3.cumulativeProbability(61, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (61) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(randomGenerator5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        well19937c1.setSeed((long) 4);
        double double8 = well19937c1.nextDouble();
        double double9 = well19937c1.nextGaussian();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator10 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = randomDataGenerator10.nextHypergeometric((-1594884346), 2147483647, 6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1,594,884,346)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0454649723986138d + "'", double8 == 0.0454649723986138d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.2595165042982135d) + "'", double9 == (-1.2595165042982135d));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        int int9 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0L);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 5, 0, 0);
        int int5 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        int int7 = hypergeometricDistribution3.sample();
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        double double6 = randomDataImpl0.nextCauchy(0.9927182648585196d, 0.2625525980804741d);
        double double9 = randomDataImpl0.nextCauchy((-4.0597202497451813E43d), 1.2165965492641364d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = hypergeometricDistribution13.random;
        int[] intArray16 = hypergeometricDistribution13.sample((int) (byte) 10);
        int int17 = hypergeometricDistribution13.sample();
        double double19 = hypergeometricDistribution13.probability((int) '#');
        int int20 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        double double21 = hypergeometricDistribution13.getNumericalMean();
        int int22 = hypergeometricDistribution13.getSampleSize();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.313612265123901E43d) + "'", double3 == (-5.313612265123901E43d));
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0244007533571358d + "'", double6 == 1.0244007533571358d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-4.0597202497451813E43d) + "'", double9 == (-4.0597202497451813E43d));
        org.junit.Assert.assertNotNull(randomGenerator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        org.apache.commons.math3.random.RandomGenerator randomGenerator5 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(randomGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability(3);
        double double12 = hypergeometricDistribution3.probability((int) (byte) 1);
        double double15 = hypergeometricDistribution3.cumulativeProbability(0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistribution3.inverseCumulativeProbability(1.995898820673947d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 1.996 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        double double10 = hypergeometricDistribution3.probability(28);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistribution3.cumulativeProbability((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        randomDataImpl0.reSeed();
        double double6 = randomDataImpl0.nextT(5.673098562899312E43d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution10 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution10.random;
        double double13 = hypergeometricDistribution10.cumulativeProbability(3);
        int int14 = hypergeometricDistribution10.getSupportLowerBound();
        boolean boolean15 = hypergeometricDistribution10.isSupportConnected();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution10);
        int int19 = randomDataImpl0.nextBinomial((int) (short) 1, 0.6941913314248908d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = randomDataImpl0.nextBeta((double) (-0.99999994f), 65.00078241775243d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NoBracketingException; message: function values at endpoints do not have different signs, endpoints: [0, 1], values: [-0.611, 0.389]");
        } catch (org.apache.commons.math3.exception.NoBracketingException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.862741759227504E44d + "'", double3 == 5.862741759227504E44d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.01736573944608E-10d + "'", double6 == 7.01736573944608E-10d);
        org.junit.Assert.assertNotNull(randomGenerator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        double double8 = randomGenerator7.nextDouble();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6733818000569853d + "'", double8 == 0.6733818000569853d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        int int7 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        randomDataImpl0.reSeed();
        double double6 = randomDataImpl0.nextT(5.673098562899312E43d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution10 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution10.random;
        double double13 = hypergeometricDistribution10.cumulativeProbability(3);
        int int14 = hypergeometricDistribution10.getSupportLowerBound();
        boolean boolean15 = hypergeometricDistribution10.isSupportConnected();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution10);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = randomDataImpl0.nextF(0.0d, 100676.83110649782d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.955869075228655E43d + "'", double3 == 4.955869075228655E43d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.183476588062281E-9d + "'", double6 == 1.183476588062281E-9d);
        org.junit.Assert.assertNotNull(randomGenerator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        float float8 = well19937c1.nextFloat();
        well19937c1.clear();
        long long10 = well19937c1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, (-1), 32, 42);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.27873123f + "'", float8 == 0.27873123f);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-7461980945699087514L) + "'", long10 == (-7461980945699087514L));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        int int9 = hypergeometricDistribution3.getPopulationSize();
        int[] intArray11 = hypergeometricDistribution3.sample(61);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((-1737377827));
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution3.random;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(randomGenerator10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double2 = randomDataGenerator0.nextChiSquare(100000.0d);
        randomDataGenerator0.reSeedSecure(0L);
        double double7 = randomDataGenerator0.nextCauchy(275.0d, 100000.0d);
        int int11 = randomDataGenerator0.nextHypergeometric(103276186, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = randomDataGenerator0.nextSecureInt(1869078039, 62);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1,869,078,039) must be strictly less than upper bound (62)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100453.71900665345d + "'", double2 == 100453.71900665345d);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-5697.422527410406d) + "'", double7 == (-5697.422527410406d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int6 = well19937c1.nextInt(100);
        int int7 = well19937c1.nextInt();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution12 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray14 = hypergeometricDistribution12.sample((int) (byte) 100);
        double double15 = hypergeometricDistribution12.calculateNumericalVariance();
        double double16 = hypergeometricDistribution12.getNumericalVariance();
        int int17 = hypergeometricDistribution12.getSupportLowerBound();
        double double19 = hypergeometricDistribution12.cumulativeProbability((-2));
        int int20 = randomDataImpl8.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution12);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = hypergeometricDistribution12.inverseCumulativeProbability(15.427060643992869d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 15.427 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2061458278 + "'", int7 == 2061458278);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability(63.37488998997757d, (-1), 11);
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        double double13 = hypergeometricDistribution3.cumulativeProbability(1869078039);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = hypergeometricDistribution3.random;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(randomGenerator14);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        double double9 = hypergeometricDistribution3.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution3.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -1 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = hypergeometricDistribution3.cumulativeProbability(14, 6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (14) must be less than or equal to upper endpoint (6)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        double double9 = hypergeometricDistribution3.probability(0);
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        double double12 = hypergeometricDistribution3.probability((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.probability(9);
        double double10 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hypergeometricDistribution3.inverseCumulativeProbability((-17.396278346743408d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -17.396 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 0);
        double double14 = hypergeometricDistribution3.upperCumulativeProbability(6);
        int int15 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 6);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistribution3.cumulativeProbability(480931935, (-127));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (480,931,935) must be less than or equal to upper endpoint (-127)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability(63.37488998997757d, (-1), 11);
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        int int12 = hypergeometricDistribution3.sample();
        double double13 = hypergeometricDistribution3.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution3.inverseCumulativeProbability((-0.8578030932449878d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -0.858 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        double double10 = hypergeometricDistribution3.probability(28);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution3.inverseCumulativeProbability((double) 50.000008f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 50 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability(63.37488998997757d, (-1), 11);
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 50, 62, 552430991);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (62) must be less than or equal to population size (50)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        double double8 = randomDataImpl6.nextT(2.463657287336677d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(randomDataImpl6);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.442147184715194d + "'", double8 == 1.442147184715194d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.probability(9);
        double double10 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(213455922, 374387672, 429570717);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (374,387,672) must be less than or equal to population size (213,455,922)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        boolean boolean4 = well19937c1.nextBoolean();
        boolean boolean5 = well19937c1.nextBoolean();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution9.random;
        int[] intArray12 = hypergeometricDistribution9.sample((int) (byte) 10);
        well19937c1.setSeed(intArray12);
        well19937c1.setSeed((long) ' ');
        int int17 = well19937c1.nextInt(1553265932);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(randomGenerator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1537805929 + "'", int17 == 1537805929);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.probability(9);
        int[] intArray11 = hypergeometricDistribution3.sample((int) ' ');
        double double14 = hypergeometricDistribution3.cumulativeProbability(0, 480931935);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        boolean boolean4 = well19937c1.nextBoolean();
        boolean boolean5 = well19937c1.nextBoolean();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution9.random;
        int[] intArray12 = hypergeometricDistribution9.sample((int) (byte) 10);
        well19937c1.setSeed(intArray12);
        double double14 = well19937c1.nextDouble();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(randomGenerator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.10001723197462398d + "'", double14 == 0.10001723197462398d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        randomDataImpl0.reSeed();
        double double6 = randomDataImpl0.nextT(5.673098562899312E43d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution10 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution10.random;
        double double13 = hypergeometricDistribution10.cumulativeProbability(3);
        int int14 = hypergeometricDistribution10.getSupportLowerBound();
        boolean boolean15 = hypergeometricDistribution10.isSupportConnected();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution10);
        int int17 = hypergeometricDistribution10.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistribution10.inverseCumulativeProbability((double) 112L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 112 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.629528671587798E44d) + "'", double3 == (-3.629528671587798E44d));
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-7.718363945402855E-10d) + "'", double6 == (-7.718363945402855E-10d));
        org.junit.Assert.assertNotNull(randomGenerator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        int int7 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextHexString(50);
        double double8 = randomDataImpl0.nextCauchy((-0.0d), 2.718281828459045d);
        randomDataImpl0.reSeedSecure(1L);
        double double13 = randomDataImpl0.nextGaussian(52.00000000000001d, 0.8414709848078966d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray19 = hypergeometricDistribution17.sample((int) (byte) 100);
        double double22 = hypergeometricDistribution17.cumulativeProbability(4, (int) (short) 100);
        int int26 = hypergeometricDistribution17.solveInverseCumulativeProbability(0.0d, 34, (int) (short) 10);
        int int27 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        double double29 = randomDataImpl0.nextChiSquare(99504.43358762487d);
        double double33 = randomDataImpl0.nextUniform((-288043.36304661195d), (double) 9, true);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.533351818870645E43d) + "'", double3 == (-2.533351818870645E43d));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d7544bc7b2ca4667fe375c8be96cd7ef23a1db15ec10110c2c" + "'", str5, "d7544bc7b2ca4667fe375c8be96cd7ef23a1db15ec10110c2c");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.774404661294328d) + "'", double8 == (-5.774404661294328d));
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.85165485915062d + "'", double13 == 52.85165485915062d);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double29 + "' != '" + 99634.9841669866d + "'", double29 == 99634.9841669866d);
// flaky:         org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-227886.93092151085d) + "'", double33 == (-227886.93092151085d));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(0.7615941559557649d, 100.03693845824617d);
        int int6 = randomDataImpl0.nextInt(50, 2061458278);
        randomDataImpl0.reSeed();
        long long10 = randomDataImpl0.nextSecureLong(1L, (long) 11);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = randomDataImpl0.nextHypergeometric(7, 72, 1755678109);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (72) must be less than or equal to population size (7)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-86.60121786313692d) + "'", double3 == (-86.60121786313692d));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1125404612 + "'", int6 == 1125404612);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9L + "'", long10 == 9L);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.cumulativeProbability(3);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray10 = hypergeometricDistribution3.sample((int) '4');
        org.apache.commons.math3.random.Well19937c well19937c11 = new org.apache.commons.math3.random.Well19937c(intArray10);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        int[] intArray3 = randomDataGenerator0.nextPermutation(3, 1);
        int int7 = randomDataGenerator0.nextHypergeometric((int) (short) 100, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double10 = randomDataGenerator0.nextCauchy((double) 76L, (-2.533351818870645E43d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: scale (-25,333,518,188,706,450,000,000,000,000,000,000,000,000,000)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[2]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextHexString(50);
        double double8 = randomDataImpl0.nextCauchy((-0.0d), 2.718281828459045d);
        randomDataImpl0.reSeedSecure(1L);
        double double13 = randomDataImpl0.nextGaussian(52.00000000000001d, 0.8414709848078966d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = hypergeometricDistribution17.random;
        int int19 = hypergeometricDistribution17.getSupportUpperBound();
        double double21 = hypergeometricDistribution17.probability(10);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = randomDataImpl0.nextLong((long) 1756469303, 83L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1,756,469,303) must be strictly less than upper bound (83)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0368950863710758E43d) + "'", double3 == (-1.0368950863710758E43d));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8c3b01be706855cacdda49e8dde884743acc872e8da6ec922c" + "'", str5, "8c3b01be706855cacdda49e8dde884743acc872e8da6ec922c");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.691000213789211d + "'", double8 == 2.691000213789211d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.94719286840502d + "'", double13 == 50.94719286840502d);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.probability(9);
        int[] intArray11 = hypergeometricDistribution3.sample((int) ' ');
        org.apache.commons.math3.random.Well19937c well19937c12 = new org.apache.commons.math3.random.Well19937c(intArray11);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability(100);
        int int9 = hypergeometricDistribution3.getSampleSize();
        int int13 = hypergeometricDistribution3.solveInverseCumulativeProbability(8.168596947055045E42d, 0, 374387672);
        double double15 = hypergeometricDistribution3.probability((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 374387672 + "'", int13 == 374387672);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = hypergeometricDistribution3.randomData;
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(randomDataImpl8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((-1737377827));
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        double double11 = hypergeometricDistribution3.cumulativeProbability(0);
        double double13 = hypergeometricDistribution3.probability((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        long long6 = randomDataImpl0.nextLong(0L, 100L);
        double double8 = randomDataImpl0.nextChiSquare((double) 34);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = randomDataImpl0.nextHypergeometric(35, 62, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (62) must be less than or equal to population size (35)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.142258209036856E43d) + "'", double3 == (-5.142258209036856E43d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 31L + "'", long6 == 31L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 38.37888337152957d + "'", double8 == 38.37888337152957d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability(63.37488998997757d, (-1), 11);
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        double double13 = hypergeometricDistribution3.cumulativeProbability(1869078039);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution3.inverseCumulativeProbability((double) 106L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 106 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextHexString(50);
        double double8 = randomDataImpl0.nextCauchy((-0.0d), 2.718281828459045d);
        randomDataImpl0.reSeedSecure(1L);
        double double13 = randomDataImpl0.nextGaussian(52.00000000000001d, 0.8414709848078966d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray19 = hypergeometricDistribution17.sample((int) (byte) 100);
        double double22 = hypergeometricDistribution17.cumulativeProbability(4, (int) (short) 100);
        int int26 = hypergeometricDistribution17.solveInverseCumulativeProbability(0.0d, 34, (int) (short) 10);
        int int27 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        double double29 = randomDataImpl0.nextChiSquare(99504.43358762487d);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = randomDataImpl0.nextSecureLong((long) 2061458278, (long) 1372527618);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2,061,458,278) must be strictly less than upper bound (1,372,527,618)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.9704020809179446E43d + "'", double3 == 3.9704020809179446E43d);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "b548137191bcc7537e8900fa80630dfe91e6974081acf4d031" + "'", str5, "b548137191bcc7537e8900fa80630dfe91e6974081acf4d031");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.579821532023053d + "'", double8 == 6.579821532023053d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 53.09339921956446d + "'", double13 == 53.09339921956446d);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double29 + "' != '" + 99751.72472948208d + "'", double29 == 99751.72472948208d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution7 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator8 = hypergeometricDistribution7.random;
        int int9 = hypergeometricDistribution7.getSupportUpperBound();
        double double11 = hypergeometricDistribution7.probability(10);
        int int12 = hypergeometricDistribution7.getSupportUpperBound();
        int int13 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = hypergeometricDistribution7.random;
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.926231842326942d + "'", double3 == 15.926231842326942d);
        org.junit.Assert.assertNotNull(randomGenerator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(randomGenerator14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.cumulativeProbability(3);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) 'a');
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double8 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((-1737377827));
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.sample();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.probability(10);
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution3.random;
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(randomGenerator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextHexString(50);
        double double8 = randomDataImpl0.nextCauchy((-0.0d), 2.718281828459045d);
        randomDataImpl0.reSeedSecure(1L);
        double double13 = randomDataImpl0.nextGaussian(52.00000000000001d, 0.8414709848078966d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = hypergeometricDistribution17.random;
        int int19 = hypergeometricDistribution17.getSupportUpperBound();
        double double21 = hypergeometricDistribution17.probability(10);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        // The following exception was thrown during execution in test generation
        try {
            randomDataImpl0.setSecureAlgorithm("7", "f00c8303b0e5ad15350af71b0821b2c931f64bfe9561f289e1c6b95fa6dc56804158563cd043f7752826f109f944e1022614");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: f00c8303b0e5ad15350af71b0821b2c931f64bfe9561f289e1c6b95fa6dc56804158563cd043f7752826f109f944e1022614");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5462424538075875E44d) + "'", double3 == (-1.5462424538075875E44d));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "b8487040a86840aef8fe088afc4a420c610c252e1a9ab9793a" + "'", str5, "b8487040a86840aef8fe088afc4a420c610c252e1a9ab9793a");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-38.61104488314023d) + "'", double8 == (-38.61104488314023d));
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 51.87853754189458d + "'", double13 == 51.87853754189458d);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) 'a');
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        double double12 = hypergeometricDistribution3.getNumericalMean();
        int int16 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 1939377301, 0, 100);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        java.lang.Class<?> wildcardClass9 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = hypergeometricDistribution3.randomData;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = randomDataImpl8.nextBeta(0.6451390659264394d, (double) (-76777966));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NoBracketingException; message: function values at endpoints do not have different signs, endpoints: [0, 1], values: [-0.592, 0.408]");
        } catch (org.apache.commons.math3.exception.NoBracketingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(randomDataImpl8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomGenerator randomGenerator8 = hypergeometricDistribution3.random;
        double double9 = hypergeometricDistribution3.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution3.inverseCumulativeProbability((-1.0524864894564768E-9d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -0 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(randomGenerator8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextHexString(50);
        double double8 = randomDataImpl0.nextCauchy((-0.0d), 2.718281828459045d);
        randomDataImpl0.reSeedSecure(1L);
        double double13 = randomDataImpl0.nextGaussian(52.00000000000001d, 0.8414709848078966d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = hypergeometricDistribution17.random;
        int int19 = hypergeometricDistribution17.getSupportUpperBound();
        double double21 = hypergeometricDistribution17.probability(10);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        boolean boolean23 = hypergeometricDistribution17.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = hypergeometricDistribution17.inverseCumulativeProbability(1.7199283581817624E43d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 17,199,283,581,817,624,000,000,000,000,000,000,000,000,000 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0433667389204714E44d) + "'", double3 == (-2.0433667389204714E44d));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eb996a3b55ec130f036c779faa84879c57308b0f86413936e4" + "'", str5, "eb996a3b55ec130f036c779faa84879c57308b0f86413936e4");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.47921378380481355d) + "'", double8 == (-0.47921378380481355d));
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.279590238005426d + "'", double13 == 52.279590238005426d);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.probability(3);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability(2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int6 = well19937c1.nextInt(100);
        int int7 = well19937c1.nextInt();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution12 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray14 = hypergeometricDistribution12.sample((int) (byte) 100);
        double double15 = hypergeometricDistribution12.calculateNumericalVariance();
        double double16 = hypergeometricDistribution12.getNumericalVariance();
        int int17 = hypergeometricDistribution12.getSupportLowerBound();
        double double19 = hypergeometricDistribution12.cumulativeProbability((-2));
        int int20 = randomDataImpl8.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution12);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = randomDataImpl8.nextF((-1.719434771017809d), (double) 90L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (-1.719)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2061458278 + "'", int7 == 2061458278);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int6 = well19937c1.nextInt(100);
        float float7 = well19937c1.nextFloat();
        org.apache.commons.math3.random.Well19937c well19937c9 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int11 = well19937c9.nextInt(100);
        byte[] byteArray12 = new byte[] {};
        well19937c9.nextBytes(byteArray12);
        well19937c9.setSeed((int) (byte) 1);
        well19937c9.setSeed(32);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution21 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator22 = hypergeometricDistribution21.random;
        int int23 = hypergeometricDistribution21.getSupportUpperBound();
        int[] intArray25 = hypergeometricDistribution21.sample(1);
        well19937c9.setSeed(intArray25);
        org.apache.commons.math3.random.Well19937c well19937c28 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int30 = well19937c28.nextInt(100);
        well19937c28.clear();
        int int32 = well19937c28.nextInt();
        long long33 = well19937c28.nextLong();
        long long34 = well19937c28.nextLong();
        int[] intArray40 = new int[] { 3, 3, '4', (short) 100, (short) 100 };
        well19937c28.setSeed(intArray40);
        org.apache.commons.math3.random.Well19937c well19937c42 = new org.apache.commons.math3.random.Well19937c(intArray40);
        org.apache.commons.math3.random.Well19937c well19937c43 = new org.apache.commons.math3.random.Well19937c(intArray40);
        well19937c9.setSeed(intArray40);
        well19937c1.setSeed(intArray40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.47997057f + "'", float7 == 0.47997057f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(randomGenerator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50 + "'", int30 == 50);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1737377827) + "'", int32 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 8853895889823578499L + "'", long33 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-6656821606993036558L) + "'", long34 == (-6656821606993036558L));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[3, 3, 52, 100, 100]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        double double11 = hypergeometricDistribution3.getNumericalMean();
        double double13 = hypergeometricDistribution3.probability(62);
        int int14 = hypergeometricDistribution3.getSupportLowerBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = hypergeometricDistribution3.random;
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(randomGenerator15);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) '#');
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray7 = hypergeometricDistribution5.sample((int) (byte) 100);
        well19937c1.setSeed(intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        int int9 = hypergeometricDistribution3.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution3.inverseCumulativeProbability((-160.21595580698963d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -160.216 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0L);
        double double10 = hypergeometricDistribution3.calculateNumericalVariance();
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.cumulativeProbability(3);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray10 = hypergeometricDistribution3.sample((int) '4');
        int int11 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 0);
        double double13 = hypergeometricDistribution3.getNumericalVariance();
        double double14 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        randomDataImpl0.reSeed();
        double double6 = randomDataImpl0.nextT(5.673098562899312E43d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution10 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution10.random;
        double double13 = hypergeometricDistribution10.cumulativeProbability(3);
        int int14 = hypergeometricDistribution10.getSupportLowerBound();
        boolean boolean15 = hypergeometricDistribution10.isSupportConnected();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = randomDataImpl0.nextPermutation(61, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: permutation size (0");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.2293834890848971E44d) + "'", double3 == (-1.2293834890848971E44d));
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.122208451976586E-9d) + "'", double6 == (-1.122208451976586E-9d));
        org.junit.Assert.assertNotNull(randomGenerator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        org.apache.commons.math3.random.Well19937c well19937c7 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int9 = well19937c7.nextInt(100);
        well19937c7.clear();
        int int11 = well19937c7.nextInt();
        long long12 = well19937c7.nextLong();
        long long13 = well19937c7.nextLong();
        int[] intArray19 = new int[] { 3, 3, '4', (short) 100, (short) 100 };
        well19937c7.setSeed(intArray19);
        org.apache.commons.math3.random.Well19937c well19937c21 = new org.apache.commons.math3.random.Well19937c(intArray19);
        well19937c1.setSeed(intArray19);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl23 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = randomDataImpl23.nextHypergeometric((-1), 32, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50 + "'", int9 == 50);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1737377827) + "'", int11 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 8853895889823578499L + "'", long12 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-6656821606993036558L) + "'", long13 == (-6656821606993036558L));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[3, 3, 52, 100, 100]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int6 = well19937c1.nextInt(100);
        int int7 = well19937c1.nextInt();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution12 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray14 = hypergeometricDistribution12.sample((int) (byte) 100);
        double double15 = hypergeometricDistribution12.calculateNumericalVariance();
        double double16 = hypergeometricDistribution12.getNumericalVariance();
        int int17 = hypergeometricDistribution12.getSupportLowerBound();
        double double19 = hypergeometricDistribution12.cumulativeProbability((-2));
        int int20 = randomDataImpl8.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution12);
        hypergeometricDistribution12.reseedRandomGenerator((long) '4');
        hypergeometricDistribution12.reseedRandomGenerator(5141685311728891869L);
        double double26 = hypergeometricDistribution12.cumulativeProbability(106224878);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2061458278 + "'", int7 == 2061458278);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution3.inverseCumulativeProbability(5.183934449997778E43d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 51,839,344,499,977,780,000,000,000,000,000,000,000,000,000 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        randomDataImpl0.reSeed();
        double double6 = randomDataImpl0.nextT(5.673098562899312E43d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution10 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution10.random;
        double double13 = hypergeometricDistribution10.cumulativeProbability(3);
        int int14 = hypergeometricDistribution10.getSupportLowerBound();
        boolean boolean15 = hypergeometricDistribution10.isSupportConnected();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution10);
        randomDataImpl0.reSeedSecure();
        randomDataImpl0.reSeedSecure();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.487377805860848E43d) + "'", double3 == (-2.487377805860848E43d));
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.459470708307644E-10d) + "'", double6 == (-3.459470708307644E-10d));
        org.junit.Assert.assertNotNull(randomGenerator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.cumulativeProbability(3);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(7714721797284111626L);
        int int10 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl7 = hypergeometricDistribution3.randomData;
        randomDataImpl7.reSeedSecure();
        int int12 = randomDataImpl7.nextHypergeometric(106224878, 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        double double11 = hypergeometricDistribution3.getNumericalMean();
        hypergeometricDistribution3.reseedRandomGenerator((long) 163550185);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        well19937c1.setSeed(32);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = hypergeometricDistribution13.random;
        int int15 = hypergeometricDistribution13.getSupportUpperBound();
        int[] intArray17 = hypergeometricDistribution13.sample(1);
        well19937c1.setSeed(intArray17);
        org.apache.commons.math3.random.Well19937c well19937c20 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int22 = well19937c20.nextInt(100);
        well19937c20.clear();
        int int24 = well19937c20.nextInt();
        long long25 = well19937c20.nextLong();
        long long26 = well19937c20.nextLong();
        int[] intArray32 = new int[] { 3, 3, '4', (short) 100, (short) 100 };
        well19937c20.setSeed(intArray32);
        org.apache.commons.math3.random.Well19937c well19937c34 = new org.apache.commons.math3.random.Well19937c(intArray32);
        org.apache.commons.math3.random.Well19937c well19937c35 = new org.apache.commons.math3.random.Well19937c(intArray32);
        well19937c1.setSeed(intArray32);
        well19937c1.setSeed(10);
        int int40 = well19937c1.nextInt(870630129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(randomGenerator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1737377827) + "'", int24 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 8853895889823578499L + "'", long25 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-6656821606993036558L) + "'", long26 == (-6656821606993036558L));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[3, 3, 52, 100, 100]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 765661457 + "'", int40 == 765661457);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.cumulativeProbability(3);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(7714721797284111626L);
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistribution3.inverseCumulativeProbability(1.405006433619379E44d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 140,500,643,361,937,900,000,000,000,000,000,000,000,000,000 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) 'a');
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 1433862686);
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(randomDataImpl6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomGenerator randomGenerator8 = hypergeometricDistribution3.random;
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        int int10 = hypergeometricDistribution3.sample();
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(randomGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((-1737377827));
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getSampleSize();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(0.7615941559557649d, 100.03693845824617d);
        int int6 = randomDataImpl0.nextInt(50, 2061458278);
        randomDataImpl0.reSeed();
        long long10 = randomDataImpl0.nextLong((-4736355256857903122L), (long) 13);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = randomDataImpl0.nextHypergeometric(1553265932, 1939377301, 1278794734);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (1,939,377,301) must be less than or equal to population size (1,553,265,932)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-159.84936767702254d) + "'", double3 == (-159.84936767702254d));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1460671726 + "'", int6 == 1460671726);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3856202201569694225L) + "'", long10 == (-3856202201569694225L));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability(63.37488998997757d, (-1), 11);
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getSampleSize();
        double double15 = hypergeometricDistribution3.cumulativeProbability(1756469303);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.probability(3);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextHexString(50);
        double double8 = randomDataImpl0.nextCauchy((-0.0d), 2.718281828459045d);
        double double10 = randomDataImpl0.nextExponential(0.08106146679532722d);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = randomDataImpl0.nextHypergeometric((-1737377827), 7, 200911654);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1,737,377,827)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.577790389997785E42d + "'", double3 == 9.577790389997785E42d);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8ee0a88771aae235adcfef50f2f1461e5d0415719225da7fec" + "'", str5, "8ee0a88771aae235adcfef50f2f1461e5d0415719225da7fec");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 24.225069880707093d + "'", double8 == 24.225069880707093d);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03855528399129518d + "'", double10 == 0.03855528399129518d);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextHexString(50);
        double double8 = randomDataImpl0.nextCauchy((-0.0d), 2.718281828459045d);
        randomDataImpl0.reSeedSecure(1L);
        double double13 = randomDataImpl0.nextGaussian(52.00000000000001d, 0.8414709848078966d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray19 = hypergeometricDistribution17.sample((int) (byte) 100);
        double double22 = hypergeometricDistribution17.cumulativeProbability(4, (int) (short) 100);
        int int26 = hypergeometricDistribution17.solveInverseCumulativeProbability(0.0d, 34, (int) (short) 10);
        int int27 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = randomDataImpl0.nextSecureInt(27839310, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (27,839,310) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.351901698643848E42d) + "'", double3 == (-3.351901698643848E42d));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2faade282bb49b9dbd7b73c3dd09801ff14f0394359fbbdf78" + "'", str5, "2faade282bb49b9dbd7b73c3dd09801ff14f0394359fbbdf78");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.263715081270226d) + "'", double8 == (-4.263715081270226d));
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.319348403558216d + "'", double13 == 52.319348403558216d);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        org.apache.commons.math3.random.Well19937c well19937c6 = new org.apache.commons.math3.random.Well19937c(intArray5);
        boolean boolean7 = well19937c6.nextBoolean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        int int7 = hypergeometricDistribution3.getSampleSize();
        org.apache.commons.math3.random.RandomGenerator randomGenerator8 = hypergeometricDistribution3.random;
        int int9 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 103276186);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(randomGenerator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.cumulativeProbability(3);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(7714721797284111626L);
        double double11 = hypergeometricDistribution3.probability(0);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability(3);
        double double13 = hypergeometricDistribution3.cumulativeProbability(0, 29);
        int int14 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.cumulativeProbability(3);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(7714721797284111626L);
        int int13 = hypergeometricDistribution3.solveInverseCumulativeProbability(2.3927880645112457E44d, 998139946, 551019857);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 551019857 + "'", int13 == 551019857);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        boolean boolean4 = well19937c1.nextBoolean();
        boolean boolean5 = well19937c1.nextBoolean();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution9.random;
        int[] intArray12 = hypergeometricDistribution9.sample((int) (byte) 10);
        well19937c1.setSeed(intArray12);
        float float14 = well19937c1.nextFloat();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl15 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        well19937c1.setSeed(137470501);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(randomGenerator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.10001719f + "'", float14 == 0.10001719f);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution3.random;
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(randomGenerator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        int int12 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((-1737377827));
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getSampleSize();
        int int11 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        float float8 = well19937c1.nextFloat();
        int int9 = well19937c1.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample((int) (byte) 100);
        well19937c1.setSeed(intArray15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.27873123f + "'", float8 == 0.27873123f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1737377827) + "'", int9 == (-1737377827));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((-1737377827));
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getSampleSize();
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        double double10 = hypergeometricDistribution3.cumulativeProbability((-1023));
        int int11 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextHexString(50);
        double double8 = randomDataImpl0.nextCauchy((-0.0d), 2.718281828459045d);
        randomDataImpl0.reSeedSecure(1L);
        double double13 = randomDataImpl0.nextGaussian(52.00000000000001d, 0.8414709848078966d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = hypergeometricDistribution17.random;
        int int19 = hypergeometricDistribution17.getSupportUpperBound();
        double double21 = hypergeometricDistribution17.probability(10);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        double double24 = randomDataImpl0.nextT(151.60188454810176d);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.677764715300938E43d) + "'", double3 == (-5.677764715300938E43d));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1f287e8d4584ecd5d6cae78665b777e3842acec02abb42cc2d" + "'", str5, "1f287e8d4584ecd5d6cae78665b777e3842acec02abb42cc2d");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.09295562131624421d + "'", double8 == 0.09295562131624421d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.95342648988962d + "'", double13 == 50.95342648988962d);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.369606187602139d + "'", double24 == 0.369606187602139d);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.probability((int) '4');
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        double double11 = hypergeometricDistribution3.getNumericalMean();
        double double13 = hypergeometricDistribution3.probability(62);
        double double15 = hypergeometricDistribution3.probability(598573194);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((-2), 27, 312363667);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-2)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        int int9 = hypergeometricDistribution3.getPopulationSize();
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double2 = randomDataGenerator0.nextChiSquare(100000.0d);
        randomDataGenerator0.reSeedSecure(0L);
        double double7 = randomDataGenerator0.nextCauchy(275.0d, 100000.0d);
        int int11 = randomDataGenerator0.nextHypergeometric(103276186, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = randomDataGenerator0.nextSecureInt(1869078039, 329628523);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1,869,078,039) must be strictly less than upper bound (329,628,523)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99686.29156437746d + "'", double2 == 99686.29156437746d);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 218707.6484574695d + "'", double7 == 218707.6484574695d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        randomDataImpl0.reSeed();
        double double6 = randomDataImpl0.nextT(5.673098562899312E43d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution10 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution10.random;
        double double13 = hypergeometricDistribution10.cumulativeProbability(3);
        int int14 = hypergeometricDistribution10.getSupportLowerBound();
        boolean boolean15 = hypergeometricDistribution10.isSupportConnected();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution10);
        int int17 = hypergeometricDistribution10.getSupportUpperBound();
        int int18 = hypergeometricDistribution10.getSampleSize();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0872440550062921E43d) + "'", double3 == (-1.0872440550062921E43d));
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-4.685381737740352E-10d) + "'", double6 == (-4.685381737740352E-10d));
        org.junit.Assert.assertNotNull(randomGenerator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution7 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator8 = hypergeometricDistribution7.random;
        int[] intArray10 = hypergeometricDistribution7.sample((int) (byte) 10);
        int int11 = hypergeometricDistribution7.sample();
        double double13 = hypergeometricDistribution7.probability((int) '#');
        int int14 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution7);
        // The following exception was thrown during execution in test generation
        try {
            randomDataImpl0.setSecureAlgorithm("0c36e4fd72", "91a340632e");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: 91a340632e");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(randomGenerator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int6 = well19937c1.nextInt(100);
        org.apache.commons.math3.random.Well19937c well19937c8 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int10 = well19937c8.nextInt(100);
        well19937c8.clear();
        int int12 = well19937c8.nextInt();
        well19937c8.setSeed((long) 4);
        double double15 = well19937c8.nextDouble();
        org.apache.commons.math3.random.Well19937c well19937c17 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int19 = well19937c17.nextInt(100);
        byte[] byteArray20 = new byte[] {};
        well19937c17.nextBytes(byteArray20);
        well19937c8.nextBytes(byteArray20);
        well19937c1.nextBytes(byteArray20);
        well19937c1.clear();
        long long26 = well19937c1.nextLong((long) 7);
        well19937c1.setSeed(31L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution32 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 34, 1278794734, (-549865085));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-549,865,085)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1737377827) + "'", int12 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0454649723986138d + "'", double15 == 0.0454649723986138d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 50 + "'", int19 == 50);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 6L + "'", long26 == 6L);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextHexString(50);
        double double8 = randomDataImpl0.nextCauchy((-0.0d), 2.718281828459045d);
        randomDataImpl0.reSeedSecure(1L);
        double double13 = randomDataImpl0.nextGaussian(52.00000000000001d, 0.8414709848078966d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = hypergeometricDistribution17.random;
        int int19 = hypergeometricDistribution17.getSupportUpperBound();
        double double21 = hypergeometricDistribution17.probability(10);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl23 = hypergeometricDistribution17.randomData;
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.260724919992579E42d) + "'", double3 == (-7.260724919992579E42d));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "74356f86e3ba79b67a68ccb4969bc178c44d0738bc17bfeb67" + "'", str5, "74356f86e3ba79b67a68ccb4969bc178c44d0738bc17bfeb67");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.04528748122012291d + "'", double8 == 0.04528748122012291d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 51.330706274958715d + "'", double13 == 51.330706274958715d);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl23);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl7 = hypergeometricDistribution3.randomData;
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(106L);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.probability(10);
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) '4', 374387672);
        double double12 = hypergeometricDistribution3.calculateNumericalVariance();
        double double13 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability(63.37488998997757d, (-1), 11);
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        double double13 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int6 = well19937c1.nextInt(100);
        int int7 = well19937c1.nextInt();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution12 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray14 = hypergeometricDistribution12.sample((int) (byte) 100);
        double double15 = hypergeometricDistribution12.calculateNumericalVariance();
        double double16 = hypergeometricDistribution12.getNumericalVariance();
        int int17 = hypergeometricDistribution12.getSupportLowerBound();
        double double19 = hypergeometricDistribution12.cumulativeProbability((-2));
        int int20 = randomDataImpl8.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution12);
        double double21 = hypergeometricDistribution12.calculateNumericalVariance();
        int int22 = hypergeometricDistribution12.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2061458278 + "'", int7 == 2061458278);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        double double6 = randomDataImpl0.nextCauchy(0.9927182648585196d, 0.2625525980804741d);
        double double9 = randomDataImpl0.nextCauchy((-4.0597202497451813E43d), 1.2165965492641364d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = hypergeometricDistribution13.random;
        int[] intArray16 = hypergeometricDistribution13.sample((int) (byte) 10);
        int int17 = hypergeometricDistribution13.sample();
        double double19 = hypergeometricDistribution13.probability((int) '#');
        int int20 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = randomDataImpl0.nextBeta((-7.788210361234479E-10d), (-2.436084185211412E-10d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NoBracketingException; message: function values at endpoints do not have different signs, endpoints: [0, 1], values: [-0.058, 0.942]");
        } catch (org.apache.commons.math3.exception.NoBracketingException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.724743782864511E43d) + "'", double3 == (-4.724743782864511E43d));
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2438985241121459d + "'", double6 == 1.2438985241121459d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-4.0597202497451813E43d) + "'", double9 == (-4.0597202497451813E43d));
        org.junit.Assert.assertNotNull(randomGenerator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution7 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator8 = hypergeometricDistribution7.random;
        int int9 = hypergeometricDistribution7.getSupportUpperBound();
        double double11 = hypergeometricDistribution7.probability(10);
        int int12 = hypergeometricDistribution7.getSupportUpperBound();
        int int13 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution7);
        // The following exception was thrown during execution in test generation
        try {
            randomDataImpl0.setSecureAlgorithm("de9ac07b7a456c211d5a5525e8f4e3ed344d91d1d04c69a9f669774a2118186883cf6121cda77c0ac847b2de1c1cb043cb8c", "17a4bc0db4");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: 17a4bc0db4");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 90.21253994794827d + "'", double3 == 90.21253994794827d);
        org.junit.Assert.assertNotNull(randomGenerator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomGenerator randomGenerator8 = hypergeometricDistribution3.random;
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        int int10 = hypergeometricDistribution3.sample();
        int int11 = hypergeometricDistribution3.getPopulationSize();
        double double13 = hypergeometricDistribution3.upperCumulativeProbability((-1023));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(randomGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        double double9 = randomDataImpl6.nextUniform((double) 998139946, 1.553265932E9d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = randomDataImpl6.nextChiSquare((-71.66565430108938d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: shape (-35.833)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(randomDataImpl6);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.2789781730892208E9d + "'", double9 == 1.2789781730892208E9d);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(1537805929);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 0);
        double double14 = hypergeometricDistribution3.upperCumulativeProbability(6);
        int int15 = hypergeometricDistribution3.getSupportUpperBound();
        int int16 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        double double5 = well19937c1.nextDouble();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double9 = randomDataImpl6.nextWeibull(1.9016360008666626E33d, 52.99400230050861d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample((int) (byte) 100);
        int int16 = hypergeometricDistribution13.getPopulationSize();
        double double17 = hypergeometricDistribution13.getNumericalVariance();
        double double19 = hypergeometricDistribution13.probability(0);
        int int20 = hypergeometricDistribution13.getSupportUpperBound();
        int int21 = randomDataImpl6.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.59548520266966d + "'", double5 == 0.59548520266966d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.99400230050861d + "'", double9 == 52.99400230050861d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(0.7615941559557649d, 100.03693845824617d);
        int int6 = randomDataImpl0.nextInt(50, 2061458278);
        randomDataImpl0.reSeed();
        long long10 = randomDataImpl0.nextLong((-4736355256857903122L), (long) 13);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray16 = hypergeometricDistribution14.sample((int) (byte) 100);
        double double19 = hypergeometricDistribution14.cumulativeProbability(4, (int) (short) 100);
        int int23 = hypergeometricDistribution14.solveInverseCumulativeProbability(0.0d, 34, (int) (short) 10);
        double double26 = hypergeometricDistribution14.cumulativeProbability(34, (int) 'a');
        int int27 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 22.52115093177853d + "'", double3 == 22.52115093177853d);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 701062189 + "'", int6 == 701062189);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38613272343211473L) + "'", long10 == (-38613272343211473L));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability(3);
        double double13 = hypergeometricDistribution3.cumulativeProbability(0, 29);
        boolean boolean14 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        long long6 = randomDataImpl0.nextLong(0L, 100L);
        double double8 = randomDataImpl0.nextChiSquare((double) 34);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution12 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray14 = hypergeometricDistribution12.sample((int) (byte) 100);
        double double15 = hypergeometricDistribution12.calculateNumericalVariance();
        double double17 = hypergeometricDistribution12.cumulativeProbability(100);
        double double19 = hypergeometricDistribution12.cumulativeProbability((int) ' ');
        org.apache.commons.math3.random.RandomGenerator randomGenerator20 = hypergeometricDistribution12.random;
        int int21 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution12);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = randomDataImpl0.nextCauchy(0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: scale (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.257990451161118E44d + "'", double3 == 3.257990451161118E44d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 71L + "'", long6 == 71L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 39.58335020562047d + "'", double8 == 39.58335020562047d);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(randomGenerator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.cumulativeProbability(3);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(7714721797284111626L);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution3.inverseCumulativeProbability((-3.942375515563072E42d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -3,942,375,515,563,072,000,000,000,000,000,000,000,000,000 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        double double11 = hypergeometricDistribution3.getNumericalMean();
        double double13 = hypergeometricDistribution3.probability(62);
        int int14 = hypergeometricDistribution3.getSupportLowerBound();
        double double15 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.cumulativeProbability(3);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl7 = hypergeometricDistribution3.randomData;
        double double9 = randomDataImpl7.nextExponential(1.5708343465953598d);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(randomDataImpl7);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0329067179051725d + "'", double9 == 1.0329067179051725d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((-1737377827));
        int int9 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int6 = well19937c1.nextInt(100);
        org.apache.commons.math3.random.Well19937c well19937c8 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int10 = well19937c8.nextInt(100);
        well19937c8.clear();
        int int12 = well19937c8.nextInt();
        well19937c8.setSeed((long) 4);
        double double15 = well19937c8.nextDouble();
        org.apache.commons.math3.random.Well19937c well19937c17 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int19 = well19937c17.nextInt(100);
        byte[] byteArray20 = new byte[] {};
        well19937c17.nextBytes(byteArray20);
        well19937c8.nextBytes(byteArray20);
        well19937c1.nextBytes(byteArray20);
        well19937c1.clear();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution28 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray30 = hypergeometricDistribution28.sample((int) (byte) 100);
        well19937c1.setSeed(intArray30);
        int int32 = well19937c1.nextInt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1737377827) + "'", int12 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0454649723986138d + "'", double15 == 0.0454649723986138d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 50 + "'", int19 == 50);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-575277422) + "'", int32 == (-575277422));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double8 = hypergeometricDistribution3.cumulativeProbability(4, (int) (short) 100);
        int int12 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.0d, 34, (int) (short) 10);
        int int13 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        randomDataImpl0.reSeed();
        double double6 = randomDataImpl0.nextT(5.673098562899312E43d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution10 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution10.random;
        double double13 = hypergeometricDistribution10.cumulativeProbability(3);
        int int14 = hypergeometricDistribution10.getSupportLowerBound();
        boolean boolean15 = hypergeometricDistribution10.isSupportConnected();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution10);
        boolean boolean17 = hypergeometricDistribution10.isSupportConnected();
        boolean boolean18 = hypergeometricDistribution10.isSupportConnected();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.858118149591527E43d + "'", double3 == 9.858118149591527E43d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.759700194155459E-10d + "'", double6 == 5.759700194155459E-10d);
        org.junit.Assert.assertNotNull(randomGenerator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl7 = hypergeometricDistribution3.randomData;
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        double double10 = hypergeometricDistribution3.cumulativeProbability(137470501);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution7 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator8 = hypergeometricDistribution7.random;
        int[] intArray10 = hypergeometricDistribution7.sample((int) (byte) 10);
        int int11 = hypergeometricDistribution7.sample();
        double double13 = hypergeometricDistribution7.probability((int) '#');
        int int14 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution7);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = randomDataImpl0.nextWeibull((-0.2711610831159359d), 99.58814167978987d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: shape (-0.271)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(randomGenerator8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.cumulativeProbability(3);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(7714721797284111626L);
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        int int15 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.9166308463805867d, 1756469303, (int) (byte) 0);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl16 = hypergeometricDistribution3.randomData;
        double double17 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        well19937c1.setSeed(32);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = hypergeometricDistribution13.random;
        int int15 = hypergeometricDistribution13.getSupportUpperBound();
        int[] intArray17 = hypergeometricDistribution13.sample(1);
        well19937c1.setSeed(intArray17);
        org.apache.commons.math3.random.Well19937c well19937c20 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int22 = well19937c20.nextInt(100);
        well19937c20.clear();
        int int24 = well19937c20.nextInt();
        long long25 = well19937c20.nextLong();
        long long26 = well19937c20.nextLong();
        int[] intArray32 = new int[] { 3, 3, '4', (short) 100, (short) 100 };
        well19937c20.setSeed(intArray32);
        org.apache.commons.math3.random.Well19937c well19937c34 = new org.apache.commons.math3.random.Well19937c(intArray32);
        org.apache.commons.math3.random.Well19937c well19937c35 = new org.apache.commons.math3.random.Well19937c(intArray32);
        well19937c1.setSeed(intArray32);
        well19937c1.setSeed(37L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(randomGenerator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1737377827) + "'", int24 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 8853895889823578499L + "'", long25 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-6656821606993036558L) + "'", long26 == (-6656821606993036558L));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[3, 3, 52, 100, 100]");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        int[] intArray3 = randomDataGenerator0.nextPermutation(3, 1);
        int int7 = randomDataGenerator0.nextHypergeometric((int) (short) 100, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = randomDataGenerator0.nextPermutation(0, 6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: permutation size (6) exceeds permuation domain (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double8 = hypergeometricDistribution3.cumulativeProbability(4, (int) (short) 100);
        int int12 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.0d, 34, (int) (short) 10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = hypergeometricDistribution3.random;
        double double15 = hypergeometricDistribution3.probability(137470501);
        int int16 = hypergeometricDistribution3.getSupportUpperBound();
        int int17 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(randomGenerator13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomGenerator randomGenerator8 = hypergeometricDistribution3.random;
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        double double11 = hypergeometricDistribution3.cumulativeProbability(289611218);
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(randomGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        double double11 = hypergeometricDistribution3.getNumericalMean();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl12 = hypergeometricDistribution3.randomData;
        hypergeometricDistribution3.reseedRandomGenerator(4L);
        double double16 = hypergeometricDistribution3.cumulativeProbability(251778933);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl7 = hypergeometricDistribution3.randomData;
        randomDataImpl7.reSeedSecure();
        randomDataImpl7.reSeed();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 480931935, (int) '#', (int) (short) 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability(100);
        double double10 = hypergeometricDistribution3.cumulativeProbability((int) ' ');
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        randomDataImpl0.reSeed();
        double double6 = randomDataImpl0.nextT(5.673098562899312E43d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution10 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution10.random;
        double double13 = hypergeometricDistribution10.cumulativeProbability(3);
        int int14 = hypergeometricDistribution10.getSupportLowerBound();
        boolean boolean15 = hypergeometricDistribution10.isSupportConnected();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution10);
        int int17 = hypergeometricDistribution10.getSupportUpperBound();
        boolean boolean18 = hypergeometricDistribution10.isSupportConnected();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.6144757573859207E44d + "'", double3 == 2.6144757573859207E44d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.4555790721962523E-10d + "'", double6 == 2.4555790721962523E-10d);
        org.junit.Assert.assertNotNull(randomGenerator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability(63.37488998997757d, (-1), 11);
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        int int12 = hypergeometricDistribution3.sample();
        int int13 = hypergeometricDistribution3.getSupportLowerBound();
        double double14 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        boolean boolean4 = well19937c1.nextBoolean();
        boolean boolean5 = well19937c1.nextBoolean();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution9.random;
        int[] intArray12 = hypergeometricDistribution9.sample((int) (byte) 10);
        well19937c1.setSeed(intArray12);
        int int14 = well19937c1.nextInt();
        int int15 = well19937c1.nextInt();
        long long16 = well19937c1.nextLong();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(randomGenerator10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 429570717 + "'", int14 == 429570717);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-780646788) + "'", int15 == (-780646788));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 8259877253290793356L + "'", long16 == 8259877253290793356L);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator8 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.cumulativeProbability(870630129);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(randomGenerator8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        randomDataImpl0.reSeed();
        double double6 = randomDataImpl0.nextT(5.673098562899312E43d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution10 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution10.random;
        double double13 = hypergeometricDistribution10.cumulativeProbability(3);
        int int14 = hypergeometricDistribution10.getSupportLowerBound();
        boolean boolean15 = hypergeometricDistribution10.isSupportConnected();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution10);
        double double17 = hypergeometricDistribution10.getNumericalVariance();
        double double19 = hypergeometricDistribution10.cumulativeProbability(0);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.120217788541537E44d) + "'", double3 == (-5.120217788541537E44d));
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-4.890217330158049E-10d) + "'", double6 == (-4.890217330158049E-10d));
        org.junit.Assert.assertNotNull(randomGenerator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        int int11 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) (-1), 97549348, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, 30, (-76777966));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-76,777,966)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 100, 27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (27)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int6 = well19937c1.nextInt(100);
        int int7 = well19937c1.nextInt();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution12 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray14 = hypergeometricDistribution12.sample((int) (byte) 100);
        double double15 = hypergeometricDistribution12.calculateNumericalVariance();
        double double16 = hypergeometricDistribution12.getNumericalVariance();
        int int17 = hypergeometricDistribution12.getSupportLowerBound();
        double double19 = hypergeometricDistribution12.cumulativeProbability((-2));
        int int20 = randomDataImpl8.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution12);
        int int21 = hypergeometricDistribution12.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2061458278 + "'", int7 == 2061458278);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 0);
        double double15 = hypergeometricDistribution3.cumulativeProbability(9, 1869078039);
        int int16 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = hypergeometricDistribution3.randomData;
        int int9 = hypergeometricDistribution3.getSupportLowerBound();
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        int int11 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(randomDataImpl8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double8 = hypergeometricDistribution3.cumulativeProbability(4, (int) (short) 100);
        int int12 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.0d, 34, (int) (short) 10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = hypergeometricDistribution3.random;
        int int14 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(randomGenerator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.cumulativeProbability(3);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(7714721797284111626L);
        int int10 = hypergeometricDistribution3.getNumberOfSuccesses();
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        int int16 = hypergeometricDistribution3.solveInverseCumulativeProbability(1.2514784247438098d, 1939377301, 2061458278);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2061458278 + "'", int16 == 2061458278);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        double double11 = hypergeometricDistribution3.getNumericalMean();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl12 = hypergeometricDistribution3.randomData;
        hypergeometricDistribution3.reseedRandomGenerator(4L);
        double double16 = hypergeometricDistribution3.cumulativeProbability(42);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        double double6 = randomDataImpl0.nextCauchy(0.9927182648585196d, 0.2625525980804741d);
        double double9 = randomDataImpl0.nextCauchy((-4.0597202497451813E43d), 1.2165965492641364d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = hypergeometricDistribution13.random;
        int[] intArray16 = hypergeometricDistribution13.sample((int) (byte) 10);
        int int17 = hypergeometricDistribution13.sample();
        double double19 = hypergeometricDistribution13.probability((int) '#');
        int int20 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        int int21 = hypergeometricDistribution13.getSupportUpperBound();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.467905668127322E44d + "'", double3 == 2.467905668127322E44d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.3221375334356555d + "'", double6 == 1.3221375334356555d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-4.0597202497451813E43d) + "'", double9 == (-4.0597202497451813E43d));
        org.junit.Assert.assertNotNull(randomGenerator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        well19937c1.setSeed(10L);
        well19937c1.setSeed((long) 200911654);
        double double12 = well19937c1.nextGaussian();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution16 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = hypergeometricDistribution16.random;
        int int18 = hypergeometricDistribution16.getSupportUpperBound();
        int[] intArray20 = hypergeometricDistribution16.sample(1);
        well19937c1.setSeed(intArray20);
        org.apache.commons.math3.random.Well19937c well19937c22 = new org.apache.commons.math3.random.Well19937c(intArray20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.25597082107784536d) + "'", double12 == (-0.25597082107784536d));
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0]");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        randomDataImpl0.reSeed();
        double double6 = randomDataImpl0.nextT(5.673098562899312E43d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution10 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution10.random;
        double double13 = hypergeometricDistribution10.cumulativeProbability(3);
        int int14 = hypergeometricDistribution10.getSupportLowerBound();
        boolean boolean15 = hypergeometricDistribution10.isSupportConnected();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution10);
        int int19 = randomDataImpl0.nextBinomial((int) (short) 1, 0.6941913314248908d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution23 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray25 = hypergeometricDistribution23.sample((int) (byte) 100);
        double double28 = hypergeometricDistribution23.cumulativeProbability(4, (int) (short) 100);
        int int32 = hypergeometricDistribution23.solveInverseCumulativeProbability(0.0d, 34, (int) (short) 10);
        int int33 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution23);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.9208307104729864E43d + "'", double3 == 1.9208307104729864E43d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.036491119110401E-10d + "'", double6 == 2.036491119110401E-10d);
        org.junit.Assert.assertNotNull(randomGenerator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        double double9 = randomDataImpl6.nextUniform((double) 998139946, 1.553265932E9d);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = randomDataImpl6.nextBinomial((int) '#', (-1.5325645401162558E43d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -15,325,645,401,162,558,000,000,000,000,000,000,000,000,000 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(randomDataImpl6);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.2060595776792305E9d + "'", double9 == 1.2060595776792305E9d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1756469303, 1394374653, 62);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1756469303 + "'", int4 == 1756469303);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1394374653 + "'", int5 == 1394374653);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        double double8 = hypergeometricDistribution3.cumulativeProbability(200911654);
        double double10 = hypergeometricDistribution3.cumulativeProbability(7);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        int int9 = hypergeometricDistribution3.getPopulationSize();
        int[] intArray11 = hypergeometricDistribution3.sample(34);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        boolean boolean2 = well19937c1.nextBoolean();
        well19937c1.setSeed(100L);
        float float5 = well19937c1.nextFloat();
        int int6 = well19937c1.nextInt();
        int int8 = well19937c1.nextInt(2147483647);
        org.apache.commons.math3.random.Well19937c well19937c10 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int12 = well19937c10.nextInt(100);
        well19937c10.clear();
        int int15 = well19937c10.nextInt(100);
        org.apache.commons.math3.random.Well19937c well19937c17 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int19 = well19937c17.nextInt(100);
        well19937c17.clear();
        int int21 = well19937c17.nextInt();
        well19937c17.setSeed((long) 4);
        double double24 = well19937c17.nextDouble();
        org.apache.commons.math3.random.Well19937c well19937c26 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int28 = well19937c26.nextInt(100);
        byte[] byteArray29 = new byte[] {};
        well19937c26.nextBytes(byteArray29);
        well19937c17.nextBytes(byteArray29);
        well19937c10.nextBytes(byteArray29);
        well19937c10.clear();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution37 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray39 = hypergeometricDistribution37.sample((int) (byte) 100);
        well19937c10.setSeed(intArray39);
        well19937c1.setSeed(intArray39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.19048333f + "'", float5 == 0.19048333f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200911654 + "'", int6 == 200911654);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 936668984 + "'", int8 == 936668984);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 50 + "'", int19 == 50);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1737377827) + "'", int21 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0454649723986138d + "'", double24 == 0.0454649723986138d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50 + "'", int28 == 50);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        int int11 = hypergeometricDistribution3.getSampleSize();
        int int12 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((long) 137470501);
        org.apache.commons.math3.random.Well19937c well19937c3 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int5 = well19937c3.nextInt(100);
        byte[] byteArray6 = new byte[] {};
        well19937c3.nextBytes(byteArray6);
        well19937c3.setSeed((int) (byte) 1);
        float float10 = well19937c3.nextFloat();
        well19937c3.setSeed(5L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution16 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray18 = hypergeometricDistribution16.sample((int) (byte) 100);
        org.apache.commons.math3.random.Well19937c well19937c19 = new org.apache.commons.math3.random.Well19937c(intArray18);
        well19937c3.setSeed(intArray18);
        well19937c1.setSeed(intArray18);
        long long22 = well19937c1.nextLong();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.27873123f + "'", float10 == 0.27873123f);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-2470797712490912764L) + "'", long22 == (-2470797712490912764L));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double2 = randomDataGenerator0.nextChiSquare(100000.0d);
        randomDataGenerator0.reSeedSecure(0L);
        double double7 = randomDataGenerator0.nextCauchy(275.0d, 100000.0d);
        int int11 = randomDataGenerator0.nextHypergeometric(103276186, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = randomDataGenerator0.nextWeibull((double) ' ', (-2.254687434706508E-5d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: scale (-0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99996.81252769407d + "'", double2 == 99996.81252769407d);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 46030.38851660493d + "'", double7 == 46030.38851660493d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        double double10 = hypergeometricDistribution3.cumulativeProbability((-1023));
        int int11 = hypergeometricDistribution3.getSampleSize();
        int int12 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.probability(10);
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) '4', 374387672);
        double double12 = hypergeometricDistribution3.calculateNumericalVariance();
        int int13 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1228561956));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        int int7 = hypergeometricDistribution3.sample();
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        int int9 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(543087243472984309L);
        int int12 = hypergeometricDistribution3.getNumberOfSuccesses();
        boolean boolean13 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution7 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator8 = hypergeometricDistribution7.random;
        int int9 = hypergeometricDistribution7.getSupportUpperBound();
        double double11 = hypergeometricDistribution7.probability(10);
        int int12 = hypergeometricDistribution7.getSupportUpperBound();
        int int13 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution7);
        int int14 = hypergeometricDistribution7.getSupportLowerBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl15 = hypergeometricDistribution7.randomData;
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 85.34526449747187d + "'", double3 == 85.34526449747187d);
        org.junit.Assert.assertNotNull(randomGenerator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl15);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = hypergeometricDistribution3.randomData;
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getSampleSize();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl11 = hypergeometricDistribution3.randomData;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = randomDataImpl11.nextPascal((-1981132494), 71.05067288599503d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of successes (-1,981,132,494)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(randomDataImpl8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl11);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        well19937c1.setSeed((long) 4);
        double double8 = well19937c1.nextDouble();
        org.apache.commons.math3.random.Well19937c well19937c9 = new org.apache.commons.math3.random.Well19937c();
        org.apache.commons.math3.random.Well19937c well19937c11 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int13 = well19937c11.nextInt(100);
        well19937c11.clear();
        int int15 = well19937c11.nextInt();
        long long16 = well19937c11.nextLong();
        long long17 = well19937c11.nextLong();
        int[] intArray23 = new int[] { 3, 3, '4', (short) 100, (short) 100 };
        well19937c11.setSeed(intArray23);
        org.apache.commons.math3.random.Well19937c well19937c25 = new org.apache.commons.math3.random.Well19937c(intArray23);
        org.apache.commons.math3.random.Well19937c well19937c26 = new org.apache.commons.math3.random.Well19937c(intArray23);
        well19937c9.setSeed(intArray23);
        well19937c1.setSeed(intArray23);
        org.apache.commons.math3.random.Well19937c well19937c30 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int32 = well19937c30.nextInt(100);
        well19937c30.clear();
        int int34 = well19937c30.nextInt();
        well19937c30.setSeed((long) 4);
        double double37 = well19937c30.nextDouble();
        org.apache.commons.math3.random.Well19937c well19937c39 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int41 = well19937c39.nextInt(100);
        byte[] byteArray42 = new byte[] {};
        well19937c39.nextBytes(byteArray42);
        well19937c30.nextBytes(byteArray42);
        well19937c1.nextBytes(byteArray42);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution49 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, (-585726983), (-1058410888), (-585726983));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-585,726,983)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0454649723986138d + "'", double8 == 0.0454649723986138d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1737377827) + "'", int15 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 8853895889823578499L + "'", long16 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-6656821606993036558L) + "'", long17 == (-6656821606993036558L));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[3, 3, 52, 100, 100]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 50 + "'", int32 == 50);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1737377827) + "'", int34 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0454649723986138d + "'", double37 == 0.0454649723986138d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 50 + "'", int41 == 50);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        double double11 = hypergeometricDistribution3.getNumericalMean();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl12 = hypergeometricDistribution3.randomData;
        randomDataImpl12.reSeedSecure();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = randomDataImpl12.nextGaussian((double) (-2989524146381720367L), 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: standard deviation (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl12);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((-1737377827));
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getSampleSize();
        double double12 = hypergeometricDistribution3.cumulativeProbability(987296144);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextHexString(50);
        double double8 = randomDataImpl0.nextCauchy((-0.0d), 2.718281828459045d);
        randomDataImpl0.reSeedSecure(1L);
        double double13 = randomDataImpl0.nextGaussian(52.00000000000001d, 0.8414709848078966d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = hypergeometricDistribution17.random;
        int int19 = hypergeometricDistribution17.getSupportUpperBound();
        double double21 = hypergeometricDistribution17.probability(10);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = randomDataImpl0.nextPascal((int) (short) 1, (-13.914127124394536d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -13.914 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.800066885507938E44d) + "'", double3 == (-7.800066885507938E44d));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "34e55894f554bc7d20baa4ab7052d9e18d85c0a64207d10dec" + "'", str5, "34e55894f554bc7d20baa4ab7052d9e18d85c0a64207d10dec");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.8755631702415987d + "'", double8 == 2.8755631702415987d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.91948062850668d + "'", double13 == 50.91948062850668d);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        well19937c1.setSeed((long) 4);
        double double8 = well19937c1.nextDouble();
        org.apache.commons.math3.random.Well19937c well19937c10 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int12 = well19937c10.nextInt(100);
        byte[] byteArray13 = new byte[] {};
        well19937c10.nextBytes(byteArray13);
        well19937c1.nextBytes(byteArray13);
        well19937c1.setSeed((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution21 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 2, 277264246, 1537805929);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (277,264,246) must be less than or equal to population size (2)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0454649723986138d + "'", double8 == 0.0454649723986138d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        double double8 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        double double6 = hypergeometricDistribution3.cumulativeProbability(3);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl7 = hypergeometricDistribution3.randomData;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = randomDataImpl7.nextBinomial(1939377301, (-0.2711610831159359d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -0.271 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(randomDataImpl7);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        long long6 = randomDataImpl0.nextLong(0L, 100L);
        double double8 = randomDataImpl0.nextChiSquare((double) 34);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution12 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray14 = hypergeometricDistribution12.sample((int) (byte) 100);
        double double15 = hypergeometricDistribution12.calculateNumericalVariance();
        double double17 = hypergeometricDistribution12.cumulativeProbability(100);
        double double19 = hypergeometricDistribution12.cumulativeProbability((int) ' ');
        org.apache.commons.math3.random.RandomGenerator randomGenerator20 = hypergeometricDistribution12.random;
        int int21 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution12);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = randomDataImpl0.nextSecureLong(33L, (long) 27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (33) must be strictly less than upper bound (27)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.171342850592966E43d + "'", double3 == 7.171342850592966E43d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22L + "'", long6 == 22L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 34.508986815487056d + "'", double8 == 34.508986815487056d);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(randomGenerator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        randomDataImpl6.reSeed((long) 1433862686);
        randomDataImpl6.reSeed();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(randomDataImpl6);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        int int9 = hypergeometricDistribution3.getSupportLowerBound();
        double double11 = hypergeometricDistribution3.cumulativeProbability(1372527618);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability(3);
        double double12 = hypergeometricDistribution3.probability((int) (byte) 1);
        double double15 = hypergeometricDistribution3.cumulativeProbability(0, (int) (short) 100);
        double double17 = hypergeometricDistribution3.upperCumulativeProbability(0);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl18 = hypergeometricDistribution3.randomData;
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(randomDataImpl18);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(0.7615941559557649d, 100.03693845824617d);
        int int6 = randomDataImpl0.nextInt(50, 2061458278);
        double double8 = randomDataImpl0.nextExponential((double) 0.5954851f);
        int int12 = randomDataImpl0.nextHypergeometric(200911654, (int) (short) 100, 0);
        java.lang.String str14 = randomDataImpl0.nextHexString((int) (byte) 100);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 103.5951112488634d + "'", double3 == 103.5951112488634d);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 760416712 + "'", int6 == 760416712);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7388339091466888d + "'", double8 == 0.7388339091466888d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "28c94fcfd7cdf4b1739fd0d3ee22741fd0545fe59c21aa6898fdc7c52428802f5a13f674fafa9d8aa5a801c53fb7c41de613" + "'", str14, "28c94fcfd7cdf4b1739fd0d3ee22741fd0545fe59c21aa6898fdc7c52428802f5a13f674fafa9d8aa5a801c53fb7c41de613");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((-1737377827));
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.sample();
        int int11 = hypergeometricDistribution3.sample();
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(4.848804970405654E43d);
        double double7 = randomDataImpl0.nextExponential(9.776469137486499E42d);
        double double9 = randomDataImpl0.nextExponential(0.996797877200076d);
        double double13 = randomDataImpl0.nextUniform(1.7208804422995356d, 2.500805915363604d, false);
        double double16 = randomDataImpl0.nextCauchy(1.2194583029079231d, 1.8228629296708965E43d);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = randomDataImpl0.nextHypergeometric(137470501, (-585726983), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-585,726,983)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.3937015249935705E43d + "'", double5 == 3.3937015249935705E43d);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0201951362860856E43d + "'", double7 == 4.0201951362860856E43d);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.824350769414109d + "'", double9 == 2.824350769414109d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.4525044833457845d + "'", double13 == 2.4525044833457845d);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0368620309096346E44d + "'", double16 == 1.0368620309096346E44d);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextHexString(50);
        double double8 = randomDataImpl0.nextCauchy((-0.0d), 2.718281828459045d);
        randomDataImpl0.reSeedSecure(1L);
        double double13 = randomDataImpl0.nextWeibull(2.1351056510154813d, 17.10288816135391d);
        double double16 = randomDataImpl0.nextGamma(0.5403023058681398d, 2.7062028005993172E44d);
        double double18 = randomDataImpl0.nextExponential(99052.36497026296d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution22 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        double double24 = hypergeometricDistribution22.cumulativeProbability((int) 'a');
        double double26 = hypergeometricDistribution22.cumulativeProbability((int) (short) 0);
        int int27 = hypergeometricDistribution22.getSupportUpperBound();
        int int31 = hypergeometricDistribution22.solveInverseCumulativeProbability(31.915908845722406d, 52, (-1594884346));
        int int32 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution22);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.2607175230433096E44d + "'", double3 == 3.2607175230433096E44d);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3cdea2d2c94c8e08db5490ef73b0ee0ca3962204da1e7c96dd" + "'", str5, "3cdea2d2c94c8e08db5490ef73b0ee0ca3962204da1e7c96dd");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.3497937453335807d) + "'", double8 == (-2.3497937453335807d));
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.519656827560277d + "'", double13 == 5.519656827560277d);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.043478567136772E43d + "'", double16 == 9.043478567136772E43d);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 41061.44684151989d + "'", double18 == 41061.44684151989d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1594884346) + "'", int31 == (-1594884346));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1));
        int int11 = hypergeometricDistribution3.getSampleSize();
        int[] intArray13 = hypergeometricDistribution3.sample(32);
        org.junit.Assert.assertNotNull(randomGenerator4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, (int) ' ', (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 100);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = hypergeometricDistribution3.randomData;
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getSampleSize();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl11 = hypergeometricDistribution3.randomData;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistribution3.inverseCumulativeProbability(24.260916529030567d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 24.261 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(randomDataImpl8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl11);
    }
}
