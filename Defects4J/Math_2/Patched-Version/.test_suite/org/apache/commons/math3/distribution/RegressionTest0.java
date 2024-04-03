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
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = hypergeometricDistribution3.sample((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = randomDataImpl0.nextBinomial((int) ' ', (double) 97L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 97 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = hypergeometricDistribution3.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(0, (int) '#', 34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistribution3.inverseCumulativeProbability((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -1 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 10, 83, 41);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (83) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = hypergeometricDistribution3.sample((-1737377827));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1,737,377,827)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution3.inverseCumulativeProbability(147.4131591025766d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 147.413 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = hypergeometricDistribution3.sample((-1737377827));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1,737,377,827)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        long long7 = well19937c1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 0, (int) (short) 1, 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-6656821606993036558L) + "'", long7 == (-6656821606993036558L));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistribution3.inverseCumulativeProbability(90.06718436886122d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 90.067 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator1 = new org.apache.commons.math3.random.RandomDataGenerator(randomGenerator0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = randomDataGenerator1.nextHypergeometric((int) (short) -1, 4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (10) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double10 = randomDataImpl0.nextGaussian((double) 100000L, 81.82697346282114d);
        // The following exception was thrown during execution in test generation
        try {
            randomDataImpl0.setSecureAlgorithm("", "6");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: 6");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99961.04542777818d + "'", double10 == 99961.04542777818d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double10 = randomDataImpl0.nextGaussian((double) 100000L, 81.82697346282114d);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = randomDataImpl0.nextPermutation((int) 'a', (-722721355));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: permutation size (-722,721,355");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100036.5175932457d + "'", double10 == 100036.5175932457d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistribution3.inverseCumulativeProbability((double) 18L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 18 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        int int9 = randomDataImpl6.nextSecureInt((-1737377827), 3);
        // The following exception was thrown during execution in test generation
        try {
            randomDataImpl6.setSecureAlgorithm("eb463d9518de6cd1bfd005f460ffb606939faab22", "f670bf7978446080053785c6a29e3da806a73d850c1fd14c99");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: f670bf7978446080053785c6a29e3da806a73d850c1fd14c99");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1201555829) + "'", int9 == (-1201555829));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = randomDataImpl0.nextLong((long) 14, (long) 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (14) must be strictly less than upper bound (5)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.70217333361038E43d + "'", double5 == 4.70217333361038E43d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        double double11 = hypergeometricDistribution3.cumulativeProbability(10);
        double double13 = hypergeometricDistribution3.probability(4);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistribution3.cumulativeProbability(14, (-1737377827));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (14) must be less than or equal to upper endpoint (-1,737,377,827)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        org.apache.commons.math3.random.RandomGenerator randomGenerator6 = hypergeometricDistribution3.random;
        randomGenerator6.setSeed((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(randomGenerator6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        int[] intArray11 = hypergeometricDistribution3.sample(1);
        double double12 = hypergeometricDistribution3.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution3.inverseCumulativeProbability((-0.6933597529402445d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -0.693 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = hypergeometricDistribution3.sample((-1737377827));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1,737,377,827)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        int[] intArray11 = hypergeometricDistribution3.sample(1);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistribution3.cumulativeProbability(5, (-1243261466));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (5) must be less than or equal to upper endpoint (-1,243,261,466)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistribution3.inverseCumulativeProbability((double) 14L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 14 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        int int11 = hypergeometricDistribution4.solveInverseCumulativeProbability(7.158517489260594E43d, 0, 100);
        int int12 = hypergeometricDistribution4.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 81L, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = hypergeometricDistribution3.sample((-1243261466));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1,243,261,466)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextHexString(50);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = randomDataImpl0.nextHypergeometric(14, 41, 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (41) must be less than or equal to population size (14)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.837986371321182E42d + "'", double3 == 4.837986371321182E42d);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9b23421986a50d0217361437d4fafd0eb8dcc3a92adb1d3515" + "'", str5, "9b23421986a50d0217361437d4fafd0eb8dcc3a92adb1d3515");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double10 = randomDataImpl0.nextGaussian((double) 100000L, 81.82697346282114d);
        randomDataImpl0.reSeed((long) 21);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = randomDataImpl0.nextInt(100, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (100) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100109.58268016609d + "'", double10 == 100109.58268016609d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.inverseCumulativeProbability((-0.0d));
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((-6100845396906899996L));
        well19937c1.setSeed(8853895889823578499L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, (int) (byte) -1, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator1 = new org.apache.commons.math3.random.RandomDataGenerator(randomGenerator0);
        long long4 = randomDataGenerator1.nextSecureLong((long) (short) 10, 30L);
        double double7 = randomDataGenerator1.nextWeibull(37.80682729170967d, (double) 4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = randomDataGenerator1.nextHypergeometric((int) (short) 100, (-1737377827), (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1,737,377,827)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 21L + "'", long4 == 21L);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.034579553401236d + "'", double7 == 4.034579553401236d);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator1 = new org.apache.commons.math3.random.RandomDataGenerator(randomGenerator0);
        long long4 = randomDataGenerator1.nextSecureLong((long) (short) 10, 30L);
        randomDataGenerator1.reSeedSecure(30L);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = randomDataGenerator1.nextHypergeometric((int) 'a', 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (97)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 11L + "'", long4 == 11L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        double double18 = randomDataImpl0.nextExponential(0.9268766230346709d);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = randomDataImpl0.nextSecureInt((int) 'a', (-492729593));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (97) must be strictly less than upper bound (-492,729,593)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0194676527917877E43d + "'", double5 == 2.0194676527917877E43d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.8302216494364127d + "'", double18 == 0.8302216494364127d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = hypergeometricDistribution3.sample((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 2, 0, 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (5) must be less than or equal to population size (2)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        double double11 = randomDataImpl0.nextUniform(0.6927991497383688d, 99.95453823045537d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int16 = hypergeometricDistribution15.getSampleSize();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = hypergeometricDistribution15.getSupportUpperBound();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistribution15.cumulativeProbability((int) '4', (-19));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (52) must be less than or equal to upper endpoint (-19)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.22736593808108d + "'", double3 == 25.22736593808108d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 71.6136937465791d + "'", double11 == 71.6136937465791d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        int int9 = randomDataImpl6.nextSecureInt((-1737377827), 3);
        int int12 = randomDataImpl6.nextZipf((int) (short) 1, 0.008990263851537944d);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = randomDataImpl6.nextPermutation(11, 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: permutation size (35) exceeds permuation domain (11)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1201798792) + "'", int9 == (-1201798792));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int14 = hypergeometricDistribution13.getSampleSize();
        int int15 = hypergeometricDistribution13.getSampleSize();
        double double16 = hypergeometricDistribution13.getNumericalVariance();
        int int17 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        long long19 = randomDataImpl0.nextPoisson((double) 11L);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = randomDataImpl0.nextPascal(34, 907.4318843503326d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 907.432 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 167.62013101550846d + "'", double3 == 167.62013101550846d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9L + "'", long19 == 9L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 9, (-1), 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        double double18 = hypergeometricDistribution13.cumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistribution13.cumulativeProbability(0, (-308049809));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0) must be less than or equal to upper endpoint (-308,049,809)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.2286759058234484E43d + "'", double5 == 4.2286759058234484E43d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double5 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int15 = hypergeometricDistribution14.getSampleSize();
        int int16 = hypergeometricDistribution14.getSampleSize();
        int int17 = randomDataImpl10.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double18 = hypergeometricDistribution14.getNumericalVariance();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double22 = randomDataImpl0.nextGamma(1.0000000000000002d, (double) 4);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = randomDataImpl0.nextGaussian((-0.404905586864885d), (double) (-445500633));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: standard deviation (-445,500,633)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.927932472804676E43d + "'", double5 == 9.927932472804676E43d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5.748492549930944d + "'", double22 == 5.748492549930944d);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 1, (int) (byte) 10, (int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution3.random;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(randomGenerator11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        int[] intArray11 = hypergeometricDistribution3.sample(1);
        double double12 = hypergeometricDistribution3.getNumericalMean();
        int int13 = hypergeometricDistribution3.getSupportUpperBound();
        double double14 = hypergeometricDistribution3.getNumericalMean();
        int int15 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int14 = hypergeometricDistribution13.getSampleSize();
        int int15 = hypergeometricDistribution13.getSampleSize();
        double double16 = hypergeometricDistribution13.getNumericalVariance();
        int int17 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = randomDataImpl0.nextHypergeometric(29, 0, 34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (34) must be less than or equal to population size (29)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 64.03502920960705d + "'", double3 == 64.03502920960705d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        int int9 = randomDataImpl6.nextSecureInt((int) (short) -1, 0);
        int int12 = randomDataImpl6.nextSecureInt(29, 701507655);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = randomDataImpl6.nextT((-3.0003363531783447d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (-3)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 678869092 + "'", int12 == 678869092);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = hypergeometricDistribution3.sample((-722721355));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-722,721,355)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        double double9 = hypergeometricDistribution3.probability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        double double18 = randomDataImpl0.nextExponential(0.9268766230346709d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = randomDataImpl0.nextUniform((double) 52.000004f, 0.0d, false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (52) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.918687396492634E42d + "'", double5 == 6.918687396492634E42d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.4474343035820318d + "'", double18 == 0.4474343035820318d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        randomGenerator7.setSeed(4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 32L, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator1 = new org.apache.commons.math3.random.RandomDataGenerator(randomGenerator0);
        java.lang.String str3 = randomDataGenerator1.nextSecureHexString(41);
        long long6 = randomDataGenerator1.nextSecureLong((long) (short) -1, 10L);
        java.lang.String str8 = randomDataGenerator1.nextHexString(10);
        randomDataGenerator1.reSeedSecure();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = randomDataGenerator1.nextHypergeometric(4, 6, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (6) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "591f87c382227d5638b1c39eb4225d77623856c37" + "'", str3, "591f87c382227d5638b1c39eb4225d77623856c37");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1dbe6032c6" + "'", str8, "1dbe6032c6");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution3.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        boolean boolean9 = well19937c1.nextBoolean();
        long long11 = well19937c1.nextLong((long) 11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 14, (-19), 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-19)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.cumulativeProbability(21);
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1, 1);
        int int12 = hypergeometricDistribution3.sample();
        double double14 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int15 = hypergeometricDistribution14.getSampleSize();
        int int16 = hypergeometricDistribution14.getSampleSize();
        int int17 = randomDataImpl10.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double18 = hypergeometricDistribution14.getNumericalVariance();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double22 = randomDataImpl0.nextGamma(1.0000000000000002d, (double) 4);
        // The following exception was thrown during execution in test generation
        try {
            randomDataImpl0.setSecureAlgorithm("4fb662bdb1dbe397891ac24bfe66b88260ceeb4f6", "241215ef4bfbbedf78c3fa197e1ad9c739dfc802f");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: 241215ef4bfbbedf78c3fa197e1ad9c739dfc802f");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.119449536073636E43d + "'", double5 == 8.119449536073636E43d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.582350749087888d + "'", double22 == 2.582350749087888d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c(722721355);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution5 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, (-722721355), 0, 1773504001);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-722,721,355)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability((double) 0.27873123f, 21, 50);
        int int13 = hypergeometricDistribution4.sample();
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = hypergeometricDistribution4.random;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(randomGenerator14);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        int int17 = hypergeometricDistribution13.getSupportLowerBound();
        double double18 = hypergeometricDistribution13.getNumericalVariance();
        int int19 = hypergeometricDistribution13.getSupportLowerBound();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7861119591037544E44d + "'", double5 == 1.7861119591037544E44d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int14 = hypergeometricDistribution13.getSampleSize();
        int int15 = hypergeometricDistribution13.getSampleSize();
        double double16 = hypergeometricDistribution13.getNumericalVariance();
        int int17 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        long long19 = randomDataImpl0.nextPoisson((double) 11L);
        double double22 = randomDataImpl0.nextUniform(0.0d, 4.895601134209371E44d);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = randomDataImpl0.nextInt((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (97) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 66.34604677381432d + "'", double3 == 66.34604677381432d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 18L + "'", long19 == 18L);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.5350850767754086E44d + "'", double22 == 4.5350850767754086E44d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double10 = randomDataImpl0.nextGaussian((double) 100000L, 81.82697346282114d);
        randomDataImpl0.reSeed((long) 21);
        long long14 = randomDataImpl0.nextPoisson(1.7763568394002505E-15d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = randomDataImpl0.nextExponential((-0.6933597529402445d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: mean (-0.693)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100143.44681928105d + "'", double10 == 100143.44681928105d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        int int17 = hypergeometricDistribution13.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = hypergeometricDistribution13.sample((-127));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-127)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.859579482960288E43d + "'", double5 == 6.859579482960288E43d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.sample();
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        double double12 = hypergeometricDistribution3.cumulativeProbability((-1), 50);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        long long7 = well19937c1.nextLong();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator8 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double10 = randomDataGenerator8.nextExponential(1.6624686359728634E45d);
        double double13 = randomDataGenerator8.nextGaussian(0.0d, 1.6624686359728634E45d);
        double double16 = randomDataGenerator8.nextUniform(1.732635906858052E45d, 1.8356256245974534E45d);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = randomDataGenerator8.nextHypergeometric(24, (-1912014094), 667571320);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1,912,014,094)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-6656821606993036558L) + "'", long7 == (-6656821606993036558L));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.2357734916950415E45d + "'", double10 == 2.2357734916950415E45d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.5320527506408525E45d) + "'", double13 == (-1.5320527506408525E45d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7730615046788318E45d + "'", double16 == 1.7730615046788318E45d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian((double) (short) 10, 97.0d);
        double double6 = randomDataImpl0.nextBeta((double) 42L, 2.993222846126381d);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl7 = new org.apache.commons.math3.random.RandomDataImpl();
        int int10 = randomDataImpl7.nextSecureInt((int) (byte) -1, 4);
        double double13 = randomDataImpl7.nextGaussian((double) 100.00001f, 147.4131591025766d);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution18 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int19 = hypergeometricDistribution18.getSampleSize();
        int int20 = hypergeometricDistribution18.getSampleSize();
        int int21 = randomDataImpl14.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution18);
        int int22 = randomDataImpl7.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution18);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl23 = hypergeometricDistribution18.randomData;
        int int24 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution18);
        org.apache.commons.math3.distribution.RealDistribution realDistribution25 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double26 = randomDataImpl0.nextInversionDeviate(realDistribution25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-51.83771355327504d) + "'", double3 == (-51.83771355327504d));
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.933740298866491d + "'", double6 == 0.933740298866491d);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-16.333361880739574d) + "'", double13 == (-16.333361880739574d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        randomDataImpl0.reSeed();
        int int4 = randomDataImpl0.nextSecureInt((-1737377827), (int) ' ');
        double double7 = randomDataImpl0.nextUniform(10.916923230387965d, (double) 52.000004f);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = randomDataImpl0.nextHypergeometric((-232542925), 326499095, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-232,542,925)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-804766296) + "'", int4 == (-804766296));
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.025298197989606d + "'", double7 == 39.025298197989606d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double10 = hypergeometricDistribution3.cumulativeProbability(0);
        int int11 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double7 = hypergeometricDistribution3.probability(1628752109);
        int int8 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator((long) 22);
        int int10 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = randomDataImpl0.nextZipf((-373396830), (double) 4.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: dimension (-373,396,830)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int14 = hypergeometricDistribution13.getSampleSize();
        int int15 = hypergeometricDistribution13.getSampleSize();
        double double16 = hypergeometricDistribution13.getNumericalVariance();
        int int17 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        long long19 = randomDataImpl0.nextPoisson((double) 11L);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = randomDataImpl0.nextInt((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.391944561435942d + "'", double3 == 8.391944561435942d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9L + "'", long19 == 9L);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        int int9 = hypergeometricDistribution3.getSupportLowerBound();
        double double10 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 81L, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution3.inverseCumulativeProbability((double) 7L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 7 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(40L);
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        randomDataImpl0.reSeed((long) 34);
        randomDataImpl0.reSeedSecure((long) (short) 1);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl5 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int10 = hypergeometricDistribution9.getSampleSize();
        int int11 = hypergeometricDistribution9.getSampleSize();
        int int12 = randomDataImpl5.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution9);
        boolean boolean13 = hypergeometricDistribution9.isSupportConnected();
        int int17 = hypergeometricDistribution9.solveInverseCumulativeProbability((double) 0.27873123f, 21, 50);
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution9);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = randomDataImpl0.nextLong(7617141686494654831L, (long) 24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (7,617,141,686,494,654,831) must be strictly less than upper bound (24)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator(22L);
        int int10 = hypergeometricDistribution3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistribution3.cumulativeProbability((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        float float7 = well19937c1.nextFloat();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray13 = hypergeometricDistribution11.sample(5);
        well19937c1.setSeed(intArray13);
        well19937c1.setSeed(4);
        int int17 = well19937c1.nextInt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.639133f + "'", float7 == 0.639133f);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-469025561) + "'", int17 == (-469025561));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        long long9 = well19937c1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, (-1), 83, 11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5141685311728891869L + "'", long9 == 5141685311728891869L);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = hypergeometricDistribution3.sample((-373396830));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-373,396,830)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int15 = hypergeometricDistribution14.getSampleSize();
        int int16 = hypergeometricDistribution14.getSampleSize();
        int int17 = randomDataImpl10.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double18 = hypergeometricDistribution14.getNumericalVariance();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double21 = randomDataImpl0.nextExponential((double) 3);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0019561273501504E43d + "'", double5 == 4.0019561273501504E43d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.640331556581645d + "'", double21 == 4.640331556581645d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator1 = new org.apache.commons.math3.random.RandomDataGenerator(randomGenerator0);
        java.lang.String str3 = randomDataGenerator1.nextSecureHexString(41);
        long long6 = randomDataGenerator1.nextSecureLong((long) (short) -1, 10L);
        long long8 = randomDataGenerator1.nextPoisson(26.43377238240109d);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = randomDataGenerator1.nextHypergeometric((-127), 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-127)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0bac1868c32f821f2534bb4821b61113d66fbb656" + "'", str3, "0bac1868c32f821f2534bb4821b61113d66fbb656");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 31L + "'", long8 == 31L);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        int int8 = hypergeometricDistribution4.getSampleSize();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl9 = hypergeometricDistribution4.randomData;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution3.inverseCumulativeProbability((double) 100.00001f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator(22L);
        double double10 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        int int9 = randomDataImpl6.nextSecureInt((-1737377827), 3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = randomDataImpl6.nextPascal(26, 1.2991008986963812E43d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 12,991,008,986,963,812,000,000,000,000,000,000,000,000,000 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-298403783) + "'", int9 == (-298403783));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c(2061458278);
        int int2 = well19937c1.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution6 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double7 = hypergeometricDistribution6.getNumericalMean();
        int int8 = hypergeometricDistribution6.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl9 = hypergeometricDistribution6.randomData;
        randomDataImpl9.reSeedSecure();
        int[] intArray13 = randomDataImpl9.nextPermutation(17, 9);
        well19937c1.setSeed(intArray13);
        long long15 = well19937c1.nextLong();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1628752109 + "'", int2 == 1628752109);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl9);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[4, 7, 16, 10, 8, 3, 15, 11, 9]");
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 660866515444047972L + "'", long15 == 660866515444047972L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample(5);
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.5548245223302555d, (int) (byte) 0, 50);
        int int10 = hypergeometricDistribution3.getSampleSize();
        double double13 = hypergeometricDistribution3.cumulativeProbability(83, 667571320);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution3.inverseCumulativeProbability((-10452.940730096681d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -10,452.941 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int14 = hypergeometricDistribution13.getSampleSize();
        int int15 = hypergeometricDistribution13.getSampleSize();
        double double16 = hypergeometricDistribution13.getNumericalVariance();
        int int17 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistribution13.inverseCumulativeProbability((double) 3.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 3 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13.186068560953743d + "'", double3 == 13.186068560953743d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        double double13 = hypergeometricDistribution3.probability((-445500633));
        boolean boolean14 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        int int9 = randomDataImpl6.nextSecureInt((-1737377827), 3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = randomDataImpl6.nextPascal((-469025561), (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of successes (-469,025,561)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-663205366) + "'", int9 == (-663205366));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        double double10 = hypergeometricDistribution3.cumulativeProbability(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 50, 722721355, (-727130892));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-727,130,892)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int14 = hypergeometricDistribution13.getSampleSize();
        int int15 = hypergeometricDistribution13.getSampleSize();
        double double16 = hypergeometricDistribution13.getNumericalVariance();
        int int17 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        long long19 = randomDataImpl0.nextPoisson((double) 11L);
        double double22 = randomDataImpl0.nextUniform(0.0d, 4.895601134209371E44d);
        double double24 = randomDataImpl0.nextExponential((double) 34);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = randomDataImpl0.nextPermutation((-151574763), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: permutation size (0) exceeds permuation domain (-151,574,763)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.6322181136945204d) + "'", double3 == (-3.6322181136945204d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 12L + "'", long19 == 12L);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.847717287819E44d + "'", double22 == 1.847717287819E44d);
// flaky:         org.junit.Assert.assertTrue("'" + double24 + "' != '" + 47.429661818185636d + "'", double24 == 47.429661818185636d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability((double) 0.27873123f, 21, 50);
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((-308049809), 3, 130969041);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-308,049,809)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator(22L);
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = randomDataImpl0.nextSecureHexString(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: length (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int14 = hypergeometricDistribution13.getSampleSize();
        int int15 = hypergeometricDistribution13.getSampleSize();
        double double16 = hypergeometricDistribution13.getNumericalVariance();
        int int17 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        long long19 = randomDataImpl0.nextPoisson((double) 11L);
        double double22 = randomDataImpl0.nextUniform(0.0d, 4.895601134209371E44d);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = randomDataImpl0.nextUniform(1.4534288014385348E43d, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (14,534,288,014,385,348,000,000,000,000,000,000,000,000,000) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 26.66703134770451d + "'", double3 == 26.66703134770451d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.43481065704101E43d + "'", double22 == 6.43481065704101E43d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        double double9 = hypergeometricDistribution3.cumulativeProbability(1350606328);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistribution3.inverseCumulativeProbability((-0.6401443394691997d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -0.64 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.inverseCumulativeProbability((-0.0d));
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        double double10 = hypergeometricDistribution3.cumulativeProbability(10, 722721355);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        int int9 = randomDataImpl6.nextSecureInt((int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = randomDataImpl6.nextExponential((double) (-3.08049792E8f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: mean (-308,049,792)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double10 = randomDataImpl0.nextGaussian((double) 100000L, 81.82697346282114d);
        double double13 = randomDataImpl0.nextGaussian((double) (-127), (double) 17);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = randomDataImpl0.nextHypergeometric((int) ' ', (-492729593), 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-492,729,593)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100054.27824361261d + "'", double10 == 100054.27824361261d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-116.58956560702777d) + "'", double13 == (-116.58956560702777d));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        double double11 = hypergeometricDistribution3.cumulativeProbability(10);
        double double13 = hypergeometricDistribution3.probability(4);
        int int14 = hypergeometricDistribution3.getSampleSize();
        int int15 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double5 = hypergeometricDistribution3.getNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        double double9 = hypergeometricDistribution3.getNumericalMean();
        int int10 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator(22L);
        double double10 = hypergeometricDistribution3.getNumericalMean();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        randomDataImpl6.reSeedSecure();
        int[] intArray10 = randomDataImpl6.nextPermutation(17, 9);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = randomDataImpl6.nextHypergeometric((-722721355), (-549865085), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-722,721,355)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 2, 13, 0, 6, 4, 7, 15, 5]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        int[] intArray11 = hypergeometricDistribution3.sample(1);
        double double12 = hypergeometricDistribution3.getNumericalMean();
        int int13 = hypergeometricDistribution3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution3.inverseCumulativeProbability(285.7818986081411d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 285.782 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        int int7 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 1, 1, 3);
        double double10 = hypergeometricDistribution3.getNumericalMean();
        int int11 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        double double8 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double6 = randomDataImpl0.nextGaussian((double) 100.00001f, 147.4131591025766d);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl7 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int12 = hypergeometricDistribution11.getSampleSize();
        int int13 = hypergeometricDistribution11.getSampleSize();
        int int14 = randomDataImpl7.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution11);
        int int15 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution11);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = randomDataImpl0.nextPermutation(22, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: permutation size (0");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 237.11544533386493d + "'", double6 == 237.11544533386493d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        double double9 = hypergeometricDistribution3.getNumericalMean();
        double double10 = hypergeometricDistribution3.getNumericalMean();
        double double12 = hypergeometricDistribution3.cumulativeProbability((-469025561));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.probability(326499095);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution3.inverseCumulativeProbability(1.5915555881110497E45d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 1,591,555,588,111,049,700,000,000,000,000,000,000,000,000,000 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) (-19));
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        boolean boolean5 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        int int12 = hypergeometricDistribution3.sample();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution3.inverseCumulativeProbability(52.00000000000001d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 52 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        long long6 = randomDataImpl0.nextLong(0L, 100L);
        java.lang.String str8 = randomDataImpl0.nextSecureHexString((int) (short) 1);
        double double11 = randomDataImpl0.nextBeta(1.7730615046788318E45d, (double) 14L);
        java.lang.String str13 = randomDataImpl0.nextSecureHexString(83);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = randomDataImpl0.nextHypergeometric(22, (int) (byte) -1, 136);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.736963296712724E43d) + "'", double3 == (-1.736963296712724E43d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 20L + "'", long6 == 20L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "e" + "'", str8, "e");
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "bdfb061242e0e93f733459206f8c6b415cc4137d214adbb3cc9b6bf5c6da200f815d21ad495f702eabe" + "'", str13, "bdfb061242e0e93f733459206f8c6b415cc4137d214adbb3cc9b6bf5c6da200f815d21ad495f702eabe");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1773504001, 722721355, 4);
        int int4 = hypergeometricDistribution3.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistribution3.inverseCumulativeProbability(6.500851593925489E42d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 6,500,851,593,925,489,000,000,000,000,000,000,000,000,000 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        int int9 = randomDataImpl6.nextSecureInt((int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = randomDataImpl6.nextPermutation(11, (-308049809));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: permutation size (-308,049,809");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 667571320, 667571320, (int) (byte) 100);
        boolean boolean10 = hypergeometricDistribution9.isSupportConnected();
        java.lang.Class<?> wildcardClass11 = hypergeometricDistribution9.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int14 = hypergeometricDistribution13.getSampleSize();
        int int15 = hypergeometricDistribution13.getSampleSize();
        double double16 = hypergeometricDistribution13.getNumericalVariance();
        int int17 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        double double18 = hypergeometricDistribution13.calculateNumericalVariance();
        double double19 = hypergeometricDistribution13.calculateNumericalVariance();
        hypergeometricDistribution13.reseedRandomGenerator(100L);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.73580756193423d + "'", double3 == 3.73580756193423d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        int int9 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 81L, 0, (int) (short) -1);
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        int int14 = hypergeometricDistribution3.solveInverseCumulativeProbability(4.5079377088467325d, (int) (byte) 1, 1628752109);
        double double15 = hypergeometricDistribution3.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistribution3.inverseCumulativeProbability(83.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 83 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1628752109 + "'", int14 == 1628752109);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        hypergeometricDistribution3.reseedRandomGenerator((long) (-327692674));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator(22L);
        int int10 = hypergeometricDistribution3.sample();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        int int12 = hypergeometricDistribution3.sample();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl13 = hypergeometricDistribution3.randomData;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 41);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 1, 1, 3);
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.sample();
        int int11 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 81L, 0, (int) (short) -1);
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        int int11 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        int[] intArray11 = hypergeometricDistribution3.sample(1);
        double double12 = hypergeometricDistribution3.getNumericalMean();
        int int13 = hypergeometricDistribution3.getSupportUpperBound();
        double double14 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = randomDataImpl0.nextHypergeometric(11, 7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.274914059041573E43d + "'", double5 == 7.274914059041573E43d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        int int17 = hypergeometricDistribution13.getSupportLowerBound();
        double double18 = hypergeometricDistribution13.getNumericalVariance();
        int int19 = hypergeometricDistribution13.getSupportLowerBound();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.430342710055986E43d + "'", double5 == 3.430342710055986E43d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        randomDataImpl0.reSeed();
        long long4 = randomDataImpl0.nextSecureLong(17L, 20L);
        double double7 = randomDataImpl0.nextGaussian(0.0d, 82.62543470469589d);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = randomDataImpl0.nextHypergeometric((-722721355), (-549865085), 22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-722,721,355)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 18L + "'", long4 == 18L);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-120.26689477972967d) + "'", double7 == (-120.26689477972967d));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        well19937c1.setSeed((long) 4);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int12 = hypergeometricDistribution11.getSampleSize();
        double double13 = hypergeometricDistribution11.getNumericalMean();
        int[] intArray15 = hypergeometricDistribution11.sample((int) '#');
        well19937c1.setSeed(intArray15);
        int int17 = well19937c1.nextInt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 812645480 + "'", int17 == 812645480);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        float float7 = well19937c1.nextFloat();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray13 = hypergeometricDistribution11.sample(5);
        well19937c1.setSeed(intArray13);
        boolean boolean15 = well19937c1.nextBoolean();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.639133f + "'", float7 == 0.639133f);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double10 = randomDataImpl0.nextGaussian((double) 100000L, 81.82697346282114d);
        double double13 = randomDataImpl0.nextGaussian((double) (-127), (double) 17);
        int int16 = randomDataImpl0.nextInt((int) (short) 1, 25);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = randomDataImpl0.nextSecureLong((long) 34, (long) 9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (34) must be strictly less than upper bound (9)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99962.24485077715d + "'", double10 == 99962.24485077715d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-124.54591730861658d) + "'", double13 == (-124.54591730861658d));
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 1, 1, 3);
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution3.sample((-400875175));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-400,875,175)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double5 = hypergeometricDistribution3.getNumericalVariance();
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = hypergeometricDistribution13.random;
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.8382021566933665E44d + "'", double5 == 1.8382021566933665E44d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(randomGenerator17);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        well19937c1.setSeed((long) 4);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int12 = hypergeometricDistribution11.getSampleSize();
        double double13 = hypergeometricDistribution11.getNumericalMean();
        int[] intArray15 = hypergeometricDistribution11.sample((int) '#');
        well19937c1.setSeed(intArray15);
        float float17 = well19937c1.nextFloat();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.18920875f + "'", float17 == 0.18920875f);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability((double) 0.27873123f, 21, 50);
        double double14 = hypergeometricDistribution4.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        double double10 = hypergeometricDistribution3.cumulativeProbability(8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass7 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = randomDataImpl0.nextBinomial(722721355, (double) (-5344611954956146690L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -5,344,611,954,956,146,700 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.858268076594481E43d + "'", double5 == 7.858268076594481E43d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        float float7 = well19937c1.nextFloat();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray13 = hypergeometricDistribution11.sample(5);
        well19937c1.setSeed(intArray13);
        double double15 = well19937c1.nextGaussian();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.639133f + "'", float7 == 0.639133f);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.413945183638168d) + "'", double15 == (-0.413945183638168d));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(40L);
        int int11 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        int int9 = randomDataImpl6.nextSecureInt((-1737377827), 3);
        java.lang.String str11 = randomDataImpl6.nextHexString(20);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1298909124) + "'", int9 == (-1298909124));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d83d8268b8bf22596469" + "'", str11, "d83d8268b8bf22596469");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator(22L);
        int int10 = hypergeometricDistribution3.sample();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        int int12 = hypergeometricDistribution3.sample();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        boolean boolean15 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        int int9 = randomDataImpl0.nextInt((int) (byte) 1, (int) (byte) 100);
        long long12 = randomDataImpl0.nextLong(15L, (long) 34);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution16 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double17 = hypergeometricDistribution16.getNumericalMean();
        int int18 = hypergeometricDistribution16.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = hypergeometricDistribution16.randomData;
        int int20 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution16);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = randomDataImpl0.nextSecureLong((long) (-151574763), (long) (-1243261466));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (-151,574,763) must be strictly less than upper bound (-1,243,261,466)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 60.96736594634413d + "'", double3 == 60.96736594634413d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54 + "'", int9 == 54);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 30L + "'", long12 == 30L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.probability((int) (short) 0);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(11, (-2128545835), 27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-2,128,545,835)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double10 = randomDataImpl0.nextGaussian((double) 100000L, 81.82697346282114d);
        randomDataImpl0.reSeed((long) 21);
        long long14 = randomDataImpl0.nextPoisson(1.7763568394002505E-15d);
        long long17 = randomDataImpl0.nextSecureLong((long) 3, 42L);
        double double20 = randomDataImpl0.nextWeibull(0.29725954737419347d, 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99990.82750500985d + "'", double10 == 99990.82750500985d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 39L + "'", long17 == 39L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.2058122191814136d + "'", double20 == 1.2058122191814136d);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int11 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.0d, 4, (-308049809));
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1);
        int int14 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-308049809) + "'", int11 == (-308049809));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.probability(326499095);
        int int9 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double14 = hypergeometricDistribution13.getNumericalMean();
        double double15 = hypergeometricDistribution13.getNumericalVariance();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = randomDataImpl0.nextPermutation((-1), 462497761);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: permutation size (462,497,761) exceeds permuation domain (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 75.63817119967707d + "'", double3 == 75.63817119967707d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        float float8 = well19937c1.nextFloat();
        well19937c1.setSeed(5492381562888477542L);
        org.apache.commons.math3.random.Well19937c well19937c12 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int14 = well19937c12.nextInt(100);
        well19937c12.clear();
        int int16 = well19937c12.nextInt();
        well19937c12.setSeed((long) 4);
        int[] intArray24 = new int[] { 35, 35, '4', (short) 100, (short) 100 };
        well19937c12.setSeed(intArray24);
        org.apache.commons.math3.random.Well19937c well19937c27 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int29 = well19937c27.nextInt(100);
        int int31 = well19937c27.nextInt(5);
        int int32 = well19937c27.nextInt();
        org.apache.commons.math3.random.Well19937c well19937c34 = new org.apache.commons.math3.random.Well19937c((int) ' ');
        org.apache.commons.math3.random.Well19937c well19937c36 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int38 = well19937c36.nextInt(100);
        well19937c36.clear();
        int int40 = well19937c36.nextInt();
        long long41 = well19937c36.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c43 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int45 = well19937c43.nextInt(100);
        byte[] byteArray46 = new byte[] {};
        well19937c43.nextBytes(byteArray46);
        well19937c36.nextBytes(byteArray46);
        int[] intArray50 = new int[] { 50 };
        well19937c36.setSeed(intArray50);
        well19937c34.setSeed(intArray50);
        well19937c27.setSeed(intArray50);
        well19937c12.setSeed(intArray50);
        well19937c1.setSeed(intArray50);
        well19937c1.setSeed((-752293658));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution61 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 2, (-400875175), 28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-400,875,175)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.27873123f + "'", float8 == 0.27873123f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1737377827) + "'", int16 == (-1737377827));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35, 35, 52, 100, 100]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 50 + "'", int29 == 50);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2061458278 + "'", int32 == 2061458278);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 50 + "'", int38 == 50);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1737377827) + "'", int40 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 8853895889823578499L + "'", long41 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 50 + "'", int45 == 50);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[50]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '4', 1773504001);
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 10);
        int int12 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double10 = randomDataImpl0.nextGaussian((double) 100000L, 81.82697346282114d);
        double double13 = randomDataImpl0.nextGaussian((double) (-127), (double) 17);
        randomDataImpl0.reSeed();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = randomDataImpl0.nextUniform(4.558539671154472d, (-0.8813735870195429d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (4.559) must be strictly less than upper bound (-0.881)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100208.14311207415d + "'", double10 == 100208.14311207415d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-164.29330013395483d) + "'", double13 == (-164.29330013395483d));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        int int12 = hypergeometricDistribution3.sample();
        double double14 = hypergeometricDistribution3.probability(24);
        double double16 = hypergeometricDistribution3.upperCumulativeProbability(93);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 667571320, 667571320, (int) (byte) 100);
        org.apache.commons.math3.random.Well19937c well19937c11 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int13 = well19937c11.nextInt(100);
        byte[] byteArray14 = new byte[] {};
        well19937c11.nextBytes(byteArray14);
        org.apache.commons.math3.random.Well19937c well19937c17 = new org.apache.commons.math3.random.Well19937c((int) ' ');
        org.apache.commons.math3.random.Well19937c well19937c19 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int21 = well19937c19.nextInt(100);
        well19937c19.clear();
        int int23 = well19937c19.nextInt();
        long long24 = well19937c19.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c26 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int28 = well19937c26.nextInt(100);
        byte[] byteArray29 = new byte[] {};
        well19937c26.nextBytes(byteArray29);
        well19937c19.nextBytes(byteArray29);
        int[] intArray33 = new int[] { 50 };
        well19937c19.setSeed(intArray33);
        well19937c17.setSeed(intArray33);
        well19937c11.setSeed(intArray33);
        org.apache.commons.math3.random.Well19937c well19937c37 = new org.apache.commons.math3.random.Well19937c(intArray33);
        well19937c1.setSeed(intArray33);
        float float39 = well19937c1.nextFloat();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 50 + "'", int21 == 50);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1737377827) + "'", int23 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 8853895889823578499L + "'", long24 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50 + "'", int28 == 50);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[50]");
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.30972612f + "'", float39 == 0.30972612f);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.inverseCumulativeProbability((-0.0d));
        double double8 = hypergeometricDistribution3.probability(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int11 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.0d, 4, (-308049809));
        int int12 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-308049809) + "'", int11 == (-308049809));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential(46.00580982269494d);
        double double7 = randomDataImpl0.nextChiSquare(90.06718436886122d);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution12 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int13 = hypergeometricDistribution12.getSampleSize();
        int int14 = hypergeometricDistribution12.getSampleSize();
        int int15 = randomDataImpl8.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution12);
        int int19 = hypergeometricDistribution12.solveInverseCumulativeProbability(7.158517489260594E43d, 0, 100);
        int int20 = hypergeometricDistribution12.getSupportLowerBound();
        double double22 = hypergeometricDistribution12.upperCumulativeProbability(0);
        int int23 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution12);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 31.11530695628198d + "'", double3 == 31.11530695628198d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.29093362023458d + "'", double5 == 100.29093362023458d);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 93.33518664978136d + "'", double7 == 93.33518664978136d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        java.lang.String str11 = randomDataImpl0.nextHexString(21);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int16 = hypergeometricDistribution15.getSampleSize();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int21 = hypergeometricDistribution15.solveInverseCumulativeProbability((double) 1, 1, 3);
        double double22 = hypergeometricDistribution15.getNumericalMean();
        int int23 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 47.73565238229732d + "'", double3 == 47.73565238229732d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "129f65ce4a45aa596ce03" + "'", str11, "129f65ce4a45aa596ce03");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        double double11 = randomDataImpl0.nextUniform(0.6927991497383688d, 99.95453823045537d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int16 = hypergeometricDistribution15.getSampleSize();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = hypergeometricDistribution15.getSupportUpperBound();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double22 = randomDataImpl0.nextUniform((double) 0L, 4.895601134209371E44d);
        randomDataImpl0.reSeed();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 133.415645258709d + "'", double3 == 133.415645258709d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 68.87576819975106d + "'", double11 == 68.87576819975106d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.4364397069994387E43d + "'", double22 == 4.4364397069994387E43d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability(94.44399838648991d, 0, 1773504001);
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator(32L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1773504001 + "'", int10 == 1773504001);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 1, 1, 3);
        double double10 = hypergeometricDistribution3.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution3.inverseCumulativeProbability(7.186307675636294E219d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 7,186,307,675,636,294,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator(22L);
        int int10 = hypergeometricDistribution3.sample();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        int int12 = hypergeometricDistribution3.sample();
        boolean boolean13 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int11 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.0d, 4, (-308049809));
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1);
        double double14 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-308049809) + "'", int11 == (-308049809));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample(5);
        double double7 = hypergeometricDistribution3.cumulativeProbability(22);
        int[] intArray9 = hypergeometricDistribution3.sample((int) ' ');
        double double11 = hypergeometricDistribution3.cumulativeProbability(72);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 667571320, 667571320, (int) (byte) 100);
        double double10 = well19937c1.nextDouble();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4799706618782067d + "'", double10 == 0.4799706618782067d);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        randomDataImpl6.reSeedSecure();
        randomDataImpl6.reSeed();
        randomDataImpl6.reSeed((long) (-308049809));
        randomDataImpl6.reSeedSecure();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(40L);
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, 0, 16);
        double double5 = hypergeometricDistribution3.cumulativeProbability(144);
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        int int9 = randomDataImpl6.nextSecureInt((int) (short) -1, 0);
        int int12 = randomDataImpl6.nextSecureInt(29, 701507655);
        double double14 = randomDataImpl6.nextExponential(6.049885547031181E43d);
        int int17 = randomDataImpl6.nextInt((-752293658), 21);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 549578657 + "'", int12 == 549578657);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.451930302570091E41d + "'", double14 == 1.451930302570091E41d);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-137496377) + "'", int17 == (-137496377));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (-1298909124), 1454258676, 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1,298,909,124)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        org.apache.commons.math3.random.RandomGenerator randomGenerator6 = hypergeometricDistribution3.random;
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(randomGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int14 = hypergeometricDistribution13.getSampleSize();
        int int15 = hypergeometricDistribution13.getSampleSize();
        double double16 = hypergeometricDistribution13.getNumericalVariance();
        int int17 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        long long19 = randomDataImpl0.nextPoisson((double) 11L);
        double double22 = randomDataImpl0.nextUniform(0.0d, 4.895601134209371E44d);
        double double25 = randomDataImpl0.nextF(1.5664330313550994d, 69.41152314417812d);
        double double28 = randomDataImpl0.nextUniform(0.6692725033375433d, (double) 97L);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = randomDataImpl0.nextPascal(2061458278, 7.54983443527075d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 7.55 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 40.888080189480235d + "'", double3 == 40.888080189480235d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 7L + "'", long19 == 7L);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0038792124555484E43d + "'", double22 == 4.0038792124555484E43d);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.23201074740335326d + "'", double25 == 0.23201074740335326d);
