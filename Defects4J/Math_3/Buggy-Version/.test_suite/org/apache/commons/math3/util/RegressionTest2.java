package org.apache.commons.math3.util;

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
        int[] intArray5 = new int[] { (short) -1, '#', '4', (byte) 0, (short) 10 };
        int[] intArray7 = org.apache.commons.math3.util.MathArrays.copyOf(intArray5, (int) ' ');
        int[] intArray8 = org.apache.commons.math3.util.MathArrays.copyOf(intArray5);
        int[] intArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray5, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 35, 52, 0, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 35, 52, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 35, 52, 0, 10]");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray8 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double9 = org.apache.commons.math3.util.MathArrays.distance(doubleArray1, doubleArray8);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) 'a', doubleArray8);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray21 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double22 = org.apache.commons.math3.util.MathArrays.distance(doubleArray14, doubleArray21);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray14);
        double[] doubleArray24 = org.apache.commons.math3.util.MathArrays.scale((double) (byte) 100, doubleArray14);
        double[] doubleArray25 = org.apache.commons.math3.util.MathArrays.scale(14800.0d, doubleArray24);
        double[] doubleArray30 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray31 = new double[] {};
        double[] doubleArray38 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double39 = org.apache.commons.math3.util.MathArrays.distance(doubleArray31, doubleArray38);
        double[] doubleArray44 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double45 = org.apache.commons.math3.util.MathArrays.distance(doubleArray31, doubleArray44);
        double[] doubleArray46 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray30, doubleArray44);
        double double47 = org.apache.commons.math3.util.MathArrays.distance1(doubleArray25, doubleArray46);
        boolean boolean48 = org.apache.commons.math3.util.MathArrays.equals(doubleArray8, doubleArray46);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-97.0, 97.0, 5044.0, 970.0, 9700.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        org.apache.commons.math3.exception.util.Localizable localizable2 = null;
        org.apache.commons.math3.exception.util.Localizable localizable3 = null;
        org.apache.commons.math3.exception.util.Localizable localizable4 = null;
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        long[][] longArray7 = new long[][] { longArray5, longArray6 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray7);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray7);
        org.apache.commons.math3.util.MathArrays.checkRectangular(longArray7);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException11 = new org.apache.commons.math3.exception.MathIllegalArgumentException(localizable4, (java.lang.Object[]) longArray7);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray7);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray7);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException14 = new org.apache.commons.math3.exception.MathIllegalStateException(localizable3, (java.lang.Object[]) longArray7);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException15 = new org.apache.commons.math3.exception.MathIllegalStateException(localizable2, (java.lang.Object[]) longArray7);
        org.apache.commons.math3.exception.MathInternalError mathInternalError16 = new org.apache.commons.math3.exception.MathInternalError(localizable1, (java.lang.Object[]) longArray7);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException17 = new org.apache.commons.math3.exception.MathIllegalStateException(localizable0, (java.lang.Object[]) longArray7);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray7);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        double[] doubleArray4 = new double[] {};
        double[] doubleArray11 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double12 = org.apache.commons.math3.util.MathArrays.distance(doubleArray4, doubleArray11);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray4);
        double[] doubleArray14 = org.apache.commons.math3.util.MathArrays.scale((double) (byte) 100, doubleArray4);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) 1L, doubleArray14);
        double[] doubleArray22 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray23 = new double[] {};
        double[] doubleArray30 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double31 = org.apache.commons.math3.util.MathArrays.distance(doubleArray23, doubleArray30);
        double[] doubleArray36 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double37 = org.apache.commons.math3.util.MathArrays.distance(doubleArray23, doubleArray36);
        double[] doubleArray38 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray22, doubleArray36);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray46 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double47 = org.apache.commons.math3.util.MathArrays.distance(doubleArray39, doubleArray46);
        double[] doubleArray52 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double53 = org.apache.commons.math3.util.MathArrays.distance(doubleArray39, doubleArray52);
        double[] doubleArray58 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray59 = new double[] {};
        double[] doubleArray66 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double67 = org.apache.commons.math3.util.MathArrays.distance(doubleArray59, doubleArray66);
        double[] doubleArray72 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double73 = org.apache.commons.math3.util.MathArrays.distance(doubleArray59, doubleArray72);
        double[] doubleArray74 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray58, doubleArray72);
        double[] doubleArray75 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray52, doubleArray74);
        double double76 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray36, doubleArray74);
        double[] doubleArray77 = org.apache.commons.math3.util.MathArrays.scale((double) (byte) 1, doubleArray36);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException81 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection82 = nonMonotonicSequenceException81.getDirection();
        boolean boolean85 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray36, orderDirection82, true, false);
        double[] doubleArray86 = org.apache.commons.math3.util.MathArrays.scale(4425.0d, doubleArray36);
        boolean boolean87 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray14, doubleArray36);
        org.apache.commons.math3.util.MathArrays.scaleInPlace(0.0d, doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 20.0d + "'", double76 == 20.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + orderDirection82 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection82.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[442500.0, 1.54875E7, 4425.0, 44250.0]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        double double4 = org.apache.commons.math3.util.MathArrays.linearCombination(16213.0d, 1.605952477731202E48d, 4.8113914083447153E18d, 3.6980755448772024E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.6037307521455976E52d + "'", double4 == 2.6037307521455976E52d);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        long[][] longArray4 = new long[][] { longArray2, longArray3 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray4);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray4);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException7 = new org.apache.commons.math3.exception.NullArgumentException(localizable1, (java.lang.Object[]) longArray4);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException8 = new org.apache.commons.math3.exception.MathIllegalStateException(localizable0, (java.lang.Object[]) longArray4);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext9 = mathIllegalStateException8.getContext();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext10 = mathIllegalStateException8.getContext();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertNotNull(exceptionContext9);
        org.junit.Assert.assertNotNull(exceptionContext10);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        float[] floatArray0 = null;
        float[] floatArray3 = new float[] { 10L, 10 };
        float[] floatArray4 = new float[] {};
        boolean boolean5 = org.apache.commons.math3.util.MathArrays.equals(floatArray3, floatArray4);
        float[] floatArray8 = new float[] { 10L, 10 };
        float[] floatArray9 = new float[] {};
        boolean boolean10 = org.apache.commons.math3.util.MathArrays.equals(floatArray8, floatArray9);
        boolean boolean11 = org.apache.commons.math3.util.MathArrays.equals(floatArray3, floatArray9);
        boolean boolean12 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray9);
        float[] floatArray15 = new float[] { 10L, 10 };
        float[] floatArray16 = new float[] {};
        boolean boolean17 = org.apache.commons.math3.util.MathArrays.equals(floatArray15, floatArray16);
        float[] floatArray20 = new float[] { 10L, 10 };
        float[] floatArray21 = new float[] {};
        boolean boolean22 = org.apache.commons.math3.util.MathArrays.equals(floatArray20, floatArray21);
        boolean boolean23 = org.apache.commons.math3.util.MathArrays.equals(floatArray15, floatArray21);
        float[] floatArray29 = new float[] { 0L, (short) 10, 'a', 'a', (byte) 0 };
        float[] floatArray36 = new float[] { 0, 0.0f, (byte) 0, (-1.0f), 1, (-1) };
        boolean boolean37 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray29, floatArray36);
        boolean boolean38 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray21, floatArray29);
        boolean boolean39 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray29);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[0.0, 10.0, 97.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0, 0.0, 0.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray8 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double9 = org.apache.commons.math3.util.MathArrays.distance(doubleArray1, doubleArray8);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray1);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray1);
        double[] doubleArray12 = org.apache.commons.math3.util.MathArrays.scale(149850.0d, doubleArray1);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray20 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double21 = org.apache.commons.math3.util.MathArrays.distance(doubleArray13, doubleArray20);
        double[] doubleArray26 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double27 = org.apache.commons.math3.util.MathArrays.distance(doubleArray13, doubleArray26);
        double[] doubleArray32 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray33 = new double[] {};
        double[] doubleArray40 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double41 = org.apache.commons.math3.util.MathArrays.distance(doubleArray33, doubleArray40);
        double[] doubleArray46 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double47 = org.apache.commons.math3.util.MathArrays.distance(doubleArray33, doubleArray46);
        double[] doubleArray48 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray32, doubleArray46);
        double[] doubleArray49 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray26, doubleArray48);
        double[] doubleArray51 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray26, 1);
        double[] doubleArray52 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray51);
        double[] doubleArray53 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray51);
        boolean boolean54 = org.apache.commons.math3.util.MathArrays.equals(doubleArray12, doubleArray53);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        long[][] longArray3 = new long[][] { longArray1, longArray2 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray3);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException5 = new org.apache.commons.math3.exception.NullArgumentException(localizable0, (java.lang.Object[]) longArray3);
        org.apache.commons.math3.util.MathArrays.checkRectangular(longArray3);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        int[] intArray5 = new int[] { (short) -1, '#', '4', (byte) 0, (short) 10 };
        int[] intArray7 = org.apache.commons.math3.util.MathArrays.copyOf(intArray5, (int) ' ');
        int[] intArray8 = org.apache.commons.math3.util.MathArrays.copyOf(intArray5);
        int[] intArray9 = new int[] {};
        int[] intArray11 = org.apache.commons.math3.util.MathArrays.copyOf(intArray9, (int) (byte) 10);
        int[] intArray12 = new int[] {};
        int[] intArray14 = org.apache.commons.math3.util.MathArrays.copyOf(intArray12, (int) (byte) 10);
        double double15 = org.apache.commons.math3.util.MathArrays.distance(intArray9, intArray14);
        int[] intArray16 = org.apache.commons.math3.util.MathArrays.copyOf(intArray9);
        int[] intArray18 = org.apache.commons.math3.util.MathArrays.copyOf(intArray9, (int) (short) 0);
        int[] intArray20 = org.apache.commons.math3.util.MathArrays.copyOf(intArray18, (int) (byte) 0);
        int[] intArray21 = new int[] {};
        int[] intArray23 = org.apache.commons.math3.util.MathArrays.copyOf(intArray21, (int) (byte) 10);
        int[] intArray24 = new int[] {};
        int[] intArray26 = org.apache.commons.math3.util.MathArrays.copyOf(intArray24, (int) (byte) 10);
        double double27 = org.apache.commons.math3.util.MathArrays.distance(intArray21, intArray26);
        int[] intArray28 = org.apache.commons.math3.util.MathArrays.copyOf(intArray21);
        int[] intArray30 = org.apache.commons.math3.util.MathArrays.copyOf(intArray21, (int) (short) 0);
        int[] intArray32 = org.apache.commons.math3.util.MathArrays.copyOf(intArray30, (int) (byte) 0);
        int[] intArray33 = new int[] {};
        int[] intArray35 = org.apache.commons.math3.util.MathArrays.copyOf(intArray33, (int) (byte) 10);
        int[] intArray36 = new int[] {};
        int[] intArray38 = org.apache.commons.math3.util.MathArrays.copyOf(intArray36, (int) (byte) 10);
        double double39 = org.apache.commons.math3.util.MathArrays.distance(intArray33, intArray38);
        int int40 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray32, intArray38);
        int[] intArray41 = new int[] {};
        int[] intArray43 = org.apache.commons.math3.util.MathArrays.copyOf(intArray41, (int) (byte) 10);
        int[] intArray44 = new int[] {};
        int[] intArray46 = org.apache.commons.math3.util.MathArrays.copyOf(intArray44, (int) (byte) 10);
        int int47 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray41, intArray44);
        int[] intArray52 = new int[] { '4', (byte) 0, (short) 10, '#' };
        double double53 = org.apache.commons.math3.util.MathArrays.distance(intArray41, intArray52);
        int int54 = org.apache.commons.math3.util.MathArrays.distance1(intArray32, intArray52);
        int[] intArray55 = org.apache.commons.math3.util.MathArrays.copyOf(intArray32);
        int int56 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray18, intArray32);
        int[] intArray57 = new int[] {};
        int[] intArray59 = org.apache.commons.math3.util.MathArrays.copyOf(intArray57, (int) (byte) 10);
        int[] intArray60 = new int[] {};
        int[] intArray62 = org.apache.commons.math3.util.MathArrays.copyOf(intArray60, (int) (byte) 10);
        int int63 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray57, intArray60);
        int[] intArray68 = new int[] { '4', (byte) 0, (short) 10, '#' };
        double double69 = org.apache.commons.math3.util.MathArrays.distance(intArray57, intArray68);
        int[] intArray70 = org.apache.commons.math3.util.MathArrays.copyOf(intArray57);
        int[] intArray71 = org.apache.commons.math3.util.MathArrays.copyOf(intArray57);
        int[] intArray73 = org.apache.commons.math3.util.MathArrays.copyOf(intArray71, (int) '#');
        int int74 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray18, intArray73);
        int[] intArray75 = new int[] {};
        int[] intArray77 = org.apache.commons.math3.util.MathArrays.copyOf(intArray75, (int) (byte) 10);
        int[] intArray78 = new int[] {};
        int[] intArray80 = org.apache.commons.math3.util.MathArrays.copyOf(intArray78, (int) (byte) 10);
        double double81 = org.apache.commons.math3.util.MathArrays.distance(intArray75, intArray80);
        int[] intArray82 = org.apache.commons.math3.util.MathArrays.copyOf(intArray75);
        int[] intArray83 = org.apache.commons.math3.util.MathArrays.copyOf(intArray75);
        int int84 = org.apache.commons.math3.util.MathArrays.distance1(intArray18, intArray75);
        // The following exception was thrown during execution in test generation
        try {
            int int85 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray8, intArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 35, 52, 0, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 35, 52, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 35, 52, 0, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[52, 0, 10, 35]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[52, 0, 10, 35]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        double double6 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0d, 14800.0d, 2.965179423548113E10d, (double) (byte) -1, 1.3203316445911565E34d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.3203316445911565E34d + "'", double6 == 1.3203316445911565E34d);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        double[] doubleArray7 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray8 = new double[] {};
        double[] doubleArray15 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double16 = org.apache.commons.math3.util.MathArrays.distance(doubleArray8, doubleArray15);
        double[] doubleArray21 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double22 = org.apache.commons.math3.util.MathArrays.distance(doubleArray8, doubleArray21);
        double[] doubleArray23 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray7, doubleArray21);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException27 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection28 = nonMonotonicSequenceException27.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException32 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection33 = nonMonotonicSequenceException32.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException37 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection38 = nonMonotonicSequenceException37.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException42 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection43 = nonMonotonicSequenceException42.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException47 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection48 = nonMonotonicSequenceException47.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException52 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection53 = nonMonotonicSequenceException52.getDirection();
        org.apache.commons.math3.util.MathArrays.OrderDirection[] orderDirectionArray54 = new org.apache.commons.math3.util.MathArrays.OrderDirection[] { orderDirection28, orderDirection33, orderDirection38, orderDirection43, orderDirection48, orderDirection53 };
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException58 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection59 = nonMonotonicSequenceException58.getDirection();
        boolean boolean61 = org.apache.commons.math3.util.MathArrays.isMonotonic(orderDirectionArray54, orderDirection59, false);
        boolean boolean63 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray7, orderDirection59, false);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException65 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) 1.0d, (java.lang.Number) (short) 100, (int) 'a', orderDirection59, true);
        boolean boolean66 = nonMonotonicSequenceException65.getStrict();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + orderDirection28 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection28.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection33 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection33.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection38 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection38.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection43 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection43.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection48 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection48.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection53 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection53.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertNotNull(orderDirectionArray54);
        org.junit.Assert.assertTrue("'" + orderDirection59 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection59.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        double double4 = org.apache.commons.math3.util.MathArrays.linearCombination(6.826219102172153E19d, 2.924431183474548E9d, 1.088956904358433E7d, (double) 32);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.9962808007621872E29d + "'", double4 == 1.9962808007621872E29d);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] {};
        double[] doubleArray10 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double11 = org.apache.commons.math3.util.MathArrays.distance(doubleArray3, doubleArray10);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray3);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray21 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double22 = org.apache.commons.math3.util.MathArrays.distance(doubleArray14, doubleArray21);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray14);
        double[] doubleArray24 = org.apache.commons.math3.util.MathArrays.ebeSubtract(doubleArray3, doubleArray14);
        double[] doubleArray25 = org.apache.commons.math3.util.MathArrays.scale((double) (short) -1, doubleArray24);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = org.apache.commons.math3.util.MathArrays.distance1(doubleArray0, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double8 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray7);
        double[] doubleArray13 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double14 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray13);
        double[] doubleArray19 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray20 = new double[] {};
        double[] doubleArray27 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double28 = org.apache.commons.math3.util.MathArrays.distance(doubleArray20, doubleArray27);
        double[] doubleArray33 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double34 = org.apache.commons.math3.util.MathArrays.distance(doubleArray20, doubleArray33);
        double[] doubleArray35 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray19, doubleArray33);
        double[] doubleArray36 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray13, doubleArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "org.apache.commons.math3.exception.NonMonotonicSequenceException: points 34 and 35 are not strictly increasing (-1 >= 0)", "" };
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection40 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean42 = org.apache.commons.math3.util.MathArrays.isMonotonic(strArray39, orderDirection40, true);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException46 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        int int47 = nonMonotonicSequenceException46.getIndex();
        java.lang.Number number48 = nonMonotonicSequenceException46.getPrevious();
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection49 = nonMonotonicSequenceException46.getDirection();
        boolean boolean51 = org.apache.commons.math3.util.MathArrays.isMonotonic(strArray39, orderDirection49, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray36, orderDirection49, true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NonMonotonicSequenceException; message: points 1 and 2 are not strictly increasing (3,500 >= 2)");
        } catch (org.apache.commons.math3.exception.NonMonotonicSequenceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + orderDirection40 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING + "'", orderDirection40.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertEquals("'" + number48 + "' != '" + (short) -1 + "'", number48, (short) -1);
        org.junit.Assert.assertTrue("'" + orderDirection49 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection49.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        double double8 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0d, (-3.673176480644944E16d), 1.18878636E9d, 1.254596E9d, (double) (byte) 10, 180469.0d, 0.0d, 2.368107225096932E68d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.4914466121123648E18d + "'", double8 == 1.4914466121123648E18d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        double[] doubleArray3 = new double[] { (byte) 0, 1630.0d, (-1.0f) };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray11 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double12 = org.apache.commons.math3.util.MathArrays.distance(doubleArray4, doubleArray11);
        double[] doubleArray17 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double18 = org.apache.commons.math3.util.MathArrays.distance(doubleArray4, doubleArray17);
        double[] doubleArray23 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray24 = new double[] {};
        double[] doubleArray31 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double32 = org.apache.commons.math3.util.MathArrays.distance(doubleArray24, doubleArray31);
        double[] doubleArray37 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double38 = org.apache.commons.math3.util.MathArrays.distance(doubleArray24, doubleArray37);
        double[] doubleArray39 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray23, doubleArray37);
        double[] doubleArray40 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray17, doubleArray39);
        double[] doubleArray41 = org.apache.commons.math3.util.MathArrays.convolve(doubleArray3, doubleArray39);
        double[] doubleArray43 = new double[] {};
        double[] doubleArray50 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double51 = org.apache.commons.math3.util.MathArrays.distance(doubleArray43, doubleArray50);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray43);
        double[] doubleArray54 = new double[] {};
        double[] doubleArray61 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double62 = org.apache.commons.math3.util.MathArrays.distance(doubleArray54, doubleArray61);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray54);
        double[] doubleArray64 = org.apache.commons.math3.util.MathArrays.ebeSubtract(doubleArray43, doubleArray54);
        boolean boolean65 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray3, doubleArray54);
        double double66 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray54);
        double[] doubleArray67 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray54);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1630.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 163.0, -0.5657142857142857, 1630.0002857142856, 1629.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray9 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double10 = org.apache.commons.math3.util.MathArrays.distance(doubleArray2, doubleArray9);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray2);
        double[] doubleArray13 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray2, 0);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray21 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double22 = org.apache.commons.math3.util.MathArrays.distance(doubleArray14, doubleArray21);
        double[] doubleArray27 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double28 = org.apache.commons.math3.util.MathArrays.distance(doubleArray14, doubleArray27);
        double[] doubleArray29 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray2, doubleArray14);
        double[] doubleArray31 = new double[] {};
        double[] doubleArray38 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double39 = org.apache.commons.math3.util.MathArrays.distance(doubleArray31, doubleArray38);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray31);
        double[] doubleArray42 = new double[] {};
        double[] doubleArray49 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double50 = org.apache.commons.math3.util.MathArrays.distance(doubleArray42, doubleArray49);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray42);
        double[] doubleArray52 = org.apache.commons.math3.util.MathArrays.ebeSubtract(doubleArray31, doubleArray42);
        double double53 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray52);
        double double54 = org.apache.commons.math3.util.MathArrays.distance1(doubleArray14, doubleArray52);
        double[] doubleArray55 = org.apache.commons.math3.util.MathArrays.scale(3.3959797E9d, doubleArray52);
        double[] doubleArray57 = new double[] {};
        double[] doubleArray64 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double65 = org.apache.commons.math3.util.MathArrays.distance(doubleArray57, doubleArray64);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray57);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray57);
        double[] doubleArray68 = org.apache.commons.math3.util.MathArrays.scale(149850.0d, doubleArray57);
        double[] doubleArray69 = org.apache.commons.math3.util.MathArrays.ebeSubtract(doubleArray52, doubleArray57);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double8 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray7);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray0);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray0);
        double[] doubleArray12 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0, (int) ' ');
        double[] doubleArray18 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray19 = new double[] {};
        double[] doubleArray26 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double27 = org.apache.commons.math3.util.MathArrays.distance(doubleArray19, doubleArray26);
        double[] doubleArray32 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double33 = org.apache.commons.math3.util.MathArrays.distance(doubleArray19, doubleArray32);
        double[] doubleArray34 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray18, doubleArray32);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray42 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double43 = org.apache.commons.math3.util.MathArrays.distance(doubleArray35, doubleArray42);
        double[] doubleArray48 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double49 = org.apache.commons.math3.util.MathArrays.distance(doubleArray35, doubleArray48);
        double[] doubleArray54 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray55 = new double[] {};
        double[] doubleArray62 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double63 = org.apache.commons.math3.util.MathArrays.distance(doubleArray55, doubleArray62);
        double[] doubleArray68 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double69 = org.apache.commons.math3.util.MathArrays.distance(doubleArray55, doubleArray68);
        double[] doubleArray70 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray54, doubleArray68);
        double[] doubleArray71 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray48, doubleArray70);
        double double72 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray32, doubleArray70);
        double[] doubleArray73 = org.apache.commons.math3.util.MathArrays.scale((double) (byte) 1, doubleArray32);
        double double74 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray73);
        java.lang.Class<?> wildcardClass75 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 20.0d + "'", double72 == 20.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray8 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double9 = org.apache.commons.math3.util.MathArrays.distance(doubleArray1, doubleArray8);
        double[] doubleArray10 = org.apache.commons.math3.util.MathArrays.scale((double) 100.0f, doubleArray1);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray20 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double21 = org.apache.commons.math3.util.MathArrays.distance(doubleArray13, doubleArray20);
        double[] doubleArray22 = org.apache.commons.math3.util.MathArrays.scale((double) 100.0f, doubleArray13);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray13);
        double[] doubleArray24 = org.apache.commons.math3.util.MathArrays.scale((-8477003.0d), doubleArray13);
        double[] doubleArray25 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray10, doubleArray24);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray34 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double35 = org.apache.commons.math3.util.MathArrays.distance(doubleArray27, doubleArray34);
        double[] doubleArray40 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double41 = org.apache.commons.math3.util.MathArrays.distance(doubleArray27, doubleArray40);
        double[] doubleArray46 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray47 = new double[] {};
        double[] doubleArray54 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double55 = org.apache.commons.math3.util.MathArrays.distance(doubleArray47, doubleArray54);
        double[] doubleArray60 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double61 = org.apache.commons.math3.util.MathArrays.distance(doubleArray47, doubleArray60);
        double[] doubleArray62 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray46, doubleArray60);
        double[] doubleArray63 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray40, doubleArray62);
        double[] doubleArray64 = org.apache.commons.math3.util.MathArrays.scale((double) '4', doubleArray40);
        double[] doubleArray65 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray40);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray66 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray25, doubleArray40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 0 != 4");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[5200.0, 182000.0, 52.0, 520.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.0, 3500.0, 1.0, 10.0]");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        double[] doubleArray3 = new double[] { (byte) 0, 1630.0d, (-1.0f) };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray11 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double12 = org.apache.commons.math3.util.MathArrays.distance(doubleArray4, doubleArray11);
        double[] doubleArray17 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double18 = org.apache.commons.math3.util.MathArrays.distance(doubleArray4, doubleArray17);
        double[] doubleArray23 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray24 = new double[] {};
        double[] doubleArray31 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double32 = org.apache.commons.math3.util.MathArrays.distance(doubleArray24, doubleArray31);
        double[] doubleArray37 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double38 = org.apache.commons.math3.util.MathArrays.distance(doubleArray24, doubleArray37);
        double[] doubleArray39 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray23, doubleArray37);
        double[] doubleArray40 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray17, doubleArray39);
        double[] doubleArray41 = org.apache.commons.math3.util.MathArrays.convolve(doubleArray3, doubleArray39);
        double[] doubleArray42 = null;
        double[] doubleArray44 = new double[] {};
        double[] doubleArray51 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double52 = org.apache.commons.math3.util.MathArrays.distance(doubleArray44, doubleArray51);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray44);
        double[] doubleArray55 = new double[] {};
        double[] doubleArray62 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double63 = org.apache.commons.math3.util.MathArrays.distance(doubleArray55, doubleArray62);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray55);
        double[] doubleArray65 = org.apache.commons.math3.util.MathArrays.ebeSubtract(doubleArray44, doubleArray55);
        boolean boolean66 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray42, doubleArray44);
        double[] doubleArray68 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray44, 0);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray68);
        boolean boolean70 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray3, doubleArray68);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray72 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray68, (-1.5391999E7d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1630.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 163.0, -0.5657142857142857, 1630.0002857142856, 1629.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        long[][] longArray4 = new long[][] { longArray2, longArray3 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray4);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray4);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException7 = new org.apache.commons.math3.exception.MathIllegalStateException(throwable0, localizable1, (java.lang.Object[]) longArray4);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray4);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, (int) (byte) 10);
        int[] intArray3 = new int[] {};
        int[] intArray5 = org.apache.commons.math3.util.MathArrays.copyOf(intArray3, (int) (byte) 10);
        double double6 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray5);
        int[] intArray7 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        int[] intArray9 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, (int) (short) 0);
        int[] intArray10 = new int[] {};
        int[] intArray12 = org.apache.commons.math3.util.MathArrays.copyOf(intArray10, (int) (byte) 10);
        int[] intArray13 = new int[] {};
        int[] intArray15 = org.apache.commons.math3.util.MathArrays.copyOf(intArray13, (int) (byte) 10);
        int int16 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray10, intArray13);
        int[] intArray21 = new int[] { '4', (byte) 0, (short) 10, '#' };
        double double22 = org.apache.commons.math3.util.MathArrays.distance(intArray10, intArray21);
        int[] intArray23 = org.apache.commons.math3.util.MathArrays.copyOf(intArray10);
        double double24 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray23);
        int[] intArray26 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, 100);
        java.lang.Class<?> wildcardClass27 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[52, 0, 10, 35]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        org.apache.commons.math3.exception.util.Localizable localizable2 = null;
        org.apache.commons.math3.exception.util.Localizable localizable3 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        long[][] longArray6 = new long[][] { longArray4, longArray5 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray6);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException8 = new org.apache.commons.math3.exception.NullArgumentException(localizable3, (java.lang.Object[]) longArray6);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException9 = new org.apache.commons.math3.exception.NullArgumentException(localizable2, (java.lang.Object[]) longArray6);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException10 = new org.apache.commons.math3.exception.MathIllegalArgumentException(localizable1, (java.lang.Object[]) longArray6);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray6);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException12 = new org.apache.commons.math3.exception.MathIllegalArgumentException(localizable0, (java.lang.Object[]) longArray6);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray6);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, (int) (byte) 10);
        int[] intArray3 = new int[] {};
        int[] intArray5 = org.apache.commons.math3.util.MathArrays.copyOf(intArray3, (int) (byte) 10);
        double double6 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray5);
        int[] intArray7 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        int[] intArray8 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        int[] intArray9 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        int[] intArray10 = new int[] {};
        int[] intArray12 = org.apache.commons.math3.util.MathArrays.copyOf(intArray10, (int) (byte) 10);
        int[] intArray13 = new int[] {};
        int[] intArray15 = org.apache.commons.math3.util.MathArrays.copyOf(intArray13, (int) (byte) 10);
        double double16 = org.apache.commons.math3.util.MathArrays.distance(intArray10, intArray15);
        int[] intArray17 = org.apache.commons.math3.util.MathArrays.copyOf(intArray15);
        double double18 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray15);
        int[] intArray19 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        double[] doubleArray8 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray9 = new double[] {};
        double[] doubleArray16 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double17 = org.apache.commons.math3.util.MathArrays.distance(doubleArray9, doubleArray16);
        double[] doubleArray22 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double23 = org.apache.commons.math3.util.MathArrays.distance(doubleArray9, doubleArray22);
        double[] doubleArray24 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray8, doubleArray22);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray32 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double33 = org.apache.commons.math3.util.MathArrays.distance(doubleArray25, doubleArray32);
        double[] doubleArray38 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double39 = org.apache.commons.math3.util.MathArrays.distance(doubleArray25, doubleArray38);
        double[] doubleArray44 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray45 = new double[] {};
        double[] doubleArray52 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double53 = org.apache.commons.math3.util.MathArrays.distance(doubleArray45, doubleArray52);
        double[] doubleArray58 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double59 = org.apache.commons.math3.util.MathArrays.distance(doubleArray45, doubleArray58);
        double[] doubleArray60 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray44, doubleArray58);
        double[] doubleArray61 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray38, doubleArray60);
        double double62 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray22, doubleArray60);
        double[] doubleArray63 = org.apache.commons.math3.util.MathArrays.scale((double) (byte) 1, doubleArray22);
        double[] doubleArray65 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray22, 35);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1.0f), doubleArray22);
        double[] doubleArray67 = org.apache.commons.math3.util.MathArrays.scale((double) (short) 10, doubleArray22);
        org.apache.commons.math3.util.MathArrays.scaleInPlace(1695390.0d, doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.69539E8, -5.933865E9, -1695390.0, -1.69539E7]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 20.0d + "'", double62 == 20.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.0, 3500.0, 1.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1000.0, -35000.0, -10.0, -100.0]");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, (int) (byte) 10);
        int[] intArray3 = new int[] {};
        int[] intArray5 = org.apache.commons.math3.util.MathArrays.copyOf(intArray3, (int) (byte) 10);
        double double6 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray5);
        int[] intArray7 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        int[] intArray9 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, (int) (short) 0);
        int[] intArray11 = org.apache.commons.math3.util.MathArrays.copyOf(intArray9, (int) (byte) 0);
        int[] intArray12 = new int[] {};
        int[] intArray14 = org.apache.commons.math3.util.MathArrays.copyOf(intArray12, (int) (byte) 10);
        int int15 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray9, intArray12);
        int[] intArray17 = org.apache.commons.math3.util.MathArrays.copyOf(intArray12, 0);
        int[] intArray18 = new int[] {};
        int[] intArray20 = org.apache.commons.math3.util.MathArrays.copyOf(intArray18, (int) (byte) 10);
        int[] intArray21 = new int[] {};
        int[] intArray23 = org.apache.commons.math3.util.MathArrays.copyOf(intArray21, (int) (byte) 10);
        double double24 = org.apache.commons.math3.util.MathArrays.distance(intArray18, intArray23);
        int[] intArray25 = org.apache.commons.math3.util.MathArrays.copyOf(intArray18);
        int[] intArray26 = org.apache.commons.math3.util.MathArrays.copyOf(intArray18);
        int[] intArray27 = org.apache.commons.math3.util.MathArrays.copyOf(intArray18);
        int[] intArray28 = new int[] {};
        int[] intArray30 = org.apache.commons.math3.util.MathArrays.copyOf(intArray28, (int) (byte) 10);
        int[] intArray31 = new int[] {};
        int[] intArray33 = org.apache.commons.math3.util.MathArrays.copyOf(intArray31, (int) (byte) 10);
        double double34 = org.apache.commons.math3.util.MathArrays.distance(intArray28, intArray33);
        int[] intArray35 = org.apache.commons.math3.util.MathArrays.copyOf(intArray33);
        double double36 = org.apache.commons.math3.util.MathArrays.distance(intArray18, intArray33);
        int[] intArray37 = org.apache.commons.math3.util.MathArrays.copyOf(intArray18);
        int int38 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray12, intArray37);
        int[] intArray39 = new int[] {};
        int[] intArray41 = org.apache.commons.math3.util.MathArrays.copyOf(intArray39, (int) (byte) 10);
        int[] intArray42 = new int[] {};
        int[] intArray44 = org.apache.commons.math3.util.MathArrays.copyOf(intArray42, (int) (byte) 10);
        int int45 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray39, intArray42);
        int[] intArray50 = new int[] { '4', (byte) 0, (short) 10, '#' };
        double double51 = org.apache.commons.math3.util.MathArrays.distance(intArray39, intArray50);
        int[] intArray52 = org.apache.commons.math3.util.MathArrays.copyOf(intArray39);
        int[] intArray53 = org.apache.commons.math3.util.MathArrays.copyOf(intArray39);
        int[] intArray55 = org.apache.commons.math3.util.MathArrays.copyOf(intArray53, (int) '#');
        int int56 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray37, intArray55);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[52, 0, 10, 35]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }
}

