package org.apache.commons.math3.fraction;

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
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fractionField7.getZero();
        org.apache.commons.math3.fraction.Fraction fraction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.subtract(fraction9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test502");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger6 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.negate();
        java.math.BigInteger bigInteger8 = bigFraction7.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction2.subtract(bigInteger8);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = new org.apache.commons.math3.fraction.BigFraction(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction9);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test503");
        int int1 = org.apache.commons.math3.util.MathUtils.hash(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test504");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 2 to fraction (-1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test505");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(200.0d, (int) (short) -2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 200 to fraction (-199/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test506");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float7 = bigFraction6.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.add(bigFraction6);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction8.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float13 = bigFraction12.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction11.add(bigFraction12);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction14.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction9.add(bigFraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger18 = bigFraction17.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction17.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction9.divide(bigFraction17);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction17.subtract(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction3.multiply(bigFraction17);
        int int24 = bigFraction2.compareTo(bigFraction17);
        int int25 = bigFraction17.getDenominatorAsInt();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.25f + "'", float13 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test507");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(71.84044670030279d, (double) 1077673984, 5);
        java.math.BigDecimal bigDecimal6 = bigFraction3.bigDecimalValue((int) (short) 1, (int) (short) 1);
        short short7 = bigFraction3.shortValue();
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 71 + "'", short7 == (short) 71);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test508");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ZERO;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add(fraction2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test509");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(341642467, 28);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.85673842301471E209d + "'", double2 == 2.85673842301471E209d);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test510");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 87, 0.0d, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 87 to fraction (9,223,372,036,854,775,722/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test511");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger19 = bigFraction18.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction18.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction18.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float26 = bigFraction25.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction24.add(bigFraction25);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction25.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long32 = bigFraction31.longValue();
        java.math.BigInteger bigInteger33 = bigFraction31.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long36 = bigFraction35.longValue();
        java.math.BigInteger bigInteger37 = bigFraction35.getDenominator();
        java.math.BigInteger bigInteger38 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger33, bigInteger37);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction29.multiply(bigInteger33);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger41 = bigFraction40.getNumerator();
        java.math.BigInteger bigInteger42 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger33, bigInteger41);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction22.divide(bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction17.pow(bigInteger42);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger46 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger42, (-341642466L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: exponent (-341,642,466)");
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
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.25f + "'", float26 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertNotNull(bigFraction44);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test512");
        double double2 = org.apache.commons.math3.util.FastMath.pow(19.049875621120893d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.754711873930048E127d + "'", double2 == 9.754711873930048E127d);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test513");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-31.0d), 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-496.0d) + "'", double2 == (-496.0d));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test514");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(6.691673596021348E41d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 669,167,359,602,134,800,000,000,000,000,000,000,000,000 to fraction (9,223,372,036,854,775,807/1)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test515");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger3 = bigFraction2.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction(bigInteger1, bigInteger3);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.add(35L);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigFraction6);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test516");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.divide(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.divide(fraction2);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test517");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (short) 71);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test518");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.897704943128636d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test519");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_SIZE;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException6 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f), localizedFormats10 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException12 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray11);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException13 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException6, (org.apache.commons.math3.exception.util.Localizable) localizedFormats7, objArray11);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException14 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats3, objArray11);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException15 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats2, objArray11);
        org.apache.commons.math3.exception.util.Localizable localizable16 = null;
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger18 = bigFraction17.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction17.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float22 = bigFraction21.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction17.add(bigFraction21);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats24 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger26 = bigFraction25.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats27 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException30 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats31 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats32 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats34 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1.0f), localizedFormats34 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException36 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats32, objArray35);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException37 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException30, (org.apache.commons.math3.exception.util.Localizable) localizedFormats31, objArray35);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException38 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats27, objArray35);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException39 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction25, objArray35);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction17, (org.apache.commons.math3.exception.util.Localizable) localizedFormats24, objArray35);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException41 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalArgumentException15, localizable16, objArray35);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException42 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigFraction1, objArray35);
        double double43 = bigFraction1.percentageValue();
        java.math.BigDecimal bigDecimal44 = bigFraction1.bigDecimalValue();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_SIZE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_SIZE));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.25f + "'", float22 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertTrue("'" + localizedFormats24 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats24.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertTrue("'" + localizedFormats27 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats27.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats31 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats31.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats32 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats32.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats34 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats34.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 60.0d + "'", double43 == 60.0d);
        org.junit.Assert.assertNotNull(bigDecimal44);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test520");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.5384786408469177d, 1.0000000000000016E-31d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5384786408469175d + "'", double2 == 0.5384786408469175d);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test521");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.abs();
        java.lang.String str6 = bigFraction4.toString();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction4.multiply((long) '4');
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertNotNull(bigFraction8);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test522");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.add(0);
        long long7 = bigFraction6.getNumeratorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction6.divide(1078591488);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(bigFraction9);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test523");
        java.lang.Number number0 = null;
        java.lang.Number number1 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException3 = new org.apache.commons.math3.exception.NumberIsTooSmallException(number0, number1, false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test524");
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
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide(fraction15);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException17 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction3.add(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction18.abs();
        int int20 = fraction19.intValue();
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
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test525");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigInteger bigInteger3 = bigFraction1.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long6 = bigFraction5.longValue();
        java.math.BigInteger bigInteger7 = bigFraction5.getDenominator();
        java.math.BigInteger bigInteger8 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, bigInteger7);
        java.math.BigInteger bigInteger10 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, 35);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException11 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) bigInteger10);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction(bigInteger10);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction12.reciprocal();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigFraction13);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test526");
        org.apache.commons.math3.util.MathUtils.checkFinite((double) (short) 1);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test527");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.negate();
        java.math.BigInteger bigInteger3 = bigFraction2.getDenominator();
        org.apache.commons.math3.fraction.BigFractionField bigFractionField4 = bigFraction2.getField();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.reciprocal();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigFractionField4);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test528");
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
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide(fraction15);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException17 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction3.add(fraction16);
        int int19 = fraction16.getDenominator();
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
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test529");
        int int2 = org.apache.commons.math3.util.FastMath.min((-4), 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test530");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(1072693248L);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test531");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), localizedFormats7 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException9 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray8);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException10 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException3, (org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray8);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException11 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray8);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_SIZE;
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException18 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats19 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats20 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats22 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray23 = new java.lang.Object[] { (-1.0f), localizedFormats22 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException24 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats20, objArray23);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException25 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException18, (org.apache.commons.math3.exception.util.Localizable) localizedFormats19, objArray23);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException26 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats15, objArray23);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException27 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats14, objArray23);
        org.apache.commons.math3.exception.util.Localizable localizable28 = null;
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger30 = bigFraction29.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction29.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float34 = bigFraction33.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction29.add(bigFraction33);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats36 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger38 = bigFraction37.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats39 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException42 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats43 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats44 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats46 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray47 = new java.lang.Object[] { (-1.0f), localizedFormats46 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException48 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats44, objArray47);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException49 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException42, (org.apache.commons.math3.exception.util.Localizable) localizedFormats43, objArray47);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException50 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats39, objArray47);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException51 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction37, objArray47);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction29, (org.apache.commons.math3.exception.util.Localizable) localizedFormats36, objArray47);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException53 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalArgumentException27, localizable28, objArray47);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException54 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats12, (java.lang.Number) bigFraction13, objArray47);
        mathArithmeticException11.addSuppressed((java.lang.Throwable) notFiniteNumberException54);
        org.apache.commons.math3.fraction.Fraction fraction56 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction57 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField58 = fraction57.getField();
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction56.divide(fraction57);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField60 = fraction57.getField();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException61 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction57);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException65 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) 2, (java.lang.Number) 1.2246467991473532E-16d, false);
        boolean boolean66 = numberIsTooSmallException65.getBoundIsAllowed();
        boolean boolean67 = numberIsTooSmallException65.getBoundIsAllowed();
        notPositiveException61.addSuppressed((java.lang.Throwable) numberIsTooSmallException65);
        notFiniteNumberException54.addSuppressed((java.lang.Throwable) numberIsTooSmallException65);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_SIZE + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_SIZE));
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats19 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats19.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats20 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats20.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats22 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats22.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.25f + "'", float34 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertTrue("'" + localizedFormats36 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats36.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertTrue("'" + localizedFormats39 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats39.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats43 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats43.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats44 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats44.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats46 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats46.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fractionField58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fractionField60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test532");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO;
        org.apache.commons.math3.fraction.BigFractionField bigFractionField1 = bigFraction0.getField();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFractionField1);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test533");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        int int3 = fraction2.getNumerator();
        double double4 = fraction2.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.subtract(341642467);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction2.subtract(fraction6);
        double double12 = fraction2.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test534");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        int int2 = org.apache.commons.math3.util.MathUtils.hash(doubleArray0);
        int int3 = org.apache.commons.math3.util.MathUtils.hash(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test535");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 268435456);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5380218700469711E10d + "'", double1 == 1.5380218700469711E10d);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test536");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.divide(fraction3);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction4);
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        int int8 = fraction4.compareTo(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction4.abs();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction1.add(fraction9);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test537");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(1807551715, (int) (byte) 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-929312903) + "'", int2 == (-929312903));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test538");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        int int3 = fraction2.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField5.getZero();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.add(fraction6);
        int int8 = fraction2.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction2.subtract(fraction9);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField11 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = fractionField11.getOne();
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
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test539");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) -2662, 9800L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9800L + "'", long2 == 9800L);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test540");
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
        java.math.BigInteger bigInteger26 = bigFraction4.getDenominator();
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
        org.junit.Assert.assertNotNull(bigInteger26);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test541");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.627482429927895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46603960848311693d) + "'", double1 == (-0.46603960848311693d));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test542");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long9 = bigFraction8.longValue();
        java.math.BigInteger bigInteger10 = bigFraction8.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long13 = bigFraction12.longValue();
        java.math.BigInteger bigInteger14 = bigFraction12.getDenominator();
        java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction6.multiply(bigInteger10);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger18 = bigFraction17.getNumerator();
        java.math.BigInteger bigInteger19 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, bigInteger18);
        java.math.BigInteger bigInteger21 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger18, 0L);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger21);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test543");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 35);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test544");
        double double1 = org.apache.commons.math3.util.FastMath.log10(7.629394531324015E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.117509926283467d) + "'", double1 == (-5.117509926283467d));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test545");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        java.math.BigDecimal bigDecimal3 = bigFraction2.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.abs();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test546");
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
        long long18 = bigFraction17.getNumeratorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction17.pow((int) (short) 10);
        int int21 = bigFraction20.intValue();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3L) + "'", long18 == (-3L));
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test547");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test548");
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
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide(fraction15);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException17 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction3.add(fraction16);
        float float19 = fraction3.floatValue();
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
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test549");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(4, (int) ' ');
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test550");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) 10.0f);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.pow(4L);
        org.junit.Assert.assertNotNull(bigFraction3);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test551");
        double double1 = org.apache.commons.math3.util.FastMath.asin(32.00000381469725d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test552");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(1807551715);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test553");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_NTH_ROOT_FOR_NEGATIVE_N;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException4 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), localizedFormats8 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException10 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, objArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException11 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException4, (org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray9);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException12 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray9);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException13 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray9);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_NTH_ROOT_FOR_NEGATIVE_N + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_NTH_ROOT_FOR_NEGATIVE_N));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test554");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.reciprocal();
        long long5 = fraction3.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float9 = bigFraction8.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction7.add(bigFraction8);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction8.add(0);
        int int13 = bigFraction12.getDenominatorAsInt();
        boolean boolean14 = fraction3.equals((java.lang.Object) bigFraction12);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction12.abs();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bigFraction15);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test555");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        java.math.BigDecimal bigDecimal3 = bigFraction2.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.pow((-1));
        float float6 = bigFraction2.floatValue();
        float float7 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((double) 10.000001f);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction9.subtract((-99));
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction2.divide(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test556");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.569397566060481d + "'", double1 == 7.569397566060481d);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test557");
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
        java.lang.Class<?> wildcardClass26 = fraction25.getClass();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats27 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED;
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float31 = bigFraction30.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction29.add(bigFraction30);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction32.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger35 = bigFraction34.getNumerator();
        int int36 = bigFraction33.compareTo(bigFraction34);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField37 = bigFraction33.getField();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats38 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats39 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats40 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger42 = bigFraction41.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction41.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction41.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction45.reciprocal();
        java.lang.Object[] objArray47 = new java.lang.Object[] { localizedFormats39, localizedFormats40, bigFraction46 };
        org.apache.commons.math3.exception.ZeroException zeroException48 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats38, objArray47);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException49 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats27, (java.lang.Number) bigFraction33, objArray47);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats50 = org.apache.commons.math3.exception.util.LocalizedFormats.FUNCTION_NOT_DIFFERENTIABLE;
        java.lang.Number number51 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats52 = org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats53 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException56 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats57 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats58 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats60 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1.0f), localizedFormats60 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException62 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats58, objArray61);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException63 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException56, (org.apache.commons.math3.exception.util.Localizable) localizedFormats57, objArray61);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException64 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats53, objArray61);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException65 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats52, objArray61);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException66 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats50, number51, objArray61);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) wildcardClass26, (org.apache.commons.math3.exception.util.Localizable) localizedFormats27, objArray61);
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
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + localizedFormats27 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED + "'", localizedFormats27.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED));
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.25f + "'", float31 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField37);
        org.junit.Assert.assertTrue("'" + localizedFormats38 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats38.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats39 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats39.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats40 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats40.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertTrue("'" + localizedFormats50 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.FUNCTION_NOT_DIFFERENTIABLE + "'", localizedFormats50.equals(org.apache.commons.math3.exception.util.LocalizedFormats.FUNCTION_NOT_DIFFERENTIABLE));
        org.junit.Assert.assertTrue("'" + localizedFormats52 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION + "'", localizedFormats52.equals(org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION));
        org.junit.Assert.assertTrue("'" + localizedFormats53 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats53.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats57 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats57.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats58 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats58.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats60 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats60.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test558");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5395564933646284d, (double) 1079525376);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.079525376E9d + "'", double2 == 1.079525376E9d);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test559");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 340593891, 87);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test560");
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
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction39.multiply(2);
        double double42 = fraction39.percentageValue();
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
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 3600.0d + "'", double42 == 3600.0d);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test561");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (short) 71);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2626798770413155d + "'", double1 == 4.2626798770413155d);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test562");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.MINUS_ONE;
        long long1 = bigFraction0.longValue();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESSES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException7 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f), localizedFormats11 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException13 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray12);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException14 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException7, (org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray12);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException15 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray12);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException16 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats3, objArray12);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED;
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float21 = bigFraction20.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction19.add(bigFraction20);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction22.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger25 = bigFraction24.getNumerator();
        int int26 = bigFraction23.compareTo(bigFraction24);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField27 = bigFraction23.getField();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats28 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats30 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger32 = bigFraction31.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction31.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction31.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction35.reciprocal();
        java.lang.Object[] objArray37 = new java.lang.Object[] { localizedFormats29, localizedFormats30, bigFraction36 };
        org.apache.commons.math3.exception.ZeroException zeroException38 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats28, objArray37);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException39 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats17, (java.lang.Number) bigFraction23, objArray37);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException40 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats3, objArray37);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction0, (org.apache.commons.math3.exception.util.Localizable) localizedFormats2, objArray37);
        java.math.BigDecimal bigDecimal42 = bigFraction0.bigDecimalValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESSES + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESSES));
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED));
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.25f + "'", float21 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField27);
        org.junit.Assert.assertTrue("'" + localizedFormats28 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats28.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats30 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats30.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertNotNull(bigDecimal42);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test563");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(6, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 6/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test564");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 1, (float) 28L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test565");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField5.getOne();
        org.apache.commons.math3.fraction.Fraction fraction7 = fractionField5.getZero();
        long long8 = fraction7.longValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction9.multiply(fraction14);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField16 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = fractionField16.getZero();
        int int18 = fraction7.compareTo(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField23 = fraction22.getField();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField26 = fraction25.getField();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.divide(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction22.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction17.add(fraction27);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fractionField23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fractionField26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test566");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.negate();
        java.math.BigInteger bigInteger4 = bigFraction3.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.multiply(bigInteger4);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction0.divide((long) 31);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test567");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException4 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), localizedFormats8 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException10 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, objArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException11 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException4, (org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray9);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException12 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray9);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException13 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray9);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED;
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float18 = bigFraction17.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction16.add(bigFraction17);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction19.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger22 = bigFraction21.getNumerator();
        int int23 = bigFraction20.compareTo(bigFraction21);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField24 = bigFraction20.getField();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats25 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats27 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger29 = bigFraction28.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction28.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction28.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction32.reciprocal();
        java.lang.Object[] objArray34 = new java.lang.Object[] { localizedFormats26, localizedFormats27, bigFraction33 };
        org.apache.commons.math3.exception.ZeroException zeroException35 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats25, objArray34);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException36 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats14, (java.lang.Number) bigFraction20, objArray34);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException37 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray34);
        java.util.Locale locale38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = localizedFormats0.getLocalizedString(locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED));
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.25f + "'", float18 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField24);
        org.junit.Assert.assertTrue("'" + localizedFormats25 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats25.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats27 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats27.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test568");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField5.getOne();
        org.apache.commons.math3.fraction.Fraction fraction7 = fractionField5.getZero();
        long long8 = fraction7.longValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction9.multiply(fraction14);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField16 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = fractionField16.getZero();
        int int18 = fraction7.compareTo(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.subtract(fraction19);
        int int22 = fraction17.getNumerator();
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField23 = fraction17.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(fractionField23);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test569");
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
        int int12 = fraction7.compareTo(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField15 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.divide(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.divide(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction22.reciprocal();
        int int25 = fraction18.compareTo(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.divide(fraction27);
        int int29 = fraction28.getNumerator();
        double double30 = fraction28.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction31.negate();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction28.multiply(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction24.divide(fraction28);
        int int35 = fraction14.compareTo(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction24.subtract((int) (byte) 0);
        double double38 = fraction37.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction7.multiply(fraction37);
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
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2.0d + "'", double38 == 2.0d);
        org.junit.Assert.assertNotNull(fraction39);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test570");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) '#');
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.divide(bigFraction2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test571");
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
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass10 = fractionField7.getRuntimeClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test572");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass5 = fractionField4.getRuntimeClass();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass6 = fractionField4.getRuntimeClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test573");
        double double1 = org.apache.commons.math3.util.FastMath.cos(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test574");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0000002f + "'", float1 == 2.0000002f);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test575");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(0.0d, 7.105427357600977E-15d, 1807551715);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.multiply((-341642466L));
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test576");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.multiply(11);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float9 = bigFraction8.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction7.add(bigFraction8);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction8.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger14 = bigFraction13.getNumerator();
        int int15 = bigFraction12.compareTo(bigFraction13);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float19 = bigFraction18.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction17.add(bigFraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField22 = fraction21.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = fractionField22.getZero();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.subtract(fraction24);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException27 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction17, (java.lang.Number) fraction24, true);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long30 = bigFraction29.longValue();
        java.math.BigInteger bigInteger31 = bigFraction29.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long34 = bigFraction33.longValue();
        java.math.BigInteger bigInteger35 = bigFraction33.getDenominator();
        java.math.BigInteger bigInteger36 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger31, bigInteger35);
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = bigFraction17.multiply(bigInteger36);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction12.subtract(bigInteger36);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction5.divide(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.25f + "'", float19 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fractionField22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test577");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        int int3 = fraction2.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField5.getZero();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.add(fraction6);
        int int8 = fraction2.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction2.subtract(fraction9);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField11 = fraction2.getField();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass12 = fractionField11.getRuntimeClass();
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
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test578");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.subtract((long) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction0.multiply((long) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction0.negate();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test579");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DENOMINATOR;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 6.338124408909002E-58d, (java.lang.Number) 38L, true);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DENOMINATOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DENOMINATOR));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test580");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException2 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction0);
        boolean boolean3 = notPositiveException2.getBoundIsAllowed();
        java.lang.String str4 = notPositiveException2.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math3.exception.NotPositiveException: -1 is smaller than the minimum (0)" + "'", str4, "org.apache.commons.math3.exception.NotPositiveException: -1 is smaller than the minimum (0)");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test581");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        double double3 = fraction1.doubleValue();
        double double4 = fraction1.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.negate();
        double double6 = fraction5.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.subtract(6);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test582");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(31, 1078591488);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test583");
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
        float float44 = bigFraction20.floatValue();
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
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.25f + "'", float44 == 1.25f);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test584");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction20.add(bigFraction21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
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
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test585");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        int int4 = bigFraction3.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.subtract(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.multiply((long) 87);
        int int9 = bigFraction8.getDenominatorAsInt();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-31) + "'", int4 == (-31));
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test586");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo((long) (-30));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test587");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test588");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.multiply(35);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.abs();
        double double5 = bigFraction0.pow((double) 3);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.064d + "'", double5 == 0.064d);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test589");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction(10L, 10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.multiply(bigFraction4);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float9 = bigFraction8.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction7.add(bigFraction8);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction8.add(0);
        long long13 = bigFraction12.getNumeratorAsLong();
        long long14 = bigFraction12.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction4.subtract(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 4L + "'", long14 == 4L);
        org.junit.Assert.assertNotNull(bigFraction15);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test590");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test591");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.multiply(fraction6);
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test592");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(97, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test593");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(0, (-1072693248));
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test594");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float5 = bigFraction4.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.add(bigFraction4);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger8 = bigFraction7.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction7.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction7.add((int) (byte) -1);
        double double12 = bigFraction11.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction4.multiply(bigFraction11);
        double double14 = bigFraction11.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.25f + "'", float5 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-75.0d) + "'", double12 == (-75.0d));
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.75d) + "'", double14 == (-0.75d));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test595");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction0.add((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = fractionField11.getZero();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.subtract(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField17 = fraction16.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.divide(fraction16);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField19 = fraction16.getField();
        org.apache.commons.math3.fraction.FractionField fractionField20 = fraction16.getField();
        int int21 = fraction16.intValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction13.divide(fraction16);
        int int23 = fraction16.intValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction0.divide(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction16.add((-127));
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
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test596");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), localizedFormats7 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException9 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray8);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException10 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException3, (org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray8);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException11 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray8);
        java.lang.Throwable[] throwableArray12 = mathArithmeticException11.getSuppressed();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext13 = mathArithmeticException11.getContext();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext14 = mathArithmeticException11.getContext();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(exceptionContext13);
        org.junit.Assert.assertNotNull(exceptionContext14);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test597");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(0.0d);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test598");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 31);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test599");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(0.5410520681182421d);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test600");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction0.add((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.divide(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction0.divide(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.negate();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction15.subtract(fraction19);
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
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test601");
        double double2 = org.apache.commons.math3.util.FastMath.log(23.7189981105004d, 1.2840254166877414d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07895710087951932d + "'", double2 == 0.07895710087951932d);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test602");
        double double1 = org.apache.commons.math3.util.FastMath.exp(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test603");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.divide(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(1);
        int int14 = fraction6.compareTo(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.negate();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction4.multiply(fraction15);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test604");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-341642466L), (float) 1079525366L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.41642464E8f) + "'", float2 == (-3.41642464E8f));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test605");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction3.abs();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = bigFraction3.bigDecimalValue((-127));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test606");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(1074790400, 45);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test607");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(31.026580882699598d, 635.856379863918d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.026580882699598d + "'", double2 == 31.026580882699598d);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test608");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 27405L);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fractionField2.getZero();
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test609");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 31, 1079525366L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test610");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.divide(fraction3);
        int int5 = fraction4.getNumerator();
        double double6 = fraction4.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.negate();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction4.multiply(fraction8);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger13 = bigFraction12.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction12.subtract((int) ' ');
        int int16 = bigFraction15.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction15.subtract(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction15.multiply((long) 87);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        boolean boolean23 = bigFraction21.equals((java.lang.Object) 3.141592653589793d);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction15.multiply(bigFraction21);
        org.apache.commons.math3.exception.util.Localizable localizable25 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException29 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable25, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext30 = numberIsTooSmallException29.getContext();
        java.lang.Number number31 = numberIsTooSmallException29.getMin();
        java.lang.Throwable[] throwableArray32 = numberIsTooSmallException29.getSuppressed();
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException33 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction21, (java.lang.Object[]) throwableArray32);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException34 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats10, (java.lang.Number) 1.1505149978319904d, (java.lang.Object[]) throwableArray32);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException35 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction8, (java.lang.Object[]) throwableArray32);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "contraction criteria ({0}) smaller than the expansion factor ({1}).  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction." + "'", str1, "contraction criteria ({0}) smaller than the expansion factor ({1}).  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction.");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-31) + "'", int16 == (-31));
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(exceptionContext30);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 10 + "'", number31, 10);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test611");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        boolean boolean2 = bigFraction0.equals((java.lang.Object) 3.141592653589793d);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.multiply(0);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test612");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (short) 0, 1.9073486E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9073486E-6f + "'", float2 == 1.9073486E-6f);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test613");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(340593891, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test614");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField8 = fraction7.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.divide(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction4.multiply(fraction9);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField11 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.divide(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.divide(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.reciprocal();
        int int20 = fraction13.compareTo(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction9.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction3.subtract(fraction19);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test615");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.negate();
        java.math.BigInteger bigInteger4 = bigFraction3.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.multiply(bigInteger4);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = new org.apache.commons.math3.fraction.BigFraction(bigInteger4);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test616");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        java.math.BigDecimal bigDecimal2 = bigFraction1.bigDecimalValue();
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test617");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction23.pow(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float29 = bigFraction28.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction27.add(bigFraction28);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction28.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long35 = bigFraction34.longValue();
        java.math.BigInteger bigInteger36 = bigFraction34.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long39 = bigFraction38.longValue();
        java.math.BigInteger bigInteger40 = bigFraction38.getDenominator();
        java.math.BigInteger bigInteger41 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger36, bigInteger40);
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction32.multiply(bigInteger36);
        long long43 = bigFraction42.getNumeratorAsLong();
        boolean boolean44 = bigFraction25.equals((java.lang.Object) bigFraction42);
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
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.25f + "'", float29 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test618");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ROWS_LENGTHS;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.divide(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.divide(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.reciprocal();
        int int14 = fraction7.compareTo(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.divide(fraction16);
        int int18 = fraction17.getNumerator();
        double double19 = fraction17.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction20.negate();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction17.multiply(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction13.divide(fraction17);
        int int24 = fraction3.compareTo(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction13.subtract((int) (byte) 0);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException28 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) (-127), (java.lang.Number) (byte) 0, true);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext29 = numberIsTooSmallException28.getContext();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ROWS_LENGTHS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ROWS_LENGTHS));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(exceptionContext29);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test619");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide((int) (byte) 1);
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        boolean boolean5 = fraction2.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test620");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fractionField4.getZero();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.multiply(10);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test621");
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
        double double25 = bigFraction23.pow((double) (-929312903));
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
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test622");
        long long1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test623");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 71, 1077673984);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test624");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test625");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float1 = bigFraction0.floatValue();
        double double2 = bigFraction0.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.25f + "'", float1 == 0.25f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25d + "'", double2 == 0.25d);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test626");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(10L, 10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger4 = bigFraction3.getNumerator();
        double double6 = bigFraction3.pow((double) (byte) 10);
        int int7 = bigFraction2.compareTo(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction2.subtract((int) (short) -1);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction11.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger15 = bigFraction14.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction14.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction14.add((int) (byte) -1);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException20 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats10, (java.lang.Number) bigFraction11, (java.lang.Number) bigFraction14, false);
        long long21 = bigFraction14.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction14.multiply((long) (byte) 100);
        java.math.BigInteger bigInteger24 = bigFraction14.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long27 = bigFraction26.longValue();
        java.math.BigInteger bigInteger28 = bigFraction26.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long31 = bigFraction30.longValue();
        java.math.BigInteger bigInteger32 = bigFraction30.getDenominator();
        java.math.BigInteger bigInteger33 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger28, bigInteger32);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = new org.apache.commons.math3.fraction.BigFraction(bigInteger24, bigInteger28);
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction2.multiply(bigInteger24);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.048576E-4d + "'", double6 == 1.048576E-4d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 4L + "'", long21 == 4L);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigFraction35);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test627");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction23.add(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger30 = bigFraction29.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction29.negate();
        java.math.BigInteger bigInteger32 = bigFraction31.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction28.multiply(bigInteger32);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction23.divide(bigInteger32);
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction2.subtract(bigInteger32);
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long38 = bigFraction37.longValue();
        java.math.BigInteger bigInteger39 = bigFraction37.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long42 = bigFraction41.longValue();
        java.math.BigInteger bigInteger43 = bigFraction41.getDenominator();
        java.math.BigInteger bigInteger44 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger39, bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction35.subtract(bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long48 = bigFraction47.longValue();
        java.math.BigInteger bigInteger49 = bigFraction47.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction51 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long52 = bigFraction51.longValue();
        java.math.BigInteger bigInteger53 = bigFraction51.getDenominator();
        java.math.BigInteger bigInteger54 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger49, bigInteger53);
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = bigFraction45.add(bigInteger54);
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
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 100L + "'", long48 == 100L);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 100L + "'", long52 == 100L);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigFraction55);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test628");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test629");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test630");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.5107651208185948d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test631");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test632");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger3 = bigFraction2.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction(bigInteger1, bigInteger3);
        java.math.BigInteger bigInteger6 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, 4L);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigInteger6);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test633");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(1077673984, 1018167296);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test634");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((-4), 31);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test635");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.multiply(11);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float9 = bigFraction8.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction7.add(bigFraction8);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction7.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long14 = bigFraction13.longValue();
        java.math.BigInteger bigInteger15 = bigFraction13.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long18 = bigFraction17.longValue();
        java.math.BigInteger bigInteger19 = bigFraction17.getDenominator();
        java.math.BigInteger bigInteger20 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger15, bigInteger19);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction7.add(bigInteger19);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long24 = bigFraction23.longValue();
        java.math.BigInteger bigInteger25 = bigFraction23.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long28 = bigFraction27.longValue();
        java.math.BigInteger bigInteger29 = bigFraction27.getDenominator();
        java.math.BigInteger bigInteger30 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger25, bigInteger29);
        java.math.BigInteger bigInteger31 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger19, bigInteger30);
        java.math.BigInteger bigInteger33 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger19, (int) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction3.subtract(bigInteger19);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigFraction34);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test636");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test637");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        int int3 = fraction2.getNumerator();
        double double4 = fraction2.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.subtract(341642467);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction2.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test638");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.61512051684126d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.61512051684126d + "'", double2 == 4.61512051684126d);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test639");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float6 = bigFraction5.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction1.add(bigFraction5);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger10 = bigFraction9.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException14 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats16 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (-1.0f), localizedFormats18 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException20 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats16, objArray19);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException21 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException14, (org.apache.commons.math3.exception.util.Localizable) localizedFormats15, objArray19);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException22 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats11, objArray19);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException23 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction9, objArray19);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction1, (org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray19);
        org.apache.commons.math3.exception.ConvergenceException convergenceException25 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray19);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext26 = convergenceException25.getContext();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats16 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats16.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(exceptionContext26);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test640");
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
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats60 = org.apache.commons.math3.exception.util.LocalizedFormats.PROPAGATION_DIRECTION_MISMATCH;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats61 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats62 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats63 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction64 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger65 = bigFraction64.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = bigFraction64.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = bigFraction64.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = bigFraction68.reciprocal();
        java.lang.Object[] objArray70 = new java.lang.Object[] { localizedFormats62, localizedFormats63, bigFraction69 };
        org.apache.commons.math3.exception.ZeroException zeroException71 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats61, objArray70);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException72 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathArithmeticException59, (org.apache.commons.math3.exception.util.Localizable) localizedFormats60, objArray70);
        java.lang.Throwable[] throwableArray73 = mathArithmeticException59.getSuppressed();
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
        org.junit.Assert.assertTrue("'" + localizedFormats60 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PROPAGATION_DIRECTION_MISMATCH + "'", localizedFormats60.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PROPAGATION_DIRECTION_MISMATCH));
        org.junit.Assert.assertTrue("'" + localizedFormats61 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats61.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats62 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats62.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats63 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats63.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction64);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertNotNull(bigFraction68);
        org.junit.Assert.assertNotNull(bigFraction69);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertNotNull(throwableArray73);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test641");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(9800L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test642");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.FUNCTION;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) int2);
        java.lang.String str4 = localizedFormats0.getSourceString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.FUNCTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.FUNCTION));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "function" + "'", str4, "function");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test643");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        int int4 = org.apache.commons.math3.util.MathUtils.hash(doubleArray0);
        org.apache.commons.math3.util.MathUtils.checkFinite(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test644");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        int int6 = fraction2.compareTo(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.abs();
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) fraction7);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test645");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long9 = bigFraction8.longValue();
        java.math.BigInteger bigInteger10 = bigFraction8.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long13 = bigFraction12.longValue();
        java.math.BigInteger bigInteger14 = bigFraction12.getDenominator();
        java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction6.multiply(bigInteger10);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger18 = bigFraction17.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction17.subtract((int) ' ');
        int int21 = bigFraction20.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction20.subtract(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction20.multiply((long) 87);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        boolean boolean28 = bigFraction26.equals((java.lang.Object) 3.141592653589793d);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction20.multiply(bigFraction26);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float33 = bigFraction32.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction31.add(bigFraction32);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction32.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long39 = bigFraction38.longValue();
        java.math.BigInteger bigInteger40 = bigFraction38.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long43 = bigFraction42.longValue();
        java.math.BigInteger bigInteger44 = bigFraction42.getDenominator();
        java.math.BigInteger bigInteger45 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger40, bigInteger44);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction36.multiply(bigInteger40);
        java.math.BigInteger bigInteger48 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger40, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction26.multiply(bigInteger40);
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = bigFraction6.pow(bigInteger40);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.25f + "'", float33 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigFraction50);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test646");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction3.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long7 = bigFraction6.longValue();
        java.math.BigInteger bigInteger8 = bigFraction6.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long11 = bigFraction10.longValue();
        java.math.BigInteger bigInteger12 = bigFraction10.getDenominator();
        java.math.BigInteger bigInteger13 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger8, bigInteger12);
        java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger12, 28L);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats16 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX;
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long19 = bigFraction18.longValue();
        java.math.BigInteger bigInteger20 = bigFraction18.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long23 = bigFraction22.longValue();
        java.math.BigInteger bigInteger24 = bigFraction22.getDenominator();
        java.math.BigInteger bigInteger25 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger20, bigInteger24);
        java.math.BigInteger bigInteger27 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger24, 35);
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.divide(fraction29);
        int int31 = fraction30.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField33 = fraction32.getField();
        org.apache.commons.math3.fraction.Fraction fraction34 = fractionField33.getZero();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction30.add(fraction34);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException37 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats16, (java.lang.Number) bigInteger24, (java.lang.Number) fraction34, false);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction(bigInteger12, bigInteger24);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction4.subtract(bigInteger12);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + localizedFormats16 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX + "'", localizedFormats16.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fractionField33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(bigFraction39);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test647");
        long long1 = org.apache.commons.math3.util.FastMath.abs(70L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 70L + "'", long1 == 70L);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test648");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.0f, (float) (-341642466L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test649");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        int int6 = fraction2.compareTo(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.divide(fraction8);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException10 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        int int13 = fraction9.compareTo(fraction12);
        int int14 = fraction2.compareTo(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField19 = fraction18.getField();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.divide(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction15.multiply(fraction20);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField22 = fraction21.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.reciprocal();
        int int24 = fraction12.compareTo(fraction23);
        double double25 = fraction12.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fractionField22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test650");
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
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats23 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction24.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger28 = bigFraction27.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction27.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction27.add((int) (byte) -1);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException33 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats23, (java.lang.Number) bigFraction24, (java.lang.Number) bigFraction27, false);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction27.reciprocal();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction22.add(bigFraction34);
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
        org.junit.Assert.assertTrue("'" + localizedFormats23 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats23.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction35);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test651");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.332621544395286E157d + "'", double1 == 9.332621544395286E157d);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test652");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 30, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 30/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test653");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(10L, 10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger4 = bigFraction3.getNumerator();
        double double6 = bigFraction3.pow((double) (byte) 10);
        int int7 = bigFraction2.compareTo(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction2.subtract((int) (short) -1);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.048576E-4d + "'", double6 == 1.048576E-4d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(bigFraction9);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test654");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.subtract((long) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction0.divide((long) '#');
        long long8 = bigFraction0.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction9.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction9.multiply(5392957440L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction0.divide(bigFraction13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction13);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test655");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 38L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.0d + "'", double1 == 38.0d);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test656");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float7 = bigFraction6.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.add(bigFraction6);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction8.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float13 = bigFraction12.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction11.add(bigFraction12);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction14.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction9.add(bigFraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger18 = bigFraction17.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction17.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction9.divide(bigFraction17);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction17.subtract(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction3.multiply(bigFraction17);
        int int24 = bigFraction2.compareTo(bigFraction17);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long27 = bigFraction26.longValue();
        java.math.BigInteger bigInteger28 = bigFraction26.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long31 = bigFraction30.longValue();
        java.math.BigInteger bigInteger32 = bigFraction30.getDenominator();
        java.math.BigInteger bigInteger33 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger28, bigInteger32);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction17.divide(bigInteger33);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float38 = bigFraction37.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction36.add(bigFraction37);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction36.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long43 = bigFraction42.longValue();
        java.math.BigInteger bigInteger44 = bigFraction42.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long47 = bigFraction46.longValue();
        java.math.BigInteger bigInteger48 = bigFraction46.getDenominator();
        java.math.BigInteger bigInteger49 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger44, bigInteger48);
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = bigFraction36.add(bigInteger48);
        org.apache.commons.math3.fraction.BigFraction bigFraction52 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long53 = bigFraction52.longValue();
        java.math.BigInteger bigInteger54 = bigFraction52.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long57 = bigFraction56.longValue();
        java.math.BigInteger bigInteger58 = bigFraction56.getDenominator();
        java.math.BigInteger bigInteger59 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger54, bigInteger58);
        java.math.BigInteger bigInteger60 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger48, bigInteger59);
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger62 = bigFraction61.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger64 = bigFraction63.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction65 = new org.apache.commons.math3.fraction.BigFraction(bigInteger62, bigInteger64);
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = new org.apache.commons.math3.fraction.BigFraction(bigInteger48, bigInteger64);
        java.math.BigInteger bigInteger68 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger64, 4);
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = bigFraction17.multiply(bigInteger64);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.25f + "'", float13 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.25f + "'", float38 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 100L + "'", long47 == 100L);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 100L + "'", long53 == 100L);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 100L + "'", long57 == 100L);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigFraction63);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigFraction69);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test657");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) 35.0f);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test658");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow((long) (short) -1, 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test659");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(1, 1078591488);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.divide(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.reciprocal();
        int int15 = fraction8.compareTo(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.divide(fraction17);
        int int19 = fraction18.getNumerator();
        double double20 = fraction18.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction21.negate();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction18.multiply(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction14.divide(fraction18);
        int int25 = fraction4.compareTo(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction14.subtract((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction2.multiply(fraction14);
        long long29 = fraction14.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 2L + "'", long29 == 2L);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test660");
        byte byte2 = org.apache.commons.math3.util.MathUtils.copySign((byte) 100, (byte) 30);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test661");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long3 = bigFraction2.longValue();
        java.math.BigDecimal bigDecimal5 = bigFraction2.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        boolean boolean8 = bigFraction2.equals((java.lang.Object) bigFraction7);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException13 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray18 = new java.lang.Object[] { (-1.0f), localizedFormats17 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException19 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats15, objArray18);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException20 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException13, (org.apache.commons.math3.exception.util.Localizable) localizedFormats14, objArray18);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException21 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats10, objArray18);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException22 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray18);
        org.apache.commons.math3.exception.util.Localizable localizable23 = null;
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger25 = bigFraction24.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction24.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float29 = bigFraction28.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction24.add(bigFraction28);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats31 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger33 = bigFraction32.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats34 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException37 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats38 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats39 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats41 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (-1.0f), localizedFormats41 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException43 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats39, objArray42);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException44 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException37, (org.apache.commons.math3.exception.util.Localizable) localizedFormats38, objArray42);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException45 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats34, objArray42);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException46 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction32, objArray42);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction24, (org.apache.commons.math3.exception.util.Localizable) localizedFormats31, objArray42);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException48 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalArgumentException22, localizable23, objArray42);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException49 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigFraction7, objArray42);
        int int50 = bigFraction7.getNumeratorAsInt();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats51 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_ROOT_OF_UNITY_INDEX;
        boolean boolean52 = bigFraction7.equals((java.lang.Object) localizedFormats51);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.25f + "'", float29 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertTrue("'" + localizedFormats31 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats31.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertTrue("'" + localizedFormats34 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats34.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats38 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats38.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats39 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats39.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats41 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats41.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + localizedFormats51 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_ROOT_OF_UNITY_INDEX + "'", localizedFormats51.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_ROOT_OF_UNITY_INDEX));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test662");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (short) 100, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2 == (-100.0f));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test663");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.divide(fraction3);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, (java.lang.Number) fraction2);
        java.lang.Throwable[] throwableArray6 = notPositiveException5.getSuppressed();
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException7 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray6);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) mathIllegalStateException7);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test664");
        float float1 = org.apache.commons.math3.util.FastMath.signum(0.25f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test665");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float5 = bigFraction4.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.add(bigFraction4);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger8 = bigFraction7.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction7.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction7.add((int) (byte) -1);
        double double12 = bigFraction11.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction4.multiply(bigFraction11);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction4.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction14.subtract(0L);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.25f + "'", float5 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-75.0d) + "'", double12 == (-75.0d));
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction16);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test666");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long3 = bigFraction2.longValue();
        java.math.BigDecimal bigDecimal5 = bigFraction2.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.abs();
        long long7 = bigFraction2.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float11 = bigFraction10.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction9.add(bigFraction10);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction10.add(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger17 = bigFraction16.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction16.negate();
        java.math.BigInteger bigInteger19 = bigFraction18.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction15.multiply(bigInteger19);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction10.divide(bigInteger19);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException23 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigFraction2, (java.lang.Number) bigFraction10, false);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext24 = numberIsTooSmallException23.getContext();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.25f + "'", float11 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(exceptionContext24);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test667");
        long long1 = org.apache.commons.math3.util.FastMath.abs(1072693248L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1072693248L + "'", long1 == 1072693248L);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test668");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (short) 71);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 71L + "'", long1 == 71L);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test669");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigInteger bigInteger3 = bigFraction1.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long6 = bigFraction5.longValue();
        java.math.BigInteger bigInteger7 = bigFraction5.getDenominator();
        java.math.BigInteger bigInteger8 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, bigInteger7);
        java.math.BigInteger bigInteger10 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, 35);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException11 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) bigInteger10);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction(bigInteger10);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long15 = bigFraction14.longValue();
        java.math.BigDecimal bigDecimal17 = bigFraction14.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction14.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction12.multiply(bigFraction18);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float23 = bigFraction22.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction21.add(bigFraction22);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction21.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long28 = bigFraction27.longValue();
        java.math.BigInteger bigInteger29 = bigFraction27.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long32 = bigFraction31.longValue();
        java.math.BigInteger bigInteger33 = bigFraction31.getDenominator();
        java.math.BigInteger bigInteger34 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger29, bigInteger33);
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction21.add(bigInteger33);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction18.multiply(bigInteger33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.25f + "'", float23 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigFraction36);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test670");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_MUST_HAVE_AT_LEAST_ONE_ELEMENT;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.divide(fraction2);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction2.getField();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException6 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction2);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException10 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) 2, (java.lang.Number) 1.2246467991473532E-16d, false);
        boolean boolean11 = numberIsTooSmallException10.getBoundIsAllowed();
        boolean boolean12 = numberIsTooSmallException10.getBoundIsAllowed();
        notPositiveException6.addSuppressed((java.lang.Throwable) numberIsTooSmallException10);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats16 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray17 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException18 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats16, objArray17);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats19 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats20 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats21 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException24 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats25 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats28 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray29 = new java.lang.Object[] { (-1.0f), localizedFormats28 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException30 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats26, objArray29);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException31 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException24, (org.apache.commons.math3.exception.util.Localizable) localizedFormats25, objArray29);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException32 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats21, objArray29);
        java.lang.Throwable[] throwableArray33 = mathArithmeticException32.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException34 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats20, (java.lang.Object[]) throwableArray33);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException35 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException18, (org.apache.commons.math3.exception.util.Localizable) localizedFormats19, (java.lang.Object[]) throwableArray33);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException36 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats15, (java.lang.Object[]) throwableArray33);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats37 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats38 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray39 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException40 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats38, objArray39);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats41 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats42 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats43 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException46 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats47 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats48 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats50 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray51 = new java.lang.Object[] { (-1.0f), localizedFormats50 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException52 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats48, objArray51);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException53 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException46, (org.apache.commons.math3.exception.util.Localizable) localizedFormats47, objArray51);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException54 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats43, objArray51);
        java.lang.Throwable[] throwableArray55 = mathArithmeticException54.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException56 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats42, (java.lang.Object[]) throwableArray55);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException57 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException40, (org.apache.commons.math3.exception.util.Localizable) localizedFormats41, (java.lang.Object[]) throwableArray55);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException58 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats37, (java.lang.Object[]) throwableArray55);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException59 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats15, (java.lang.Object[]) throwableArray55);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException60 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) numberIsTooSmallException10, (org.apache.commons.math3.exception.util.Localizable) localizedFormats14, (java.lang.Object[]) throwableArray55);
        org.apache.commons.math3.exception.ConvergenceException convergenceException61 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray55);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_MUST_HAVE_AT_LEAST_ONE_ELEMENT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_MUST_HAVE_AT_LEAST_ONE_ELEMENT));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats16 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats16.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats19 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats19.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats20 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats20.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats21 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats21.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats25 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats25.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats28 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats28.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertTrue("'" + localizedFormats37 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats37.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats38 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats38.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats41 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats41.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats42 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats42.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats43 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats43.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats47 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats47.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats48 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats48.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats50 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats50.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray55);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test671");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 9800L, (double) 341642467L, (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(fraction4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test672");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger5 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction4.add((int) (byte) -1);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException10 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigFraction1, (java.lang.Number) bigFraction4, false);
        java.math.BigInteger bigInteger11 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction4.multiply(268435456);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigFraction13);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test673");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add((int) (byte) -1);
        java.math.BigInteger bigInteger5 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction0.divide(100);
        long long8 = bigFraction7.longValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test674");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test675");
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
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction24.divide(fraction27);
        double double29 = fraction28.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction28.subtract(70);
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 14400.0d + "'", double29 == 14400.0d);
        org.junit.Assert.assertNotNull(fraction31);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test676");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((-30), 70);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test677");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test678");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) (-1));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test679");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1.9233097485725157d, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger9 = bigFraction8.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction8.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction8.add((int) (byte) -1);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException14 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, (java.lang.Number) bigFraction5, (java.lang.Number) bigFraction8, false);
        long long15 = bigFraction8.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction8.multiply((long) (byte) 100);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException19 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) fraction3, (java.lang.Number) bigFraction8, false);
        int int20 = bigFraction2.compareTo(bigFraction8);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long23 = bigFraction22.longValue();
        java.math.BigInteger bigInteger24 = bigFraction22.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long27 = bigFraction26.longValue();
        java.math.BigInteger bigInteger28 = bigFraction26.getDenominator();
        java.math.BigInteger bigInteger29 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger24, bigInteger28);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction8.subtract(bigInteger24);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4L + "'", long15 == 4L);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigFraction30);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test680");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((-238262335));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test681");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POPULATION_SIZE;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.REAL_FORMAT;
        java.lang.Number number2 = null;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException5 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0f), localizedFormats9 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException11 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats7, objArray10);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException12 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException5, (org.apache.commons.math3.exception.util.Localizable) localizedFormats6, objArray10);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException13 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, number2, objArray10);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException14 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray10);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POPULATION_SIZE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POPULATION_SIZE));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.REAL_FORMAT + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.REAL_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test682");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction1.getField();
        int int6 = fraction1.intValue();
        java.lang.String str7 = fraction1.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test683");
        java.lang.Number number0 = null;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math3.exception.NotPositiveException(number0);
        java.lang.Number number2 = notPositiveException1.getMin();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = notPositiveException1.getContext();
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 0 + "'", number2, 0);
        org.junit.Assert.assertNotNull(exceptionContext3);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test684");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.multiply(0);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction5.multiply(fraction11);
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
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test685");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.1221078653007956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.019487254508783226d) + "'", double1 == (-0.019487254508783226d));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test686");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigInteger bigInteger3 = bigFraction1.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long6 = bigFraction5.longValue();
        java.math.BigInteger bigInteger7 = bigFraction5.getDenominator();
        java.math.BigInteger bigInteger8 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, bigInteger7);
        java.math.BigInteger bigInteger10 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, 35);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException11 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) bigInteger10);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction(bigInteger10);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction12.subtract((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigFraction14);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test687");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.384185791015625E-7d, 70.00714249274856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.384185791015625E-7d + "'", double2 == 2.384185791015625E-7d);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test688");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        java.math.BigDecimal bigDecimal3 = bigFraction2.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.pow((-1));
        float float6 = bigFraction2.floatValue();
        float float7 = bigFraction2.floatValue();
        java.math.BigInteger bigInteger8 = bigFraction2.getNumerator();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.25f + "'", float7 == 0.25f);
        org.junit.Assert.assertNotNull(bigInteger8);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test689");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, (double) (byte) 30);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test690");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray3 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException4 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats2, objArray3);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException10 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0f), localizedFormats14 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException16 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats12, objArray15);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException17 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException10, (org.apache.commons.math3.exception.util.Localizable) localizedFormats11, objArray15);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException18 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats7, objArray15);
        java.lang.Throwable[] throwableArray19 = mathArithmeticException18.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException20 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, (java.lang.Object[]) throwableArray19);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException21 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException4, (org.apache.commons.math3.exception.util.Localizable) localizedFormats5, (java.lang.Object[]) throwableArray19);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException22 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, (java.lang.Object[]) throwableArray19);
        org.apache.commons.math3.exception.ZeroException zeroException23 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray19);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats24 = org.apache.commons.math3.exception.util.LocalizedFormats.FRACTION_CONVERSION_OVERFLOW;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats25 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT;
        java.lang.String str26 = localizedFormats25.getSourceString();
        org.apache.commons.math3.fraction.Fraction fraction28 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField30 = fraction29.getField();
        org.apache.commons.math3.fraction.Fraction fraction31 = fractionField30.getZero();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.subtract(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField36 = fraction35.getField();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.divide(fraction35);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField38 = fraction35.getField();
        org.apache.commons.math3.fraction.FractionField fractionField39 = fraction35.getField();
        int int40 = fraction35.intValue();
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction32.divide(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField44 = fraction43.getField();
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction42.divide(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction45.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction48 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField49 = fraction48.getField();
        org.apache.commons.math3.fraction.Fraction fraction50 = fractionField49.getZero();
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction50.subtract(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction47.divide(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction35.divide(fraction53);
        org.apache.commons.math3.fraction.Fraction fraction55 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction55.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction57 = fraction53.divide(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction28.multiply(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction60 = new org.apache.commons.math3.fraction.Fraction(45);
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction58.multiply(fraction60);
        org.apache.commons.math3.fraction.Fraction fraction62 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction63 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction64 = fraction62.divide(fraction63);
        int int65 = fraction64.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction66 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField67 = fraction66.getField();
        org.apache.commons.math3.fraction.Fraction fraction68 = fractionField67.getZero();
        org.apache.commons.math3.fraction.Fraction fraction69 = fraction64.add(fraction68);
        int int70 = fraction64.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction71 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction73 = bigFraction71.multiply(35);
        java.lang.Object[] objArray74 = new java.lang.Object[] { localizedFormats25, fraction61, int70, bigFraction71 };
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) localizedFormats0, (org.apache.commons.math3.exception.util.Localizable) localizedFormats24, objArray74);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + localizedFormats24 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.FRACTION_CONVERSION_OVERFLOW + "'", localizedFormats24.equals(org.apache.commons.math3.exception.util.LocalizedFormats.FRACTION_CONVERSION_OVERFLOW));
        org.junit.Assert.assertTrue("'" + localizedFormats25 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT + "'", localizedFormats25.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "brightness exponent should be positive or null, but got {0}" + "'", str26, "brightness exponent should be positive or null, but got {0}");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fractionField30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fractionField36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fractionField38);
        org.junit.Assert.assertNotNull(fractionField39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fractionField44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fractionField49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fractionField67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(bigFraction71);
        org.junit.Assert.assertNotNull(bigFraction73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[NEGATIVE_BRIGHTNESS_EXPONENT, 0, 1, 2 / 5]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[NEGATIVE_BRIGHTNESS_EXPONENT, 0, 1, 2 / 5]");
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test691");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.stirlingS2(0, 340593891);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: 340,593,891 is larger than the maximum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test692");
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
        org.apache.commons.math3.fraction.FractionField fractionField18 = fraction17.getField();
        long long19 = fraction17.longValue();
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
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2L + "'", long19 == 2L);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test693");
        org.apache.commons.math3.util.MathUtils.checkFinite((double) 341642467);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test694");
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
        int int12 = fraction7.compareTo(fraction11);
        int int13 = fraction11.intValue();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test695");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide(fraction2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.negate();
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
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test696");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(0.04148215213377604d, (int) (byte) 1);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test697");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.divide(fraction5);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException7 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction6);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float11 = bigFraction10.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction9.add(bigFraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField14 = fraction13.getField();
        org.apache.commons.math3.fraction.Fraction fraction15 = fractionField14.getZero();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.subtract(fraction16);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException19 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction9, (java.lang.Number) fraction16, true);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction6.divide(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction3.subtract(fraction20);
        double double22 = fraction3.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.25f + "'", float11 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test698");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        int int4 = bigFraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.divide(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction5.multiply(fraction10);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField12 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction13 = fractionField12.getOne();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.multiply(4);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats16 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray19 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException20 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats18, objArray19);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats21 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats22 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats23 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException26 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats27 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats28 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats30 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray31 = new java.lang.Object[] { (-1.0f), localizedFormats30 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException32 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats28, objArray31);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException33 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException26, (org.apache.commons.math3.exception.util.Localizable) localizedFormats27, objArray31);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException34 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats23, objArray31);
        java.lang.Throwable[] throwableArray35 = mathArithmeticException34.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException36 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats22, (java.lang.Object[]) throwableArray35);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException37 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException20, (org.apache.commons.math3.exception.util.Localizable) localizedFormats21, (java.lang.Object[]) throwableArray35);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException38 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats17, (java.lang.Object[]) throwableArray35);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats39 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats40 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray41 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException42 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats40, objArray41);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats43 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats44 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats45 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException48 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats49 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats50 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats52 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray53 = new java.lang.Object[] { (-1.0f), localizedFormats52 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException54 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats50, objArray53);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException55 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException48, (org.apache.commons.math3.exception.util.Localizable) localizedFormats49, objArray53);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException56 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats45, objArray53);
        java.lang.Throwable[] throwableArray57 = mathArithmeticException56.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException58 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats44, (java.lang.Object[]) throwableArray57);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException59 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException42, (org.apache.commons.math3.exception.util.Localizable) localizedFormats43, (java.lang.Object[]) throwableArray57);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException60 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats39, (java.lang.Object[]) throwableArray57);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException61 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats17, (java.lang.Object[]) throwableArray57);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) fraction15, (org.apache.commons.math3.exception.util.Localizable) localizedFormats16, (java.lang.Object[]) throwableArray57);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException63 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) int4, (java.lang.Object[]) throwableArray57);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + localizedFormats16 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT + "'", localizedFormats16.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_EXPONENT));
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats21 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats21.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats22 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats22.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats23 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats23.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats27 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats27.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats28 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats28.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats30 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats30.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertTrue("'" + localizedFormats39 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats39.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats40 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats40.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats43 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats43.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats44 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats44.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats45 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats45.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats49 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats49.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats50 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats50.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats52 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats52.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray57);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test699");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_DECREASING_SEQUENCE;
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        java.lang.Object[] objArray2 = null;
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) localizedFormats0, localizable1, objArray2);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger5 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction4.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float9 = bigFraction8.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction4.add(bigFraction8);
        org.apache.commons.math3.exception.util.Localizable localizable11 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException16 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats20 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (-1.0f), localizedFormats20 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException22 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats18, objArray21);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException23 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException16, (org.apache.commons.math3.exception.util.Localizable) localizedFormats17, objArray21);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException24 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, objArray21);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException25 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats12, objArray21);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED;
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float30 = bigFraction29.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction28.add(bigFraction29);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction31.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger34 = bigFraction33.getNumerator();
        int int35 = bigFraction32.compareTo(bigFraction33);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField36 = bigFraction32.getField();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats37 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats38 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats39 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger41 = bigFraction40.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction40.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction40.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction44.reciprocal();
        java.lang.Object[] objArray46 = new java.lang.Object[] { localizedFormats38, localizedFormats39, bigFraction45 };
        org.apache.commons.math3.exception.ZeroException zeroException47 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats37, objArray46);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException48 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats26, (java.lang.Number) bigFraction32, objArray46);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException49 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats12, objArray46);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction10, localizable11, objArray46);
        org.apache.commons.math3.exception.ZeroException zeroException51 = new org.apache.commons.math3.exception.ZeroException(localizable1, objArray46);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_DECREASING_SEQUENCE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_DECREASING_SEQUENCE));
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats20 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats20.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED));
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.25f + "'", float30 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField36);
        org.junit.Assert.assertTrue("'" + localizedFormats37 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats37.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats38 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats38.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats39 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats39.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test700");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.WHOLE_FORMAT;
        java.lang.Class<?> wildcardClass1 = localizedFormats0.getClass();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.WHOLE_FORMAT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.WHOLE_FORMAT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test701");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_INCREASING_SEQUENCE;
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
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException59 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray53);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_INCREASING_SEQUENCE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_INCREASING_SEQUENCE));
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
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test702");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 0.9999999958776927d);
        java.lang.Number number4 = notPositiveException3.getMin();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zero norm for rotation defining vector" + "'", str1, "zero norm for rotation defining vector");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0 + "'", number4, 0);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test703");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigInteger bigInteger3 = bigFraction1.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long6 = bigFraction5.longValue();
        java.math.BigInteger bigInteger7 = bigFraction5.getDenominator();
        java.math.BigInteger bigInteger8 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, bigInteger7);
        java.math.BigInteger bigInteger10 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, 28L);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX;
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long14 = bigFraction13.longValue();
        java.math.BigInteger bigInteger15 = bigFraction13.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long18 = bigFraction17.longValue();
        java.math.BigInteger bigInteger19 = bigFraction17.getDenominator();
        java.math.BigInteger bigInteger20 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger15, bigInteger19);
        java.math.BigInteger bigInteger22 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger19, 35);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.divide(fraction24);
        int int26 = fraction25.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField28 = fraction27.getField();
        org.apache.commons.math3.fraction.Fraction fraction29 = fractionField28.getZero();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction25.add(fraction29);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException32 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats11, (java.lang.Number) bigInteger19, (java.lang.Number) fraction29, false);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = new org.apache.commons.math3.fraction.BigFraction(bigInteger7, bigInteger19);
        java.math.BigInteger bigInteger35 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger19, (int) (short) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger37 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger35, (-99));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: exponent (-99)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fractionField28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(bigInteger35);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test704");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(1.079525376E9d);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test705");
        double double1 = org.apache.commons.math3.util.FastMath.floor(67.88974313718154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 67.0d + "'", double1 == 67.0d);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test706");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.add(0);
        double double5 = bigFraction3.pow((double) 35L);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger7 = bigFraction6.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction6.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction6.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction6.multiply(10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float16 = bigFraction15.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction14.add(bigFraction15);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction14.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long21 = bigFraction20.longValue();
        java.math.BigInteger bigInteger22 = bigFraction20.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long25 = bigFraction24.longValue();
        java.math.BigInteger bigInteger26 = bigFraction24.getDenominator();
        java.math.BigInteger bigInteger27 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger22, bigInteger26);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction14.add(bigInteger26);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction12.pow(bigInteger26);
        java.math.BigInteger bigInteger31 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger26, (int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction3.subtract(bigInteger26);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal35 = bigFraction3.bigDecimalValue((-1072693248), 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.1805916207174113E-14d + "'", double5 == 1.1805916207174113E-14d);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.25f + "'", float16 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigFraction32);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test707");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long19 = bigFraction18.longValue();
        java.math.BigInteger bigInteger20 = bigFraction18.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction5.divide(bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction22.multiply(35);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction22.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float29 = bigFraction28.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction27.add(bigFraction28);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction28.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long35 = bigFraction34.longValue();
        java.math.BigInteger bigInteger36 = bigFraction34.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long39 = bigFraction38.longValue();
        java.math.BigInteger bigInteger40 = bigFraction38.getDenominator();
        java.math.BigInteger bigInteger41 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger36, bigInteger40);
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction32.multiply(bigInteger36);
        java.math.BigInteger bigInteger44 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger36, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction25.divide(bigInteger44);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = new org.apache.commons.math3.fraction.BigFraction(bigInteger20, bigInteger44);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.25f + "'", float29 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigFraction45);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test708");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.pow((-1));
        double double6 = bigFraction3.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long9 = bigFraction8.longValue();
        java.math.BigDecimal bigDecimal11 = bigFraction8.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction8.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction3.add(bigFraction12);
        int int14 = bigFraction12.getDenominatorAsInt();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3175.0d) + "'", double6 == (-3175.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test709");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger24 = bigFraction23.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction(10L, 10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction23.multiply(bigFraction27);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction22.subtract(bigFraction28);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction28.add(0);
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
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction31);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test710");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction6.divide((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = bigFraction6.bigDecimalValue(360339393);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test711");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO;
        double double1 = bigFraction0.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float5 = bigFraction4.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add(bigFraction4);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction4.add(0);
        long long9 = bigFraction8.getNumeratorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction0.multiply(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 200.0d + "'", double1 == 200.0d);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.25f + "'", float5 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(bigFraction10);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test712");
        double double1 = org.apache.commons.math3.util.FastMath.log10(31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5051499783199058d + "'", double1 == 1.5051499783199058d);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test713");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        int int6 = fraction2.compareTo(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.abs();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test714");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.subtract(341642467);
        long long6 = fraction5.longValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(100);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-341642466L) + "'", long6 == (-341642466L));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test715");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(27405L, (long) 45);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1233225L + "'", long2 == 1233225L);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test716");
        int int2 = org.apache.commons.math3.util.FastMath.min(100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test717");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction(10L, 10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.multiply(bigFraction4);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.multiply((int) (short) -2662);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction7.divide((long) 1395);
        java.math.BigInteger bigInteger10 = bigFraction7.getDenominator();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigInteger10);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test718");
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
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction33.subtract(340593891);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long44 = bigFraction43.longValue();
        java.math.BigDecimal bigDecimal46 = bigFraction43.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction43.abs();
        long long48 = bigFraction43.longValue();
        boolean boolean49 = fraction41.equals((java.lang.Object) long48);
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
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 100L + "'", long48 == 100L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test719");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(4.9E-324d, 340593891);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test720");
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
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats60 = org.apache.commons.math3.exception.util.LocalizedFormats.PROPAGATION_DIRECTION_MISMATCH;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats61 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats62 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats63 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction64 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger65 = bigFraction64.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = bigFraction64.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = bigFraction64.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = bigFraction68.reciprocal();
        java.lang.Object[] objArray70 = new java.lang.Object[] { localizedFormats62, localizedFormats63, bigFraction69 };
        org.apache.commons.math3.exception.ZeroException zeroException71 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats61, objArray70);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException72 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathArithmeticException59, (org.apache.commons.math3.exception.util.Localizable) localizedFormats60, objArray70);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext73 = mathArithmeticException59.getContext();
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
        org.junit.Assert.assertTrue("'" + localizedFormats60 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PROPAGATION_DIRECTION_MISMATCH + "'", localizedFormats60.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PROPAGATION_DIRECTION_MISMATCH));
        org.junit.Assert.assertTrue("'" + localizedFormats61 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats61.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats62 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats62.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats63 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats63.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction64);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertNotNull(bigFraction68);
        org.junit.Assert.assertNotNull(bigFraction69);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertNotNull(exceptionContext73);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test721");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test722");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float6 = bigFraction5.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction1.add(bigFraction5);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger10 = bigFraction9.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException14 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats16 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (-1.0f), localizedFormats18 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException20 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats16, objArray19);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException21 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException14, (org.apache.commons.math3.exception.util.Localizable) localizedFormats15, objArray19);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException22 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats11, objArray19);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException23 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction9, objArray19);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction1, (org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray19);
        org.apache.commons.math3.exception.ConvergenceException convergenceException25 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray19);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats27 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException30 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats31 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats32 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats34 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1.0f), localizedFormats34 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException36 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats32, objArray35);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException37 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException30, (org.apache.commons.math3.exception.util.Localizable) localizedFormats31, objArray35);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException38 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats27, objArray35);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException39 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats26, objArray35);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats40 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED;
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float44 = bigFraction43.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction42.add(bigFraction43);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction45.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger48 = bigFraction47.getNumerator();
        int int49 = bigFraction46.compareTo(bigFraction47);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField50 = bigFraction46.getField();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats51 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats52 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats53 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction54 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger55 = bigFraction54.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction54.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = bigFraction54.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction59 = bigFraction58.reciprocal();
        java.lang.Object[] objArray60 = new java.lang.Object[] { localizedFormats52, localizedFormats53, bigFraction59 };
        org.apache.commons.math3.exception.ZeroException zeroException61 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats51, objArray60);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException62 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats40, (java.lang.Number) bigFraction46, objArray60);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException63 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats26, objArray60);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException64 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray60);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats16 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats16.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats27 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats27.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats31 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats31.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats32 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats32.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats34 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats34.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats40 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED + "'", localizedFormats40.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED));
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.25f + "'", float44 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField50);
        org.junit.Assert.assertTrue("'" + localizedFormats51 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats51.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats52 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats52.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats53 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats53.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigFraction59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test723");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5585053606381855d + "'", double1 == 0.5585053606381855d);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test724");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction13.subtract((long) (-1));
        long long16 = bigFraction13.longValue();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25L + "'", long16 == 25L);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test725");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        java.math.BigDecimal bigDecimal3 = bigFraction2.bigDecimalValue();
        long long4 = bigFraction2.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.subtract(1L);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(bigFraction6);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test726");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 4, 88529281L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88529281L + "'", long2 == 88529281L);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test727");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction(10L, 10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.multiply(bigFraction4);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.multiply((int) (short) -2662);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction7.divide((long) 1395);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction7.subtract(31L);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test728");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 31, (float) 70);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test729");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fractionField7.getOne();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT;
        java.lang.String str10 = localizedFormats9.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide(fraction15);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException17 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, (java.lang.Number) fraction14);
        java.lang.Throwable[] throwableArray18 = notPositiveException17.getSuppressed();
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException19 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats12, (java.lang.Object[]) throwableArray18);
        java.lang.Object[] objArray20 = new java.lang.Object[] { localizedFormats11, localizedFormats12 };
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) fraction8, (org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray20);
        double double22 = fraction8.percentageValue();
        float float23 = fraction8.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Loess expects at least 1 point" + "'", str10, "Loess expects at least 1 point");
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR, UNABLE_TO_ORTHOGONOLIZE_MATRIX]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR, UNABLE_TO_ORTHOGONOLIZE_MATRIX]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test730");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test731");
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
        org.apache.commons.math3.fraction.FractionField fractionField18 = fraction17.getField();
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField19 = fraction17.getField();
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
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertNotNull(fractionField19);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test732");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.Object[] objArray3 = null;
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException4 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats2, objArray3);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException10 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0f), localizedFormats14 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException16 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats12, objArray15);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException17 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException10, (org.apache.commons.math3.exception.util.Localizable) localizedFormats11, objArray15);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException18 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats7, objArray15);
        java.lang.Throwable[] throwableArray19 = mathArithmeticException18.getSuppressed();
        org.apache.commons.math3.exception.ZeroException zeroException20 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, (java.lang.Object[]) throwableArray19);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException21 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException4, (org.apache.commons.math3.exception.util.Localizable) localizedFormats5, (java.lang.Object[]) throwableArray19);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException22 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, (java.lang.Object[]) throwableArray19);
        org.apache.commons.math3.exception.ZeroException zeroException23 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray19);
        org.apache.commons.math3.exception.util.Localizable localizable25 = null;
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger27 = bigFraction26.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction26.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction26.add((int) (byte) -1);
        java.math.BigInteger bigInteger31 = bigFraction26.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction26.divide(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction33.subtract((-1072693248));
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats36 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats37 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction38 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction38.divide(fraction39);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException41 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats37, (java.lang.Number) fraction38);
        java.lang.Throwable[] throwableArray42 = notPositiveException41.getSuppressed();
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException43 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats36, (java.lang.Object[]) throwableArray42);
        java.lang.Throwable[] throwableArray44 = mathIllegalStateException43.getSuppressed();
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException45 = new org.apache.commons.math3.exception.NotFiniteNumberException(localizable25, (java.lang.Number) (-1072693248), (java.lang.Object[]) throwableArray44);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException46 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 4.0d, (java.lang.Object[]) throwableArray44);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.POWER_NEGATIVE_PARAMETERS));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertTrue("'" + localizedFormats36 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats36.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats37 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats37.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test733");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) 28, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test734");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger19 = bigFraction18.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction18.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction18.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float26 = bigFraction25.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction24.add(bigFraction25);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction25.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long32 = bigFraction31.longValue();
        java.math.BigInteger bigInteger33 = bigFraction31.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long36 = bigFraction35.longValue();
        java.math.BigInteger bigInteger37 = bigFraction35.getDenominator();
        java.math.BigInteger bigInteger38 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger33, bigInteger37);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction29.multiply(bigInteger33);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger41 = bigFraction40.getNumerator();
        java.math.BigInteger bigInteger42 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger33, bigInteger41);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction22.divide(bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction17.pow(bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long47 = bigFraction46.longValue();
        java.math.BigInteger bigInteger48 = bigFraction46.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long51 = bigFraction50.longValue();
        java.math.BigInteger bigInteger52 = bigFraction50.getDenominator();
        java.math.BigInteger bigInteger53 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger48, bigInteger52);
        java.math.BigInteger bigInteger55 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger52, 35);
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction44.add(bigInteger52);
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
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.25f + "'", float26 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 100L + "'", long47 == 100L);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigFraction56);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test735");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float21 = bigFraction20.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction19.add(bigFraction20);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction22.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float27 = bigFraction26.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction25.add(bigFraction26);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction28.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction23.add(bigFraction28);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger32 = bigFraction31.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction31.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction23.divide(bigFraction31);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long37 = bigFraction36.longValue();
        java.math.BigInteger bigInteger38 = bigFraction36.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction23.divide(bigInteger38);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger41 = bigFraction40.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction40.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction40.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction40.multiply(10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float50 = bigFraction49.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction51 = bigFraction48.add(bigFraction49);
        org.apache.commons.math3.fraction.BigFraction bigFraction52 = bigFraction48.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction54 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long55 = bigFraction54.longValue();
        java.math.BigInteger bigInteger56 = bigFraction54.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long59 = bigFraction58.longValue();
        java.math.BigInteger bigInteger60 = bigFraction58.getDenominator();
        java.math.BigInteger bigInteger61 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger56, bigInteger60);
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = bigFraction48.add(bigInteger60);
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = bigFraction46.pow(bigInteger60);
        org.apache.commons.math3.fraction.BigFraction bigFraction64 = new org.apache.commons.math3.fraction.BigFraction(bigInteger38, bigInteger60);
        boolean boolean65 = fraction16.equals((java.lang.Object) bigInteger60);
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
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.25f + "'", float21 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.25f + "'", float27 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.25f + "'", float50 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction51);
        org.junit.Assert.assertNotNull(bigFraction52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 100L + "'", long55 == 100L);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 100L + "'", long59 == 100L);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertNotNull(bigFraction63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test736");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        java.math.BigInteger bigInteger5 = bigFraction1.getDenominator();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test737");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(1395, 961);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test738");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.divide(fraction3);
        double double5 = fraction3.doubleValue();
        double double6 = fraction3.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.negate();
        double double8 = fraction7.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction1.multiply(fraction7);
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction7.getField();
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction7.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.5d) + "'", double8 == (-0.5d));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertNotNull(fractionField13);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test739");
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
        java.math.BigInteger bigInteger17 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger20 = bigFraction19.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction19.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction19.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction18.subtract(bigFraction23);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float28 = bigFraction27.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction26.add(bigFraction27);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction29.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger32 = bigFraction31.getNumerator();
        int int33 = bigFraction30.compareTo(bigFraction31);
        int int34 = bigFraction31.getNumeratorAsInt();
        int int35 = bigFraction18.compareTo(bigFraction31);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField36 = bigFraction31.getField();
        int int37 = bigFraction31.getDenominatorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction5.add(bigFraction31);
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
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.25f + "'", float28 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(bigFraction38);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test740");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(1.0471975511965979d, 0.5d, 28);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction3.getField();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test741");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField3 = fraction0.getField();
        java.lang.String str4 = fraction0.toString();
        double double5 = fraction0.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 2" + "'", str4, "1 / 2");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test742");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float4 = bigFraction3.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.add(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger8 = bigFraction7.getNumerator();
        int int9 = bigFraction6.compareTo(bigFraction7);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField10 = bigFraction6.getField();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger15 = bigFraction14.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction14.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction14.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction18.reciprocal();
        java.lang.Object[] objArray20 = new java.lang.Object[] { localizedFormats12, localizedFormats13, bigFraction19 };
        org.apache.commons.math3.exception.ZeroException zeroException21 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats11, objArray20);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException22 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigFraction6, objArray20);
        int int23 = bigFraction6.intValue();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED));
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.25f + "'", float4 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField10);
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test743");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), localizedFormats7 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException9 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray8);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException10 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException3, (org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray8);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException11 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray8);
        java.lang.Throwable[] throwableArray12 = mathArithmeticException11.getSuppressed();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext13 = mathArithmeticException11.getContext();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext14 = mathArithmeticException11.getContext();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(exceptionContext13);
        org.junit.Assert.assertNotNull(exceptionContext14);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test744");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((int) (short) -1, (-929312903));
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test745");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        double double3 = fraction1.doubleValue();
        double double4 = fraction1.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.negate();
        int int6 = fraction5.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test746");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(1, 1078591488);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(1395);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test747");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.078591488E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test748");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.add(0);
        double double5 = bigFraction3.pow((double) 35L);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction3.subtract(28);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float11 = bigFraction10.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction9.add(bigFraction10);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction10.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long17 = bigFraction16.longValue();
        java.math.BigInteger bigInteger18 = bigFraction16.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long21 = bigFraction20.longValue();
        java.math.BigInteger bigInteger22 = bigFraction20.getDenominator();
        java.math.BigInteger bigInteger23 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger18, bigInteger22);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction14.multiply(bigInteger18);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction24.reduce();
        int int26 = bigFraction7.compareTo(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.1805916207174113E-14d + "'", double5 == 1.1805916207174113E-14d);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.25f + "'", float11 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test749");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) Float.POSITIVE_INFINITY, (double) (-1L), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert ? to fraction (9,223,372,036,854,775,807/1)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test750");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide(fraction2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.divide(fraction9);
        double double11 = fraction9.doubleValue();
        double double12 = fraction9.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction9.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField15 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fractionField15.getZero();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.subtract(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField21 = fraction20.getField();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.divide(fraction20);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField23 = fraction20.getField();
        org.apache.commons.math3.fraction.FractionField fractionField24 = fraction20.getField();
        int int25 = fraction20.intValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction17.divide(fraction20);
        int int27 = fraction17.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.divide(fraction29);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException31 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction30);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction17.add(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction9.divide(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction7.subtract(fraction9);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fractionField23);
        org.junit.Assert.assertNotNull(fractionField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test751");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(11, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 475956593 + "'", int2 == 475956593);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test752");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long9 = bigFraction8.longValue();
        java.math.BigInteger bigInteger10 = bigFraction8.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long13 = bigFraction12.longValue();
        java.math.BigInteger bigInteger14 = bigFraction12.getDenominator();
        java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction6.multiply(bigInteger10);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction16.multiply((int) (short) -1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction18);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test753");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_INVERTIBLE_TRANSFORM;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction1.multiply(10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float11 = bigFraction10.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction9.add(bigFraction10);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction9.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long16 = bigFraction15.longValue();
        java.math.BigInteger bigInteger17 = bigFraction15.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long20 = bigFraction19.longValue();
        java.math.BigInteger bigInteger21 = bigFraction19.getDenominator();
        java.math.BigInteger bigInteger22 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger17, bigInteger21);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction9.add(bigInteger21);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction7.pow(bigInteger21);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger26 = bigFraction25.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction25.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float30 = bigFraction29.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction25.add(bigFraction29);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats32 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger34 = bigFraction33.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats35 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException38 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats39 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats40 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats42 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray43 = new java.lang.Object[] { (-1.0f), localizedFormats42 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException44 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats40, objArray43);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException45 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException38, (org.apache.commons.math3.exception.util.Localizable) localizedFormats39, objArray43);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException46 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats35, objArray43);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException47 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction33, objArray43);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction25, (org.apache.commons.math3.exception.util.Localizable) localizedFormats32, objArray43);
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger50 = bigFraction49.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction52 = bigFraction49.subtract((int) ' ');
        int int53 = bigFraction52.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float57 = bigFraction56.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = bigFraction55.add(bigFraction56);
        org.apache.commons.math3.fraction.Fraction fraction59 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField60 = fraction59.getField();
        org.apache.commons.math3.fraction.Fraction fraction61 = fractionField60.getZero();
        org.apache.commons.math3.fraction.Fraction fraction62 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction63 = fraction61.subtract(fraction62);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException65 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction55, (java.lang.Number) fraction62, true);
        org.apache.commons.math3.fraction.BigFraction bigFraction67 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long68 = bigFraction67.longValue();
        java.math.BigInteger bigInteger69 = bigFraction67.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction71 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long72 = bigFraction71.longValue();
        java.math.BigInteger bigInteger73 = bigFraction71.getDenominator();
        java.math.BigInteger bigInteger74 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger69, bigInteger73);
        org.apache.commons.math3.fraction.BigFraction bigFraction75 = bigFraction55.multiply(bigInteger74);
        double double76 = bigFraction75.doubleValue();
        int int77 = bigFraction52.compareTo(bigFraction75);
        java.math.BigInteger bigInteger78 = bigFraction52.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction79 = bigFraction25.divide(bigInteger78);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException81 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigInteger21, (java.lang.Number) bigFraction25, false);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_INVERTIBLE_TRANSFORM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_INVERTIBLE_TRANSFORM));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.25f + "'", float11 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.25f + "'", float30 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertTrue("'" + localizedFormats32 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats32.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertTrue("'" + localizedFormats35 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats35.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats39 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats39.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats40 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats40.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats42 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats42.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigFraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-31) + "'", int53 == (-31));
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 0.25f + "'", float57 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fractionField60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 100L + "'", long68 == 100L);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 100L + "'", long72 == 100L);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertNotNull(bigFraction75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertNotNull(bigFraction79);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test754");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fractionField7.getOne();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT;
        java.lang.String str10 = localizedFormats9.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide(fraction15);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException17 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, (java.lang.Number) fraction14);
        java.lang.Throwable[] throwableArray18 = notPositiveException17.getSuppressed();
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException19 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats12, (java.lang.Object[]) throwableArray18);
        java.lang.Object[] objArray20 = new java.lang.Object[] { localizedFormats11, localizedFormats12 };
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) fraction8, (org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray20);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats22 = org.apache.commons.math3.exception.util.LocalizedFormats.DIGEST_NOT_INITIALIZED;
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger24 = bigFraction23.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats25 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException28 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats30 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats32 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-1.0f), localizedFormats32 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException34 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats30, objArray33);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException35 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException28, (org.apache.commons.math3.exception.util.Localizable) localizedFormats29, objArray33);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException36 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats25, objArray33);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException37 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction23, objArray33);
        org.apache.commons.math3.exception.ConvergenceException convergenceException38 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats22, objArray33);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException39 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray33);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext40 = mathArithmeticException39.getContext();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Loess expects at least 1 point" + "'", str10, "Loess expects at least 1 point");
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR, UNABLE_TO_ORTHOGONOLIZE_MATRIX]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR, UNABLE_TO_ORTHOGONOLIZE_MATRIX]");
        org.junit.Assert.assertTrue("'" + localizedFormats22 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIGEST_NOT_INITIALIZED + "'", localizedFormats22.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIGEST_NOT_INITIALIZED));
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + localizedFormats25 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats25.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats30 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats30.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats32 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats32.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(exceptionContext40);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test755");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float29 = bigFraction28.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction27.add(bigFraction28);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction28.add(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger35 = bigFraction34.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction34.negate();
        java.math.BigInteger bigInteger37 = bigFraction36.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction33.multiply(bigInteger37);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction28.divide(bigInteger37);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction25.add(bigInteger37);
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
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.25f + "'", float29 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction40);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test756");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 2);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test757");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((int) (short) -2662, 1077673984);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test758");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) ' ');
        int int2 = bigFraction1.getDenominatorAsInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test759");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(11, 45);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger4 = bigFraction3.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.subtract((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.subtract((long) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction3.divide((long) '#');
        long long11 = bigFraction3.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction2.multiply(bigFraction3);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField13 = bigFraction3.getField();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFractionField13);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test760");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long5 = bigFraction4.longValue();
        java.math.BigInteger bigInteger6 = bigFraction4.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long9 = bigFraction8.longValue();
        java.math.BigInteger bigInteger10 = bigFraction8.getDenominator();
        java.math.BigInteger bigInteger11 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger6, bigInteger10);
        java.math.BigInteger bigInteger13 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, 35);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException14 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float19 = bigFraction18.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction17.add(bigFraction18);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction17.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long24 = bigFraction23.longValue();
        java.math.BigInteger bigInteger25 = bigFraction23.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long28 = bigFraction27.longValue();
        java.math.BigInteger bigInteger29 = bigFraction27.getDenominator();
        java.math.BigInteger bigInteger30 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger25, bigInteger29);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction17.add(bigInteger29);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction15.subtract(bigInteger29);
        java.math.BigInteger bigInteger33 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, bigInteger29);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction0.divide(bigInteger29);
        java.math.BigInteger bigInteger35 = bigFraction34.getNumerator();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.25f + "'", float19 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigInteger35);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test761");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.subtract(2);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField12 = fraction11.getField();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField15 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.divide(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction11.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction11.add((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction8.divide(fraction11);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test762");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.divide(28L);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test763");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(6, 1104155264);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 1,104,155,264, n = 6");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test764");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.multiply(35);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger5 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction(10L, 10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction4.multiply(bigFraction8);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction9.multiply((int) (short) -2662);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction3.subtract(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test765");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        int int3 = fraction2.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField5.getZero();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.add(fraction6);
        int int8 = fraction2.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction2.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.divide((int) (short) -1);
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
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test766");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.015625d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test767");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(10L, 10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger4 = bigFraction3.getNumerator();
        double double6 = bigFraction3.pow((double) (byte) 10);
        int int7 = bigFraction2.compareTo(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction8.pow(5392957440L);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float15 = bigFraction14.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction13.add(bigFraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction16.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float21 = bigFraction20.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction19.add(bigFraction20);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction22.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction17.add(bigFraction22);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger26 = bigFraction25.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction25.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction17.divide(bigFraction25);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction25.subtract(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction11.multiply(bigFraction25);
        int int32 = bigFraction10.compareTo(bigFraction25);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long35 = bigFraction34.longValue();
        java.math.BigInteger bigInteger36 = bigFraction34.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long39 = bigFraction38.longValue();
        java.math.BigInteger bigInteger40 = bigFraction38.getDenominator();
        java.math.BigInteger bigInteger41 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger36, bigInteger40);
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction25.divide(bigInteger41);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction43.multiply(35);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction43.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float50 = bigFraction49.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction51 = bigFraction48.add(bigFraction49);
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = bigFraction49.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long56 = bigFraction55.longValue();
        java.math.BigInteger bigInteger57 = bigFraction55.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction59 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long60 = bigFraction59.longValue();
        java.math.BigInteger bigInteger61 = bigFraction59.getDenominator();
        java.math.BigInteger bigInteger62 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger57, bigInteger61);
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = bigFraction53.multiply(bigInteger57);
        java.math.BigInteger bigInteger65 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger57, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = bigFraction46.divide(bigInteger65);
        org.apache.commons.math3.fraction.BigFraction bigFraction67 = bigFraction42.add(bigFraction66);
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = bigFraction3.add(bigFraction67);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.048576E-4d + "'", double6 == 1.048576E-4d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.25f + "'", float15 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.25f + "'", float21 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.25f + "'", float50 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction51);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 100L + "'", long56 == 100L);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 100L + "'", long60 == 100L);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigFraction63);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertNotNull(bigFraction67);
        org.junit.Assert.assertNotNull(bigFraction68);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test768");
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
        java.math.BigInteger bigInteger14 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long17 = bigFraction16.longValue();
        java.math.BigInteger bigInteger18 = bigFraction16.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long21 = bigFraction20.longValue();
        java.math.BigInteger bigInteger22 = bigFraction20.getDenominator();
        java.math.BigInteger bigInteger23 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger18, bigInteger22);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = new org.apache.commons.math3.fraction.BigFraction(bigInteger14, bigInteger18);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float29 = bigFraction28.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction27.add(bigFraction28);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction27.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long34 = bigFraction33.longValue();
        java.math.BigInteger bigInteger35 = bigFraction33.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long38 = bigFraction37.longValue();
        java.math.BigInteger bigInteger39 = bigFraction37.getDenominator();
        java.math.BigInteger bigInteger40 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger35, bigInteger39);
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction27.add(bigInteger39);
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction25.subtract(bigInteger39);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction24.add(bigInteger39);
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger45 = bigFraction44.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction44.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction24.divide(bigFraction44);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4L + "'", long11 == 4L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.25f + "'", float29 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction47);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test769");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (byte) 2, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test770");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.reciprocal();
        int int6 = bigFraction5.getNumeratorAsInt();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX;
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long10 = bigFraction9.longValue();
        java.math.BigInteger bigInteger11 = bigFraction9.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long14 = bigFraction13.longValue();
        java.math.BigInteger bigInteger15 = bigFraction13.getDenominator();
        java.math.BigInteger bigInteger16 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger11, bigInteger15);
        java.math.BigInteger bigInteger18 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger15, 35);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.divide(fraction20);
        int int22 = fraction21.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField24 = fraction23.getField();
        org.apache.commons.math3.fraction.Fraction fraction25 = fractionField24.getZero();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction21.add(fraction25);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException28 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats7, (java.lang.Number) bigInteger15, (java.lang.Number) fraction25, false);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction5.add(bigInteger15);
        float float30 = bigFraction5.floatValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fractionField24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-1.3333334f) + "'", float30 == (-1.3333334f));
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test771");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-1074790400));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0747904E9f + "'", float1 == 1.0747904E9f);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test772");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ZERO;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.subtract(bigFraction5);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction6.subtract((long) 3);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test773");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        int int2 = fraction0.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract((int) (byte) 0);
        long long7 = fraction4.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test774");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.URL_CONTAINS_NO_DATA;
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction(1.0471975511965979d, 0.5d, 28);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POPULATION_SIZE;
        java.lang.Class<?> wildcardClass6 = localizedFormats5.getClass();
        boolean boolean7 = fraction4.equals((java.lang.Object) wildcardClass6);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException12 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats16 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray17 = new java.lang.Object[] { (-1.0f), localizedFormats16 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException18 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats14, objArray17);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException19 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException12, (org.apache.commons.math3.exception.util.Localizable) localizedFormats13, objArray17);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException20 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray17);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException21 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray17);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats22 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED;
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float26 = bigFraction25.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction24.add(bigFraction25);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction27.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger30 = bigFraction29.getNumerator();
        int int31 = bigFraction28.compareTo(bigFraction29);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField32 = bigFraction28.getField();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats33 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats34 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats35 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger37 = bigFraction36.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction36.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction36.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction40.reciprocal();
        java.lang.Object[] objArray42 = new java.lang.Object[] { localizedFormats34, localizedFormats35, bigFraction41 };
        org.apache.commons.math3.exception.ZeroException zeroException43 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats33, objArray42);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException44 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats22, (java.lang.Number) bigFraction28, objArray42);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException45 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray42);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException46 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction4, objArray42);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.URL_CONTAINS_NO_DATA + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.URL_CONTAINS_NO_DATA));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POPULATION_SIZE + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POPULATION_SIZE));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats16 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats16.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats22 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED + "'", localizedFormats22.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED));
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.25f + "'", float26 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField32);
        org.junit.Assert.assertTrue("'" + localizedFormats33 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats33.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats34 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats34.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats35 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats35.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test775");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(0, 341642467);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 341,642,467, n = 0");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test776");
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
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction24.divide(fraction27);
        int int29 = fraction28.getNumerator();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 144 + "'", int29 == 144);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test777");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction26.divide((long) 28);
        int int31 = bigFraction26.intValue();
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
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test778");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.multiply(10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction0.pow((long) 32);
        long long9 = bigFraction8.getNumeratorAsLong();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test779");
        double double1 = org.apache.commons.math3.util.FastMath.asin(7.105427357600977E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357600977E-15d + "'", double1 == 7.105427357600977E-15d);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test780");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.FOUR_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getDenominator();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test781");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((int) (byte) 100, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test782");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_SELF_ADJOINT_OPERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.DENOMINATOR_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT;
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger4 = bigFraction3.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float8 = bigFraction7.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction3.add(bigFraction7);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger12 = bigFraction11.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException16 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats20 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (-1.0f), localizedFormats20 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException22 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats18, objArray21);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException23 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException16, (org.apache.commons.math3.exception.util.Localizable) localizedFormats17, objArray21);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException24 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, objArray21);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException25 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction11, objArray21);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction3, (org.apache.commons.math3.exception.util.Localizable) localizedFormats10, objArray21);
        org.apache.commons.math3.exception.ConvergenceException convergenceException27 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats2, objArray21);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException28 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray21);
        org.apache.commons.math3.exception.ZeroException zeroException29 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray21);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_SELF_ADJOINT_OPERATOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_SELF_ADJOINT_OPERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DENOMINATOR_FORMAT + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DENOMINATOR_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT));
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.25f + "'", float8 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats20 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats20.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test783");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide((int) (byte) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction0);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test784");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUNDS_QUANTILE_VALUE;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = localizedFormats0.getLocalizedString(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUNDS_QUANTILE_VALUE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUNDS_QUANTILE_VALUE));
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test785");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.0d, (double) 100.0f, (-1));
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.subtract((-929312903));
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test786");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException(120.0d, (-1072693248));
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test787");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.FOUR_FIFTHS;
        long long1 = bigFraction0.longValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test788");
        short short2 = org.apache.commons.math3.util.MathUtils.copySign((short) 71, (short) -2662);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -71 + "'", short2 == (short) -71);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test789");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) '#');
        float float2 = bigFraction1.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.subtract(268435456);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.abs();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test790");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) (-99), (long) 961);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 862L + "'", long2 == 862L);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test791");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.multiply(0);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.subtract((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.divide(fraction7);
        int int9 = fraction8.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = fractionField11.getZero();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction8.add(fraction12);
        int int14 = fraction8.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction8.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction3.subtract(fraction16);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test792");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.2177681591407135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 241.66031448342542d + "'", double1 == 241.66031448342542d);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test793");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        int int6 = fraction2.compareTo(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.divide(fraction8);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException10 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        int int13 = fraction9.compareTo(fraction12);
        int int14 = fraction2.compareTo(fraction12);
        org.apache.commons.math3.fraction.FractionField fractionField15 = fraction2.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(fractionField15);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test794");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ILL_CONDITIONED_OPERATOR;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long3 = bigFraction2.longValue();
        java.math.BigInteger bigInteger4 = bigFraction2.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long7 = bigFraction6.longValue();
        java.math.BigInteger bigInteger8 = bigFraction6.getDenominator();
        java.math.BigInteger bigInteger9 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger4, bigInteger8);
        java.math.BigInteger bigInteger11 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger8, 28L);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX;
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long15 = bigFraction14.longValue();
        java.math.BigInteger bigInteger16 = bigFraction14.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long19 = bigFraction18.longValue();
        java.math.BigInteger bigInteger20 = bigFraction18.getDenominator();
        java.math.BigInteger bigInteger21 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger16, bigInteger20);
        java.math.BigInteger bigInteger23 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger20, 35);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.divide(fraction25);
        int int27 = fraction26.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField29 = fraction28.getField();
        org.apache.commons.math3.fraction.Fraction fraction30 = fractionField29.getZero();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction26.add(fraction30);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException33 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats12, (java.lang.Number) bigInteger20, (java.lang.Number) fraction30, false);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = new org.apache.commons.math3.fraction.BigFraction(bigInteger8, bigInteger20);
        java.math.BigInteger bigInteger36 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger20, (int) (short) 2);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException39 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigInteger36, (java.lang.Number) (-5.117509926283467d), false);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext40 = numberIsTooSmallException39.getContext();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ILL_CONDITIONED_OPERATOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ILL_CONDITIONED_OPERATOR));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_RETRIEVE_AT_NEGATIVE_INDEX));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fractionField29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(exceptionContext40);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test795");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigInteger bigInteger3 = bigFraction1.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long6 = bigFraction5.longValue();
        java.math.BigInteger bigInteger7 = bigFraction5.getDenominator();
        java.math.BigInteger bigInteger8 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, bigInteger7);
        java.math.BigInteger bigInteger10 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, 28L);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction13.multiply(35);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction13.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float20 = bigFraction19.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction18.add(bigFraction19);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction19.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long26 = bigFraction25.longValue();
        java.math.BigInteger bigInteger27 = bigFraction25.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long30 = bigFraction29.longValue();
        java.math.BigInteger bigInteger31 = bigFraction29.getDenominator();
        java.math.BigInteger bigInteger32 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger27, bigInteger31);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction23.multiply(bigInteger27);
        java.math.BigInteger bigInteger35 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger27, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction16.divide(bigInteger35);
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = bigFraction12.multiply(bigInteger35);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction(bigInteger7, bigInteger35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.25f + "'", float20 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigFraction37);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test796");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger8 = bigFraction7.getNumerator();
        int int9 = bigFraction6.compareTo(bigFraction7);
        java.lang.String str10 = bigFraction7.toString();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2 / 5" + "'", str10, "2 / 5");
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test797");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.4333571589785714d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test798");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException4 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), localizedFormats8 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException10 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, objArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException11 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException4, (org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray9);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException12 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray9);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException13 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray9);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED;
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float18 = bigFraction17.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction16.add(bigFraction17);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction19.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger22 = bigFraction21.getNumerator();
        int int23 = bigFraction20.compareTo(bigFraction21);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField24 = bigFraction20.getField();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats25 = org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats27 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger29 = bigFraction28.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction28.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction28.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction32.reciprocal();
        java.lang.Object[] objArray34 = new java.lang.Object[] { localizedFormats26, localizedFormats27, bigFraction33 };
        org.apache.commons.math3.exception.ZeroException zeroException35 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats25, objArray34);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException36 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats14, (java.lang.Number) bigFraction20, objArray34);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException37 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray34);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext38 = mathArithmeticException37.getContext();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED));
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.25f + "'", float18 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(bigFractionField24);
        org.junit.Assert.assertTrue("'" + localizedFormats25 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM + "'", localizedFormats25.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM));
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_POISSON_MEAN));
        org.junit.Assert.assertTrue("'" + localizedFormats27 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats27.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[NOT_POSITIVE_POISSON_MEAN, ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, -4 / 3]");
        org.junit.Assert.assertNotNull(exceptionContext38);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test799");
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
        boolean boolean27 = bigFraction25.equals((java.lang.Object) 0);
        long long28 = bigFraction25.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float33 = bigFraction32.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction31.add(bigFraction32);
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction31.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long38 = bigFraction37.longValue();
        java.math.BigInteger bigInteger39 = bigFraction37.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long42 = bigFraction41.longValue();
        java.math.BigInteger bigInteger43 = bigFraction41.getDenominator();
        java.math.BigInteger bigInteger44 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger39, bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction31.add(bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction29.subtract(bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction25.divide(bigFraction29);
        float float48 = bigFraction47.floatValue();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.25f + "'", float33 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 4.0f + "'", float48 == 4.0f);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test800");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-929312903), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test801");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH;
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger3 = bigFraction2.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.add((int) (byte) -1);
        java.math.BigInteger bigInteger7 = bigFraction2.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction2.divide(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction9.subtract((-1072693248));
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide(fraction15);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException17 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, (java.lang.Number) fraction14);
        java.lang.Throwable[] throwableArray18 = notPositiveException17.getSuppressed();
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException19 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats12, (java.lang.Object[]) throwableArray18);
        java.lang.Throwable[] throwableArray20 = mathIllegalStateException19.getSuppressed();
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException21 = new org.apache.commons.math3.exception.NotFiniteNumberException(localizable1, (java.lang.Number) (-1072693248), (java.lang.Object[]) throwableArray20);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException22 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray20);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH));
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test802");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo((-99L));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test803");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.429369702178807E-8d + "'", double1 == 8.429369702178807E-8d);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test804");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
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
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction0.multiply(fraction29);
        float float32 = fraction0.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
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
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.5f + "'", float32 == 0.5f);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test805");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.SAMPLE_SIZE_EXCEEDS_COLLECTION_SIZE;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = localizedFormats0.getLocalizedString(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.SAMPLE_SIZE_EXCEEDS_COLLECTION_SIZE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.SAMPLE_SIZE_EXCEEDS_COLLECTION_SIZE));
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test806");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fractionField5.getOne();
        org.apache.commons.math3.fraction.Fraction fraction7 = fractionField5.getZero();
        long long8 = fraction7.longValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction9.multiply(fraction14);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField16 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = fractionField16.getZero();
        int int18 = fraction7.compareTo(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction17.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test807");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-17), (-127));
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test808");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide(fraction2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction1);
        java.lang.Throwable[] throwableArray5 = notPositiveException4.getSuppressed();
        boolean boolean6 = notPositiveException4.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test809");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.multiply(10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction0.pow((long) 32);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction8.multiply((-1074790400));
        double double12 = bigFraction10.pow(12.566370614359172d);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test810");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        double double3 = fraction1.doubleValue();
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException6 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) double3, (java.lang.Number) (-1.0d), true);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext7 = numberIsTooSmallException6.getContext();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N;
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger11 = bigFraction10.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction10.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction10.add((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction14.reciprocal();
        org.apache.commons.math3.exception.util.Localizable localizable16 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException20 = new org.apache.commons.math3.exception.NumberIsTooSmallException(localizable16, (java.lang.Number) 1.0f, (java.lang.Number) 10, false);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats21 = org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH;
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField25 = fraction24.getField();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.divide(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField30 = fraction29.getField();
        org.apache.commons.math3.fraction.Fraction fraction31 = fractionField30.getZero();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.subtract(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction28.divide(fraction32);
        org.apache.commons.math3.fraction.FractionField fractionField35 = fraction32.getField();
        java.lang.Object[] objArray36 = new java.lang.Object[] { localizedFormats9, bigFraction14, false, localizedFormats21, 10.0f, fraction32 };
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException37 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) numberIsTooSmallException6, (org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray36);
        java.lang.Throwable[] throwableArray38 = mathIllegalStateException37.getSuppressed();
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) throwableArray38);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertNotNull(exceptionContext7);
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N));
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertTrue("'" + localizedFormats21 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH + "'", localizedFormats21.equals(org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fractionField25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fractionField30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fractionField35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[NOT_SUPPORTED_IN_DIMENSION_N, -3 / 4, false, VECTOR_LENGTH_MISMATCH, 10.0, 1 / 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[NOT_SUPPORTED_IN_DIMENSION_N, -3 / 4, false, VECTOR_LENGTH_MISMATCH, 10.0, 1 / 2]");
        org.junit.Assert.assertNotNull(throwableArray38);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test811");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_MUST_HAVE_AT_LEAST_ONE_ELEMENT;
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) localizedFormats0);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_MUST_HAVE_AT_LEAST_ONE_ELEMENT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_MUST_HAVE_AT_LEAST_ONE_ELEMENT));
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test812");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide((int) (byte) 1);
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass4 = fractionField3.getRuntimeClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test813");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test814");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.MINUS_ONE;
        long long1 = bigFraction0.longValue();
        long long2 = bigFraction0.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.subtract((long) 1);
        long long5 = bigFraction4.getDenominatorAsLong();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test815");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide(fraction2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction1);
        java.lang.Number number5 = notPositiveException4.getMin();
        java.lang.Throwable[] throwableArray6 = notPositiveException4.getSuppressed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0 + "'", number5, 0);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test816");
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
        java.math.BigInteger bigInteger14 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long17 = bigFraction16.longValue();
        java.math.BigInteger bigInteger18 = bigFraction16.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long21 = bigFraction20.longValue();
        java.math.BigInteger bigInteger22 = bigFraction20.getDenominator();
        java.math.BigInteger bigInteger23 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger18, bigInteger22);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = new org.apache.commons.math3.fraction.BigFraction(bigInteger14, bigInteger18);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction24.reciprocal();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4L + "'", long11 == 4L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigFraction25);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test817");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float5 = bigFraction4.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.add(bigFraction4);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.divide(fraction8);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField11 = fraction8.getField();
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction13 = fractionField12.getOne();
        org.apache.commons.math3.fraction.Fraction fraction14 = fractionField12.getZero();
        long long15 = fraction14.longValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField17 = fraction16.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField20 = fraction19.getField();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.divide(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction16.multiply(fraction21);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField23 = fraction21.getField();
        org.apache.commons.math3.fraction.Fraction fraction24 = fractionField23.getZero();
        int int25 = fraction14.compareTo(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.negate();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction24.subtract(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.divide(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction30.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction33.divide(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction34.reciprocal();
        int int37 = fraction30.compareTo(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction38 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction38.divide(fraction39);
        int int41 = fraction40.getNumerator();
        double double42 = fraction40.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction43.negate();
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction40.multiply(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction36.divide(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction26.add(fraction40);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException49 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction0, (java.lang.Number) fraction26, true);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.25f + "'", float5 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fractionField23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test818");
        double double1 = org.apache.commons.math3.util.FastMath.rint(9800.052244771154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9800.0d + "'", double1 == 9800.0d);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test819");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.divide(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.subtract(fraction4);
        long long8 = fraction7.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test820");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((int) ' ', 341642467);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test821");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(97, 35);
        int int3 = bigFraction2.getNumeratorAsInt();
        float float4 = bigFraction2.floatValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.7714286f + "'", float4 == 2.7714286f);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test822");
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
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide(fraction15);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException17 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction3.add(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction18.abs();
        org.apache.commons.math3.fraction.Fraction fraction21 = new org.apache.commons.math3.fraction.Fraction((-1072693248));
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.add(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction19.multiply(1078591488);
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
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test823");
        org.apache.commons.math3.util.MathUtils.checkFinite((double) (-1.07479027E9f));
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test824");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (byte) 1, (int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.abs();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract(2);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction(0.0d, 7.105427357600977E-15d, 1807551715);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 1, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float23 = bigFraction22.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction21.add(bigFraction22);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction22.add(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long29 = bigFraction28.longValue();
        java.math.BigInteger bigInteger30 = bigFraction28.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long33 = bigFraction32.longValue();
        java.math.BigInteger bigInteger34 = bigFraction32.getDenominator();
        java.math.BigInteger bigInteger35 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger30, bigInteger34);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction26.multiply(bigInteger30);
        java.math.BigInteger bigInteger38 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger30, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction19.pow(bigInteger30);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction16.multiply(bigInteger30);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException42 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction10, (java.lang.Number) bigFraction16, true);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Loess expects at least 1 point" + "'", str1, "Loess expects at least 1 point");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.25f + "'", float23 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction40);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test825");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1.07859136E9f);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(961);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(fraction6);
        double double8 = fraction6.doubleValue();
        double double9 = fraction6.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.negate();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        boolean boolean12 = fraction6.equals((java.lang.Object) localizedFormats11);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException14 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) fraction1, (java.lang.Number) fraction6, true);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test826");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fractionField7.getZero();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction12.subtract(341642467);
        long long17 = fraction16.longValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.divide(100);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction8.multiply(fraction19);
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
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-341642466L) + "'", long17 == (-341642466L));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test827");
        org.apache.commons.math3.util.MathUtils.checkFinite(1.0766809667216182d);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test828");
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
        java.math.BigInteger bigInteger25 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger20, (int) (short) 0);
        java.math.BigInteger bigInteger27 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger25, 268435456);
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
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test829");
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
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide(fraction15);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException17 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction3.add(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.multiply(0);
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
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test830");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction2);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext4 = notPositiveException3.getContext();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(exceptionContext4);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test831");
        org.apache.commons.math3.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) 0.9046745947545269d);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test832");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction19.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction20.reciprocal();
        long long22 = bigFraction21.getDenominatorAsLong();
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
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test833");
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
        java.math.BigInteger bigInteger27 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, (int) (short) 10);
        java.math.BigInteger bigInteger29 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger27, 1079525366L);
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
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger29);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test834");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 25L, (float) 1018167296);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 25.0f + "'", float2 == 25.0f);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test835");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long3 = bigFraction2.longValue();
        java.math.BigDecimal bigDecimal5 = bigFraction2.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction2.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        boolean boolean8 = bigFraction2.equals((java.lang.Object) bigFraction7);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException13 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray18 = new java.lang.Object[] { (-1.0f), localizedFormats17 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException19 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats15, objArray18);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException20 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException13, (org.apache.commons.math3.exception.util.Localizable) localizedFormats14, objArray18);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException21 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats10, objArray18);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException22 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray18);
        org.apache.commons.math3.exception.util.Localizable localizable23 = null;
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger25 = bigFraction24.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction24.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float29 = bigFraction28.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction24.add(bigFraction28);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats31 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger33 = bigFraction32.getNumerator();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats34 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException37 = new org.apache.commons.math3.fraction.FractionConversionException((double) 0L, (int) 'a');
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats38 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats39 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats41 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (-1.0f), localizedFormats41 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException43 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats39, objArray42);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException44 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException37, (org.apache.commons.math3.exception.util.Localizable) localizedFormats38, objArray42);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException45 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats34, objArray42);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException46 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction32, objArray42);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction24, (org.apache.commons.math3.exception.util.Localizable) localizedFormats31, objArray42);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException48 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalArgumentException22, localizable23, objArray42);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException49 = new org.apache.commons.math3.exception.NotFiniteNumberException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigFraction7, objArray42);
        org.apache.commons.math3.fraction.BigFraction bigFraction51 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction52 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float53 = bigFraction52.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction54 = bigFraction51.add(bigFraction52);
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = bigFraction54.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction57 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float59 = bigFraction58.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = bigFraction57.add(bigFraction58);
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = bigFraction60.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = bigFraction55.add(bigFraction60);
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger64 = bigFraction63.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction65 = bigFraction63.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = bigFraction55.divide(bigFraction63);
        java.math.BigInteger bigInteger67 = bigFraction55.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = bigFraction7.multiply(bigInteger67);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.25f + "'", float29 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertTrue("'" + localizedFormats31 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats31.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertTrue("'" + localizedFormats34 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats34.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats38 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR + "'", localizedFormats38.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats39 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats39.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats41 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats41.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(bigFraction52);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.25f + "'", float53 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction54);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.25f + "'", float59 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertNotNull(bigFraction63);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigFraction65);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertNotNull(bigFraction68);
    }
}

