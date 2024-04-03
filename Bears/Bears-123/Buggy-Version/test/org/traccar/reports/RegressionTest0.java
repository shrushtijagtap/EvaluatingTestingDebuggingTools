package org.traccar.reports;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.traccar.model.Position position0 = null;
        org.traccar.model.Position position1 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.traccar.reports.ReportUtils.calculateDistance(position0, position1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.traccar.model.Position position0 = null;
        org.traccar.model.Position position1 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.traccar.reports.ReportUtils.calculateDistance(position0, position1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.traccar.model.Position position0 = null;
        org.traccar.model.Position position1 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.traccar.reports.ReportUtils.calculateFuel(position0, position1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        org.jxls.common.Context context2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.reports.ReportUtils.processTemplateWithSheets(inputStream0, outputStream1, context2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String str1 = org.traccar.reports.ReportUtils.findDriverName("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.traccar.model.Position position0 = null;
        org.traccar.model.Position position1 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.traccar.reports.ReportUtils.calculateDistance(position0, position1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.String str1 = org.traccar.reports.ReportUtils.findDriverName("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.Date date0 = null;
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.reports.ReportUtils.checkPeriodLimit(date0, date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.traccar.model.Position position0 = null;
        org.traccar.model.Position position1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.traccar.reports.ReportUtils.findDriver(position0, position1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 1L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.util.Collection<java.lang.Long> longCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, longCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.util.Collection<java.lang.Long> longCollection1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection2 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, longCollection1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.util.Collection<java.lang.Long> longCollection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection5 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, longCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.util.Collection<java.lang.Long> longCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, longCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 0L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.util.Collection<java.lang.Long> longCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, longCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.util.Collection<java.lang.Long> longCollection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection5 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, longCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 1L, 10L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.util.Collection<java.lang.Long> longCollection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, longCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 10L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 10L, 100L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.util.Collection<java.lang.Long> longCollection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, longCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 100L, 10L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 100L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection5 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 0L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 10L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.util.Collection<java.lang.Long> longCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, longCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.util.Collection<java.lang.Long> longCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, longCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection6 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 10L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), (-1L), 0L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 0L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.util.Collection<java.lang.Long> longCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, longCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.util.Collection<java.lang.Long> longCollection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection6 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, longCollection5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.util.Collection<java.lang.Long> longCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, longCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, (-1L), (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection6 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.util.Collection<java.lang.Long> longCollection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection6 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, longCollection5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.util.Collection<java.lang.Long> longCollection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection5 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, longCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 100L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.util.Collection<java.lang.Long> longCollection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection5 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, longCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 10L, 100L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.util.Collection<java.lang.Long> longCollection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, longCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 0L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.util.Collection<java.lang.Long> longCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, longCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 10L, 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.util.Collection<java.lang.Long> longCollection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, longCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.util.Collection<java.lang.Long> longCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, longCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 1L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.util.Collection<java.lang.Long> longCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, longCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.util.Collection<java.lang.Long> longCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, longCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.util.Collection<java.lang.Long> longCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, longCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.util.Collection<java.lang.Long> longCollection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection6 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, longCollection5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.util.Collection<java.lang.Long> longCollection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection6 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, longCollection5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L, 0L, 100L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection5 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 10L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, (-1L), 10L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.util.Collection<java.lang.Long> longCollection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, longCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.util.Collection<java.lang.Long> longCollection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection6 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, longCollection5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 0L, 10L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.util.Collection<java.lang.Long> longCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, longCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.util.Collection<java.lang.Long> longCollection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection6 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, longCollection5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection6 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 1L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 0L, 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.util.Collection<java.lang.Long> longCollection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, longCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 1L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.util.Collection<java.lang.Long> longCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, longCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.util.Collection<java.lang.Long> longCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, longCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 100L, 1L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.util.Collection<java.lang.Long> longCollection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, longCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection6 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.util.Collection<java.lang.Long> longCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, longCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection6 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 10L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.util.Collection<java.lang.Long> longCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, longCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.util.Collection<java.lang.Long> longCollection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection6 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, longCollection5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 100L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L, 1L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.util.Collection<java.lang.Long> longCollection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection5 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, longCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 10L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 1L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 10L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, (-1L), (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.util.Collection<java.lang.Long> longCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, longCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection5 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 0L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.util.Collection<java.lang.Long> longCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, longCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.util.Collection<java.lang.Long> longCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, longCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 10L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection6 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 10L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.util.Collection<java.lang.Long> longCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, longCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 1L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.util.Collection<java.lang.Long> longCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, longCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection5 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 100L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.util.Collection<java.lang.Long> longCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, longCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection7 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, (-1L), 1L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.util.Collection<java.lang.Long> longCollection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, longCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        java.util.Collection<java.lang.Long> longCollection0 = null;
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 1L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList(longCollection0, (java.util.Collection<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.util.Collection<java.lang.Long> longCollection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Long> longCollection6 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, longCollection5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }
}