// flaky:         org.junit.Assert.assertTrue("'" + double28 + "' != '" + 7.042921614620244d + "'", double28 == 7.042921614620244d);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample(5);
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.5548245223302555d, (int) (byte) 0, 50);
        int int10 = hypergeometricDistribution3.getSampleSize();
        double double13 = hypergeometricDistribution3.cumulativeProbability(83, 667571320);
        double double14 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean15 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double11 = randomDataImpl8.nextGamma(1.5633696327922069d, 1.4358151214714785d);
        int int15 = randomDataImpl8.nextHypergeometric((int) (byte) 100, 6, 16);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = randomDataImpl8.nextSecureLong(81L, 71L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (81) must be strictly less than upper bound (71)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.4418406528658574d + "'", double11 == 1.4418406528658574d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator((long) 22);
        double double11 = hypergeometricDistribution3.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution3.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(326499095, 2061458278, 11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (2,061,458,278) must be less than or equal to population size (326,499,095)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.inverseCumulativeProbability((-0.0d));
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = hypergeometricDistribution3.cumulativeProbability((int) (short) 100, (-1243261466));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (-1,243,261,466)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        int int7 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability(68.8379343691d, 185244372, 0);
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        float float7 = well19937c1.nextFloat();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray13 = hypergeometricDistribution11.sample(5);
        well19937c1.setSeed(intArray13);
        well19937c1.setSeed(4);
        org.apache.commons.math3.random.Well19937c well19937c18 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int20 = well19937c18.nextInt(100);
        well19937c18.clear();
        int int22 = well19937c18.nextInt();
        long long23 = well19937c18.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c25 = new org.apache.commons.math3.random.Well19937c(2061458278);
        int int26 = well19937c25.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution30 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double31 = hypergeometricDistribution30.getNumericalMean();
        int int32 = hypergeometricDistribution30.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl33 = hypergeometricDistribution30.randomData;
        randomDataImpl33.reSeedSecure();
        int[] intArray37 = randomDataImpl33.nextPermutation(17, 9);
        well19937c25.setSeed(intArray37);
        well19937c18.setSeed(intArray37);
        well19937c1.setSeed(intArray37);
        org.apache.commons.math3.random.Well19937c well19937c41 = new org.apache.commons.math3.random.Well19937c(intArray37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.639133f + "'", float7 == 0.639133f);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1737377827) + "'", int22 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 8853895889823578499L + "'", long23 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1628752109 + "'", int26 == 1628752109);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl33);
        org.junit.Assert.assertNotNull(intArray37);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[13, 8, 5, 11, 7, 4, 15, 0, 3]");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.cumulativeProbability(21);
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1, 1);
        double double13 = hypergeometricDistribution3.probability(41);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = hypergeometricDistribution3.randomData;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = randomDataImpl14.nextSecureHexString((-549865085));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: length (-549,865,085)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl14);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        double double18 = hypergeometricDistribution13.cumulativeProbability(0);
        int int19 = hypergeometricDistribution13.getSupportUpperBound();
        int int20 = hypergeometricDistribution13.getSampleSize();
        double double22 = hypergeometricDistribution13.cumulativeProbability((int) (byte) 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.1431072883407442E43d + "'", double5 == 1.1431072883407442E43d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        org.apache.commons.math3.random.Well19937c well19937c8 = new org.apache.commons.math3.random.Well19937c(intArray7);
        int int9 = well19937c8.nextInt();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 812645480 + "'", int9 == 812645480);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        randomDataImpl0.reSeed();
        int int4 = randomDataImpl0.nextSecureInt((-1737377827), (int) ' ');
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution8 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int9 = hypergeometricDistribution8.getSampleSize();
        double double10 = hypergeometricDistribution8.getNumericalMean();
        boolean boolean11 = hypergeometricDistribution8.isSupportConnected();
        double double12 = hypergeometricDistribution8.getNumericalVariance();
        int int13 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution8);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = randomDataImpl0.nextUniform(78.31869066074933d, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (78.319) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-95787890) + "'", int4 == (-95787890));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 667571320, 667571320, (int) (byte) 100);
        well19937c1.setSeed(1203104027L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        org.apache.commons.math3.random.RandomGenerator randomGenerator8 = hypergeometricDistribution3.random;
        int int9 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertNotNull(randomGenerator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample(5);
        double double7 = hypergeometricDistribution3.cumulativeProbability(22);
        int[] intArray9 = hypergeometricDistribution3.sample((int) ' ');
        double double10 = hypergeometricDistribution3.calculateNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl11 = hypergeometricDistribution3.randomData;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl11);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        int int8 = well19937c1.nextInt(50);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution12 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 701507655, (-492729593), 722721355);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-492,729,593)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = randomDataImpl0.nextGaussian((double) 88L, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: standard deviation (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        double double12 = hypergeometricDistribution3.cumulativeProbability(0);
        double double14 = hypergeometricDistribution3.cumulativeProbability((-448112417));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample(5);
        double double7 = hypergeometricDistribution3.cumulativeProbability(22);
        int[] intArray9 = hypergeometricDistribution3.sample((int) ' ');
        org.apache.commons.math3.random.Well19937c well19937c10 = new org.apache.commons.math3.random.Well19937c(intArray9);
        well19937c10.setSeed(26L);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        int int9 = randomDataImpl0.nextInt((int) (byte) 1, (int) (byte) 100);
        long long12 = randomDataImpl0.nextLong(15L, (long) 34);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution16 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double17 = hypergeometricDistribution16.getNumericalMean();
        int int18 = hypergeometricDistribution16.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = hypergeometricDistribution16.randomData;
        int int20 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution16);
        boolean boolean21 = hypergeometricDistribution16.isSupportConnected();
        int int22 = hypergeometricDistribution16.getSupportUpperBound();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.7285639812248448d) + "'", double3 == (-0.7285639812248448d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37 + "'", int9 == 37);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 24L + "'", long12 == 24L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        long long6 = well19937c1.nextLong((long) 4);
        double double7 = well19937c1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 11, 62, 389817062);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (62) must be less than or equal to population size (11)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8719745671619918d + "'", double7 == 0.8719745671619918d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        double double9 = hypergeometricDistribution3.probability(722721355);
        double double10 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double5 = hypergeometricDistribution3.getNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = randomDataImpl6.nextBeta(865.0018197007181d, (double) (-1298909124));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NoBracketingException; message: function values at endpoints do not have different signs, endpoints: [0, 1], values: [-0.85, 0.15]");
        } catch (org.apache.commons.math3.exception.NoBracketingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl6);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        int int11 = hypergeometricDistribution4.solveInverseCumulativeProbability(7.158517489260594E43d, 0, 100);
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        double double14 = hypergeometricDistribution4.upperCumulativeProbability(0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = hypergeometricDistribution4.random;
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        boolean boolean17 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(randomGenerator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double14 = hypergeometricDistribution13.getNumericalMean();
        double double15 = hypergeometricDistribution13.getNumericalVariance();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = randomDataImpl0.nextUniform(25.002382431177722d, (double) 1.4E-45f, false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (25.002) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 62.4383420460634d + "'", double3 == 62.4383420460634d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator(22L);
        int int10 = hypergeometricDistribution3.sample();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        int int12 = hypergeometricDistribution3.sample();
        double double13 = hypergeometricDistribution3.calculateNumericalVariance();
        int int14 = hypergeometricDistribution3.getSupportLowerBound();
        double double16 = hypergeometricDistribution3.cumulativeProbability(11);
        double double18 = hypergeometricDistribution3.cumulativeProbability((-308049809));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample(5);
        double double7 = hypergeometricDistribution3.cumulativeProbability(22);
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        double double9 = hypergeometricDistribution3.upperCumulativeProbability(24);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double14 = hypergeometricDistribution13.getNumericalMean();
        double double15 = hypergeometricDistribution13.getNumericalVariance();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        int int19 = randomDataImpl0.nextInt((-456672586), 8);
        long long21 = randomDataImpl0.nextPoisson(202.44581754881753d);
        randomDataImpl0.reSeed();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 95.56680367883394d + "'", double3 == 95.56680367883394d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-348283319) + "'", int19 == (-348283319));
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 183L + "'", long21 == 183L);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        randomDataImpl0.reSeed();
        double double5 = randomDataImpl0.nextUniform(14.154262241479262d, (double) 30.0f, true);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = randomDataImpl0.nextHypergeometric((-1625903986), (-752293658), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1,625,903,986)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 16.856624324899087d + "'", double5 == 16.856624324899087d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long5 = randomDataImpl0.nextPoisson(14.154262241479262d);
        int int8 = randomDataImpl0.nextInt((int) (short) -1, (int) '4');
        double double11 = randomDataImpl0.nextGaussian(6.765758165426781d, 25.176912765476555d);
        double double14 = randomDataImpl0.nextGaussian((-6.871576157781146E43d), 1.7182818284590453d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution18 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int19 = hypergeometricDistribution18.getSampleSize();
        double double20 = hypergeometricDistribution18.getNumericalMean();
        boolean boolean21 = hypergeometricDistribution18.isSupportConnected();
        hypergeometricDistribution18.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = hypergeometricDistribution18.random;
        boolean boolean25 = hypergeometricDistribution18.isSupportConnected();
        int int26 = hypergeometricDistribution18.getSupportLowerBound();
        hypergeometricDistribution18.reseedRandomGenerator((-509399413869688601L));
        int int29 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution18);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 134.63369194855008d + "'", double3 == 134.63369194855008d);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-29.48049697710603d) + "'", double11 == (-29.48049697710603d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-6.871576157781146E43d) + "'", double14 == (-6.871576157781146E43d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(randomGenerator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c8 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int10 = well19937c8.nextInt(100);
        byte[] byteArray11 = new byte[] {};
        well19937c8.nextBytes(byteArray11);
        well19937c1.nextBytes(byteArray11);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        randomDataImpl14.reSeed();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = randomDataImpl14.nextHypergeometric((-1434923033), (-1912423540), 21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1,434,923,033)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int14 = hypergeometricDistribution13.getSampleSize();
        int int15 = hypergeometricDistribution13.getSampleSize();
        double double16 = hypergeometricDistribution13.getNumericalVariance();
        int int17 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        double double18 = hypergeometricDistribution13.calculateNumericalVariance();
        double double19 = hypergeometricDistribution13.calculateNumericalVariance();
        int int20 = hypergeometricDistribution13.getSupportUpperBound();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.9010900330522844d + "'", double3 == 2.9010900330522844d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.cumulativeProbability(21);
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1, 1);
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1773504001, 722721355, 4);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.6300416680029808d + "'", double4 == 1.6300416680029808d);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 81L, 0, (int) (short) -1);
        int int10 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.cumulativeProbability(21);
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1, 1);
        double double13 = hypergeometricDistribution3.probability(41);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = hypergeometricDistribution3.randomData;
        randomDataImpl14.reSeedSecure();
        org.apache.commons.math3.distribution.IntegerDistribution integerDistribution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = randomDataImpl14.nextInversionDeviate(integerDistribution16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl14);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 35, (-1737377664), (-348283319));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1,737,377,664)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        hypergeometricDistribution3.reseedRandomGenerator(3L);
        int int11 = hypergeometricDistribution3.solveInverseCumulativeProbability(137.17933990376864d, 311711631, (-2128545835));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2128545835) + "'", int11 == (-2128545835));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator((-509399413869688601L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.cumulativeProbability(21);
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1, 1);
        double double13 = hypergeometricDistribution3.probability(41);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = hypergeometricDistribution3.randomData;
        int int15 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.inverseCumulativeProbability((-0.0d));
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        well19937c1.setSeed((long) 4);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int12 = hypergeometricDistribution11.getSampleSize();
        double double13 = hypergeometricDistribution11.getNumericalMean();
        int[] intArray15 = hypergeometricDistribution11.sample((int) '#');
        well19937c1.setSeed(intArray15);
        well19937c1.setSeed(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int7 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.getNumericalVariance();
        int[] intArray10 = hypergeometricDistribution3.sample((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c8 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int10 = well19937c8.nextInt(100);
        byte[] byteArray11 = new byte[] {};
        well19937c8.nextBytes(byteArray11);
        well19937c1.nextBytes(byteArray11);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        float float15 = well19937c1.nextFloat();
        int int17 = well19937c1.nextInt(144);
        well19937c1.setSeed(5713439043366685402L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution23 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 150, (-263289891), (-19));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-263,289,891)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5548245f + "'", float15 == 0.5548245f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        hypergeometricDistribution3.reseedRandomGenerator((long) 326499095);
        double double8 = hypergeometricDistribution3.probability(722721355);
        double double10 = hypergeometricDistribution3.cumulativeProbability((-96398574));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        double double8 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator1 = new org.apache.commons.math3.random.RandomDataGenerator(randomGenerator0);
        java.lang.String str3 = randomDataGenerator1.nextSecureHexString(41);
        long long6 = randomDataGenerator1.nextSecureLong((long) (short) -1, 10L);
        long long8 = randomDataGenerator1.nextPoisson(26.43377238240109d);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = randomDataGenerator1.nextHypergeometric(150, (-327692674), 1773504001);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-327,692,674)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2a7c6191e1108932989100282f6ed40f6c5b39ff1" + "'", str3, "2a7c6191e1108932989100282f6ed40f6c5b39ff1");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9L + "'", long6 == 9L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 23L + "'", long8 == 23L);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int15 = hypergeometricDistribution14.getSampleSize();
        int int16 = hypergeometricDistribution14.getSampleSize();
        int int17 = randomDataImpl10.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double18 = hypergeometricDistribution14.getNumericalVariance();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        int int22 = randomDataImpl0.nextPascal((int) 'a', 0.9268766230346709d);
        randomDataImpl0.reSeedSecure();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.1167937187847103E44d + "'", double5 == 2.1167937187847103E44d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 81L, 0, (int) (short) -1);
        double double11 = hypergeometricDistribution3.cumulativeProbability((-327692674));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        double double11 = hypergeometricDistribution3.cumulativeProbability(10);
        int int12 = hypergeometricDistribution3.getSampleSize();
        boolean boolean13 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1773504001, 722721355, 4);
        org.apache.commons.math3.random.RandomGenerator randomGenerator4 = hypergeometricDistribution3.random;
        org.junit.Assert.assertNotNull(randomGenerator4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        int[] intArray11 = hypergeometricDistribution3.sample(1);
        double double12 = hypergeometricDistribution3.getNumericalMean();
        int int13 = hypergeometricDistribution3.getSupportUpperBound();
        double double14 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray16 = hypergeometricDistribution3.sample((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        double double10 = randomGenerator9.nextDouble();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(randomGenerator9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4991701481301327d + "'", double10 == 0.4991701481301327d);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c8 = new org.apache.commons.math3.random.Well19937c(2061458278);
        int int9 = well19937c8.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double14 = hypergeometricDistribution13.getNumericalMean();
        int int15 = hypergeometricDistribution13.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl16 = hypergeometricDistribution13.randomData;
        randomDataImpl16.reSeedSecure();
        int[] intArray20 = randomDataImpl16.nextPermutation(17, 9);
        well19937c8.setSeed(intArray20);
        well19937c1.setSeed(intArray20);
        well19937c1.setSeed(22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1628752109 + "'", int9 == 1628752109);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl16);
        org.junit.Assert.assertNotNull(intArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 9, 8, 10, 6, 7, 3, 14, 13]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistribution3.cumulativeProbability(144, (-549865085));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (144) must be less than or equal to upper endpoint (-549,865,085)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator(22L);
        double double10 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.cumulativeProbability(21);
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1, 1);
        int int12 = hypergeometricDistribution3.sample();
        double double15 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10, 83);
        int int16 = hypergeometricDistribution3.getSupportUpperBound();
        int int17 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double19 = hypergeometricDistribution3.cumulativeProbability(22);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = hypergeometricDistribution3.inverseCumulativeProbability(19.24937638309485d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 19.249 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.cumulativeProbability((int) '4', 389817062);
        int int11 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        int int12 = hypergeometricDistribution3.sample();
        int int13 = hypergeometricDistribution3.sample();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.cumulativeProbability((-21661068));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double10 = randomDataImpl0.nextGaussian((double) 100000L, 81.82697346282114d);
        double double13 = randomDataImpl0.nextGaussian((double) (-127), (double) 17);
        randomDataImpl0.reSeed();
        randomDataImpl0.reSeed();
        // The following exception was thrown during execution in test generation
        try {
            randomDataImpl0.setSecureAlgorithm("48b7", "c1179c8c36");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: c1179c8c36");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99992.56793455912d + "'", double10 == 99992.56793455912d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-149.1192185407054d) + "'", double13 == (-149.1192185407054d));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        double double11 = randomDataImpl0.nextUniform(0.6927991497383688d, 99.95453823045537d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int16 = hypergeometricDistribution15.getSampleSize();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = hypergeometricDistribution15.getSupportUpperBound();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double22 = randomDataImpl0.nextUniform((double) 0L, 4.895601134209371E44d);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = randomDataImpl0.nextLong(5141685311728891869L, 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (5,141,685,311,728,891,869) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 178.28989253292147d + "'", double3 == 178.28989253292147d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 48.25540685443478d + "'", double11 == 48.25540685443478d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.748378162219182E44d + "'", double22 == 1.748378162219182E44d);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.cumulativeProbability(21);
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1, 1);
        int int12 = hypergeometricDistribution3.sample();
        double double15 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10, 83);
        int int16 = hypergeometricDistribution3.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistribution3.cumulativeProbability(2035706397, 37);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (2,035,706,397) must be less than or equal to upper endpoint (37)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double11 = randomDataImpl8.nextGamma(1.5633696327922069d, 1.4358151214714785d);
        int int15 = randomDataImpl8.nextHypergeometric((int) (byte) 100, 6, 16);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = randomDataImpl8.nextGamma((-37.24696268198443d), 22.8641138632562d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: shape (-37.247)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.4418406528658574d + "'", double11 == 1.4418406528658574d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = hypergeometricDistribution4.sample((-373153628));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-373,153,628)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        int[] intArray11 = hypergeometricDistribution3.sample(1);
        double double12 = hypergeometricDistribution3.getNumericalMean();
        int int13 = hypergeometricDistribution3.getSupportUpperBound();
        double double14 = hypergeometricDistribution3.getNumericalMean();
        double double15 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        long long7 = well19937c1.nextLong();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator8 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        java.lang.String str10 = randomDataGenerator8.nextHexString(1);
        int int14 = randomDataGenerator8.nextHypergeometric(20, (int) (short) 1, 0);
        randomDataGenerator8.reSeed();
        double double17 = randomDataGenerator8.nextT(43.19961373209388d);
        int[] intArray20 = randomDataGenerator8.nextPermutation(15, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-6656821606993036558L) + "'", long7 == (-6656821606993036558L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8" + "'", str10, "8");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.2959329056393651d) + "'", double17 == (-0.2959329056393651d));
        org.junit.Assert.assertNotNull(intArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[5, 2, 12, 13, 4, 10, 6, 14, 1, 0, 9, 11, 8, 7, 3]");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability(94.44399838648991d, 0, 1773504001);
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1773504001 + "'", int10 == 1773504001);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        int[] intArray11 = hypergeometricDistribution3.sample(1);
        double double12 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean13 = hypergeometricDistribution3.isSupportConnected();
        int int15 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0.639133f);
        double double16 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator((long) 22);
        double double11 = hypergeometricDistribution3.probability(0);
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean14 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 1, (int) (byte) 10, (int) (short) 0);
        double double11 = hypergeometricDistribution3.getNumericalMean();
        hypergeometricDistribution3.reseedRandomGenerator((long) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator7 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        randomDataGenerator7.reSeed();
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = randomDataGenerator7.getRandomGenerator();
        randomDataGenerator7.reSeed();
        int[] intArray13 = randomDataGenerator7.nextPermutation(35, 31);
        java.lang.String str15 = randomDataGenerator7.nextSecureHexString((int) ' ');
        long long18 = randomDataGenerator7.nextLong(7L, (long) 20);
        randomDataGenerator7.reSeed((long) 176046386);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = randomDataGenerator7.nextHypergeometric(41, (-722721355), 31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-722,721,355)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[17, 26, 28, 15, 22, 8, 31, 25, 2, 12, 29, 1, 16, 0, 18, 34, 33, 23, 21, 20, 4, 10, 3, 9, 5, 19, 11, 32, 7, 30, 24]");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "f2a13c55e24a53ccbb88fe4cad396581" + "'", str15, "f2a13c55e24a53ccbb88fe4cad396581");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 13L + "'", long18 == 13L);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        randomDataImpl6.reSeedSecure();
        int[] intArray10 = randomDataImpl6.nextPermutation(17, 9);
        randomDataImpl6.reSeedSecure((long) ' ');
        randomDataImpl6.reSeed();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[15, 11, 9, 0, 1, 8, 10, 14, 3]");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        double double8 = well19937c1.nextDouble();
        double double9 = well19937c1.nextDouble();
        well19937c1.setSeed((int) '4');
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int16 = hypergeometricDistribution15.getSampleSize();
        double double17 = hypergeometricDistribution15.getNumericalMean();
        int[] intArray19 = hypergeometricDistribution15.sample((int) '#');
        org.apache.commons.math3.random.Well19937c well19937c20 = new org.apache.commons.math3.random.Well19937c(intArray19);
        well19937c1.setSeed(intArray19);
        org.apache.commons.math3.random.Well19937c well19937c22 = new org.apache.commons.math3.random.Well19937c(intArray19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.639132984799512d + "'", double8 == 0.639132984799512d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.41292608781564977d + "'", double9 == 0.41292608781564977d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample(5);
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '4', 1773504001);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(2061458278, 0, (-348283319));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-348,283,319)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator((long) 22);
        double double10 = hypergeometricDistribution3.getNumericalMean();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl11 = hypergeometricDistribution3.randomData;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl11);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator((long) 22);
        double double10 = hypergeometricDistribution3.getNumericalMean();
        double double13 = hypergeometricDistribution3.cumulativeProbability((-2128545835), 33);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        int int11 = hypergeometricDistribution3.getPopulationSize();
        double double13 = hypergeometricDistribution3.upperCumulativeProbability(11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability((double) 0.27873123f, 21, 50);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        int int8 = hypergeometricDistribution4.getSampleSize();
        int int9 = hypergeometricDistribution4.sample();
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution4.random;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(randomGenerator10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 150, 326499095, (-19));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-19)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double6 = randomDataImpl0.nextGaussian((double) 100.00001f, 147.4131591025766d);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl7 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int12 = hypergeometricDistribution11.getSampleSize();
        int int13 = hypergeometricDistribution11.getSampleSize();
        int int14 = randomDataImpl7.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution11);
        int int15 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution11);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl16 = hypergeometricDistribution11.randomData;
        long long18 = randomDataImpl16.nextPoisson(0.0179783422034087d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 65.85287520353154d + "'", double6 == 65.85287520353154d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        randomDataImpl0.reSeed((long) 34);
        randomDataImpl0.reSeedSecure((long) (short) 1);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl5 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int10 = hypergeometricDistribution9.getSampleSize();
        int int11 = hypergeometricDistribution9.getSampleSize();
        int int12 = randomDataImpl5.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution9);
        boolean boolean13 = hypergeometricDistribution9.isSupportConnected();
        int int17 = hypergeometricDistribution9.solveInverseCumulativeProbability((double) 0.27873123f, 21, 50);
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution9);
        int int19 = hypergeometricDistribution9.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double10 = hypergeometricDistribution3.cumulativeProbability(0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator((long) (-1023));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        double double11 = randomDataImpl0.nextUniform(0.6927991497383688d, 99.95453823045537d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int16 = hypergeometricDistribution15.getSampleSize();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = hypergeometricDistribution15.getSupportUpperBound();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double21 = randomDataImpl0.nextT(98.14309588288239d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution25 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int26 = hypergeometricDistribution25.getSampleSize();
        double double27 = hypergeometricDistribution25.getNumericalMean();
        int int31 = hypergeometricDistribution25.solveInverseCumulativeProbability((double) 81L, 0, (int) (short) -1);
        int int32 = hypergeometricDistribution25.getSupportUpperBound();
        double double33 = hypergeometricDistribution25.calculateNumericalVariance();
        int int34 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution25);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-55.47231117902596d) + "'", double3 == (-55.47231117902596d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 14.6509757413903d + "'", double11 == 14.6509757413903d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0339408673559565d + "'", double21 == 1.0339408673559565d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        double double11 = hypergeometricDistribution3.cumulativeProbability(10);
        int int12 = hypergeometricDistribution3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution3.inverseCumulativeProbability(54.83867977767601d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 54.839 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 1, (int) (byte) 10, (int) (short) 0);
        double double11 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray13 = hypergeometricDistribution3.sample((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = hypergeometricDistribution3.sample((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        int int11 = hypergeometricDistribution4.solveInverseCumulativeProbability(7.158517489260594E43d, 0, 100);
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        double double14 = hypergeometricDistribution4.upperCumulativeProbability(0);
        double double15 = hypergeometricDistribution4.getNumericalMean();
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double11 = randomDataImpl8.nextGaussian(0.41292608781564977d, 1.6302946736944408d);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = randomDataImpl8.nextHypergeometric((int) ' ', (-2131563354), (-1442227129));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-2,131,563,354)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.05826610513485725d + "'", double11 == 0.05826610513485725d);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample(5);
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.5548245223302555d, (int) (byte) 0, 50);
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        int int11 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double6 = randomDataImpl0.nextGaussian((double) 100.00001f, 147.4131591025766d);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl7 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int12 = hypergeometricDistribution11.getSampleSize();
        int int13 = hypergeometricDistribution11.getSampleSize();
        int int14 = randomDataImpl7.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution11);
        int int15 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution11);
        double double18 = randomDataImpl0.nextUniform((-0.9999999943972036d), 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 120.03674050842962d + "'", double6 == 120.03674050842962d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.37457703540417386d) + "'", double18 == (-0.37457703540417386d));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample(5);
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.5548245223302555d, (int) (byte) 0, 50);
        int int10 = hypergeometricDistribution3.getSampleSize();
        double double12 = hypergeometricDistribution3.probability(14);
        int int13 = hypergeometricDistribution3.sample();
        int int15 = hypergeometricDistribution3.inverseCumulativeProbability(0.30972616291365784d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        double double11 = randomDataImpl0.nextUniform(0.6927991497383688d, 99.95453823045537d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int16 = hypergeometricDistribution15.getSampleSize();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = hypergeometricDistribution15.getSupportUpperBound();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double21 = randomDataImpl0.nextT(98.14309588288239d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = randomDataImpl0.nextHexString((-373153628));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: length (-373,153,628)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-10.307698503695931d) + "'", double3 == (-10.307698503695931d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 17.073981705136354d + "'", double11 == 17.073981705136354d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.5326117205381904d) + "'", double21 == (-0.5326117205381904d));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int14 = hypergeometricDistribution13.getSampleSize();
        int int15 = hypergeometricDistribution13.getSampleSize();
        double double16 = hypergeometricDistribution13.getNumericalVariance();
        int int17 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        double double18 = hypergeometricDistribution13.calculateNumericalVariance();
        double double20 = hypergeometricDistribution13.cumulativeProbability((-1912014094));
        int int21 = hypergeometricDistribution13.getSupportLowerBound();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 16.026145428851038d + "'", double3 == 16.026145428851038d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        int int11 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 11L, 0, (int) 'a');
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c8 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int10 = well19937c8.nextInt(100);
        byte[] byteArray11 = new byte[] {};
        well19937c8.nextBytes(byteArray11);
        well19937c1.nextBytes(byteArray11);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        int int16 = well19937c1.nextInt((int) (byte) 10);
        double double17 = well19937c1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution21 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 326499095, 580296006, (-232542925));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-232,542,925)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.1476125576400245d) + "'", double17 == (-1.1476125576400245d));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability(1.781955929620078E45d, (-308049809), 10);
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1);
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 462497761, 185244372, 722721355);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (722,721,355) must be less than or equal to population size (462,497,761)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        org.apache.commons.math3.random.RandomGenerator randomGenerator8 = hypergeometricDistribution3.random;
        boolean boolean9 = randomGenerator8.nextBoolean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(randomGenerator8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double10 = randomDataImpl0.nextGaussian((double) 100000L, 81.82697346282114d);
        double double13 = randomDataImpl0.nextGaussian((double) (-127), (double) 17);
        int int16 = randomDataImpl0.nextInt((int) (short) 1, 25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = randomDataImpl0.nextSecureHexString((-1912014094));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: length (-1,912,014,094)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100090.0296695773d + "'", double10 == 100090.0296695773d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-125.75215418234774d) + "'", double13 == (-125.75215418234774d));
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        int[] intArray10 = hypergeometricDistribution3.sample((int) '4');
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double5 = hypergeometricDistribution3.probability(0);
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(40L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution3.random;
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(randomGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        int int9 = randomDataImpl0.nextInt((int) (byte) 1, (int) (byte) 100);
        long long12 = randomDataImpl0.nextLong(15L, (long) 34);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution16 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double17 = hypergeometricDistribution16.getNumericalMean();
        int int18 = hypergeometricDistribution16.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = hypergeometricDistribution16.randomData;
        int int20 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution16);
        double double24 = randomDataImpl0.nextUniform((double) 18L, 168648.23930211947d, false);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.06565188659901d + "'", double3 == 100.06565188659901d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 24L + "'", long12 == 24L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double24 + "' != '" + 147955.7829956493d + "'", double24 == 147955.7829956493d);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        long long7 = well19937c1.nextLong();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator8 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        java.lang.String str10 = randomDataGenerator8.nextHexString(1);
        int int14 = randomDataGenerator8.nextHypergeometric(20, (int) (short) 1, 0);
        double double16 = randomDataGenerator8.nextT(3.5948663682587614E43d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-6656821606993036558L) + "'", long7 == (-6656821606993036558L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8" + "'", str10, "8");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-6.162082222696999E-10d) + "'", double16 == (-6.162082222696999E-10d));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        int int8 = hypergeometricDistribution4.getSampleSize();
        int int9 = hypergeometricDistribution4.sample();
        double double11 = hypergeometricDistribution4.probability(9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator((long) 22);
        double double11 = hypergeometricDistribution3.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistribution3.inverseCumulativeProbability(171.93089209504208d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 171.931 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long5 = randomDataImpl0.nextPoisson(14.154262241479262d);
        randomDataImpl0.reSeed((long) 'a');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution12 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int13 = hypergeometricDistribution12.getSampleSize();
        int int14 = hypergeometricDistribution12.getSampleSize();
        int int18 = hypergeometricDistribution12.solveInverseCumulativeProbability((double) 1, 1, 3);
        int int19 = hypergeometricDistribution12.getSupportUpperBound();
        int int20 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution12);
        double double21 = hypergeometricDistribution12.getNumericalMean();
        double double24 = hypergeometricDistribution12.cumulativeProbability(41, 245365937);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 74.23687447450641d + "'", double3 == 74.23687447450641d);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9L + "'", long5 == 9L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator7 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        randomDataGenerator7.reSeed();
        long long11 = randomDataGenerator7.nextSecureLong(1L, (long) 144);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = randomDataGenerator7.nextHypergeometric((-1453332173), (-1912423540), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1,453,332,173)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 112L + "'", long11 == 112L);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 1, (int) (byte) 10, (int) (short) 0);
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c(29);
        float float2 = well19937c1.nextFloat();
        org.apache.commons.math3.random.Well19937c well19937c4 = new org.apache.commons.math3.random.Well19937c(2061458278);
        int int5 = well19937c4.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double10 = hypergeometricDistribution9.getNumericalMean();
        int int11 = hypergeometricDistribution9.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl12 = hypergeometricDistribution9.randomData;
        randomDataImpl12.reSeedSecure();
        int[] intArray16 = randomDataImpl12.nextPermutation(17, 9);
        well19937c4.setSeed(intArray16);
        well19937c1.setSeed(intArray16);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.08720553f + "'", float2 == 0.08720553f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1628752109 + "'", int5 == 1628752109);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl12);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[13, 16, 15, 12, 6, 11, 4, 2, 9]");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(40L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution3.random;
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(randomGenerator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int14 = hypergeometricDistribution13.getSampleSize();
        int int15 = hypergeometricDistribution13.getSampleSize();
        double double16 = hypergeometricDistribution13.getNumericalVariance();
        int int17 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        double double18 = hypergeometricDistribution13.calculateNumericalVariance();
        int int22 = hypergeometricDistribution13.solveInverseCumulativeProbability((double) 72, (int) (short) 1, (int) (byte) -1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = hypergeometricDistribution13.random;
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 24.777684277581592d + "'", double3 == 24.777684277581592d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(randomGenerator23);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        double double7 = well19937c1.nextDouble();
        long long9 = well19937c1.nextLong((long) (byte) 100);
        double double10 = well19937c1.nextGaussian();
        org.apache.commons.math3.random.Well19937c well19937c12 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int14 = well19937c12.nextInt(100);
        well19937c12.setSeed(41);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl17 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c12);
        org.apache.commons.math3.random.Well19937c well19937c19 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int21 = well19937c19.nextInt(100);
        well19937c19.clear();
        int int23 = well19937c19.nextInt();
        long long24 = well19937c19.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c26 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int28 = well19937c26.nextInt(100);
        byte[] byteArray29 = new byte[] {};
        well19937c26.nextBytes(byteArray29);
        well19937c19.nextBytes(byteArray29);
        well19937c12.nextBytes(byteArray29);
        org.apache.commons.math3.random.Well19937c well19937c34 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int36 = well19937c34.nextInt(100);
        well19937c34.clear();
        int int38 = well19937c34.nextInt();
        well19937c34.setSeed((long) 4);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution44 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int45 = hypergeometricDistribution44.getSampleSize();
        double double46 = hypergeometricDistribution44.getNumericalMean();
        int[] intArray48 = hypergeometricDistribution44.sample((int) '#');
        well19937c34.setSeed(intArray48);
        well19937c12.setSeed(intArray48);
        well19937c1.setSeed(intArray48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8719745671619918d + "'", double7 == 0.8719745671619918d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.9372798639690711d) + "'", double10 == (-0.9372798639690711d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 50 + "'", int21 == 50);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1737377827) + "'", int23 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 8853895889823578499L + "'", long24 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50 + "'", int28 == 50);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 50 + "'", int36 == 50);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1737377827) + "'", int38 == (-1737377827));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int7 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double6 = hypergeometricDistribution3.cumulativeProbability(22);
        int[] intArray8 = hypergeometricDistribution3.sample(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.cumulativeProbability(21);
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1, 1);
        int int12 = hypergeometricDistribution3.sample();
        double double15 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10, 83);
        int int16 = hypergeometricDistribution3.getSupportUpperBound();
        int[] intArray18 = hypergeometricDistribution3.sample(62);
        int int22 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) (-137496377), 30, 31);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 31 + "'", int22 == 31);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int15 = hypergeometricDistribution14.getSampleSize();
        int int16 = hypergeometricDistribution14.getSampleSize();
        int int17 = randomDataImpl10.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double18 = hypergeometricDistribution14.getNumericalVariance();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double22 = randomDataImpl0.nextGamma(1.0000000000000002d, (double) 4);
        randomDataImpl0.reSeedSecure();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.2743389352386943E44d + "'", double5 == 1.2743389352386943E44d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.5737347572038642d + "'", double22 == 0.5737347572038642d);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double5 = hypergeometricDistribution3.probability(0);
        double double7 = hypergeometricDistribution3.cumulativeProbability((-12));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        long long6 = randomDataImpl0.nextLong(0L, 100L);
        java.lang.String str8 = randomDataImpl0.nextSecureHexString((int) (short) 1);
        long long11 = randomDataImpl0.nextSecureLong((long) 10, (long) 41);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = randomDataImpl0.nextHypergeometric(326499095, (-367373443), (-398495072));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-367,373,443)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.398906842433594E43d) + "'", double3 == (-1.398906842433594E43d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5L + "'", long6 == 5L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2" + "'", str8, "2");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11L + "'", long11 == 11L);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        int int9 = hypergeometricDistribution3.getSampleSize();
        int int10 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl17 = hypergeometricDistribution13.randomData;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = randomDataImpl17.nextLong((long) 1549912060, (-346955678L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1,549,912,060) must be strictly less than upper bound (-346,955,678)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.1833849563020787E44d + "'", double5 == 1.1833849563020787E44d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl17);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        double double11 = randomDataImpl0.nextUniform(0.6927991497383688d, 99.95453823045537d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int16 = hypergeometricDistribution15.getSampleSize();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = hypergeometricDistribution15.getSupportUpperBound();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution23 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int24 = hypergeometricDistribution23.getSampleSize();
        int int25 = hypergeometricDistribution23.getSampleSize();
        double double26 = hypergeometricDistribution23.getNumericalVariance();
        double double28 = hypergeometricDistribution23.cumulativeProbability((int) (short) 0);
        double double30 = hypergeometricDistribution23.cumulativeProbability(0);
        int int31 = hypergeometricDistribution23.getSupportLowerBound();
        double double32 = hypergeometricDistribution23.getNumericalVariance();
        int int33 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution23);
        double double36 = randomDataImpl0.nextWeibull(39.88334845133405d, 3.666591373806148d);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.9637848728941094d) + "'", double3 == (-0.9637848728941094d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 88.99997871072217d + "'", double11 == 88.99997871072217d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.5685580453697145d + "'", double36 == 3.5685580453697145d);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int14 = hypergeometricDistribution13.getSampleSize();
        int int15 = hypergeometricDistribution13.getSampleSize();
        double double16 = hypergeometricDistribution13.getNumericalVariance();
        int int17 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        double double18 = hypergeometricDistribution13.calculateNumericalVariance();
        int int22 = hypergeometricDistribution13.solveInverseCumulativeProbability((double) 72, (int) (short) 1, (int) (byte) -1);
        double double23 = hypergeometricDistribution13.getNumericalVariance();
        double double25 = hypergeometricDistribution13.cumulativeProbability(2);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 105.80712661491582d + "'", double3 == 105.80712661491582d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator((long) 22);
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        double double11 = hypergeometricDistribution3.calculateNumericalVariance();
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = hypergeometricDistribution3.random;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = hypergeometricDistribution3.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(randomGenerator13);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        int int9 = randomDataImpl6.nextSecureInt((int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = randomDataImpl6.nextLong((long) 2054174380, 33L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (2,054,174,380) must be strictly less than upper bound (33)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.cumulativeProbability((int) '4', 389817062);
        hypergeometricDistribution3.reseedRandomGenerator((long) (-456672586));
        int int13 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(59L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.getNumericalMean();
        double double12 = hypergeometricDistribution3.probability((-549865085));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((long) 3);
        org.apache.commons.math3.random.Well19937c well19937c3 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int5 = well19937c3.nextInt(100);
        well19937c3.setSeed(41);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c3);
        org.apache.commons.math3.random.Well19937c well19937c10 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int12 = well19937c10.nextInt(100);
        well19937c10.clear();
        int int14 = well19937c10.nextInt();
        long long15 = well19937c10.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c17 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int19 = well19937c17.nextInt(100);
        byte[] byteArray20 = new byte[] {};
        well19937c17.nextBytes(byteArray20);
        well19937c10.nextBytes(byteArray20);
        well19937c3.nextBytes(byteArray20);
        org.apache.commons.math3.random.Well19937c well19937c25 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int27 = well19937c25.nextInt(100);
        well19937c25.clear();
        int int29 = well19937c25.nextInt();
        well19937c25.setSeed((long) 4);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution35 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int36 = hypergeometricDistribution35.getSampleSize();
        double double37 = hypergeometricDistribution35.getNumericalMean();
        int[] intArray39 = hypergeometricDistribution35.sample((int) '#');
        well19937c25.setSeed(intArray39);
        well19937c3.setSeed(intArray39);
        well19937c1.setSeed(intArray39);
        org.apache.commons.math3.random.Well19937c well19937c44 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int46 = well19937c44.nextInt(100);
        byte[] byteArray47 = new byte[] {};
        well19937c44.nextBytes(byteArray47);
        well19937c44.setSeed((int) (byte) 1);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl51 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c44);
        boolean boolean52 = well19937c44.nextBoolean();
        long long54 = well19937c44.nextLong((long) 11);
        org.apache.commons.math3.random.Well19937c well19937c56 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int58 = well19937c56.nextInt(100);
        byte[] byteArray59 = new byte[] {};
        well19937c56.nextBytes(byteArray59);
        well19937c56.setSeed((int) (byte) 1);
        float float63 = well19937c56.nextFloat();
        org.apache.commons.math3.random.Well19937c well19937c65 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int67 = well19937c65.nextInt(100);
        well19937c65.clear();
        int int70 = well19937c65.nextInt(100);
        byte[] byteArray73 = new byte[] { (byte) 0, (byte) 1 };
        well19937c65.nextBytes(byteArray73);
        well19937c56.nextBytes(byteArray73);
        well19937c44.nextBytes(byteArray73);
        well19937c1.nextBytes(byteArray73);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1737377827) + "'", int14 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 8853895889823578499L + "'", long15 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 50 + "'", int19 == 50);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 50 + "'", int27 == 50);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1737377827) + "'", int29 == (-1737377827));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 50 + "'", int46 == 50);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L + "'", long54 == 10L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 50 + "'", int58 == 50);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.27873123f + "'", float63 == 0.27873123f);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 50 + "'", int67 == 50);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 34 + "'", int70 == 34);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[104, -4]");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        org.apache.commons.math3.random.RandomGenerator randomGenerator6 = hypergeometricDistribution3.random;
        randomGenerator6.setSeed(4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(randomGenerator6);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 1, 1, 3);
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = hypergeometricDistribution4.sample((-2128545835));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-2,128,545,835)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(149035837, (-1434923033), 1454258676);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1,434,923,033)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.cumulativeProbability(21);
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1, 1);
        double double13 = hypergeometricDistribution3.probability(41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = hypergeometricDistribution3.random;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(randomGenerator14);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.inverseCumulativeProbability((-0.0d));
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((-96398574));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.cumulativeProbability(21);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = hypergeometricDistribution3.sample((-722721355));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-722,721,355)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1773504001, 722721355, 4);
        int int4 = hypergeometricDistribution3.getSupportUpperBound();
        double double6 = hypergeometricDistribution3.cumulativeProbability(10);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long5 = randomDataImpl0.nextPoisson(14.154262241479262d);
        randomDataImpl0.reSeed((long) 'a');
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int12 = hypergeometricDistribution11.getSampleSize();
        int int13 = hypergeometricDistribution11.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution11.calculateNumericalVariance();
        double double17 = hypergeometricDistribution11.cumulativeProbability(34, 100);
        double double19 = hypergeometricDistribution11.cumulativeProbability(10);
        int int20 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution11);
        int int21 = hypergeometricDistribution11.getPopulationSize();
        int int22 = hypergeometricDistribution11.getSupportUpperBound();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 106.33493953225195d + "'", double3 == 106.33493953225195d);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample(5);
        double double7 = hypergeometricDistribution3.cumulativeProbability(22);
        int[] intArray9 = hypergeometricDistribution3.sample((int) ' ');
        double double10 = hypergeometricDistribution3.calculateNumericalVariance();
        int int11 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        hypergeometricDistribution3.reseedRandomGenerator((long) 1903992249);
        int int12 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        int int7 = hypergeometricDistribution3.getSampleSize();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = hypergeometricDistribution3.randomData;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl8);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c8 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int10 = well19937c8.nextInt(100);
        byte[] byteArray11 = new byte[] {};
        well19937c8.nextBytes(byteArray11);
        well19937c1.nextBytes(byteArray11);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        long long15 = well19937c1.nextLong();
        well19937c1.setSeed(42L);
        well19937c1.setSeed((-445500633));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution23 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, (-34615376), 589724587, 56);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-34,615,376)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-8212038001447565823L) + "'", long15 == (-8212038001447565823L));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        double double8 = well19937c1.nextDouble();
        double double9 = well19937c1.nextDouble();
        well19937c1.setSeed((int) '4');
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int16 = hypergeometricDistribution15.getSampleSize();
        double double17 = hypergeometricDistribution15.getNumericalMean();
        int[] intArray19 = hypergeometricDistribution15.sample((int) '#');
        org.apache.commons.math3.random.Well19937c well19937c20 = new org.apache.commons.math3.random.Well19937c(intArray19);
        well19937c1.setSeed(intArray19);
        well19937c1.setSeed(74L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.639132984799512d + "'", double8 == 0.639132984799512d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.41292608781564977d + "'", double9 == 0.41292608781564977d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c8 = new org.apache.commons.math3.random.Well19937c(2061458278);
        int int9 = well19937c8.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double14 = hypergeometricDistribution13.getNumericalMean();
        int int15 = hypergeometricDistribution13.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl16 = hypergeometricDistribution13.randomData;
        randomDataImpl16.reSeedSecure();
        int[] intArray20 = randomDataImpl16.nextPermutation(17, 9);
        well19937c8.setSeed(intArray20);
        well19937c1.setSeed(intArray20);
        long long24 = well19937c1.nextLong(90L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1628752109 + "'", int9 == 1628752109);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl16);
        org.junit.Assert.assertNotNull(intArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[2, 11, 0, 10, 13, 4, 12, 3, 5]");
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 60L + "'", long24 == 60L);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextSecureHexString(10);
        double double8 = randomDataImpl0.nextBeta(87.2781777232462d, 92.52126017343087d);
        int int12 = randomDataImpl0.nextHypergeometric((int) '4', 0, 22);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = randomDataImpl0.nextUniform(89.50906741103047d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (89.509) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.2663771264909413E43d + "'", double3 == 1.2663771264909413E43d);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4da58ddde9" + "'", str5, "4da58ddde9");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4687700747902739d + "'", double8 == 0.4687700747902739d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl17 = hypergeometricDistribution13.randomData;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = randomDataImpl17.nextCauchy((double) 65307394L, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: scale (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.887271516759012E43d + "'", double5 == 1.887271516759012E43d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl17);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        java.lang.String str7 = randomDataImpl0.nextHexString(1);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int12 = hypergeometricDistribution11.getSampleSize();
        int int13 = hypergeometricDistribution11.getSampleSize();
        double double14 = hypergeometricDistribution11.getNumericalVariance();
        double double16 = hypergeometricDistribution11.cumulativeProbability((int) (short) 0);
        int int17 = hypergeometricDistribution11.getSupportLowerBound();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution11);
        int int19 = hypergeometricDistribution11.getSupportUpperBound();
        int int20 = hypergeometricDistribution11.getNumberOfSuccesses();
        int int24 = hypergeometricDistribution11.solveInverseCumulativeProbability((double) (-368761393), 1773504001, 274978439);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl25 = hypergeometricDistribution11.randomData;
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.762267376867377E43d + "'", double5 == 4.762267376867377E43d);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 274978439 + "'", int24 == 274978439);
        org.junit.Assert.assertNotNull(randomDataImpl25);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(245365937, 2, (-1434923033));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1,434,923,033)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability((double) 0.27873123f, 21, 50);
        hypergeometricDistribution4.reseedRandomGenerator(0L);
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) (-2272559751474214079L), 33, (int) (byte) 1);
        double double14 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        float float7 = well19937c1.nextFloat();
        double double8 = well19937c1.nextDouble();
        well19937c1.clear();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int19 = hypergeometricDistribution13.solveInverseCumulativeProbability(0.5548245223302555d, (int) (byte) 0, 50);
        int int20 = hypergeometricDistribution13.getSampleSize();
        int[] intArray22 = hypergeometricDistribution13.sample((int) '4');
        well19937c1.setSeed(intArray22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.639133f + "'", float7 == 0.639133f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5548245223302555d + "'", double8 == 0.5548245223302555d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        int int6 = randomDataImpl0.nextInt(63, 879876257);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = randomDataImpl0.nextHypergeometric((-308049809), (-373153628), 464787630);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-308,049,809)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.055886967616804E42d) + "'", double3 == (-3.055886967616804E42d));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 728561944 + "'", int6 == 728561944);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 81L, 0, (int) (short) -1);
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        int int14 = hypergeometricDistribution3.solveInverseCumulativeProbability(4.5079377088467325d, (int) (byte) 1, 1628752109);
        double double15 = hypergeometricDistribution3.getNumericalVariance();
        double double16 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1628752109 + "'", int14 == 1628752109);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential(46.00580982269494d);
        double double8 = randomDataImpl0.nextGamma((double) 'a', 1.6629088874119807E43d);
        java.lang.String str10 = randomDataImpl0.nextHexString((int) (short) 100);
        int int14 = randomDataImpl0.nextHypergeometric(1773504001, 69, 6);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 90.71800294290543d + "'", double3 == 90.71800294290543d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 19.997785143489697d + "'", double5 == 19.997785143489697d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.3994605459626481E45d + "'", double8 == 1.3994605459626481E45d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "65ef235b69f65e38e95f4e7245995789585ab8deb6749e1e257bcecbbf010328d4733a225f9de9af3b74e3a703491672506d" + "'", str10, "65ef235b69f65e38e95f4e7245995789585ab8deb6749e1e257bcecbbf010328d4733a225f9de9af3b74e3a703491672506d");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        int int8 = well19937c1.nextInt(50);
        long long9 = well19937c1.nextLong();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int15 = hypergeometricDistribution14.getSampleSize();
        double double16 = hypergeometricDistribution14.getNumericalMean();
        int int17 = hypergeometricDistribution14.sample();
        double double18 = hypergeometricDistribution14.getNumericalVariance();
        hypergeometricDistribution14.reseedRandomGenerator(22L);
        int int21 = hypergeometricDistribution14.sample();
        double double22 = hypergeometricDistribution14.getNumericalVariance();
        int int23 = hypergeometricDistribution14.sample();
        hypergeometricDistribution14.reseedRandomGenerator(0L);
        int int26 = randomDataImpl10.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double29 = randomDataImpl10.nextUniform(0.0d, 356.62852556552286d);
        long long31 = randomDataImpl10.nextPoisson(3.1415924938621096d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-6656821606993036558L) + "'", long9 == (-6656821606993036558L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 144.58388785333497d + "'", double29 == 144.58388785333497d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 4L + "'", long31 == 4L);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator(22L);
        int int10 = hypergeometricDistribution3.sample();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        int int12 = hypergeometricDistribution3.sample();
        double double13 = hypergeometricDistribution3.calculateNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = hypergeometricDistribution3.random;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(randomGenerator14);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = hypergeometricDistribution3.cumulativeProbability(0, (-2147483648));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0) must be less than or equal to upper endpoint (-2,147,483,648)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        org.apache.commons.math3.random.Well19937c well19937c7 = new org.apache.commons.math3.random.Well19937c((int) ' ');
        org.apache.commons.math3.random.Well19937c well19937c9 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int11 = well19937c9.nextInt(100);
        well19937c9.clear();
        int int13 = well19937c9.nextInt();
        long long14 = well19937c9.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c16 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int18 = well19937c16.nextInt(100);
        byte[] byteArray19 = new byte[] {};
        well19937c16.nextBytes(byteArray19);
        well19937c9.nextBytes(byteArray19);
        int[] intArray23 = new int[] { 50 };
        well19937c9.setSeed(intArray23);
        well19937c7.setSeed(intArray23);
        well19937c1.setSeed(intArray23);
        org.apache.commons.math3.random.Well19937c well19937c27 = new org.apache.commons.math3.random.Well19937c(intArray23);
        org.apache.commons.math3.random.Well19937c well19937c29 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int31 = well19937c29.nextInt(100);
        well19937c29.clear();
        int int33 = well19937c29.nextInt();
        long long34 = well19937c29.nextLong();
        float float35 = well19937c29.nextFloat();
        int int37 = well19937c29.nextInt((int) (short) 1);
        well19937c29.setSeed((int) (byte) -1);
        org.apache.commons.math3.random.Well19937c well19937c41 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int43 = well19937c41.nextInt(100);
        well19937c41.clear();
        int int45 = well19937c41.nextInt();
        long long46 = well19937c41.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c48 = new org.apache.commons.math3.random.Well19937c(2061458278);
        int int49 = well19937c48.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution53 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double54 = hypergeometricDistribution53.getNumericalMean();
        int int55 = hypergeometricDistribution53.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl56 = hypergeometricDistribution53.randomData;
        randomDataImpl56.reSeedSecure();
        int[] intArray60 = randomDataImpl56.nextPermutation(17, 9);
        well19937c48.setSeed(intArray60);
        well19937c41.setSeed(intArray60);
        org.apache.commons.math3.random.Well19937c well19937c63 = new org.apache.commons.math3.random.Well19937c(intArray60);
        well19937c29.setSeed(intArray60);
        well19937c27.setSeed(intArray60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1737377827) + "'", int13 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 8853895889823578499L + "'", long14 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[50]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 50 + "'", int31 == 50);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1737377827) + "'", int33 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 8853895889823578499L + "'", long34 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.639133f + "'", float35 == 0.639133f);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 50 + "'", int43 == 50);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1737377827) + "'", int45 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 8853895889823578499L + "'", long46 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1628752109 + "'", int49 == 1628752109);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl56);
        org.junit.Assert.assertNotNull(intArray60);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[16, 10, 13, 11, 1, 12, 9, 5, 14]");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistribution4.cumulativeProbability(72, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (72) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        float float7 = well19937c1.nextFloat();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray13 = hypergeometricDistribution11.sample(5);
        well19937c1.setSeed(intArray13);
        well19937c1.setSeed(4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution20 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 398073126, (-400875175), (-118603794));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-400,875,175)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.639133f + "'", float7 == 0.639133f);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        long long7 = well19937c1.nextLong();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator8 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        java.lang.String str10 = randomDataGenerator8.nextHexString(1);
        int int14 = randomDataGenerator8.nextHypergeometric(20, (int) (short) 1, 0);
        randomDataGenerator8.reSeed();
        double double18 = randomDataGenerator8.nextBeta(93.67657572646016d, 19.092245049779375d);
        int int21 = randomDataGenerator8.nextSecureInt(144, 1773504001);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-6656821606993036558L) + "'", long7 == (-6656821606993036558L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8" + "'", str10, "8");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.8722146594394358d + "'", double18 == 0.8722146594394358d);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1359471183 + "'", int21 == 1359471183);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c8 = new org.apache.commons.math3.random.Well19937c(2061458278);
        int int9 = well19937c8.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double14 = hypergeometricDistribution13.getNumericalMean();
        int int15 = hypergeometricDistribution13.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl16 = hypergeometricDistribution13.randomData;
        randomDataImpl16.reSeedSecure();
        int[] intArray20 = randomDataImpl16.nextPermutation(17, 9);
        well19937c8.setSeed(intArray20);
        well19937c1.setSeed(intArray20);
        well19937c1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1628752109 + "'", int9 == 1628752109);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl16);
        org.junit.Assert.assertNotNull(intArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[12, 16, 7, 4, 10, 14, 13, 11, 1]");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        randomDataImpl6.reSeedSecure();
        int[] intArray10 = randomDataImpl6.nextPermutation(17, 9);
        int int13 = randomDataImpl6.nextInt((-1434923033), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9, 15, 14, 6, 13, 2, 1, 11, 8]");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-107062440) + "'", int13 == (-107062440));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        randomDataImpl6.reSeedSecure();
        randomDataImpl6.reSeed();
        randomDataImpl6.reSeed((long) (-308049809));
        randomDataImpl6.reSeedSecure((long) (-459835946));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        long long6 = well19937c1.nextLong();
        double double7 = well19937c1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, (-448112417), (-2131563354), 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-448,112,417)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.639132984799512d + "'", double7 == 0.639132984799512d);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        randomDataImpl0.reSeed((long) 34);
        randomDataImpl0.reSeedSecure((long) (short) 1);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl5 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int10 = hypergeometricDistribution9.getSampleSize();
        int int11 = hypergeometricDistribution9.getSampleSize();
        int int12 = randomDataImpl5.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution9);
        boolean boolean13 = hypergeometricDistribution9.isSupportConnected();
        int int17 = hypergeometricDistribution9.solveInverseCumulativeProbability((double) 0.27873123f, 21, 50);
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution9);
        java.lang.String str20 = randomDataImpl0.nextSecureHexString(14);
        double double23 = randomDataImpl0.nextGaussian(23.297723335581278d, 214.86343455337808d);
        int int26 = randomDataImpl0.nextSecureInt(26, 72);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "13f7e8e70408e3" + "'", str20, "13f7e8e70408e3");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 77.29348498266566d + "'", double23 == 77.29348498266566d);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 55 + "'", int26 == 55);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        int int11 = hypergeometricDistribution4.solveInverseCumulativeProbability(7.158517489260594E43d, 0, 100);
        hypergeometricDistribution4.reseedRandomGenerator((long) (-1912014094));
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        double double17 = hypergeometricDistribution4.upperCumulativeProbability((-2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, 0, 16);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl4 = hypergeometricDistribution3.randomData;
        org.junit.Assert.assertNotNull(randomDataImpl4);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistribution3.cumulativeProbability(464787630, (-727130892));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (464,787,630) must be less than or equal to upper endpoint (-727,130,892)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.cumulativeProbability(21);
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1, 1);
        double double13 = hypergeometricDistribution3.probability(41);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = hypergeometricDistribution3.randomData;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = randomDataImpl14.nextWeibull(0.0d, 62.7966412849855d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: shape (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl14);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        double double11 = hypergeometricDistribution3.cumulativeProbability(10);
        double double13 = hypergeometricDistribution3.probability(4);
        int int14 = hypergeometricDistribution3.getSampleSize();
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = hypergeometricDistribution3.random;
        boolean boolean16 = hypergeometricDistribution3.isSupportConnected();
        double double17 = hypergeometricDistribution3.calculateNumericalVariance();
        int[] intArray19 = hypergeometricDistribution3.sample((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(randomGenerator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.sample();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        double double13 = hypergeometricDistribution3.cumulativeProbability(0);
        double double14 = hypergeometricDistribution3.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = hypergeometricDistribution3.sample((-1347491339));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1,347,491,339)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        randomDataImpl6.reSeedSecure();
        int[] intArray10 = randomDataImpl6.nextPermutation(17, 9);
        randomDataImpl6.reSeedSecure((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            randomDataImpl6.setSecureAlgorithm("65ef235b69f65e38e95f4e7245995789585ab8deb6749e1e257bcecbbf010328d4733a225f9de9af3b74e3a703491672506d", "6a2d02fef1807477a0febf2a131cda0ebd0d810fe85159bf16b3b339026a0078e79eba1ac3233830547993102b197d809");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: 6a2d02fef1807477a0febf2a131cda0ebd0d810fe85159bf16b3b339026a0078e79eba1ac3233830547993102b197d809");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[14, 16, 3, 6, 2, 0, 5, 7, 9]");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 1, 1, 3);
        double double11 = hypergeometricDistribution3.probability(24);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample(5);
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.5548245223302555d, (int) (byte) 0, 50);
        int int10 = hypergeometricDistribution3.getSampleSize();
        double double13 = hypergeometricDistribution3.cumulativeProbability(83, 667571320);
        double double14 = hypergeometricDistribution3.getNumericalMean();
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = hypergeometricDistribution3.random;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(randomGenerator15);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        double double11 = randomDataImpl0.nextUniform(0.6927991497383688d, 99.95453823045537d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int16 = hypergeometricDistribution15.getSampleSize();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = hypergeometricDistribution15.getSupportUpperBound();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double21 = randomDataImpl0.nextT(98.14309588288239d);
        randomDataImpl0.reSeed();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = randomDataImpl0.nextBinomial((-1), 9.089358524055442d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of trials (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 29.532322957614433d + "'", double3 == 29.532322957614433d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.57506952598897d + "'", double11 == 52.57506952598897d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.15788204186990173d) + "'", double21 == (-0.15788204186990173d));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) (-2272559751474214079L), 33, (int) (byte) 1);
        double double15 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double17 = hypergeometricDistribution3.cumulativeProbability((-459835946));
        int int18 = hypergeometricDistribution3.getSupportLowerBound();
        double double19 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential(46.00580982269494d);
        double double8 = randomDataImpl0.nextGaussian(2.718281828459045d, 76.66964204037053d);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = randomDataImpl0.nextHypergeometric(2054174380, 274978439, (-456672586));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-456,672,586)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.032455000527442d + "'", double3 == 7.032455000527442d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 43.32660797191094d + "'", double5 == 43.32660797191094d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 136.3366615538651d + "'", double8 == 136.3366615538651d);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator7 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        randomDataGenerator7.reSeed();
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = randomDataGenerator7.getRandomGenerator();
        double double13 = randomDataGenerator7.nextUniform(10.0d, 11013.232874703393d, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = randomDataGenerator7.getRandomGenerator();
        int int17 = randomDataGenerator7.nextPascal(83, 0.0d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = randomDataGenerator7.getRandomGenerator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution22 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator18, 3, 28, (-21661068));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-21,661,068)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertNotNull(randomGenerator9);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 9273.523859420375d + "'", double13 == 9273.523859420375d);
        org.junit.Assert.assertNotNull(randomGenerator14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(randomGenerator18);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        randomDataImpl0.reSeed();
        int int4 = randomDataImpl0.nextSecureInt((-1737377827), (int) ' ');
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution8 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int9 = hypergeometricDistribution8.getSampleSize();
        double double10 = hypergeometricDistribution8.getNumericalMean();
        boolean boolean11 = hypergeometricDistribution8.isSupportConnected();
        double double12 = hypergeometricDistribution8.getNumericalVariance();
        int int13 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution8);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = randomDataImpl0.nextPascal((-1912423540), 55.34819516080636d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of successes (-1,912,423,540)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-208939937) + "'", int4 == (-208939937));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        randomDataImpl0.reSeed((long) 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability((double) 0.27873123f, 21, 50);
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.sample();
        double double16 = hypergeometricDistribution4.cumulativeProbability((-1560553043));
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        java.lang.String str7 = randomDataImpl0.nextHexString(1);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int12 = hypergeometricDistribution11.getSampleSize();
        int int13 = hypergeometricDistribution11.getSampleSize();
        double double14 = hypergeometricDistribution11.getNumericalVariance();
        double double16 = hypergeometricDistribution11.cumulativeProbability((int) (short) 0);
        int int17 = hypergeometricDistribution11.getSupportLowerBound();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution11);
        int int19 = hypergeometricDistribution11.getSupportUpperBound();
        int int20 = hypergeometricDistribution11.getNumberOfSuccesses();
        int int21 = hypergeometricDistribution11.getSupportLowerBound();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.3972843613746558E44d + "'", double5 == 1.3972843613746558E44d);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "b" + "'", str7, "b");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample(5);
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.5548245223302555d, (int) (byte) 0, 50);
        int int10 = hypergeometricDistribution3.getSampleSize();
        double double12 = hypergeometricDistribution3.probability(14);
        double double15 = hypergeometricDistribution3.cumulativeProbability(16, 986341191);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 10);
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        long long7 = well19937c1.nextLong();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator8 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        java.lang.String str10 = randomDataGenerator8.nextHexString(1);
        int int14 = randomDataGenerator8.nextHypergeometric(20, (int) (short) 1, 0);
        randomDataGenerator8.reSeed();
        double double17 = randomDataGenerator8.nextExponential(0.4462200678093941d);
        randomDataGenerator8.reSeed((long) 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-6656821606993036558L) + "'", long7 == (-6656821606993036558L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8" + "'", str10, "8");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.15839676407345937d + "'", double17 == 0.15839676407345937d);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator((long) 22);
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        double double13 = hypergeometricDistribution3.cumulativeProbability(667571320, 2147483647);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator((long) 22);
        double double11 = hypergeometricDistribution3.cumulativeProbability(25);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution3.sample((-445500633));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-445,500,633)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        int int9 = randomDataImpl0.nextInt((int) (byte) 1, (int) (byte) 100);
        long long12 = randomDataImpl0.nextLong(15L, (long) 34);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution16 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double17 = hypergeometricDistribution16.getNumericalMean();
        int int18 = hypergeometricDistribution16.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = hypergeometricDistribution16.randomData;
        int int20 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution16);
        double double23 = randomDataImpl0.nextF((double) 1.56055309E9f, 8.407469190086174E43d);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.932199017793593d + "'", double3 == 12.932199017793593d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 33L + "'", long12 == 33L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.3678794460214559d + "'", double23 == 0.3678794460214559d);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.getSampleSize();
        double double7 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long5 = randomDataImpl0.nextPoisson(14.154262241479262d);
        randomDataImpl0.reSeed((long) 'a');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution12 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int13 = hypergeometricDistribution12.getSampleSize();
        double double14 = hypergeometricDistribution12.getNumericalMean();
        boolean boolean15 = hypergeometricDistribution12.isSupportConnected();
        hypergeometricDistribution12.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = hypergeometricDistribution12.random;
        double double19 = hypergeometricDistribution12.getNumericalVariance();
        int int20 = hypergeometricDistribution12.getPopulationSize();
        int int21 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution12);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 76.4907669189673d + "'", double3 == 76.4907669189673d);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 17L + "'", long5 == 17L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double5 = hypergeometricDistribution3.getNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        double double9 = randomDataImpl6.nextGamma(0.5325910430705463d, 1.5441225782660087E45d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl6);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.0102539288262086E44d + "'", double9 == 5.0102539288262086E44d);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double10 = randomDataImpl0.nextGaussian((double) 100000L, 81.82697346282114d);
        double double13 = randomDataImpl0.nextGaussian((double) (-127), (double) 17);
        double double16 = randomDataImpl0.nextGaussian(137.17933990376864d, 75.89277577514443d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99976.16331135783d + "'", double10 == 99976.16331135783d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-147.32425613075605d) + "'", double13 == (-147.32425613075605d));
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 154.0253639689757d + "'", double16 == 154.0253639689757d);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c8 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int10 = well19937c8.nextInt(100);
        byte[] byteArray11 = new byte[] {};
        well19937c8.nextBytes(byteArray11);
        well19937c1.nextBytes(byteArray11);
        int[] intArray15 = new int[] { 50 };
        well19937c1.setSeed(intArray15);
        org.apache.commons.math3.random.Well19937c well19937c17 = new org.apache.commons.math3.random.Well19937c(intArray15);
        org.apache.commons.math3.random.Well19937c well19937c18 = new org.apache.commons.math3.random.Well19937c(intArray15);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution22 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int23 = hypergeometricDistribution22.getSampleSize();
        double double24 = hypergeometricDistribution22.getNumericalMean();
        int[] intArray26 = hypergeometricDistribution22.sample((int) '#');
        int int27 = hypergeometricDistribution22.getSupportLowerBound();
        int[] intArray29 = hypergeometricDistribution22.sample((int) '4');
        well19937c18.setSeed(intArray29);
        org.apache.commons.math3.random.Well19937c well19937c32 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int34 = well19937c32.nextInt(100);
        well19937c32.clear();
        int int36 = well19937c32.nextInt();
        long long37 = well19937c32.nextLong();
        float float38 = well19937c32.nextFloat();
        int int40 = well19937c32.nextInt((int) (short) 1);
        well19937c32.setSeed((int) (byte) -1);
        org.apache.commons.math3.random.Well19937c well19937c44 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int46 = well19937c44.nextInt(100);
        well19937c44.clear();
        int int48 = well19937c44.nextInt();
        long long49 = well19937c44.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c51 = new org.apache.commons.math3.random.Well19937c(2061458278);
        int int52 = well19937c51.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution56 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double57 = hypergeometricDistribution56.getNumericalMean();
        int int58 = hypergeometricDistribution56.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl59 = hypergeometricDistribution56.randomData;
        randomDataImpl59.reSeedSecure();
        int[] intArray63 = randomDataImpl59.nextPermutation(17, 9);
        well19937c51.setSeed(intArray63);
        well19937c44.setSeed(intArray63);
        org.apache.commons.math3.random.Well19937c well19937c66 = new org.apache.commons.math3.random.Well19937c(intArray63);
        well19937c32.setSeed(intArray63);
        well19937c18.setSeed(intArray63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[50]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 50 + "'", int34 == 50);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1737377827) + "'", int36 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 8853895889823578499L + "'", long37 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.639133f + "'", float38 == 0.639133f);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 50 + "'", int46 == 50);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1737377827) + "'", int48 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 8853895889823578499L + "'", long49 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1628752109 + "'", int52 == 1628752109);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl59);
        org.junit.Assert.assertNotNull(intArray63);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[3, 0, 8, 14, 12, 5, 1, 11, 4]");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c8 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int10 = well19937c8.nextInt(100);
        byte[] byteArray11 = new byte[] {};
        well19937c8.nextBytes(byteArray11);
        well19937c1.nextBytes(byteArray11);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        int int16 = well19937c1.nextInt((int) (byte) 10);
        double double17 = well19937c1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution21 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, (int) '4', 1454258676, (-549865085));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-549,865,085)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.1476125576400245d) + "'", double17 == (-1.1476125576400245d));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential((double) ' ');
        randomDataImpl0.reSeed();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution10 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int11 = hypergeometricDistribution10.getSampleSize();
        double double12 = hypergeometricDistribution10.getNumericalMean();
        boolean boolean13 = hypergeometricDistribution10.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = hypergeometricDistribution10.random;
        double double15 = hypergeometricDistribution10.getNumericalMean();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution10);
        int int19 = randomDataImpl0.nextSecureInt((-2147483648), 7);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.377179782949497d + "'", double5 == 10.377179782949497d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(randomGenerator14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-310085295) + "'", int19 == (-310085295));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        hypergeometricDistribution3.reseedRandomGenerator(8261713729207529129L);
        int int8 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        double double10 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        double double7 = well19937c1.nextDouble();
        long long9 = well19937c1.nextLong((long) (byte) 100);
        long long10 = well19937c1.nextLong();
        int int11 = well19937c1.nextInt();
        well19937c1.setSeed(86L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int18 = hypergeometricDistribution17.getSampleSize();
        int int19 = hypergeometricDistribution17.getNumberOfSuccesses();
        double double20 = hypergeometricDistribution17.calculateNumericalVariance();
        double double23 = hypergeometricDistribution17.cumulativeProbability(34, 100);
        int[] intArray25 = hypergeometricDistribution17.sample(1);
        well19937c1.setSeed(intArray25);
        well19937c1.setSeed((long) 515959600);
        double double29 = well19937c1.nextDouble();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8719745671619918d + "'", double7 == 0.8719745671619918d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-6100845396906899996L) + "'", long10 == (-6100845396906899996L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 667571320 + "'", int11 == 667571320);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.33451882521604537d + "'", double29 == 0.33451882521604537d);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double10 = randomDataImpl0.nextGaussian((double) 100000L, 81.82697346282114d);
        double double13 = randomDataImpl0.nextGaussian((double) (-127), (double) 17);
        randomDataImpl0.reSeed();
        randomDataImpl0.reSeedSecure();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100035.5211267619d + "'", double10 == 100035.5211267619d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-116.14432337915136d) + "'", double13 == (-116.14432337915136d));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double6 = hypergeometricDistribution3.probability(1549912060);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        int[] intArray11 = hypergeometricDistribution3.sample(1);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl12 = hypergeometricDistribution3.randomData;
        double double16 = randomDataImpl12.nextUniform(20.515805509678458d, (double) 865L, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(randomDataImpl12);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 156.34038849845763d + "'", double16 == 156.34038849845763d);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        double double11 = randomDataImpl0.nextUniform(0.6927991497383688d, 99.95453823045537d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int16 = hypergeometricDistribution15.getSampleSize();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = hypergeometricDistribution15.getSupportUpperBound();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double22 = randomDataImpl0.nextUniform((double) 0L, 4.895601134209371E44d);
        double double25 = randomDataImpl0.nextBeta(88.5713406919827d, 174.00231263771764d);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 24.727720327649187d + "'", double3 == 24.727720327649187d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 31.010573465558274d + "'", double11 == 31.010573465558274d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.3967274969462155E44d + "'", double22 == 4.3967274969462155E44d);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.32659332579127615d + "'", double25 == 0.32659332579127615d);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        double double18 = hypergeometricDistribution13.cumulativeProbability(0);
        int int19 = hypergeometricDistribution13.getSupportUpperBound();
        int int20 = hypergeometricDistribution13.getSampleSize();
        double double22 = hypergeometricDistribution13.cumulativeProbability((-295576755));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.1525324184116979E44d + "'", double5 == 1.1525324184116979E44d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        randomDataImpl6.reSeedSecure();
        randomDataImpl6.reSeed();
        randomDataImpl6.reSeed((long) (-308049809));
        double double14 = randomDataImpl6.nextUniform(1066.2586085113753d, 1.4321629215711818E44d, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = randomDataImpl6.nextSecureHexString((-398495072));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: length (-398,495,072)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.4291142103425716E44d + "'", double14 == 1.4291142103425716E44d);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        double double9 = hypergeometricDistribution3.probability(1454258676);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistribution3.cumulativeProbability(0, (-232542925));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0) must be less than or equal to upper endpoint (-232,542,925)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int6 = well19937c1.nextInt(100);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1 };
        well19937c1.nextBytes(byteArray9);
        well19937c1.setSeed(667571320);
        well19937c1.clear();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray19 = hypergeometricDistribution17.sample(5);
        int int23 = hypergeometricDistribution17.solveInverseCumulativeProbability(0.5548245223302555d, (int) (byte) 0, 50);
        int int24 = hypergeometricDistribution17.getSampleSize();
        int[] intArray26 = hypergeometricDistribution17.sample((int) '4');
        well19937c1.setSeed(intArray26);
        org.apache.commons.math3.random.Well19937c well19937c29 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int31 = well19937c29.nextInt(100);
        well19937c29.clear();
        int int34 = well19937c29.nextInt(100);
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 1 };
        well19937c29.nextBytes(byteArray37);
        well19937c1.nextBytes(byteArray37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[102, 91]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 50 + "'", int31 == 50);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 34 + "'", int34 == 34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[65, 42]");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int[] intArray8 = hypergeometricDistribution3.sample(33);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        long long7 = well19937c1.nextLong();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator8 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        java.lang.String str10 = randomDataGenerator8.nextHexString(1);
        int int14 = randomDataGenerator8.nextHypergeometric(20, (int) (short) 1, 0);
        int int17 = randomDataGenerator8.nextSecureInt(176046386, 2035706397);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = randomDataGenerator8.nextSecureLong((long) 667571320, 28L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (667,571,320) must be strictly less than upper bound (28)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-6656821606993036558L) + "'", long7 == (-6656821606993036558L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8" + "'", str10, "8");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1735717043 + "'", int17 == 1735717043);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        double double11 = hypergeometricDistribution3.cumulativeProbability(10);
        int int12 = hypergeometricDistribution3.getSampleSize();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl13 = hypergeometricDistribution3.randomData;
        double double15 = hypergeometricDistribution3.probability((-2128545835));
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl16 = hypergeometricDistribution3.randomData;
        double double18 = randomDataImpl16.nextExponential(23.818037494682084d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl16);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.00148814745456d + "'", double18 == 32.00148814745456d);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.cumulativeProbability((int) '4', 389817062);
        hypergeometricDistribution3.reseedRandomGenerator((long) (-456672586));
        double double13 = hypergeometricDistribution3.getNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = hypergeometricDistribution3.randomData;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = randomDataImpl14.nextPermutation(245365937, 1198721505);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: permutation size (1,198,721,505) exceeds permuation domain (245,365,937)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl14);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 10);
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl13 = hypergeometricDistribution3.randomData;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(randomDataImpl13);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 1, 1, 3);
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistribution3.cumulativeProbability(144, (-1912014094));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (144) must be less than or equal to upper endpoint (-1,912,014,094)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long5 = randomDataImpl0.nextPoisson(14.154262241479262d);
        randomDataImpl0.reSeed((long) 'a');
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int12 = hypergeometricDistribution11.getSampleSize();
        int int13 = hypergeometricDistribution11.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution11.calculateNumericalVariance();
        double double17 = hypergeometricDistribution11.cumulativeProbability(34, 100);
        double double19 = hypergeometricDistribution11.cumulativeProbability(10);
        int int20 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = randomDataImpl0.nextHexString((-1298909124));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: length (-1,298,909,124)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.801223903694485d + "'", double3 == 20.801223903694485d);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9L + "'", long5 == 9L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        double double11 = randomDataImpl0.nextUniform(0.6927991497383688d, 99.95453823045537d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int16 = hypergeometricDistribution15.getSampleSize();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = hypergeometricDistribution15.getSupportUpperBound();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        int int22 = randomDataImpl0.nextInt((-459835946), (-118603794));
        double double25 = randomDataImpl0.nextUniform(0.0d, 0.02505572616903578d);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.050395484168877d + "'", double3 == 20.050395484168877d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 98.87908207374937d + "'", double11 == 98.87908207374937d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-287648846) + "'", int22 == (-287648846));
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.00984342223561939d + "'", double25 == 0.00984342223561939d);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.cumulativeProbability(21);
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1, 1);
        double double13 = hypergeometricDistribution3.probability(41);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = hypergeometricDistribution3.randomData;
        int int15 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.inverseCumulativeProbability((-0.0d));
        double double8 = hypergeometricDistribution3.probability((-752293658));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        int int9 = randomDataImpl6.nextSecureInt((-1737377827), 3);
        int int12 = randomDataImpl6.nextZipf((int) (short) 1, 0.008990263851537944d);
        double double14 = randomDataImpl6.nextExponential(46.83484877490012d);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = randomDataImpl6.nextBinomial(0, 1.5073411447275046E44d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 150,734,114,472,750,460,000,000,000,000,000,000,000,000,000 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-150616625) + "'", int9 == (-150616625));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 51.982079849519096d + "'", double14 == 51.982079849519096d);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int10 = hypergeometricDistribution9.getSampleSize();
        double double11 = hypergeometricDistribution9.getNumericalMean();
        boolean boolean12 = hypergeometricDistribution9.isSupportConnected();
        hypergeometricDistribution9.reseedRandomGenerator(100L);
        int int15 = hypergeometricDistribution9.getNumberOfSuccesses();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution9);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.352644989962811E44d + "'", double5 == 4.352644989962811E44d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int11 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1773504001, 722721355, 4);
        double double5 = hypergeometricDistribution3.probability(667571320);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        double double11 = hypergeometricDistribution3.cumulativeProbability(10);
        int int12 = hypergeometricDistribution3.getSampleSize();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl13 = hypergeometricDistribution3.randomData;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray19 = hypergeometricDistribution17.sample(5);
        int int23 = hypergeometricDistribution17.solveInverseCumulativeProbability(0.5548245223302555d, (int) (byte) 0, 50);
        int int24 = hypergeometricDistribution17.getSampleSize();
        int[] intArray26 = hypergeometricDistribution17.sample((int) '4');
        int int27 = randomDataImpl13.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = randomDataImpl13.nextBinomial((-107062440), 19.796879073519683d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of trials (-107,062,440)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl13);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(22, (-21661068), 29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-21,661,068)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int15 = hypergeometricDistribution14.getSampleSize();
        int int16 = hypergeometricDistribution14.getSampleSize();
        int int17 = randomDataImpl10.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double18 = hypergeometricDistribution14.getNumericalVariance();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        int int22 = randomDataImpl0.nextPascal((int) 'a', 0.9268766230346709d);
        double double24 = randomDataImpl0.nextExponential(0.9999999999999999d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.823448825799857E43d + "'", double5 == 2.823448825799857E43d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
// flaky:         org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.06121183212807057d + "'", double24 == 0.06121183212807057d);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        int int11 = hypergeometricDistribution4.solveInverseCumulativeProbability(7.158517489260594E43d, 0, 100);
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        double double14 = hypergeometricDistribution4.probability(701507655);
        double double16 = hypergeometricDistribution4.cumulativeProbability(389817062);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistribution4.inverseCumulativeProbability(1.6624686359728634E45d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 1,662,468,635,972,863,400,000,000,000,000,000,000,000,000,000 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential(46.00580982269494d);
        double double8 = randomDataImpl0.nextGamma((double) 'a', 1.6629088874119807E43d);
        double double11 = randomDataImpl0.nextUniform(27.76038345790802d, 229.1831180523293d);
        randomDataImpl0.reSeed();
        long long14 = randomDataImpl0.nextPoisson(25.176912765476555d);
        int int18 = randomDataImpl0.nextHypergeometric(41, (int) (byte) 0, 0);
        double double21 = randomDataImpl0.nextF((double) 445760417, (double) 45);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 24.033148715862453d + "'", double3 == 24.033148715862453d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 55.18178686351598d + "'", double5 == 55.18178686351598d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.005759040922485E45d + "'", double8 == 2.005759040922485E45d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 178.4042059936745d + "'", double11 == 178.4042059936745d);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 24L + "'", long14 == 24L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.8555892531602655d + "'", double21 == 0.8555892531602655d);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int7 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        double double10 = hypergeometricDistribution3.upperCumulativeProbability(50);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1);
        hypergeometricDistribution3.reseedRandomGenerator(33L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 81L, 0, (int) (short) -1);
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        int int14 = hypergeometricDistribution3.solveInverseCumulativeProbability(4.5079377088467325d, (int) (byte) 1, 1628752109);
        double double16 = hypergeometricDistribution3.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1628752109 + "'", int14 == 1628752109);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        int int11 = hypergeometricDistribution4.solveInverseCumulativeProbability(7.158517489260594E43d, 0, 100);
        hypergeometricDistribution4.reseedRandomGenerator((long) (-1912014094));
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        hypergeometricDistribution4.reseedRandomGenerator(3L);
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double10 = randomDataImpl0.nextGaussian((double) 100000L, 81.82697346282114d);
        double double13 = randomDataImpl0.nextGaussian((double) (-127), (double) 17);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = randomDataImpl0.nextUniform(0.8719745671619918d, (double) (-398495072));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (0.872) must be strictly less than upper bound (-398,495,072)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99991.67658474598d + "'", double10 == 99991.67658474598d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-126.89638813140716d) + "'", double13 == (-126.89638813140716d));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        double double11 = randomDataImpl0.nextUniform(0.6927991497383688d, 99.95453823045537d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int16 = hypergeometricDistribution15.getSampleSize();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = hypergeometricDistribution15.getSupportUpperBound();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double22 = hypergeometricDistribution15.cumulativeProbability(0, 33);
        double double23 = hypergeometricDistribution15.getNumericalMean();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 41.36273942761318d + "'", double3 == 41.36273942761318d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 91.36541015197515d + "'", double11 == 91.36541015197515d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(40L);
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(1914461197933657657L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int15 = hypergeometricDistribution14.getSampleSize();
        int int16 = hypergeometricDistribution14.getSampleSize();
        int int17 = randomDataImpl10.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double18 = hypergeometricDistribution14.getNumericalVariance();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution23 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int24 = hypergeometricDistribution23.getSampleSize();
        double double25 = hypergeometricDistribution23.getNumericalMean();
        boolean boolean26 = hypergeometricDistribution23.isSupportConnected();
        double double27 = hypergeometricDistribution23.getNumericalVariance();
        int int28 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution23);
        double double31 = randomDataImpl0.nextGamma(1.7861119591037544E44d, 5.988905530420644E8d);
        long long33 = randomDataImpl0.nextPoisson(0.6989700043360189d);
        randomDataImpl0.reSeed((long) 1741260260);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.6519237421685667E43d + "'", double5 == 2.6519237421685667E43d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0696855789826926E53d + "'", double31 == 1.0696855789826926E53d);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        int int11 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        double double11 = randomDataImpl0.nextUniform(0.6927991497383688d, 99.95453823045537d);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int16 = hypergeometricDistribution15.getSampleSize();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = hypergeometricDistribution15.getSupportUpperBound();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double21 = randomDataImpl0.nextT(98.14309588288239d);
        double double24 = randomDataImpl0.nextGaussian(32.00148814745456d, 1160358.0531533544d);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 59.92241554379128d + "'", double3 == 59.92241554379128d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.29456129404682d + "'", double11 == 35.29456129404682d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.030409266276368d + "'", double21 == 4.030409266276368d);
