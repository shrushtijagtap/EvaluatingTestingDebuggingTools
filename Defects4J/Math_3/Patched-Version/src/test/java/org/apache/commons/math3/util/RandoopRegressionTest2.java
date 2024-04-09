package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1001");
        double[] doubleArray3 = new double[] {};
        double[] doubleArray10 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double11 = org.apache.commons.math3.util.MathArrays.distance(doubleArray3, doubleArray10);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray3);
        double[] doubleArray14 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray3, 0);
        org.apache.commons.math3.util.MathArrays.scaleInPlace(97.0d, doubleArray3);
        org.apache.commons.math3.util.MathArrays.scaleInPlace(0.0d, doubleArray3);
        double[] doubleArray17 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray3);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray25 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double26 = org.apache.commons.math3.util.MathArrays.distance(doubleArray18, doubleArray25);
        double double27 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray18);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray18);
        double[] doubleArray29 = new double[] {};
        double[] doubleArray36 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double37 = org.apache.commons.math3.util.MathArrays.distance(doubleArray29, doubleArray36);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray29);
        double[] doubleArray39 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray18, doubleArray29);
        boolean boolean40 = org.apache.commons.math3.util.MathArrays.equals(doubleArray3, doubleArray18);
        java.lang.Number number45 = null;
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException47 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) 35924.35148398954d, number45, 0);
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection48 = nonMonotonicSequenceException47.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException50 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) 2.479067448128025E14d, (java.lang.Number) 350144.2702658434d, (int) '#', orderDirection48, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray3, orderDirection48, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + orderDirection48 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection48.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1002");
        double[] doubleArray4 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray12 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double13 = org.apache.commons.math3.util.MathArrays.distance(doubleArray5, doubleArray12);
        double[] doubleArray18 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double19 = org.apache.commons.math3.util.MathArrays.distance(doubleArray5, doubleArray18);
        double[] doubleArray20 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray4, doubleArray18);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray31 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double32 = org.apache.commons.math3.util.MathArrays.distance(doubleArray24, doubleArray31);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray24);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray42 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double43 = org.apache.commons.math3.util.MathArrays.distance(doubleArray35, doubleArray42);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray35);
        double[] doubleArray45 = org.apache.commons.math3.util.MathArrays.ebeSubtract(doubleArray24, doubleArray35);
        double[] doubleArray46 = org.apache.commons.math3.util.MathArrays.scale(350101.0d, doubleArray45);
        double[] doubleArray47 = org.apache.commons.math3.util.MathArrays.scale(3.6980755448772024E16d, doubleArray45);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = org.apache.commons.math3.util.MathArrays.convolve(doubleArray18, doubleArray45);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math3.exception.NoDataException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1003");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray9 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double10 = org.apache.commons.math3.util.MathArrays.distance(doubleArray2, doubleArray9);
        double[] doubleArray15 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double16 = org.apache.commons.math3.util.MathArrays.distance(doubleArray2, doubleArray15);
        double[] doubleArray21 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray22 = new double[] {};
        double[] doubleArray29 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double30 = org.apache.commons.math3.util.MathArrays.distance(doubleArray22, doubleArray29);
        double[] doubleArray35 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double36 = org.apache.commons.math3.util.MathArrays.distance(doubleArray22, doubleArray35);
        double[] doubleArray37 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray21, doubleArray35);
        double[] doubleArray38 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray15, doubleArray37);
        double[] doubleArray39 = org.apache.commons.math3.util.MathArrays.scale((double) '4', doubleArray15);
        double[] doubleArray40 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray39);
        double[] doubleArray41 = org.apache.commons.math3.util.MathArrays.scale(0.0d, doubleArray40);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException45 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 10, (java.lang.Number) 10, (-1));
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection46 = nonMonotonicSequenceException45.getDirection();
        boolean boolean49 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray41, orderDirection46, true, false);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[5200.0, 182000.0, 52.0, 520.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[5200.0, 182000.0, 52.0, 520.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + orderDirection46 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection46.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1004");
        double[] doubleArray4 = new double[] { (byte) 0, 1630.0d, (-1.0f) };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray12 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double13 = org.apache.commons.math3.util.MathArrays.distance(doubleArray5, doubleArray12);
        double[] doubleArray18 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double19 = org.apache.commons.math3.util.MathArrays.distance(doubleArray5, doubleArray18);
        double[] doubleArray24 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray25 = new double[] {};
        double[] doubleArray32 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double33 = org.apache.commons.math3.util.MathArrays.distance(doubleArray25, doubleArray32);
        double[] doubleArray38 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double39 = org.apache.commons.math3.util.MathArrays.distance(doubleArray25, doubleArray38);
        double[] doubleArray40 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray24, doubleArray38);
        double[] doubleArray41 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray18, doubleArray40);
        double[] doubleArray42 = org.apache.commons.math3.util.MathArrays.convolve(doubleArray4, doubleArray40);
        double[] doubleArray43 = null;
        double[] doubleArray45 = new double[] {};
        double[] doubleArray52 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double53 = org.apache.commons.math3.util.MathArrays.distance(doubleArray45, doubleArray52);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray45);
        double[] doubleArray56 = new double[] {};
        double[] doubleArray63 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double64 = org.apache.commons.math3.util.MathArrays.distance(doubleArray56, doubleArray63);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray56);
        double[] doubleArray66 = org.apache.commons.math3.util.MathArrays.ebeSubtract(doubleArray45, doubleArray56);
        boolean boolean67 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray43, doubleArray45);
        double[] doubleArray69 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray45, 0);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray69);
        boolean boolean71 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray4, doubleArray69);
        double[] doubleArray73 = new double[] {};
        double[] doubleArray80 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double81 = org.apache.commons.math3.util.MathArrays.distance(doubleArray73, doubleArray80);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray73);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) 0.0f, doubleArray73);
        double[] doubleArray84 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray73);
        boolean boolean85 = org.apache.commons.math3.util.MathArrays.equals(doubleArray4, doubleArray73);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((-4.485245857677034E7d), doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-0.0, -7.310950748013567E10, 4.485245857677034E7]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 163.0, -0.5657142857142857, 1630.0002857142856, 1629.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1005");
        double[] doubleArray5 = new double[] { (short) 100, 8730.0d, 1630.0d, (-1.0d), 3500.0d };
        double[] doubleArray7 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray5, (int) (byte) 1);
        double[] doubleArray8 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray7);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray17 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double18 = org.apache.commons.math3.util.MathArrays.distance(doubleArray10, doubleArray17);
        double[] doubleArray19 = org.apache.commons.math3.util.MathArrays.scale((double) 100.0f, doubleArray10);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray10);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray10);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray31 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double32 = org.apache.commons.math3.util.MathArrays.distance(doubleArray24, doubleArray31);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray24);
        double[] doubleArray35 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray24, 0);
        double[] doubleArray36 = org.apache.commons.math3.util.MathArrays.scale(1.0d, doubleArray24);
        double double37 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray36);
        boolean boolean38 = org.apache.commons.math3.util.MathArrays.equals(doubleArray10, doubleArray36);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray46 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double47 = org.apache.commons.math3.util.MathArrays.distance(doubleArray39, doubleArray46);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray39);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray39);
        double double50 = org.apache.commons.math3.util.MathArrays.distanceInf(doubleArray36, doubleArray39);
        boolean boolean51 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray7, doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 8730.0, 1630.0, -1.0, 3500.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1006");
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
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray6);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException13 = new org.apache.commons.math3.exception.NullArgumentException(localizable0, (java.lang.Object[]) longArray6);
        org.apache.commons.math3.util.MathArrays.checkRectangular(longArray6);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray6);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray6);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1007");
        float[] floatArray2 = new float[] { 10L, 10 };
        float[] floatArray3 = new float[] {};
        boolean boolean4 = org.apache.commons.math3.util.MathArrays.equals(floatArray2, floatArray3);
        float[] floatArray7 = new float[] { 10L, 10 };
        float[] floatArray8 = new float[] {};
        boolean boolean9 = org.apache.commons.math3.util.MathArrays.equals(floatArray7, floatArray8);
        float[] floatArray12 = new float[] { 10L, 10 };
        float[] floatArray13 = new float[] {};
        boolean boolean14 = org.apache.commons.math3.util.MathArrays.equals(floatArray12, floatArray13);
        boolean boolean15 = org.apache.commons.math3.util.MathArrays.equals(floatArray7, floatArray13);
        boolean boolean16 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray3, floatArray7);
        float[] floatArray19 = new float[] { 10L, 10 };
        float[] floatArray20 = new float[] {};
        boolean boolean21 = org.apache.commons.math3.util.MathArrays.equals(floatArray19, floatArray20);
        float[] floatArray24 = new float[] { 10L, 10 };
        float[] floatArray25 = new float[] {};
        boolean boolean26 = org.apache.commons.math3.util.MathArrays.equals(floatArray24, floatArray25);
        boolean boolean27 = org.apache.commons.math3.util.MathArrays.equals(floatArray19, floatArray25);
        float[] floatArray30 = new float[] { 10L, 10 };
        float[] floatArray31 = new float[] {};
        boolean boolean32 = org.apache.commons.math3.util.MathArrays.equals(floatArray30, floatArray31);
        boolean boolean33 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray19, floatArray30);
        boolean boolean34 = org.apache.commons.math3.util.MathArrays.equals(floatArray3, floatArray19);
        float[] floatArray38 = new float[] { (byte) 0, 'a', 0L };
        boolean boolean39 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray3, floatArray38);
        float[] floatArray45 = new float[] { 0L, (short) 10, 'a', 'a', (byte) 0 };
        float[] floatArray52 = new float[] { 0, 0.0f, (byte) 0, (-1.0f), 1, (-1) };
        boolean boolean53 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray45, floatArray52);
        boolean boolean54 = org.apache.commons.math3.util.MathArrays.equals(floatArray38, floatArray52);
        float[] floatArray57 = new float[] { 10L, 10 };
        float[] floatArray58 = new float[] {};
        boolean boolean59 = org.apache.commons.math3.util.MathArrays.equals(floatArray57, floatArray58);
        float[] floatArray62 = new float[] { 10L, 10 };
        float[] floatArray63 = new float[] {};
        boolean boolean64 = org.apache.commons.math3.util.MathArrays.equals(floatArray62, floatArray63);
        float[] floatArray67 = new float[] { 10L, 10 };
        float[] floatArray68 = new float[] {};
        boolean boolean69 = org.apache.commons.math3.util.MathArrays.equals(floatArray67, floatArray68);
        boolean boolean70 = org.apache.commons.math3.util.MathArrays.equals(floatArray62, floatArray68);
        float[] floatArray71 = null;
        float[] floatArray74 = new float[] { 10L, 10 };
        float[] floatArray75 = new float[] {};
        boolean boolean76 = org.apache.commons.math3.util.MathArrays.equals(floatArray74, floatArray75);
        float[] floatArray79 = new float[] { 10L, 10 };
        float[] floatArray80 = new float[] {};
        boolean boolean81 = org.apache.commons.math3.util.MathArrays.equals(floatArray79, floatArray80);
        boolean boolean82 = org.apache.commons.math3.util.MathArrays.equals(floatArray74, floatArray80);
        float[] floatArray85 = new float[] { 10L, 10 };
        float[] floatArray86 = new float[] {};
        boolean boolean87 = org.apache.commons.math3.util.MathArrays.equals(floatArray85, floatArray86);
        boolean boolean88 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray74, floatArray85);
        boolean boolean89 = org.apache.commons.math3.util.MathArrays.equals(floatArray71, floatArray85);
        boolean boolean90 = org.apache.commons.math3.util.MathArrays.equals(floatArray62, floatArray71);
        float[] floatArray91 = null;
        boolean boolean92 = org.apache.commons.math3.util.MathArrays.equals(floatArray62, floatArray91);
        boolean boolean93 = org.apache.commons.math3.util.MathArrays.equals(floatArray57, floatArray62);
        boolean boolean94 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray38, floatArray57);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[0.0, 97.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[0.0, 10.0, 97.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[0.0, 0.0, 0.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray67), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray68), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray74), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray75), "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(floatArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray79), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray80), "[]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(floatArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray85), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray86), "[]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1008");
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
        int int24 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray18, intArray21);
        int[] intArray29 = new int[] { '4', (byte) 0, (short) 10, '#' };
        double double30 = org.apache.commons.math3.util.MathArrays.distance(intArray18, intArray29);
        int[] intArray32 = org.apache.commons.math3.util.MathArrays.copyOf(intArray18, (int) 'a');
        double double33 = org.apache.commons.math3.util.MathArrays.distance(intArray17, intArray18);
        int[] intArray35 = org.apache.commons.math3.util.MathArrays.copyOf(intArray17, 97);
        int[] intArray36 = org.apache.commons.math3.util.MathArrays.copyOf(intArray17);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 0, 10, 35]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[]");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1009");
        double[] doubleArray3 = new double[] {};
        double[] doubleArray10 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double11 = org.apache.commons.math3.util.MathArrays.distance(doubleArray3, doubleArray10);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray3);
        double[] doubleArray14 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray3, 0);
        org.apache.commons.math3.util.MathArrays.scaleInPlace(97.0d, doubleArray3);
        double[] doubleArray19 = new double[] { (byte) 0, 1630.0d, (-1.0f) };
        double[] doubleArray20 = new double[] {};
        double[] doubleArray27 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double28 = org.apache.commons.math3.util.MathArrays.distance(doubleArray20, doubleArray27);
        double[] doubleArray33 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double34 = org.apache.commons.math3.util.MathArrays.distance(doubleArray20, doubleArray33);
        double[] doubleArray39 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray40 = new double[] {};
        double[] doubleArray47 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double48 = org.apache.commons.math3.util.MathArrays.distance(doubleArray40, doubleArray47);
        double[] doubleArray53 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double54 = org.apache.commons.math3.util.MathArrays.distance(doubleArray40, doubleArray53);
        double[] doubleArray55 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray39, doubleArray53);
        double[] doubleArray56 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray33, doubleArray55);
        double[] doubleArray57 = org.apache.commons.math3.util.MathArrays.convolve(doubleArray19, doubleArray55);
        double[] doubleArray58 = new double[] {};
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray58);
        boolean boolean60 = org.apache.commons.math3.util.MathArrays.equals(doubleArray19, doubleArray58);
        double double61 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray19);
        boolean boolean62 = org.apache.commons.math3.util.MathArrays.equals(doubleArray3, doubleArray19);
        org.apache.commons.math3.util.MathArrays.scaleInPlace(10.0d, doubleArray19);
        double[] doubleArray65 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray19, (int) '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 16300.0, -10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 163.0, -0.5657142857142857, 1630.0002857142856, 1629.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1630.0003067484374d + "'", double61 == 1630.0003067484374d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 16300.0, -10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1010");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray8 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double9 = org.apache.commons.math3.util.MathArrays.distance(doubleArray1, doubleArray8);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray1);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray19 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double20 = org.apache.commons.math3.util.MathArrays.distance(doubleArray12, doubleArray19);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray12);
        double[] doubleArray22 = org.apache.commons.math3.util.MathArrays.ebeSubtract(doubleArray1, doubleArray12);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray33 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double34 = org.apache.commons.math3.util.MathArrays.distance(doubleArray26, doubleArray33);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray26);
        double[] doubleArray36 = org.apache.commons.math3.util.MathArrays.scale((double) (byte) 100, doubleArray26);
        org.apache.commons.math3.util.MathArrays.scaleInPlace(149850.0d, doubleArray26);
        double[] doubleArray38 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray1, doubleArray26);
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
        double[] doubleArray77 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray52, 1);
        double[] doubleArray78 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray77);
        double[] doubleArray80 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray78, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray81 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray38, doubleArray78);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
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
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1011");
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
        double[] doubleArray37 = new double[] {};
        double[] doubleArray44 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double45 = org.apache.commons.math3.util.MathArrays.distance(doubleArray37, doubleArray44);
        double double46 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray44);
        boolean boolean47 = org.apache.commons.math3.util.MathArrays.equals(doubleArray36, doubleArray44);
        double[] doubleArray49 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray36, 58773.0d);
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
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 113.16359838746733d + "'", double46 == 113.16359838746733d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1628.2908763183873, 56933.2427761078, 32.53328424212562, 178.9330633316909]");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1012");
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
        java.lang.Number number67 = nonMonotonicSequenceException65.getPrevious();
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
        org.junit.Assert.assertEquals("'" + number67 + "' != '" + (short) 100 + "'", number67, (short) 100);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1013");
        double[] doubleArray0 = null;
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, orderDirection1, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1014");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, (int) (byte) 10);
        int[] intArray3 = new int[] {};
        int[] intArray5 = org.apache.commons.math3.util.MathArrays.copyOf(intArray3, (int) (byte) 10);
        int int6 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray0, intArray3);
        int[] intArray11 = new int[] { '4', (byte) 0, (short) 10, '#' };
        double double12 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray15 = org.apache.commons.math3.util.MathArrays.copyOf(intArray13, (int) (byte) 10);
        int[] intArray16 = new int[] {};
        int[] intArray18 = org.apache.commons.math3.util.MathArrays.copyOf(intArray16, (int) (byte) 10);
        int int19 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray13, intArray16);
        int[] intArray24 = new int[] { '4', (byte) 0, (short) 10, '#' };
        double double25 = org.apache.commons.math3.util.MathArrays.distance(intArray13, intArray24);
        double double26 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray13);
        int[] intArray27 = new int[] {};
        int[] intArray29 = org.apache.commons.math3.util.MathArrays.copyOf(intArray27, (int) (byte) 10);
        int[] intArray30 = new int[] {};
        int[] intArray32 = org.apache.commons.math3.util.MathArrays.copyOf(intArray30, (int) (byte) 10);
        int int33 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray27, intArray30);
        int[] intArray34 = new int[] {};
        int[] intArray36 = org.apache.commons.math3.util.MathArrays.copyOf(intArray34, (int) (byte) 10);
        int[] intArray37 = new int[] {};
        int[] intArray39 = org.apache.commons.math3.util.MathArrays.copyOf(intArray37, (int) (byte) 10);
        double double40 = org.apache.commons.math3.util.MathArrays.distance(intArray34, intArray39);
        int[] intArray41 = org.apache.commons.math3.util.MathArrays.copyOf(intArray34);
        int[] intArray43 = org.apache.commons.math3.util.MathArrays.copyOf(intArray34, (int) (short) 0);
        int[] intArray45 = org.apache.commons.math3.util.MathArrays.copyOf(intArray43, (int) (byte) 0);
        int[] intArray46 = new int[] {};
        int[] intArray48 = org.apache.commons.math3.util.MathArrays.copyOf(intArray46, (int) (byte) 10);
        int int49 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray43, intArray46);
        int[] intArray51 = org.apache.commons.math3.util.MathArrays.copyOf(intArray46, 0);
        int int52 = org.apache.commons.math3.util.MathArrays.distance1(intArray30, intArray46);
        double double53 = org.apache.commons.math3.util.MathArrays.distance(intArray13, intArray46);
        int[] intArray55 = org.apache.commons.math3.util.MathArrays.copyOf(intArray13, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 10, 35]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[52, 0, 10, 35]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1015");
        double double8 = org.apache.commons.math3.util.MathArrays.linearCombination(2.965179423548113E10d, 8.290455264155874E49d, 3.294098878135474E13d, (double) (short) 1, 1.4570223113113662E20d, 8.734544017044303E20d, 2.8385654801000005E8d, 132550.70455631864d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.4582687361121134E60d + "'", double8 == 2.4582687361121134E60d);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1016");
        float[] floatArray2 = new float[] { 10L, 10 };
        float[] floatArray3 = new float[] {};
        boolean boolean4 = org.apache.commons.math3.util.MathArrays.equals(floatArray2, floatArray3);
        float[] floatArray7 = new float[] { 10L, 10 };
        float[] floatArray8 = new float[] {};
        boolean boolean9 = org.apache.commons.math3.util.MathArrays.equals(floatArray7, floatArray8);
        float[] floatArray12 = new float[] { 10L, 10 };
        float[] floatArray13 = new float[] {};
        boolean boolean14 = org.apache.commons.math3.util.MathArrays.equals(floatArray12, floatArray13);
        boolean boolean15 = org.apache.commons.math3.util.MathArrays.equals(floatArray7, floatArray13);
        float[] floatArray16 = null;
        float[] floatArray19 = new float[] { 10L, 10 };
        float[] floatArray20 = new float[] {};
        boolean boolean21 = org.apache.commons.math3.util.MathArrays.equals(floatArray19, floatArray20);
        float[] floatArray24 = new float[] { 10L, 10 };
        float[] floatArray25 = new float[] {};
        boolean boolean26 = org.apache.commons.math3.util.MathArrays.equals(floatArray24, floatArray25);
        boolean boolean27 = org.apache.commons.math3.util.MathArrays.equals(floatArray19, floatArray25);
        float[] floatArray30 = new float[] { 10L, 10 };
        float[] floatArray31 = new float[] {};
        boolean boolean32 = org.apache.commons.math3.util.MathArrays.equals(floatArray30, floatArray31);
        boolean boolean33 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray19, floatArray30);
        boolean boolean34 = org.apache.commons.math3.util.MathArrays.equals(floatArray16, floatArray30);
        boolean boolean35 = org.apache.commons.math3.util.MathArrays.equals(floatArray7, floatArray16);
        float[] floatArray36 = null;
        boolean boolean37 = org.apache.commons.math3.util.MathArrays.equals(floatArray7, floatArray36);
        boolean boolean38 = org.apache.commons.math3.util.MathArrays.equals(floatArray2, floatArray7);
        float[] floatArray44 = new float[] { 0L, (short) 10, 'a', 'a', (byte) 0 };
        float[] floatArray51 = new float[] { 0, 0.0f, (byte) 0, (-1.0f), 1, (-1) };
        boolean boolean52 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray44, floatArray51);
        boolean boolean53 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray2, floatArray51);
        float[] floatArray54 = null;
        boolean boolean55 = org.apache.commons.math3.util.MathArrays.equals(floatArray51, floatArray54);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[0.0, 10.0, 97.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[0.0, 0.0, 0.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1017");
        double[] doubleArray4 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray12 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double13 = org.apache.commons.math3.util.MathArrays.distance(doubleArray5, doubleArray12);
        double[] doubleArray18 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double19 = org.apache.commons.math3.util.MathArrays.distance(doubleArray5, doubleArray18);
        double[] doubleArray20 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray4, doubleArray18);
        double[] doubleArray22 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray18, 1.771933898620068E12d);
        double[] doubleArray24 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray22, (int) (short) 100);
        double[] doubleArray28 = new double[] { (byte) 0, 1630.0d, (-1.0f) };
        double[] doubleArray29 = new double[] {};
        double[] doubleArray36 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double37 = org.apache.commons.math3.util.MathArrays.distance(doubleArray29, doubleArray36);
        double[] doubleArray42 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double43 = org.apache.commons.math3.util.MathArrays.distance(doubleArray29, doubleArray42);
        double[] doubleArray48 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray49 = new double[] {};
        double[] doubleArray56 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double57 = org.apache.commons.math3.util.MathArrays.distance(doubleArray49, doubleArray56);
        double[] doubleArray62 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double63 = org.apache.commons.math3.util.MathArrays.distance(doubleArray49, doubleArray62);
        double[] doubleArray64 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray48, doubleArray62);
        double[] doubleArray65 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray42, doubleArray64);
        double[] doubleArray66 = org.apache.commons.math3.util.MathArrays.convolve(doubleArray28, doubleArray64);
        double[] doubleArray67 = new double[] {};
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray67);
        boolean boolean69 = org.apache.commons.math3.util.MathArrays.equals(doubleArray28, doubleArray67);
        double[] doubleArray71 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray28, (double) 1.0f);
        double[] doubleArray73 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray71, 0);
        boolean boolean74 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray22, doubleArray73);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[4.9070448590973915E10, 1.717465700684087E12, 4.9070448590973914E8, 4.907044859097391E9]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[4.9070448590973915E10, 1.717465700684087E12, 4.9070448590973914E8, 4.907044859097391E9, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1630.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 163.0, -0.5657142857142857, 1630.0002857142856, 1629.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.0, 1.0006138735420504, -6.138735420503376E-4]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1018");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, (int) (byte) 10);
        int[] intArray3 = new int[] {};
        int[] intArray5 = org.apache.commons.math3.util.MathArrays.copyOf(intArray3, (int) (byte) 10);
        int int6 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray0, intArray3);
        int[] intArray11 = new int[] { '4', (byte) 0, (short) 10, '#' };
        double double12 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray11);
        int[] intArray13 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        int[] intArray15 = org.apache.commons.math3.util.MathArrays.copyOf(intArray13, 52);
        int[] intArray16 = new int[] {};
        int[] intArray18 = org.apache.commons.math3.util.MathArrays.copyOf(intArray16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        int[] intArray21 = org.apache.commons.math3.util.MathArrays.copyOf(intArray19, (int) (byte) 10);
        int int22 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray16, intArray19);
        int[] intArray27 = new int[] { '4', (byte) 0, (short) 10, '#' };
        double double28 = org.apache.commons.math3.util.MathArrays.distance(intArray16, intArray27);
        int[] intArray29 = org.apache.commons.math3.util.MathArrays.copyOf(intArray16);
        int[] intArray31 = org.apache.commons.math3.util.MathArrays.copyOf(intArray29, 52);
        // The following exception was thrown during execution in test generation
        try {
            double double32 = org.apache.commons.math3.util.MathArrays.distance(intArray15, intArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 10, 35]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[52, 0, 10, 35]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1019");
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
        double double16 = org.apache.commons.math3.util.MathArrays.distance(intArray10, intArray15);
        int[] intArray17 = org.apache.commons.math3.util.MathArrays.copyOf(intArray10);
        int[] intArray19 = org.apache.commons.math3.util.MathArrays.copyOf(intArray10, (int) (short) 0);
        int int20 = org.apache.commons.math3.util.MathArrays.distance1(intArray0, intArray10);
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
        int[] intArray40 = org.apache.commons.math3.util.MathArrays.copyOf(intArray33);
        int[] intArray42 = org.apache.commons.math3.util.MathArrays.copyOf(intArray33, (int) (short) 0);
        int[] intArray44 = org.apache.commons.math3.util.MathArrays.copyOf(intArray42, (int) (byte) 0);
        int[] intArray45 = new int[] {};
        int[] intArray47 = org.apache.commons.math3.util.MathArrays.copyOf(intArray45, (int) (byte) 10);
        int[] intArray48 = new int[] {};
        int[] intArray50 = org.apache.commons.math3.util.MathArrays.copyOf(intArray48, (int) (byte) 10);
        double double51 = org.apache.commons.math3.util.MathArrays.distance(intArray45, intArray50);
        int int52 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray44, intArray50);
        int[] intArray53 = new int[] {};
        int[] intArray55 = org.apache.commons.math3.util.MathArrays.copyOf(intArray53, (int) (byte) 10);
        int[] intArray56 = new int[] {};
        int[] intArray58 = org.apache.commons.math3.util.MathArrays.copyOf(intArray56, (int) (byte) 10);
        int int59 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray53, intArray56);
        int[] intArray64 = new int[] { '4', (byte) 0, (short) 10, '#' };
        double double65 = org.apache.commons.math3.util.MathArrays.distance(intArray53, intArray64);
        int int66 = org.apache.commons.math3.util.MathArrays.distance1(intArray44, intArray64);
        int[] intArray67 = org.apache.commons.math3.util.MathArrays.copyOf(intArray44);
        int int68 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray30, intArray44);
        int[] intArray69 = new int[] {};
        int[] intArray71 = org.apache.commons.math3.util.MathArrays.copyOf(intArray69, (int) (byte) 10);
        int[] intArray72 = new int[] {};
        int[] intArray74 = org.apache.commons.math3.util.MathArrays.copyOf(intArray72, (int) (byte) 10);
        int int75 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray69, intArray72);
        int[] intArray80 = new int[] { '4', (byte) 0, (short) 10, '#' };
        double double81 = org.apache.commons.math3.util.MathArrays.distance(intArray69, intArray80);
        int[] intArray82 = org.apache.commons.math3.util.MathArrays.copyOf(intArray69);
        int[] intArray83 = org.apache.commons.math3.util.MathArrays.copyOf(intArray69);
        int[] intArray85 = org.apache.commons.math3.util.MathArrays.copyOf(intArray83, (int) '#');
        int int86 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray30, intArray85);
        int[] intArray87 = new int[] {};
        int[] intArray89 = org.apache.commons.math3.util.MathArrays.copyOf(intArray87, (int) (byte) 10);
        int[] intArray90 = new int[] {};
        int[] intArray92 = org.apache.commons.math3.util.MathArrays.copyOf(intArray90, (int) (byte) 10);
        double double93 = org.apache.commons.math3.util.MathArrays.distance(intArray87, intArray92);
        int[] intArray94 = org.apache.commons.math3.util.MathArrays.copyOf(intArray87);
        int[] intArray95 = org.apache.commons.math3.util.MathArrays.copyOf(intArray87);
        int int96 = org.apache.commons.math3.util.MathArrays.distance1(intArray30, intArray87);
        int int97 = org.apache.commons.math3.util.MathArrays.distance1(intArray10, intArray30);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
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
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[52, 0, 10, 35]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[52, 0, 10, 35]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[]");
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[]");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1020");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray8 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double9 = org.apache.commons.math3.util.MathArrays.distance(doubleArray1, doubleArray8);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray1);
        double[] doubleArray12 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray1, 0);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray21 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double22 = org.apache.commons.math3.util.MathArrays.distance(doubleArray14, doubleArray21);
        double[] doubleArray27 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double28 = org.apache.commons.math3.util.MathArrays.distance(doubleArray14, doubleArray27);
        double[] doubleArray33 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray34 = new double[] {};
        double[] doubleArray41 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double42 = org.apache.commons.math3.util.MathArrays.distance(doubleArray34, doubleArray41);
        double[] doubleArray47 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double48 = org.apache.commons.math3.util.MathArrays.distance(doubleArray34, doubleArray47);
        double[] doubleArray49 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray33, doubleArray47);
        double[] doubleArray50 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray27, doubleArray49);
        double[] doubleArray51 = org.apache.commons.math3.util.MathArrays.scale((double) '4', doubleArray27);
        double[] doubleArray52 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray51);
        double double53 = org.apache.commons.math3.util.MathArrays.distance(doubleArray12, doubleArray51);
        java.lang.Number number55 = null;
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException63 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection64 = nonMonotonicSequenceException63.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException66 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (-1L), (java.lang.Number) 350101.0d, (int) ' ', orderDirection64, true);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException68 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) 43127.36401612533d, number55, (int) 'a', orderDirection64, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray12, orderDirection64, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[5200.0, 182000.0, 52.0, 520.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[5200.0, 182000.0, 52.0, 520.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + orderDirection64 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection64.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1021");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray9 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double10 = org.apache.commons.math3.util.MathArrays.distance(doubleArray2, doubleArray9);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray2);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray2);
        double[] doubleArray13 = org.apache.commons.math3.util.MathArrays.scale(149850.0d, doubleArray2);
        double[] doubleArray14 = org.apache.commons.math3.util.MathArrays.scale((double) 10, doubleArray2);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray23 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double24 = org.apache.commons.math3.util.MathArrays.distance(doubleArray16, doubleArray23);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray16);
        double[] doubleArray27 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray16, 0);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray35 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double36 = org.apache.commons.math3.util.MathArrays.distance(doubleArray28, doubleArray35);
        double[] doubleArray41 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double42 = org.apache.commons.math3.util.MathArrays.distance(doubleArray28, doubleArray41);
        double[] doubleArray43 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray16, doubleArray28);
        boolean boolean44 = org.apache.commons.math3.util.MathArrays.equals(doubleArray14, doubleArray43);
        double[] doubleArray45 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray43);
        double[] doubleArray49 = new double[] {};
        double[] doubleArray56 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double57 = org.apache.commons.math3.util.MathArrays.distance(doubleArray49, doubleArray56);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray49);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray49);
        double[] doubleArray60 = org.apache.commons.math3.util.MathArrays.scale(149850.0d, doubleArray49);
        double[] doubleArray61 = org.apache.commons.math3.util.MathArrays.scale((double) 10, doubleArray49);
        double[] doubleArray62 = org.apache.commons.math3.util.MathArrays.scale(3.2706577531754132E18d, doubleArray49);
        double double63 = org.apache.commons.math3.util.MathArrays.distance1(doubleArray43, doubleArray62);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1022");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, (int) '4');
        int[] intArray3 = new int[] {};
        int[] intArray5 = org.apache.commons.math3.util.MathArrays.copyOf(intArray3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        int[] intArray8 = org.apache.commons.math3.util.MathArrays.copyOf(intArray6, (int) (byte) 10);
        int int9 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray3, intArray6);
        int[] intArray11 = org.apache.commons.math3.util.MathArrays.copyOf(intArray3, (int) ' ');
        int[] intArray12 = new int[] {};
        int[] intArray14 = org.apache.commons.math3.util.MathArrays.copyOf(intArray12, (int) (byte) 10);
        int[] intArray15 = new int[] {};
        int[] intArray17 = org.apache.commons.math3.util.MathArrays.copyOf(intArray15, (int) (byte) 10);
        double double18 = org.apache.commons.math3.util.MathArrays.distance(intArray12, intArray17);
        int[] intArray19 = org.apache.commons.math3.util.MathArrays.copyOf(intArray12);
        int[] intArray21 = org.apache.commons.math3.util.MathArrays.copyOf(intArray12, (int) (short) 0);
        int[] intArray23 = org.apache.commons.math3.util.MathArrays.copyOf(intArray21, (int) (byte) 0);
        int[] intArray24 = new int[] {};
        int[] intArray26 = org.apache.commons.math3.util.MathArrays.copyOf(intArray24, (int) (byte) 10);
        int int27 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray21, intArray24);
        int[] intArray29 = org.apache.commons.math3.util.MathArrays.copyOf(intArray24, 0);
        int int30 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray3, intArray24);
        int[] intArray31 = null;
        int int32 = org.apache.commons.math3.util.MathArrays.distance1(intArray3, intArray31);
        int int33 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray0, intArray3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1023");
        float[] floatArray2 = new float[] { 10L, 10 };
        float[] floatArray3 = new float[] {};
        boolean boolean4 = org.apache.commons.math3.util.MathArrays.equals(floatArray2, floatArray3);
        float[] floatArray7 = new float[] { 10L, 10 };
        float[] floatArray8 = new float[] {};
        boolean boolean9 = org.apache.commons.math3.util.MathArrays.equals(floatArray7, floatArray8);
        float[] floatArray12 = new float[] { 10L, 10 };
        float[] floatArray13 = new float[] {};
        boolean boolean14 = org.apache.commons.math3.util.MathArrays.equals(floatArray12, floatArray13);
        boolean boolean15 = org.apache.commons.math3.util.MathArrays.equals(floatArray7, floatArray13);
        boolean boolean16 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray3, floatArray7);
        float[] floatArray19 = new float[] { 10L, 10 };
        float[] floatArray20 = new float[] {};
        boolean boolean21 = org.apache.commons.math3.util.MathArrays.equals(floatArray19, floatArray20);
        boolean boolean22 = org.apache.commons.math3.util.MathArrays.equals(floatArray3, floatArray20);
        float[] floatArray23 = null;
        float[] floatArray26 = new float[] { 10L, 10 };
        float[] floatArray27 = new float[] {};
        boolean boolean28 = org.apache.commons.math3.util.MathArrays.equals(floatArray26, floatArray27);
        float[] floatArray31 = new float[] { 10L, 10 };
        float[] floatArray32 = new float[] {};
        boolean boolean33 = org.apache.commons.math3.util.MathArrays.equals(floatArray31, floatArray32);
        float[] floatArray36 = new float[] { 10L, 10 };
        float[] floatArray37 = new float[] {};
        boolean boolean38 = org.apache.commons.math3.util.MathArrays.equals(floatArray36, floatArray37);
        boolean boolean39 = org.apache.commons.math3.util.MathArrays.equals(floatArray31, floatArray37);
        boolean boolean40 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray27, floatArray31);
        boolean boolean41 = org.apache.commons.math3.util.MathArrays.equals(floatArray23, floatArray31);
        float[] floatArray44 = new float[] { 100.0f, 10.0f };
        float[] floatArray47 = new float[] { 10L, 10 };
        float[] floatArray48 = new float[] {};
        boolean boolean49 = org.apache.commons.math3.util.MathArrays.equals(floatArray47, floatArray48);
        float[] floatArray52 = new float[] { 10L, 10 };
        float[] floatArray53 = new float[] {};
        boolean boolean54 = org.apache.commons.math3.util.MathArrays.equals(floatArray52, floatArray53);
        float[] floatArray57 = new float[] { 10L, 10 };
        float[] floatArray58 = new float[] {};
        boolean boolean59 = org.apache.commons.math3.util.MathArrays.equals(floatArray57, floatArray58);
        boolean boolean60 = org.apache.commons.math3.util.MathArrays.equals(floatArray52, floatArray58);
        boolean boolean61 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray48, floatArray52);
        float[] floatArray64 = new float[] { 10L, 10 };
        float[] floatArray65 = new float[] {};
        boolean boolean66 = org.apache.commons.math3.util.MathArrays.equals(floatArray64, floatArray65);
        float[] floatArray69 = new float[] { 10L, 10 };
        float[] floatArray70 = new float[] {};
        boolean boolean71 = org.apache.commons.math3.util.MathArrays.equals(floatArray69, floatArray70);
        boolean boolean72 = org.apache.commons.math3.util.MathArrays.equals(floatArray64, floatArray70);
        float[] floatArray75 = new float[] { 10L, 10 };
        float[] floatArray76 = new float[] {};
        boolean boolean77 = org.apache.commons.math3.util.MathArrays.equals(floatArray75, floatArray76);
        boolean boolean78 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray64, floatArray75);
        boolean boolean79 = org.apache.commons.math3.util.MathArrays.equals(floatArray48, floatArray64);
        boolean boolean80 = org.apache.commons.math3.util.MathArrays.equals(floatArray44, floatArray48);
        boolean boolean81 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray23, floatArray48);
        boolean boolean82 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray20, floatArray48);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray69), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray70), "[]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(floatArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray75), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray76), "[]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1024");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray9 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double10 = org.apache.commons.math3.util.MathArrays.distance(doubleArray2, doubleArray9);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray2);
        double[] doubleArray13 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray2, 0);
        double[] doubleArray14 = org.apache.commons.math3.util.MathArrays.scale(1.0d, doubleArray2);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray23 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double24 = org.apache.commons.math3.util.MathArrays.distance(doubleArray16, doubleArray23);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray16);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray34 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double35 = org.apache.commons.math3.util.MathArrays.distance(doubleArray27, doubleArray34);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray27);
        double[] doubleArray37 = org.apache.commons.math3.util.MathArrays.ebeSubtract(doubleArray16, doubleArray27);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray37);
        double[] doubleArray39 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray2, doubleArray37);
        double[] doubleArray40 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray37);
        double[] doubleArray41 = null;
        double[] doubleArray42 = new double[] {};
        double[] doubleArray49 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double50 = org.apache.commons.math3.util.MathArrays.distance(doubleArray42, doubleArray49);
        double[] doubleArray55 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double56 = org.apache.commons.math3.util.MathArrays.distance(doubleArray42, doubleArray55);
        double[] doubleArray61 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray62 = new double[] {};
        double[] doubleArray69 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double70 = org.apache.commons.math3.util.MathArrays.distance(doubleArray62, doubleArray69);
        double[] doubleArray75 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double76 = org.apache.commons.math3.util.MathArrays.distance(doubleArray62, doubleArray75);
        double[] doubleArray77 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray61, doubleArray75);
        double[] doubleArray78 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray55, doubleArray77);
        double[] doubleArray80 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray55, 1);
        double[] doubleArray81 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray80);
        boolean boolean82 = org.apache.commons.math3.util.MathArrays.equals(doubleArray41, doubleArray80);
        double[] doubleArray83 = null;
        boolean boolean84 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray80, doubleArray83);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray85 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray40, doubleArray80);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1025");
        double double8 = org.apache.commons.math3.util.MathArrays.linearCombination(5.145821487076331E14d, 7.2571147E7d, 0.0d, (double) 1.0f, 13500.0d, (-1.009254E7d), (double) 52, 1.3203316445911565E34d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.865724551874387E35d + "'", double8 == 6.865724551874387E35d);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1026");
        double[] doubleArray7 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray8 = new double[] {};
        double[] doubleArray15 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double16 = org.apache.commons.math3.util.MathArrays.distance(doubleArray8, doubleArray15);
        double[] doubleArray21 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double22 = org.apache.commons.math3.util.MathArrays.distance(doubleArray8, doubleArray21);
        double[] doubleArray23 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray7, doubleArray21);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray31 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double32 = org.apache.commons.math3.util.MathArrays.distance(doubleArray24, doubleArray31);
        double[] doubleArray37 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double38 = org.apache.commons.math3.util.MathArrays.distance(doubleArray24, doubleArray37);
        double[] doubleArray43 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray44 = new double[] {};
        double[] doubleArray51 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double52 = org.apache.commons.math3.util.MathArrays.distance(doubleArray44, doubleArray51);
        double[] doubleArray57 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double58 = org.apache.commons.math3.util.MathArrays.distance(doubleArray44, doubleArray57);
        double[] doubleArray59 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray43, doubleArray57);
        double[] doubleArray60 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray37, doubleArray59);
        double double61 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray21, doubleArray59);
        double[] doubleArray62 = org.apache.commons.math3.util.MathArrays.scale((double) (byte) 1, doubleArray21);
        double[] doubleArray63 = org.apache.commons.math3.util.MathArrays.scale(6654464.168026618d, doubleArray21);
        double[] doubleArray64 = org.apache.commons.math3.util.MathArrays.scale(7.2571147E7d, doubleArray21);
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
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 20.0d + "'", double61 == 20.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[6.654464168026618E8, 2.3290624588093163E10, 6654464.168026618, 6.654464168026618E7]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[7.2571147E9, 2.539990145E11, 7.2571147E7, 7.2571147E8]");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1027");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, (int) (byte) 10);
        int[] intArray3 = new int[] {};
        int[] intArray5 = org.apache.commons.math3.util.MathArrays.copyOf(intArray3, (int) (byte) 10);
        double double6 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray5);
        int[] intArray7 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        int[] intArray9 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, (int) (short) 0);
        int[] intArray13 = new int[] { 0, (byte) 10, 10 };
        int[] intArray15 = org.apache.commons.math3.util.MathArrays.copyOf(intArray13, (int) '4');
        double double16 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray13);
        int[] intArray17 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1028");
        double[] doubleArray4 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray12 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double13 = org.apache.commons.math3.util.MathArrays.distance(doubleArray5, doubleArray12);
        double[] doubleArray18 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double19 = org.apache.commons.math3.util.MathArrays.distance(doubleArray5, doubleArray18);
        double[] doubleArray20 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray4, doubleArray18);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException24 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection25 = nonMonotonicSequenceException24.getDirection();
        boolean boolean28 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray18, orderDirection25, false, false);
        double[] doubleArray30 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray18, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + orderDirection25 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection25.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 3500.0, 1.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1029");
        org.apache.commons.math3.exception.DimensionMismatchException dimensionMismatchException2 = new org.apache.commons.math3.exception.DimensionMismatchException(35, (int) 'a');
        org.apache.commons.math3.exception.util.Localizable localizable3 = null;
        org.apache.commons.math3.exception.util.Localizable localizable4 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException14 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection15 = nonMonotonicSequenceException14.getDirection();
        boolean boolean17 = org.apache.commons.math3.util.MathArrays.isMonotonic(strArray10, orderDirection15, false);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException18 = new org.apache.commons.math3.exception.NullArgumentException(localizable4, (java.lang.Object[]) strArray10);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException28 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection29 = nonMonotonicSequenceException28.getDirection();
        boolean boolean31 = org.apache.commons.math3.util.MathArrays.isMonotonic(strArray24, orderDirection29, false);
        boolean boolean33 = org.apache.commons.math3.util.MathArrays.isMonotonic(strArray10, orderDirection29, true);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException37 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection38 = nonMonotonicSequenceException37.getDirection();
        java.lang.Number number39 = nonMonotonicSequenceException37.getPrevious();
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection40 = nonMonotonicSequenceException37.getDirection();
        boolean boolean42 = org.apache.commons.math3.util.MathArrays.isMonotonic(strArray10, orderDirection40, false);
        org.apache.commons.math3.exception.util.Localizable localizable43 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException53 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection54 = nonMonotonicSequenceException53.getDirection();
        boolean boolean56 = org.apache.commons.math3.util.MathArrays.isMonotonic(strArray49, orderDirection54, false);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException57 = new org.apache.commons.math3.exception.NullArgumentException(localizable43, (java.lang.Object[]) strArray49);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException67 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection68 = nonMonotonicSequenceException67.getDirection();
        boolean boolean70 = org.apache.commons.math3.util.MathArrays.isMonotonic(strArray63, orderDirection68, false);
        boolean boolean72 = org.apache.commons.math3.util.MathArrays.isMonotonic(strArray49, orderDirection68, true);
        boolean boolean74 = org.apache.commons.math3.util.MathArrays.isMonotonic(strArray10, orderDirection68, false);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException78 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        int int79 = nonMonotonicSequenceException78.getIndex();
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection80 = nonMonotonicSequenceException78.getDirection();
        boolean boolean82 = org.apache.commons.math3.util.MathArrays.isMonotonic(strArray10, orderDirection80, true);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException83 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) dimensionMismatchException2, localizable3, (java.lang.Object[]) strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + orderDirection15 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection15.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + orderDirection29 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection29.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + orderDirection38 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection38.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertEquals("'" + number39 + "' != '" + (short) -1 + "'", number39, (short) -1);
        org.junit.Assert.assertTrue("'" + orderDirection40 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection40.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + orderDirection54 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection54.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + orderDirection68 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection68.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 35 + "'", int79 == 35);
        org.junit.Assert.assertTrue("'" + orderDirection80 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection80.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1030");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray8 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double9 = org.apache.commons.math3.util.MathArrays.distance(doubleArray1, doubleArray8);
        double[] doubleArray14 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double15 = org.apache.commons.math3.util.MathArrays.distance(doubleArray1, doubleArray14);
        double[] doubleArray20 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray21 = new double[] {};
        double[] doubleArray28 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double29 = org.apache.commons.math3.util.MathArrays.distance(doubleArray21, doubleArray28);
        double[] doubleArray34 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double35 = org.apache.commons.math3.util.MathArrays.distance(doubleArray21, doubleArray34);
        double[] doubleArray36 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray20, doubleArray34);
        double[] doubleArray37 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray14, doubleArray36);
        double[] doubleArray38 = org.apache.commons.math3.util.MathArrays.scale((double) '4', doubleArray14);
        double[] doubleArray40 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray14, (int) (short) 1);
        double[] doubleArray42 = new double[] {};
        double[] doubleArray49 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double50 = org.apache.commons.math3.util.MathArrays.distance(doubleArray42, doubleArray49);
        double[] doubleArray51 = org.apache.commons.math3.util.MathArrays.scale((double) 100.0f, doubleArray42);
        double[] doubleArray54 = new double[] {};
        double[] doubleArray61 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double62 = org.apache.commons.math3.util.MathArrays.distance(doubleArray54, doubleArray61);
        double[] doubleArray63 = org.apache.commons.math3.util.MathArrays.scale((double) 100.0f, doubleArray54);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray54);
        double[] doubleArray65 = org.apache.commons.math3.util.MathArrays.scale((-8477003.0d), doubleArray54);
        double[] doubleArray66 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray51, doubleArray65);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray67 = org.apache.commons.math3.util.MathArrays.convolve(doubleArray14, doubleArray51);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math3.exception.NoDataException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[5200.0, 182000.0, 52.0, 520.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1031");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray9 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double10 = org.apache.commons.math3.util.MathArrays.distance(doubleArray2, doubleArray9);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray2);
        double[] doubleArray13 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray2, 0);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray22 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double23 = org.apache.commons.math3.util.MathArrays.distance(doubleArray15, doubleArray22);
        double[] doubleArray28 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double29 = org.apache.commons.math3.util.MathArrays.distance(doubleArray15, doubleArray28);
        double[] doubleArray34 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray35 = new double[] {};
        double[] doubleArray42 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double43 = org.apache.commons.math3.util.MathArrays.distance(doubleArray35, doubleArray42);
        double[] doubleArray48 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double49 = org.apache.commons.math3.util.MathArrays.distance(doubleArray35, doubleArray48);
        double[] doubleArray50 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray34, doubleArray48);
        double[] doubleArray51 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray28, doubleArray50);
        double[] doubleArray52 = org.apache.commons.math3.util.MathArrays.scale((double) '4', doubleArray28);
        double[] doubleArray53 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray52);
        double double54 = org.apache.commons.math3.util.MathArrays.distance(doubleArray13, doubleArray52);
        org.apache.commons.math3.util.MathArrays.scaleInPlace(9700.0d, doubleArray52);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[5.044E7, 1.7654E9, 504400.0, 5044000.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[5200.0, 182000.0, 52.0, 520.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1032");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        long[][] longArray4 = new long[][] { longArray2, longArray3 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray4);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException6 = new org.apache.commons.math3.exception.NullArgumentException(localizable1, (java.lang.Object[]) longArray4);
        org.apache.commons.math3.exception.MathInternalError mathInternalError7 = new org.apache.commons.math3.exception.MathInternalError(localizable0, (java.lang.Object[]) longArray4);
        org.apache.commons.math3.util.MathArrays.checkRectangular(longArray4);
        org.apache.commons.math3.util.MathArrays.checkRectangular(longArray4);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1033");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        org.apache.commons.math3.exception.util.Localizable localizable2 = null;
        org.apache.commons.math3.exception.util.Localizable localizable3 = null;
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException7 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection8 = nonMonotonicSequenceException7.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException12 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection13 = nonMonotonicSequenceException12.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException17 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection18 = nonMonotonicSequenceException17.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException22 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection23 = nonMonotonicSequenceException22.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException27 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection28 = nonMonotonicSequenceException27.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException32 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection33 = nonMonotonicSequenceException32.getDirection();
        org.apache.commons.math3.util.MathArrays.OrderDirection[] orderDirectionArray34 = new org.apache.commons.math3.util.MathArrays.OrderDirection[] { orderDirection8, orderDirection13, orderDirection18, orderDirection23, orderDirection28, orderDirection33 };
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException38 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection39 = nonMonotonicSequenceException38.getDirection();
        boolean boolean41 = org.apache.commons.math3.util.MathArrays.isMonotonic(orderDirectionArray34, orderDirection39, false);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException42 = new org.apache.commons.math3.exception.NullArgumentException(localizable3, (java.lang.Object[]) orderDirectionArray34);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException43 = new org.apache.commons.math3.exception.NullArgumentException(localizable2, (java.lang.Object[]) orderDirectionArray34);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException53 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection54 = nonMonotonicSequenceException53.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException56 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) 100.0d, (java.lang.Number) 1L, 0, orderDirection54, false);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException58 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) 8.5773796374885857E18d, (java.lang.Number) (short) 100, (int) 'a', orderDirection54, true);
        boolean boolean60 = org.apache.commons.math3.util.MathArrays.isMonotonic(orderDirectionArray34, orderDirection54, false);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException61 = new org.apache.commons.math3.exception.MathIllegalStateException(localizable1, (java.lang.Object[]) orderDirectionArray34);
        org.apache.commons.math3.exception.MathInternalError mathInternalError62 = new org.apache.commons.math3.exception.MathInternalError(localizable0, (java.lang.Object[]) orderDirectionArray34);
        org.junit.Assert.assertTrue("'" + orderDirection8 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection8.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection13 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection13.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection18 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection18.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection23 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection23.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection28 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection28.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection33 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection33.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertNotNull(orderDirectionArray34);
        org.junit.Assert.assertTrue("'" + orderDirection39 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection39.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + orderDirection54 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection54.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1034");
        int[] intArray0 = null;
        int[] intArray1 = new int[] {};
        int[] intArray3 = org.apache.commons.math3.util.MathArrays.copyOf(intArray1, (int) (byte) 10);
        int[] intArray4 = new int[] {};
        int[] intArray6 = org.apache.commons.math3.util.MathArrays.copyOf(intArray4, (int) (byte) 10);
        double double7 = org.apache.commons.math3.util.MathArrays.distance(intArray1, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.math3.util.MathArrays.copyOf(intArray8, (int) (byte) 10);
        int[] intArray11 = new int[] {};
        int[] intArray13 = org.apache.commons.math3.util.MathArrays.copyOf(intArray11, (int) (byte) 10);
        double double14 = org.apache.commons.math3.util.MathArrays.distance(intArray8, intArray13);
        int[] intArray15 = org.apache.commons.math3.util.MathArrays.copyOf(intArray8);
        int[] intArray17 = org.apache.commons.math3.util.MathArrays.copyOf(intArray8, (int) (short) 0);
        int int18 = org.apache.commons.math3.util.MathArrays.distance1(intArray1, intArray17);
        int[] intArray19 = org.apache.commons.math3.util.MathArrays.copyOf(intArray1);
        int[] intArray20 = new int[] {};
        int[] intArray22 = org.apache.commons.math3.util.MathArrays.copyOf(intArray20, (int) (byte) 10);
        int[] intArray23 = new int[] {};
        int[] intArray25 = org.apache.commons.math3.util.MathArrays.copyOf(intArray23, (int) (byte) 10);
        double double26 = org.apache.commons.math3.util.MathArrays.distance(intArray20, intArray25);
        int[] intArray27 = org.apache.commons.math3.util.MathArrays.copyOf(intArray20);
        int[] intArray29 = org.apache.commons.math3.util.MathArrays.copyOf(intArray20, (int) (short) 0);
        int[] intArray31 = org.apache.commons.math3.util.MathArrays.copyOf(intArray29, (int) (byte) 0);
        int[] intArray32 = new int[] {};
        int[] intArray34 = org.apache.commons.math3.util.MathArrays.copyOf(intArray32, (int) (byte) 10);
        int[] intArray35 = new int[] {};
        int[] intArray37 = org.apache.commons.math3.util.MathArrays.copyOf(intArray35, (int) (byte) 10);
        double double38 = org.apache.commons.math3.util.MathArrays.distance(intArray32, intArray37);
        int int39 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray31, intArray37);
        int[] intArray40 = new int[] {};
        int[] intArray42 = org.apache.commons.math3.util.MathArrays.copyOf(intArray40, (int) (byte) 10);
        int[] intArray43 = new int[] {};
        int[] intArray45 = org.apache.commons.math3.util.MathArrays.copyOf(intArray43, (int) (byte) 10);
        int int46 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray40, intArray43);
        int[] intArray51 = new int[] { '4', (byte) 0, (short) 10, '#' };
        double double52 = org.apache.commons.math3.util.MathArrays.distance(intArray40, intArray51);
        int int53 = org.apache.commons.math3.util.MathArrays.distance1(intArray31, intArray51);
        int[] intArray54 = org.apache.commons.math3.util.MathArrays.copyOf(intArray31);
        double double55 = org.apache.commons.math3.util.MathArrays.distance(intArray19, intArray54);
        // The following exception was thrown during execution in test generation
        try {
            double double56 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[52, 0, 10, 35]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1035");
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection3 = null;
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException5 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) 10.0d, (java.lang.Number) 10.0f, (int) (short) 0, orderDirection3, false);
        java.lang.Number number6 = nonMonotonicSequenceException5.getPrevious();
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection7 = nonMonotonicSequenceException5.getDirection();
        java.lang.Number number8 = nonMonotonicSequenceException5.getPrevious();
        org.apache.commons.math3.exception.util.Localizable localizable9 = null;
        org.apache.commons.math3.exception.util.Localizable localizable10 = null;
        org.apache.commons.math3.exception.util.Localizable localizable11 = null;
        org.apache.commons.math3.exception.util.Localizable localizable12 = null;
        org.apache.commons.math3.exception.util.Localizable localizable13 = null;
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        long[][] longArray16 = new long[][] { longArray14, longArray15 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray16);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray16);
        org.apache.commons.math3.util.MathArrays.checkRectangular(longArray16);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException20 = new org.apache.commons.math3.exception.MathIllegalArgumentException(localizable13, (java.lang.Object[]) longArray16);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray16);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray16);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException23 = new org.apache.commons.math3.exception.MathIllegalStateException(localizable12, (java.lang.Object[]) longArray16);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException24 = new org.apache.commons.math3.exception.NullArgumentException(localizable11, (java.lang.Object[]) longArray16);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException25 = new org.apache.commons.math3.exception.MathArithmeticException(localizable10, (java.lang.Object[]) longArray16);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException26 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) nonMonotonicSequenceException5, localizable9, (java.lang.Object[]) longArray16);
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection27 = nonMonotonicSequenceException5.getDirection();
        java.lang.String str28 = nonMonotonicSequenceException5.toString();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 10.0f + "'", number6, 10.0f);
        org.junit.Assert.assertNull(orderDirection7);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 10.0f + "'", number8, 10.0f);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertNull(orderDirection27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org.apache.commons.math3.exception.NonMonotonicSequenceException: points -1 and 0 are not decreasing (10 < 10)" + "'", str28, "org.apache.commons.math3.exception.NonMonotonicSequenceException: points -1 and 0 are not decreasing (10 < 10)");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1036");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        long[][] longArray4 = new long[][] { longArray2, longArray3 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray4);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray4);
        org.apache.commons.math3.util.MathArrays.checkRectangular(longArray4);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException8 = new org.apache.commons.math3.exception.MathIllegalArgumentException(localizable1, (java.lang.Object[]) longArray4);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray4);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray4);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException11 = new org.apache.commons.math3.exception.MathIllegalStateException(localizable0, (java.lang.Object[]) longArray4);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext12 = mathIllegalStateException11.getContext();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.exception.MathInternalError mathInternalError13 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable) mathIllegalStateException11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertNotNull(exceptionContext12);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1037");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        long[][] longArray4 = new long[][] { longArray2, longArray3 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray4);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray4);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException7 = new org.apache.commons.math3.exception.MathIllegalStateException(throwable0, localizable1, (java.lang.Object[]) longArray4);
        org.apache.commons.math3.exception.util.Localizable localizable8 = null;
        org.apache.commons.math3.exception.util.Localizable localizable9 = null;
        org.apache.commons.math3.exception.util.Localizable localizable10 = null;
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        long[][] longArray13 = new long[][] { longArray11, longArray12 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray13);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException15 = new org.apache.commons.math3.exception.NullArgumentException(localizable10, (java.lang.Object[]) longArray13);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException16 = new org.apache.commons.math3.exception.NullArgumentException(localizable9, (java.lang.Object[]) longArray13);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray13);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException18 = new org.apache.commons.math3.exception.MathIllegalStateException(throwable0, localizable8, (java.lang.Object[]) longArray13);
        java.lang.Class<?> wildcardClass19 = mathIllegalStateException18.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1038");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        long[][] longArray3 = new long[][] { longArray1, longArray2 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray3);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray3);
        org.apache.commons.math3.util.MathArrays.checkRectangular(longArray3);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray3);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException8 = new org.apache.commons.math3.exception.NullArgumentException(localizable0, (java.lang.Object[]) longArray3);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray3);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray3);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1039");
        double[] doubleArray6 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray14 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double15 = org.apache.commons.math3.util.MathArrays.distance(doubleArray7, doubleArray14);
        double[] doubleArray20 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double21 = org.apache.commons.math3.util.MathArrays.distance(doubleArray7, doubleArray20);
        double[] doubleArray22 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray6, doubleArray20);
        double[] doubleArray23 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray22);
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
        double[] doubleArray62 = org.apache.commons.math3.util.MathArrays.scale((double) '4', doubleArray38);
        double[] doubleArray63 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray38);
        double[] doubleArray64 = org.apache.commons.math3.util.MathArrays.convolve(doubleArray23, doubleArray63);
        double[] doubleArray65 = org.apache.commons.math3.util.MathArrays.scale(7.662323436338385E15d, doubleArray23);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (byte) 0, doubleArray65);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
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
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[5200.0, 182000.0, 52.0, 520.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, 349.9714285714286, 99.1, 3600.999714285714, 3500.997142857143, 11.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, -0.0, 0.0, 0.0]");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1040");
        double[] doubleArray3 = new double[] {};
        double[] doubleArray10 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double11 = org.apache.commons.math3.util.MathArrays.distance(doubleArray3, doubleArray10);
        double[] doubleArray16 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double17 = org.apache.commons.math3.util.MathArrays.distance(doubleArray3, doubleArray16);
        double[] doubleArray22 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray23 = new double[] {};
        double[] doubleArray30 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double31 = org.apache.commons.math3.util.MathArrays.distance(doubleArray23, doubleArray30);
        double[] doubleArray36 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double37 = org.apache.commons.math3.util.MathArrays.distance(doubleArray23, doubleArray36);
        double[] doubleArray38 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray22, doubleArray36);
        double[] doubleArray39 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray16, doubleArray38);
        double[] doubleArray41 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray16, 1);
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection42 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean45 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray41, orderDirection42, true, true);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException47 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) 35924.35148398954d, (java.lang.Number) 35924.35148398954d, (int) (byte) 10, orderDirection42, false);
        int int48 = nonMonotonicSequenceException47.getIndex();
        java.lang.Number number49 = nonMonotonicSequenceException47.getArgument();
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection50 = nonMonotonicSequenceException47.getDirection();
        boolean boolean51 = nonMonotonicSequenceException47.getStrict();
        java.lang.Number number52 = nonMonotonicSequenceException47.getPrevious();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0]");
        org.junit.Assert.assertTrue("'" + orderDirection42 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING + "'", orderDirection42.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertEquals("'" + number49 + "' != '" + 35924.35148398954d + "'", number49, 35924.35148398954d);
        org.junit.Assert.assertTrue("'" + orderDirection50 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING + "'", orderDirection50.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + number52 + "' != '" + 35924.35148398954d + "'", number52, 35924.35148398954d);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1041");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray9 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double10 = org.apache.commons.math3.util.MathArrays.distance(doubleArray2, doubleArray9);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray2);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray20 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double21 = org.apache.commons.math3.util.MathArrays.distance(doubleArray13, doubleArray20);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray13);
        double[] doubleArray23 = org.apache.commons.math3.util.MathArrays.ebeSubtract(doubleArray2, doubleArray13);
        double double24 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray23);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1.0f), doubleArray23);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray34 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double35 = org.apache.commons.math3.util.MathArrays.distance(doubleArray27, doubleArray34);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray27);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) 0.0f, doubleArray27);
        double[] doubleArray38 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray23, doubleArray27);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray47 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double48 = org.apache.commons.math3.util.MathArrays.distance(doubleArray40, doubleArray47);
        double[] doubleArray49 = org.apache.commons.math3.util.MathArrays.scale((double) 100.0f, doubleArray40);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray40);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray40);
        double double52 = org.apache.commons.math3.util.MathArrays.distance1(doubleArray23, doubleArray40);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1042");
        double[] doubleArray4 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray12 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double13 = org.apache.commons.math3.util.MathArrays.distance(doubleArray5, doubleArray12);
        double[] doubleArray18 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double19 = org.apache.commons.math3.util.MathArrays.distance(doubleArray5, doubleArray18);
        double[] doubleArray20 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray4, doubleArray18);
        double[] doubleArray22 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0, 1.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1043");
        double[] doubleArray6 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray14 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double15 = org.apache.commons.math3.util.MathArrays.distance(doubleArray7, doubleArray14);
        double[] doubleArray20 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double21 = org.apache.commons.math3.util.MathArrays.distance(doubleArray7, doubleArray20);
        double[] doubleArray22 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray6, doubleArray20);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray30 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double31 = org.apache.commons.math3.util.MathArrays.distance(doubleArray23, doubleArray30);
        double[] doubleArray36 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double37 = org.apache.commons.math3.util.MathArrays.distance(doubleArray23, doubleArray36);
        double[] doubleArray42 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray43 = new double[] {};
        double[] doubleArray50 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double51 = org.apache.commons.math3.util.MathArrays.distance(doubleArray43, doubleArray50);
        double[] doubleArray56 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double57 = org.apache.commons.math3.util.MathArrays.distance(doubleArray43, doubleArray56);
        double[] doubleArray58 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray42, doubleArray56);
        double[] doubleArray59 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray36, doubleArray58);
        double double60 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray20, doubleArray58);
        double[] doubleArray61 = org.apache.commons.math3.util.MathArrays.scale((double) (byte) 1, doubleArray20);
        double[] doubleArray63 = new double[] {};
        double[] doubleArray70 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double71 = org.apache.commons.math3.util.MathArrays.distance(doubleArray63, doubleArray70);
        double[] doubleArray72 = org.apache.commons.math3.util.MathArrays.scale((double) 100.0f, doubleArray63);
        boolean boolean73 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray20, doubleArray72);
        double[] doubleArray74 = org.apache.commons.math3.util.MathArrays.scale(2.0064935685221478E15d, doubleArray72);
        double[] doubleArray76 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray74, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 20.0d + "'", double60 == 20.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1044");
        double[] doubleArray3 = new double[] {};
        double[] doubleArray10 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double11 = org.apache.commons.math3.util.MathArrays.distance(doubleArray3, doubleArray10);
        double[] doubleArray16 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double17 = org.apache.commons.math3.util.MathArrays.distance(doubleArray3, doubleArray16);
        double[] doubleArray22 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray23 = new double[] {};
        double[] doubleArray30 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double31 = org.apache.commons.math3.util.MathArrays.distance(doubleArray23, doubleArray30);
        double[] doubleArray36 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double37 = org.apache.commons.math3.util.MathArrays.distance(doubleArray23, doubleArray36);
        double[] doubleArray38 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray22, doubleArray36);
        double[] doubleArray39 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray16, doubleArray38);
        double[] doubleArray41 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray16, 1);
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection42 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean45 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray41, orderDirection42, true, true);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException47 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) 1630.0003067484374d, (java.lang.Number) 3.014877405643864E7d, 0, orderDirection42, true);
        java.lang.String str48 = nonMonotonicSequenceException47.toString();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0]");
        org.junit.Assert.assertTrue("'" + orderDirection42 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING + "'", orderDirection42.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org.apache.commons.math3.exception.NonMonotonicSequenceException: points -1 and 0 are not strictly decreasing (30,148,774.056 <= 1,630)" + "'", str48, "org.apache.commons.math3.exception.NonMonotonicSequenceException: points -1 and 0 are not strictly decreasing (30,148,774.056 <= 1,630)");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1045");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] {};
        double[] doubleArray9 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double10 = org.apache.commons.math3.util.MathArrays.distance(doubleArray2, doubleArray9);
        double[] doubleArray15 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double16 = org.apache.commons.math3.util.MathArrays.distance(doubleArray2, doubleArray15);
        double[] doubleArray21 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray22 = new double[] {};
        double[] doubleArray29 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double30 = org.apache.commons.math3.util.MathArrays.distance(doubleArray22, doubleArray29);
        double[] doubleArray35 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double36 = org.apache.commons.math3.util.MathArrays.distance(doubleArray22, doubleArray35);
        double[] doubleArray37 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray21, doubleArray35);
        double[] doubleArray38 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray15, doubleArray37);
        double[] doubleArray40 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray15, 1);
        double double41 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray40);
        double[] doubleArray43 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray40, (double) (-1));
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException50 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 10, (java.lang.Number) 10, (-1));
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection51 = nonMonotonicSequenceException50.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException53 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) 10.0d, (java.lang.Number) 5.576007702658434E8d, (int) (byte) -1, orderDirection51, true);
        boolean boolean56 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray40, orderDirection51, false, true);
        double[] doubleArray57 = org.apache.commons.math3.util.MathArrays.scale((-6.826219102159232E19d), doubleArray40);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray58 = org.apache.commons.math3.util.MathArrays.convolve(doubleArray0, doubleArray57);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertTrue("'" + orderDirection51 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection51.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-6.826219102159232E21]");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1046");
        double[] doubleArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.util.MathArrays.scaleInPlace(14.142135623730951d, doubleArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1047");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double8 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray7);
        double double9 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray7);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray18 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double19 = org.apache.commons.math3.util.MathArrays.distance(doubleArray11, doubleArray18);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray11);
        double double21 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray11);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray32 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double33 = org.apache.commons.math3.util.MathArrays.distance(doubleArray25, doubleArray32);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray25);
        double[] doubleArray36 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray25, 0);
        double[] doubleArray37 = org.apache.commons.math3.util.MathArrays.scale(1.0d, doubleArray25);
        double double38 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray37);
        double[] doubleArray39 = org.apache.commons.math3.util.MathArrays.scale((double) 10L, doubleArray37);
        double[] doubleArray40 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray11, doubleArray37);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray7, doubleArray40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 6 != 0");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 113.16359838746733d + "'", double9 == 113.16359838746733d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1048");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        org.apache.commons.math3.exception.util.Localizable localizable2 = null;
        org.apache.commons.math3.exception.util.Localizable localizable3 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        long[][] longArray6 = new long[][] { longArray4, longArray5 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray6);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray6);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException9 = new org.apache.commons.math3.exception.MathIllegalStateException(localizable3, (java.lang.Object[]) longArray6);
        org.apache.commons.math3.util.MathArrays.checkRectangular(longArray6);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException11 = new org.apache.commons.math3.exception.MathIllegalStateException(localizable2, (java.lang.Object[]) longArray6);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException12 = new org.apache.commons.math3.exception.NullArgumentException(localizable1, (java.lang.Object[]) longArray6);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException13 = new org.apache.commons.math3.exception.MathArithmeticException(localizable0, (java.lang.Object[]) longArray6);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray6);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1049");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double8 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray7);
        double double9 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray7);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray17 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double18 = org.apache.commons.math3.util.MathArrays.distance(doubleArray10, doubleArray17);
        double[] doubleArray23 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double24 = org.apache.commons.math3.util.MathArrays.distance(doubleArray10, doubleArray23);
        double[] doubleArray29 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray30 = new double[] {};
        double[] doubleArray37 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double38 = org.apache.commons.math3.util.MathArrays.distance(doubleArray30, doubleArray37);
        double[] doubleArray43 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double44 = org.apache.commons.math3.util.MathArrays.distance(doubleArray30, doubleArray43);
        double[] doubleArray45 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray29, doubleArray43);
        double[] doubleArray46 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray23, doubleArray45);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray7, doubleArray45);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 6 != 4");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 113.16359838746733d + "'", double9 == 113.16359838746733d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.1, 3499.999714285714, 2.0, 11.0]");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1050");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        org.apache.commons.math3.exception.util.Localizable localizable2 = null;
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        long[][] longArray5 = new long[][] { longArray3, longArray4 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray5);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray5);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException8 = new org.apache.commons.math3.exception.NullArgumentException(localizable2, (java.lang.Object[]) longArray5);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException9 = new org.apache.commons.math3.exception.MathIllegalStateException(localizable1, (java.lang.Object[]) longArray5);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException10 = new org.apache.commons.math3.exception.NullArgumentException(localizable0, (java.lang.Object[]) longArray5);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray5);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1051");
        org.apache.commons.math3.exception.util.Localizable localizable3 = null;
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException7 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection8 = nonMonotonicSequenceException7.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException12 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection13 = nonMonotonicSequenceException12.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException17 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection18 = nonMonotonicSequenceException17.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException22 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection23 = nonMonotonicSequenceException22.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException27 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection28 = nonMonotonicSequenceException27.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException32 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection33 = nonMonotonicSequenceException32.getDirection();
        org.apache.commons.math3.util.MathArrays.OrderDirection[] orderDirectionArray34 = new org.apache.commons.math3.util.MathArrays.OrderDirection[] { orderDirection8, orderDirection13, orderDirection18, orderDirection23, orderDirection28, orderDirection33 };
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException38 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection39 = nonMonotonicSequenceException38.getDirection();
        boolean boolean41 = org.apache.commons.math3.util.MathArrays.isMonotonic(orderDirectionArray34, orderDirection39, false);
        org.apache.commons.math3.exception.MathInternalError mathInternalError42 = new org.apache.commons.math3.exception.MathInternalError(localizable3, (java.lang.Object[]) orderDirectionArray34);
        java.lang.Number number43 = null;
        java.lang.Number number44 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException58 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection59 = nonMonotonicSequenceException58.getDirection();
        boolean boolean61 = org.apache.commons.math3.util.MathArrays.isMonotonic(strArray54, orderDirection59, false);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException63 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) 1.0d, (java.lang.Number) 7002072.0d, (int) '#', orderDirection59, false);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException65 = new org.apache.commons.math3.exception.NonMonotonicSequenceException(number43, number44, 0, orderDirection59, true);
        boolean boolean67 = org.apache.commons.math3.util.MathArrays.isMonotonic(orderDirectionArray34, orderDirection59, false);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException69 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) 1L, (java.lang.Number) 32, 0, orderDirection59, true);
        java.lang.Throwable[] throwableArray70 = nonMonotonicSequenceException69.getSuppressed();
        org.junit.Assert.assertTrue("'" + orderDirection8 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection8.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection13 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection13.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection18 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection18.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection23 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection23.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection28 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection28.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection33 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection33.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertNotNull(orderDirectionArray34);
        org.junit.Assert.assertTrue("'" + orderDirection39 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection39.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + orderDirection59 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection59.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(throwableArray70);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1052");
        double[] doubleArray4 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray12 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double13 = org.apache.commons.math3.util.MathArrays.distance(doubleArray5, doubleArray12);
        double[] doubleArray18 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double19 = org.apache.commons.math3.util.MathArrays.distance(doubleArray5, doubleArray18);
        double[] doubleArray20 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray4, doubleArray18);
        double[] doubleArray21 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray20);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray30 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double31 = org.apache.commons.math3.util.MathArrays.distance(doubleArray23, doubleArray30);
        double[] doubleArray36 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double37 = org.apache.commons.math3.util.MathArrays.distance(doubleArray23, doubleArray36);
        double[] doubleArray42 = new double[] { 10, (-1), (byte) 1, 10.0d };
        double[] doubleArray43 = new double[] {};
        double[] doubleArray50 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double51 = org.apache.commons.math3.util.MathArrays.distance(doubleArray43, doubleArray50);
        double[] doubleArray56 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double57 = org.apache.commons.math3.util.MathArrays.distance(doubleArray43, doubleArray56);
        double[] doubleArray58 = org.apache.commons.math3.util.MathArrays.ebeDivide(doubleArray42, doubleArray56);
        double[] doubleArray59 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray36, doubleArray58);
        double[] doubleArray60 = org.apache.commons.math3.util.MathArrays.scale((double) '4', doubleArray36);
        double double61 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray20, doubleArray60);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 3500.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.1, -2.8571428571428574E-4, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.1, 3499.999714285714, 2.0, 11.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[5200.0, 182000.0, 52.0, 520.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1040.0d + "'", double61 == 1040.0d);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1053");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.DimensionMismatchException dimensionMismatchException3 = new org.apache.commons.math3.exception.DimensionMismatchException(35, (int) (short) 10);
        org.apache.commons.math3.exception.util.Localizable localizable4 = null;
        org.apache.commons.math3.exception.util.Localizable localizable5 = null;
        org.apache.commons.math3.exception.util.Localizable localizable6 = null;
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        long[][] longArray9 = new long[][] { longArray7, longArray8 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray9);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException12 = new org.apache.commons.math3.exception.MathIllegalStateException(localizable6, (java.lang.Object[]) longArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException13 = new org.apache.commons.math3.exception.MathIllegalStateException(localizable5, (java.lang.Object[]) longArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException14 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) dimensionMismatchException3, localizable4, (java.lang.Object[]) longArray9);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException15 = new org.apache.commons.math3.exception.MathArithmeticException(localizable0, (java.lang.Object[]) longArray9);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray9);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1054");
        float[] floatArray2 = new float[] { 10L, 10 };
        float[] floatArray3 = new float[] {};
        boolean boolean4 = org.apache.commons.math3.util.MathArrays.equals(floatArray2, floatArray3);
        float[] floatArray7 = new float[] { 10L, 10 };
        float[] floatArray8 = new float[] {};
        boolean boolean9 = org.apache.commons.math3.util.MathArrays.equals(floatArray7, floatArray8);
        float[] floatArray12 = new float[] { 10L, 10 };
        float[] floatArray13 = new float[] {};
        boolean boolean14 = org.apache.commons.math3.util.MathArrays.equals(floatArray12, floatArray13);
        boolean boolean15 = org.apache.commons.math3.util.MathArrays.equals(floatArray7, floatArray13);
        boolean boolean16 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray3, floatArray7);
        float[] floatArray19 = new float[] { 10L, 10 };
        float[] floatArray20 = new float[] {};
        boolean boolean21 = org.apache.commons.math3.util.MathArrays.equals(floatArray19, floatArray20);
        float[] floatArray24 = new float[] { 10L, 10 };
        float[] floatArray25 = new float[] {};
        boolean boolean26 = org.apache.commons.math3.util.MathArrays.equals(floatArray24, floatArray25);
        boolean boolean27 = org.apache.commons.math3.util.MathArrays.equals(floatArray19, floatArray25);
        float[] floatArray30 = new float[] { 10L, 10 };
        float[] floatArray31 = new float[] {};
        boolean boolean32 = org.apache.commons.math3.util.MathArrays.equals(floatArray30, floatArray31);
        boolean boolean33 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray19, floatArray30);
        boolean boolean34 = org.apache.commons.math3.util.MathArrays.equals(floatArray3, floatArray19);
        float[] floatArray38 = new float[] { (byte) 0, 'a', 0L };
        boolean boolean39 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray3, floatArray38);
        float[] floatArray40 = null;
        float[] floatArray43 = new float[] { 10L, 10 };
        float[] floatArray44 = new float[] {};
        boolean boolean45 = org.apache.commons.math3.util.MathArrays.equals(floatArray43, floatArray44);
        float[] floatArray48 = new float[] { 10L, 10 };
        float[] floatArray49 = new float[] {};
        boolean boolean50 = org.apache.commons.math3.util.MathArrays.equals(floatArray48, floatArray49);
        float[] floatArray53 = new float[] { 10L, 10 };
        float[] floatArray54 = new float[] {};
        boolean boolean55 = org.apache.commons.math3.util.MathArrays.equals(floatArray53, floatArray54);
        boolean boolean56 = org.apache.commons.math3.util.MathArrays.equals(floatArray48, floatArray54);
        boolean boolean57 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray44, floatArray48);
        boolean boolean58 = org.apache.commons.math3.util.MathArrays.equals(floatArray40, floatArray48);
        float[] floatArray61 = new float[] { 100.0f, 10.0f };
        float[] floatArray64 = new float[] { 10L, 10 };
        float[] floatArray65 = new float[] {};
        boolean boolean66 = org.apache.commons.math3.util.MathArrays.equals(floatArray64, floatArray65);
        float[] floatArray69 = new float[] { 10L, 10 };
        float[] floatArray70 = new float[] {};
        boolean boolean71 = org.apache.commons.math3.util.MathArrays.equals(floatArray69, floatArray70);
        float[] floatArray74 = new float[] { 10L, 10 };
        float[] floatArray75 = new float[] {};
        boolean boolean76 = org.apache.commons.math3.util.MathArrays.equals(floatArray74, floatArray75);
        boolean boolean77 = org.apache.commons.math3.util.MathArrays.equals(floatArray69, floatArray75);
        boolean boolean78 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray65, floatArray69);
        float[] floatArray81 = new float[] { 10L, 10 };
        float[] floatArray82 = new float[] {};
        boolean boolean83 = org.apache.commons.math3.util.MathArrays.equals(floatArray81, floatArray82);
        float[] floatArray86 = new float[] { 10L, 10 };
        float[] floatArray87 = new float[] {};
        boolean boolean88 = org.apache.commons.math3.util.MathArrays.equals(floatArray86, floatArray87);
        boolean boolean89 = org.apache.commons.math3.util.MathArrays.equals(floatArray81, floatArray87);
        float[] floatArray92 = new float[] { 10L, 10 };
        float[] floatArray93 = new float[] {};
        boolean boolean94 = org.apache.commons.math3.util.MathArrays.equals(floatArray92, floatArray93);
        boolean boolean95 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray81, floatArray92);
        boolean boolean96 = org.apache.commons.math3.util.MathArrays.equals(floatArray65, floatArray81);
        boolean boolean97 = org.apache.commons.math3.util.MathArrays.equals(floatArray61, floatArray65);
        boolean boolean98 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray40, floatArray65);
        boolean boolean99 = org.apache.commons.math3.util.MathArrays.equals(floatArray38, floatArray65);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[0.0, 97.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray69), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray70), "[]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray74), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray75), "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(floatArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray81), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray82), "[]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(floatArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray86), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray87), "[]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(floatArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray92), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray93), "[]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1055");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray67 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray54, 0.0d);
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
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1056");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, (int) (byte) 10);
        int[] intArray3 = new int[] {};
        int[] intArray5 = org.apache.commons.math3.util.MathArrays.copyOf(intArray3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        int[] intArray8 = org.apache.commons.math3.util.MathArrays.copyOf(intArray6, (int) (byte) 10);
        int int9 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray3, intArray6);
        int[] intArray11 = org.apache.commons.math3.util.MathArrays.copyOf(intArray3, (int) ' ');
        int[] intArray12 = new int[] {};
        int[] intArray14 = org.apache.commons.math3.util.MathArrays.copyOf(intArray12, (int) (byte) 10);
        int[] intArray15 = new int[] {};
        int[] intArray17 = org.apache.commons.math3.util.MathArrays.copyOf(intArray15, (int) (byte) 10);
        double double18 = org.apache.commons.math3.util.MathArrays.distance(intArray12, intArray17);
        int[] intArray19 = org.apache.commons.math3.util.MathArrays.copyOf(intArray12);
        int[] intArray21 = org.apache.commons.math3.util.MathArrays.copyOf(intArray12, (int) (short) 0);
        int[] intArray23 = org.apache.commons.math3.util.MathArrays.copyOf(intArray21, (int) (byte) 0);
        int[] intArray24 = new int[] {};
        int[] intArray26 = org.apache.commons.math3.util.MathArrays.copyOf(intArray24, (int) (byte) 10);
        int int27 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray21, intArray24);
        int[] intArray29 = org.apache.commons.math3.util.MathArrays.copyOf(intArray24, 0);
        int int30 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray3, intArray24);
        int[] intArray32 = org.apache.commons.math3.util.MathArrays.copyOf(intArray3, (int) (short) 100);
        int[] intArray33 = new int[] {};
        int[] intArray35 = org.apache.commons.math3.util.MathArrays.copyOf(intArray33, (int) (byte) 10);
        int[] intArray36 = new int[] {};
        int[] intArray38 = org.apache.commons.math3.util.MathArrays.copyOf(intArray36, (int) (byte) 10);
        double double39 = org.apache.commons.math3.util.MathArrays.distance(intArray33, intArray38);
        int[] intArray40 = org.apache.commons.math3.util.MathArrays.copyOf(intArray33);
        int[] intArray42 = org.apache.commons.math3.util.MathArrays.copyOf(intArray33, (int) (short) 0);
        int[] intArray43 = new int[] {};
        int[] intArray45 = org.apache.commons.math3.util.MathArrays.copyOf(intArray43, (int) (byte) 10);
        int[] intArray46 = new int[] {};
        int[] intArray48 = org.apache.commons.math3.util.MathArrays.copyOf(intArray46, (int) (byte) 10);
        double double49 = org.apache.commons.math3.util.MathArrays.distance(intArray43, intArray48);
        int[] intArray50 = org.apache.commons.math3.util.MathArrays.copyOf(intArray43);
        int[] intArray52 = org.apache.commons.math3.util.MathArrays.copyOf(intArray43, (int) (short) 0);
        int int53 = org.apache.commons.math3.util.MathArrays.distance1(intArray33, intArray43);
        int[] intArray55 = org.apache.commons.math3.util.MathArrays.copyOf(intArray43, 1);
        int int56 = org.apache.commons.math3.util.MathArrays.distance1(intArray3, intArray43);
        int[] intArray57 = new int[] {};
        int[] intArray59 = org.apache.commons.math3.util.MathArrays.copyOf(intArray57, (int) (byte) 10);
        int[] intArray60 = new int[] {};
        int[] intArray62 = org.apache.commons.math3.util.MathArrays.copyOf(intArray60, (int) (byte) 10);
        int int63 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray57, intArray60);
        int[] intArray65 = org.apache.commons.math3.util.MathArrays.copyOf(intArray57, (int) ' ');
        int[] intArray66 = new int[] {};
        int[] intArray68 = org.apache.commons.math3.util.MathArrays.copyOf(intArray66, (int) (byte) 10);
        int[] intArray69 = new int[] {};
        int[] intArray71 = org.apache.commons.math3.util.MathArrays.copyOf(intArray69, (int) (byte) 10);
        double double72 = org.apache.commons.math3.util.MathArrays.distance(intArray66, intArray71);
        int[] intArray73 = org.apache.commons.math3.util.MathArrays.copyOf(intArray66);
        int[] intArray75 = org.apache.commons.math3.util.MathArrays.copyOf(intArray66, (int) (short) 0);
        int[] intArray76 = new int[] {};
        int[] intArray78 = org.apache.commons.math3.util.MathArrays.copyOf(intArray76, (int) (byte) 10);
        int[] intArray79 = new int[] {};
        int[] intArray81 = org.apache.commons.math3.util.MathArrays.copyOf(intArray79, (int) (byte) 10);
        double double82 = org.apache.commons.math3.util.MathArrays.distance(intArray76, intArray81);
        int[] intArray83 = org.apache.commons.math3.util.MathArrays.copyOf(intArray76);
        int[] intArray85 = org.apache.commons.math3.util.MathArrays.copyOf(intArray76, (int) (short) 0);
        int int86 = org.apache.commons.math3.util.MathArrays.distance1(intArray66, intArray76);
        int[] intArray88 = org.apache.commons.math3.util.MathArrays.copyOf(intArray76, 1);
        double double89 = org.apache.commons.math3.util.MathArrays.distance(intArray57, intArray76);
        int[] intArray91 = org.apache.commons.math3.util.MathArrays.copyOf(intArray76, (int) (byte) 1);
        double double92 = org.apache.commons.math3.util.MathArrays.distance(intArray3, intArray76);
        double double93 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray76);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0]");
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
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1057");
        double double4 = org.apache.commons.math3.util.MathArrays.linearCombination(1.455117104200171E14d, 5.576007702658434E8d, 58773.0d, 6.454829111349835E8d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.113744185083884E22d + "'", double4 == 8.113744185083884E22d);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1058");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray9 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double10 = org.apache.commons.math3.util.MathArrays.distance(doubleArray2, doubleArray9);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray2);
        double[] doubleArray13 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray2, 0);
        double[] doubleArray14 = org.apache.commons.math3.util.MathArrays.scale(1.0d, doubleArray2);
        double double15 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray14);
        double[] doubleArray16 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray14);
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
        double[] doubleArray79 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray36, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double80 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray14, doubleArray36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 0 != 4");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
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
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[100.0]");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1059");
        double double6 = org.apache.commons.math3.util.MathArrays.linearCombination(8730.0d, 1.088956904358433E7d, 8.290455264155874E49d, 1630.0d, (double) '#', 3.014877405643864E7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.3513442080574075E53d + "'", double6 == 1.3513442080574075E53d);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1060");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.util.Localizable localizable1 = null;
        org.apache.commons.math3.exception.util.Localizable localizable2 = null;
        org.apache.commons.math3.exception.util.Localizable localizable3 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        long[][] longArray6 = new long[][] { longArray4, longArray5 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray6);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray6);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException9 = new org.apache.commons.math3.exception.MathIllegalStateException(localizable3, (java.lang.Object[]) longArray6);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException10 = new org.apache.commons.math3.exception.MathIllegalStateException(localizable2, (java.lang.Object[]) longArray6);
        org.apache.commons.math3.exception.MathInternalError mathInternalError11 = new org.apache.commons.math3.exception.MathInternalError(localizable1, (java.lang.Object[]) longArray6);
        org.apache.commons.math3.exception.MathInternalError mathInternalError12 = new org.apache.commons.math3.exception.MathInternalError(localizable0, (java.lang.Object[]) longArray6);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray6);
        org.apache.commons.math3.util.MathArrays.checkRectangular(longArray6);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray6);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1061");
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
        double[] doubleArray31 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray2, 0);
        double[] doubleArray32 = null;
        boolean boolean33 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray2, doubleArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.util.MathArrays.scaleInPlace(1.1447570161086189E21d, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1062");
        long[] longArray2 = new long[] { 10L, (short) 1 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray2);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray2);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray2);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray2);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray2);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray2);
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, 1]");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1063");
        java.lang.Number number3 = null;
        java.lang.Number number4 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException18 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection19 = nonMonotonicSequenceException18.getDirection();
        boolean boolean21 = org.apache.commons.math3.util.MathArrays.isMonotonic(strArray14, orderDirection19, false);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException23 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) 1.0d, (java.lang.Number) 7002072.0d, (int) '#', orderDirection19, false);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException25 = new org.apache.commons.math3.exception.NonMonotonicSequenceException(number3, number4, 0, orderDirection19, true);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException27 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) 6654464.168026618d, (java.lang.Number) 1.0371519499136968E20d, (int) '4', orderDirection19, true);
        java.lang.Number number28 = nonMonotonicSequenceException27.getPrevious();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + orderDirection19 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection19.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 1.0371519499136968E20d + "'", number28, 1.0371519499136968E20d);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1064");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double8 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray7);
        double[] doubleArray13 = new double[] { (short) 100, 3500.0d, 1.0d, 10L };
        double double14 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray13);
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException21 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) (short) 0, (java.lang.Number) (short) -1, (int) '#');
        org.apache.commons.math3.util.MathArrays.OrderDirection orderDirection22 = nonMonotonicSequenceException21.getDirection();
        org.apache.commons.math3.exception.NonMonotonicSequenceException nonMonotonicSequenceException24 = new org.apache.commons.math3.exception.NonMonotonicSequenceException((java.lang.Number) 100.0d, (java.lang.Number) 1L, 0, orderDirection22, false);
        boolean boolean26 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray13, orderDirection22, true);
        double[] doubleArray29 = new double[] {};
        double[] doubleArray36 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double37 = org.apache.commons.math3.util.MathArrays.distance(doubleArray29, doubleArray36);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray29);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray47 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double48 = org.apache.commons.math3.util.MathArrays.distance(doubleArray40, doubleArray47);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1), doubleArray40);
        double[] doubleArray50 = org.apache.commons.math3.util.MathArrays.ebeSubtract(doubleArray29, doubleArray40);
        double double51 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray50);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) (-1.0f), doubleArray50);
        double[] doubleArray54 = new double[] {};
        double[] doubleArray61 = new double[] { (byte) -1, (short) 1, '4', 10.0f, (short) 100, 0.0f };
        double double62 = org.apache.commons.math3.util.MathArrays.distance(doubleArray54, doubleArray61);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray54);
        org.apache.commons.math3.util.MathArrays.scaleInPlace((double) 0.0f, doubleArray54);
        double[] doubleArray65 = org.apache.commons.math3.util.MathArrays.ebeAdd(doubleArray50, doubleArray54);
        org.apache.commons.math3.util.MathArrays.checkPositive(doubleArray50);
        double double67 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray50);
        // The following exception was thrown during execution in test generation
        try {
            double double68 = org.apache.commons.math3.util.MathArrays.distance(doubleArray13, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + orderDirection22 + "' != '" + org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING + "'", orderDirection22.equals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 1.0, 52.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1065");
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
        org.apache.commons.math3.exception.util.Localizable localizable11 = null;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException13 = new org.apache.commons.math3.exception.NotPositiveException(localizable11, (java.lang.Number) (byte) 0);
        java.lang.Number number14 = notPositiveException13.getMin();
        java.lang.Number number15 = notPositiveException13.getArgument();
        mathIllegalStateException8.addSuppressed((java.lang.Throwable) notPositiveException13);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertNotNull(exceptionContext9);
        org.junit.Assert.assertNotNull(exceptionContext10);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 0 + "'", number14, 0);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (byte) 0 + "'", number15, (byte) 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1066");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        long[] longArray5 = new long[] { ' ', (byte) 0, 100, (short) 1 };
        long[] longArray10 = new long[] { ' ', (byte) 0, 100, (short) 1 };
        long[] longArray15 = new long[] { ' ', (byte) 0, 100, (short) 1 };
        long[] longArray20 = new long[] { ' ', (byte) 0, 100, (short) 1 };
        long[][] longArray21 = new long[][] { longArray5, longArray10, longArray15, longArray20 };
        org.apache.commons.math3.util.MathArrays.checkNonNegative(longArray21);
        org.apache.commons.math3.exception.MathInternalError mathInternalError23 = new org.apache.commons.math3.exception.MathInternalError(localizable0, (java.lang.Object[]) longArray21);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext24 = mathInternalError23.getContext();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext25 = mathInternalError23.getContext();
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[32, 0, 100, 1]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 0, 100, 1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[32, 0, 100, 1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[32, 0, 100, 1]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(exceptionContext24);
        org.junit.Assert.assertNotNull(exceptionContext25);
    }
}

