package org.apache.commons.math3.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test501");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        org.apache.commons.math3.random.RandomGenerator randomGenerator9 = hypergeometricDistribution3.random;
        int int10 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(randomGenerator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test502");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        int[] intArray8 = hypergeometricDistribution3.sample(150);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test503");
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
        int int26 = hypergeometricDistribution13.solveInverseCumulativeProbability(4.387411125378478d, 1549912060, 50);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 83.16246351990122d + "'", double3 == 83.16246351990122d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 50 + "'", int26 == 50);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test504");
        org.apache.commons.math3.random.RandomDataImpl randomDataImpl0 = new org.apache.commons.math3.random.RandomDataImpl();
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = randomDataImpl0.nextInversionDeviate((org.apache.commons.math3.distribution.IntegerDistribution) hypergeometricDistribution4);
        double double10 = randomDataImpl0.nextGaussian((double) 100000L, 81.82697346282114d);
        randomDataImpl0.reSeed((long) 21);
        double double14 = randomDataImpl0.nextT(14.154262241479262d);
        double double17 = randomDataImpl0.nextCauchy(7.289835157140028d, 79.54619147820964d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99776.97152304488d + "'", double10 == 99776.97152304488d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0834471483365475d + "'", double14 == 1.0834471483365475d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 14.309469209999254d + "'", double17 == 14.309469209999254d);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test505");
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
        boolean boolean19 = hypergeometricDistribution9.isSupportConnected();
        int int20 = hypergeometricDistribution9.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test506");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution3.solveInverseCumulativeProbability((double) (-2272559751474214079L), 33, (int) (byte) 1);
        double double15 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double17 = hypergeometricDistribution3.cumulativeProbability((-459835946));
        double double18 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test507");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 0, (int) (short) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.apache.commons.math3.random.RandomGenerator randomGenerator7 = hypergeometricDistribution3.random;
        double double10 = hypergeometricDistribution3.cumulativeProbability((int) '4', 389817062);
        hypergeometricDistribution3.reseedRandomGenerator((long) (-456672586));
        int int13 = hypergeometricDistribution3.getSupportLowerBound();
        int int17 = hypergeometricDistribution3.solveInverseCumulativeProbability(8.551308161684604d, 0, (-21661068));
        double double18 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(randomGenerator7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-21661068) + "'", int17 == (-21661068));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }
}
