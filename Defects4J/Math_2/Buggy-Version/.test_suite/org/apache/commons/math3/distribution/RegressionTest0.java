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
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double3 = randomDataGenerator0.nextGamma(2.993222846126381d, 63.18646759321859d);
        double double5 = randomDataGenerator0.nextExponential(8.463450448679701d);
        randomDataGenerator0.reSeed();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = randomDataGenerator0.nextHypergeometric((int) (short) 0, 11, 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 77.14678586697585d + "'", double3 == 77.14678586697585d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.073452996067363d + "'", double5 == 25.073452996067363d);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution11 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, (int) (byte) 1, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (35) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        randomDataImpl0.reSeedSecure((long) 1);
        double double10 = randomDataImpl0.nextUniform((-0.593314096025658d), 77.06164007195025d);
        int[] intArray13 = randomDataImpl0.nextPermutation(34, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = randomDataImpl0.nextHypergeometric(22, (-678979973), (-678979973));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-678,979,973)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 42.58117139967018d + "'", double3 == 42.58117139967018d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.203052573116614d + "'", double5 == 6.203052573116614d);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.2839870336861114d + "'", double10 == 4.2839870336861114d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[9, 32, 3, 29]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double3 = randomDataGenerator0.nextCauchy((double) (byte) 100, 0.9942417312085655d);
        double double5 = randomDataGenerator0.nextExponential(0.010437607667123028d);
        randomDataGenerator0.reSeedSecure((long) (-127));
        // The following exception was thrown during execution in test generation
        try {
            int int11 = randomDataGenerator0.nextHypergeometric((int) (short) -1, 11, (-1347491339));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.17599288817738d + "'", double3 == 100.17599288817738d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.008011915943259161d + "'", double5 == 0.008011915943259161d);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double3 = randomDataGenerator0.nextCauchy((double) (byte) 100, 0.9942417312085655d);
        double double5 = randomDataGenerator0.nextExponential(0.010437607667123028d);
        int int9 = randomDataGenerator0.nextHypergeometric(195270565, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double12 = randomDataGenerator0.nextGamma((-5.57205139769055E43d), 6.037799884225303d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: shape (-55,720,513,976,905,500,000,000,000,000,000,000,000,000,000)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 136.04004039223636d + "'", double3 == 136.04004039223636d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.020172566391938627d + "'", double5 == 0.020172566391938627d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double3 = randomDataGenerator0.nextCauchy((double) (byte) 100, 0.9942417312085655d);
        double double5 = randomDataGenerator0.nextExponential(0.010437607667123028d);
        int int9 = randomDataGenerator0.nextHypergeometric(195270565, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = randomDataGenerator0.nextBinomial(34, (double) (-2.25179981E15f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -2,251,799,813,685,248 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 102.16249876234363d + "'", double3 == 102.16249876234363d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.8600822273698275E-4d + "'", double5 == 2.8600822273698275E-4d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        randomDataImpl0.reSeedSecure((long) 1);
        long long9 = randomDataImpl0.nextPoisson(3.6686066275171525d);
        double double12 = randomDataImpl0.nextUniform(130.12583188937944d, 6.352878990258308E43d);
        double double15 = randomDataImpl0.nextWeibull(1.0465233942969707d, 0.5548245223302555d);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = randomDataImpl0.nextHypergeometric((-1), 0, 3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.415450131923265d + "'", double3 == 35.415450131923265d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 24.764193253538892d + "'", double5 == 24.764193253538892d);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.876204671488314E43d + "'", double12 == 1.876204671488314E43d);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.20686768111099568d + "'", double15 == 0.20686768111099568d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        java.lang.Class<?> wildcardClass10 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure(5492381562888477542L);
        randomDataImpl0.reSeedSecure(0L);
        randomDataImpl0.reSeedSecure();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = randomDataImpl0.nextHypergeometric((-446890937), (int) (short) -1, 64);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-446,890,937)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.541700795144017d + "'", double3 == 15.541700795144017d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double11 = hypergeometricDistribution4.cumulativeProbability((-1973305895), (-671727047));
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((-2L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        int[] intArray3 = randomDataGenerator0.nextPermutation((int) (short) 10, 4);
        randomDataGenerator0.reSeedSecure();
        double double8 = randomDataGenerator0.nextUniform((double) (-6656821606993036558L), 96.34193096738655d, false);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = randomDataGenerator0.nextHypergeometric((-201810873), 64, (-201810873));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-201,810,873)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[8, 9, 5, 3]");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.9856475424175084E18d) + "'", double8 == (-4.9856475424175084E18d));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        randomDataImpl0.reSeedSecure((long) 1);
        java.lang.String str9 = randomDataImpl0.nextHexString((int) '4');
        double double12 = randomDataImpl0.nextUniform(0.0d, (double) 1.4E-45f);
        double double16 = randomDataImpl0.nextUniform((-5.57205139769055E43d), 0.7615941559557649d, true);
        double double19 = randomDataImpl0.nextUniform(10.0d, 5281.0d);
        int int23 = randomDataImpl0.nextHypergeometric(80, 0, (int) (byte) 0);
        int int26 = randomDataImpl0.nextInt(10, 34);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = randomDataImpl0.nextLong(100L, (long) 75);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (100) must be strictly less than upper bound (75)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 89.16646992358342d + "'", double3 == 89.16646992358342d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.7776679281248207d + "'", double5 == 2.7776679281248207d);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "75fd0d14f4cf137ec8e3d5caf1a9decf720f055e0b3c99516198" + "'", str9, "75fd0d14f4cf137ec8e3d5caf1a9decf720f055e0b3c99516198");
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.230846410656523E-45d + "'", double12 == 1.230846410656523E-45d);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-5.523693049437938E43d) + "'", double16 == (-5.523693049437938E43d));
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5002.737762820536d + "'", double19 == 5002.737762820536d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 33 + "'", int26 == 33);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = hypergeometricDistribution17.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 16.82992449469551d + "'", double3 == 16.82992449469551d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 49.517127643900245d + "'", double5 == 49.517127643900245d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.4852034012943087d + "'", double8 == 1.4852034012943087d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '4', 0, 198059067);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (198,059,067) must be less than or equal to population size (52)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        float float8 = well19937c1.nextFloat();
        well19937c1.setSeed((int) (short) -1);
        double double11 = well19937c1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, (-2), 0, (-408299265));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-2)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.27873123f + "'", float8 == 0.27873123f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.5996555078851037d) + "'", double11 == (-0.5996555078851037d));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = hypergeometricDistribution4.sample((-1420463761));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1,420,463,761)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution4.random;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistribution4.cumulativeProbability(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (10) must be less than or equal to upper endpoint (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double3 = randomDataGenerator0.nextBeta(1.5127195827191767E43d, 5.8059341211821325d);
        randomDataGenerator0.reSeed(947811292274769225L);
        int[] intArray8 = randomDataGenerator0.nextPermutation((int) (short) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = randomDataGenerator0.nextHypergeometric(86, (-408299265), (-1023));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-408,299,265)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999999987412798d + "'", double3 == 0.9999999987412798d);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = hypergeometricDistribution4.sample(51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.Well19937c well19937c9 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int11 = well19937c9.nextInt(100);
        byte[] byteArray12 = new byte[] {};
        well19937c9.nextBytes(byteArray12);
        well19937c1.nextBytes(byteArray12);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator15 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator16 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = randomDataGenerator16.getRandomGenerator();
        int int21 = randomDataGenerator16.nextHypergeometric((int) ' ', 4, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = randomDataGenerator16.nextSecureLong((long) (short) 100, (long) 68);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (100) must be strictly less than upper bound (68)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        int int13 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution4.random;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution4.random;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistribution4.cumulativeProbability(133, 41);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (133) must be less than or equal to upper endpoint (41)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(17.688692811125733d, 0, 133);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution4.inverseCumulativeProbability(19.5014020909913d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 19.501 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 133 + "'", int12 == 133);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        org.apache.commons.math3.random.Well19937c well19937c7 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int9 = well19937c7.nextInt(100);
        well19937c7.clear();
        int int11 = well19937c7.nextInt();
        well19937c7.setSeed((long) 4);
        int[] intArray19 = new int[] { 2, 2, '4', (short) 100, (short) 100 };
        well19937c7.setSeed(intArray19);
        org.apache.commons.math3.random.Well19937c well19937c21 = new org.apache.commons.math3.random.Well19937c(intArray19);
        well19937c1.setSeed(intArray19);
        boolean boolean23 = well19937c1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution27 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 68, (int) 'a', 98);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (97) must be less than or equal to population size (68)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50 + "'", int9 == 50);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1737377827) + "'", int11 == (-1737377827));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[2, 2, 52, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double3 = randomDataGenerator0.nextCauchy((double) (byte) 100, 0.9942417312085655d);
        double double5 = randomDataGenerator0.nextExponential(0.010437607667123028d);
        int int9 = randomDataGenerator0.nextHypergeometric(195270565, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double12 = randomDataGenerator0.nextBeta(3.6276308240261184d, (-7.92106067763596E42d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NoBracketingException; message: function values at endpoints do not have different signs, endpoints: [0, 1], values: [-0.479, 0.521]");
        } catch (org.apache.commons.math3.exception.NoBracketingException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 102.45496722902296d + "'", double3 == 102.45496722902296d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.07134211748547625d + "'", double5 == 0.07134211748547625d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = hypergeometricDistribution4.sample(70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(36L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double3 = randomDataGenerator0.nextBeta(1.5127195827191767E43d, 5.8059341211821325d);
        randomDataGenerator0.reSeed(947811292274769225L);
        int int8 = randomDataGenerator0.nextSecureInt(4, 100);
        double double11 = randomDataGenerator0.nextGamma(99.393708339541d, 0.9999999987996013d);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = randomDataGenerator0.nextHypergeometric((-549865085), 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-549,865,085)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999999982983974d + "'", double3 == 0.9999999982983974d);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 23 + "'", int8 == 23);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 102.69546843233114d + "'", double11 == 102.69546843233114d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample(53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        int int24 = hypergeometricDistribution17.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = hypergeometricDistribution17.inverseCumulativeProbability(15.938997888881751d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 15.939 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 101.17489631119737d + "'", double3 == 101.17489631119737d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.634580110101698d + "'", double5 == 10.634580110101698d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.5941832275608823d) + "'", double8 == (-2.5941832275608823d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.Well19937c well19937c9 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int11 = well19937c9.nextInt(100);
        byte[] byteArray12 = new byte[] {};
        well19937c9.nextBytes(byteArray12);
        well19937c1.nextBytes(byteArray12);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator15 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator16 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = randomDataGenerator16.getRandomGenerator();
        int int21 = randomDataGenerator16.nextHypergeometric((int) ' ', 4, 1);
        long long23 = randomDataGenerator16.nextPoisson(122.37650717815256d);
        double double27 = randomDataGenerator16.nextUniform((double) 5.0f, 6.533193571063436d, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = randomDataGenerator16.nextSecureHexString((-408299265));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: length (-408,299,265)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 138L + "'", long23 == 138L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5.141125064579194d + "'", double27 == 5.141125064579194d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(18, 47, 64);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (47) must be less than or equal to population size (18)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.inverseCumulativeProbability((double) 47);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 47 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((-1973305895), 80, 6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1,973,305,895)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.probability(30);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistribution4.cumulativeProbability(1, (-408299265));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1) must be less than or equal to upper endpoint (-408,299,265)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = hypergeometricDistribution4.sample(195270565);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        int int9 = hypergeometricDistribution4.getSampleSize();
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution4.random;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.inverseCumulativeProbability((double) (-678979973L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -678,979,973 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertNull(randomGenerator10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistribution4.inverseCumulativeProbability(2.5770727536723275d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 2.577 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 51, (int) (byte) -1, 98);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((-678979973), (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-678,979,973)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution4.random;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10, (-954372311));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (10) must be less than or equal to upper endpoint (-954,372,311)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.inverseCumulativeProbability(45.456499404378775d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 45.456 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistribution4.cumulativeProbability(60, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (60) must be less than or equal to upper endpoint (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistribution4.cumulativeProbability(154568170, (-749437760));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (154,568,170) must be less than or equal to upper endpoint (-749,437,760)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        float float7 = well19937c1.nextFloat();
        double double8 = well19937c1.nextDouble();
        org.apache.commons.math3.random.Well19937c well19937c10 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int12 = well19937c10.nextInt(100);
        byte[] byteArray13 = new byte[] {};
        well19937c10.nextBytes(byteArray13);
        well19937c1.nextBytes(byteArray13);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl16 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        int int19 = randomDataImpl16.nextZipf(1, 3.1622776601683795d);
        double double21 = randomDataImpl16.nextExponential(2.5296601045056457d);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = randomDataImpl16.nextHypergeometric((-620293396), 5, (-1347491339));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-620,293,396)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.639133f + "'", float7 == 0.639133f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5548245223302555d + "'", double8 == 0.5548245223302555d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.19595574439910313d + "'", double21 == 0.19595574439910313d);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        int int9 = hypergeometricDistribution4.getSampleSize();
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution4.random;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertNull(randomGenerator10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        int int11 = hypergeometricDistribution4.getSampleSize();
        double double13 = hypergeometricDistribution4.probability(55);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextT(32.62666636167908d);
        double double15 = randomDataImpl0.nextWeibull((double) 36, 26.77026101949342d);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = randomDataImpl0.nextHypergeometric(6, 216105365, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (216,105,365) must be less than or equal to population size (6)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-47.24165701088278d) + "'", double3 == (-47.24165701088278d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.1064283177668828d + "'", double5 == 3.1064283177668828d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.512950622921513d + "'", double8 == 10.512950622921513d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.23256581268324156d) + "'", double12 == (-0.23256581268324156d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 27.624214403404665d + "'", double15 == 27.624214403404665d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(63L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.probability(30);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution4.inverseCumulativeProbability(3.8431980841109d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 3.843 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = hypergeometricDistribution15.randomData;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = hypergeometricDistribution15.sample((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 112.23074030925194d + "'", double3 == 112.23074030925194d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5117989380288673d + "'", double8 == 0.5117989380288673d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "e5fc07b7622ce14dfe362c430d4ab81555" + "'", str10, "e5fc07b7622ce14dfe362c430d4ab81555");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl19);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.inverseCumulativeProbability((double) 30L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 30 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        randomDataImpl0.reSeedSecure((long) 1);
        java.lang.String str9 = randomDataImpl0.nextHexString((int) '4');
        double double12 = randomDataImpl0.nextUniform(0.0d, (double) 1.4E-45f);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl13 = new org.apache.commons.math3.random.RandomDataImpl();
        double double16 = randomDataImpl13.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double18 = randomDataImpl13.nextExponential((double) 10L);
        double double21 = randomDataImpl13.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl13.reSeed((long) (byte) 10);
        double double25 = randomDataImpl13.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution30 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator26, 26, 0, 11);
        int int34 = hypergeometricDistribution30.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int35 = randomDataImpl13.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution30);
        int int36 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution30);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-28.234349690367956d) + "'", double3 == (-28.234349690367956d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.436055942370468d + "'", double5 == 12.436055942370468d);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4d49e06dc6b6e393d880a53959ac2133efd94813fc1276875762" + "'", str9, "4d49e06dc6b6e393d880a53959ac2133efd94813fc1276875762");
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.8862891607057746E-46d + "'", double12 == 2.8862891607057746E-46d);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-67.80832758151362d) + "'", double16 == (-67.80832758151362d));
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 11.68699300129334d + "'", double18 == 11.68699300129334d);
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-20.445208491300235d) + "'", double21 == (-20.445208491300235d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 40.28902130497416d + "'", double25 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 94 + "'", int34 == 94);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        boolean boolean24 = hypergeometricDistribution17.isSupportConnected();
        int int25 = hypergeometricDistribution17.getSampleSize();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.77558815836423d) + "'", double3 == (-9.77558815836423d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.94362533918916d + "'", double5 == 6.94362533918916d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.01789939161484d + "'", double8 == 40.01789939161484d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistribution4.inverseCumulativeProbability((double) 55);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 55 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong((-647L), (long) 68);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = randomDataImpl0.nextHypergeometric(65, (-456893602), 30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-456,893,602)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.03481146287836d) + "'", double3 == (-9.03481146287836d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-403L) + "'", long6 == (-403L));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution4.inverseCumulativeProbability(93.62129009501939d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 93.621 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = randomDataImpl0.nextUniform((double) 667571320, (double) 0.3062036f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (667,571,320) must be strictly less than upper bound (0.306)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.833049734171404d + "'", double3 == 8.833049734171404d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0543007459573563d + "'", double8 == 1.0543007459573563d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "787aea009554ed2ce54c806d2688786b94" + "'", str10, "787aea009554ed2ce54c806d2688786b94");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        long long6 = randomDataImpl0.nextLong(0L, 100L);
        java.lang.String str8 = randomDataImpl0.nextSecureHexString((int) (short) 1);
        double double10 = randomDataImpl0.nextExponential(33.48468314808094d);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = randomDataImpl0.nextHypergeometric((-1737377827), 0, (-620293396));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1,737,377,827)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.4548314994900025E44d) + "'", double3 == (-6.4548314994900025E44d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 76L + "'", long6 == 76L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 65.6727688696044d + "'", double10 == 65.6727688696044d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double9 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(85L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        int int13 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        boolean boolean24 = hypergeometricDistribution17.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution17.reseedRandomGenerator(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 55.570162446207014d + "'", double3 == 55.570162446207014d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 14.165207018128743d + "'", double5 == 14.165207018128743d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-16.481124984573732d) + "'", double8 == (-16.481124984573732d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (-302861164));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = hypergeometricDistribution15.randomData;
        double double21 = hypergeometricDistribution15.probability((int) (short) 1);
        int int22 = hypergeometricDistribution15.getPopulationSize();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 67.05722657962522d + "'", double3 == 67.05722657962522d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.40620412317436394d + "'", double8 == 0.40620412317436394d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "98147704067c7d3ec2dafb5b9e7f88681e" + "'", str10, "98147704067c7d3ec2dafb5b9e7f88681e");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 26 + "'", int22 == 26);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextSecureHexString(10);
        randomDataImpl0.reSeedSecure((long) 100);
        double double10 = randomDataImpl0.nextGaussian(0.7615941559557649d, 99.99999999999999d);
        randomDataImpl0.reSeed(0L);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = randomDataImpl0.nextHypergeometric(3, (int) (byte) -1, 333075206);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.973268755554748E43d) + "'", double3 == (-2.973268755554748E43d));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d5e60aae30" + "'", str5, "d5e60aae30");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-96.80766564473491d) + "'", double10 == (-96.80766564473491d));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        float float7 = well19937c1.nextFloat();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = randomDataImpl8.nextHypergeometric((int) (short) 0, 33, (-1347491339));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.639133f + "'", float7 == 0.639133f);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution4.random;
        double double11 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = hypergeometricDistribution4.sample(65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = randomDataImpl0.nextT(0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 93.24700803292609d + "'", double3 == 93.24700803292609d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.230398463635571d + "'", double5 == 3.230398463635571d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-33.84570396772639d) + "'", double8 == (-33.84570396772639d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure(5492381562888477542L);
        java.lang.String str10 = randomDataImpl0.nextHexString(100);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        double double16 = hypergeometricDistribution15.getNumericalVariance();
        double double19 = hypergeometricDistribution15.cumulativeProbability(0, (int) (short) 100);
        double double20 = hypergeometricDistribution15.getNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator21 = hypergeometricDistribution15.random;
        double double24 = hypergeometricDistribution15.cumulativeProbability(50, (int) 'a');
        int int25 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = randomDataImpl0.nextSecureLong((long) 297988431, 63L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (297,988,431) must be strictly less than upper bound (63)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-46.54866782422487d) + "'", double3 == (-46.54866782422487d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "efa4e3a665abeb5646fc236bdc152ce60e6d873098e49e53e94ea296ca7ad7d7386f8e7f40a62879ed37a5efa121e6526fe9" + "'", str10, "efa4e3a665abeb5646fc236bdc152ce60e6d873098e49e53e94ea296ca7ad7d7386f8e7f40a62879ed37a5efa121e6526fe9");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int16 = hypergeometricDistribution4.getSupportLowerBound();
        int int17 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double8 = hypergeometricDistribution4.cumulativeProbability((-549865085));
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.Well19937c well19937c9 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int11 = well19937c9.nextInt(100);
        byte[] byteArray12 = new byte[] {};
        well19937c9.nextBytes(byteArray12);
        well19937c1.nextBytes(byteArray12);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator15 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator16 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = randomDataGenerator16.getRandomGenerator();
        int int21 = randomDataGenerator16.nextHypergeometric((int) ' ', 4, 1);
        long long23 = randomDataGenerator16.nextPoisson(122.37650717815256d);
        double double27 = randomDataGenerator16.nextUniform((double) 5.0f, 6.533193571063436d, true);
        java.lang.String str29 = randomDataGenerator16.nextSecureHexString(14);
        int int32 = randomDataGenerator16.nextInt(25, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 138L + "'", long23 == 138L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5.141125064579194d + "'", double27 == 5.141125064579194d);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "74f717d21e136e" + "'", str29, "74f717d21e136e");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = hypergeometricDistribution17.random;
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 55.31408570704304d + "'", double3 == 55.31408570704304d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.490410478396211d + "'", double5 == 6.490410478396211d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 60.0160300814895d + "'", double8 == 60.0160300814895d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertNull(randomGenerator24);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(23, 3, (-749437760));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-749,437,760)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        float float7 = well19937c1.nextFloat();
        double double8 = well19937c1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution12 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 44, 20, 72);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (72) must be less than or equal to population size (44)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.639133f + "'", float7 == 0.639133f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5548245223302555d + "'", double8 == 0.5548245223302555d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double11 = hypergeometricDistribution4.cumulativeProbability((-1973305895), (-671727047));
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.probability(30);
        double double13 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        int int7 = hypergeometricDistribution4.getSupportUpperBound();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(60);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.Well19937c well19937c9 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int11 = well19937c9.nextInt(100);
        byte[] byteArray12 = new byte[] {};
        well19937c9.nextBytes(byteArray12);
        well19937c1.nextBytes(byteArray12);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator15 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator16 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = randomDataGenerator16.getRandomGenerator();
        int int21 = randomDataGenerator16.nextHypergeometric((int) ' ', 4, 1);
        long long23 = randomDataGenerator16.nextPoisson(122.37650717815256d);
        double double27 = randomDataGenerator16.nextUniform((double) 5.0f, 6.533193571063436d, true);
        // The following exception was thrown during execution in test generation
        try {
            randomDataGenerator16.setSecureAlgorithm("f442c85a464a897e559586dec5f185ee5bf6659f3560876c54c60c5aeae590611803bb5e192aa66ee3c97dcfde", "686d67dd3994982eeded57cee4de61b63b0506f327136a4111a4150bdf12baf43fa6e644d5d");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: 686d67dd3994982eeded57cee4de61b63b0506f327136a4111a4150bdf12baf43fa6e644d5d");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 138L + "'", long23 == 138L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5.141125064579194d + "'", double27 == 5.141125064579194d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((-904L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        int int7 = hypergeometricDistribution4.getSupportUpperBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution4.inverseCumulativeProbability(2.1848485435704132E16d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 21,848,485,435,704,132 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double6 = hypergeometricDistribution4.cumulativeProbability(25);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double19 = hypergeometricDistribution15.getNumericalMean();
        org.apache.commons.math3.random.RandomGenerator randomGenerator20 = hypergeometricDistribution15.random;
        double double21 = hypergeometricDistribution15.calculateNumericalVariance();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 102.39522662814996d + "'", double3 == 102.39522662814996d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.5496208333219204d + "'", double8 == 1.5496208333219204d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "c297250d34d1765350e163df013c0a44af" + "'", str10, "c297250d34d1765350e163df013c0a44af");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.solveInverseCumulativeProbability(16.978032240674544d, 53, (-127));
        double double13 = hypergeometricDistribution4.probability(0);
        double double15 = hypergeometricDistribution4.cumulativeProbability((-408299265));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-127) + "'", int11 == (-127));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution4.random;
        double double11 = hypergeometricDistribution4.cumulativeProbability((-671727047));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (-1549912060), 19, (-1524340748));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1,549,912,060)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int10 = hypergeometricDistribution4.solveInverseCumulativeProbability(1.0465233942969707d, 0, 18);
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 18 + "'", int10 == 18);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability(55);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        boolean boolean2 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator3 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double4 = well19937c1.nextDouble();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl5 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution10 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator6, 26, 0, 11);
        double double11 = hypergeometricDistribution10.getNumericalVariance();
        double double14 = hypergeometricDistribution10.cumulativeProbability(0, (int) (short) 100);
        double double15 = hypergeometricDistribution10.getNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = hypergeometricDistribution10.random;
        int int17 = hypergeometricDistribution10.getSupportLowerBound();
        int int18 = randomDataImpl5.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = randomDataImpl5.nextInt((int) (short) -1, (-127));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (-1) must be strictly less than upper bound (-127)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.59548520266966d + "'", double4 == 0.59548520266966d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double8 = hypergeometricDistribution4.cumulativeProbability((-549865085));
        int int9 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = hypergeometricDistribution4.sample(32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 1, (-123285132), 80);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-123,285,132)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((-749437760), 21);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.solveInverseCumulativeProbability(16.978032240674544d, 53, (-127));
        double double13 = hypergeometricDistribution4.probability(0);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-127) + "'", int11 == (-127));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(17.688692811125733d, 0, 133);
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = hypergeometricDistribution4.random;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 133 + "'", int12 == 133);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(randomGenerator15);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = hypergeometricDistribution4.random;
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(randomGenerator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        int int7 = hypergeometricDistribution4.getSupportUpperBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(1.6803312731616593d, 97, 86);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.7615941559557649d, (-1973305895), 5);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        double double16 = hypergeometricDistribution4.cumulativeProbability(21);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        long long6 = randomDataImpl0.nextLong(0L, 100L);
        double double9 = randomDataImpl0.nextBeta(6.97614954873094d, (double) 15);
        randomDataImpl0.reSeed();
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        int int19 = hypergeometricDistribution15.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double20 = hypergeometricDistribution15.getNumericalVariance();
        boolean boolean21 = hypergeometricDistribution15.isSupportConnected();
        double double22 = hypergeometricDistribution15.getNumericalMean();
        int int23 = hypergeometricDistribution15.getSupportLowerBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = hypergeometricDistribution15.random;
        int int25 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        int int26 = hypergeometricDistribution15.getSampleSize();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.427762915750446E42d) + "'", double3 == (-3.427762915750446E42d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 56L + "'", long6 == 56L);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5514386386134281d + "'", double9 == 0.5514386386134281d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 94 + "'", int19 == 94);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(randomGenerator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.cumulativeProbability(0, 0);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability(0);
        boolean boolean17 = hypergeometricDistribution4.isSupportConnected();
        int int18 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        int int19 = hypergeometricDistribution15.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double20 = hypergeometricDistribution15.getNumericalVariance();
        boolean boolean21 = hypergeometricDistribution15.isSupportConnected();
        double double22 = hypergeometricDistribution15.getNumericalMean();
        int int23 = hypergeometricDistribution15.getSupportLowerBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = hypergeometricDistribution15.random;
        int int25 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        boolean boolean26 = hypergeometricDistribution15.isSupportConnected();
        double double28 = hypergeometricDistribution15.cumulativeProbability((-883));
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13.611238974941784d + "'", double3 == 13.611238974941784d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 27.77213310781597d + "'", double5 == 27.77213310781597d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.911621278064967d) + "'", double8 == (-9.911621278064967d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 94 + "'", int19 == 94);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(randomGenerator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.Well19937c well19937c9 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int11 = well19937c9.nextInt(100);
        byte[] byteArray12 = new byte[] {};
        well19937c9.nextBytes(byteArray12);
        well19937c1.nextBytes(byteArray12);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator15 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator16 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = randomDataGenerator16.getRandomGenerator();
        int int21 = randomDataGenerator16.nextHypergeometric((int) ' ', 4, 1);
        double double24 = randomDataGenerator16.nextF((double) 19, 0.004971420738312279d);
        double double27 = randomDataGenerator16.nextGaussian((double) (-1737377827), 1.1868043392514251d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.7036181146139355E12d + "'", double24 == 3.7036181146139355E12d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.7373778252810607E9d) + "'", double27 == (-1.7373778252810607E9d));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        int int24 = hypergeometricDistribution17.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = hypergeometricDistribution17.sample((-1737377827));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1,737,377,827)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 60.344753547496296d + "'", double3 == 60.344753547496296d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.821403697685247d + "'", double5 == 6.821403697685247d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-134.5662564659409d) + "'", double8 == (-134.5662564659409d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (-1510538017));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        long long6 = randomDataImpl0.nextLong(0L, 100L);
        double double8 = randomDataImpl0.nextChiSquare((double) 34);
        int int12 = randomDataImpl0.nextHypergeometric(76, 28, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = randomDataImpl0.nextPascal((-1347491339), (-4.75880795572113E42d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of successes (-1,347,491,339)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.384428663748849E43d + "'", double3 == 5.384428663748849E43d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 85L + "'", long6 == 85L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 33.055229783647675d + "'", double8 == 33.055229783647675d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        randomDataImpl0.reSeedSecure((long) 1);
        java.lang.String str9 = randomDataImpl0.nextHexString((int) '4');
        double double12 = randomDataImpl0.nextUniform(0.0d, (double) 1.4E-45f);
        double double16 = randomDataImpl0.nextUniform((-5.57205139769055E43d), 0.7615941559557649d, true);
        double double19 = randomDataImpl0.nextUniform(10.0d, 5281.0d);
        int int23 = randomDataImpl0.nextHypergeometric(80, 0, (int) (byte) 0);
        int int26 = randomDataImpl0.nextInt(10, 34);
        randomDataImpl0.reSeedSecure();
        double double31 = randomDataImpl0.nextUniform((-9.87358635583514E41d), 7.736374635978038d, true);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.417209991903242d + "'", double3 == 1.417209991903242d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.019657109765824d + "'", double5 == 11.019657109765824d);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "c3d0546ce03666b0454e613065a1a5407c23b213322bcc143feb" + "'", str9, "c3d0546ce03666b0454e613065a1a5407c23b213322bcc143feb");
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.557039709091488E-46d + "'", double12 == 9.557039709091488E-46d);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-5.360688995331043E43d) + "'", double16 == (-5.360688995331043E43d));
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 729.4938780322566d + "'", double19 == 729.4938780322566d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 26 + "'", int26 == 26);
// flaky:         org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-3.4472494086134E41d) + "'", double31 == (-3.4472494086134E41d));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        int[] intArray0 = null;
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c(intArray0);
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution5 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 189880147, 34, 47);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        double double13 = hypergeometricDistribution4.cumulativeProbability(71);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 26 + "'", int11 == 26);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.math3.random.Well19937c well19937c0 = new org.apache.commons.math3.random.Well19937c();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c0, 656115722, (-641359787), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-641,359,787)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, 34);
        int int10 = hypergeometricDistribution4.getPopulationSize();
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 26 + "'", int10 == 26);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double3 = randomDataGenerator0.nextCauchy((double) (byte) 100, 0.9942417312085655d);
        double double5 = randomDataGenerator0.nextExponential(0.010437607667123028d);
        int int9 = randomDataGenerator0.nextHypergeometric(195270565, 0, (int) '#');
        int int12 = randomDataGenerator0.nextInt((int) (short) 0, 100);
        double double14 = randomDataGenerator0.nextChiSquare(48.66378178851119d);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = randomDataGenerator0.nextLong(100L, 92L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (100) must be strictly less than upper bound (92)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.57361718666955d + "'", double3 == 100.57361718666955d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.021368128444027128d + "'", double5 == 0.021368128444027128d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 78 + "'", int12 == 78);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.11624559639254d + "'", double14 == 50.11624559639254d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = hypergeometricDistribution4.random;
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(randomGenerator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double12 = hypergeometricDistribution4.probability(21);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        long long6 = randomDataImpl0.nextLong(0L, 100L);
        java.lang.String str8 = randomDataImpl0.nextSecureHexString((int) (short) 1);
        randomDataImpl0.reSeedSecure();
        randomDataImpl0.reSeedSecure();
        double double13 = randomDataImpl0.nextUniform(0.0d, 12.28571764421483d);
        int int17 = randomDataImpl0.nextHypergeometric((int) (short) 10, 9, 0);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.1635674545531967E43d) + "'", double3 == (-2.1635674545531967E43d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 56L + "'", long6 == 56L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6" + "'", str8, "6");
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.30123458938215386d + "'", double13 == 0.30123458938215386d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = hypergeometricDistribution4.sample(35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1420463761));
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.inverseCumulativeProbability(100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator6 = hypergeometricDistribution4.random;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(randomGenerator6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        double double6 = randomDataImpl0.nextUniform((double) 5, (double) 2061458278L);
        int int10 = randomDataImpl0.nextHypergeometric(66, 4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = randomDataImpl0.nextPermutation(15, (-883));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: permutation size (-883");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7558311714374008E43d + "'", double3 == 1.7558311714374008E43d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.3907848060181038E9d + "'", double6 == 1.3907848060181038E9d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1420463761));
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1420463761));
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        int int24 = hypergeometricDistribution17.getNumberOfSuccesses();
        double double25 = hypergeometricDistribution17.calculateNumericalVariance();
        int int26 = hypergeometricDistribution17.getSupportUpperBound();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 121.08353956639837d + "'", double3 == 121.08353956639837d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 14.232042733873518d + "'", double5 == 14.232042733873518d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.849881459329225d) + "'", double8 == (-5.849881459329225d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = hypergeometricDistribution4.random;
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(randomGenerator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double3 = randomDataGenerator0.nextCauchy((double) (byte) 100, 0.9942417312085655d);
        double double5 = randomDataGenerator0.nextExponential(0.010437607667123028d);
        int int9 = randomDataGenerator0.nextHypergeometric(195270565, 0, (int) '#');
        int int12 = randomDataGenerator0.nextInt((int) (short) 0, 100);
        java.lang.String str14 = randomDataGenerator0.nextHexString(68);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 96.38853805645383d + "'", double3 == 96.38853805645383d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.011714127930382375d + "'", double5 == 0.011714127930382375d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "238dfa16c3cc96090bf27bff1768703d73b228c14efcb50c4574388f0697ce0d1e4d" + "'", str14, "238dfa16c3cc96090bf27bff1768703d73b228c14efcb50c4574388f0697ce0d1e4d");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.7615941559557649d, (-1973305895), 5);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((-6466278509201326734L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.7615941559557649d, (-1973305895), 5);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getPopulationSize();
        int int19 = hypergeometricDistribution4.solveInverseCumulativeProbability(2.4688167690187037E43d, 20, 0);
        int int20 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double3 = randomDataGenerator0.nextCauchy((double) (byte) 100, 0.9942417312085655d);
        double double5 = randomDataGenerator0.nextExponential(0.010437607667123028d);
        randomDataGenerator0.reSeedSecure((long) (-127));
        double double10 = randomDataGenerator0.nextWeibull(100.74114060620988d, 2.4258259770489514E8d);
        int int14 = randomDataGenerator0.nextHypergeometric(59, (int) (byte) 1, 55);
        double double17 = randomDataGenerator0.nextWeibull(0.9999999985348818d, 73.39468820861818d);
        java.lang.String str19 = randomDataGenerator0.nextSecureHexString((int) (byte) 100);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.48364765044734d + "'", double3 == 100.48364765044734d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.006227801314817844d + "'", double5 == 0.006227801314817844d);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.443302423989029E8d + "'", double10 == 2.443302423989029E8d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 87.51809588500093d + "'", double17 == 87.51809588500093d);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "dc233b28f176ab458bfd9af4d0c7ed3730a6df1d041b4918f0f9743be9a73cd971e78b93a0797662a79ff35b517b09fbce8e" + "'", str19, "dc233b28f176ab458bfd9af4d0c7ed3730a6df1d041b4918f0f9743be9a73cd971e78b93a0797662a79ff35b517b09fbce8e");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.probability(30);
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1420463761));
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl12 = hypergeometricDistribution4.randomData;
        randomDataImpl12.reSeedSecure((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double11 = hypergeometricDistribution4.cumulativeProbability((-1973305895), (-671727047));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample((-1737377827));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1,737,377,827)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        long long6 = randomDataImpl0.nextLong(0L, 100L);
        double double9 = randomDataImpl0.nextBeta(6.97614954873094d, (double) 15);
        randomDataImpl0.reSeed();
        int[] intArray13 = randomDataImpl0.nextPermutation(71, 60);
        org.apache.commons.math3.random.Well19937c well19937c14 = new org.apache.commons.math3.random.Well19937c(intArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution18 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c14, 92, (-546767596), (-446890937));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-546,767,596)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5936993683938072E43d) + "'", double3 == (-1.5936993683938072E43d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 70L + "'", long6 == 70L);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.23552373017427222d + "'", double9 == 0.23552373017427222d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[38, 46, 51, 56, 17, 59, 61, 22, 29, 16, 63, 66, 58, 28, 57, 20, 8, 12, 43, 36, 65, 37, 27, 9, 18, 54, 41, 11, 23, 49, 69, 24, 62, 33, 42, 55, 25, 0, 15, 7, 40, 35, 52, 70, 60, 1, 67, 6, 45, 14, 19, 53, 48, 32, 47, 26, 5, 13, 68, 30]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        int int7 = hypergeometricDistribution4.getSupportUpperBound();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1420463761));
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl12 = hypergeometricDistribution4.randomData;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = randomDataImpl12.nextF(0.0d, 78.85179614764257d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl12);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.7615941559557649d, (-1973305895), 5);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getPopulationSize();
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        randomDataImpl0.reSeedSecure((long) 1);
        double double10 = randomDataImpl0.nextUniform((-0.593314096025658d), 77.06164007195025d);
        java.lang.String str12 = randomDataImpl0.nextSecureHexString(90);
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution18 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator14, 26, 0, 11);
        double double19 = hypergeometricDistribution18.getNumericalVariance();
        double double20 = hypergeometricDistribution18.getNumericalVariance();
        int int21 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution18);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.49160769159074d + "'", double3 == 49.49160769159074d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.334362883631584d + "'", double5 == 9.334362883631584d);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.37439001881589085d) + "'", double10 == (-0.37439001881589085d));
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "9b4b2889163c355b7dd46b908d3f737a231aa845bb1d10fc5606ea227db7daffa5c14bf210a58a39214324dbeb" + "'", str12, "9b4b2889163c355b7dd46b908d3f737a231aa845bb1d10fc5606ea227db7daffa5c14bf210a58a39214324dbeb");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        int int24 = hypergeometricDistribution17.getNumberOfSuccesses();
        double double26 = hypergeometricDistribution17.cumulativeProbability((int) (byte) 0);
        int int27 = hypergeometricDistribution17.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = hypergeometricDistribution17.sample((-133136159));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-133,136,159)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-36.70657210096625d) + "'", double3 == (-36.70657210096625d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.346188177165676d + "'", double5 == 12.346188177165676d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-11.006443778254361d) + "'", double8 == (-11.006443778254361d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.probability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double3 = randomDataGenerator0.nextBeta(1.5127195827191767E43d, 5.8059341211821325d);
        randomDataGenerator0.reSeed(947811292274769225L);
        int int8 = randomDataGenerator0.nextSecureInt(4, 100);
        int int11 = randomDataGenerator0.nextInt(0, 76);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = randomDataGenerator0.nextHypergeometric(2085434562, (-450427520), 12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-450,427,520)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure(5492381562888477542L);
        java.lang.String str10 = randomDataImpl0.nextHexString(100);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        double double16 = hypergeometricDistribution15.getNumericalVariance();
        double double19 = hypergeometricDistribution15.cumulativeProbability(0, (int) (short) 100);
        double double20 = hypergeometricDistribution15.getNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator21 = hypergeometricDistribution15.random;
        double double24 = hypergeometricDistribution15.cumulativeProbability(50, (int) 'a');
        int int25 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        int int26 = hypergeometricDistribution15.getSupportUpperBound();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 87.70997635518417d + "'", double3 == 87.70997635518417d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "89bffb0e7a64a97224574ccc13c3024660ad3e34cdbee84efb26fd101b695cd68cb026de80058508dd38e678fc7c9b8984ed" + "'", str10, "89bffb0e7a64a97224574ccc13c3024660ad3e34cdbee84efb26fd101b695cd68cb026de80058508dd38e678fc7c9b8984ed");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double6 = hypergeometricDistribution4.cumulativeProbability(93);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        long long6 = randomDataImpl0.nextLong(0L, 100L);
        double double9 = randomDataImpl0.nextBeta(6.97614954873094d, (double) 15);
        randomDataImpl0.reSeed();
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        int int19 = hypergeometricDistribution15.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double20 = hypergeometricDistribution15.getNumericalVariance();
        boolean boolean21 = hypergeometricDistribution15.isSupportConnected();
        double double22 = hypergeometricDistribution15.getNumericalMean();
        int int23 = hypergeometricDistribution15.getSupportLowerBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = hypergeometricDistribution15.random;
        int int25 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = randomDataImpl0.nextHexString((-123285132));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: length (-123,285,132)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.134847765305523E43d + "'", double3 == 4.134847765305523E43d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 56L + "'", long6 == 56L);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.21537684082029254d + "'", double9 == 0.21537684082029254d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 94 + "'", int19 == 94);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(randomGenerator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution4.random;
        double double11 = hypergeometricDistribution4.probability((-678979973));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double12 = hypergeometricDistribution4.probability(21);
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.inverseCumulativeProbability(2.1848485435704132E16d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 21,848,485,435,704,132 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = hypergeometricDistribution4.cumulativeProbability(7, 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (7) must be less than or equal to upper endpoint (5)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.7615941559557649d, (-1973305895), 5);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getPopulationSize();
        int int19 = hypergeometricDistribution4.solveInverseCumulativeProbability(2.4688167690187037E43d, 20, 0);
        int int20 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        int int7 = hypergeometricDistribution4.getSupportUpperBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(195270565);
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        int int24 = hypergeometricDistribution17.getNumberOfSuccesses();
        double double26 = hypergeometricDistribution17.cumulativeProbability((int) (byte) 0);
        int int27 = hypergeometricDistribution17.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = hypergeometricDistribution17.inverseCumulativeProbability((-4.97631357640265E43d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -49,763,135,764,026,500,000,000,000,000,000,000,000,000,000 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 115.55471952146982d + "'", double3 == 115.55471952146982d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7529416837635695d + "'", double5 == 0.7529416837635695d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.9275508292477905d + "'", double8 == 3.9275508292477905d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        double double9 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1420463761));
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        randomDataImpl0.reSeedSecure((long) 1);
        java.lang.String str9 = randomDataImpl0.nextHexString((int) '4');
        double double12 = randomDataImpl0.nextUniform(0.0d, (double) 1.4E-45f);
        double double16 = randomDataImpl0.nextUniform((-5.57205139769055E43d), 0.7615941559557649d, true);
        double double19 = randomDataImpl0.nextUniform(10.0d, 5281.0d);
        int int23 = randomDataImpl0.nextHypergeometric(80, 0, (int) (byte) 0);
        int int26 = randomDataImpl0.nextInt(10, 34);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = randomDataImpl0.nextGamma(24.03960002683069d, (-3.3603529390562175d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: scale (-3.36)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 121.46706999054263d + "'", double3 == 121.46706999054263d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.12651935515424068d + "'", double5 == 0.12651935515424068d);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4738755478f3177b8b6995b20e85479832158c8934a3e5a15d3a" + "'", str9, "4738755478f3177b8b6995b20e85479832158c8934a3e5a15d3a");
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.302190663776682E-46d + "'", double12 == 8.302190663776682E-46d);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-4.0428040839724844E43d) + "'", double16 == (-4.0428040839724844E43d));
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4812.575273192576d + "'", double19 == 4812.575273192576d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 17 + "'", int26 == 17);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        boolean boolean2 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator3 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double4 = well19937c1.nextDouble();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl5 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution10 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator6, 26, 0, 11);
        double double11 = hypergeometricDistribution10.getNumericalVariance();
        double double14 = hypergeometricDistribution10.cumulativeProbability(0, (int) (short) 100);
        double double15 = hypergeometricDistribution10.getNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = hypergeometricDistribution10.random;
        int int17 = hypergeometricDistribution10.getSupportLowerBound();
        int int18 = randomDataImpl5.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution10);
        randomDataImpl5.reSeed(49L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.59548520266966d + "'", double4 == 0.59548520266966d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double8 = hypergeometricDistribution4.cumulativeProbability((-549865085));
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 26 + "'", int10 == 26);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        double double9 = hypergeometricDistribution4.calculateNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = hypergeometricDistribution4.randomData;
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = hypergeometricDistribution4.sample(60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = hypergeometricDistribution4.random;
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        double double15 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(randomGenerator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 26 + "'", int11 == 26);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double21 = randomDataImpl0.nextGaussian(49.49160769159074d, (double) 69L);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.509274529678386d + "'", double3 == 9.509274529678386d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.027480698682717d + "'", double8 == 2.027480698682717d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5e3a7c40e8b820fd1eae5f49a42f9f6953" + "'", str10, "5e3a7c40e8b820fd1eae5f49a42f9f6953");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + 93.76986543256146d + "'", double21 == 93.76986543256146d);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(34, 0, (-2147483648));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-2,147,483,648)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability((-678979973));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = hypergeometricDistribution15.randomData;
        int[] intArray22 = randomDataImpl19.nextPermutation(57, 16);
        double double25 = randomDataImpl19.nextUniform(0.0d, 5.568313098272951E43d);
        // The following exception was thrown during execution in test generation
        try {
            randomDataImpl19.setSecureAlgorithm("b97909e1da926c518363e819e5dcab44bd", "7233d");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: 7233d");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 145.771926118049d + "'", double3 == 145.771926118049d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.5803148947200363d + "'", double8 == 1.5803148947200363d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3f527e6f9898479820510a4872bbfccf52" + "'", str10, "3f527e6f9898479820510a4872bbfccf52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl19);
        org.junit.Assert.assertNotNull(intArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 30, 50, 34, 46, 16, 27, 37, 23, 56, 38, 31, 26, 24, 17, 40]");
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.340974209167516E43d + "'", double25 == 1.340974209167516E43d);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        int int7 = hypergeometricDistribution4.getSampleSize();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (-1540183322));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.solveInverseCumulativeProbability(16.978032240674544d, 53, (-127));
        double double12 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-127) + "'", int11 == (-127));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double19 = hypergeometricDistribution15.getNumericalMean();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl20 = hypergeometricDistribution15.randomData;
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl21 = hypergeometricDistribution15.randomData;
        double double24 = hypergeometricDistribution15.cumulativeProbability(14, 29);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.203024670518879d + "'", double3 == 9.203024670518879d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.053634876589237d + "'", double8 == 1.053634876589237d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ff59d49f8c65b9b3188cf3233662bf5c9d" + "'", str10, "ff59d49f8c65b9b3188cf3233662bf5c9d");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl20);
        org.junit.Assert.assertNotNull(randomDataImpl21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int16 = hypergeometricDistribution4.getSupportLowerBound();
        double double18 = hypergeometricDistribution4.upperCumulativeProbability(15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.7615941559557649d, (-1973305895), 5);
        double double14 = hypergeometricDistribution4.cumulativeProbability(54);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 19631068, 7, 22);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        randomDataImpl0.reSeedSecure((long) 1);
        java.lang.String str9 = randomDataImpl0.nextHexString((int) '4');
        double double12 = randomDataImpl0.nextUniform(0.0d, (double) 1.4E-45f);
        double double16 = randomDataImpl0.nextUniform((-5.57205139769055E43d), 0.7615941559557649d, true);
        double double19 = randomDataImpl0.nextUniform(10.0d, 5281.0d);
        int int23 = randomDataImpl0.nextHypergeometric(80, 0, (int) (byte) 0);
        long long25 = randomDataImpl0.nextPoisson(29.300360760419576d);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 114.87613672277678d + "'", double3 == 114.87613672277678d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.6192266441861536d + "'", double5 == 1.6192266441861536d);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d368a5bc1da7b013e024a09facb0c2b5c32235deb216a6b559ff" + "'", str9, "d368a5bc1da7b013e024a09facb0c2b5c32235deb216a6b559ff");
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.967856244400735E-46d + "'", double12 == 4.967856244400735E-46d);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.1440832475594116E43d) + "'", double16 == (-2.1440832475594116E43d));
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3554.3815981819557d + "'", double19 == 3554.3815981819557d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 26L + "'", long25 == 26L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(17.688692811125733d, 0, 133);
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = hypergeometricDistribution4.random;
        int int16 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 133 + "'", int12 == 133);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(randomGenerator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.inverseCumulativeProbability(4.178511890613213d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 4.179 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.probability(78);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution4.random;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample(62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator11);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.probability(33);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl13 = hypergeometricDistribution4.randomData;
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        int int19 = hypergeometricDistribution15.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double20 = hypergeometricDistribution15.getNumericalVariance();
        boolean boolean21 = hypergeometricDistribution15.isSupportConnected();
        double double22 = hypergeometricDistribution15.getNumericalMean();
        int int23 = hypergeometricDistribution15.getSupportLowerBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = hypergeometricDistribution15.random;
        int int25 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution15.reseedRandomGenerator(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 65.75137819706325d + "'", double3 == 65.75137819706325d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 31.537657774118482d + "'", double5 == 31.537657774118482d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.7237083118725645d + "'", double8 == 3.7237083118725645d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 94 + "'", int19 == 94);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(randomGenerator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextSecureHexString(10);
        randomDataImpl0.reSeedSecure((long) 100);
        double double9 = randomDataImpl0.nextChiSquare(0.024246733395689703d);
        randomDataImpl0.reSeedSecure();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = randomDataImpl0.nextHypergeometric(89, 40433804, 13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (40,433,804) must be less than or equal to population size (89)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.2959503264413112E44d + "'", double3 == 2.2959503264413112E44d);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "b2720acad0" + "'", str5, "b2720acad0");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7794251422521835E-9d + "'", double9 == 1.7794251422521835E-9d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        int int24 = hypergeometricDistribution17.getNumberOfSuccesses();
        double double26 = hypergeometricDistribution17.cumulativeProbability((int) (byte) 0);
        int int27 = hypergeometricDistribution17.getSampleSize();
        double double29 = hypergeometricDistribution17.cumulativeProbability(75);
        int int30 = hypergeometricDistribution17.getPopulationSize();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.92446962766238d + "'", double3 == 104.92446962766238d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 27.31712820133916d + "'", double5 == 27.31712820133916d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-69.93596973064406d) + "'", double8 == (-69.93596973064406d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 26 + "'", int30 == 26);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        int int9 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution4.inverseCumulativeProbability((-6.2622975025989796E18d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -6,262,297,502,598,979,600 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        int int24 = hypergeometricDistribution17.getNumberOfSuccesses();
        double double26 = hypergeometricDistribution17.cumulativeProbability(656115722);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution17.reseedRandomGenerator(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.73738957042113d + "'", double3 == 104.73738957042113d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 18.250532945672507d + "'", double5 == 18.250532945672507d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.626374047691014d) + "'", double8 == (-1.626374047691014d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        well19937c1.setSeed((long) 4);
        float float8 = well19937c1.nextFloat();
        boolean boolean9 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.Well19937c well19937c11 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int13 = well19937c11.nextInt(100);
        well19937c11.clear();
        int int15 = well19937c11.nextInt();
        long long16 = well19937c11.nextLong();
        float float17 = well19937c11.nextFloat();
        double double18 = well19937c11.nextDouble();
        org.apache.commons.math3.random.Well19937c well19937c20 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int22 = well19937c20.nextInt(100);
        byte[] byteArray23 = new byte[] {};
        well19937c20.nextBytes(byteArray23);
        well19937c11.nextBytes(byteArray23);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl26 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c11);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl27 = new org.apache.commons.math3.random.RandomDataImpl();
        double double30 = randomDataImpl27.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double32 = randomDataImpl27.nextExponential((double) 10L);
        randomDataImpl27.reSeedSecure((long) 1);
        double double37 = randomDataImpl27.nextUniform((-0.593314096025658d), 77.06164007195025d);
        int[] intArray40 = randomDataImpl27.nextPermutation(34, 4);
        well19937c11.setSeed(intArray40);
        well19937c1.setSeed(intArray40);
        double double43 = well19937c1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution47 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 48, 483147787, 9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (483,147,787) must be less than or equal to population size (48)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.045464873f + "'", float8 == 0.045464873f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1737377827) + "'", int15 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 8853895889823578499L + "'", long16 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.639133f + "'", float17 == 0.639133f);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5548245223302555d + "'", double18 == 0.5548245223302555d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
// flaky:         org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.4698702565102124d) + "'", double30 == (-0.4698702565102124d));
// flaky:         org.junit.Assert.assertTrue("'" + double32 + "' != '" + 16.722372098939445d + "'", double32 == 16.722372098939445d);
// flaky:         org.junit.Assert.assertTrue("'" + double37 + "' != '" + 53.29054140972715d + "'", double37 == 53.29054140972715d);
        org.junit.Assert.assertNotNull(intArray40);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[22, 2, 4, 10]");
// flaky:         org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.8822605493805692d) + "'", double43 == (-0.8822605493805692d));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 4, (int) (short) 100, 22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = hypergeometricDistribution15.randomData;
        double double21 = hypergeometricDistribution15.probability((int) (short) 1);
        int int22 = hypergeometricDistribution15.getSupportLowerBound();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 37.29776056205965d + "'", double3 == 37.29776056205965d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.06690640592620664d + "'", double8 == 0.06690640592620664d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4d81277e6cd04d3ec4234665be16980be3" + "'", str10, "4d81277e6cd04d3ec4234665be16980be3");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        int int24 = hypergeometricDistribution17.getSupportLowerBound();
        int int25 = hypergeometricDistribution17.getSupportLowerBound();
        int int26 = hypergeometricDistribution17.getSupportLowerBound();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 29.626306083110247d + "'", double3 == 29.626306083110247d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6000970070055969d + "'", double5 == 0.6000970070055969d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.487000024880838d + "'", double8 == 6.487000024880838d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        randomDataImpl0.reSeedSecure((long) 1);
        int int10 = randomDataImpl0.nextSecureInt(51, (int) 'a');
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        double double16 = hypergeometricDistribution15.getNumericalVariance();
        int int20 = hypergeometricDistribution15.solveInverseCumulativeProbability((-1.0d), 1, 66);
        int int21 = hypergeometricDistribution15.getSupportLowerBound();
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        int int26 = randomDataImpl0.nextHypergeometric(80, 28, 0);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 125.89867267869019d + "'", double3 == 125.89867267869019d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.040747035123862574d + "'", double5 == 0.040747035123862574d);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 83 + "'", int10 == 83);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double19 = hypergeometricDistribution15.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = hypergeometricDistribution15.sample(18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 14.85955594278424d + "'", double3 == 14.85955594278424d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15458959017539406d + "'", double8 == 0.15458959017539406d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8ac444015dd81278aa8fcaf59282fe2956" + "'", str10, "8ac444015dd81278aa8fcaf59282fe2956");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.Well19937c well19937c9 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int11 = well19937c9.nextInt(100);
        byte[] byteArray12 = new byte[] {};
        well19937c9.nextBytes(byteArray12);
        well19937c1.nextBytes(byteArray12);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator15 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator16 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = randomDataGenerator16.getRandomGenerator();
        int int21 = randomDataGenerator16.nextHypergeometric((int) ' ', 4, 1);
        long long23 = randomDataGenerator16.nextPoisson(122.37650717815256d);
        double double27 = randomDataGenerator16.nextUniform((double) 5.0f, 6.533193571063436d, true);
        java.lang.String str29 = randomDataGenerator16.nextSecureHexString(14);
        java.lang.String str31 = randomDataGenerator16.nextSecureHexString(59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 138L + "'", long23 == 138L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5.141125064579194d + "'", double27 == 5.141125064579194d);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "5d9f114906e555" + "'", str29, "5d9f114906e555");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "7bb87f1fe83ef9f1062543d0250f020e3bbe76652c1bf0f12c853c5b553" + "'", str31, "7bb87f1fe83ef9f1062543d0250f020e3bbe76652c1bf0f12c853c5b553");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistribution4.inverseCumulativeProbability(4.133841672760741d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 4.134 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double26 = hypergeometricDistribution17.cumulativeProbability(41, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (41) must be less than or equal to upper endpoint (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 67.28673825496561d + "'", double3 == 67.28673825496561d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.889899967353626d + "'", double5 == 9.889899967353626d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.218491737296644d) + "'", double8 == (-5.218491737296644d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double3 = randomDataGenerator0.nextGamma(2.993222846126381d, 63.18646759321859d);
        double double6 = randomDataGenerator0.nextGamma(12.657048160990792d, 4.9E-324d);
        randomDataGenerator0.reSeedSecure();
        randomDataGenerator0.reSeedSecure((long) (short) 0);
        double double12 = randomDataGenerator0.nextCauchy(71.13581834011022d, 5.5145091029462E19d);
        randomDataGenerator0.reSeed();
        long long15 = randomDataGenerator0.nextPoisson(147.4131591025766d);
        int int19 = randomDataGenerator0.nextHypergeometric(69, 7, 0);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 91.90571679994608d + "'", double3 == 91.90571679994608d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.4E-323d + "'", double6 == 5.4E-323d);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-5.155828123750112E19d) + "'", double12 == (-5.155828123750112E19d));
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 130L + "'", long15 == 130L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistribution4.inverseCumulativeProbability(41.52391260276637d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 41.524 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = hypergeometricDistribution15.randomData;
        double double21 = hypergeometricDistribution15.probability((int) (short) 1);
        int int22 = hypergeometricDistribution15.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = hypergeometricDistribution15.sample(34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 126.36117110992546d + "'", double3 == 126.36117110992546d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.7875863609052294d + "'", double8 == 3.7875863609052294d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cad7582dc654124200f882aa61c0d07770" + "'", str10, "cad7582dc654124200f882aa61c0d07770");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        double double25 = hypergeometricDistribution17.probability(35);
        int int29 = hypergeometricDistribution17.solveInverseCumulativeProbability(3.5436037337927296E44d, 1284056353, 33);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 123.93095879333947d + "'", double3 == 123.93095879333947d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.116689567988969d + "'", double5 == 6.116689567988969d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-7.713400159321621d) + "'", double8 == (-7.713400159321621d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 33 + "'", int29 == 33);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double9 = randomDataImpl6.nextGaussian(4.4E-323d, 37.91351998979613d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator10, 26, 0, 11);
        double double15 = hypergeometricDistribution14.getNumericalVariance();
        double double18 = hypergeometricDistribution14.cumulativeProbability(90, (int) (byte) 100);
        int int19 = hypergeometricDistribution14.getSupportLowerBound();
        double double21 = hypergeometricDistribution14.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator22 = hypergeometricDistribution14.random;
        int int23 = hypergeometricDistribution14.getSupportLowerBound();
        int int24 = hypergeometricDistribution14.getSupportLowerBound();
        int int25 = hypergeometricDistribution14.getNumberOfSuccesses();
        int int26 = randomDataImpl6.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        int int29 = randomDataImpl6.nextInt(28, 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-35.58988939076301d) + "'", double9 == (-35.58988939076301d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 30 + "'", int29 == 30);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double19 = hypergeometricDistribution15.getNumericalMean();
        double double20 = hypergeometricDistribution15.getNumericalVariance();
        double double22 = hypergeometricDistribution15.cumulativeProbability(43);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.615025088380676d + "'", double3 == 4.615025088380676d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.24335349396969d + "'", double8 == 0.24335349396969d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "30c267d7082c2ec30d1ebf2977d95fc6f4" + "'", str10, "30c267d7082c2ec30d1ebf2977d95fc6f4");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        float float8 = well19937c1.nextFloat();
        long long10 = well19937c1.nextLong(8853895889823578499L);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl11 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        int int14 = randomDataImpl11.nextSecureInt((-883), 93);
        double double18 = randomDataImpl11.nextUniform((-6.536919787513899d), 91.90571679994608d, false);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = randomDataImpl11.nextHypergeometric(58, 15, 195270565);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (195,270,565) must be less than or equal to population size (58)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.27873123f + "'", float8 == 0.27873123f);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5492381562888477542L + "'", long10 == 5492381562888477542L);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-705) + "'", int14 == (-705));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 79.30255564112178d + "'", double18 == 79.30255564112178d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.cumulativeProbability(0, 0);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability(0);
        boolean boolean17 = hypergeometricDistribution4.isSupportConnected();
        double double19 = hypergeometricDistribution4.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.7615941559557649d, (-1973305895), 5);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample(220194363);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution4.random;
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(randomGenerator9);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double6 = hypergeometricDistribution4.probability(34);
        double double8 = hypergeometricDistribution4.probability(54);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        int int7 = hypergeometricDistribution4.getSupportUpperBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(195270565);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        int int24 = hypergeometricDistribution17.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = hypergeometricDistribution17.sample(25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 115.17743036403996d + "'", double3 == 115.17743036403996d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.054093841667676d + "'", double5 == 30.054093841667676d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.29557445330676d + "'", double8 == 40.29557445330676d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = hypergeometricDistribution15.randomData;
        double double21 = hypergeometricDistribution15.probability((int) (short) 1);
        int int22 = hypergeometricDistribution15.getSupportUpperBound();
        double double23 = hypergeometricDistribution15.getNumericalVariance();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-38.67210661181334d) + "'", double3 == (-38.67210661181334d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.213928046270784d + "'", double8 == 0.213928046270784d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0701efff7d4997579832f2a5939662a391" + "'", str10, "0701efff7d4997579832f2a5939662a391");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        double double9 = hypergeometricDistribution4.calculateNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = hypergeometricDistribution4.randomData;
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        int int9 = hypergeometricDistribution4.getSampleSize();
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution4.random;
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertNull(randomGenerator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(randomGenerator12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability(60258698);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = hypergeometricDistribution4.randomData;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(randomDataImpl10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        well19937c1.setSeed((long) 5);
        int[] intArray11 = new int[] { (-408299265) };
        well19937c1.setSeed(intArray11);
        long long14 = well19937c1.nextLong(20L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution18 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, (-549865085), 59, (-201810873));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-549,865,085)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-408299265]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5L + "'", long14 == 5L);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = hypergeometricDistribution15.randomData;
        double double21 = hypergeometricDistribution15.probability((int) (short) 1);
        int int22 = hypergeometricDistribution15.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = hypergeometricDistribution15.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5182785983634233d) + "'", double3 == (-0.5182785983634233d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.28696586222036913d + "'", double8 == 0.28696586222036913d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8bf012aa321e1670af103815a3a6d39760" + "'", str10, "8bf012aa321e1670af103815a3a6d39760");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        float float7 = well19937c1.nextFloat();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double11 = randomDataImpl8.nextGaussian((-1.8857408611296655E43d), 0.4164855022340841d);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl12 = new org.apache.commons.math3.random.RandomDataImpl();
        double double15 = randomDataImpl12.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double17 = randomDataImpl12.nextExponential((double) 10L);
        double double20 = randomDataImpl12.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl12.reSeed((long) (byte) 10);
        double double24 = randomDataImpl12.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator25 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution29 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator25, 26, 0, 11);
        int int33 = hypergeometricDistribution29.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int34 = randomDataImpl12.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution29);
        int int35 = hypergeometricDistribution29.getSampleSize();
        boolean boolean36 = hypergeometricDistribution29.isSupportConnected();
        int int37 = randomDataImpl8.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.639133f + "'", float7 == 0.639133f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.8857408611296655E43d) + "'", double11 == (-1.8857408611296655E43d));
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 48.315290838358955d + "'", double15 == 48.315290838358955d);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 18.697075964529542d + "'", double17 == 18.697075964529542d);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-109.97935185282077d) + "'", double20 == (-109.97935185282077d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 40.28902130497416d + "'", double24 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 94 + "'", int33 == 94);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 11 + "'", int35 == 11);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.cumulativeProbability(47);
        double double13 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextT(32.62666636167908d);
        double double15 = randomDataImpl0.nextWeibull((double) 36, 26.77026101949342d);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = randomDataImpl0.nextHypergeometric((-1737377827), (int) (byte) -1, 656115722);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1,737,377,827)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 137.8930259330602d + "'", double3 == 137.8930259330602d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.075416489806315d + "'", double5 == 3.075416489806315d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-6.399531349335729d) + "'", double8 == (-6.399531349335729d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.23256581268324156d) + "'", double12 == (-0.23256581268324156d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 27.624214403404665d + "'", double15 == 27.624214403404665d);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        int int9 = hypergeometricDistribution4.getSampleSize();
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution4.random;
        double double11 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertNull(randomGenerator10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = hypergeometricDistribution15.randomData;
        int[] intArray22 = randomDataImpl19.nextPermutation(57, 16);
        double double25 = randomDataImpl19.nextUniform(0.0d, 5.568313098272951E43d);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = randomDataImpl19.nextHypergeometric(89, (-620293396), 107);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-620,293,396)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 71.7280792637282d + "'", double3 == 71.7280792637282d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.65419274488701E-4d + "'", double8 == 5.65419274488701E-4d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "575a2465bdad67a5633752119956d54192" + "'", str10, "575a2465bdad67a5633752119956d54192");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl19);
        org.junit.Assert.assertNotNull(intArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[55, 29, 16, 42, 8, 11, 51, 15, 53, 31, 13, 30, 25, 23, 10, 22]");
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.012604551326697E43d + "'", double25 == 5.012604551326697E43d);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.Well19937c well19937c9 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int11 = well19937c9.nextInt(100);
        byte[] byteArray12 = new byte[] {};
        well19937c9.nextBytes(byteArray12);
        well19937c1.nextBytes(byteArray12);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator15 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator16 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = randomDataGenerator16.getRandomGenerator();
        int int21 = randomDataGenerator16.nextHypergeometric((int) ' ', 4, 1);
        long long23 = randomDataGenerator16.nextPoisson(122.37650717815256d);
        double double27 = randomDataGenerator16.nextUniform((double) 5.0f, 6.533193571063436d, true);
        java.lang.String str29 = randomDataGenerator16.nextSecureHexString(14);
        double double31 = randomDataGenerator16.nextChiSquare(6.931471805599453d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 138L + "'", long23 == 138L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5.141125064579194d + "'", double27 == 5.141125064579194d);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "6653ca1643e802" + "'", str29, "6653ca1643e802");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 8.000357362692608d + "'", double31 == 8.000357362692608d);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        int int11 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1420463761));
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.1289525260608461d);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = hypergeometricDistribution4.cumulativeProbability(17, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (17) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = hypergeometricDistribution15.randomData;
        double double21 = hypergeometricDistribution15.probability((int) (short) 1);
        int int22 = hypergeometricDistribution15.getSupportUpperBound();
        boolean boolean23 = hypergeometricDistribution15.isSupportConnected();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.61738595698235d + "'", double3 == 52.61738595698235d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9081767387283888d + "'", double8 == 0.9081767387283888d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "da6dc0b2c32a5a626c47923286d04da20c" + "'", str10, "da6dc0b2c32a5a626c47923286d04da20c");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double3 = randomDataGenerator0.nextCauchy((double) (byte) 100, 0.9942417312085655d);
        double double5 = randomDataGenerator0.nextExponential(0.010437607667123028d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator6 = randomDataGenerator0.getRandomGenerator();
        double double7 = randomGenerator6.nextDouble();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator8 = new org.apache.commons.math3.random.RandomDataGenerator();
        int[] intArray11 = randomDataGenerator8.nextPermutation((int) (short) 10, 4);
        randomDataGenerator8.reSeedSecure();
        long long15 = randomDataGenerator8.nextSecureLong((long) 0, 26L);
        double double18 = randomDataGenerator8.nextGaussian(149.39848428018317d, 99.34268882039882d);
        int[] intArray21 = randomDataGenerator8.nextPermutation(30, 16);
        randomGenerator6.setSeed(intArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution26 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator6, (-1023), (-671727047), 65);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1,023)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 93.96139795043224d + "'", double3 == 93.96139795043224d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.005386380411309639d + "'", double5 == 0.005386380411309639d);
        org.junit.Assert.assertNotNull(randomGenerator6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.28441280878197306d + "'", double7 == 0.28441280878197306d);
        org.junit.Assert.assertNotNull(intArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[7, 9, 1, 3]");
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 73.64275189591424d + "'", double18 == 73.64275189591424d);
        org.junit.Assert.assertNotNull(intArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[26, 16, 19, 8, 9, 23, 2, 14, 6, 22, 24, 5, 4, 7, 11, 1]");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        int int24 = hypergeometricDistribution17.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl25 = hypergeometricDistribution17.randomData;
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-26.56607497445294d) + "'", double3 == (-26.56607497445294d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.975908561884265d + "'", double5 == 3.975908561884265d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-11.81705850435557d) + "'", double8 == (-11.81705850435557d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl25);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        java.lang.String str5 = randomDataImpl0.nextSecureHexString(10);
        randomDataImpl0.reSeedSecure((long) 100);
        double double10 = randomDataImpl0.nextGaussian(0.7615941559557649d, 99.99999999999999d);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl11 = new org.apache.commons.math3.random.RandomDataImpl();
        double double14 = randomDataImpl11.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double16 = randomDataImpl11.nextExponential((double) 10L);
        double double19 = randomDataImpl11.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl11.reSeed((long) (byte) 10);
        double double23 = randomDataImpl11.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution28 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator24, 26, 0, 11);
        int int32 = hypergeometricDistribution28.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int33 = randomDataImpl11.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution28);
        int int34 = hypergeometricDistribution28.getSampleSize();
        int int35 = hypergeometricDistribution28.getNumberOfSuccesses();
        double double37 = hypergeometricDistribution28.cumulativeProbability((int) (byte) 0);
        int int38 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution28);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.861219211933031E43d + "'", double3 == 7.861219211933031E43d);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "26aac7bce7" + "'", str5, "26aac7bce7");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 121.18506482165839d + "'", double10 == 121.18506482165839d);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.113232842004301d + "'", double14 == 7.113232842004301d);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 12.15428999500987d + "'", double16 == 12.15428999500987d);
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.670470653528852d + "'", double19 == 4.670470653528852d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.28902130497416d + "'", double23 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 94 + "'", int32 == 94);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 11 + "'", int34 == 11);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        double double25 = randomDataImpl0.nextUniform(3.013351406641518d, 5.430460710003105d);
        double double29 = randomDataImpl0.nextUniform(0.0653042408807722d, 48.67934646432702d, true);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 82.65768018205665d + "'", double3 == 82.65768018205665d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9834762202884646d + "'", double5 == 0.9834762202884646d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.219203836130642d + "'", double8 == 8.219203836130642d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.167511432823647d + "'", double25 == 4.167511432823647d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.3634148070006968d + "'", double29 == 1.3634148070006968d);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        float float7 = well19937c1.nextFloat();
        float float8 = well19937c1.nextFloat();
        org.apache.commons.math3.random.Well19937c well19937c10 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int12 = well19937c10.nextInt(100);
        byte[] byteArray13 = new byte[] {};
        well19937c10.nextBytes(byteArray13);
        well19937c1.nextBytes(byteArray13);
        well19937c1.setSeed((int) '4');
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl18 = new org.apache.commons.math3.random.RandomDataImpl();
        double double21 = randomDataImpl18.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long24 = randomDataImpl18.nextLong(0L, (long) (short) 1);
        randomDataImpl18.reSeedSecure(5492381562888477542L);
        randomDataImpl18.reSeedSecure(0L);
        randomDataImpl18.reSeedSecure();
        int[] intArray32 = randomDataImpl18.nextPermutation(36, (int) ' ');
        org.apache.commons.math3.random.Well19937c well19937c33 = new org.apache.commons.math3.random.Well19937c(intArray32);
        well19937c1.setSeed(intArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution38 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, (-1430398331), 91, (-97));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1,430,398,331)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.639133f + "'", float7 == 0.639133f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5548245f + "'", float8 == 0.5548245f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-17.397694420435677d) + "'", double21 == (-17.397694420435677d));
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(intArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[11, 35, 7, 33, 25, 19, 16, 10, 28, 13, 26, 9, 3, 20, 2, 12, 30, 27, 32, 14, 23, 18, 31, 24, 1, 34, 0, 22, 5, 15, 4, 6]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        int int24 = hypergeometricDistribution17.getNumberOfSuccesses();
        double double26 = hypergeometricDistribution17.cumulativeProbability((int) (byte) 0);
        int int27 = hypergeometricDistribution17.getSupportUpperBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = hypergeometricDistribution17.random;
        int int30 = hypergeometricDistribution17.inverseCumulativeProbability(0.9999999988659215d);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 55.812373184071944d + "'", double3 == 55.812373184071944d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 36.95272373929375d + "'", double5 == 36.95272373929375d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.2176589324909712d) + "'", double8 == (-2.2176589324909712d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(randomGenerator28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure(5492381562888477542L);
        randomDataImpl0.reSeedSecure(0L);
        randomDataImpl0.reSeedSecure();
        double double14 = randomDataImpl0.nextWeibull(33.74905199779969d, 46.24612758548273d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution19 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator15, 26, 0, 11);
        double double20 = hypergeometricDistribution19.getNumericalVariance();
        double double21 = hypergeometricDistribution19.getNumericalVariance();
        double double23 = hypergeometricDistribution19.cumulativeProbability((int) (short) 0);
        double double24 = hypergeometricDistribution19.calculateNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl25 = hypergeometricDistribution19.randomData;
        double double26 = hypergeometricDistribution19.calculateNumericalVariance();
        int int27 = hypergeometricDistribution19.getSupportLowerBound();
        int int28 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution19);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = randomDataImpl0.nextPermutation(22, 133);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: permutation size (133) exceeds permuation domain (22)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 31.761911925502076d + "'", double3 == 31.761911925502076d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 42.42261717196519d + "'", double14 == 42.42261717196519d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1420463761));
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability(81655155);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double11 = hypergeometricDistribution4.cumulativeProbability((-1973305895), (-671727047));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample(144);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double12 = hypergeometricDistribution4.probability(21);
        int int13 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = hypergeometricDistribution15.randomData;
        boolean boolean20 = hypergeometricDistribution15.isSupportConnected();
        double double21 = hypergeometricDistribution15.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = hypergeometricDistribution15.sample(40433804);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 118.45651251613731d + "'", double3 == 118.45651251613731d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.3634145014988888d + "'", double8 == 2.3634145014988888d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ca8dba6709da5d3dc34a6304ab40aa2801" + "'", str10, "ca8dba6709da5d3dc34a6304ab40aa2801");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        double double9 = hypergeometricDistribution4.calculateNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = hypergeometricDistribution4.randomData;
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        double double14 = hypergeometricDistribution4.probability(51);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, 34);
        int int10 = hypergeometricDistribution4.getPopulationSize();
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 26 + "'", int10 == 26);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(randomGenerator12);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure(5492381562888477542L);
        randomDataImpl0.reSeedSecure(0L);
        randomDataImpl0.reSeedSecure();
        double double14 = randomDataImpl0.nextWeibull(33.74905199779969d, 46.24612758548273d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution19 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator15, 26, 0, 11);
        double double20 = hypergeometricDistribution19.getNumericalVariance();
        double double21 = hypergeometricDistribution19.getNumericalVariance();
        double double23 = hypergeometricDistribution19.cumulativeProbability((int) (short) 0);
        double double24 = hypergeometricDistribution19.calculateNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl25 = hypergeometricDistribution19.randomData;
        double double26 = hypergeometricDistribution19.calculateNumericalVariance();
        int int27 = hypergeometricDistribution19.getSupportLowerBound();
        int int28 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution19);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = randomDataImpl0.nextHypergeometric(23, 5, 29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (29) must be less than or equal to population size (23)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 96.33013579807927d + "'", double3 == 96.33013579807927d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 43.72344362132245d + "'", double14 == 43.72344362132245d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        double double2 = well19937c1.nextDouble();
        org.apache.commons.math3.random.Well19937c well19937c4 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int6 = well19937c4.nextInt(100);
        byte[] byteArray7 = new byte[] {};
        well19937c4.nextBytes(byteArray7);
        well19937c1.nextBytes(byteArray7);
        boolean boolean10 = well19937c1.nextBoolean();
        boolean boolean11 = well19937c1.nextBoolean();
        int int13 = well19937c1.nextInt(76);
        int int15 = well19937c1.nextInt(297988431);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution19 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 53, 2035706397, (-678979973));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-678,979,973)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2787313252014696d + "'", double2 == 0.2787313252014696d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290775138 + "'", int15 == 290775138);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.7615941559557649d, (-1973305895), 5);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        int int7 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = hypergeometricDistribution4.cumulativeProbability(282820755, 199795958);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (282,820,755) must be less than or equal to upper endpoint (199,795,958)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        int int19 = hypergeometricDistribution15.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistribution15.cumulativeProbability(2147483647, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (2,147,483,647) must be less than or equal to upper endpoint (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 86.22327201773436d + "'", double3 == 86.22327201773436d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.000830436797981d + "'", double8 == 3.000830436797981d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "37d8eb376c8d892d8175d6e16f2daff32c" + "'", str10, "37d8eb376c8d892d8175d6e16f2daff32c");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double19 = hypergeometricDistribution15.getNumericalMean();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl20 = hypergeometricDistribution15.randomData;
        int int23 = randomDataImpl20.nextZipf(12, 12.595613194779398d);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 68.61542610566262d + "'", double3 == 68.61542610566262d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0837111058108428d + "'", double8 == 0.0837111058108428d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2bfa953bff496ad6c3eda1ba9bcea296db" + "'", str10, "2bfa953bff496ad6c3eda1ba9bcea296db");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        float float8 = well19937c1.nextFloat();
        well19937c1.setSeed((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 94, 216105365, 312575008);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (216,105,365) must be less than or equal to population size (94)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.27873123f + "'", float8 == 0.27873123f);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double12 = hypergeometricDistribution4.probability(21);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.cumulativeProbability(60258698);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(17.688692811125733d, 0, 133);
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 133 + "'", int12 == 133);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution4.random;
        double double13 = hypergeometricDistribution4.cumulativeProbability(50, (int) 'a');
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        double double15 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextGaussian(93.01002163267295d, (double) 0.27873123f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(5);
        java.lang.String str12 = randomDataImpl0.nextHexString((int) (byte) 100);
        randomDataImpl0.reSeed(97L);
        long long17 = randomDataImpl0.nextLong((long) (-2), (long) 22);
        randomDataImpl0.reSeed();
        long long20 = randomDataImpl0.nextPoisson(8.261954974688912d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator21 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution25 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator21, 26, 0, 11);
        double double26 = hypergeometricDistribution25.getNumericalVariance();
        double double29 = hypergeometricDistribution25.cumulativeProbability(90, (int) (byte) 100);
        int int30 = hypergeometricDistribution25.getSupportLowerBound();
        double double32 = hypergeometricDistribution25.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = hypergeometricDistribution25.random;
        int int34 = hypergeometricDistribution25.getSupportLowerBound();
        int int35 = hypergeometricDistribution25.getSampleSize();
        int int36 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution25);
        int int37 = hypergeometricDistribution25.getSupportLowerBound();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 82.47414246992628d + "'", double3 == 82.47414246992628d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.890062831819536d + "'", double5 == 15.890062831819536d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 92.78259547783689d + "'", double8 == 92.78259547783689d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4c8f8" + "'", str10, "4c8f8");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "6354bccbfe25f937fd6443793ec39332c101300204c76293b386b9027db1f02582e5c6d79f276b97f6fe417ebb74bca456f3" + "'", str12, "6354bccbfe25f937fd6443793ec39332c101300204c76293b386b9027db1f02582e5c6d79f276b97f6fe417ebb74bca456f3");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 20L + "'", long17 == 20L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 7L + "'", long20 == 7L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 11 + "'", int35 == 11);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        double double13 = hypergeometricDistribution4.cumulativeProbability((-1524340748));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 26 + "'", int11 == 26);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.probability(30);
        double double14 = hypergeometricDistribution4.probability(65);
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double18 = hypergeometricDistribution4.cumulativeProbability(0, 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double9 = randomDataImpl6.nextGaussian(4.4E-323d, 37.91351998979613d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator10, 26, 0, 11);
        double double15 = hypergeometricDistribution14.getNumericalVariance();
        double double18 = hypergeometricDistribution14.cumulativeProbability(90, (int) (byte) 100);
        int int19 = hypergeometricDistribution14.getSupportLowerBound();
        double double21 = hypergeometricDistribution14.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator22 = hypergeometricDistribution14.random;
        int int23 = hypergeometricDistribution14.getSupportLowerBound();
        int int24 = hypergeometricDistribution14.getSupportLowerBound();
        int int25 = hypergeometricDistribution14.getNumberOfSuccesses();
        int int26 = randomDataImpl6.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        long long28 = randomDataImpl6.nextPoisson(21.063627179884616d);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = randomDataImpl6.nextBeta((double) (-749437760), (double) (-1300778791985825152L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NoBracketingException; message: function values at endpoints do not have different signs, endpoints: [0, 1], values: [-0.4, 0.6]");
        } catch (org.apache.commons.math3.exception.NoBracketingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-35.58988939076301d) + "'", double9 == (-35.58988939076301d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 20L + "'", long28 == 20L);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        byte[] byteArray4 = new byte[] {};
        well19937c1.nextBytes(byteArray4);
        well19937c1.setSeed((int) (byte) 1);
        float float8 = well19937c1.nextFloat();
        well19937c1.setSeed((long) (short) 1);
        well19937c1.setSeed((long) 5);
        well19937c1.setSeed(8L);
        double double15 = well19937c1.nextDouble();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution19 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c1, 133, 30, 75);
        well19937c1.setSeed((long) 53);
        well19937c1.setSeed((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.27873123f + "'", float8 == 0.27873123f);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23928076722384906d + "'", double15 == 0.23928076722384906d);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int10 = hypergeometricDistribution4.solveInverseCumulativeProbability(1.0465233942969707d, 0, 18);
        double double11 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 18 + "'", int10 == 18);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.7615941559557649d, (-1973305895), 5);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getPopulationSize();
        int int19 = hypergeometricDistribution4.solveInverseCumulativeProbability(2.4688167690187037E43d, 20, 0);
        int int20 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        float float7 = well19937c1.nextFloat();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double11 = randomDataImpl8.nextGaussian((-1.8857408611296655E43d), 0.4164855022340841d);
        randomDataImpl8.reSeedSecure();
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        double double18 = hypergeometricDistribution17.getNumericalVariance();
        double double21 = hypergeometricDistribution17.cumulativeProbability(90, (int) (byte) 100);
        int int22 = hypergeometricDistribution17.getSupportLowerBound();
        double double24 = hypergeometricDistribution17.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator25 = hypergeometricDistribution17.random;
        int int26 = hypergeometricDistribution17.getSupportLowerBound();
        boolean boolean27 = hypergeometricDistribution17.isSupportConnected();
        double double28 = hypergeometricDistribution17.getNumericalVariance();
        int int29 = randomDataImpl8.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        double double30 = hypergeometricDistribution17.getNumericalVariance();
        int int32 = hypergeometricDistribution17.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.639133f + "'", float7 == 0.639133f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.8857408611296655E43d) + "'", double11 == (-1.8857408611296655E43d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1420463761));
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl13 = hypergeometricDistribution4.randomData;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = randomDataImpl13.nextSecureLong(138L, 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (138) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl13);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.7615941559557649d, (-1973305895), 5);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = hypergeometricDistribution4.sample(2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.Well19937c well19937c9 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int11 = well19937c9.nextInt(100);
        byte[] byteArray12 = new byte[] {};
        well19937c9.nextBytes(byteArray12);
        well19937c1.nextBytes(byteArray12);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator15 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator16 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = randomDataGenerator16.getRandomGenerator();
        int int21 = randomDataGenerator16.nextHypergeometric((int) ' ', 4, 1);
        double double24 = randomDataGenerator16.nextF((double) 19, 0.004971420738312279d);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = randomDataGenerator16.nextUniform((-198.56206300289753d), (-5.4458753498318244E18d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (-198.562) must be strictly less than upper bound (-5,445,875,349,831,824,400)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.7036181146139355E12d + "'", double24 == 3.7036181146139355E12d);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        double double9 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.cumulativeProbability((-450427520), 27);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double19 = hypergeometricDistribution15.getNumericalMean();
        java.lang.Class<?> wildcardClass20 = hypergeometricDistribution15.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 19.221154095640088d + "'", double3 == 19.221154095640088d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.27293509779333563d + "'", double8 == 0.27293509779333563d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "07bc9bf3eab1f45bc59deac193cb804ebf" + "'", str10, "07bc9bf3eab1f45bc59deac193cb804ebf");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        int int7 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextGaussian(93.01002163267295d, (double) 0.27873123f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(5);
        java.lang.String str12 = randomDataImpl0.nextHexString((int) (byte) 100);
        randomDataImpl0.reSeed(97L);
        long long17 = randomDataImpl0.nextLong((long) (-2), (long) 22);
        randomDataImpl0.reSeed();
        long long20 = randomDataImpl0.nextPoisson(8.261954974688912d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator21 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution25 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator21, 26, 0, 11);
        double double26 = hypergeometricDistribution25.getNumericalVariance();
        double double29 = hypergeometricDistribution25.cumulativeProbability(90, (int) (byte) 100);
        int int30 = hypergeometricDistribution25.getSupportLowerBound();
        double double32 = hypergeometricDistribution25.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = hypergeometricDistribution25.random;
        int int34 = hypergeometricDistribution25.getSupportLowerBound();
        int int35 = hypergeometricDistribution25.getSampleSize();
        int int36 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution25);
        // The following exception was thrown during execution in test generation
        try {
            double double39 = randomDataImpl0.nextUniform(27.759337650691172d, 1.4210854715202004E-14d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (27.759) must be strictly less than upper bound (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-35.57532548600303d) + "'", double3 == (-35.57532548600303d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.0718483956847935d + "'", double5 == 6.0718483956847935d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 93.18614266818157d + "'", double8 == 93.18614266818157d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "494dc" + "'", str10, "494dc");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "9a9bb3b6cae85cbc610cbdbea03e99434cbfef1bd47c7ae55eb76a22ca2d118801095f5a0f5c3de32adcf236a3a0dee24cc7" + "'", str12, "9a9bb3b6cae85cbc610cbdbea03e99434cbfef1bd47c7ae55eb76a22ca2d118801095f5a0f5c3de32adcf236a3a0dee24cc7");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 20L + "'", long17 == 20L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9L + "'", long20 == 9L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 11 + "'", int35 == 11);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        double double13 = hypergeometricDistribution4.probability(25);
        int int15 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        int int13 = hypergeometricDistribution4.getSupportUpperBound();
        double double15 = hypergeometricDistribution4.probability(60);
        int int16 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double17 = hypergeometricDistribution4.getNumericalMean();
        int int18 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        double double6 = randomDataImpl0.nextUniform((double) 5, (double) 2061458278L);
        int int10 = randomDataImpl0.nextHypergeometric(66, 4, (int) (short) 0);
        double double13 = randomDataImpl0.nextUniform(0.7777928841214221d, (double) 68);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.825151883936475E42d + "'", double3 == 3.825151883936475E42d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.1322153482727296E9d + "'", double6 == 1.1322153482727296E9d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.46273081726159d + "'", double13 == 52.46273081726159d);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = hypergeometricDistribution4.randomData;
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        int int19 = hypergeometricDistribution15.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double20 = hypergeometricDistribution15.getNumericalVariance();
        int int21 = hypergeometricDistribution15.getSupportLowerBound();
        int int23 = hypergeometricDistribution15.inverseCumulativeProbability(0.1289525260608461d);
        int int24 = randomDataImpl10.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double27 = randomDataImpl10.nextWeibull(1.5694309927863666d, 40.46272390495594d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 94 + "'", int19 == 94);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 28.940637754169757d + "'", double27 == 28.940637754169757d);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(2147483647, (int) (short) 0, 63330584);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability(88);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.cumulativeProbability(0, 0);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability(0);
        boolean boolean17 = hypergeometricDistribution4.isSupportConnected();
        int int18 = hypergeometricDistribution4.getSupportLowerBound();
        double double20 = hypergeometricDistribution4.cumulativeProbability(36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.1289525260608461d);
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 26 + "'", int14 == 26);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl7 = hypergeometricDistribution4.randomData;
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(48);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomDataImpl7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability(48);
        double double12 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (-522671153));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        int int13 = hypergeometricDistribution4.getSupportUpperBound();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        int int19 = hypergeometricDistribution15.getSupportLowerBound();
        int int20 = hypergeometricDistribution15.getSupportLowerBound();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.218675042524424d + "'", double3 == 30.218675042524424d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.04159335531826215d + "'", double8 == 0.04159335531826215d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "36a76701b40ca9104c19e01aec440a42ff" + "'", str10, "36a76701b40ca9104c19e01aec440a42ff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1420463761));
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl12 = hypergeometricDistribution4.randomData;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = randomDataImpl12.nextZipf(728923678, (-1.1939352577910567d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: exponent (-1.194)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl12);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        double double23 = hypergeometricDistribution17.getNumericalMean();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.42043758505865d) + "'", double3 == (-5.42043758505865d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.306937686715871d + "'", double5 == 10.306937686715871d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 22.065290331428514d + "'", double8 == 22.065290331428514d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double19 = hypergeometricDistribution15.getNumericalMean();
        org.apache.commons.math3.random.RandomGenerator randomGenerator20 = hypergeometricDistribution15.random;
        double double21 = hypergeometricDistribution15.getNumericalVariance();
        int int22 = hypergeometricDistribution15.getSupportUpperBound();
        int int24 = hypergeometricDistribution15.inverseCumulativeProbability(0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 21.48450353308359d + "'", double3 == 21.48450353308359d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.1032658488617755d + "'", double8 == 2.1032658488617755d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "37a7d86603814ecc397a782043dcced1c5" + "'", str10, "37a7d86603814ecc397a782043dcced1c5");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.Well19937c well19937c9 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int11 = well19937c9.nextInt(100);
        byte[] byteArray12 = new byte[] {};
        well19937c9.nextBytes(byteArray12);
        well19937c1.nextBytes(byteArray12);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator15 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator16 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = randomDataGenerator16.getRandomGenerator();
        int int21 = randomDataGenerator16.nextHypergeometric((int) ' ', 4, 1);
        long long23 = randomDataGenerator16.nextPoisson(122.37650717815256d);
        double double27 = randomDataGenerator16.nextUniform((double) 5.0f, 6.533193571063436d, true);
        randomDataGenerator16.reSeedSecure();
        // The following exception was thrown during execution in test generation
        try {
            double double30 = randomDataGenerator16.nextExponential((double) (-629852259L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: mean (-629,852,259)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 138L + "'", long23 == 138L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5.141125064579194d + "'", double27 == 5.141125064579194d);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        long long6 = well19937c1.nextLong();
        long long7 = well19937c1.nextLong();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double11 = randomDataImpl8.nextGamma(1.5127195827191767E43d, (double) 7L);
        randomDataImpl8.reSeed((long) (byte) 0);
        double double16 = randomDataImpl8.nextUniform(0.0d, 50.093053861759984d);
        randomDataImpl8.reSeedSecure((long) (-1));
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = new org.apache.commons.math3.random.RandomDataImpl();
        double double22 = randomDataImpl19.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long25 = randomDataImpl19.nextLong(0L, (long) (short) 1);
        double double27 = randomDataImpl19.nextExponential((double) 0.99999994f);
        java.lang.String str29 = randomDataImpl19.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator30 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution34 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator30, 26, 0, 11);
        boolean boolean35 = hypergeometricDistribution34.isSupportConnected();
        int int36 = hypergeometricDistribution34.getSampleSize();
        int int37 = randomDataImpl19.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution34);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl38 = hypergeometricDistribution34.randomData;
        boolean boolean39 = hypergeometricDistribution34.isSupportConnected();
        int int40 = randomDataImpl8.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution34);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = hypergeometricDistribution34.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-6656821606993036558L) + "'", long7 == (-6656821606993036558L));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0589037079034236E44d + "'", double11 == 1.0589037079034236E44d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 37.23124487416693d + "'", double16 == 37.23124487416693d);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-2.1512256245977d) + "'", double22 == (-2.1512256245977d));
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.71467177409758d + "'", double27 == 0.71467177409758d);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "9969198fa87014657ef62867c539837f19" + "'", str29, "9969198fa87014657ef62867c539837f19");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11 + "'", int36 == 11);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double9 = randomDataImpl6.nextGaussian(4.4E-323d, 37.91351998979613d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator10, 26, 0, 11);
        double double15 = hypergeometricDistribution14.getNumericalVariance();
        double double18 = hypergeometricDistribution14.cumulativeProbability(90, (int) (byte) 100);
        int int19 = hypergeometricDistribution14.getSupportLowerBound();
        double double21 = hypergeometricDistribution14.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator22 = hypergeometricDistribution14.random;
        int int23 = hypergeometricDistribution14.getSupportLowerBound();
        int int24 = hypergeometricDistribution14.getSupportLowerBound();
        int int25 = hypergeometricDistribution14.getNumberOfSuccesses();
        int int26 = randomDataImpl6.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        long long28 = randomDataImpl6.nextPoisson(21.063627179884616d);
        java.lang.String str30 = randomDataImpl6.nextHexString(133);
        // The following exception was thrown during execution in test generation
        try {
            double double33 = randomDataImpl6.nextUniform(0.9999999982277563d, (-56.77010887493318d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (1) must be strictly less than upper bound (-56.77)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-35.58988939076301d) + "'", double9 == (-35.58988939076301d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 20L + "'", long28 == 20L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2aebf0e6961a705a3b82fd0e7fb32d02b208884ba40bff449cd4af21910cd477fc1d80d96d72f5edcf060509d4f6d87a3df4c1490f02bfa1ad3701a5c8919a240cc76" + "'", str30, "2aebf0e6961a705a3b82fd0e7fb32d02b208884ba40bff449cd4af21910cd477fc1d80d96d72f5edcf060509d4f6d87a3df4c1490f02bfa1ad3701a5c8919a240cc76");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double19 = hypergeometricDistribution15.getNumericalMean();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl20 = hypergeometricDistribution15.randomData;
        boolean boolean21 = hypergeometricDistribution15.isSupportConnected();
        double double23 = hypergeometricDistribution15.probability((-24));
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.039669666216707d + "'", double3 == 20.039669666216707d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0545502726740157d + "'", double8 == 1.0545502726740157d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "12c2c07f55007a368c6342d4c3d71e8d24" + "'", str10, "12c2c07f55007a368c6342d4c3d71e8d24");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int14 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.040747035123862574d, 74, 89);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 75 + "'", int14 == 75);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure(5492381562888477542L);
        randomDataImpl0.reSeedSecure(0L);
        randomDataImpl0.reSeedSecure();
        double double14 = randomDataImpl0.nextWeibull(33.74905199779969d, 46.24612758548273d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution19 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator15, 26, 0, 11);
        double double20 = hypergeometricDistribution19.getNumericalVariance();
        double double21 = hypergeometricDistribution19.getNumericalVariance();
        double double23 = hypergeometricDistribution19.cumulativeProbability((int) (short) 0);
        double double24 = hypergeometricDistribution19.calculateNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl25 = hypergeometricDistribution19.randomData;
        double double26 = hypergeometricDistribution19.calculateNumericalVariance();
        int int27 = hypergeometricDistribution19.getSupportLowerBound();
        int int28 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution19);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = hypergeometricDistribution19.inverseCumulativeProbability(93.37061781869959d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 93.371 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.582779381755174d + "'", double3 == 12.582779381755174d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 44.897416344131756d + "'", double14 == 44.897416344131756d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        double double15 = hypergeometricDistribution4.getNumericalMean();
        int int16 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int10 = hypergeometricDistribution4.solveInverseCumulativeProbability(1.0465233942969707d, 0, 18);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution4.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 18 + "'", int10 == 18);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = hypergeometricDistribution4.random;
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        double double9 = hypergeometricDistribution4.calculateNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl10 = hypergeometricDistribution4.randomData;
        double double12 = hypergeometricDistribution4.probability(4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.solveInverseCumulativeProbability(16.978032240674544d, 53, (-127));
        double double12 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.cumulativeProbability(5);
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-127) + "'", int11 == (-127));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.7615941559557649d, (-1973305895), 5);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        int int14 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 26 + "'", int14 == 26);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability(17, 61);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = hypergeometricDistribution4.randomData;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl14);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        int int24 = hypergeometricDistribution17.getNumberOfSuccesses();
        int int25 = hypergeometricDistribution17.getSupportLowerBound();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 147.96037008007534d + "'", double3 == 147.96037008007534d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 17.8018690550531d + "'", double5 == 17.8018690550531d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.13232073775144d + "'", double8 == 6.13232073775144d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double12 = hypergeometricDistribution4.probability(21);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        int int17 = hypergeometricDistribution4.solveInverseCumulativeProbability(2.599562067825721E43d, 12, 26);
        int int18 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 26 + "'", int17 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        double double9 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.getNumericalVariance();
        double double18 = hypergeometricDistribution4.cumulativeProbability(0, 3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1420463761));
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        int int18 = hypergeometricDistribution4.solveInverseCumulativeProbability(41.84313772206589d, 0, 24);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 24 + "'", int18 == 24);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.solveInverseCumulativeProbability(16.978032240674544d, 53, (-127));
        double double13 = hypergeometricDistribution4.probability(0);
        double double15 = hypergeometricDistribution4.upperCumulativeProbability(0);
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        double double18 = hypergeometricDistribution4.cumulativeProbability(60);
        boolean boolean19 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-127) + "'", int11 == (-127));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.7615941559557649d, (-1973305895), 5);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        double double17 = hypergeometricDistribution4.cumulativeProbability(0, 51);
        int int18 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean19 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        int int24 = hypergeometricDistribution17.getNumberOfSuccesses();
        double double26 = hypergeometricDistribution17.cumulativeProbability((int) (byte) 0);
        int int27 = hypergeometricDistribution17.getSampleSize();
        double double29 = hypergeometricDistribution17.cumulativeProbability(75);
        boolean boolean30 = hypergeometricDistribution17.isSupportConnected();
        double double31 = hypergeometricDistribution17.getNumericalMean();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 115.44427936764244d + "'", double3 == 115.44427936764244d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7250263594862704d + "'", double5 == 0.7250263594862704d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3560.0192451472453d + "'", double8 == 3560.0192451472453d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.cumulativeProbability(0, 0);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.Well19937c well19937c9 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int11 = well19937c9.nextInt(100);
        byte[] byteArray12 = new byte[] {};
        well19937c9.nextBytes(byteArray12);
        well19937c1.nextBytes(byteArray12);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator15 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator16 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = randomDataGenerator16.getRandomGenerator();
        int int21 = randomDataGenerator16.nextHypergeometric((int) ' ', 4, 1);
        long long23 = randomDataGenerator16.nextPoisson(122.37650717815256d);
        double double27 = randomDataGenerator16.nextUniform((double) 5.0f, 6.533193571063436d, true);
        java.lang.Class<?> wildcardClass28 = randomDataGenerator16.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 138L + "'", long23 == 138L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5.141125064579194d + "'", double27 == 5.141125064579194d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10);
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        int int7 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = hypergeometricDistribution4.cumulativeProbability(64, (-97));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (64) must be less than or equal to upper endpoint (-97)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        randomDataImpl0.reSeedSecure((long) 1);
        java.lang.String str9 = randomDataImpl0.nextHexString((int) '4');
        double double12 = randomDataImpl0.nextUniform(0.0d, (double) 1.4E-45f);
        double double16 = randomDataImpl0.nextUniform((-5.57205139769055E43d), 0.7615941559557649d, true);
        double double19 = randomDataImpl0.nextUniform(10.0d, 5281.0d);
        int int23 = randomDataImpl0.nextHypergeometric(80, 0, (int) (byte) 0);
        int int26 = randomDataImpl0.nextInt(10, 34);
        randomDataImpl0.reSeedSecure();
        // The following exception was thrown during execution in test generation
        try {
            long long30 = randomDataImpl0.nextSecureLong(274L, (long) (-620293396));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower bound (274) must be strictly less than upper bound (-620,293,396)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 64.86156163770866d + "'", double3 == 64.86156163770866d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.803920426216488d + "'", double5 == 11.803920426216488d);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "09a6ecb355529a4b0630f63d53d951f4e5ca90d83a99e348c0dc" + "'", str9, "09a6ecb355529a4b0630f63d53d951f4e5ca90d83a99e348c0dc");
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.444680349921328E-46d + "'", double12 == 9.444680349921328E-46d);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-6.679664849696026E42d) + "'", double16 == (-6.679664849696026E42d));
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3797.433609078509d + "'", double19 == 3797.433609078509d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 23 + "'", int26 == 23);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double12 = hypergeometricDistribution4.probability(21);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl13 = hypergeometricDistribution4.randomData;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl13);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        randomDataImpl0.reSeedSecure(5492381562888477542L);
        randomDataImpl0.reSeedSecure(0L);
        randomDataImpl0.reSeedSecure();
        double double14 = randomDataImpl0.nextWeibull(33.74905199779969d, 46.24612758548273d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution19 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator15, 26, 0, 11);
        double double20 = hypergeometricDistribution19.getNumericalVariance();
        double double21 = hypergeometricDistribution19.getNumericalVariance();
        double double23 = hypergeometricDistribution19.cumulativeProbability((int) (short) 0);
        double double24 = hypergeometricDistribution19.calculateNumericalVariance();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl25 = hypergeometricDistribution19.randomData;
        double double26 = hypergeometricDistribution19.calculateNumericalVariance();
        int int27 = hypergeometricDistribution19.getSupportLowerBound();
        int int28 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution19);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = randomDataImpl0.nextPermutation(0, 728923678);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: permutation size (728,923,678) exceeds permuation domain (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.72468812225592d + "'", double3 == 39.72468812225592d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 45.78058278855878d + "'", double14 == 45.78058278855878d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability(17, 61);
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl15 = hypergeometricDistribution4.randomData;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl15);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(17.688692811125733d, 0, 133);
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 133 + "'", int12 == 133);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextGaussian(93.01002163267295d, (double) 0.27873123f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(5);
        java.lang.String str12 = randomDataImpl0.nextHexString((int) (byte) 100);
        randomDataImpl0.reSeed(97L);
        long long17 = randomDataImpl0.nextLong((long) (-2), (long) 22);
        randomDataImpl0.reSeed();
        long long20 = randomDataImpl0.nextPoisson(8.261954974688912d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator21 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution25 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator21, 26, 0, 11);
        double double26 = hypergeometricDistribution25.getNumericalVariance();
        double double29 = hypergeometricDistribution25.cumulativeProbability(90, (int) (byte) 100);
        int int30 = hypergeometricDistribution25.getSupportLowerBound();
        double double32 = hypergeometricDistribution25.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = hypergeometricDistribution25.random;
        int int34 = hypergeometricDistribution25.getSupportLowerBound();
        int int35 = hypergeometricDistribution25.getSampleSize();
        int int36 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution25);
        double double38 = hypergeometricDistribution25.probability(290775138);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 37.89193145035611d + "'", double3 == 37.89193145035611d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7299396261469804d + "'", double5 == 0.7299396261469804d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 92.88432683845585d + "'", double8 == 92.88432683845585d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "105ed" + "'", str10, "105ed");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "819399efe50b5d9bb64607f1677ffa2c2a24da7eb96775638ad8652117dc404e157ceebeac4c4fd5f9a2967984196189b3d5" + "'", str12, "819399efe50b5d9bb64607f1677ffa2c2a24da7eb96775638ad8652117dc404e157ceebeac4c4fd5f9a2967984196189b3d5");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 20L + "'", long17 == 20L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 7L + "'", long20 == 7L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 11 + "'", int35 == 11);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        int int24 = hypergeometricDistribution17.getNumberOfSuccesses();
        double double26 = hypergeometricDistribution17.cumulativeProbability((int) (byte) 0);
        int int27 = hypergeometricDistribution17.getSampleSize();
        double double29 = hypergeometricDistribution17.cumulativeProbability(75);
        double double31 = hypergeometricDistribution17.probability(91);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 83.9243665244345d + "'", double3 == 83.9243665244345d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7839710994641503d + "'", double5 == 0.7839710994641503d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.630625619333628d + "'", double8 == 15.630625619333628d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution4.random;
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int15 = hypergeometricDistribution4.solveInverseCumulativeProbability(331.41375623481775d, (int) (byte) 10, (-450427520));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-450427520) + "'", int15 == (-450427520));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl13 = hypergeometricDistribution4.randomData;
        double double16 = randomDataImpl13.nextGaussian(12.43236366732894d, 16.78829453909681d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertNotNull(randomDataImpl13);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 11.728418603607995d + "'", double16 == 11.728418603607995d);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.math3.random.Well19937c well19937c0 = new org.apache.commons.math3.random.Well19937c();
        org.apache.commons.math3.random.Well19937c well19937c2 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int4 = well19937c2.nextInt(100);
        byte[] byteArray5 = new byte[] {};
        well19937c2.nextBytes(byteArray5);
        well19937c2.setSeed((int) (byte) 1);
        float float9 = well19937c2.nextFloat();
        well19937c2.setSeed((long) (short) 1);
        well19937c2.setSeed((long) 5);
        well19937c2.setSeed(8L);
        double double16 = well19937c2.nextDouble();
        org.apache.commons.math3.random.Well19937c well19937c18 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int20 = well19937c18.nextInt(100);
        well19937c18.clear();
        int[] intArray24 = new int[] { 2061458278, '#' };
        well19937c18.setSeed(intArray24);
        well19937c2.setSeed(intArray24);
        well19937c0.setSeed(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution31 = new org.apache.commons.math3.distribution.HypergeometricDistribution((org.apache.commons.math3.random.RandomGenerator) well19937c0, (-1737377827), 40433804, 76);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1,737,377,827)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.27873123f + "'", float9 == 0.27873123f);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23928076722384906d + "'", double16 == 0.23928076722384906d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[2061458278, 35]");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = hypergeometricDistribution4.sample(81655155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double19 = hypergeometricDistribution15.getNumericalMean();
        org.apache.commons.math3.random.RandomGenerator randomGenerator20 = hypergeometricDistribution15.random;
        double double21 = hypergeometricDistribution15.getNumericalVariance();
        int int22 = hypergeometricDistribution15.getPopulationSize();
        int int23 = hypergeometricDistribution15.getSupportLowerBound();
        int int27 = hypergeometricDistribution15.solveInverseCumulativeProbability(4.422564988254168d, (int) ' ', (int) (byte) 100);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 21.991238259169673d + "'", double3 == 21.991238259169673d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3060293398119129d + "'", double8 == 0.3060293398119129d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ab2c4327229bc47fa33308210bcbbe27c1" + "'", str10, "ab2c4327229bc47fa33308210bcbbe27c1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 26 + "'", int22 == 26);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        boolean boolean24 = hypergeometricDistribution17.isSupportConnected();
        double double25 = hypergeometricDistribution17.getNumericalMean();
        int int26 = hypergeometricDistribution17.getNumberOfSuccesses();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-29.61959725683166d) + "'", double3 == (-29.61959725683166d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.770960165222498d + "'", double5 == 5.770960165222498d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.667280741051183d) + "'", double8 == (-0.667280741051183d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability(17, 61);
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.cumulativeProbability(0, 0);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double9 = randomDataImpl6.nextGaussian(4.4E-323d, 37.91351998979613d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator10, 26, 0, 11);
        double double15 = hypergeometricDistribution14.getNumericalVariance();
        double double18 = hypergeometricDistribution14.cumulativeProbability(90, (int) (byte) 100);
        int int19 = hypergeometricDistribution14.getSupportLowerBound();
        double double21 = hypergeometricDistribution14.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator22 = hypergeometricDistribution14.random;
        int int23 = hypergeometricDistribution14.getSupportLowerBound();
        int int24 = hypergeometricDistribution14.getSupportLowerBound();
        int int25 = hypergeometricDistribution14.getNumberOfSuccesses();
        int int26 = randomDataImpl6.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        long long28 = randomDataImpl6.nextPoisson(21.063627179884616d);
        java.lang.String str30 = randomDataImpl6.nextHexString(133);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = randomDataImpl6.nextSecureHexString((-1809520909));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: length (-1,809,520,909)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-35.58988939076301d) + "'", double9 == (-35.58988939076301d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 20L + "'", long28 == 20L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2aebf0e6961a705a3b82fd0e7fb32d02b208884ba40bff449cd4af21910cd477fc1d80d96d72f5edcf060509d4f6d87a3df4c1490f02bfa1ad3701a5c8919a240cc76" + "'", str30, "2aebf0e6961a705a3b82fd0e7fb32d02b208884ba40bff449cd4af21910cd477fc1d80d96d72f5edcf060509d4f6d87a3df4c1490f02bfa1ad3701a5c8919a240cc76");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
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
        long long7 = well19937c1.nextLong();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl8 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double11 = randomDataImpl8.nextGaussian((double) 1, 70.80838095536241d);
        randomDataImpl8.reSeedSecure((long) (byte) 10);
        java.lang.String str15 = randomDataImpl8.nextSecureHexString(53);
        int int19 = randomDataImpl8.nextHypergeometric(1206614476, 65, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8853895889823578499L + "'", long6 == 8853895889823578499L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-6656821606993036558L) + "'", long7 == (-6656821606993036558L));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-80.26058717053266d) + "'", double11 == (-80.26058717053266d));
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "34515270189fc6a199ec23cee4030faa630d0d4a8f59ed2832238" + "'", str15, "34515270189fc6a199ec23cee4030faa630d0d4a8f59ed2832238");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        int int7 = hypergeometricDistribution4.getSupportUpperBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        double double25 = randomDataImpl0.nextUniform(3.013351406641518d, 5.430460710003105d);
        long long27 = randomDataImpl0.nextPoisson(3.789791897405967E-6d);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.372620166244754d + "'", double3 == 30.372620166244754d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.840264299648141d + "'", double5 == 5.840264299648141d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.724509952145624d) + "'", double8 == (-8.724509952145624d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.167511432823647d + "'", double25 == 4.167511432823647d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.probability(30);
        double double14 = hypergeometricDistribution4.probability(65);
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl16 = hypergeometricDistribution4.randomData;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = randomDataImpl16.nextBinomial((-83), 5.962834598460948d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of trials (-83)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl16);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1420463761));
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        int int11 = hypergeometricDistribution4.getSampleSize();
        double double13 = hypergeometricDistribution4.probability((-472218561));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.probability(0);
        double double15 = hypergeometricDistribution4.cumulativeProbability((-1420463761), 78);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1420463761));
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.probability((-749437760));
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        double double6 = randomDataImpl0.nextGaussian(32.0d, 86.787224931878d);
        double double9 = randomDataImpl0.nextCauchy((double) 9223372036854775807L, (double) 75);
        double double11 = randomDataImpl0.nextExponential(3.45194313E8d);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = randomDataImpl0.nextHypergeometric((-180885124), (-97), 179260423);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-180,885,124)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.45134251775737E42d) + "'", double3 == (-4.45134251775737E42d));
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 155.09344249266854d + "'", double6 == 155.09344249266854d);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.223372036854776E18d + "'", double9 == 9.223372036854776E18d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 9.383843848108064E7d + "'", double11 == 9.383843848108064E7d);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = hypergeometricDistribution4.sample((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        boolean boolean2 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator3 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double4 = well19937c1.nextDouble();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl5 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution10 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator6, 26, 0, 11);
        double double11 = hypergeometricDistribution10.getNumericalVariance();
        double double14 = hypergeometricDistribution10.cumulativeProbability(0, (int) (short) 100);
        double double15 = hypergeometricDistribution10.getNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = hypergeometricDistribution10.random;
        int int17 = hypergeometricDistribution10.getSupportLowerBound();
        int int18 = randomDataImpl5.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution10);
        long long21 = randomDataImpl5.nextLong((long) (-1023), 47L);
        double double24 = randomDataImpl5.nextF(6.364361760025092E8d, 1.2461801346891718E8d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.59548520266966d + "'", double4 == 0.59548520266966d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-141L) + "'", long21 == (-141L));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9999695241084335d + "'", double24 == 0.9999695241084335d);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        int int12 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        double double19 = hypergeometricDistribution15.getNumericalMean();
        int int20 = hypergeometricDistribution15.getSupportLowerBound();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.783846312899449d + "'", double3 == 4.783846312899449d);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6215956068843758d + "'", double8 == 0.6215956068843758d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "c760df27f0713e0d921d773790f0f70367" + "'", str10, "c760df27f0713e0d921d773790f0f70367");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = hypergeometricDistribution4.random;
        int int15 = hypergeometricDistribution4.solveInverseCumulativeProbability((double) 7314652.0f, 66, 179260423);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(randomGenerator11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 179260423 + "'", int15 == 179260423);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1, 60258698);
        int int16 = hypergeometricDistribution4.getSampleSize();
        int int17 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl13 = hypergeometricDistribution4.randomData;
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = hypergeometricDistribution4.randomData;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
        org.junit.Assert.assertNotNull(randomDataImpl13);
        org.junit.Assert.assertNotNull(randomDataImpl14);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextGaussian(93.01002163267295d, (double) 0.27873123f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(5);
        java.lang.String str12 = randomDataImpl0.nextHexString((int) (byte) 100);
        randomDataImpl0.reSeed(97L);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution19 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator15, 26, 0, 11);
        double double20 = hypergeometricDistribution19.getNumericalVariance();
        int int21 = hypergeometricDistribution19.getSupportLowerBound();
        double double23 = hypergeometricDistribution19.probability((-1023));
        double double25 = hypergeometricDistribution19.upperCumulativeProbability((-1420463761));
        double double26 = hypergeometricDistribution19.getNumericalVariance();
        int int27 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution19);
        int int28 = hypergeometricDistribution19.getSampleSize();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 131.9804034465226d + "'", double3 == 131.9804034465226d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.529519652175008d + "'", double5 == 10.529519652175008d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 92.88722137870027d + "'", double8 == 92.88722137870027d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4ce38" + "'", str10, "4ce38");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "37bd89450cc35d0bdf918eab3a2fb677868c286c1e9f09f3b6308b82acab62b733d4f3645696a503507f40b94657393f4f8b" + "'", str12, "37bd89450cc35d0bdf918eab3a2fb677868c286c1e9f09f3b6308b82acab62b733d4f3645696a503507f40b94657393f4f8b");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.probability(0);
        double double15 = hypergeometricDistribution4.cumulativeProbability(29, 84);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        long long6 = randomDataImpl0.nextLong(0L, (long) (short) 1);
        double double8 = randomDataImpl0.nextExponential((double) 0.99999994f);
        java.lang.String str10 = randomDataImpl0.nextSecureHexString(34);
        org.apache.commons.math3.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution15 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator11, 26, 0, 11);
        boolean boolean16 = hypergeometricDistribution15.isSupportConnected();
        int int17 = hypergeometricDistribution15.getSampleSize();
        int int18 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution15);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl19 = hypergeometricDistribution15.randomData;
        int[] intArray22 = randomDataImpl19.nextPermutation(57, 16);
        double double25 = randomDataImpl19.nextUniform(0.0d, 5.568313098272951E43d);
        double double28 = randomDataImpl19.nextWeibull(97.65227442430727d, (double) 290775138);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-17.07278504104891d) + "'", double3 == (-17.07278504104891d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.07337567138178949d + "'", double8 == 0.07337567138178949d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "851c900c480222a7bbe5e26a7de5f002f5" + "'", str10, "851c900c480222a7bbe5e26a7de5f002f5");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl19);
        org.junit.Assert.assertNotNull(intArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[53, 8, 27, 39, 30, 41, 2, 36, 29, 1, 47, 12, 20, 11, 49, 40]");
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2.8228691224798415E43d + "'", double25 == 2.8228691224798415E43d);
// flaky:         org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.828537059125654E8d + "'", double28 == 2.828537059125654E8d);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.solveInverseCumulativeProbability(16.978032240674544d, 53, (-127));
        int int12 = hypergeometricDistribution4.getSampleSize();
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = hypergeometricDistribution4.random;
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl14 = hypergeometricDistribution4.randomData;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-127) + "'", int11 == (-127));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertNull(randomGenerator13);
        org.junit.Assert.assertNotNull(randomDataImpl14);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 7, (-1807511245), 92);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1,807,511,245)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = hypergeometricDistribution4.random;
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(2867196989461385522L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(randomGenerator13);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator0 = new org.apache.commons.math3.random.RandomDataGenerator();
        double double3 = randomDataGenerator0.nextGamma(2.993222846126381d, 63.18646759321859d);
        double double6 = randomDataGenerator0.nextGamma(12.657048160990792d, 4.9E-324d);
        randomDataGenerator0.reSeedSecure();
        randomDataGenerator0.reSeedSecure((long) (short) 0);
        int int13 = randomDataGenerator0.nextHypergeometric(656115722, 0, 0);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 159.35776076354293d + "'", double3 == 159.35776076354293d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9E-323d + "'", double6 == 6.9E-323d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(17.688692811125733d, 0, 133);
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 472218561);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 133 + "'", int12 == 133);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.7615941559557649d, (-1973305895), 5);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        int int19 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.0d, 23, (-512508661));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-512508661) + "'", int19 == (-512508661));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10);
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        double double14 = hypergeometricDistribution4.cumulativeProbability((-749437760));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.probability(30);
        double double14 = hypergeometricDistribution4.probability(65);
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl16 = hypergeometricDistribution4.randomData;
        double double18 = hypergeometricDistribution4.probability(71);
        double double20 = hypergeometricDistribution4.probability(271219944);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(randomDataImpl16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        randomDataImpl0.reSeedSecure((long) 1);
        java.lang.String str9 = randomDataImpl0.nextHexString((int) '4');
        java.lang.String str11 = randomDataImpl0.nextSecureHexString((int) '#');
        double double14 = randomDataImpl0.nextGaussian(0.8719745671619918d, 96.34193096738655d);
        double double18 = randomDataImpl0.nextUniform((double) (-6466278509201326734L), 3.6276308240261184d, false);
        long long21 = randomDataImpl0.nextSecureLong((-625L), 9223372036854775807L);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = randomDataImpl0.nextHypergeometric(93, 4963, 1221467508);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (4,963) must be less than or equal to population size (93)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 46.67461795839624d + "'", double3 == 46.67461795839624d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 43.07873507771109d + "'", double5 == 43.07873507771109d);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2932ad13915a3063922c7b14c9958286347b1d1d486425f2311f" + "'", str9, "2932ad13915a3063922c7b14c9958286347b1d1d486425f2311f");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0c4225f407eb31b6bdc139189d83a020f68" + "'", str11, "0c4225f407eb31b6bdc139189d83a020f68");
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-43.71938811180173d) + "'", double14 == (-43.71938811180173d));
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.67795711175711258E18d) + "'", double18 == (-1.67795711175711258E18d));
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 8492025140880000787L + "'", long21 == 8492025140880000787L);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1420463761));
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.probability((-749437760));
        int int14 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 26 + "'", int14 == 26);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1420463761));
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistribution4.cumulativeProbability(285428, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (285,428) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        int int9 = hypergeometricDistribution4.getSampleSize();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl11 = hypergeometricDistribution4.randomData;
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(randomDataImpl11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.probability(78);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, 34);
        int int10 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.inverseCumulativeProbability((-6.675712484917235E42d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -6,675,712,484,917,235,000,000,000,000,000,000,000,000,000 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 26 + "'", int10 == 26);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability((-1023));
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(17.688692811125733d, 0, 133);
        double double14 = hypergeometricDistribution4.cumulativeProbability(27);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 133 + "'", int12 == 133);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.probability(33);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl13 = hypergeometricDistribution4.randomData;
        randomDataImpl13.reSeedSecure();
        double double17 = randomDataImpl13.nextCauchy(2.0d, (double) 81);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(randomDataImpl13);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 81.32967052273469d + "'", double17 == 81.32967052273469d);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        int int7 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hypergeometricDistribution4.inverseCumulativeProbability(3.36385963568097E42d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 3,363,859,635,680,970,000,000,000,000,000,000,000,000,000 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = hypergeometricDistribution4.random;
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability(90, (int) (byte) 100);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(216105365);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.getPopulationSize();
        int int16 = hypergeometricDistribution4.solveInverseCumulativeProbability(175.1076109975116d, (int) 'a', 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        well19937c1.clear();
        int int5 = well19937c1.nextInt();
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl6 = new org.apache.commons.math3.random.RandomDataImpl((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        double double9 = randomDataImpl6.nextGaussian(4.4E-323d, 37.91351998979613d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution14 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator10, 26, 0, 11);
        double double15 = hypergeometricDistribution14.getNumericalVariance();
        double double18 = hypergeometricDistribution14.cumulativeProbability(90, (int) (byte) 100);
        int int19 = hypergeometricDistribution14.getSupportLowerBound();
        double double21 = hypergeometricDistribution14.probability(195270565);
        org.apache.commons.math3.random.RandomGenerator randomGenerator22 = hypergeometricDistribution14.random;
        int int23 = hypergeometricDistribution14.getSupportLowerBound();
        int int24 = hypergeometricDistribution14.getSupportLowerBound();
        int int25 = hypergeometricDistribution14.getNumberOfSuccesses();
        int int26 = randomDataImpl6.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution14);
        double double27 = hypergeometricDistribution14.getNumericalMean();
        int int28 = hypergeometricDistribution14.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1737377827) + "'", int5 == (-1737377827));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-35.58988939076301d) + "'", double9 == (-35.58988939076301d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 26 + "'", int28 == 26);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        int int8 = hypergeometricDistribution4.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int12 = hypergeometricDistribution4.solveInverseCumulativeProbability(0.7615941559557649d, (-1973305895), 5);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 94 + "'", int8 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int10 = hypergeometricDistribution4.solveInverseCumulativeProbability(1.0465233942969707d, 0, 18);
        double double11 = hypergeometricDistribution4.getNumericalMean();
        org.apache.commons.math3.random.RandomGenerator randomGenerator12 = hypergeometricDistribution4.random;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 18 + "'", int10 == 18);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(randomGenerator12);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.solveInverseCumulativeProbability((-1.0d), 1, 66);
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 26, 0, 11);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.solveInverseCumulativeProbability(16.978032240674544d, 53, (-127));
        double double13 = hypergeometricDistribution4.probability(0);
        double double15 = hypergeometricDistribution4.upperCumulativeProbability(0);
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        double double17 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((-935L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-127) + "'", int11 == (-127));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.Well19937c well19937c9 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int11 = well19937c9.nextInt(100);
        byte[] byteArray12 = new byte[] {};
        well19937c9.nextBytes(byteArray12);
        well19937c1.nextBytes(byteArray12);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator15 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator16 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = randomDataGenerator16.getRandomGenerator();
        int int21 = randomDataGenerator16.nextHypergeometric((int) ' ', 4, 1);
        double double24 = randomDataGenerator16.nextF((double) 13312.0f, 107.42601444895934d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0692010406052883d + "'", double24 == 1.0692010406052883d);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.commons.math3.random.Well19937c well19937c1 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int3 = well19937c1.nextInt(100);
        int int5 = well19937c1.nextInt(5);
        int int6 = well19937c1.nextInt();
        boolean boolean7 = well19937c1.nextBoolean();
        org.apache.commons.math3.random.Well19937c well19937c9 = new org.apache.commons.math3.random.Well19937c((int) (byte) 1);
        int int11 = well19937c9.nextInt(100);
        byte[] byteArray12 = new byte[] {};
        well19937c9.nextBytes(byteArray12);
        well19937c1.nextBytes(byteArray12);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator15 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomDataGenerator randomDataGenerator16 = new org.apache.commons.math3.random.RandomDataGenerator((org.apache.commons.math3.random.RandomGenerator) well19937c1);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = randomDataGenerator16.getRandomGenerator();
        int int21 = randomDataGenerator16.nextHypergeometric((int) ' ', 4, 1);
        double double24 = randomDataGenerator16.nextGamma((double) 7.6293945E-6f, 149.39848428018317d);
        double double27 = randomDataGenerator16.nextUniform(58.74463345342075d, 2.443302423989029E8d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2061458278 + "'", int6 == 2061458278);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8601469.249487476d + "'", double27 == 8601469.249487476d);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextGaussian(52.00000000000001d, 52.00000000000001d);
        double double5 = randomDataImpl0.nextExponential((double) 10L);
        double double8 = randomDataImpl0.nextCauchy((double) (short) -1, (double) 10);
        randomDataImpl0.reSeed((long) (byte) 10);
        double double12 = randomDataImpl0.nextChiSquare(43.03950875352201d);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution17 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator13, 26, 0, 11);
        int int21 = hypergeometricDistribution17.solveInverseCumulativeProbability(12.595613194779398d, 6, 94);
        int int22 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution17);
        int int23 = hypergeometricDistribution17.getSampleSize();
        int int24 = hypergeometricDistribution17.getNumberOfSuccesses();
        double double26 = hypergeometricDistribution17.cumulativeProbability((int) (byte) 0);
        int int27 = hypergeometricDistribution17.getSampleSize();
        double double29 = hypergeometricDistribution17.cumulativeProbability(75);
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl30 = hypergeometricDistribution17.randomData;
        // The following exception was thrown during execution in test generation
        try {
            double double33 = randomDataImpl30.nextWeibull((double) 97L, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: scale (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 28.9511161288724d + "'", double3 == 28.9511161288724d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.507075916681204d + "'", double5 == 11.507075916681204d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.029250336472261d + "'", double8 == 10.029250336472261d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.28902130497416d + "'", double12 == 40.28902130497416d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(randomDataImpl30);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        double double3 = randomDataImpl0.nextCauchy((-1.5574077246549023d), 2.6881171418161356E43d);
        long long6 = randomDataImpl0.nextLong(0L, 100L);
        double double8 = randomDataImpl0.nextChiSquare((double) 34);
        int int12 = randomDataImpl0.nextHypergeometric(76, 28, 0);
        randomDataImpl0.reSeed((long) 90);
        randomDataImpl0.reSeedSecure();
        org.apache.commons.math3.distribution.RealDistribution realDistribution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = randomDataImpl0.nextInversionDeviate(realDistribution16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.6927239272996884E43d) + "'", double3 == (-2.6927239272996884E43d));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 34L + "'", long6 == 34L);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.73631915127745d + "'", double8 == 35.73631915127745d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }
}
