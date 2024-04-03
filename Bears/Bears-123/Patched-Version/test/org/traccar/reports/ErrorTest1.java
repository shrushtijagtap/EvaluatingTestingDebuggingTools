package org.traccar.reports;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L, 0L, 100L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 100L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, (-1L), (-1L), 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 100L, (-1L), (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 100L, 0L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 100L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, 100L, 100L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 10L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 100L, 0L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 10L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 0L, 10L, 0L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 1L, 10L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 100L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 10L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), (-1L), (-1L), 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 10L, 0L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { (-1L), (-1L), 0L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 100L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 10L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, 100L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 1L, 1L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), (-1L), (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 10L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 1L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 100L, 100L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 100L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 1L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 1L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, (-1L), 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 10L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, 100L, 1L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 100L, 10L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 100L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 100L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, (-1L), 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, 0L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 0L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 1L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 0L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 1L, 100L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 1L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, 0L, (-1L), 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 0L, (-1L), 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), (-1L), (-1L), 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 0L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 0L, 10L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 1L, 100L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 0L, 10L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 1L, 10L, (-1L), 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 10L, (-1L), 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 0L, 1L, (-1L), 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, (-1L), 0L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 100L, (-1L), 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 1L, 0L, 1L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), (-1L), 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 100L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 1L, 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 1L, 0L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 10L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), (-1L), 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 0L, 100L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 0L, 10L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 10L, 1L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 1L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 0L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 100L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, (-1L), 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, (-1L), 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 100L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 0L, (-1L), 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, (-1L), 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 0L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 100L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 10L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 1L, 0L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, (-1L), 1L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 0L, 100L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 10L, 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 0L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 10L, 1L, (-1L), 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 1L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 100L, 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 100L, 0L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, 1L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 0L, 10L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 1L, 1L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 10L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 100L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 10L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L, 0L, 10L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 10L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 1L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 100L, 0L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 0L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 10L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { (-1L), 1L, 0L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 0L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 10L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, (-1L), 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 10L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 0L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 10L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), (-1L), 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, (-1L), 1L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 1L, 100L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 1L, 10L, 0L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 100L, (-1L), 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, (-1L), 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, (-1L), 1L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 1L, (-1L), 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, 1L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 1L, 10L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 0L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { (-1L), 10L, 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, (-1L), 100L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 0L, (-1L), 0L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 100L, (-1L), 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 10L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 0L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 100L, (-1L), (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, (-1L), 1L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L, 100L, 0L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 0L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), (-1L), 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 10L, (-1L), 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 10L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, 1L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 0L, 100L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 1L, 0L, 100L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 1L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, (-1L), 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, (-1L), 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), (-1L), 0L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 1L, 0L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, (-1L), 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 100L, 0L, 100L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 100L, 100L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 100L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L, 10L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 1L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 1L, 100L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, (-1L), 100L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, (-1L), (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 0L, (-1L), (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 100L, 1L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 1L, 1L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 100L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 10L, (-1L), 10L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 0L, 100L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 10L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 0L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L, 100L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, (-1L), (-1L), (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 0L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), (-1L), 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 0L, 0L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 100L, 0L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 0L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 100L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 1L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 0L, 100L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, (-1L), 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 10L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 100L, 0L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 10L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 1L, (-1L), 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 0L, (-1L), 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 0L, 100L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, (-1L), 0L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 0L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 10L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 100L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 100L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 10L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, (-1L), 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 0L, 100L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 100L, 0L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 100L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 0L, 0L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 100L, 0L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 0L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { (-1L), 1L, 100L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, (-1L), 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 1L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 1L, 1L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 0L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 1L, 0L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 10L, 100L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 100L, 1L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 1L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, (-1L), 100L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 0L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 100L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, (-1L), 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 1L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { (-1L), 10L, 10L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 100L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 100L, 100L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), (-1L), 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 10L, 10L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, (-1L), 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, (-1L), 100L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 1L, 10L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 10L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 10L, 10L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 1L, 100L, (-1L), 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 0L, 1L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 100L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 1L, 10L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 0L, 1L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 10L, 100L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, (-1L), 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 100L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 100L, 1L, 1L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, (-1L), 10L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, 1L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 100L, 10L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 10L, 10L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, (-1L), 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L, 0L, (-1L), 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, (-1L), 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 1L, 10L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 10L, 1L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, 100L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 1L, 100L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 0L, (-1L), 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { (-1L), 0L, 0L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 100L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 10L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 0L, 100L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 10L, 0L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test813");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test814");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 10L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test815");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, (-1L), (-1L), 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 100L, 1L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test816");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, (-1L), 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test817");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 100L, 0L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 10L, 10L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test818");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test819");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test820");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 100L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test821");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 10L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test822");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 0L, (-1L), 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test823");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 1L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test824");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 10L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test825");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test826");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 100L, 1L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 10L, 10L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test827");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test828");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test829");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 100L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test830");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 10L, (-1L), 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test831");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L, 10L, 100L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test832");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test833");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, (-1L), 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test834");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 0L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 0L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test835");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 10L, 0L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 0L, 0L, (-1L), 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test836");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), (-1L), 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test837");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 100L, 100L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test838");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 0L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test839");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test840");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 0L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test841");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test842");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, 100L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test843");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test844");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 0L, 100L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test845");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test846");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 10L, 100L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, (-1L), 10L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test847");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test848");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 10L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 10L, 10L, 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test849");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 100L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test850");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 0L, 0L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test851");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test852");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test853");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test854");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, (-1L), 0L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test855");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test856");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 0L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test857");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 100L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test858");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, 1L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test859");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 1L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test860");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 10L, 10L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test861");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, (-1L), 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test862");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test863");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 1L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test864");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 100L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test865");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 10L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test866");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, (-1L), (-1L), 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test867");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, (-1L), 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 10L, 0L, 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test868");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 1L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test869");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 0L, 10L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test870");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test871");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), (-1L), 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test872");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, (-1L), 0L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, 1L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test873");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 10L, 10L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test874");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test875");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, (-1L), 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test876");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 100L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test877");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 1L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test878");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test879");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 1L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L, 1L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test880");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 0L, 0L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test881");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test882");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), (-1L), (-1L), 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test883");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 1L, (-1L), (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test884");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 1L, 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test885");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 100L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test886");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 100L, 10L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 10L, 100L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test887");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 10L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test888");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, (-1L), 10L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test889");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 10L, 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test890");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 0L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, (-1L), 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test891");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 100L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test892");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), (-1L), (-1L), 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test893");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, (-1L), 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test894");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 0L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test895");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 100L, 0L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test896");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 0L, 0L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test897");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, 0L, 100L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test898");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 100L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test899");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test900");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, (-1L), 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test901");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), (-1L), 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test902");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test903");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 100L, (-1L), 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 1L, 1L, 1L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test904");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), (-1L), 1L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test905");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 10L, 1L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test906");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test907");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 10L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 10L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test908");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 1L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test909");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 0L, 1L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test910");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 0L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test911");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 1L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test912");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test913");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test914");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 1L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test915");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 100L, 0L, 0L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test916");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test917");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 10L, 100L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test918");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, (-1L), 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test919");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, (-1L), (-1L), 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { (-1L), 0L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test920");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), (-1L), 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test921");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), (-1L), 100L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test922");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test923");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 0L, 0L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test924");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test925");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 100L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test926");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test927");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test928");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test929");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 0L, 0L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 0L, (-1L), 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test930");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), (-1L), 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 10L, 100L, 1L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test931");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 100L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test932");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 1L, 1L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { (-1L), 100L, (-1L), 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test933");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test934");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 1L, 10L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { (-1L), 1L, 0L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test935");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, (-1L), 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test936");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, (-1L), 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test937");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 0L, 1L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test938");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test939");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, 10L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test940");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test941");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 10L, 1L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test942");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test943");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 0L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test944");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, (-1L), 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test945");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test946");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 10L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test947");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 1L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test948");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test949");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 10L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L, 1L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test950");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test951");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 100L, 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, 100L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test952");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 0L, (-1L), 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { (-1L), 0L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test953");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 1L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test954");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test955");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 1L, 0L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test956");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 100L, 0L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 0L, 1L, (-1L), 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test957");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test958");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test959");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test960");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 1L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test961");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 0L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { (-1L), (-1L), 0L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test962");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 10L, 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test963");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 0L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test964");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, (-1L), 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test965");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 100L, 100L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 100L, 10L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test966");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test967");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, (-1L), 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test968");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test969");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }
}