// flaky:         org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-15700.465574682457d) + "'", double24 == (-15700.465574682457d));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl17 = hypergeometricDistribution13.randomData;
        double double18 = hypergeometricDistribution13.getNumericalVariance();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.990901367376729E43d + "'", double5 == 2.990901367376729E43d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) 1, 1, 3);
        hypergeometricDistribution3.reseedRandomGenerator((long) ' ');
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        double double15 = hypergeometricDistribution3.getNumericalMean();
        int int16 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        randomDataImpl6.reSeedSecure();
        int int10 = randomDataImpl6.nextZipf(2, (double) 1.3096904E8f);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = randomDataImpl6.nextUniform(5.80296006E8d, 0.4627271861808908d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (580,296,006) must be strictly less than upper bound (0.463)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double14 = hypergeometricDistribution13.getNumericalMean();
        double double15 = hypergeometricDistribution13.getNumericalVariance();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        int int19 = randomDataImpl0.nextInt((-456672586), 8);
        double double23 = randomDataImpl0.nextUniform(7.187060997450618d, 859.886967992728d, false);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 116.55729400515031d + "'", double3 == 116.55729400515031d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-316088777) + "'", int19 == (-316088777));
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 655.33952049628d + "'", double23 == 655.33952049628d);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c(2061458278);
        int int2 = well19937c1.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution6 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double7 = hypergeometricDistribution6.getNumericalMean();
        int int8 = hypergeometricDistribution6.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl9 = hypergeometricDistribution6.randomData;
        randomDataImpl9.reSeedSecure();
        int[] intArray13 = randomDataImpl9.nextPermutation(17, 9);
        well19937c1.setSeed(intArray13);
        float float15 = well19937c1.nextFloat();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl16 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1628752109 + "'", int2 == 1628752109);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl9);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2, 10, 0, 6, 14, 12, 16, 5, 1]");
