package org.apache.commons.math3.fraction;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test001");
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) 10.0f);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test002");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(bigInteger0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: numerator");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test003");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_INTERVAL_INITIAL_VALUE_PARAMETERS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_INTERVAL_INITIAL_VALUE_PARAMETERS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_INTERVAL_INITIAL_VALUE_PARAMETERS));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test004");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test005");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ITERATIONS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ITERATIONS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ITERATIONS));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test006");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_REGRESSION_ARRAY;
        java.lang.Number number1 = null;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException2 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, number1);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_REGRESSION_ARRAY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_REGRESSION_ARRAY));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 35 to fraction (9,223,372,036,854,775,774/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test008");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test009");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_SMALL_BOUND_EXCLUDED;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_SMALL_BOUND_EXCLUDED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_SMALL_BOUND_EXCLUDED));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test010");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_CAPACITY_NOT_POSITIVE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_CAPACITY_NOT_POSITIVE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_CAPACITY_NOT_POSITIVE));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test011");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_OPTIMUM_COMPUTED_YET;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_OPTIMUM_COMPUTED_YET + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_OPTIMUM_COMPUTED_YET));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test012");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        java.math.BigInteger bigInteger2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.multiply(bigInteger2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test013");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test014");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205588285577d) + "'", double1 == (-0.6321205588285577d));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test015");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test016");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test017");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 0.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test018");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test019");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_OPERATOR;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_OPERATOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_OPERATOR));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test020");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable0, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        boolean boolean5 = numberIsTooSmallException4.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test021");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_NUMBER_OF_TRIALS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_NUMBER_OF_TRIALS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_NUMBER_OF_TRIALS));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test022");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: exponent (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test023");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZE_EXCEEDS_MAX_VARIABLES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZE_EXCEEDS_MAX_VARIABLES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZE_EXCEEDS_MAX_VARIABLES));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test024");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.HOLE_BETWEEN_MODELS_TIME_RANGES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.HOLE_BETWEEN_MODELS_TIME_RANGES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.HOLE_BETWEEN_MODELS_TIME_RANGES));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test025");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.BOBYQA_BOUND_DIFFERENCE_CONDITION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BOBYQA_BOUND_DIFFERENCE_CONDITION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BOBYQA_BOUND_DIFFERENCE_CONDITION));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test026");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test027");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_KNOT_VALUES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_KNOT_VALUES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_KNOT_VALUES));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test028");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test029");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (byte) 0, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test030");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(2, (long) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test031");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ORIG_AND_PERMUTED_DATA;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ORIG_AND_PERMUTED_DATA + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ORIG_AND_PERMUTED_DATA));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test032");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test033");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test034");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test035");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test036");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_UPPER_BOUND;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_UPPER_BOUND + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_UPPER_BOUND));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test037");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_VALUE_CONVERSION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_VALUE_CONVERSION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_VALUE_CONVERSION));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 28, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 28 to fraction (-27/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test039");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test040");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        int int2 = fraction0.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.reciprocal();
        short short4 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 2 + "'", short4 == (short) 2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test041");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.MAX_COUNT_EXCEEDED;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.MAX_COUNT_EXCEEDED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.MAX_COUNT_EXCEEDED));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test042");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        int int3 = fraction2.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField5.getZero();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.add(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.divide(fraction9);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField12 = fraction9.getField();
        org.apache.commons.math3.fraction.FractionField fractionField13 = fraction9.getField();
        int int14 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction7.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.add(fraction16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test043");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test044");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test045");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_STANDARD_DEVIATION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_STANDARD_DEVIATION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_STANDARD_DEVIATION));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test046");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_BOUND;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_BOUND + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_BOUND));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test047");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fractionField2.getZero();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.subtract(fraction4);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException8 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction5, (java.lang.Number) 2.99822295029797d, false);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test048");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fractionField6.getZero();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.subtract(fraction8);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException11 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction1, (java.lang.Number) fraction8, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction1.reciprocal();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test049");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test050");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 35, (long) 341642467);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test051");
        java.lang.Number number0 = null;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math3.exception.NotPositiveException(number0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test052");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add((int) '#');
        double double6 = fraction5.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 36.0d + "'", double6 == 36.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test053");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_COMPLEX;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_COMPLEX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_COMPLEX));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test054");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1.0d, (int) (short) 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test055");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test056");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test057");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((int) (byte) 10, 341642467);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test058");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_LARGE_TOURNAMENT_ARITY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_LARGE_TOURNAMENT_ARITY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_LARGE_TOURNAMENT_ARITY));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test059");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable0, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext5 = numberIsTooSmallException4.getContext();
        java.lang.Number number6 = numberIsTooSmallException4.getArgument();
        java.lang.Number number7 = numberIsTooSmallException4.getArgument();
        org.junit.Assert.assertNotNull(exceptionContext5);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 1.0f + "'", number6, 1.0f);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 1.0f + "'", number7, 1.0f);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test060");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test061");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test062");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test063");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 35L, (double) '#', (int) (short) 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test064");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 341642467);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test065");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField3 = fraction0.getField();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass4 = fractionField3.getRuntimeClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test066");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test067");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 97.0f, (double) 0.25f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5682190129139257d + "'", double2 == 1.5682190129139257d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test068");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 28);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4886921905584123d + "'", double1 == 0.4886921905584123d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test069");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test070");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        short short2 = bigFraction1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test071");
        double double1 = org.apache.commons.math3.util.FastMath.log(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test072");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ITERATOR_EXHAUSTED;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ITERATOR_EXHAUSTED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ITERATOR_EXHAUSTED));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test073");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_OUT_OF_RANGE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_OUT_OF_RANGE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_OUT_OF_RANGE));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test074");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test075");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (-1.0f));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test076");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNSUPPORTED_EXPANSION_MODE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNSUPPORTED_EXPANSION_MODE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNSUPPORTED_EXPANSION_MODE));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test077");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_SQUARE_OPERATOR;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_SQUARE_OPERATOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_SQUARE_OPERATOR));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test078");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.REAL_FORMAT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.REAL_FORMAT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.REAL_FORMAT));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test079");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARITHMETIC_EXCEPTION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARITHMETIC_EXCEPTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARITHMETIC_EXCEPTION));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test080");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((long) (short) 10, (long) 1078591488);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5392957440L + "'", long2 == 5392957440L);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test081");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_ALL_ZERO;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_ALL_ZERO + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_ALL_ZERO));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test082");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_ELEMENT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_ELEMENT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_ELEMENT));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test083");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(100.0f, (int) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5845633E31f + "'", float2 == 1.5845633E31f);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test084");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test085");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(0L, (long) 341642467);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 341642467L + "'", long2 == 341642467L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test086");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BRACKETING_PARAMETERS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BRACKETING_PARAMETERS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BRACKETING_PARAMETERS));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test087");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test088");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test089");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((long) 'a', (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9700L + "'", long2 == 9700L);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test090");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.9982229502979703d, (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test091");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test092");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), localizedFormats6 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException8 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray7);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException9 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException2, (org.apache.commons.math3.exception.util.Localizable) localizedFormats3, objArray7);
        java.lang.String str10 = mathIllegalStateException9.toString();
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math3.exception.MathIllegalStateException: numerator" + "'", str10, "org.apache.commons.math3.exception.MathIllegalStateException: numerator");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test093");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test094");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction2);
        java.lang.Number number4 = notPositiveException3.getMin();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0 + "'", number4, 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test095");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test096");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = fraction0.compareTo(fraction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test097");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test098");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide(fraction2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction1);
        boolean boolean5 = notPositiveException4.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test099");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test100");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.PERCENTILE_IMPLEMENTATION_CANNOT_ACCESS_METHOD;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERCENTILE_IMPLEMENTATION_CANNOT_ACCESS_METHOD + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERCENTILE_IMPLEMENTATION_CANNOT_ACCESS_METHOD));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test101");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NORMALIZE_NAN;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NORMALIZE_NAN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NORMALIZE_NAN));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test102");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0d, (-31));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6566128730773926E-10d + "'", double2 == 4.6566128730773926E-10d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test103");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test104");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INSTANCES_NOT_COMPARABLE_TO_EXISTING_VALUES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INSTANCES_NOT_COMPARABLE_TO_EXISTING_VALUES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INSTANCES_NOT_COMPARABLE_TO_EXISTING_VALUES));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test105");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 2 to fraction (-1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test106");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.junit.Assert.assertNotNull(fraction0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test107");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test108");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_COMPUTE_COVARIANCE_SINGULAR_PROBLEM;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_COMPUTE_COVARIANCE_SINGULAR_PROBLEM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_COMPUTE_COVARIANCE_SINGULAR_PROBLEM));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test109");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 1.07859136E9f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test110");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.SINGULAR_OPERATOR;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.SINGULAR_OPERATOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.SINGULAR_OPERATOR));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test111");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.BANDWIDTH;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BANDWIDTH + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BANDWIDTH));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test112");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ADDITION_COMPATIBLE_MATRICES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ADDITION_COMPATIBLE_MATRICES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ADDITION_COMPATIBLE_MATRICES));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test113");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NAN_VALUE_CONVERSION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NAN_VALUE_CONVERSION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NAN_VALUE_CONVERSION));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test114");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(9700L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9800L + "'", long2 == 9800L);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test115");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float9 = bigFraction8.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction7.add(bigFraction8);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction10.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction5.add(bigFraction10);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger14 = bigFraction13.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction13.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction5.divide(bigFraction13);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction5.pow((int) ' ');
        java.lang.Object obj19 = null;
        boolean boolean20 = bigFraction18.equals(obj19);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test116");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9046745947545269d + "'", double1 == 0.9046745947545269d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test117");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 70);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 70L + "'", long1 == 70L);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test118");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_MANY_ELEMENTS_TO_DISCARD_FROM_ARRAY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_MANY_ELEMENTS_TO_DISCARD_FROM_ARRAY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_MANY_ELEMENTS_TO_DISCARD_FROM_ARRAY));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test119");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_DECREASING_NUMBER_OF_POINTS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_DECREASING_NUMBER_OF_POINTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_DECREASING_NUMBER_OF_POINTS));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test120");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger3 = bigFraction2.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction(bigInteger1, bigInteger3);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = bigFraction4.bigDecimalValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test121");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((long) 2, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test122");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.subtract((long) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction0.divide((long) '#');
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction0.subtract(bigInteger8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test123");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float7 = bigFraction6.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.add(bigFraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = fractionField10.getZero();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.subtract(fraction12);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException15 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction5, (java.lang.Number) fraction12, true);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction2.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction18 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction19 = fraction2.divide(fraction18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: the fraction to divide by must not be zero: 0/1");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test124");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test125");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1.5845633E31f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5845632502852868E31d + "'", double1 == 1.5845632502852868E31d);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test126");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = bigFraction0.reciprocal();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test127");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test128");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float9 = bigFraction8.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction7.add(bigFraction8);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction10.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction5.add(bigFraction10);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction12.abs();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test129");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ELITISM_RATE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ELITISM_RATE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ELITISM_RATE));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test130");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) 10.0f);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField2 = bigFraction1.getField();
        org.junit.Assert.assertNotNull(bigFractionField2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test131");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(0, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test132");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_OBSERVED_POINTS_IN_SAMPLE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_OBSERVED_POINTS_IN_SAMPLE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_OBSERVED_POINTS_IN_SAMPLE));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test133");
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger3 = bigFraction2.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException7 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), localizedFormats11 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException13 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray12);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException14 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException7, (org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray12);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException15 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray12);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException16 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction2, objArray12);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) 1.5845632502852868E31d, localizable1, objArray12);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test134");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.subtract(bigFraction3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test135");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (short) 0, (float) 5392957440L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test136");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException(0.0d, 0L, (long) (byte) 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test137");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float9 = bigFraction8.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction7.add(bigFraction8);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction10.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction5.add(bigFraction10);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger14 = bigFraction13.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction13.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction5.divide(bigFraction13);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction13.subtract(10);
        double double20 = bigFraction13.pow((-1.5707963267948966d));
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.2177681591407135d + "'", double20 == 4.2177681591407135d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test138");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLEX_NEED_ONE_POINT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLEX_NEED_ONE_POINT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLEX_NEED_ONE_POINT));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test139");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNPARSEABLE_COMPLEX_NUMBER;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNPARSEABLE_COMPLEX_NUMBER + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNPARSEABLE_COMPLEX_NUMBER));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test140");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1.5845633E31f, (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test141");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long8 = bigFraction7.longValue();
        java.math.BigInteger bigInteger9 = bigFraction7.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long12 = bigFraction11.longValue();
        java.math.BigInteger bigInteger13 = bigFraction11.getDenominator();
        java.math.BigInteger bigInteger14 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger9, bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction1.add(bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long18 = bigFraction17.longValue();
        java.math.BigInteger bigInteger19 = bigFraction17.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long22 = bigFraction21.longValue();
        java.math.BigInteger bigInteger23 = bigFraction21.getDenominator();
        java.math.BigInteger bigInteger24 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger19, bigInteger23);
        java.math.BigInteger bigInteger25 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, bigInteger24);
        java.lang.Class<?> wildcardClass26 = bigInteger25.getClass();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test142");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test143");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        int int3 = fraction2.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField5.getZero();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.add(fraction6);
        double double8 = fraction6.doubleValue();
        float float9 = fraction6.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction11 = fraction6.divide(fraction10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test144");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_PERMUTATION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_PERMUTATION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_PERMUTATION));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test145");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        int int1 = bigFraction0.intValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test146");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test147");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 10, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test148");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) 28);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test149");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.add(28);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test150");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test151");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test152");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException5 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0f), localizedFormats9 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException11 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats7, objArray10);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException12 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException5, (org.apache.commons.math3.exception.util.Localizable) localizedFormats6, objArray10);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException13 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats2, objArray10);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException14 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray10);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException15 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray10);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test153");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_MULTIPLICATION_COMPATIBLE_MATRICES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_MULTIPLICATION_COMPATIBLE_MATRICES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_MULTIPLICATION_COMPATIBLE_MATRICES));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test154");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test155");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction6.getField();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction6.getField();
        int int11 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction6);
        int int13 = fraction12.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test156");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test157");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        long long5 = bigFraction1.getNumeratorAsLong();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test158");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_COLUMN_AFTER_FINAL_COLUMN;
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) localizedFormats0);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_COLUMN_AFTER_FINAL_COLUMN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_COLUMN_AFTER_FINAL_COLUMN));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test159");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(36.0d, (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.0d + "'", double2 == 36.0d);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test160");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.subtract(bigFraction5);
        int int7 = bigFraction0.getNumeratorAsInt();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test161");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL_INTERPOLANTS_MISMATCH_SEGMENTS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL_INTERPOLANTS_MISMATCH_SEGMENTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL_INTERPOLANTS_MISMATCH_SEGMENTS));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test162");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test163");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test164");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 70L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.0d + "'", double1 == 70.0d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test165");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_FRACTION_TO_DIVIDE_BY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_FRACTION_TO_DIVIDE_BY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_FRACTION_TO_DIVIDE_BY));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test166");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_ROW_DIMENSION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_ROW_DIMENSION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_ROW_DIMENSION));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test167");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2246467991473532E-16d + "'", double1 == 1.2246467991473532E-16d);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test168");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float4 = bigFraction3.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.add(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long9 = bigFraction8.longValue();
        java.math.BigInteger bigInteger10 = bigFraction8.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long13 = bigFraction12.longValue();
        java.math.BigInteger bigInteger14 = bigFraction12.getDenominator();
        java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction2.add(bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction0.subtract(bigInteger14);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger14, (long) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: exponent (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.25f + "'", float4 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test169");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CONSTRAINT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CONSTRAINT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CONSTRAINT));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test170");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test171");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test172");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.stirlingS2((int) (short) 2, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test173");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR_OVERFLOW_AFTER_MULTIPLY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR_OVERFLOW_AFTER_MULTIPLY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR_OVERFLOW_AFTER_MULTIPLY));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test174");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((-0.9999999999999999d), (-4));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -1 to fraction (-9,007,199,254,740,991/9,007,199,254,740,992)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test175");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.abs();
        long long6 = bigFraction5.longValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test176");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test177");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        int int4 = bigFraction0.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.subtract(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test178");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 32.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896326140304252E13d + "'", double1 == 7.896326140304252E13d);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test179");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-1), (int) (short) -1);
        long long3 = fraction2.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test180");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (short) 100, 200.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1505149978319904d + "'", double2 == 1.1505149978319904d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test181");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_COLUMN_INDEX_ARRAY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_COLUMN_INDEX_ARRAY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_COLUMN_INDEX_ARRAY));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test182");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test183");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test184");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(97.0f, (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.5f + "'", float2 == 48.5f);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test185");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fractionField7.getZero();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction5.divide(fraction9);
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction9.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fractionField12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test186");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(28, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test187");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DEGREES_OF_FREEDOM;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DEGREES_OF_FREEDOM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DEGREES_OF_FREEDOM));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test188");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test189");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigInteger bigInteger3 = bigFraction1.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long6 = bigFraction5.longValue();
        java.math.BigInteger bigInteger7 = bigFraction5.getDenominator();
        java.math.BigInteger bigInteger8 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, bigInteger7);
        java.math.BigInteger bigInteger10 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, 35);
        java.math.BigInteger bigInteger11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction(bigInteger7, bigInteger11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: denominator");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test190");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        long long2 = bigFraction0.getNumeratorAsLong();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test191");
        double double2 = org.apache.commons.math3.util.FastMath.log(Double.NaN, 1.078591488E9d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test192");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction1.getField();
        byte byte6 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test193");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_POINTS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_POINTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_POINTS));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test194");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fractionField7.getZero();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction5.divide(fraction9);
        double double12 = fraction5.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3600.0d + "'", double12 == 3600.0d);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test195");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add((int) (byte) -1);
        double double5 = bigFraction4.percentageValue();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException10 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0f), localizedFormats14 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException16 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats12, objArray15);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException17 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException10, (org.apache.commons.math3.exception.util.Localizable) localizedFormats11, objArray15);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException18 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats7, objArray15);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException19 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, objArray15);
        java.lang.String str20 = localizedFormats6.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats21 = org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats22 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException25 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats27 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-1.0f), localizedFormats29 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException31 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats27, objArray30);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException32 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException25, (org.apache.commons.math3.exception.util.Localizable) localizedFormats26, objArray30);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException33 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats22, objArray30);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException34 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats21, objArray30);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction4, (org.apache.commons.math3.exception.util.Localizable) localizedFormats6, objArray30);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-75.0d) + "'", double5 == (-75.0d));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "cannot normalize a zero norm vector" + "'", str20, "cannot normalize a zero norm vector");
        org.junit.Assert.assertTrue("'" + localizedFormats21 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION + "'", localizedFormats21.equals(org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION));
        org.junit.Assert.assertTrue("'" + localizedFormats22 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats22.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats27 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats27.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test196");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, (-1074790400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test197");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 1.07859136E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0785913600000002E9d + "'", double1 == 1.0785913600000002E9d);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test198");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test199");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test200");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.USER_EXCEPTION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.USER_EXCEPTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.USER_EXCEPTION));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test201");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test202");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(97, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test203");
        long long2 = org.apache.commons.math3.util.MathUtils.copySign(28L, (long) (short) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test204");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1.07859136E9f);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.subtract(341642467);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction9 = fraction2.subtract(fraction8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test205");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException((double) 341642467, 100L, (long) (-1074790400));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test206");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (short) 1, (double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test207");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test208");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.subtract(bigFraction5);
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 1, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float14 = bigFraction13.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction12.add(bigFraction13);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction13.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long20 = bigFraction19.longValue();
        java.math.BigInteger bigInteger21 = bigFraction19.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long24 = bigFraction23.longValue();
        java.math.BigInteger bigInteger25 = bigFraction23.getDenominator();
        java.math.BigInteger bigInteger26 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger21, bigInteger25);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction17.multiply(bigInteger21);
        java.math.BigInteger bigInteger29 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger21, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction10.pow(bigInteger21);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction6.multiply(bigInteger21);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.25f + "'", float14 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test209");
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException0 = new org.apache.commons.math3.exception.MathArithmeticException();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test210");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test211");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 28L, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test212");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.divide(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.reciprocal();
        int int8 = fraction1.compareTo(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.divide(fraction10);
        int int12 = fraction11.getNumerator();
        double double13 = fraction11.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction11.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction7.divide(fraction11);
        int int18 = fraction7.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test213");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_THIRD;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.divide(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test214");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.abs();
        java.math.BigDecimal bigDecimal6 = bigFraction1.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction1.divide(35L);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigFraction8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test215");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test216");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 'a', 1.0471975511965979d, 97);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test217");
        org.apache.commons.math3.util.MathUtils.checkFinite((double) 97.0f);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test218");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float4 = bigFraction3.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.add(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long9 = bigFraction8.longValue();
        java.math.BigInteger bigInteger10 = bigFraction8.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long13 = bigFraction12.longValue();
        java.math.BigInteger bigInteger14 = bigFraction12.getDenominator();
        java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction2.add(bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction0.subtract(bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float22 = bigFraction21.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction20.add(bigFraction21);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction23.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float28 = bigFraction27.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction26.add(bigFraction27);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction29.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction24.add(bigFraction29);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger33 = bigFraction32.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction32.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction24.divide(bigFraction32);
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = bigFraction32.subtract(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction18.multiply(bigFraction32);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction17.multiply(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.25f + "'", float4 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.25f + "'", float22 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.25f + "'", float28 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test219");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable0, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext5 = numberIsTooSmallException4.getContext();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext6 = numberIsTooSmallException4.getContext();
        org.junit.Assert.assertNotNull(exceptionContext5);
        org.junit.Assert.assertNotNull(exceptionContext6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test220");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fractionField4.getZero();
        java.lang.String str6 = fraction5.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test221");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308232d + "'", double1 == 57.29577951308232d);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test222");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        int int4 = fraction3.intValue();
        java.lang.String str5 = fraction3.toString();
        int int6 = fraction3.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test223");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.2840254166877414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test224");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test225");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) 1, (long) (-1074790400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1074790400L) + "'", long2 == (-1074790400L));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test226");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0L, 70);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test227");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        int int4 = bigFraction3.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.subtract(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.multiply((long) 87);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger10 = bigFraction9.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction9.reduce();
        int int12 = bigFraction8.compareTo(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-31) + "'", int4 == (-31));
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test228");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-3L), (float) 5392957440L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.3929574E9f + "'", float2 == 5.3929574E9f);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test229");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0, 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: the fraction to divide by must not be zero: 0/1");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test230");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.multiply(10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float10 = bigFraction9.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.add(bigFraction9);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction8.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long15 = bigFraction14.longValue();
        java.math.BigInteger bigInteger16 = bigFraction14.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long19 = bigFraction18.longValue();
        java.math.BigInteger bigInteger20 = bigFraction18.getDenominator();
        java.math.BigInteger bigInteger21 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger16, bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction8.add(bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction6.pow(bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction23.pow(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal27 = bigFraction25.bigDecimalValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.25f + "'", float10 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction25);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test231");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(4.6566128730773926E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test232");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.multiply(10L);
        double double7 = bigFraction0.percentageValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test233");
        int int1 = org.apache.commons.math3.util.MathUtils.hash(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1018167296 + "'", int1 == 1018167296);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test234");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigDecimal bigDecimal4 = bigFraction1.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger6 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.subtract((int) ' ');
        int int9 = bigFraction8.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.subtract(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction8.multiply((long) 87);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction1.add(bigFraction13);
        short short15 = bigFraction14.shortValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-31) + "'", int9 == (-31));
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -2662 + "'", short15 == (short) -2662);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test235");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) -2662);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test236");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 70L, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 70.00714249274856d + "'", double2 == 70.00714249274856d);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test237");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.divide(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.reciprocal();
        int int8 = fraction1.compareTo(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.divide(fraction10);
        int int12 = fraction11.getNumerator();
        double double13 = fraction11.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction11.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction7.divide(fraction11);
        int int18 = fraction17.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test238");
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) 71.84044670030279d);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test239");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        short short1 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 2 + "'", short1 == (short) 2);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test240");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger4 = bigFraction3.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction3.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction7.reciprocal();
        java.lang.Object[] objArray9 = new java.lang.Object[] { localizedFormats1, localizedFormats2, bigFraction8 };
        org.apache.commons.math3.exception.ZeroException zeroException10 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray9);
        java.lang.Object[] objArray11 = null;
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException12 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray11);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test241");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException4 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), localizedFormats8 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException10 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, objArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException11 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException4, (org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray9);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException12 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray9);
        java.lang.Throwable[] throwableArray13 = mathArithmeticException12.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException14 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray13);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test242");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(0L, (long) 28);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test243");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test244");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException(localizable0, (java.lang.Number) fraction2);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test245");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.718281828459045d, (-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9233097485725157d + "'", double2 == 1.9233097485725157d);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test246");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 70L, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 140.0d + "'", double2 == 140.0d);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test247");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1018167296, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test248");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.multiply(10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float10 = bigFraction9.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.add(bigFraction9);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction8.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long15 = bigFraction14.longValue();
        java.math.BigInteger bigInteger16 = bigFraction14.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long19 = bigFraction18.longValue();
        java.math.BigInteger bigInteger20 = bigFraction18.getDenominator();
        java.math.BigInteger bigInteger21 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger16, bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction8.add(bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction6.pow(bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction23.pow(0L);
        byte byte26 = bigFraction23.byteValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.25f + "'", float10 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 2 + "'", byte26 == (byte) 2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test249");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(45, (int) (short) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.897704943128636d + "'", double2 == 6.897704943128636d);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test250");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9046745947545269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.812337498822692d + "'", double1 == 0.812337498822692d);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test251");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 87, 0.0d, 87);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 87 to fraction (9,223,372,036,854,775,722/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test252");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-1072693248));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1072693248L + "'", long1 == 1072693248L);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test253");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 32L, (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16.0f + "'", float2 == 16.0f);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test254");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARGUMENT_OUTSIDE_DOMAIN;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARGUMENT_OUTSIDE_DOMAIN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARGUMENT_OUTSIDE_DOMAIN));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test255");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(1.0471975511965979d, 0.5d, 28);
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.add(fraction9);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test256");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(1079525376, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test257");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (short) 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test258");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigDecimal bigDecimal4 = bigFraction1.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger6 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.subtract((int) ' ');
        int int9 = bigFraction8.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.subtract(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction8.multiply((long) 87);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction1.add(bigFraction13);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction1.add((-1074790400L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-31) + "'", int9 == (-31));
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction16);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test259");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException(7.896326140304252E13d, 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test260");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (-1074790400));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test261");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(0, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 10, n = 0");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test262");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test263");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float6 = bigFraction5.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction4.add(bigFraction5);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction5.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long12 = bigFraction11.longValue();
        java.math.BigInteger bigInteger13 = bigFraction11.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long16 = bigFraction15.longValue();
        java.math.BigInteger bigInteger17 = bigFraction15.getDenominator();
        java.math.BigInteger bigInteger18 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, bigInteger17);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction9.multiply(bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction2.add(bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float24 = bigFraction23.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction22.add(bigFraction23);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction25.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float30 = bigFraction29.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction28.add(bigFraction29);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction31.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction26.add(bigFraction31);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger35 = bigFraction34.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction34.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = bigFraction26.divide(bigFraction34);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long40 = bigFraction39.longValue();
        java.math.BigInteger bigInteger41 = bigFraction39.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction26.divide(bigInteger41);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction20.multiply(bigInteger41);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger45 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger41, (long) (short) -2662);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: exponent (-2,662)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.25f + "'", float24 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.25f + "'", float30 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction43);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test264");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.9982229502979703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7315377415170512d + "'", double1 == 1.7315377415170512d);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test265");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fractionField7.getOne();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.multiply(1);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test266");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 2.0f, 0.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test267");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(1.0471975511965979d, 0.5d, 28);
        java.lang.Number number4 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException6 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) fraction3, number4, true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test268");
        org.apache.commons.math3.util.MathUtils.checkFinite(4.2177681591407135d);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test269");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass8 = fractionField7.getRuntimeClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test270");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test271");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException4 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), localizedFormats8 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException10 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, objArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException11 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException4, (org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException12 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray9);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "contraction criteria ({0}) smaller than the expansion factor ({1}).  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction." + "'", str1, "contraction criteria ({0}) smaller than the expansion factor ({1}).  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction.");
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test272");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction6.getField();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction6.getField();
        int int11 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction3.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test273");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(7.896326140304252E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625d + "'", double1 == 0.015625d);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test274");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test275");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0000000000000016E-31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test276");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add((int) (byte) -1);
        long long5 = bigFraction0.getNumeratorAsLong();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test277");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.8563690240890007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1221078653007956d + "'", double1 == 3.1221078653007956d);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test278");
        int int1 = org.apache.commons.math3.util.FastMath.round(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test279");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        int int2 = bigFraction1.getNumeratorAsInt();
        short short3 = bigFraction1.shortValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test280");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_THIRD;
        long long1 = bigFraction0.longValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test281");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 4);
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction1.getField();
        org.junit.Assert.assertNotNull(fractionField2);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test282");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 1072693248L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test283");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger3 = bigFraction2.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction(bigInteger1, bigInteger3);
        java.lang.Class<?> wildcardClass5 = bigInteger3.getClass();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test284");
        double double1 = org.apache.commons.math3.util.FastMath.abs(140.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 140.0d + "'", double1 == 140.0d);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test285");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-31), (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test286");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test287");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 10, (long) (-4));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test288");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(1018167296, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test289");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float4 = bigFraction3.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.add(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float10 = bigFraction9.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.add(bigFraction9);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction11.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction6.add(bigFraction11);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger15 = bigFraction14.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction14.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction6.divide(bigFraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction14.subtract(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction0.multiply(bigFraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float24 = bigFraction23.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction22.add(bigFraction23);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction22.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long29 = bigFraction28.longValue();
        java.math.BigInteger bigInteger30 = bigFraction28.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long33 = bigFraction32.longValue();
        java.math.BigInteger bigInteger34 = bigFraction32.getDenominator();
        java.math.BigInteger bigInteger35 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger30, bigInteger34);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction22.add(bigInteger34);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long39 = bigFraction38.longValue();
        java.math.BigInteger bigInteger40 = bigFraction38.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long43 = bigFraction42.longValue();
        java.math.BigInteger bigInteger44 = bigFraction42.getDenominator();
        java.math.BigInteger bigInteger45 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger40, bigInteger44);
        java.math.BigInteger bigInteger46 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger34, bigInteger45);
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction20.subtract(bigInteger34);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.25f + "'", float4 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.25f + "'", float10 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.25f + "'", float24 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigFraction47);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test290");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.divide(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.reciprocal();
        int int8 = fraction1.compareTo(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.divide(fraction10);
        int int12 = fraction11.getNumerator();
        double double13 = fraction11.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction11.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction7.divide(fraction11);
        double double18 = fraction7.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction7.multiply(87);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 200.0d + "'", double18 == 200.0d);
        org.junit.Assert.assertNotNull(fraction20);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test291");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_2D_INDEX;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_2D_INDEX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_2D_INDEX));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test292");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 35L);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test293");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((int) (byte) 2, (long) (short) -2662);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: exponent (-2,662)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test294");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(35, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test295");
        int int1 = org.apache.commons.math3.util.FastMath.abs(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test296");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(70L, 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test297");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        boolean boolean2 = bigFraction0.equals((java.lang.Object) 3.141592653589793d);
        long long3 = bigFraction0.longValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test298");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(70, 28L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 268435456 + "'", int2 == 268435456);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test299");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigDecimal bigDecimal4 = bigFraction1.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger6 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.subtract((int) ' ');
        int int9 = bigFraction8.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.subtract(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction8.multiply((long) 87);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction1.add(bigFraction13);
        double double16 = bigFraction13.pow((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-31) + "'", int9 == (-31));
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test300");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_LIMIT_NOT_POSITIVE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_LIMIT_NOT_POSITIVE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_LIMIT_NOT_POSITIVE));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test301");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray2 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException3 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray2);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException9 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0f), localizedFormats13 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException15 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats11, objArray14);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException16 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException9, (org.apache.commons.math3.exception.util.Localizable) localizedFormats10, objArray14);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException17 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, objArray14);
        java.lang.Throwable[] throwableArray18 = mathArithmeticException17.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException19 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats5, (java.lang.Object[]) throwableArray18);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException20 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException3, (org.apache.commons.math3.exception.util.Localizable) localizedFormats4, (java.lang.Object[]) throwableArray18);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException21 = new org.apache.commons.math3.exception.NullArgumentException(localizable0, (java.lang.Object[]) throwableArray18);
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test302");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 10, 1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test303");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.stirlingS2((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: 10 is larger than the maximum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test304");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1072693248L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5384786408469177d + "'", double1 == 0.5384786408469177d);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test305");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(97);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test306");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(11, 45);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger4 = bigFraction3.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.subtract((long) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction3.divide((long) '#');
        long long11 = bigFraction3.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction2.multiply(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction12.negate();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test307");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-99) + "'", int2 == (-99));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test308");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException(35.0d, (int) (short) 1);
        org.apache.commons.math3.exception.util.Localizable localizable3 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException7 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable3, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext8 = numberIsTooSmallException7.getContext();
        java.lang.Number number9 = numberIsTooSmallException7.getMin();
        java.lang.Throwable[] throwableArray10 = numberIsTooSmallException7.getSuppressed();
        fractionConversionException2.addSuppressed((java.lang.Throwable) numberIsTooSmallException7);
        org.junit.Assert.assertNotNull(exceptionContext8);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 10 + "'", number9, 10);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test309");
        int int1 = org.apache.commons.math3.util.MathUtils.hash(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1807551715 + "'", int1 == 1807551715);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test310");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.027415567780803774d) + "'", double1 == (-0.027415567780803774d));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test311");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.9982229502979703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test312");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger7 = bigFraction6.getNumerator();
        int int8 = bigFraction5.compareTo(bigFraction6);
        int int9 = bigFraction6.getNumeratorAsInt();
        int int10 = bigFraction6.getDenominatorAsInt();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test313");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 32L, 4.6566128730773926E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test314");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 5);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test315");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-99), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test316");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(10.0d);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test317");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.abs();
        byte byte6 = bigFraction5.byteValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test318");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 10, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test319");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) 2, 1077673984);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test320");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test321");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(0L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test322");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float6 = bigFraction5.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction4.add(bigFraction5);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction5.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long12 = bigFraction11.longValue();
        java.math.BigInteger bigInteger13 = bigFraction11.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long16 = bigFraction15.longValue();
        java.math.BigInteger bigInteger17 = bigFraction15.getDenominator();
        java.math.BigInteger bigInteger18 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, bigInteger17);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction9.multiply(bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction2.add(bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction(bigInteger13);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test323");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 32.000004f, 1.9233097485725157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5107651208185948d + "'", double2 == 1.5107651208185948d);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test324");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.divide(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.reciprocal();
        int int8 = fraction1.compareTo(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.divide(fraction10);
        int int12 = fraction11.getNumerator();
        double double13 = fraction11.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction11.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction7.divide(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction7.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test325");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 2);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test326");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) '#', (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test327");
        int int2 = org.apache.commons.math3.util.FastMath.max((-4), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test328");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float9 = bigFraction8.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction7.add(bigFraction8);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction10.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction5.add(bigFraction10);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger14 = bigFraction13.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction13.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction5.divide(bigFraction13);
        short short17 = bigFraction5.shortValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test329");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test330");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float7 = bigFraction6.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.add(bigFraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = fractionField10.getZero();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.subtract(fraction12);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException15 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction5, (java.lang.Number) fraction12, true);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction2.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test331");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger8 = bigFraction7.getNumerator();
        int int9 = bigFraction6.compareTo(bigFraction7);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException10 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) int9);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test332");
        int int1 = org.apache.commons.math3.util.FastMath.abs(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test333");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        int int3 = fraction2.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField5.getZero();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.add(fraction6);
        java.lang.String str8 = fraction2.toString();
        int int9 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.divide(fraction12);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException14 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction13);
        org.apache.commons.math3.fraction.Fraction fraction16 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        int int17 = fraction13.compareTo(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.divide(fraction19);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException21 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction20);
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        int int24 = fraction20.compareTo(fraction23);
        int int25 = fraction13.compareTo(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction10.divide(fraction13);
        int int27 = fraction2.compareTo(fraction26);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test334");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger8 = bigFraction7.getNumerator();
        int int9 = bigFraction6.compareTo(bigFraction7);
        java.lang.String str10 = bigFraction6.toString();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test335");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((int) (short) 0, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test336");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.add(10);
        java.lang.String str7 = bigFraction6.toString();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "41 / 4" + "'", str7, "41 / 4");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test337");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(1079525376, 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 635.856379863918d + "'", double2 == 635.856379863918d);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test338");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.subtract(bigFraction5);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float10 = bigFraction9.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.add(bigFraction9);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction11.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger14 = bigFraction13.getNumerator();
        int int15 = bigFraction12.compareTo(bigFraction13);
        int int16 = bigFraction13.getNumeratorAsInt();
        int int17 = bigFraction0.compareTo(bigFraction13);
        double double18 = bigFraction13.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction13.pow(0);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.25f + "'", float10 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.4d + "'", double18 == 0.4d);
        org.junit.Assert.assertNotNull(bigFraction20);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test339");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.1805916207174113E-14d, (double) 10000000000L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1805916207174113E-14d + "'", double2 == 1.1805916207174113E-14d);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test340");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.negate();
        java.math.BigInteger bigInteger4 = bigFraction3.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.multiply(bigInteger4);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.divide(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction6.multiply(fraction11);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction11.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = fractionField13.getOne();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.multiply(4);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats19 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray20 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException21 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats19, objArray20);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats22 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats23 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats24 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException27 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats28 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats31 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray32 = new java.lang.Object[] { (-1.0f), localizedFormats31 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException33 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats29, objArray32);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException34 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException27, (org.apache.commons.math3.exception.util.Localizable) localizedFormats28, objArray32);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException35 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats24, objArray32);
        java.lang.Throwable[] throwableArray36 = mathArithmeticException35.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException37 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats23, (java.lang.Object[]) throwableArray36);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException38 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException21, (org.apache.commons.math3.exception.util.Localizable) localizedFormats22, (java.lang.Object[]) throwableArray36);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException39 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats18, (java.lang.Object[]) throwableArray36);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats40 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats41 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray42 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException43 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats41, objArray42);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats44 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats45 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats46 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException49 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats50 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats51 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats53 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray54 = new java.lang.Object[] { (-1.0f), localizedFormats53 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException55 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats51, objArray54);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException56 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException49, (org.apache.commons.math3.exception.util.Localizable) localizedFormats50, objArray54);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException57 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats46, objArray54);
        java.lang.Throwable[] throwableArray58 = mathArithmeticException57.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException59 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats45, (java.lang.Object[]) throwableArray58);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException60 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException43, (org.apache.commons.math3.exception.util.Localizable) localizedFormats44, (java.lang.Object[]) throwableArray58);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException61 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats40, (java.lang.Object[]) throwableArray58);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException62 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats18, (java.lang.Object[]) throwableArray58);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) fraction16, (org.apache.commons.math3.exception.util.Localizable) localizedFormats17, (java.lang.Object[]) throwableArray58);
        boolean boolean64 = bigFraction5.equals((java.lang.Object) localizedFormats17);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats19 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats19.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats22 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats22.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats23 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats23.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats24 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats24.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats28 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats28.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats31 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats31.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertTrue("'" + localizedFormats40 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats40.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats41 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats41.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats44 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats44.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats45 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats45.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats46 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats46.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats50 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats50.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats51 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats51.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats53 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats53.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test341");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 10, 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test342");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) 4L, (double) 1.5845633E31f, 1078591488);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test343");
        float float2 = org.apache.commons.math3.util.FastMath.max(35.0f, (float) 9800L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9800.0f + "'", float2 == 9800.0f);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test344");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger5 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction4.add((int) (byte) -1);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException10 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigFraction1, (java.lang.Number) bigFraction4, false);
        long long11 = bigFraction4.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction4.multiply((long) (byte) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction13.multiply(28L);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4L + "'", long11 == 4L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction15);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test345");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        int int3 = fraction2.getNumerator();
        double double4 = fraction2.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction2.add((-4));
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test346");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger3 = bigFraction2.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction(bigInteger1, bigInteger3);
        double double6 = bigFraction4.pow(5.649334448629621d);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test347");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999986258976d + "'", double1 == 0.9999999986258976d);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test348");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField8 = fraction7.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fractionField8.getZero();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField14 = fraction13.getField();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.divide(fraction13);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField16 = fraction13.getField();
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction13.getField();
        int int18 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction10.divide(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField22 = fraction21.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.divide(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField27 = fraction26.getField();
        org.apache.commons.math3.fraction.Fraction fraction28 = fractionField27.getZero();
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.subtract(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction25.divide(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction13.divide(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction0.add(fraction32);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fractionField22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fractionField27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test349");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(100L);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test350");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test351");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (short) -2662);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test352");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.subtract((long) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction0.divide((long) '#');
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction7.add((long) (short) -1);
        double double10 = bigFraction9.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.9928571428571429d) + "'", double10 == (-0.9928571428571429d));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test353");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test354");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) '4', (double) (short) -2662);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-52.0d) + "'", double2 == (-52.0d));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test355");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger5 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction4.add((int) (byte) -1);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException10 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigFraction1, (java.lang.Number) bigFraction4, false);
        boolean boolean11 = numberIsTooSmallException10.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test356");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 31.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5410520681182421d + "'", double1 == 0.5410520681182421d);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test357");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        int int3 = fraction2.getNumerator();
        double double4 = fraction2.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.multiply(fraction8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test358");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(35.0f, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35840.0f + "'", float2 == 35840.0f);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test359");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1078591488);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test360");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float8 = bigFraction7.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction6.add(bigFraction7);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction7.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long14 = bigFraction13.longValue();
        java.math.BigInteger bigInteger15 = bigFraction13.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long18 = bigFraction17.longValue();
        java.math.BigInteger bigInteger19 = bigFraction17.getDenominator();
        java.math.BigInteger bigInteger20 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger15, bigInteger19);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction11.multiply(bigInteger15);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger23 = bigFraction22.getNumerator();
        java.math.BigInteger bigInteger24 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger15, bigInteger23);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction4.divide(bigInteger24);
        double double27 = bigFraction4.pow(1.3383347192042695E42d);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.25f + "'", float8 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test361");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) (-99), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99L) + "'", long2 == (-99L));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test362");
        double double1 = org.apache.commons.math3.util.FastMath.asin(25.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test363");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1078591488);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.1798740081135376E10d + "'", double1 == 6.1798740081135376E10d);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test364");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test365");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        int int2 = bigFraction1.getNumeratorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.pow(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test366");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 10000000000L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test367");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 1);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test368");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        java.math.BigDecimal bigDecimal3 = bigFraction2.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.pow((-1));
        float float6 = bigFraction2.floatValue();
        long long7 = bigFraction2.longValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test369");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(0, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test370");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.00001f + "'", float1 == 100.00001f);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test371");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float4 = bigFraction3.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.add(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long9 = bigFraction8.longValue();
        java.math.BigInteger bigInteger10 = bigFraction8.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long13 = bigFraction12.longValue();
        java.math.BigInteger bigInteger14 = bigFraction12.getDenominator();
        java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction2.add(bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction0.subtract(bigInteger14);
        double double18 = bigFraction0.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.25f + "'", float4 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.25d + "'", double18 == 0.25d);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test372");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test373");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.multiply(35);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float7 = bigFraction6.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.add(bigFraction6);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction6.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long13 = bigFraction12.longValue();
        java.math.BigInteger bigInteger14 = bigFraction12.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long17 = bigFraction16.longValue();
        java.math.BigInteger bigInteger18 = bigFraction16.getDenominator();
        java.math.BigInteger bigInteger19 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger14, bigInteger18);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction10.multiply(bigInteger14);
        java.math.BigInteger bigInteger22 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger14, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction3.divide(bigInteger22);
        int int24 = bigFraction3.getNumeratorAsInt();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test374");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 100.0f, 23.7189981105004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7415503163138826E47d + "'", double2 == 2.7415503163138826E47d);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test375");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) ' ', (double) 341642467, (int) (short) 10);
        int int4 = bigFraction3.intValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test376");
        long long2 = org.apache.commons.math3.util.FastMath.min((-99L), 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99L) + "'", long2 == (-99L));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test377");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide(fraction2);
        int int4 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fractionField6.getZero();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.add(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.divide(fraction10);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction10.getField();
        org.apache.commons.math3.fraction.FractionField fractionField14 = fraction10.getField();
        int int15 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction0.subtract(fraction16);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test378");
        org.apache.commons.math3.util.MathUtils.checkFinite((double) 35840.0f);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test379");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(0, 1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 10);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test380");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction6.getField();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction6.getField();
        int int11 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction6);
        long long13 = fraction6.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test381");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long3 = bigFraction2.longValue();
        java.math.BigInteger bigInteger4 = bigFraction2.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long7 = bigFraction6.longValue();
        java.math.BigInteger bigInteger8 = bigFraction6.getDenominator();
        java.math.BigInteger bigInteger9 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger4, bigInteger8);
        java.math.BigInteger bigInteger11 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger8, 35);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.divide(fraction13);
        int int15 = fraction14.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField17 = fraction16.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = fractionField17.getZero();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction14.add(fraction18);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException21 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigInteger8, (java.lang.Number) fraction18, false);
        java.lang.String str22 = fraction18.toString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test382");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger5 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction4.add((int) (byte) -1);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException10 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigFraction1, (java.lang.Number) bigFraction4, false);
        long long11 = bigFraction4.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction4.add((long) (short) 10);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4L + "'", long11 == 4L);
        org.junit.Assert.assertNotNull(bigFraction13);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test383");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.5410520681182421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test384");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction6.getField();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction6.getField();
        int int11 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField15 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.divide(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField20 = fraction19.getField();
        org.apache.commons.math3.fraction.Fraction fraction21 = fractionField20.getZero();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.subtract(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction18.divide(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction6.divide(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.divide(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction30.divide(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.reciprocal();
        int int34 = fraction27.compareTo(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction35.divide(fraction36);
        int int38 = fraction33.compareTo(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction24.divide(fraction33);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField40 = fraction39.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fractionField40);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test385");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 52L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test386");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException(7.930067261567154E14d, (int) '#');
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = fractionConversionException2.getContext();
        org.junit.Assert.assertNotNull(exceptionContext3);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test387");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction6.getField();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction6.getField();
        int int11 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction6.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test388");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 0.25541281188299536d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test389");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        java.lang.String str2 = fraction0.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2" + "'", str2, "2");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test390");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        java.math.BigDecimal bigDecimal3 = bigFraction2.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.pow((-1));
        float float6 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float10 = bigFraction9.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.add(bigFraction9);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction8.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long15 = bigFraction14.longValue();
        java.math.BigInteger bigInteger16 = bigFraction14.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long19 = bigFraction18.longValue();
        java.math.BigInteger bigInteger20 = bigFraction18.getDenominator();
        java.math.BigInteger bigInteger21 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger16, bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction8.add(bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction2.multiply(bigFraction22);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction23.negate();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.25f + "'", float10 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test391");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        long long1 = fraction0.longValue();
        boolean boolean3 = fraction0.equals((java.lang.Object) (-0.6321205588285577d));
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test392");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray4 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException5 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats3, objArray4);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException11 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0f), localizedFormats15 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException17 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, objArray16);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException18 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException11, (org.apache.commons.math3.exception.util.Localizable) localizedFormats12, objArray16);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException19 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray16);
        java.lang.Throwable[] throwableArray20 = mathArithmeticException19.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException21 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats7, (java.lang.Object[]) throwableArray20);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException22 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException5, (org.apache.commons.math3.exception.util.Localizable) localizedFormats6, (java.lang.Object[]) throwableArray20);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException23 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats2, (java.lang.Object[]) throwableArray20);
        org.apache.commons.math3.exception.ZeroException zeroException24 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray20);
        java.lang.Number number25 = zeroException24.getArgument();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cannot format a {0} instance as a 3D vector" + "'", str1, "cannot format a {0} instance as a 3D vector");
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 0 + "'", number25, 0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test393");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException8 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction6);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test394");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 9800L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test395");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(35.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test396");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 1, (long) (short) -2);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test397");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger6 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.negate();
        java.math.BigInteger bigInteger8 = bigFraction7.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction2.subtract(bigInteger8);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long12 = bigFraction11.longValue();
        java.math.BigInteger bigInteger13 = bigFraction11.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long16 = bigFraction15.longValue();
        java.math.BigInteger bigInteger17 = bigFraction15.getDenominator();
        java.math.BigInteger bigInteger18 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, bigInteger17);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction2.multiply(bigInteger17);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test398");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 341642467, 1.5107651208185948d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020999055593360003d + "'", double2 == 0.020999055593360003d);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test399");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.MINUS_ONE;
        long long1 = bigFraction0.longValue();
        long long2 = bigFraction0.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.subtract((long) 1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long7 = bigFraction6.longValue();
        java.math.BigInteger bigInteger8 = bigFraction6.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction4.subtract(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction9);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test400");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        double double3 = bigFraction0.pow((double) (byte) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.pow(0L);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.048576E-4d + "'", double3 == 1.048576E-4d);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test401");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 2L, (double) 1.07859136E9f, 45);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test402");
        int int2 = org.apache.commons.math3.util.FastMath.max(3, (int) (byte) 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test403");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(0.0d, (-0.6321205588285577d), (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test404");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float6 = bigFraction5.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction4.add(bigFraction5);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction5.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long12 = bigFraction11.longValue();
        java.math.BigInteger bigInteger13 = bigFraction11.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long16 = bigFraction15.longValue();
        java.math.BigInteger bigInteger17 = bigFraction15.getDenominator();
        java.math.BigInteger bigInteger18 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, bigInteger17);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction9.multiply(bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction2.add(bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction2.reciprocal();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test405");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        int int3 = fraction1.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.reciprocal();
        int int5 = fraction0.compareTo(fraction1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.divide(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test406");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        double double3 = bigFraction0.pow((double) (byte) 10);
        int int4 = bigFraction0.intValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.048576E-4d + "'", double3 == 1.048576E-4d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test407");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger5 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction4.add((int) (byte) -1);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException10 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigFraction1, (java.lang.Number) bigFraction4, false);
        long long11 = bigFraction4.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction4.multiply((long) (byte) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction13.subtract(100);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal17 = bigFraction15.bigDecimalValue((-31));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4L + "'", long11 == 4L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction15);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test408");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        int int2 = org.apache.commons.math3.util.MathUtils.hash(doubleArray0);
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        int int4 = org.apache.commons.math3.util.MathUtils.hash(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test409");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        int int2 = fraction0.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test410");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIGEST_NOT_INITIALIZED;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException6 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), localizedFormats10 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException12 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray11);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException13 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException6, (org.apache.commons.math3.exception.util.Localizable) localizedFormats7, objArray11);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException14 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats3, objArray11);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException15 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction1, objArray11);
        org.apache.commons.math3.exception.ConvergenceException convergenceException16 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray11);
        java.lang.Class<?> wildcardClass17 = localizedFormats0.getClass();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIGEST_NOT_INITIALIZED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIGEST_NOT_INITIALIZED));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test411");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException2 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction0);
        boolean boolean3 = notPositiveException2.getBoundIsAllowed();
        java.lang.Number number4 = notPositiveException2.getMin();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0 + "'", number4, 0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test412");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction0.add((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((double) 1.07859136E9f);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction13 = fraction0.add(fraction11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test413");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.subtract(341642467);
        long long6 = fraction5.longValue();
        byte byte7 = fraction5.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-341642466L) + "'", long6 == (-341642466L));
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 30 + "'", byte7 == (byte) 30);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test414");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_32_BITS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_32_BITS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_32_BITS));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test415");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide(fraction2);
        int int4 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fractionField6.getZero();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.add(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.divide(fraction10);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction10.getField();
        org.apache.commons.math3.fraction.FractionField fractionField14 = fraction10.getField();
        int int15 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction8.multiply(fraction10);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException17 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction16);
        boolean boolean18 = notPositiveException17.getBoundIsAllowed();
        boolean boolean19 = notPositiveException17.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test416");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test417");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(10L, 10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger4 = bigFraction3.getNumerator();
        double double6 = bigFraction3.pow((double) (byte) 10);
        int int7 = bigFraction2.compareTo(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction2.subtract((int) (short) -1);
        long long10 = bigFraction2.longValue();
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.048576E-4d + "'", double6 == 1.048576E-4d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test418");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 48.5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test419");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-1), (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test420");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.0000000000000016E-31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test421");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1079525376, (-4));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test422");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.divide(fraction3);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, (java.lang.Number) fraction2);
        java.lang.Throwable[] throwableArray6 = notPositiveException5.getSuppressed();
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException7 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray6);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float11 = bigFraction10.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction9.add(bigFraction10);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction12.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float17 = bigFraction16.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction15.add(bigFraction16);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction18.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction13.add(bigFraction18);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger22 = bigFraction21.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction21.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction13.divide(bigFraction21);
        java.math.BigInteger bigInteger25 = bigFraction13.getNumerator();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException26 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigFraction13);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.25f + "'", float11 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.25f + "'", float17 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigInteger25);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test423");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 100, (long) 1);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test424");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 100, 10.0d, (int) (byte) 100);
        int int4 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test425");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        int int4 = bigFraction3.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.subtract(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.multiply((long) 87);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction8.reciprocal();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = bigFraction9.bigDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Non-terminating decimal expansion; no exact representable decimal result.");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-31) + "'", int4 == (-31));
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test426");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        int int4 = bigFraction3.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float8 = bigFraction7.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction6.add(bigFraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = fractionField11.getZero();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.subtract(fraction13);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException16 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction6, (java.lang.Number) fraction13, true);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long19 = bigFraction18.longValue();
        java.math.BigInteger bigInteger20 = bigFraction18.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long23 = bigFraction22.longValue();
        java.math.BigInteger bigInteger24 = bigFraction22.getDenominator();
        java.math.BigInteger bigInteger25 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger20, bigInteger24);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction6.multiply(bigInteger25);
        double double27 = bigFraction26.doubleValue();
        int int28 = bigFraction3.compareTo(bigFraction26);
        int int29 = bigFraction3.getDenominatorAsInt();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-31) + "'", int4 == (-31));
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.25f + "'", float8 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test427");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float5 = bigFraction4.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.add(bigFraction4);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = bigFraction6.bigDecimalValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.25f + "'", float5 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction6);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test428");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide(fraction2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.subtract(fraction6);
        short short8 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test429");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.divide(fraction4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test430");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0L, (long) 1807551715);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test431");
        double double3 = org.apache.commons.math3.util.MathUtils.reduce(0.0d, (double) 21952L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test432");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.negate();
        java.lang.Class<?> wildcardClass3 = bigFraction2.getClass();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test433");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        float float2 = bigFraction1.floatValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test434");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3010299956639812d + "'", double1 == 0.3010299956639812d);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test435");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((int) (byte) 100, (int) '4');
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test436");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test437");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        int int4 = bigFraction3.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.subtract(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.multiply((long) 87);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        boolean boolean11 = bigFraction9.equals((java.lang.Object) 3.141592653589793d);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction3.multiply(bigFraction9);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        boolean boolean15 = bigFraction13.equals((java.lang.Object) 3.141592653589793d);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction12.subtract(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-31) + "'", int4 == (-31));
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bigFraction16);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test438");
        org.apache.commons.math3.util.MathUtils.checkFinite((double) (short) 0);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test439");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = fractionField3.getZero();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.divide(fraction8);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField11 = fraction8.getField();
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction8.getField();
        int int13 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction5.divide(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField17 = fraction16.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.divide(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField22 = fraction21.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = fractionField22.getZero();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.subtract(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction20.divide(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction8.divide(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction28.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction26.divide(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction1.multiply(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction33 = new org.apache.commons.math3.fraction.Fraction(45);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.multiply(fraction33);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fractionField22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction34);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test440");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(97.0d, 35.0056243223838d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.016872967151407d) + "'", double2 == (-8.016872967151407d));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test441");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction0.add((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction9.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException11 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction9);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test442");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray1 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException2 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray1);
        java.lang.String str3 = mathIllegalStateException2.toString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math3.exception.MathIllegalStateException: element {0} is negative: {1}" + "'", str3, "org.apache.commons.math3.exception.MathIllegalStateException: element {0} is negative: {1}");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test443");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        int int2 = fraction0.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.divide(fraction5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test444");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        java.lang.Number number1 = null;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.divide(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.multiply(fraction7);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction7.getField();
        org.apache.commons.math3.fraction.Fraction fraction10 = fractionField9.getOne();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.multiply(4);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException14 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable0, number1, (java.lang.Number) 4, false);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test445");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fractionField4.getZero();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField4.getOne();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test446");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 32, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test447");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger3 = bigFraction2.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.subtract((int) ' ');
        int int6 = bigFraction5.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.subtract(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction5.multiply((long) 87);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        boolean boolean13 = bigFraction11.equals((java.lang.Object) 3.141592653589793d);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction5.multiply(bigFraction11);
        org.apache.commons.math3.exception.util.Localizable localizable15 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException19 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable15, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext20 = numberIsTooSmallException19.getContext();
        java.lang.Number number21 = numberIsTooSmallException19.getMin();
        java.lang.Throwable[] throwableArray22 = numberIsTooSmallException19.getSuppressed();
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException23 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction11, (java.lang.Object[]) throwableArray22);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException24 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 1.1505149978319904d, (java.lang.Object[]) throwableArray22);
        org.apache.commons.math3.exception.util.Localizable localizable25 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException28 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats26, (java.lang.Number) 10);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext29 = notPositiveException28.getContext();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats30 = org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_ROW_INDEX_ARRAY;
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger32 = bigFraction31.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats33 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException36 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats37 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats38 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats40 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray41 = new java.lang.Object[] { (-1.0f), localizedFormats40 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException42 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats38, objArray41);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException43 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException36, (org.apache.commons.math3.exception.util.Localizable) localizedFormats37, objArray41);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException44 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats33, objArray41);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException45 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction31, objArray41);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException46 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException28, (org.apache.commons.math3.exception.util.Localizable) localizedFormats30, objArray41);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException47 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notFiniteNumberException24, localizable25, objArray41);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-31) + "'", int6 == (-31));
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(exceptionContext20);
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 10 + "'", number21, 10);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA));
        org.junit.Assert.assertNotNull(exceptionContext29);
        org.junit.Assert.assertTrue("'" + localizedFormats30 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_ROW_INDEX_ARRAY + "'", localizedFormats30.equals(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_ROW_INDEX_ARRAY));
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + localizedFormats33 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats33.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats37 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats37.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats38 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats38.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats40 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats40.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test448");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.627482429927895d), (double) 16.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.627482429927895d + "'", double2 == 0.627482429927895d);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test449");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.add((long) (byte) 2);
        org.junit.Assert.assertNotNull(bigFraction3);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test450");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.4934271057485095E19d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test451");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float4 = bigFraction3.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.add(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long9 = bigFraction8.longValue();
        java.math.BigInteger bigInteger10 = bigFraction8.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long13 = bigFraction12.longValue();
        java.math.BigInteger bigInteger14 = bigFraction12.getDenominator();
        java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction2.add(bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction0.subtract(bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction0.pow((int) 'a');
        int int20 = bigFraction0.getNumeratorAsInt();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.25f + "'", float4 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test452");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) 341642467, 100.00000762939453d, 0);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test453");
        int int1 = org.apache.commons.math3.util.MathUtils.hash((double) 1078591488);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1104155264 + "'", int1 == 1104155264);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test454");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.subtract(bigFraction5);
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction6.subtract(bigFraction8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test455");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((int) (short) 2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test456");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        int int3 = fraction2.getNumerator();
        double double4 = fraction2.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction((double) 1.07859136E9f);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction9.negate();
        int int11 = fraction7.compareTo(fraction9);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test457");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow((long) (short) 10, (long) 1018167296);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test458");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0, 10);
        java.lang.String str3 = fraction2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test459");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        int int3 = org.apache.commons.math3.util.MathUtils.hash(doubleArray0);
        int int4 = org.apache.commons.math3.util.MathUtils.hash(doubleArray0);
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test460");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        int int3 = fraction2.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField5.getZero();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.add(fraction6);
        int int8 = fraction2.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction2.abs();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.multiply(3);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test461");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 9700L, (-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5708614938627248d + "'", double2 == 1.5708614938627248d);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test462");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.subtract((int) ' ');
        int int5 = bigFraction4.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float9 = bigFraction8.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction7.add(bigFraction8);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction10.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float15 = bigFraction14.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction13.add(bigFraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction16.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction11.add(bigFraction16);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException20 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) int5, (java.lang.Number) bigFraction11, true);
        double double21 = bigFraction11.doubleValue();
        java.lang.String str22 = bigFraction11.toString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-31) + "'", int5 == (-31));
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.25f + "'", float15 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.25d + "'", double21 == 0.25d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1 / 4" + "'", str22, "1 / 4");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test463");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog(28);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 67.88974313718154d + "'", double1 == 67.88974313718154d);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test464");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        java.math.BigDecimal bigDecimal3 = bigFraction2.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.pow((-1));
        float float6 = bigFraction2.floatValue();
        float float7 = bigFraction2.floatValue();
        int int8 = bigFraction2.intValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test465");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test466");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass3 = fractionField1.getRuntimeClass();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass4 = fractionField1.getRuntimeClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test467");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) (short) -2662);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test468");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.515438670919167E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4333571589785714d) + "'", double1 == (-0.4333571589785714d));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test469");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.add(0);
        long long7 = bigFraction6.getNumeratorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction6.divide((long) (byte) 2);
        long long10 = bigFraction6.getDenominatorAsLong();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4L + "'", long10 == 4L);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test470");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.04148215213377604d, (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04148215213377604d + "'", double2 == 0.04148215213377604d);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test471");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test472");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float4 = bigFraction3.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.add(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float10 = bigFraction9.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.add(bigFraction9);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction11.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction6.add(bigFraction11);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger15 = bigFraction14.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction14.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction6.divide(bigFraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction14.subtract(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction0.multiply(bigFraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction14.add(38L);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.25f + "'", float4 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.25f + "'", float10 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test473");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test474");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.subtract((long) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction0.divide((long) '#');
        short short8 = bigFraction0.shortValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test475");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException((double) 2, 35L, 100L);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext4 = fractionConversionException3.getContext();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext5 = fractionConversionException3.getContext();
        org.junit.Assert.assertNotNull(exceptionContext4);
        org.junit.Assert.assertNotNull(exceptionContext5);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test476");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.getNumeratorAsLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test477");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-31));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test478");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 1, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float6 = bigFraction5.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction4.add(bigFraction5);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction5.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long12 = bigFraction11.longValue();
        java.math.BigInteger bigInteger13 = bigFraction11.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long16 = bigFraction15.longValue();
        java.math.BigInteger bigInteger17 = bigFraction15.getDenominator();
        java.math.BigInteger bigInteger18 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, bigInteger17);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction9.multiply(bigInteger13);
        java.math.BigInteger bigInteger21 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction2.pow(bigInteger13);
        int int23 = bigFraction2.getNumeratorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction2.reduce();
        int int25 = bigFraction2.getNumeratorAsInt();
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test479");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(97, 35);
        double double3 = bigFraction2.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.7714285714285714d + "'", double3 == 2.7714285714285714d);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test480");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide(fraction2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.negate();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test481");
        double double1 = org.apache.commons.math3.util.FastMath.log(7.896326140304252E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.00000381469725d + "'", double1 == 32.00000381469725d);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test482");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 70.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.515438670919167E30d + "'", double1 == 2.515438670919167E30d);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test483");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction6.getField();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction6.getField();
        int int11 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction6);
        int int13 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction6.multiply(87);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.multiply(1);
        double double18 = fraction15.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 43.5d + "'", double18 == 43.5d);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test484");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.9999912096442254d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test485");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fractionField6.getZero();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.subtract(fraction8);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException11 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction1, (java.lang.Number) fraction8, true);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long14 = bigFraction13.longValue();
        java.math.BigInteger bigInteger15 = bigFraction13.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long18 = bigFraction17.longValue();
        java.math.BigInteger bigInteger19 = bigFraction17.getDenominator();
        java.math.BigInteger bigInteger20 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger15, bigInteger19);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction1.multiply(bigInteger20);
        byte byte22 = bigInteger20.byteValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test486");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(360339393);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test487");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        int int4 = fraction3.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test488");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.1221078653007956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test489");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_ELEMENT_AT_INDEX;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.divide(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.multiply(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fractionField8.getOne();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.multiply(4);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray15 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException16 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats14, objArray15);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats19 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException22 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats23 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats24 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray27 = new java.lang.Object[] { (-1.0f), localizedFormats26 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException28 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats24, objArray27);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException29 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException22, (org.apache.commons.math3.exception.util.Localizable) localizedFormats23, objArray27);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException30 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats19, objArray27);
        java.lang.Throwable[] throwableArray31 = mathArithmeticException30.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException32 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats18, (java.lang.Object[]) throwableArray31);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException33 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException16, (org.apache.commons.math3.exception.util.Localizable) localizedFormats17, (java.lang.Object[]) throwableArray31);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException34 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, (java.lang.Object[]) throwableArray31);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats35 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats36 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray37 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException38 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats36, objArray37);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats39 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats40 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats41 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException44 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats45 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats46 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats48 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray49 = new java.lang.Object[] { (-1.0f), localizedFormats48 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException50 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats46, objArray49);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException51 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException44, (org.apache.commons.math3.exception.util.Localizable) localizedFormats45, objArray49);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException52 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats41, objArray49);
        java.lang.Throwable[] throwableArray53 = mathArithmeticException52.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException54 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats40, (java.lang.Object[]) throwableArray53);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException55 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException38, (org.apache.commons.math3.exception.util.Localizable) localizedFormats39, (java.lang.Object[]) throwableArray53);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException56 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats35, (java.lang.Object[]) throwableArray53);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException57 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, (java.lang.Object[]) throwableArray53);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) fraction11, (org.apache.commons.math3.exception.util.Localizable) localizedFormats12, (java.lang.Object[]) throwableArray53);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException59 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray53);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext60 = mathArithmeticException59.getContext();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_ELEMENT_AT_INDEX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats19 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats19.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats23 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats23.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats24 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats24.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertTrue("'" + localizedFormats35 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats35.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats36 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats36.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats39 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats39.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats40 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats40.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats41 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats41.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats45 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats45.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats46 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats46.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats48 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats48.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(exceptionContext60);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test490");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_OBJECT_TO_FRACTION;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = localizedFormats0.getLocalizedString(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_OBJECT_TO_FRACTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_OBJECT_TO_FRACTION));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test491");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(1.0471975511965979d, 0.5d, 28);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.subtract((int) (short) -2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test492");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test493");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float4 = bigFraction3.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.add(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float10 = bigFraction9.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.add(bigFraction9);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction11.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction6.add(bigFraction11);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger15 = bigFraction14.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction14.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction6.divide(bigFraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction14.subtract(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction0.multiply(bigFraction14);
        double double22 = bigFraction20.pow(10.0d);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.25f + "'", float4 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.25f + "'", float10 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.099511627776E-8d + "'", double22 == 1.099511627776E-8d);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test494");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog((int) (byte) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test495");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fractionField7.getOne();
        org.apache.commons.math3.fraction.Fraction fraction9 = fractionField7.getZero();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction9.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test496");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient((int) (byte) 30, 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27405L + "'", long2 == 27405L);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test497");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 360339393, (double) (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.931342865682863E-35d + "'", double2 == 5.931342865682863E-35d);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test498");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        int int4 = bigFraction3.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float8 = bigFraction7.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction6.add(bigFraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = fractionField11.getZero();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.subtract(fraction13);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException16 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction6, (java.lang.Number) fraction13, true);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long19 = bigFraction18.longValue();
        java.math.BigInteger bigInteger20 = bigFraction18.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long23 = bigFraction22.longValue();
        java.math.BigInteger bigInteger24 = bigFraction22.getDenominator();
        java.math.BigInteger bigInteger25 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger20, bigInteger24);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction6.multiply(bigInteger25);
        double double27 = bigFraction26.doubleValue();
        int int28 = bigFraction3.compareTo(bigFraction26);
        long long29 = bigFraction3.longValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-31) + "'", int4 == (-31));
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.25f + "'", float8 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-31L) + "'", long29 == (-31L));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test499");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction6.getField();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction6.getField();
        int int11 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction6);
        int int13 = fraction3.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.divide(fraction16);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException18 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        int int21 = fraction17.compareTo(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction22.divide(fraction23);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException25 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction24);
        org.apache.commons.math3.fraction.Fraction fraction27 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        int int28 = fraction24.compareTo(fraction27);
        int int29 = fraction17.compareTo(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction14.divide(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction3.subtract(fraction17);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test500");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient((int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 10, n = 1");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }
}

