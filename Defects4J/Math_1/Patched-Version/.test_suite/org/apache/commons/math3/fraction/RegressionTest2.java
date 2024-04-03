package org.apache.commons.math3.fraction;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException(1.0d, (long) (short) -1, 0L);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_TRIALS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), localizedFormats8 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException10 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, objArray9);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException11 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException12 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) fractionConversionException3, (org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray9);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction14.pow(0);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS;
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField19 = fraction18.getField();
        int int20 = fraction18.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction18.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        float float25 = fraction24.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.multiply(fraction24);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException27 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats17, (java.lang.Number) fraction23);
        org.apache.commons.math3.fraction.Fraction fraction29 = new org.apache.commons.math3.fraction.Fraction(0.0d);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction23.subtract(fraction29);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException32 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, (java.lang.Number) bigFraction16, (java.lang.Number) fraction29, true);
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_TRIALS + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_TRIALS));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.6f + "'", float25 == 0.6f);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction30);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        double double1 = org.apache.commons.math3.util.FastMath.rint(20.763175999799355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.0d + "'", double1 == 21.0d);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        double double3 = bigFraction0.pow((double) (byte) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.subtract(0L);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger7 = bigFraction6.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction6.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger10 = bigFraction9.getNumerator();
        java.math.BigInteger bigInteger12 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger14 = bigFraction13.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction13.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger17 = bigFraction16.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction13.pow(bigInteger17);
        java.math.BigInteger bigInteger19 = bigFraction18.getNumerator();
        java.math.BigInteger bigInteger20 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, bigInteger19);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction8.divide(bigInteger19);
        java.math.BigDecimal bigDecimal22 = bigFraction21.bigDecimalValue();
        java.math.BigInteger bigInteger23 = bigFraction21.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction21.pow(52);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction5.add(bigFraction21);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction5.reduce();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.048576E-4d + "'", double3 == 1.048576E-4d);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction27);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction5.subtract(52);
        byte byte15 = bigFraction14.byteValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -51 + "'", byte15 == (byte) -51);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(1078591594L, 127L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 136981132438L + "'", long2 == 136981132438L);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(bigInteger1);
        int int3 = bigFraction2.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.multiply((long) (short) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long8 = bigFraction7.longValue();
        java.math.BigDecimal bigDecimal10 = bigFraction7.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger12 = bigFraction11.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction11.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger15 = bigFraction14.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction11.pow(bigInteger15);
        java.math.BigInteger bigInteger17 = bigFraction16.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction7.pow(bigInteger17);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long21 = bigFraction20.longValue();
        java.math.BigInteger bigInteger22 = bigFraction20.getDenominator();
        java.math.BigInteger bigInteger24 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger22, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long27 = bigFraction26.longValue();
        java.math.BigInteger bigInteger28 = bigFraction26.getDenominator();
        java.math.BigInteger bigInteger30 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger28, (long) 10);
        java.math.BigInteger bigInteger31 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger22, bigInteger30);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction18.multiply(bigInteger22);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction5.divide(bigInteger22);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger35 = bigFraction34.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = new org.apache.commons.math3.fraction.BigFraction(bigInteger35);
        int int37 = bigFraction36.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction36.multiply((long) (short) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long42 = bigFraction41.longValue();
        java.math.BigDecimal bigDecimal44 = bigFraction41.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger46 = bigFraction45.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction45.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger49 = bigFraction48.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = bigFraction45.pow(bigInteger49);
        java.math.BigInteger bigInteger51 = bigFraction50.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction52 = bigFraction41.pow(bigInteger51);
        org.apache.commons.math3.fraction.BigFraction bigFraction54 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long55 = bigFraction54.longValue();
        java.math.BigInteger bigInteger56 = bigFraction54.getDenominator();
        java.math.BigInteger bigInteger58 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger56, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long61 = bigFraction60.longValue();
        java.math.BigInteger bigInteger62 = bigFraction60.getDenominator();
        java.math.BigInteger bigInteger64 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger62, (long) 10);
        java.math.BigInteger bigInteger65 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger56, bigInteger64);
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = bigFraction52.multiply(bigInteger56);
        org.apache.commons.math3.fraction.BigFraction bigFraction67 = bigFraction39.divide(bigInteger56);
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger69 = bigFraction68.getNumerator();
        java.math.BigInteger bigInteger71 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger69, (long) 100);
        java.math.BigInteger bigInteger72 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger56, bigInteger69);
        java.math.BigInteger bigInteger73 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger22, bigInteger69);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigFraction52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 100L + "'", long55 == 100L);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 100L + "'", long61 == 100L);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertNotNull(bigFraction67);
        org.junit.Assert.assertNotNull(bigFraction68);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(bigInteger73);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(50.20884364867249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.609239175456541d + "'", double1 == 4.609239175456541d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction4.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField11 = fraction10.getField();
        int int12 = fraction10.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction10.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction9.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField18 = fraction17.getField();
        org.apache.commons.math3.fraction.Fraction fraction19 = fractionField18.getZero();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float23 = bigFraction22.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction21.add(bigFraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField26 = fraction25.getField();
        org.apache.commons.math3.fraction.Fraction fraction27 = fractionField26.getZero();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.subtract(fraction28);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException31 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction21, (java.lang.Number) fraction28, true);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction19.divide(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction28.add((-1));
        int int35 = fraction28.intValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField38 = fraction37.getField();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction36.divide(fraction37);
        int int40 = fraction39.intValue();
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction39.reciprocal();
        long long42 = fraction39.longValue();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction28.multiply(fraction39);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction10.multiply(fraction28);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.25f + "'", float23 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fractionField26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fractionField38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((long) (byte) 10, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(0.02499479361892016d, (int) (short) 100);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger6 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction4.pow(bigInteger6);
        java.math.BigInteger bigInteger9 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger6, 2);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException12 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigInteger6, (java.lang.Number) (-1891596483), false);
        java.math.BigInteger bigInteger14 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger6, (long) 341642464);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger16 = bigFraction15.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction15.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger19 = bigFraction18.getNumerator();
        java.math.BigInteger bigInteger21 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger19, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger23 = bigFraction22.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction22.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger26 = bigFraction25.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction22.pow(bigInteger26);
        java.math.BigInteger bigInteger28 = bigFraction27.getNumerator();
        java.math.BigInteger bigInteger29 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger19, bigInteger28);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction17.divide(bigInteger28);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction30.abs();
        java.math.BigInteger bigInteger32 = bigFraction31.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = new org.apache.commons.math3.fraction.BigFraction(bigInteger14, bigInteger32);
        int int34 = bigFraction33.intValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger4 = bigFraction3.getNumerator();
        java.math.BigInteger bigInteger6 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger4, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger8 = bigFraction7.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction7.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger11 = bigFraction10.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction7.pow(bigInteger11);
        java.math.BigInteger bigInteger13 = bigFraction12.getNumerator();
        java.math.BigInteger bigInteger14 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger4, bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction2.divide(bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction15.abs();
        java.math.BigInteger bigInteger17 = bigFraction16.getNumerator();
        java.math.BigInteger bigInteger18 = bigFraction16.getDenominator();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.add((int) (byte) 100);
        int int8 = fraction7.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 201 + "'", int8 == 201);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 118650993303355392L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction1.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction1.add(10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction14.divide(8);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction16);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(50.208843648672485d, (-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.21736630391233d + "'", double2 == 50.21736630391233d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((-1.6852827887682385E-11d), 0.16406412741700827d, 97);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger4 = bigFraction3.getNumerator();
        java.math.BigInteger bigInteger6 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger4, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger8 = bigFraction7.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction7.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger11 = bigFraction10.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction7.pow(bigInteger11);
        java.math.BigInteger bigInteger13 = bigFraction12.getNumerator();
        java.math.BigInteger bigInteger14 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger4, bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction2.divide(bigInteger13);
        java.math.BigDecimal bigDecimal16 = bigFraction15.bigDecimalValue();
        java.math.BigInteger bigInteger17 = bigFraction15.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction15.add(1769765864L);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float23 = bigFraction22.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction21.add(bigFraction22);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction22.add((long) 1078591488);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float30 = bigFraction29.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction28.add(bigFraction29);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger33 = bigFraction32.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction31.pow(bigInteger33);
        java.math.BigInteger bigInteger36 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger33, 2);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException39 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigInteger33, (java.lang.Number) (-1891596483), false);
        java.math.BigInteger bigInteger41 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger33, (long) 341642464);
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction26.pow(bigInteger41);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction19.pow(bigInteger41);
        long long44 = bigFraction43.getDenominatorAsLong();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.25f + "'", float23 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.25f + "'", float30 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 5L + "'", long44 == 5L);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((-31L), 1769765864L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1769765895L) + "'", long2 == (-1769765895L));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger4 = bigFraction3.getNumerator();
        java.math.BigInteger bigInteger6 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger4, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger8 = bigFraction7.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction7.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger11 = bigFraction10.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction7.pow(bigInteger11);
        java.math.BigInteger bigInteger13 = bigFraction12.getNumerator();
        java.math.BigInteger bigInteger14 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger4, bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction2.divide(bigInteger13);
        java.math.BigDecimal bigDecimal16 = bigFraction15.bigDecimalValue();
        java.math.BigInteger bigInteger17 = bigFraction15.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction15.pow(52);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction19.divide(970);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction21);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.COLUMN_INDEX_OUT_OF_RANGE;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = localizedFormats0.getLocalizedString(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.COLUMN_INDEX_OUT_OF_RANGE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.COLUMN_INDEX_OUT_OF_RANGE));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.divide(fraction5);
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction10 = fractionField9.getZero();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction6.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField14 = fraction13.getField();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.divide(fraction13);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField16 = fraction13.getField();
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction13.getField();
        int int18 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction11.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField21 = fraction20.getField();
        org.apache.commons.math3.fraction.Fraction fraction22 = fractionField21.getZero();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction22.subtract(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction11.subtract(fraction24);
        long long26 = fraction11.longValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction3.multiply(fraction11);
        java.lang.String str28 = fraction11.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
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
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1" + "'", str28, "1");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((int) '#');
        java.math.BigInteger bigInteger7 = bigFraction3.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger9 = bigFraction8.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = new org.apache.commons.math3.fraction.BigFraction(bigInteger9);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction10.subtract(0);
        double double14 = bigFraction10.pow(15.104412573075516d);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float18 = bigFraction17.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction16.add(bigFraction17);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger21 = bigFraction20.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction19.pow(bigInteger21);
        java.math.BigInteger bigInteger24 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger21, 2);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException27 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigInteger21, (java.lang.Number) (-1891596483), false);
        java.math.BigInteger bigInteger29 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger21, (long) 341642464);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger31 = bigFraction30.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction30.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger34 = bigFraction33.getNumerator();
        java.math.BigInteger bigInteger36 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger34, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger38 = bigFraction37.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction37.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger41 = bigFraction40.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction37.pow(bigInteger41);
        java.math.BigInteger bigInteger43 = bigFraction42.getNumerator();
        java.math.BigInteger bigInteger44 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger34, bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction32.divide(bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction45.abs();
        java.math.BigInteger bigInteger47 = bigFraction46.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = new org.apache.commons.math3.fraction.BigFraction(bigInteger29, bigInteger47);
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction10.divide(bigInteger29);
        java.math.BigInteger bigInteger50 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, bigInteger29);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35227.453586820804d + "'", double14 == 35227.453586820804d);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.25f + "'", float18 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigInteger50);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.9884153105589386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9884153105589388d + "'", double1 == 1.9884153105589388d);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((-171496046592L));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS;
        java.lang.Number number2 = null;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fractionField4.getZero();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField10 = fraction9.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.divide(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction7.multiply(fraction11);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_DECREASING_SEQUENCE;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_VALUE_CONVERSION;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats16 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED;
        org.apache.commons.math3.exception.util.Localizable localizable18 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats19 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats21 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray22 = new java.lang.Object[] { (-1.0f), localizedFormats21 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException23 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats19, objArray22);
        org.apache.commons.math3.exception.ConvergenceException convergenceException24 = new org.apache.commons.math3.exception.ConvergenceException(localizable18, objArray22);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction25.reciprocal();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction25.add((long) (short) 0);
        java.lang.Object[] objArray29 = new java.lang.Object[] { localizedFormats14, localizedFormats15, localizedFormats16, localizedFormats17, objArray22, bigFraction28 };
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) fraction12, (org.apache.commons.math3.exception.util.Localizable) localizedFormats13, objArray22);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException31 = new org.apache.commons.math3.exception.NotFiniteNumberException(number2, objArray22);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException32 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray22);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException33 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray22);
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField35 = fraction34.getField();
        org.apache.commons.math3.fraction.Fraction fraction36 = fractionField35.getZero();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float40 = bigFraction39.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction38.add(bigFraction39);
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField43 = fraction42.getField();
        org.apache.commons.math3.fraction.Fraction fraction44 = fractionField43.getZero();
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction44.subtract(fraction45);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException48 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction38, (java.lang.Number) fraction45, true);
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction36.divide(fraction45);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats50 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats51 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats52 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats53 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_MEAN;
        java.lang.Object[] objArray54 = new java.lang.Object[] { localizedFormats53 };
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) localizedFormats51, (org.apache.commons.math3.exception.util.Localizable) localizedFormats52, objArray54);
        org.apache.commons.math3.exception.ZeroException zeroException56 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats50, objArray54);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException57 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) fraction45, objArray54);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException58 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray54);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_DECREASING_SEQUENCE + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_DECREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_VALUE_CONVERSION + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_VALUE_CONVERSION));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN));
        org.junit.Assert.assertTrue("'" + localizedFormats16 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE + "'", localizedFormats16.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE));
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED));
        org.junit.Assert.assertTrue("'" + localizedFormats19 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats19.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats21 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats21.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[INFINITE_VALUE_CONVERSION, OUTLINE_BOUNDARY_LOOP_OPEN, NOT_POWER_OF_TWO_PLUS_ONE, NO_BIN_SELECTED, [-1.0, BINOMIAL_NEGATIVE_PARAMETER], 2 / 5]");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fractionField35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.25f + "'", float40 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fractionField43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + localizedFormats50 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA + "'", localizedFormats50.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA));
        org.junit.Assert.assertTrue("'" + localizedFormats51 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats51.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + localizedFormats52 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH + "'", localizedFormats52.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH));
        org.junit.Assert.assertTrue("'" + localizedFormats53 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_MEAN + "'", localizedFormats53.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_MEAN));
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[NOT_POSITIVE_MEAN]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[NOT_POSITIVE_MEAN]");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fractionField4.getZero();
        int int6 = fraction5.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.divide((int) ' ');
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(35, 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.add(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.add((-127));
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE;
        java.lang.String str8 = localizedFormats7.getSourceString();
        java.lang.Object[] objArray9 = null;
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) bigFraction6, (org.apache.commons.math3.exception.util.Localizable) localizedFormats7, objArray9);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "polynomial degree must be positive: degree={0}" + "'", str8, "polynomial degree must be positive: degree={0}");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigDecimal bigDecimal4 = bigFraction1.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger6 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger9 = bigFraction8.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction5.pow(bigInteger9);
        java.math.BigInteger bigInteger11 = bigFraction10.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction1.pow(bigInteger11);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction12.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction12.pow((long) (byte) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger18 = bigFraction17.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction17.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction16.add(bigFraction19);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float24 = bigFraction23.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction22.add(bigFraction23);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction25.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction20.add(bigFraction26);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction26.pow((-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction15.add(bigFraction26);
        double double31 = bigFraction30.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction30.subtract((-456000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.25f + "'", float24 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0E202d + "'", double31 == 1.0E202d);
        org.junit.Assert.assertNotNull(bigFraction33);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float6 = bigFraction5.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction4.add(bigFraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction10 = fractionField9.getZero();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract(fraction11);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException14 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction4, (java.lang.Number) fraction11, true);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction2.divide(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction2.multiply((int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.divide(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.abs();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.add(21);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction17.add(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction17.negate();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction17.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-1891596483));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1891596483 + "'", int1 == 1891596483);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float3 = bigFraction2.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.add(bigFraction2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger7 = bigFraction6.getNumerator();
        int int8 = bigFraction5.compareTo(bigFraction6);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction5.multiply((long) (short) 10);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(bigFraction10);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_THIRD;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.multiply(6);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.divide((long) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.add((int) (short) -1);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.divide(fraction10);
        int int12 = fraction11.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField14 = fraction13.getField();
        org.apache.commons.math3.fraction.Fraction fraction15 = fractionField14.getZero();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction11.add(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField18 = fraction17.getField();
        org.apache.commons.math3.fraction.Fraction fraction19 = fractionField18.getZero();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.subtract(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction16.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.divide(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction16.divide(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction7.add(fraction27);
        long long29 = fraction27.longValue();
        boolean boolean30 = bigFraction4.equals((java.lang.Object) fraction27);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction32.pow(0);
        int int35 = bigFraction32.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = bigFraction32.add(0L);
        java.math.BigInteger bigInteger38 = bigFraction37.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction4.pow(bigInteger38);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 2L + "'", long29 == 2L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigFraction39);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float6 = bigFraction5.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction4.add(bigFraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction10 = fractionField9.getZero();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract(fraction11);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException14 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction4, (java.lang.Number) fraction11, true);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction2.divide(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction2.multiply((int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.divide(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.abs();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.add(21);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction17.add(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.add((-160));
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.divide(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.abs();
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.divide(fraction32);
        int int34 = fraction33.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField36 = fraction35.getField();
        org.apache.commons.math3.fraction.Fraction fraction37 = fractionField36.getZero();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction33.add(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField41 = fraction40.getField();
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction39.divide(fraction40);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField43 = fraction40.getField();
        org.apache.commons.math3.fraction.FractionField fractionField44 = fraction40.getField();
        int int45 = fraction40.intValue();
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction38.multiply(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction47 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField48 = fraction47.getField();
        org.apache.commons.math3.fraction.Fraction fraction49 = fractionField48.getZero();
        org.apache.commons.math3.fraction.Fraction fraction50 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction49.subtract(fraction50);
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction38.subtract(fraction51);
        long long53 = fraction38.longValue();
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction30.multiply(fraction38);
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction26.multiply(fraction54);
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction54.abs();
        org.apache.commons.math3.fraction.Fraction fraction57 = fraction54.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fractionField36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fractionField41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fractionField43);
        org.junit.Assert.assertNotNull(fractionField44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fractionField48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        double double3 = bigFraction1.pow((double) 160);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger6 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.pow(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction5.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction1.multiply(bigFraction9);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = bigFraction1.bigDecimalValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide(fraction1);
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.reciprocal();
        long long6 = fraction3.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.divide(fraction8);
        int int10 = fraction9.getNumerator();
        long long11 = fraction9.longValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction3.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.divide(fraction16);
        org.apache.commons.math3.fraction.FractionField fractionField18 = fraction15.getField();
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField19 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction3.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction3.multiply(fraction21);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        int int2 = fraction0.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        float float7 = fraction6.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.abs();
        java.lang.String str10 = fraction9.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.6f + "'", float7 == 0.6f);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3" + "'", str10, "3");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        int int2 = org.apache.commons.math3.util.FastMath.min(30, (-1769765857));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1769765857) + "'", int2 == (-1769765857));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-1));
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.reciprocal();
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField8 = fraction7.getField();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.divide(1078591488);
        float float11 = fraction7.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction1.multiply(fraction7);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(6.429722079485802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1122198202752038d + "'", double1 == 0.1122198202752038d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(1.072693248E9d);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.multiply(154230L);
        org.junit.Assert.assertNotNull(bigFraction3);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.644298430695373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 266.09869887807633d + "'", double1 == 266.09869887807633d);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger2 = bigFraction1.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.add(bigFraction3);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((int) '#');
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(35, 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction9.add(10);
        java.lang.String str12 = bigFraction9.toString();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction3.add(bigFraction9);
        double double15 = bigFraction3.pow((double) (-1.76976589E9f));
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35 / 2" + "'", str12, "35 / 2");
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = fractionField1.getOne();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 0.25000003f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.25000003f + "'", float2 == 0.25000003f);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction5.getField();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.divide(fraction9);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException11 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats7, (java.lang.Number) fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction5.multiply(fraction8);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException15 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) fraction5, (java.lang.Number) (-0.5984600690578581d), false);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(201, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.N_POINTS_GAUSS_LEGENDRE_INTEGRATOR_NOT_SUPPORTED;
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((int) '4', (int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fractionField6.getZero();
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
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction7.divide(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction7.multiply((int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.divide(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.abs();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.add(21);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction22.add(fraction28);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger31 = bigFraction30.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction30.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction30.multiply((int) (short) 100);
        double double36 = bigFraction34.pow(0.0d);
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction38 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction37.divide(fraction38);
        int int40 = fraction39.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction41 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField42 = fraction41.getField();
        org.apache.commons.math3.fraction.Fraction fraction43 = fractionField42.getZero();
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction39.add(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction46 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField47 = fraction46.getField();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction45.divide(fraction46);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField49 = fraction46.getField();
        org.apache.commons.math3.fraction.FractionField fractionField50 = fraction46.getField();
        int int51 = fraction46.intValue();
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction44.multiply(fraction46);
        org.apache.commons.math3.fraction.Fraction fraction53 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField54 = fraction53.getField();
        org.apache.commons.math3.fraction.Fraction fraction55 = fractionField54.getZero();
        org.apache.commons.math3.fraction.Fraction fraction56 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction57 = fraction55.subtract(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction44.subtract(fraction57);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException60 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction34, (java.lang.Number) fraction58, false);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats62 = org.apache.commons.math3.exception.util.LocalizedFormats.SCALE;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats63 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_RESULT_AVAILABLE;
        java.lang.Object[] objArray64 = new java.lang.Object[] { '4', fraction29, fraction58, (byte) 0, localizedFormats62, localizedFormats63 };
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException65 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray64);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException66 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray64);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext67 = mathArithmeticException66.getContext();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext68 = mathArithmeticException66.getContext();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.N_POINTS_GAUSS_LEGENDRE_INTEGRATOR_NOT_SUPPORTED + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.N_POINTS_GAUSS_LEGENDRE_INTEGRATOR_NOT_SUPPORTED));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.25f + "'", float11 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fractionField42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fractionField47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fractionField49);
        org.junit.Assert.assertNotNull(fractionField50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fractionField54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + localizedFormats62 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.SCALE + "'", localizedFormats62.equals(org.apache.commons.math3.exception.util.LocalizedFormats.SCALE));
        org.junit.Assert.assertTrue("'" + localizedFormats63 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_RESULT_AVAILABLE + "'", localizedFormats63.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_RESULT_AVAILABLE));
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[4, 43 / 2, 3 / 2, 0, SCALE, NO_RESULT_AVAILABLE]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[4, 43 / 2, 3 / 2, 0, SCALE, NO_RESULT_AVAILABLE]");
        org.junit.Assert.assertNotNull(exceptionContext67);
        org.junit.Assert.assertNotNull(exceptionContext68);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(127);
        double double2 = bigFraction1.doubleValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.0d + "'", double2 == 127.0d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.25331261547055d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigDecimal bigDecimal4 = bigFraction1.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger6 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger9 = bigFraction8.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction5.pow(bigInteger9);
        java.math.BigInteger bigInteger11 = bigFraction10.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction1.pow(bigInteger11);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger14 = bigFraction13.getNumerator();
        java.math.BigInteger bigInteger16 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger14, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger18 = bigFraction17.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction17.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger21 = bigFraction20.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction17.pow(bigInteger21);
        java.math.BigInteger bigInteger23 = bigFraction22.getNumerator();
        java.math.BigInteger bigInteger24 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger14, bigInteger23);
        java.math.BigInteger bigInteger26 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger24, (long) 5);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction1.divide(bigInteger26);
        int int28 = bigFraction27.intValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-160L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        java.lang.Object obj2 = null;
        boolean boolean3 = fraction0.equals(obj2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(15.104412573075516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.0d + "'", double1 == 16.0d);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(2.99822295029797d, (double) (byte) 1, 1420233952);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.MINUS_ONE;
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.subtract((int) 'a');
        int int7 = bigFraction3.compareTo(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger5 = bigFraction4.getNumerator();
        java.math.BigInteger bigInteger7 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger5, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger9 = bigFraction8.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction8.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger12 = bigFraction11.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction8.pow(bigInteger12);
        java.math.BigInteger bigInteger14 = bigFraction13.getNumerator();
        java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger5, bigInteger14);
        java.math.BigInteger bigInteger17 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger15, (long) 5);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction0.multiply(bigInteger15);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction20.multiply((long) 341642467);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction0.subtract(bigFraction22);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction23.divide(1590L);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction25);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(32);
        java.lang.Throwable throwable5 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_MEAN;
        java.lang.Object[] objArray10 = new java.lang.Object[] { localizedFormats9 };
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) localizedFormats7, (org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray10);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException12 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, objArray10);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException13 = new org.apache.commons.math3.exception.NullArgumentException();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR;
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException17 = new org.apache.commons.math3.exception.NullArgumentException();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC;
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float22 = bigFraction21.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction20.add(bigFraction21);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction20.abs();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1, nullArgumentException17, localizedFormats18, bigFraction24 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException26 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats15, objArray25);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException27 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) nullArgumentException13, (org.apache.commons.math3.exception.util.Localizable) localizedFormats14, objArray25);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException28 = new org.apache.commons.math3.exception.MathIllegalStateException(throwable5, (org.apache.commons.math3.exception.util.Localizable) localizedFormats6, objArray25);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException29 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) fraction4, objArray25);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction1.multiply(fraction4);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR_FORMAT + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMERATOR_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH));
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_MEAN + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_MEAN));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[NOT_POSITIVE_MEAN]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[NOT_POSITIVE_MEAN]");
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC));
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.25f + "'", float22 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, org.apache.commons.math3.exception.NullArgumentException: null is not allowed, INSUFFICIENT_DATA_FOR_T_STATISTIC, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, org.apache.commons.math3.exception.NullArgumentException: null is not allowed, INSUFFICIENT_DATA_FOR_T_STATISTIC, 0]");
        org.junit.Assert.assertNotNull(fraction30);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        double double3 = org.apache.commons.math3.util.MathUtils.reduce(1.2840254166877414d, (double) (-6.8328493E8f), 0.2735637130964069d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0104617035913344d + "'", double3 == 1.0104617035913344d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        double double3 = bigFraction0.pow((double) (byte) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction0.subtract(0L);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField6 = bigFraction0.getField();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction0.divide((long) (-127));
        long long9 = bigFraction0.getNumeratorAsLong();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.048576E-4d + "'", double3 == 1.048576E-4d);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFractionField6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigDecimal bigDecimal4 = bigFraction1.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger6 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger9 = bigFraction8.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction5.pow(bigInteger9);
        java.math.BigInteger bigInteger11 = bigFraction10.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction1.pow(bigInteger11);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction12.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long16 = bigFraction15.longValue();
        java.math.BigDecimal bigDecimal18 = bigFraction15.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger20 = bigFraction19.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction19.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger23 = bigFraction22.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction19.pow(bigInteger23);
        java.math.BigInteger bigInteger25 = bigFraction24.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction15.pow(bigInteger25);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats27 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats28 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats30 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_MEAN;
        java.lang.Object[] objArray31 = new java.lang.Object[] { localizedFormats30 };
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) localizedFormats28, (org.apache.commons.math3.exception.util.Localizable) localizedFormats29, objArray31);
        org.apache.commons.math3.exception.ZeroException zeroException33 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats27, objArray31);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException34 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) bigFraction15, objArray31);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        int int37 = bigFraction36.getNumeratorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float41 = bigFraction40.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction39.add(bigFraction40);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger44 = bigFraction43.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction42.pow(bigInteger44);
        java.math.BigInteger bigInteger47 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger44, 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = bigFraction36.add(bigInteger47);
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction15.subtract(bigFraction36);
        org.apache.commons.math3.fraction.BigFraction bigFraction51 = bigFraction15.add(1072693248);
        java.math.BigInteger bigInteger52 = bigFraction51.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = bigFraction13.divide(bigInteger52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertTrue("'" + localizedFormats27 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA + "'", localizedFormats27.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA));
        org.junit.Assert.assertTrue("'" + localizedFormats28 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats28.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH));
        org.junit.Assert.assertTrue("'" + localizedFormats30 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_MEAN + "'", localizedFormats30.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_MEAN));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[NOT_POSITIVE_MEAN]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[NOT_POSITIVE_MEAN]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.25f + "'", float41 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigFraction48);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigFraction51);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigFraction53);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction12.getField();
        int int14 = fraction12.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction8.add(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction8.multiply((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction8.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction20.abs();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.072693248E9d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.multiply((long) 341642467);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.divide(300);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.subtract(15L);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction7.reduce();
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(100L, 310L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3100L + "'", long2 == 3100L);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(600414706);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 51);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 51.0f + "'", float1 == 51.0f);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(341642467);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.subtract(52);
        org.junit.Assert.assertNotNull(bigFraction3);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) (short) 10);
        long long2 = bigFraction1.getNumeratorAsLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField1 = fraction0.getField();
        int int2 = fraction0.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply((int) (short) 10);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField6 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.divide(fraction8);
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.reciprocal();
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.divide(1078591488);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction0.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField18 = fraction17.getField();
        org.apache.commons.math3.fraction.Fraction fraction19 = fractionField18.getZero();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.subtract(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField24 = fraction23.getField();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.divide(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction21.multiply(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField28 = fraction27.getField();
        int int29 = fraction27.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction27.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction26.add(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction12.subtract(fraction33);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fractionField24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fractionField28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.MINUS_ONE;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.subtract((int) 'a');
        long long3 = bigFraction2.getNumeratorAsLong();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-98L) + "'", long3 == (-98L));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction12.getField();
        int int14 = fraction12.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction8.add(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction8.multiply((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction8.multiply(0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(95);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        java.math.BigInteger bigInteger3 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger1, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger5 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger8 = bigFraction7.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction4.pow(bigInteger8);
        java.math.BigInteger bigInteger10 = bigFraction9.getNumerator();
        java.math.BigInteger bigInteger11 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger1, bigInteger10);
        java.math.BigInteger bigInteger13 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger1, 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long16 = bigFraction15.longValue();
        java.math.BigInteger bigInteger17 = bigFraction15.getDenominator();
        java.math.BigInteger bigInteger19 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger17, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long22 = bigFraction21.longValue();
        java.math.BigInteger bigInteger23 = bigFraction21.getDenominator();
        java.math.BigInteger bigInteger25 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger23, (long) 10);
        java.math.BigInteger bigInteger26 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger17, bigInteger25);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction(bigInteger13, bigInteger26);
        java.math.BigInteger bigInteger28 = bigFraction27.getDenominator();
        java.math.BigInteger bigInteger30 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger28, (long) 1083758592);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger30);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-1.5648515943184997d), 7);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 281392772376L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16921821188530833d) + "'", double1 == (-0.16921821188530833d));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((-1), (-1891596483));
        short short3 = bigFraction2.shortValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(35, 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.add(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger6 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction(bigInteger6);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction(bigInteger6);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger10 = bigFraction9.getNumerator();
        java.math.BigInteger bigInteger12 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, (long) 100);
        java.math.BigInteger bigInteger13 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger6, bigInteger10);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction2.pow(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigFraction14);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        int int1 = org.apache.commons.math3.util.MathUtils.hash(0.4d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1505755133) + "'", int1 == (-1505755133));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        java.math.BigInteger bigInteger3 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger1, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger5 = bigFraction4.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger8 = bigFraction7.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction4.pow(bigInteger8);
        java.math.BigInteger bigInteger10 = bigFraction9.getNumerator();
        java.math.BigInteger bigInteger11 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger1, bigInteger10);
        java.math.BigInteger bigInteger13 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger1, 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger15 = bigFraction14.getNumerator();
        java.math.BigInteger bigInteger17 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger15, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger19 = bigFraction18.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction18.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger22 = bigFraction21.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction18.pow(bigInteger22);
        java.math.BigInteger bigInteger24 = bigFraction23.getNumerator();
        java.math.BigInteger bigInteger25 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger15, bigInteger24);
        java.math.BigInteger bigInteger27 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger15, 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long30 = bigFraction29.longValue();
        java.math.BigInteger bigInteger31 = bigFraction29.getDenominator();
        java.math.BigInteger bigInteger33 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger31, (long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long36 = bigFraction35.longValue();
        java.math.BigInteger bigInteger37 = bigFraction35.getDenominator();
        java.math.BigInteger bigInteger39 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger37, (long) 10);
        java.math.BigInteger bigInteger40 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger31, bigInteger39);
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = new org.apache.commons.math3.fraction.BigFraction(bigInteger27, bigInteger40);
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = new org.apache.commons.math3.fraction.BigFraction(bigInteger1, bigInteger40);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger40);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.0000000000000004d, 0.16313524550839092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04237705389930935d + "'", double2 == 0.04237705389930935d);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(35);
        double double3 = bigFraction1.pow(1.52587890625E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0000542517776885d + "'", double3 == 1.0000542517776885d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.add((int) (short) -1);
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.divide(fraction5);
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField9 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction10 = fractionField9.getZero();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction6.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = fractionField13.getZero();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction11.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.divide(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction11.divide(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction2.add(fraction22);
        long long24 = fraction22.longValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField27 = fraction26.getField();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction25.divide(fraction26);
        int int29 = fraction28.intValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.reciprocal();
        long long31 = fraction28.longValue();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction32.divide(fraction33);
        int int35 = fraction34.getNumerator();
        long long36 = fraction34.longValue();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction28.divide(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction28.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction41 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction40.divide(fraction41);
        org.apache.commons.math3.fraction.FractionField fractionField43 = fraction40.getField();
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField44 = fraction40.getField();
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction28.multiply(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction46 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction47 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction46.divide(fraction47);
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction47.reciprocal();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException50 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction49);
        java.lang.Number number51 = notPositiveException50.getArgument();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats52 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESSES;
        org.apache.commons.math3.fraction.Fraction fraction53 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField54 = fraction53.getField();
        org.apache.commons.math3.fraction.Fraction fraction55 = fractionField54.getZero();
        org.apache.commons.math3.fraction.Fraction fraction56 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction57 = fraction55.subtract(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction58 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction59 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField60 = fraction59.getField();
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction58.divide(fraction59);
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction57.multiply(fraction61);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats63 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_DECREASING_SEQUENCE;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats64 = org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_VALUE_CONVERSION;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats65 = org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats66 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats67 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED;
        org.apache.commons.math3.exception.util.Localizable localizable68 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats69 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats71 = org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER;
        java.lang.Object[] objArray72 = new java.lang.Object[] { (-1.0f), localizedFormats71 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException73 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats69, objArray72);
        org.apache.commons.math3.exception.ConvergenceException convergenceException74 = new org.apache.commons.math3.exception.ConvergenceException(localizable68, objArray72);
        org.apache.commons.math3.fraction.BigFraction bigFraction75 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction76 = bigFraction75.reciprocal();
        org.apache.commons.math3.fraction.BigFraction bigFraction78 = bigFraction75.add((long) (short) 0);
        java.lang.Object[] objArray79 = new java.lang.Object[] { localizedFormats64, localizedFormats65, localizedFormats66, localizedFormats67, objArray72, bigFraction78 };
        org.apache.commons.math3.util.MathUtils.checkNotNull((java.lang.Object) fraction62, (org.apache.commons.math3.exception.util.Localizable) localizedFormats63, objArray72);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException81 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException50, (org.apache.commons.math3.exception.util.Localizable) localizedFormats52, objArray72);
        org.apache.commons.math3.exception.NotFiniteNumberException notFiniteNumberException82 = new org.apache.commons.math3.exception.NotFiniteNumberException((java.lang.Number) fraction45, objArray72);
        org.apache.commons.math3.fraction.Fraction fraction83 = fraction22.subtract(fraction45);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fractionField27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fractionField43);
        org.junit.Assert.assertNotNull(fractionField44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(number51);
        org.junit.Assert.assertTrue("'" + localizedFormats52 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESSES + "'", localizedFormats52.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESSES));
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fractionField54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fractionField60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + localizedFormats63 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_DECREASING_SEQUENCE + "'", localizedFormats63.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_DECREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + localizedFormats64 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_VALUE_CONVERSION + "'", localizedFormats64.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_VALUE_CONVERSION));
        org.junit.Assert.assertTrue("'" + localizedFormats65 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN + "'", localizedFormats65.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUTLINE_BOUNDARY_LOOP_OPEN));
        org.junit.Assert.assertTrue("'" + localizedFormats66 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE + "'", localizedFormats66.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE));
        org.junit.Assert.assertTrue("'" + localizedFormats67 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED + "'", localizedFormats67.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED));
        org.junit.Assert.assertTrue("'" + localizedFormats69 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR + "'", localizedFormats69.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats71 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER + "'", localizedFormats71.equals(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER));
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[-1.0, BINOMIAL_NEGATIVE_PARAMETER]");
        org.junit.Assert.assertNotNull(bigFraction75);
        org.junit.Assert.assertNotNull(bigFraction76);
        org.junit.Assert.assertNotNull(bigFraction78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[INFINITE_VALUE_CONVERSION, OUTLINE_BOUNDARY_LOOP_OPEN, NOT_POWER_OF_TWO_PLUS_ONE, NO_BIN_SELECTED, [-1.0, BINOMIAL_NEGATIVE_PARAMETER], 2 / 5]");
        org.junit.Assert.assertNotNull(fraction83);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_POLYNOMIALS_COEFFICIENTS_ARRAY;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_POLYNOMIALS_COEFFICIENTS_ARRAY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_POLYNOMIALS_COEFFICIENTS_ARRAY));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "empty polynomials coefficients array" + "'", str1, "empty polynomials coefficients array");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        int int2 = bigFraction1.getNumeratorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float6 = bigFraction5.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction4.add(bigFraction5);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger9 = bigFraction8.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction7.pow(bigInteger9);
        java.math.BigInteger bigInteger12 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger9, 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction1.add(bigInteger12);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger12, (-1769765857));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: exponent (-1,769,765,857)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.25f + "'", float6 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigFraction13);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField13 = fraction12.getField();
        int int14 = fraction12.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction8.add(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction8.multiply((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction8.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float23 = bigFraction22.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction21.add(bigFraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField26 = fraction25.getField();
        org.apache.commons.math3.fraction.Fraction fraction27 = fractionField26.getZero();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.subtract(fraction28);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException31 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) bigFraction21, (java.lang.Number) fraction28, true);
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField33 = fraction32.getField();
        int int34 = fraction32.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction32.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction28.add(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction28.multiply((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction28.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction39.negate();
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction19.subtract(fraction39);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction19.add(1083758592);
        double double44 = fraction43.percentageValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.25f + "'", float23 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fractionField26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fractionField33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0637250555E11d) + "'", double44 == (-1.0637250555E11d));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((-127), 30);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((long) 'a', (long) (-1769765864));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-171667288808L) + "'", long2 == (-171667288808L));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigDecimal bigDecimal4 = bigFraction1.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger6 = bigFraction5.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger9 = bigFraction8.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction5.pow(bigInteger9);
        java.math.BigInteger bigInteger11 = bigFraction10.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction1.pow(bigInteger11);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        java.math.BigInteger bigInteger14 = bigFraction13.getNumerator();
        java.math.BigInteger bigInteger16 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger14, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger18 = bigFraction17.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction17.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger21 = bigFraction20.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction17.pow(bigInteger21);
        java.math.BigInteger bigInteger23 = bigFraction22.getNumerator();
        java.math.BigInteger bigInteger24 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger14, bigInteger23);
        java.math.BigInteger bigInteger26 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger24, (long) 5);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction1.divide(bigInteger26);
        java.math.BigDecimal bigDecimal29 = bigFraction1.bigDecimalValue(4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigDecimal29);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField17 = fraction16.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = fractionField17.getZero();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction7.subtract(fraction20);
        long long22 = fraction7.longValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField25 = fraction24.getField();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.divide(fraction24);
        int int27 = fraction26.intValue();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.reciprocal();
        long long29 = fraction26.longValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction30.divide(fraction31);
        int int33 = fraction32.getNumerator();
        long long34 = fraction32.longValue();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction26.divide(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction26.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction7.add(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction37.reciprocal();
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
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fractionField25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-171496046592L), (float) 536346645L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.36346656E8f + "'", float2 == 5.36346656E8f);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger1 = bigFraction0.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.pow(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction0.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.subtract((long) (byte) 1);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        long long9 = bigFraction8.longValue();
        java.math.BigDecimal bigDecimal11 = bigFraction8.bigDecimalValue((int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger13 = bigFraction12.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction12.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        java.math.BigInteger bigInteger16 = bigFraction15.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction12.pow(bigInteger16);
        java.math.BigInteger bigInteger18 = bigFraction17.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction8.pow(bigInteger18);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction19.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction0.subtract(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 320L, (float) 536346624L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.36346624E8f + "'", float2 == 5.36346624E8f);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM;
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_REGRESSION_OBSERVATION;
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException3 = new org.apache.commons.math3.exception.NullArgumentException();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR;
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException7 = new org.apache.commons.math3.exception.NullArgumentException();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC;
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = new org.apache.commons.math3.fraction.BigFraction((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float12 = bigFraction11.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction10.add(bigFraction11);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction10.abs();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1, nullArgumentException7, localizedFormats8, bigFraction14 };
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException16 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray15);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException17 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) nullArgumentException3, (org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray15);
        org.apache.commons.math3.exception.ZeroException zeroException18 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats2, objArray15);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException19 = new org.apache.commons.math3.exception.MathIllegalArgumentException(localizable1, objArray15);
        org.apache.commons.math3.exception.ZeroException zeroException20 = new org.apache.commons.math3.exception.ZeroException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray15);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_REGRESSION_OBSERVATION + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_REGRESSION_OBSERVATION));
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC));
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.25f + "'", float12 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, org.apache.commons.math3.exception.NullArgumentException: null is not allowed, INSUFFICIENT_DATA_FOR_T_STATISTIC, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, org.apache.commons.math3.exception.NullArgumentException: null is not allowed, INSUFFICIENT_DATA_FOR_T_STATISTIC, 0]");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(0.0d, 0.0d, 1072693248);
    }
}