// flaky:         org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.84216595f + "'", float15 == 0.84216595f);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample(5);
        int int9 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.5548245223302555d, (int) (byte) 0, 50);
        int int10 = hypergeometricDistribution3.getSampleSize();
        int[] intArray12 = hypergeometricDistribution3.sample((int) '4');
        double double14 = hypergeometricDistribution3.probability(130969041);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        long long7 = well19937c1.nextLong();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator8 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        java.lang.String str10 = randomDataGenerator8.nextHexString(1);
        int int14 = randomDataGenerator8.nextHypergeometric(20, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = randomDataGenerator8.nextSecureLong(5492381562888477542L, 40L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (5,492,381,562,888,477,542) must be strictly less than upper bound (40)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-6656821606993036558L) + "'", long7 == (-6656821606993036558L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8" + "'", str10, "8");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        double double8 = hypergeometricDistribution3.getNumericalMean();
        double double10 = hypergeometricDistribution3.probability((-308049809));
        int int14 = hypergeometricDistribution3.solveInverseCumulativeProbability(4.3967274969462155E44d, (-232542925), 83);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 83 + "'", int14 == 83);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        int int12 = hypergeometricDistribution3.sample();
        int int13 = hypergeometricDistribution3.sample();
        double double15 = hypergeometricDistribution3.cumulativeProbability(4);
        double double17 = hypergeometricDistribution3.probability((-1560553043));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistribution3.inverseCumulativeProbability((-6.162082222696999E-10d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -0 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '4', 1773504001);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = hypergeometricDistribution4.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray15 = hypergeometricDistribution13.sample(5);
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl17 = hypergeometricDistribution13.randomData;
        randomDataImpl17.reSeedSecure();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.263857186217364E43d + "'", double5 == 4.263857186217364E43d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl17);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution3.probability((-327692674));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.sample();
        int int7 = hypergeometricDistribution3.getSampleSize();
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        double double10 = hypergeometricDistribution3.probability(2061458278);
        hypergeometricDistribution3.reseedRandomGenerator((long) 150);
        boolean boolean13 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        int[] intArray11 = hypergeometricDistribution3.sample(1);
        double double12 = hypergeometricDistribution3.getNumericalMean();
        int int13 = hypergeometricDistribution3.getSupportUpperBound();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.probability((-263289891));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        int int8 = hypergeometricDistribution3.sample();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = hypergeometricDistribution3.randomData;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl10);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int11 = hypergeometricDistribution3.solveInverseCumulativeProbability(0.0d, 4, (-308049809));
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1);
        int int14 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-308049809) + "'", int11 == (-308049809));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        double double7 = well19937c1.nextDouble();
        long long9 = well19937c1.nextLong((long) (byte) 100);
        double double10 = well19937c1.nextGaussian();
        org.apache.commons.math3.random.Well19937c well19937c12 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int14 = well19937c12.nextInt(100);
        int int16 = well19937c12.nextInt(5);
        int int17 = well19937c12.nextInt();
        double double18 = well19937c12.nextDouble();
        long long20 = well19937c12.nextLong((long) (byte) 100);
        long long21 = well19937c12.nextLong();
        int int22 = well19937c12.nextInt();
        well19937c12.setSeed(86L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution28 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int29 = hypergeometricDistribution28.getSampleSize();
        int int30 = hypergeometricDistribution28.getNumberOfSuccesses();
        double double31 = hypergeometricDistribution28.calculateNumericalVariance();
        double double34 = hypergeometricDistribution28.cumulativeProbability(34, 100);
        int[] intArray36 = hypergeometricDistribution28.sample(1);
        well19937c12.setSeed(intArray36);
        int int38 = well19937c12.nextInt();
        org.apache.commons.math3.random.Well19937c well19937c40 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int42 = well19937c40.nextInt(100);
        well19937c40.clear();
        int int44 = well19937c40.nextInt();
        byte[] byteArray51 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        well19937c40.nextBytes(byteArray51);
        well19937c12.nextBytes(byteArray51);
        well19937c1.nextBytes(byteArray51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8719745671619918d + "'", double7 == 0.8719745671619918d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.9372798639690711d) + "'", double10 == (-0.9372798639690711d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2061458278 + "'", int17 == 2061458278);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.8719745671619918d + "'", double18 == 0.8719745671619918d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-6100845396906899996L) + "'", long21 == (-6100845396906899996L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 667571320 + "'", int22 == 667571320);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-96398574) + "'", int38 == (-96398574));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 50 + "'", int42 == 50);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1737377827) + "'", int44 == (-1737377827));
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-48, 33, 3, 9, -31, 60]");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) -1);
        org.apache.commons.math3.random.Well19937c well19937c3 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int5 = well19937c3.nextInt(100);
        int int7 = well19937c3.nextInt(5);
        int int8 = well19937c3.nextInt();
        double double9 = well19937c3.nextDouble();
        long long11 = well19937c3.nextLong((long) (byte) 100);
        long long12 = well19937c3.nextLong();
        int int13 = well19937c3.nextInt();
        well19937c3.setSeed(86L);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution19 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int20 = hypergeometricDistribution19.getSampleSize();
        int int21 = hypergeometricDistribution19.getNumberOfSuccesses();
        double double22 = hypergeometricDistribution19.calculateNumericalVariance();
        double double25 = hypergeometricDistribution19.cumulativeProbability(34, 100);
        int[] intArray27 = hypergeometricDistribution19.sample(1);
        well19937c3.setSeed(intArray27);
        int int29 = well19937c3.nextInt();
        org.apache.commons.math3.random.Well19937c well19937c31 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int33 = well19937c31.nextInt(100);
        well19937c31.clear();
        int int35 = well19937c31.nextInt();
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        well19937c31.nextBytes(byteArray42);
        well19937c3.nextBytes(byteArray42);
        well19937c1.nextBytes(byteArray42);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2061458278 + "'", int8 == 2061458278);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8719745671619918d + "'", double9 == 0.8719745671619918d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-6100845396906899996L) + "'", long12 == (-6100845396906899996L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 667571320 + "'", int13 == 667571320);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-96398574) + "'", int29 == (-96398574));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 50 + "'", int33 == 50);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1737377827) + "'", int35 == (-1737377827));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[29, 106, 86, 121, 12, 126]");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability((double) 0.27873123f, 21, 50);
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.sample();
        double double16 = hypergeometricDistribution4.cumulativeProbability((-1560553043));
        int int17 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1773504001, 722721355, 4);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean5 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        randomDataImpl0.reSeed((long) 34);
        randomDataImpl0.reSeedSecure((long) (short) 1);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl5 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int10 = hypergeometricDistribution9.getSampleSize();
        int int11 = hypergeometricDistribution9.getSampleSize();
        int int12 = randomDataImpl5.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution9);
        boolean boolean13 = hypergeometricDistribution9.isSupportConnected();
        int int17 = hypergeometricDistribution9.solveInverseCumulativeProbability((double) 0.27873123f, 21, 50);
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution9);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistribution9.cumulativeProbability(0, (-96398574));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0) must be less than or equal to upper endpoint (-96,398,574)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        org.apache.commons.math3.random.RandomGenerator randomGenerator6 = hypergeometricDistribution3.random;
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        hypergeometricDistribution3.reseedRandomGenerator((long) (-752293658));
        int[] intArray12 = hypergeometricDistribution3.sample(2);
        boolean boolean13 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(randomGenerator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure((long) ' ');
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double14 = hypergeometricDistribution13.getNumericalMean();
        double double15 = hypergeometricDistribution13.getNumericalVariance();
        int int16 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution13);
        hypergeometricDistribution13.reseedRandomGenerator(7L);
        int int20 = hypergeometricDistribution13.inverseCumulativeProbability(0.0d);
        double double22 = hypergeometricDistribution13.cumulativeProbability(2054174380);
        double double25 = hypergeometricDistribution13.cumulativeProbability((-1414355314), (int) '#');
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 76.70464897109544d + "'", double3 == 76.70464897109544d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double5 = hypergeometricDistribution3.getNumericalVariance();
        int int6 = hypergeometricDistribution3.getSampleSize();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.cumulativeProbability((int) '4', 389817062);
        hypergeometricDistribution3.reseedRandomGenerator((long) (-456672586));
        double double13 = hypergeometricDistribution3.getNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = hypergeometricDistribution3.randomData;
        double double15 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        int int11 = hypergeometricDistribution4.solveInverseCumulativeProbability(7.158517489260594E43d, 0, 100);
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        double double14 = hypergeometricDistribution4.probability(701507655);
        double double16 = hypergeometricDistribution4.cumulativeProbability(389817062);
        double double17 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution9 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 667571320, 667571320, (int) (byte) 100);
        boolean boolean10 = hypergeometricDistribution9.isSupportConnected();
        double double11 = hypergeometricDistribution9.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(34, 100);
        int[] intArray11 = hypergeometricDistribution3.sample(1);
        hypergeometricDistribution3.reseedRandomGenerator((-346955678L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample(5);
        double double7 = hypergeometricDistribution3.cumulativeProbability(22);
        int[] intArray9 = hypergeometricDistribution3.sample((int) ' ');
        org.apache.commons.math3.random.Well19937c well19937c10 = new org.apache.commons.math3.random.Well19937c(intArray9);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator11 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c8 = new org.apache.commons.math3.random.Well19937c(2061458278);
        int int9 = well19937c8.nextInt();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution13 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double14 = hypergeometricDistribution13.getNumericalMean();
        int int15 = hypergeometricDistribution13.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl16 = hypergeometricDistribution13.randomData;
        randomDataImpl16.reSeedSecure();
        int[] intArray20 = randomDataImpl16.nextPermutation(17, 9);
        well19937c8.setSeed(intArray20);
        well19937c1.setSeed(intArray20);
        well19937c1.setSeed(28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1628752109 + "'", int9 == 1628752109);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl16);
        org.junit.Assert.assertNotNull(intArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[5, 1, 12, 6, 9, 16, 0, 3, 4]");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double10 = hypergeometricDistribution3.cumulativeProbability(0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        java.lang.Class<?> wildcardClass13 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        double double8 = hypergeometricDistribution3.getNumericalMean();
        double double10 = hypergeometricDistribution3.probability((-308049809));
        double double12 = hypergeometricDistribution3.probability(0);
        double double13 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.cumulativeProbability((int) '4', 389817062);
        hypergeometricDistribution3.reseedRandomGenerator((long) (-456672586));
        int int13 = hypergeometricDistribution3.getSupportLowerBound();
        int int14 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        int int8 = well19937c1.nextInt(50);
        long long9 = well19937c1.nextLong();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int15 = hypergeometricDistribution14.getSampleSize();
        double double16 = hypergeometricDistribution14.getNumericalMean();
        int int17 = hypergeometricDistribution14.sample();
        double double18 = hypergeometricDistribution14.getNumericalVariance();
        hypergeometricDistribution14.reseedRandomGenerator(22L);
        int int21 = hypergeometricDistribution14.sample();
        double double22 = hypergeometricDistribution14.getNumericalVariance();
        int int23 = hypergeometricDistribution14.sample();
        hypergeometricDistribution14.reseedRandomGenerator(0L);
        int int26 = randomDataImpl10.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double29 = randomDataImpl10.nextBeta((double) 0.35501158f, 26.43377238240109d);
        long long32 = randomDataImpl10.nextSecureLong((long) 11, (long) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-6656821606993036558L) + "'", long9 == (-6656821606993036558L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0022664754061753854d + "'", double29 == 0.0022664754061753854d);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 51L + "'", long32 == 51L);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl7 = hypergeometricDistribution3.randomData;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
        org.junit.Assert.assertNotNull(randomDataImpl7);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = hypergeometricDistribution3.randomData;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl10);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        well19937c1.setSeed((long) (short) 0);
        well19937c1.setSeed(24);
        long long10 = well19937c1.nextLong();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int15 = hypergeometricDistribution14.getSampleSize();
        double double16 = hypergeometricDistribution14.getNumericalMean();
        int[] intArray18 = hypergeometricDistribution14.sample((int) '#');
        well19937c1.setSeed(intArray18);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator20 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double22 = randomDataGenerator20.nextExponential(1.5257678155332706E9d);
        double double25 = randomDataGenerator20.nextCauchy(1.7899764771286983d, 76.4907669189673d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2296622882228558760L) + "'", long10 == (-2296622882228558760L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.8989047835109406E9d + "'", double22 == 2.8989047835109406E9d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-28722.474313769446d) + "'", double25 == (-28722.474313769446d));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        org.apache.commons.math3.random.RandomGenerator randomGenerator6 = hypergeometricDistribution3.random;
        byte[] byteArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            randomGenerator6.nextBytes(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(randomGenerator6);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray7 = hypergeometricDistribution3.sample((int) '#');
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        int[] intArray10 = hypergeometricDistribution3.sample((int) '4');
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        double double13 = hypergeometricDistribution3.probability((-368761393));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int[] intArray5 = hypergeometricDistribution3.sample(5);
        double double7 = hypergeometricDistribution3.cumulativeProbability(22);
        double double10 = hypergeometricDistribution3.cumulativeProbability(6, 41);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        well19937c1.setSeed((long) (short) 0);
        well19937c1.setSeed(24);
        long long10 = well19937c1.nextLong();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int15 = hypergeometricDistribution14.getSampleSize();
        double double16 = hypergeometricDistribution14.getNumericalMean();
        int[] intArray18 = hypergeometricDistribution14.sample((int) '#');
        well19937c1.setSeed(intArray18);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator20 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        randomDataGenerator20.reSeed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2296622882228558760L) + "'", long10 == (-2296622882228558760L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double11 = randomDataImpl8.nextGamma(1.5633696327922069d, 1.4358151214714785d);
        int int15 = randomDataImpl8.nextHypergeometric((int) (byte) 100, 6, 16);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = randomDataImpl8.nextUniform(4.92124638608119E43d, 27050.0d, false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (49,212,463,860,811,900,000,000,000,000,000,000,000,000,000) must be strictly less than upper bound (27,050)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.4418406528658574d + "'", double11 == 1.4418406528658574d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextSecureHexString(10);
        double double8 = randomDataImpl0.nextBeta(87.2781777232462d, 92.52126017343087d);
        int int12 = randomDataImpl0.nextHypergeometric((int) '4', 0, 22);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = randomDataImpl0.nextUniform(110.49684313379836d, (-1.4184569221459308E8d), false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (110.497) must be strictly less than upper bound (-141,845,692.215)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.616299946540377E42d + "'", double3 == 8.616299946540377E42d);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bf2bb63ba6" + "'", str5, "bf2bb63ba6");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4893659934997413d + "'", double8 == 0.4893659934997413d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        int int3 = randomDataImpl0.nextSecureInt((int) (byte) -1, 4);
        double double5 = randomDataImpl0.nextExponential(6.09632570207329E43d);
        randomDataImpl0.reSeedSecure(100L);
        randomDataImpl0.reSeedSecure(1L);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int15 = hypergeometricDistribution14.getSampleSize();
        int int16 = hypergeometricDistribution14.getSampleSize();
        int int17 = randomDataImpl10.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double18 = hypergeometricDistribution14.getNumericalVariance();
        int int19 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double22 = randomDataImpl0.nextGaussian(120.90154406242642d, (double) 0.37370503f);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.72582320749296E43d + "'", double5 == 4.72582320749296E43d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 120.90991678810154d + "'", double22 == 120.90991678810154d);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        org.apache.commons.math3.random.Well19937c well19937c8 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int10 = well19937c8.nextInt(100);
        byte[] byteArray11 = new byte[] {};
        well19937c8.nextBytes(byteArray11);
        well19937c1.nextBytes(byteArray11);
        int[] intArray15 = new int[] { 50 };
        well19937c1.setSeed(intArray15);
        org.apache.commons.math3.random.Well19937c well19937c17 = new org.apache.commons.math3.random.Well19937c(intArray15);
        org.apache.commons.math3.random.Well19937c well19937c18 = new org.apache.commons.math3.random.Well19937c(intArray15);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution22 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int23 = hypergeometricDistribution22.getSampleSize();
        double double24 = hypergeometricDistribution22.getNumericalMean();
        int[] intArray26 = hypergeometricDistribution22.sample((int) '#');
        int int27 = hypergeometricDistribution22.getSupportLowerBound();
        int[] intArray29 = hypergeometricDistribution22.sample((int) '4');
        well19937c18.setSeed(intArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution34 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c18, (-1453332173), 62, 83);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1,453,332,173)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[50]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        randomGenerator7.setSeed((-1737377827));
        org.apache.commons.math3.random.Well19937c well19937c11 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int13 = well19937c11.nextInt(100);
        int int15 = well19937c11.nextInt(5);
        int int16 = well19937c11.nextInt();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator17 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c11);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        well19937c11.nextBytes(byteArray21);
        well19937c11.setSeed(20L);
        org.apache.commons.math3.random.Well19937c well19937c26 = new org.apache.commons.math3.random.Well19937c((long) 3);
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        well19937c26.nextBytes(byteArray32);
        well19937c11.nextBytes(byteArray32);
        randomGenerator7.nextBytes(byteArray32);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2061458278 + "'", int16 == 2061458278);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-125, -71, 57]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-51, 1, -33, 31, 126]");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        int int12 = hypergeometricDistribution3.sample();
        double double14 = hypergeometricDistribution3.upperCumulativeProbability((-492729593));
        int int15 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = hypergeometricDistribution3.randomData;
        randomDataImpl6.reSeedSecure();
        randomDataImpl6.reSeed();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = randomDataImpl6.nextF(1.5059240971926068E45d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl6);
    }
}
