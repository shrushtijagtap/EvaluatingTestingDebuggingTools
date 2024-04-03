package org.jfree.data.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int0 = org.jfree.data.time.MonthConstants.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        int int11 = day9.compareTo((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day9, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 31-March-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = org.jfree.data.time.MonthConstants.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setKey(comparable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timeSeriesDataItem11);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int0 = org.jfree.data.time.MonthConstants.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class1 = org.jfree.data.time.RegularTimePeriod.downsize(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.util.Calendar calendar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = day10.getMiddleMillisecond(calendar16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "31-March-2024" + "'", str22, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int0 = org.jfree.data.time.Year.MINIMUM_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-9999) + "'", int0 == (-9999));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (byte) -1, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        timeSeries18.add((org.jfree.data.time.RegularTimePeriod) day19, (double) (short) 0, false);
        timeSeries18.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day27 = new org.jfree.data.time.Day();
        timeSeries26.add((org.jfree.data.time.RegularTimePeriod) day27, (double) (short) 0, false);
        java.util.Date date31 = day27.getStart();
        org.jfree.data.time.SerialDate serialDate32 = day27.getSerialDate();
        java.lang.Number number33 = null;
        timeSeries18.update((org.jfree.data.time.RegularTimePeriod) day27, number33);
        java.lang.Number number35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day27, number35, true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 31-March-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate32);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.text.DateFormat dateFormat0 = org.jfree.data.time.Day.DATE_FORMAT;
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month9 = new org.jfree.data.time.Month(date6, timeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String str0 = org.jfree.data.time.TimeSeries.DEFAULT_DOMAIN_DESCRIPTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Time" + "'", str0, "Time");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        timeSeries9.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        java.util.Date date22 = day18.getStart();
        org.jfree.data.time.SerialDate serialDate23 = day18.getSerialDate();
        java.lang.Number number24 = null;
        timeSeries9.update((org.jfree.data.time.RegularTimePeriod) day18, number24);
        java.lang.Number number26 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) day18);
        java.util.Calendar calendar27 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long28 = day18.getLastMillisecond(calendar27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate23);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 0.0d + "'", number26, 0.0d);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int int0 = org.jfree.data.time.MonthConstants.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day3 = new org.jfree.data.time.Day((int) (byte) 1, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        int int12 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        long long6 = day2.getSerialIndex();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 45382L + "'", long6 == 45382L);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        timeSeries1.removeAgedItems(1L, false);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        java.lang.Number number14 = null;
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day13, number14, false);
        double double17 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day();
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) day20, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries11.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day20, (java.lang.Number) 1711911599999L);
        java.lang.Object obj26 = timeSeriesDataItem25.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem25);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 31-March-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(timeSeriesDataItem25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        long long3 = day0.getMiddleMillisecond();
        int int4 = day0.getYear();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = day0.getLastMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1711911599999L + "'", long3 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2024 + "'", int4 == 2024);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        java.util.TimeZone timeZone9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day10 = new org.jfree.data.time.Day(date8, timeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        java.lang.String str3 = day0.toString();
        int int4 = day0.getMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-March-2024" + "'", str3, "31-March-2024");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(31, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 31, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        long long1 = day0.getSerialIndex();
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = day0.getLastMillisecond(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 45382L + "'", long1 == 45382L);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.Class class0 = null;
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day4 = new org.jfree.data.time.Day();
        timeSeries3.add((org.jfree.data.time.RegularTimePeriod) day4, (double) (short) 0, false);
        java.util.Date date8 = day4.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond9 = new org.jfree.data.time.FixedMillisecond(date8);
        java.util.TimeZone timeZone10 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = org.jfree.data.time.RegularTimePeriod.createInstance(class1, date8, timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = org.jfree.data.time.RegularTimePeriod.createInstance(class0, date8, timeZone12);
        java.util.TimeZone timeZone14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month15 = new org.jfree.data.time.Month(date8, timeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod11);
        org.junit.Assert.assertNull(regularTimePeriod13);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate(regularTimePeriod9, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.text.DateFormat dateFormat0 = org.jfree.data.time.Day.DATE_FORMAT_SHORT;
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        timeSeries9.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        java.util.Date date22 = day18.getStart();
        org.jfree.data.time.SerialDate serialDate23 = day18.getSerialDate();
        java.lang.Number number24 = null;
        timeSeries9.update((org.jfree.data.time.RegularTimePeriod) day18, number24);
        java.lang.Number number26 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) day18);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (byte) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate23);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 0.0d + "'", number26, 0.0d);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        org.jfree.data.time.SerialDate serialDate15 = day10.getSerialDate();
        java.lang.Number number16 = null;
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day10, number16);
        java.util.Calendar calendar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = day10.getFirstMillisecond(calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemCount((int) (short) 0);
        org.jfree.data.time.Day day5 = new org.jfree.data.time.Day();
        int int6 = day5.getMonth();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day5, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: There is no existing value for the specified 'period'.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        java.util.List list17 = timeSeries1.data;
        int int18 = timeSeries1.getItemCount();
        java.util.Collection collection19 = timeSeries1.getTimePeriods();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries1.removeChangeListener(seriesChangeListener20);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 1711911599999L);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1711911599999L, "31-March-2024", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.update((org.jfree.data.time.RegularTimePeriod) day21, (java.lang.Number) Double.NaN);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: There is no existing value for the specified 'period'.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        java.lang.Class<?> wildcardClass17 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.Date date0 = null;
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(date0, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        int int6 = timeSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        java.util.Date date19 = day15.getStart();
        java.lang.Number number20 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, number20);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(10, 8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.Class class0 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        java.util.Date date7 = day3.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond8 = new org.jfree.data.time.FixedMillisecond(date7);
        java.util.TimeZone timeZone9 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = org.jfree.data.time.RegularTimePeriod.createInstance(class0, date7, timeZone9);
        java.util.TimeZone timeZone11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month13 = new org.jfree.data.time.Month(date7, timeZone11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod10);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.Class class0 = null;
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day4 = new org.jfree.data.time.Day();
        timeSeries3.add((org.jfree.data.time.RegularTimePeriod) day4, (double) (short) 0, false);
        java.util.Date date8 = day4.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond9 = new org.jfree.data.time.FixedMillisecond(date8);
        java.util.TimeZone timeZone10 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = org.jfree.data.time.RegularTimePeriod.createInstance(class1, date8, timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = org.jfree.data.time.RegularTimePeriod.createInstance(class0, date8, timeZone12);
        java.util.TimeZone timeZone14 = null;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year16 = new org.jfree.data.time.Year(date8, timeZone14, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod11);
        org.junit.Assert.assertNull(regularTimePeriod13);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        int int8 = timeSeries1.getItemCount();
        double double9 = timeSeries1.getMinY();
        double double10 = timeSeries1.getMaxY();
        int int11 = timeSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        int int18 = day17.getMonth();
        java.util.Date date19 = day17.getEnd();
        java.util.TimeZone timeZone20 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = org.jfree.data.time.RegularTimePeriod.createInstance(class16, date19, timeZone20);
        java.util.TimeZone timeZone22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year23 = new org.jfree.data.time.Year(date19, timeZone22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 23:59:59 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod21);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        timeSeries1.removeAgedItems(1L, false);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        timeSeries11.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day();
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) day20, (double) (short) 0, false);
        timeSeries19.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        timeSeries27.add((org.jfree.data.time.RegularTimePeriod) day28, (double) (short) 0, false);
        java.util.Date date32 = day28.getStart();
        org.jfree.data.time.SerialDate serialDate33 = day28.getSerialDate();
        java.lang.Number number34 = null;
        timeSeries19.update((org.jfree.data.time.RegularTimePeriod) day28, number34);
        java.lang.Number number36 = timeSeries11.getValue((org.jfree.data.time.RegularTimePeriod) day28);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day28, (java.lang.Number) 100L, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 31-March-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate33);
        org.junit.Assert.assertEquals("'" + number36 + "' != '" + 0.0d + "'", number36, 0.0d);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        int int18 = day17.getMonth();
        java.util.Date date19 = day17.getEnd();
        java.util.TimeZone timeZone20 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = org.jfree.data.time.RegularTimePeriod.createInstance(class16, date19, timeZone20);
        java.util.TimeZone timeZone22 = null;
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month24 = new org.jfree.data.time.Month(date19, timeZone22, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 23:59:59 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod21);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        long long8 = fixedMillisecond7.getFirstMillisecond();
        java.util.Date date9 = fixedMillisecond7.getTime();
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year12 = new org.jfree.data.time.Year(date9, timeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711868400000L + "'", long8 == 1711868400000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month0, 0.0d);
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = month0.getMiddleMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24291L + "'", long2 == 24291L);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        java.util.TimeZone timeZone9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date8, timeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        long long3 = day0.getMiddleMillisecond();
        int int4 = day0.getYear();
        boolean boolean6 = day0.equals((java.lang.Object) 5);
        int int7 = day0.getDayOfMonth();
        long long8 = day0.getSerialIndex();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = day0.getLastMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1711911599999L + "'", long3 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2024 + "'", int4 == 2024);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 45382L + "'", long8 == 45382L);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo1 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent2 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) true, seriesChangeInfo1);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo3 = seriesChangeEvent2.getSummary();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo4 = null;
        seriesChangeEvent2.setSummary(seriesChangeInfo4);
        org.junit.Assert.assertNull(seriesChangeInfo3);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        timeSeries16.add((org.jfree.data.time.RegularTimePeriod) day17, (double) (short) 0, false);
        java.util.Date date21 = day17.getStart();
        int int22 = timeSeries8.getIndex((org.jfree.data.time.RegularTimePeriod) day17);
        java.lang.Class class23 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        java.util.Date date30 = day26.getStart();
        java.util.TimeZone timeZone31 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = org.jfree.data.time.RegularTimePeriod.createInstance(class23, date30, timeZone31);
        timeSeries1.timePeriodClass = class23;
        int int34 = timeSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        long long1 = fixedMillisecond0.getLastMillisecond();
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711938995383L + "'", long1 == 1711938995383L);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year(0);
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = year1.getFirstMillisecond(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.event.SeriesChangeEvent seriesChangeEvent1 = new org.jfree.data.event.SeriesChangeEvent(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null source");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day3 = new org.jfree.data.time.Day((int) (byte) 100, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent4 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 100, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int int0 = org.jfree.data.time.MonthConstants.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        long long3 = year2.getFirstMillisecond();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = year2.getLastMillisecond(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1704096000000L + "'", long3 == 1704096000000L);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number3 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, number3);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = month2.next();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = month2.getFirstMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod5);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException1 = new org.jfree.data.time.TimePeriodFormatException("");
        java.lang.Throwable[] throwableArray2 = timePeriodFormatException1.getSuppressed();
        java.lang.String str3 = timePeriodFormatException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: " + "'", str3, "org.jfree.data.time.TimePeriodFormatException: ");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        timeSeries18.add((org.jfree.data.time.RegularTimePeriod) day19, (double) (short) 0, false);
        java.util.Date date23 = day19.getStart();
        java.util.TimeZone timeZone24 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = org.jfree.data.time.RegularTimePeriod.createInstance(class16, date23, timeZone24);
        java.util.TimeZone timeZone26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day27 = new org.jfree.data.time.Day(date23, timeZone26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod25);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        timeSeriesDataItem16.setSelected(false);
        timeSeriesDataItem16.setValue((java.lang.Number) (byte) 100);
        boolean boolean21 = timeSeriesDataItem16.isSelected();
        timeSeriesDataItem16.setSelected(false);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.Class class0 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        java.util.Date date7 = day3.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond8 = new org.jfree.data.time.FixedMillisecond(date7);
        java.util.TimeZone timeZone9 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = org.jfree.data.time.RegularTimePeriod.createInstance(class0, date7, timeZone9);
        org.jfree.data.time.FixedMillisecond fixedMillisecond11 = new org.jfree.data.time.FixedMillisecond(date7);
        java.util.TimeZone timeZone12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day13 = new org.jfree.data.time.Day(date7, timeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod10);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries6.addChangeListener(seriesChangeListener7);
        long long9 = timeSeries6.getMaximumItemAge();
        java.lang.String str10 = timeSeries6.getDescription();
        double double11 = timeSeries6.getMinY();
        java.util.Collection collection12 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries6);
        timeSeries6.setRangeDescription("");
        timeSeries6.clear();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        int int8 = timeSeries1.getItemCount();
        double double9 = timeSeries1.getMinY();
        double double10 = timeSeries1.getMaxY();
        int int11 = timeSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = year2.getLastMillisecond(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 1711911599999L);
        int int17 = timeSeriesDataItem15.compareTo((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = timeSeriesDataItem15.clone();
        timeSeriesDataItem15.setValue((java.lang.Number) 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        timeSeries1.removeAgedItems(1L, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        timeSeriesDataItem16.setSelected(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeriesDataItem16.getPeriod();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo20 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent21 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeriesDataItem16, seriesChangeInfo20);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        java.util.List list8 = timeSeries1.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        java.util.List list17 = timeSeries1.data;
        java.lang.String str18 = timeSeries1.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeries1.getNextTimePeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries1.getTimePeriod(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertNotNull(regularTimePeriod19);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.util.List list3 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) 12, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.data.time.Day day1 = org.jfree.data.time.Day.parseDay("31-March-2024");
        org.junit.Assert.assertNull(day1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        timeSeries1.clear();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.Year year12 = new org.jfree.data.time.Year(0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) year12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries1.getNextTimePeriod();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(timeSeriesDataItem13);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        timeSeries5.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries5.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent14 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean15 = timeSeries5.equals((java.lang.Object) seriesChangeEvent14);
        org.jfree.data.time.Day day16 = new org.jfree.data.time.Day();
        int int18 = day16.compareTo((java.lang.Object) (short) 100);
        java.lang.String str19 = day16.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries5.getDataItem((org.jfree.data.time.RegularTimePeriod) day16);
        timeSeriesDataItem20.setSelected(false);
        timeSeriesDataItem20.setValue((java.lang.Number) (byte) 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries1.addOrUpdate(timeSeriesDataItem20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = timeSeriesDataItem25.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "31-March-2024" + "'", str19, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem20);
        org.junit.Assert.assertNull(timeSeriesDataItem25);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.util.Date date3 = month2.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = month2.next();
        long long5 = month2.getSerialIndex();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = month2.getLastMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 118L + "'", long5 == 118L);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = fixedMillisecond7.next();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) fixedMillisecond7, "", "");
        java.lang.Object obj12 = null;
        boolean boolean13 = fixedMillisecond7.equals(obj12);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        timeSeries7.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries7.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries7.addChangeListener(seriesChangeListener15);
        timeSeries7.setDomainDescription("hi!");
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = day19.next();
        timeSeries7.add(regularTimePeriod22, (java.lang.Number) 1);
        org.jfree.data.time.Month month27 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number28 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month27, number28);
        long long30 = month27.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries7.getDataItem((org.jfree.data.time.RegularTimePeriod) month27);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((org.jfree.data.time.RegularTimePeriod) month27, (java.lang.Number) 9999);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: There is no existing value for the specified 'period'.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 118L + "'", long30 == 118L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem31);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = day6.getFirstMillisecond(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timeSeriesDataItem11);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries6.addChangeListener(seriesChangeListener7);
        long long9 = timeSeries6.getMaximumItemAge();
        java.lang.String str10 = timeSeries6.getDescription();
        double double11 = timeSeries6.getMinY();
        java.util.Collection collection12 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries6.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        timeSeries1.setDomainDescription("");
        int int22 = timeSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        java.util.Calendar calendar20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = month4.getMiddleMillisecond(calendar20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 1711911599999L);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1711911599999L, "31-March-2024", "");
        java.lang.Comparable comparable19 = timeSeries18.getKey();
        timeSeries18.removeAgedItems(false);
        int int22 = timeSeries18.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries25 = timeSeries18.createCopy(100, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 1711911599999L + "'", comparable19, 1711911599999L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries1.getRawDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries1.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        long long3 = year2.getLastMillisecond();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1735718399999L + "'", long3 == 1735718399999L);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.event.SeriesChangeEvent seriesChangeEvent4 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) seriesChangeListener2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null source");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.util.List list3 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) 12, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries1.addOrUpdate(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        int int17 = day8.getYear();
        java.util.Calendar calendar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            day8.peg(calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2024 + "'", int17 == 2024);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int1 = day0.getMonth();
        java.util.Date date2 = day0.getEnd();
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month5 = new org.jfree.data.time.Month(date2, timeZone3, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Sun Mar 31 23:59:59 PDT 2024");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException1 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException3 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException1.addSuppressed((java.lang.Throwable) timePeriodFormatException3);
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException6 = new org.jfree.data.time.TimePeriodFormatException("");
        java.lang.Throwable[] throwableArray7 = timePeriodFormatException6.getSuppressed();
        timePeriodFormatException1.addSuppressed((java.lang.Throwable) timePeriodFormatException6);
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodFormatException6.addSuppressed(throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        boolean boolean17 = timeSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 1, 5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.util.List list3 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) 12, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((-9999), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -9999");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        java.util.Date date19 = day15.getStart();
        java.lang.Number number20 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, number20);
        long long22 = day15.getFirstMillisecond();
        java.util.Calendar calendar23 = null;
        // The following exception was thrown during execution in test generation
        try {
            day15.peg(calendar23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1711868400000L + "'", long22 == 1711868400000L);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        int int6 = timeSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(6, 2024, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = day6.getLastMillisecond(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timeSeriesDataItem11);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int int0 = org.jfree.data.time.MonthConstants.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        java.util.List list17 = timeSeries1.data;
        int int18 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        timeSeries20.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries20.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent29 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean30 = timeSeries20.equals((java.lang.Object) seriesChangeEvent29);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        int int33 = day31.compareTo((java.lang.Object) (short) 100);
        java.lang.String str34 = day31.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries20.getDataItem((org.jfree.data.time.RegularTimePeriod) day31);
        java.lang.String str36 = day31.toString();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day31, (double) ' ', true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 31-March-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "31-March-2024" + "'", str34, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "31-March-2024" + "'", str36, "31-March-2024");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        long long6 = timeSeries3.getMaximumItemAge();
        java.lang.String str7 = timeSeries3.getDescription();
        int int8 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day11 = new org.jfree.data.time.Day();
        timeSeries10.add((org.jfree.data.time.RegularTimePeriod) day11, (double) (short) 0, false);
        java.util.Date date15 = day11.getStart();
        org.jfree.data.time.SerialDate serialDate16 = day11.getSerialDate();
        java.lang.String str17 = day11.toString();
        java.lang.Number number18 = null;
        timeSeries3.add((org.jfree.data.time.RegularTimePeriod) day11, number18);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day11, (double) (short) 0, true);
        org.jfree.data.time.FixedMillisecond fixedMillisecond23 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day27 = new org.jfree.data.time.Day();
        timeSeries26.add((org.jfree.data.time.RegularTimePeriod) day27, (double) (short) 0, false);
        java.util.Date date31 = day27.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond32 = new org.jfree.data.time.FixedMillisecond(date31);
        java.util.Date date33 = fixedMillisecond32.getTime();
        java.util.Calendar calendar34 = null;
        long long35 = fixedMillisecond32.getLastMillisecond(calendar34);
        java.util.Calendar calendar36 = null;
        long long37 = fixedMillisecond32.getFirstMillisecond(calendar36);
        java.util.Calendar calendar38 = null;
        long long39 = fixedMillisecond32.getFirstMillisecond(calendar38);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond32);
        org.jfree.data.time.Day day41 = new org.jfree.data.time.Day();
        int int42 = day41.getMonth();
        org.jfree.data.time.SerialDate serialDate43 = day41.getSerialDate();
        java.util.Date date44 = day41.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond45 = new org.jfree.data.time.FixedMillisecond(date44);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) fixedMillisecond45, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "31-March-2024" + "'", str17, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem24);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1711868400000L + "'", long35 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1711868400000L + "'", long37 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1711868400000L + "'", long39 == 1711868400000L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(serialDate43);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year2.previous();
        long long5 = year2.getSerialIndex();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = year2.getLastMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2024L + "'", long5 == 2024L);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        boolean boolean17 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        long long22 = timeSeries19.getMaximumItemAge();
        boolean boolean23 = timeSeries1.equals((java.lang.Object) timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        timeSeries25.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = timeSeries25.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent34 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean35 = timeSeries25.equals((java.lang.Object) seriesChangeEvent34);
        org.jfree.data.time.Day day36 = new org.jfree.data.time.Day();
        int int38 = day36.compareTo((java.lang.Object) (short) 100);
        java.lang.String str39 = day36.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries25.getDataItem((org.jfree.data.time.RegularTimePeriod) day36);
        java.lang.String str41 = day36.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries43 = timeSeries19.createCopy((org.jfree.data.time.RegularTimePeriod) day36, regularTimePeriod42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'end' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "31-March-2024" + "'", str39, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "31-March-2024" + "'", str41, "31-March-2024");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        int int8 = day2.getYear();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = day2.getFirstMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2024 + "'", int8 == 2024);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = new org.jfree.data.time.TimeSeriesDataItem(regularTimePeriod0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent4 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries1);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo5 = seriesChangeEvent4.getSummary();
        java.lang.String str6 = seriesChangeEvent4.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertNull(seriesChangeInfo5);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.Class class0 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        java.util.Date date7 = day3.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond8 = new org.jfree.data.time.FixedMillisecond(date7);
        java.util.TimeZone timeZone9 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = org.jfree.data.time.RegularTimePeriod.createInstance(class0, date7, timeZone9);
        java.util.TimeZone timeZone11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day12 = new org.jfree.data.time.Day(date7, timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod10);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent1 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo2 = null;
        seriesChangeEvent1.setSummary(seriesChangeInfo2);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo4 = seriesChangeEvent1.getSummary();
        java.lang.Object obj5 = seriesChangeEvent1.getSource();
        java.lang.Object obj6 = seriesChangeEvent1.getSource();
        org.junit.Assert.assertNull(seriesChangeInfo4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0d + "'", obj6, 10.0d);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.lang.Class class0 = null;
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day4 = new org.jfree.data.time.Day();
        timeSeries3.add((org.jfree.data.time.RegularTimePeriod) day4, (double) (short) 0, false);
        java.util.Date date8 = day4.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond9 = new org.jfree.data.time.FixedMillisecond(date8);
        java.util.TimeZone timeZone10 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = org.jfree.data.time.RegularTimePeriod.createInstance(class1, date8, timeZone10);
        java.util.TimeZone timeZone12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = org.jfree.data.time.RegularTimePeriod.createInstance(class0, date8, timeZone12);
        org.jfree.data.time.Day day14 = new org.jfree.data.time.Day(date8);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod11);
        org.junit.Assert.assertNull(regularTimePeriod13);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day3 = new org.jfree.data.time.Day(8, 2147483647, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.util.List list3 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) 12, false);
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 10, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 100L + "'", comparable7, 100L);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        timeSeriesDataItem16.setSelected(false);
        timeSeriesDataItem16.setValue((java.lang.Number) (byte) 100);
        boolean boolean21 = timeSeriesDataItem16.isSelected();
        java.lang.Object obj22 = timeSeriesDataItem16.clone();
        java.lang.Number number23 = timeSeriesDataItem16.getValue();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + (byte) 100 + "'", number23, (byte) 100);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month0, 0.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = month0.next();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = month0.getFirstMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24291L + "'", long2 == 24291L);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        timeSeries1.setDescription("Time");
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        int int11 = day9.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = day9.next();
        java.util.Date date13 = regularTimePeriod12.getStart();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod12, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: There is no existing value for the specified 'period'.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Mon Apr 01 00:00:00 PDT 2024");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = day0.next();
        java.util.Date date4 = regularTimePeriod3.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond5 = new org.jfree.data.time.FixedMillisecond(date4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Mon Apr 01 00:00:00 PDT 2024");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.util.Date date3 = month2.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = month2.next();
        long long5 = month2.getSerialIndex();
        org.jfree.data.time.Year year6 = month2.getYear();
        java.lang.String str7 = year6.toString();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 118L + "'", long5 == 118L);
        org.junit.Assert.assertNotNull(year6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9" + "'", str7, "9");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        java.util.Calendar calendar9 = null;
        long long10 = fixedMillisecond7.getLastMillisecond(calendar9);
        long long11 = fixedMillisecond7.getMiddleMillisecond();
        java.util.Date date12 = fixedMillisecond7.getTime();
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day(date12);
        java.util.TimeZone timeZone14 = null;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year16 = new org.jfree.data.time.Year(date12, timeZone14, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1711868400000L + "'", long11 == 1711868400000L);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        org.jfree.data.time.SerialDate serialDate15 = day10.getSerialDate();
        java.lang.Number number16 = null;
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day10, number16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day();
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) day20, (double) (short) 0, false);
        java.util.Date date24 = day20.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond25 = new org.jfree.data.time.FixedMillisecond(date24);
        long long26 = fixedMillisecond25.getFirstMillisecond();
        java.util.Date date27 = fixedMillisecond25.getTime();
        int int28 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) fixedMillisecond25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries30.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries30.addChangeListener(seriesChangeListener38);
        timeSeries30.setDomainDescription("hi!");
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        int int44 = day42.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = day42.next();
        timeSeries30.add(regularTimePeriod45, (java.lang.Number) 1);
        java.lang.Number number48 = null;
        timeSeries1.add(regularTimePeriod45, number48);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(0, 9999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1711868400000L + "'", long26 == 1711868400000L);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod45);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = timeSeries19.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo1 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent2 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) true, seriesChangeInfo1);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo3 = seriesChangeEvent2.getSummary();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo4 = seriesChangeEvent2.getSummary();
        java.lang.String str5 = seriesChangeEvent2.toString();
        org.junit.Assert.assertNull(seriesChangeInfo3);
        org.junit.Assert.assertNull(seriesChangeInfo4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jfree.data.event.SeriesChangeEvent[source=true]" + "'", str5, "org.jfree.data.event.SeriesChangeEvent[source=true]");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double27 = timeSeries26.getMaxY();
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        java.lang.Number number29 = null;
        timeSeries26.add((org.jfree.data.time.RegularTimePeriod) day28, number29, false);
        double double32 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day35 = new org.jfree.data.time.Day();
        timeSeries34.add((org.jfree.data.time.RegularTimePeriod) day35, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries26.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day35, (java.lang.Number) 1711911599999L);
        int int42 = timeSeriesDataItem40.compareTo((java.lang.Object) (byte) -1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries1.addOrUpdate(timeSeriesDataItem40);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries1.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "31-March-2024" + "'", str22, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeriesDataItem40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(timeSeriesDataItem43);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 1711911599999L);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1711911599999L, "31-March-2024", "");
        java.lang.Comparable comparable19 = timeSeries18.getKey();
        org.jfree.data.time.Month month20 = new org.jfree.data.time.Month();
        long long21 = month20.getFirstMillisecond();
        org.jfree.data.time.Year year22 = month20.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = year22.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = year22.previous();
        long long25 = year22.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year22, (java.lang.Number) 1711868400000L);
        int int28 = year22.getYear();
        timeSeries18.add((org.jfree.data.time.RegularTimePeriod) year22, (double) 2, false);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 1711911599999L + "'", comparable19, 1711911599999L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1709280000000L + "'", long21 == 1709280000000L);
        org.junit.Assert.assertNotNull(year22);
        org.junit.Assert.assertNotNull(regularTimePeriod23);
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2024L + "'", long25 == 2024L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2024 + "'", int28 == 2024);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number3 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, number3);
        long long5 = month2.getSerialIndex();
        java.util.Date date6 = month2.getStart();
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date6, timeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 118L + "'", long5 == 118L);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Oct 01 00:00:00 PST 9");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        long long8 = fixedMillisecond7.getFirstMillisecond();
        java.util.Date date9 = fixedMillisecond7.getTime();
        org.jfree.data.time.FixedMillisecond fixedMillisecond10 = new org.jfree.data.time.FixedMillisecond(date9);
        java.util.TimeZone timeZone11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month13 = new org.jfree.data.time.Month(date9, timeZone11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711868400000L + "'", long8 == 1711868400000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeriesDataItem23.setValue((java.lang.Number) 8);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "31-March-2024" + "'", str22, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        long long8 = fixedMillisecond7.getFirstMillisecond();
        java.util.Calendar calendar9 = null;
        fixedMillisecond7.peg(calendar9);
        long long11 = fixedMillisecond7.getMiddleMillisecond();
        long long12 = fixedMillisecond7.getFirstMillisecond();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711868400000L + "'", long8 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1711868400000L + "'", long11 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711868400000L + "'", long12 == 1711868400000L);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        org.jfree.data.time.SerialDate serialDate15 = day10.getSerialDate();
        java.lang.Number number16 = null;
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day10, number16);
        long long18 = day10.getFirstMillisecond();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711868400000L + "'", long18 == 1711868400000L);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int1 = day0.getMonth();
        org.jfree.data.time.SerialDate serialDate2 = day0.getSerialDate();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day(serialDate2);
        org.jfree.data.time.Day day4 = new org.jfree.data.time.Day(serialDate2);
        org.jfree.data.time.Day day5 = new org.jfree.data.time.Day(serialDate2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(serialDate2);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = month0.next();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = regularTimePeriod3.getLastMillisecond(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24291L + "'", long2 == 24291L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        int int8 = timeSeries1.getItemCount();
        double double9 = timeSeries1.getMinY();
        double double10 = timeSeries1.getMaxY();
        java.util.List list11 = timeSeries1.getItems();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        java.lang.Object obj12 = seriesChangeEvent10.getSource();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0d + "'", obj12, 10.0d);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            regularTimePeriod8.peg(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        boolean boolean17 = timeSeries1.isEmpty();
        java.lang.Number number19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (short) 10, number19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        timeSeries1.setMaximumItemAge(1711938995383L);
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day14 = new org.jfree.data.time.Day();
        timeSeries13.add((org.jfree.data.time.RegularTimePeriod) day14, (double) (short) 0, false);
        java.util.Date date18 = day14.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond19 = new org.jfree.data.time.FixedMillisecond(date18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = fixedMillisecond19.next();
        java.util.Calendar calendar21 = null;
        long long22 = regularTimePeriod20.getMiddleMillisecond(calendar21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = regularTimePeriod20.next();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod20, (java.lang.Number) 1711938999750L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1711868400001L + "'", long22 == 1711868400001L);
        org.junit.Assert.assertNotNull(regularTimePeriod23);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        java.util.Date date19 = day15.getStart();
        java.lang.Number number20 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, number20);
        timeSeries1.setMaximumItemAge(1711911599999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        long long16 = day10.getFirstMillisecond();
        org.jfree.data.time.SerialDate serialDate17 = day10.getSerialDate();
        java.util.Calendar calendar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = day10.getFirstMillisecond(calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1711868400000L + "'", long16 == 1711868400000L);
        org.junit.Assert.assertNotNull(serialDate17);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double7 = timeSeries6.getMaxY();
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        java.lang.Number number9 = null;
        timeSeries6.add((org.jfree.data.time.RegularTimePeriod) day8, number9, false);
        double double12 = timeSeries6.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries6.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, (java.lang.Number) 1711911599999L);
        int int22 = timeSeriesDataItem20.compareTo((java.lang.Object) (byte) -1);
        timeSeries1.add(timeSeriesDataItem20);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemAge((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(timeSeriesDataItem20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double14 = timeSeries13.getMaxY();
        java.lang.Comparable comparable15 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries1.addAndOrUpdate(timeSeries13);
        double double17 = timeSeries1.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries20 = timeSeries1.createCopy((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 100L + "'", comparable15, 100L);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        int int12 = timeSeries1.getItemCount();
        java.lang.Object obj13 = timeSeries1.clone();
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        java.util.List list17 = timeSeries1.data;
        org.jfree.data.time.Month month20 = new org.jfree.data.time.Month(10, 9);
        java.util.Date date21 = month20.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = month20.next();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) month20, (java.lang.Number) 1711938999750L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertNotNull(regularTimePeriod22);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        java.lang.String str7 = day2.toString();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "31-March-2024" + "'", str7, "31-March-2024");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        java.util.List list17 = timeSeries1.data;
        int int18 = timeSeries1.getItemCount();
        java.lang.Class class19 = timeSeries1.timePeriodClass;
        timeSeries1.setMaximumItemCount((int) ' ');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(class19);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day3);
        java.lang.String str8 = timeSeries7.getDescription();
        timeSeries7.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries7.addOrUpdate(regularTimePeriod10, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getSerialIndex();
        long long3 = month0.getFirstMillisecond();
        long long4 = month0.getLastMillisecond();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24291L + "'", long2 == 24291L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1709280000000L + "'", long3 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1711954799999L + "'", long4 == 1711954799999L);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        timeSeries1.setMaximumItemCount((int) ' ');
        timeSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy((-9999), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.util.Date date3 = month2.getStart();
        org.jfree.data.time.Year year4 = month2.getYear();
        long long5 = year4.getLastMillisecond();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-61851744000001L) + "'", long5 == (-61851744000001L));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        timeSeriesDataItem16.setSelected(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeriesDataItem16.getPeriod();
        long long20 = regularTimePeriod19.getLastMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1711954799999L + "'", long20 == 1711954799999L);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        int int15 = day13.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = day13.next();
        timeSeries1.add(regularTimePeriod16, (java.lang.Number) 1);
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number22 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month21, number22);
        long long24 = month21.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) month21);
        org.jfree.data.time.Year year26 = month21.getYear();
        java.util.Calendar calendar27 = null;
        // The following exception was thrown during execution in test generation
        try {
            month21.peg(calendar27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 118L + "'", long24 == 118L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem25);
        org.junit.Assert.assertNotNull(year26);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        long long1 = year0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = year0.next();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            year0.peg(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1735718399999L + "'", long1 == 1735718399999L);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        long long16 = day10.getFirstMillisecond();
        org.jfree.data.time.SerialDate serialDate17 = day10.getSerialDate();
        int int18 = day10.getDayOfMonth();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1711868400000L + "'", long16 == 1711868400000L);
        org.junit.Assert.assertNotNull(serialDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        timeSeries16.add((org.jfree.data.time.RegularTimePeriod) day17, (double) (short) 0, false);
        java.util.Date date21 = day17.getStart();
        int int22 = timeSeries8.getIndex((org.jfree.data.time.RegularTimePeriod) day17);
        java.lang.Class class23 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        java.util.Date date30 = day26.getStart();
        java.util.TimeZone timeZone31 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = org.jfree.data.time.RegularTimePeriod.createInstance(class23, date30, timeZone31);
        timeSeries1.timePeriodClass = class23;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day36 = new org.jfree.data.time.Day();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) day36, (double) (short) 0, false);
        timeSeries35.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day44 = new org.jfree.data.time.Day();
        timeSeries43.add((org.jfree.data.time.RegularTimePeriod) day44, (double) (short) 0, false);
        java.util.Date date48 = day44.getStart();
        int int49 = timeSeries35.getIndex((org.jfree.data.time.RegularTimePeriod) day44);
        long long50 = day44.getFirstMillisecond();
        org.jfree.data.time.SerialDate serialDate51 = day44.getSerialDate();
        long long52 = day44.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem54 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day44, (java.lang.Number) 118L);
        java.util.Calendar calendar55 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long56 = day44.getFirstMillisecond(calendar55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod32);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1711868400000L + "'", long50 == 1711868400000L);
        org.junit.Assert.assertNotNull(serialDate51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1711868400000L + "'", long52 == 1711868400000L);
        org.junit.Assert.assertNull(timeSeriesDataItem54);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.data.general.SeriesException seriesException1 = new org.jfree.data.general.SeriesException("hi!");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        java.util.Date date19 = day15.getStart();
        java.lang.Number number20 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, number20);
        java.util.Date date22 = day15.getStart();
        java.util.Calendar calendar23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = day15.getFirstMillisecond(calendar23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year(0);
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            year1.peg(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        java.util.TimeZone timeZone7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year8 = new org.jfree.data.time.Year(date6, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        org.jfree.data.time.SerialDate serialDate15 = day10.getSerialDate();
        java.lang.Number number16 = null;
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day10, number16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day();
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) day20, (double) (short) 0, false);
        java.util.Date date24 = day20.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond25 = new org.jfree.data.time.FixedMillisecond(date24);
        long long26 = fixedMillisecond25.getFirstMillisecond();
        java.util.Date date27 = fixedMillisecond25.getTime();
        int int28 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) fixedMillisecond25);
        java.lang.Object obj29 = timeSeries1.clone();
        java.lang.Number number31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (short) -1, number31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1711868400000L + "'", long26 == 1711868400000L);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day3);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        timeSeries9.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries9.getNextTimePeriod();
        timeSeries9.setMaximumItemCount((int) ' ');
        org.jfree.data.time.Year year20 = new org.jfree.data.time.Year(0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries9.getRawDataItem((org.jfree.data.time.RegularTimePeriod) year20);
        java.util.Collection collection22 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond((long) 9999);
        long long2 = fixedMillisecond1.getMiddleMillisecond();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9999L + "'", long2 == 9999L);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 1711911599999L);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1711911599999L, "31-March-2024", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        timeSeries20.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day29 = new org.jfree.data.time.Day();
        timeSeries28.add((org.jfree.data.time.RegularTimePeriod) day29, (double) (short) 0, false);
        java.util.Date date33 = day29.getStart();
        int int34 = timeSeries20.getIndex((org.jfree.data.time.RegularTimePeriod) day29);
        java.lang.Class class35 = timeSeries20.timePeriodClass;
        org.jfree.data.time.Day day36 = new org.jfree.data.time.Day();
        int int37 = day36.getMonth();
        java.util.Date date38 = day36.getEnd();
        java.util.TimeZone timeZone39 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = org.jfree.data.time.RegularTimePeriod.createInstance(class35, date38, timeZone39);
        boolean boolean41 = timeSeries18.equals((java.lang.Object) timeZone39);
        java.lang.Object obj42 = timeSeries18.clone();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day45 = new org.jfree.data.time.Day();
        timeSeries44.add((org.jfree.data.time.RegularTimePeriod) day45, (double) (short) 0, false);
        timeSeries44.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = timeSeries44.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries44.addChangeListener(seriesChangeListener52);
        timeSeries44.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day58 = new org.jfree.data.time.Day();
        timeSeries57.add((org.jfree.data.time.RegularTimePeriod) day58, (double) (short) 0, false);
        java.util.Date date62 = day58.getStart();
        java.lang.Number number63 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem64 = timeSeries44.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day58, number63);
        java.lang.Number number65 = timeSeriesDataItem64.getValue();
        timeSeriesDataItem64.setValue((java.lang.Number) 1.0f);
        timeSeries18.add(timeSeriesDataItem64, false);
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener70);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sun Mar 31 23:59:59 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(regularTimePeriod51);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem64);
        org.junit.Assert.assertEquals("'" + number65 + "' != '" + 0.0d + "'", number65, 0.0d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        int int0 = org.jfree.data.time.MonthConstants.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double14 = timeSeries13.getMaxY();
        java.lang.Comparable comparable15 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries1.addAndOrUpdate(timeSeries13);
        double double17 = timeSeries1.getMinY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day();
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) day20, (double) (short) 0, false);
        java.util.Date date24 = day20.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond25 = new org.jfree.data.time.FixedMillisecond(date24);
        java.util.Date date26 = fixedMillisecond25.getTime();
        java.util.Calendar calendar27 = null;
        long long28 = fixedMillisecond25.getLastMillisecond(calendar27);
        long long29 = fixedMillisecond25.getMiddleMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond25, (double) (byte) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = fixedMillisecond25.previous();
        java.util.Calendar calendar33 = null;
        long long34 = fixedMillisecond25.getMiddleMillisecond(calendar33);
        java.lang.Number number35 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) fixedMillisecond25);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 100L + "'", comparable15, 100L);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1711868400000L + "'", long28 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1711868400000L + "'", long29 == 1711868400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1711868400000L + "'", long34 == 1711868400000L);
        org.junit.Assert.assertEquals("'" + number35 + "' != '" + 0.0d + "'", number35, 0.0d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.data.general.SeriesException seriesException1 = new org.jfree.data.general.SeriesException("31-March-2024");
        java.lang.String str2 = seriesException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jfree.data.general.SeriesException: 31-March-2024" + "'", str2, "org.jfree.data.general.SeriesException: 31-March-2024");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        timeSeries1.setMaximumItemCount((int) ' ');
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.Month month12 = new org.jfree.data.time.Month();
        long long13 = month12.getFirstMillisecond();
        org.jfree.data.time.Year year14 = month12.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = year14.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = year14.previous();
        long long17 = year14.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year14, (java.lang.Number) 1711868400000L);
        int int20 = year14.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) year14, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1709280000000L + "'", long13 == 1709280000000L);
        org.junit.Assert.assertNotNull(year14);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2024L + "'", long17 == 2024L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2024 + "'", int20 == 2024);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(0, 9999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Month outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        timeSeries1.setRangeDescription("31-March-2024");
        long long10 = timeSeries1.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries1.getRawDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.general.SeriesException seriesException1 = new org.jfree.data.general.SeriesException("Time");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year(0);
        long long2 = year1.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year1.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year1.next();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException1 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException3 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException1.addSuppressed((java.lang.Throwable) timePeriodFormatException3);
        java.lang.Throwable[] throwableArray5 = timePeriodFormatException3.getSuppressed();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodFormatException3.addSuppressed(throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        java.util.Date date19 = day15.getStart();
        java.lang.Number number20 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, number20);
        java.lang.String str22 = day15.toString();
        java.util.Calendar calendar23 = null;
        // The following exception was thrown during execution in test generation
        try {
            day15.peg(calendar23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "31-March-2024" + "'", str22, "31-March-2024");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.previous();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries5.addChangeListener(seriesChangeListener6);
        long long8 = timeSeries5.getMaximumItemAge();
        java.lang.String str9 = timeSeries5.getDescription();
        double double10 = timeSeries5.getMaxY();
        java.lang.Object obj11 = timeSeries5.clone();
        int int12 = year2.compareTo(obj11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = year2.previous();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double27 = timeSeries26.getMaxY();
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        java.lang.Number number29 = null;
        timeSeries26.add((org.jfree.data.time.RegularTimePeriod) day28, number29, false);
        double double32 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day35 = new org.jfree.data.time.Day();
        timeSeries34.add((org.jfree.data.time.RegularTimePeriod) day35, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries26.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day35, (java.lang.Number) 1711911599999L);
        int int42 = timeSeriesDataItem40.compareTo((java.lang.Object) (byte) -1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries1.addOrUpdate(timeSeriesDataItem40);
        java.lang.Object obj44 = timeSeries1.clone();
        int int45 = timeSeries1.getItemCount();
        double double46 = timeSeries1.getMinY();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "31-March-2024" + "'", str22, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeriesDataItem40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(timeSeriesDataItem43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        java.util.Calendar calendar9 = null;
        long long10 = fixedMillisecond7.getLastMillisecond(calendar9);
        long long11 = fixedMillisecond7.getSerialIndex();
        java.util.Calendar calendar12 = null;
        long long13 = fixedMillisecond7.getFirstMillisecond(calendar12);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1711868400000L + "'", long11 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        java.util.Calendar calendar9 = null;
        long long10 = fixedMillisecond7.getLastMillisecond(calendar9);
        java.util.Calendar calendar11 = null;
        long long12 = fixedMillisecond7.getMiddleMillisecond(calendar11);
        java.util.Calendar calendar13 = null;
        long long14 = fixedMillisecond7.getLastMillisecond(calendar13);
        java.util.Date date15 = fixedMillisecond7.getTime();
        java.util.Calendar calendar16 = null;
        long long17 = fixedMillisecond7.getLastMillisecond(calendar16);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711868400000L + "'", long12 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1711868400000L + "'", long14 == 1711868400000L);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1711868400000L + "'", long17 == 1711868400000L);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = day0.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = day0.previous();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = regularTimePeriod4.getFirstMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 1711911599999L);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1711911599999L, "31-March-2024", "");
        java.lang.Comparable comparable19 = timeSeries18.getKey();
        timeSeries18.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries24 = timeSeries18.createCopy(regularTimePeriod22, regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 1711911599999L + "'", comparable19, 1711911599999L);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = day12.next();
        java.util.Calendar calendar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = day12.getFirstMillisecond(calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        timeSeries1.fireSeriesChanged();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection9 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        long long12 = day6.getSerialIndex();
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 45382L + "'", long12 == 45382L);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException1 = new org.jfree.data.time.TimePeriodFormatException("2024");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 1711911599999L);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) timeSeriesDataItem15);
        java.lang.Class<?> wildcardClass17 = timeSeries16.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        org.jfree.data.time.Year year3 = month2.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year3.next();
        long long5 = year3.getLastMillisecond();
        org.junit.Assert.assertNotNull(year3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-61851744000001L) + "'", long5 == (-61851744000001L));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.SerialDate serialDate17 = day12.getSerialDate();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(serialDate17);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        long long8 = fixedMillisecond7.getFirstMillisecond();
        long long9 = fixedMillisecond7.getMiddleMillisecond();
        java.util.Date date10 = fixedMillisecond7.getTime();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = fixedMillisecond7.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = fixedMillisecond7.next();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711868400000L + "'", long8 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711868400000L + "'", long9 == 1711868400000L);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        long long4 = year2.getFirstMillisecond();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = year2.getFirstMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1704096000000L + "'", long4 == 1704096000000L);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year2.previous();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) year2);
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            year2.peg(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        org.jfree.data.time.SerialDate serialDate15 = day10.getSerialDate();
        java.lang.Number number16 = null;
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day10, number16);
        org.jfree.data.time.Month month18 = new org.jfree.data.time.Month();
        long long19 = month18.getFirstMillisecond();
        org.jfree.data.time.Year year20 = month18.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = year20.next();
        long long22 = year20.getLastMillisecond();
        boolean boolean24 = year20.equals((java.lang.Object) "October 9");
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries28.addChangeListener(seriesChangeListener29);
        long long31 = timeSeries28.getMaximumItemAge();
        java.lang.String str32 = timeSeries28.getDescription();
        int int33 = timeSeries28.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day36 = new org.jfree.data.time.Day();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) day36, (double) (short) 0, false);
        java.util.Date date40 = day36.getStart();
        org.jfree.data.time.SerialDate serialDate41 = day36.getSerialDate();
        java.lang.String str42 = day36.toString();
        java.lang.Number number43 = null;
        timeSeries28.add((org.jfree.data.time.RegularTimePeriod) day36, number43);
        timeSeries26.add((org.jfree.data.time.RegularTimePeriod) day36, (double) (short) 0, true);
        org.jfree.data.time.FixedMillisecond fixedMillisecond48 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = timeSeries26.getRawDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond48);
        int int50 = year20.compareTo((java.lang.Object) timeSeriesDataItem49);
        long long51 = year20.getLastMillisecond();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) year20, (double) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1709280000000L + "'", long19 == 1709280000000L);
        org.junit.Assert.assertNotNull(year20);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1735718399999L + "'", long22 == 1735718399999L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "31-March-2024" + "'", str42, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1735718399999L + "'", long51 == 1735718399999L);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        java.lang.String str3 = day0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = day0.previous();
        long long5 = day0.getSerialIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-March-2024" + "'", str3, "31-March-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 45382L + "'", long5 == 45382L);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.TimeZone timeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year10 = new org.jfree.data.time.Year(date6, timeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        java.util.Date date19 = day15.getStart();
        java.lang.Number number20 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, number20);
        org.jfree.data.time.Month month22 = new org.jfree.data.time.Month();
        long long23 = month22.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = month22.previous();
        boolean boolean26 = month22.equals((java.lang.Object) 10.0d);
        long long27 = month22.getSerialIndex();
        java.lang.Object obj28 = null;
        int int29 = month22.compareTo(obj28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = month22.previous();
        java.lang.Number number31 = timeSeries1.getValue(regularTimePeriod30);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1709280000000L + "'", long23 == 1709280000000L);
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 24291L + "'", long27 == 24291L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod30);
        org.junit.Assert.assertNull(number31);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.util.Date date3 = month2.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = month2.next();
        long long5 = month2.getSerialIndex();
        java.util.Date date6 = month2.getStart();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = month2.getFirstMillisecond(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 118L + "'", long5 == 118L);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Oct 01 00:00:00 PST 9");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year(8);
        java.lang.String str2 = year1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8" + "'", str2, "8");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        int int11 = timeSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy(31, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.data.time.Year year1 = org.jfree.data.time.Year.parseYear("9");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = year1.next();
        org.junit.Assert.assertNotNull(year1);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        boolean boolean17 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        long long22 = timeSeries19.getMaximumItemAge();
        boolean boolean23 = timeSeries1.equals((java.lang.Object) timeSeries19);
        java.lang.Class class24 = null;
        timeSeries1.timePeriodClass = class24;
        timeSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(0, (java.lang.Number) 1711938995383L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        long long8 = fixedMillisecond7.getFirstMillisecond();
        long long9 = fixedMillisecond7.getMiddleMillisecond();
        java.util.Date date10 = fixedMillisecond7.getTime();
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month(date10);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711868400000L + "'", long8 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711868400000L + "'", long9 == 1711868400000L);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        java.lang.String str8 = day2.toString();
        java.lang.String str9 = day2.toString();
        int int10 = day2.getMonth();
        long long11 = day2.getFirstMillisecond();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31-March-2024" + "'", str8, "31-March-2024");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-March-2024" + "'", str9, "31-March-2024");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1711868400000L + "'", long11 == 1711868400000L);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double14 = timeSeries13.getMaxY();
        java.lang.Comparable comparable15 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries1.addAndOrUpdate(timeSeries13);
        timeSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(9, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 100L + "'", comparable15, 100L);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        timeSeries1.clear();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        long long5 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        int int12 = timeSeries1.getItemCount();
        java.util.List list13 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries1.getValue(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number3 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, number3);
        long long5 = month2.getSerialIndex();
        java.util.Date date6 = month2.getStart();
        java.util.Date date7 = month2.getStart();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = month2.getLastMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 118L + "'", long5 == 118L);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Tue Oct 01 00:00:00 PST 9");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        timeSeries1.setMaximumItemAge(1711938995383L);
        java.util.List list10 = timeSeries1.data;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = new org.jfree.data.time.TimeSeriesDataItem(regularTimePeriod0, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double14 = timeSeries13.getMaxY();
        java.lang.Comparable comparable15 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries1.addAndOrUpdate(timeSeries13);
        org.jfree.data.time.Month month17 = new org.jfree.data.time.Month();
        long long18 = month17.getFirstMillisecond();
        org.jfree.data.time.Year year19 = month17.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = year19.next();
        long long21 = year19.getLastMillisecond();
        long long22 = year19.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries24.addChangeListener(seriesChangeListener25);
        long long27 = timeSeries24.getMaximumItemAge();
        java.lang.String str28 = timeSeries24.getDescription();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        java.util.Date date35 = day31.getStart();
        long long36 = day31.getFirstMillisecond();
        timeSeries24.add((org.jfree.data.time.RegularTimePeriod) day31, (java.lang.Number) 10, false);
        boolean boolean40 = year19.equals((java.lang.Object) timeSeries24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = year19.previous();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.update((org.jfree.data.time.RegularTimePeriod) year19, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: There is no existing value for the specified 'period'.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 100L + "'", comparable15, 100L);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1709280000000L + "'", long18 == 1709280000000L);
        org.junit.Assert.assertNotNull(year19);
        org.junit.Assert.assertNotNull(regularTimePeriod20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1735718399999L + "'", long21 == 1735718399999L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1704096000000L + "'", long22 == 1704096000000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1711868400000L + "'", long36 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod41);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number3 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, number3);
        long long5 = month2.getSerialIndex();
        java.util.Date date6 = month2.getStart();
        long long7 = month2.getLastMillisecond();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 118L + "'", long5 == 118L);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-61857014400001L) + "'", long7 == (-61857014400001L));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = day12.next();
        org.jfree.data.time.Month month20 = new org.jfree.data.time.Month(10, 9);
        java.util.Date date21 = month20.getStart();
        org.jfree.data.time.Year year22 = month20.getYear();
        int int23 = day12.compareTo((java.lang.Object) year22);
        java.lang.String str24 = year22.toString();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertNotNull(year22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "9" + "'", str24, "9");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 1711911599999L);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1711911599999L, "31-March-2024", "");
        java.lang.Comparable comparable19 = timeSeries18.getKey();
        timeSeries18.removeAgedItems(false);
        org.jfree.data.time.Month month22 = new org.jfree.data.time.Month();
        long long23 = month22.getFirstMillisecond();
        long long24 = month22.getSerialIndex();
        int int25 = month22.getYearValue();
        timeSeries18.setKey((java.lang.Comparable) month22);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries29 = timeSeries18.createCopy(1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 1711911599999L + "'", comparable19, 1711911599999L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1709280000000L + "'", long23 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 24291L + "'", long24 == 24291L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2024 + "'", int25 == 2024);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.Month month24 = new org.jfree.data.time.Month();
        long long25 = month24.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries27.removeChangeListener(seriesChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day32 = new org.jfree.data.time.Day();
        timeSeries31.add((org.jfree.data.time.RegularTimePeriod) day32, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries27.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day32, (java.lang.Number) 10L);
        long long38 = day32.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries21.createCopy((org.jfree.data.time.RegularTimePeriod) month24, (org.jfree.data.time.RegularTimePeriod) day32);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        timeSeries41.add((org.jfree.data.time.RegularTimePeriod) day42, (double) (short) 0, false);
        timeSeries41.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = timeSeries41.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent50 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean51 = timeSeries41.equals((java.lang.Object) seriesChangeEvent50);
        org.jfree.data.time.Day day52 = new org.jfree.data.time.Day();
        int int54 = day52.compareTo((java.lang.Object) (short) 100);
        java.lang.String str55 = day52.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem56 = timeSeries41.getDataItem((org.jfree.data.time.RegularTimePeriod) day52);
        timeSeriesDataItem56.setSelected(false);
        timeSeriesDataItem56.setValue((java.lang.Number) (byte) 100);
        boolean boolean61 = timeSeriesDataItem56.isSelected();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = timeSeries21.addOrUpdate(timeSeriesDataItem56);
        org.jfree.data.time.Day day63 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem65 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day63, (java.lang.Number) (byte) 10);
        int int66 = timeSeriesDataItem56.compareTo((java.lang.Object) (byte) 10);
        boolean boolean67 = month4.equals((java.lang.Object) timeSeriesDataItem56);
        long long68 = month4.getFirstMillisecond();
        java.util.Date date69 = month4.getStart();
        java.util.TimeZone timeZone70 = null;
        java.util.Locale locale71 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year72 = new org.jfree.data.time.Year(date69, timeZone70, locale71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1709280000000L + "'", long25 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1711911599999L + "'", long38 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(regularTimePeriod48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "31-March-2024" + "'", str55, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(timeSeriesDataItem62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1709280000000L + "'", long68 == 1709280000000L);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Fri Mar 01 00:00:00 PST 2024");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        timeSeries19.setMaximumItemCount((int) (short) 0);
        timeSeries19.setDescription("9");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int1 = day0.getMonth();
        org.jfree.data.time.SerialDate serialDate2 = day0.getSerialDate();
        java.util.Date date3 = day0.getStart();
        java.lang.String str4 = day0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(serialDate2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "31-March-2024" + "'", str4, "31-March-2024");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month(10, 9);
        java.lang.String str10 = month9.toString();
        boolean boolean11 = timeSeries1.equals((java.lang.Object) str10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "October 9" + "'", str10, "October 9");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries8 = timeSeries1.createCopy((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getSerialIndex();
        long long3 = month0.getSerialIndex();
        int int4 = month0.getMonth();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        int int7 = timeSeries6.getMaximumItemCount();
        int int8 = month0.compareTo((java.lang.Object) timeSeries6);
        java.lang.Object obj9 = null;
        boolean boolean10 = month0.equals(obj9);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24291L + "'", long2 == 24291L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 24291L + "'", long3 == 24291L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        java.util.Calendar calendar9 = null;
        long long10 = fixedMillisecond7.getLastMillisecond(calendar9);
        long long11 = fixedMillisecond7.getMiddleMillisecond();
        java.util.Date date12 = fixedMillisecond7.getTime();
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day(date12);
        int int14 = day13.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = day13.next();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1711868400000L + "'", long11 == 1711868400000L);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2024 + "'", int14 == 2024);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        timeSeries1.fireSeriesChanged();
        timeSeries1.fireSeriesChanged();
        java.lang.String str8 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getSerialIndex();
        int int3 = month0.getYearValue();
        long long4 = month0.getLastMillisecond();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        double double7 = timeSeries6.getMinY();
        timeSeries6.setDescription("March 2024");
        timeSeries6.removeAgedItems(0L, true);
        double double13 = timeSeries6.getMaxY();
        int int14 = month0.compareTo((java.lang.Object) timeSeries6);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24291L + "'", long2 == 24291L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2024 + "'", int3 == 2024);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1711954799999L + "'", long4 == 1711954799999L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getSerialIndex();
        long long3 = month0.getFirstMillisecond();
        long long4 = month0.getFirstMillisecond();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24291L + "'", long2 == 24291L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1709280000000L + "'", long3 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1709280000000L + "'", long4 == 1709280000000L);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        int int12 = timeSeries1.getItemCount();
        java.util.List list13 = timeSeries1.getItems();
        timeSeries1.clear();
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        timeSeries7.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries7.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries7.addChangeListener(seriesChangeListener15);
        timeSeries7.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        java.util.Date date25 = day21.getStart();
        java.lang.Number number26 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day21, number26);
        timeSeries1.add(timeSeriesDataItem27);
        double double29 = timeSeries1.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (byte) 1, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        java.util.Calendar calendar9 = null;
        long long10 = fixedMillisecond7.getLastMillisecond(calendar9);
        long long11 = fixedMillisecond7.getMiddleMillisecond();
        java.util.Date date12 = fixedMillisecond7.getTime();
        int int14 = fixedMillisecond7.compareTo((java.lang.Object) "October 9");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1711868400000L + "'", long11 == 1711868400000L);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        long long12 = day6.getMiddleMillisecond();
        java.util.Calendar calendar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = day6.getLastMillisecond(calendar13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711911599999L + "'", long12 == 1711911599999L);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.util.Date date3 = month2.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = month2.next();
        long long5 = month2.getSerialIndex();
        java.util.Date date6 = month2.getStart();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, (double) (short) 100);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 118L + "'", long5 == 118L);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Oct 01 00:00:00 PST 9");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year2.previous();
        int int5 = year2.getYear();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            year2.peg(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2024 + "'", int5 == 2024);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        java.util.Calendar calendar9 = null;
        long long10 = fixedMillisecond7.getLastMillisecond(calendar9);
        java.util.Calendar calendar11 = null;
        long long12 = fixedMillisecond7.getMiddleMillisecond(calendar11);
        java.util.Date date13 = fixedMillisecond7.getTime();
        java.util.TimeZone timeZone14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day15 = new org.jfree.data.time.Day(date13, timeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711868400000L + "'", long12 == 1711868400000L);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        long long8 = fixedMillisecond7.getFirstMillisecond();
        java.util.Date date9 = fixedMillisecond7.getTime();
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date9);
        long long11 = month10.getSerialIndex();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711868400000L + "'", long8 == 1711868400000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 24291L + "'", long11 == 24291L);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond((long) 6);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 1711911599999L);
        timeSeriesDataItem15.setValue((java.lang.Number) 2);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        timeSeriesDataItem16.setSelected(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeriesDataItem16.getPeriod();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = new org.jfree.data.time.TimeSeriesDataItem(regularTimePeriod19, (double) (short) -1);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        timeSeries9.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        java.util.Date date22 = day18.getStart();
        org.jfree.data.time.SerialDate serialDate23 = day18.getSerialDate();
        java.lang.Number number24 = null;
        timeSeries9.update((org.jfree.data.time.RegularTimePeriod) day18, number24);
        java.lang.Number number26 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) day18);
        int int27 = timeSeries1.getItemCount();
        timeSeries1.setDescription("org.jfree.data.event.SeriesChangeEvent[source=true]");
        java.lang.Object obj30 = timeSeries1.clone();
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate23);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 0.0d + "'", number26, 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.util.List list3 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) 12, false);
        org.jfree.data.time.Day day7 = new org.jfree.data.time.Day();
        int int9 = day7.compareTo((java.lang.Object) (short) 100);
        long long10 = day7.getMiddleMillisecond();
        int int11 = day7.getYear();
        boolean boolean13 = day7.equals((java.lang.Object) 5);
        int int14 = day7.getDayOfMonth();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day7, (double) 3);
        java.lang.Comparable comparable17 = timeSeries1.getKey();
        timeSeries1.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711911599999L + "'", long10 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2024 + "'", int11 == 2024);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
        org.junit.Assert.assertNull(timeSeriesDataItem16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 100L + "'", comparable17, 100L);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        org.jfree.data.time.Month month17 = new org.jfree.data.time.Month();
        long long18 = month17.getFirstMillisecond();
        long long19 = month17.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = month17.next();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) month17, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1709280000000L + "'", long18 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 24291L + "'", long19 == 24291L);
        org.junit.Assert.assertNotNull(regularTimePeriod20);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day3 = new org.jfree.data.time.Day((int) (short) 100, 0, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(31, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Month outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        long long3 = year2.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year2.next();
        long long5 = year2.getMiddleMillisecond();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1704096000000L + "'", long3 == 1704096000000L);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1719907199999L + "'", long5 == 1719907199999L);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year6 = month4.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = year6.next();
        long long8 = year6.getLastMillisecond();
        java.lang.Number number9 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) year6, number9);
        int int11 = year6.getYear();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) year6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = year6.previous();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNotNull(year6);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1735718399999L + "'", long8 == 1735718399999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2024 + "'", int11 == 2024);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        long long8 = fixedMillisecond7.getFirstMillisecond();
        java.util.Date date9 = fixedMillisecond7.getTime();
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date9);
        int int11 = month10.getMonth();
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = month10.getLastMillisecond(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711868400000L + "'", long8 == 1711868400000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        boolean boolean17 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        long long22 = timeSeries19.getMaximumItemAge();
        boolean boolean23 = timeSeries1.equals((java.lang.Object) timeSeries19);
        java.lang.Class class24 = null;
        timeSeries1.timePeriodClass = class24;
        double double26 = timeSeries1.getMinY();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day0, (java.lang.Number) (byte) 10);
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            day0.peg(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        java.util.List list3 = timeSeries1.getItems();
        java.lang.Class class4 = timeSeries1.timePeriodClass;
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(9, number6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.Month month24 = new org.jfree.data.time.Month();
        long long25 = month24.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries27.removeChangeListener(seriesChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day32 = new org.jfree.data.time.Day();
        timeSeries31.add((org.jfree.data.time.RegularTimePeriod) day32, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries27.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day32, (java.lang.Number) 10L);
        long long38 = day32.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries21.createCopy((org.jfree.data.time.RegularTimePeriod) month24, (org.jfree.data.time.RegularTimePeriod) day32);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        timeSeries41.add((org.jfree.data.time.RegularTimePeriod) day42, (double) (short) 0, false);
        timeSeries41.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = timeSeries41.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent50 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean51 = timeSeries41.equals((java.lang.Object) seriesChangeEvent50);
        org.jfree.data.time.Day day52 = new org.jfree.data.time.Day();
        int int54 = day52.compareTo((java.lang.Object) (short) 100);
        java.lang.String str55 = day52.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem56 = timeSeries41.getDataItem((org.jfree.data.time.RegularTimePeriod) day52);
        timeSeriesDataItem56.setSelected(false);
        timeSeriesDataItem56.setValue((java.lang.Number) (byte) 100);
        boolean boolean61 = timeSeriesDataItem56.isSelected();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = timeSeries21.addOrUpdate(timeSeriesDataItem56);
        org.jfree.data.time.Day day63 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem65 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day63, (java.lang.Number) (byte) 10);
        int int66 = timeSeriesDataItem56.compareTo((java.lang.Object) (byte) 10);
        boolean boolean67 = month4.equals((java.lang.Object) timeSeriesDataItem56);
        long long68 = month4.getFirstMillisecond();
        java.util.Calendar calendar69 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long70 = month4.getFirstMillisecond(calendar69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1709280000000L + "'", long25 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1711911599999L + "'", long38 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(regularTimePeriod48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "31-March-2024" + "'", str55, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(timeSeriesDataItem62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1709280000000L + "'", long68 == 1709280000000L);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        java.util.List list17 = timeSeries1.data;
        java.lang.String str18 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        timeSeries20.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries20.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent29 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean30 = timeSeries20.equals((java.lang.Object) seriesChangeEvent29);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        int int33 = day31.compareTo((java.lang.Object) (short) 100);
        java.lang.String str34 = day31.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries20.getDataItem((org.jfree.data.time.RegularTimePeriod) day31);
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) day31);
        java.util.Calendar calendar37 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long38 = day31.getMiddleMillisecond(calendar37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertNotNull(regularTimePeriod27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "31-March-2024" + "'", str34, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem35);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        timeSeries9.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        java.util.Date date22 = day18.getStart();
        org.jfree.data.time.SerialDate serialDate23 = day18.getSerialDate();
        java.lang.Number number24 = null;
        timeSeries9.update((org.jfree.data.time.RegularTimePeriod) day18, number24);
        java.lang.Number number26 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) day18);
        int int27 = timeSeries1.getItemCount();
        int int28 = timeSeries1.getItemCount();
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate23);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 0.0d + "'", number26, 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        java.lang.String str3 = month0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = month0.previous();
        long long5 = month0.getFirstMillisecond();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "March 2024" + "'", str3, "March 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent1 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo2 = null;
        seriesChangeEvent1.setSummary(seriesChangeInfo2);
        java.lang.Object obj4 = seriesChangeEvent1.getSource();
        java.lang.Object obj5 = seriesChangeEvent1.getSource();
        java.lang.Object obj6 = seriesChangeEvent1.getSource();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0d + "'", obj6, 10.0d);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        int int15 = day13.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = day13.next();
        timeSeries1.add(regularTimePeriod16, (java.lang.Number) 1);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        java.util.Date date25 = day21.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond26 = new org.jfree.data.time.FixedMillisecond(date25);
        long long27 = fixedMillisecond26.getFirstMillisecond();
        java.util.Calendar calendar28 = null;
        fixedMillisecond26.peg(calendar28);
        long long30 = fixedMillisecond26.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = fixedMillisecond26.next();
        java.util.Calendar calendar32 = null;
        long long33 = regularTimePeriod31.getLastMillisecond(calendar32);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day36 = new org.jfree.data.time.Day();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) day36, (double) (short) 0, false);
        java.util.Date date40 = day36.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond41 = new org.jfree.data.time.FixedMillisecond(date40);
        long long42 = fixedMillisecond41.getFirstMillisecond();
        java.util.Date date43 = fixedMillisecond41.getTime();
        org.jfree.data.time.FixedMillisecond fixedMillisecond44 = new org.jfree.data.time.FixedMillisecond(date43);
        java.util.Calendar calendar45 = null;
        long long46 = fixedMillisecond44.getFirstMillisecond(calendar45);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries47 = timeSeries1.createCopy(regularTimePeriod31, (org.jfree.data.time.RegularTimePeriod) fixedMillisecond44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start on or before end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1711868400000L + "'", long27 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1711868400000L + "'", long30 == 1711868400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1711868400001L + "'", long33 == 1711868400001L);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1711868400000L + "'", long42 == 1711868400000L);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1711868400000L + "'", long46 == 1711868400000L);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year6 = month4.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = year6.next();
        long long8 = year6.getLastMillisecond();
        java.lang.Number number9 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) year6, number9);
        int int11 = year6.getYear();
        java.lang.String str12 = year6.toString();
        java.util.Calendar calendar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            year6.peg(calendar13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNotNull(year6);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1735718399999L + "'", long8 == 1735718399999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2024 + "'", int11 == 2024);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2024" + "'", str12, "2024");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent4 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries1);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo5 = seriesChangeEvent4.getSummary();
        java.lang.Object obj6 = seriesChangeEvent4.getSource();
        java.lang.String str7 = seriesChangeEvent4.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertNull(seriesChangeInfo5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month1 = org.jfree.data.time.Month.parseMonth("org.jfree.data.event.SeriesChangeEvent[source=10.0]");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException; message: Can't evaluate the month.");
        } catch (org.jfree.data.time.TimePeriodFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        java.util.Date date19 = day15.getStart();
        java.lang.Number number20 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, number20);
        java.lang.Number number22 = timeSeriesDataItem21.getValue();
        timeSeriesDataItem21.setValue((java.lang.Number) 1.0f);
        timeSeriesDataItem21.setValue((java.lang.Number) (byte) 0);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0.0d + "'", number22, 0.0d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.util.List list3 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) 12, false);
        org.jfree.data.time.Day day7 = new org.jfree.data.time.Day();
        int int9 = day7.compareTo((java.lang.Object) (short) 100);
        long long10 = day7.getMiddleMillisecond();
        int int11 = day7.getYear();
        boolean boolean13 = day7.equals((java.lang.Object) 5);
        int int14 = day7.getDayOfMonth();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day7, (double) 3);
        java.lang.Comparable comparable17 = timeSeries1.getKey();
        timeSeries1.setNotify(true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711911599999L + "'", long10 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2024 + "'", int11 == 2024);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
        org.junit.Assert.assertNull(timeSeriesDataItem16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 100L + "'", comparable17, 100L);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent1 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 1L);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo2 = seriesChangeEvent1.getSummary();
        java.lang.String str3 = seriesChangeEvent1.toString();
        org.junit.Assert.assertNull(seriesChangeInfo2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jfree.data.event.SeriesChangeEvent[source=1]" + "'", str3, "org.jfree.data.event.SeriesChangeEvent[source=1]");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        long long9 = fixedMillisecond7.getFirstMillisecond();
        long long10 = fixedMillisecond7.getSerialIndex();
        long long11 = fixedMillisecond7.getFirstMillisecond();
        java.util.Date date12 = fixedMillisecond7.getTime();
        java.util.TimeZone timeZone13 = null;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year15 = new org.jfree.data.time.Year(date12, timeZone13, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711868400000L + "'", long9 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1711868400000L + "'", long11 == 1711868400000L);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        timeSeries1.setMaximumItemCount((int) ' ');
        timeSeries1.fireSeriesChanged();
        timeSeries1.setMaximumItemAge((long) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.getDataItem(9999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9999, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        java.lang.String str8 = day2.toString();
        java.lang.String str9 = day2.toString();
        java.lang.String str10 = day2.toString();
        long long11 = day2.getLastMillisecond();
        long long12 = day2.getSerialIndex();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31-March-2024" + "'", str8, "31-March-2024");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-March-2024" + "'", str9, "31-March-2024");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "31-March-2024" + "'", str10, "31-March-2024");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1711954799999L + "'", long11 == 1711954799999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 45382L + "'", long12 == 45382L);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int1 = day0.getMonth();
        org.jfree.data.time.SerialDate serialDate2 = day0.getSerialDate();
        java.util.Date date3 = day0.getStart();
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day5 = new org.jfree.data.time.Day(date3, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(serialDate2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = day2.next();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) regularTimePeriod7);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year(0);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        int int3 = day2.getMonth();
        java.util.Date date4 = day2.getEnd();
        boolean boolean5 = year1.equals((java.lang.Object) day2);
        long long6 = year1.getSerialIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sun Mar 31 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        boolean boolean17 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        long long22 = timeSeries19.getMaximumItemAge();
        boolean boolean23 = timeSeries1.equals((java.lang.Object) timeSeries19);
        org.jfree.data.time.Month month24 = new org.jfree.data.time.Month();
        long long25 = month24.getFirstMillisecond();
        org.jfree.data.time.Year year26 = month24.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = year26.next();
        long long28 = year26.getLastMillisecond();
        long long29 = year26.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries31.addChangeListener(seriesChangeListener32);
        long long34 = timeSeries31.getMaximumItemAge();
        java.lang.String str35 = timeSeries31.getDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day38 = new org.jfree.data.time.Day();
        timeSeries37.add((org.jfree.data.time.RegularTimePeriod) day38, (double) (short) 0, false);
        java.util.Date date42 = day38.getStart();
        long long43 = day38.getFirstMillisecond();
        timeSeries31.add((org.jfree.data.time.RegularTimePeriod) day38, (java.lang.Number) 10, false);
        boolean boolean47 = year26.equals((java.lang.Object) timeSeries31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = year26.previous();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.update((org.jfree.data.time.RegularTimePeriod) year26, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: There is no existing value for the specified 'period'.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1709280000000L + "'", long25 == 1709280000000L);
        org.junit.Assert.assertNotNull(year26);
        org.junit.Assert.assertNotNull(regularTimePeriod27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1735718399999L + "'", long28 == 1735718399999L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1704096000000L + "'", long29 == 1704096000000L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1711868400000L + "'", long43 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod48);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException1 = new org.jfree.data.time.TimePeriodFormatException("9");
        java.lang.Throwable[] throwableArray2 = timePeriodFormatException1.getSuppressed();
        java.lang.String str3 = timePeriodFormatException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: 9" + "'", str3, "org.jfree.data.time.TimePeriodFormatException: 9");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        timeSeries18.add((org.jfree.data.time.RegularTimePeriod) day19, (double) (short) 0, false);
        java.util.Date date23 = day19.getStart();
        java.util.TimeZone timeZone24 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = org.jfree.data.time.RegularTimePeriod.createInstance(class16, date23, timeZone24);
        java.util.TimeZone timeZone26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month27 = new org.jfree.data.time.Month(date23, timeZone26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod25);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        java.util.List list17 = timeSeries1.data;
        java.lang.String str18 = timeSeries1.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeries1.getNextTimePeriod();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertNotNull(regularTimePeriod19);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = month0.previous();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        int int15 = day13.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = day13.next();
        timeSeries1.add(regularTimePeriod16, (java.lang.Number) 1);
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number22 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month21, number22);
        long long24 = month21.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) month21);
        org.jfree.data.time.Year year26 = month21.getYear();
        java.util.Calendar calendar27 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long28 = year26.getFirstMillisecond(calendar27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 118L + "'", long24 == 118L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem25);
        org.junit.Assert.assertNotNull(year26);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day9, (java.lang.Number) (byte) 10);
        timeSeriesDataItem11.setValue((java.lang.Number) 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries1.addOrUpdate(timeSeriesDataItem11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        timeSeries16.add((org.jfree.data.time.RegularTimePeriod) day17, (double) (short) 0, false);
        java.util.Date date21 = day17.getStart();
        org.jfree.data.time.SerialDate serialDate22 = day17.getSerialDate();
        long long23 = day17.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = day17.previous();
        long long25 = regularTimePeriod24.getLastMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = new org.jfree.data.time.TimeSeriesDataItem(regularTimePeriod24, (double) 3);
        boolean boolean28 = timeSeries1.equals((java.lang.Object) timeSeriesDataItem27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = timeSeriesDataItem27.getPeriod();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(timeSeriesDataItem14);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711911599999L + "'", long23 == 1711911599999L);
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1711868399999L + "'", long25 == 1711868399999L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod29);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.data.time.Month month1 = new org.jfree.data.time.Month();
        long long2 = month1.getFirstMillisecond();
        org.jfree.data.time.Year year3 = month1.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year3.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = year3.previous();
        long long6 = year3.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year3, (java.lang.Number) 1711868400000L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month9 = new org.jfree.data.time.Month((int) (byte) -1, year3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Month outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1709280000000L + "'", long2 == 1709280000000L);
        org.junit.Assert.assertNotNull(year3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2024L + "'", long6 == 2024L);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.util.List list3 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) 12, false);
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        double double8 = timeSeries1.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) '4', (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 100L + "'", comparable7, 100L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries6.addChangeListener(seriesChangeListener7);
        long long9 = timeSeries6.getMaximumItemAge();
        java.lang.String str10 = timeSeries6.getDescription();
        double double11 = timeSeries6.getMinY();
        java.util.Collection collection12 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries6);
        org.jfree.data.time.Year year14 = new org.jfree.data.time.Year(0);
        long long15 = year14.getSerialIndex();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) year14, (java.lang.Number) 100L, true);
        timeSeries1.removeAgedItems(true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 1711911599999L);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1711911599999L, "31-March-2024", "");
        java.lang.Comparable comparable19 = timeSeries18.getKey();
        timeSeries18.removeAgedItems(false);
        int int22 = timeSeries18.getMaximumItemCount();
        timeSeries18.clear();
        int int24 = timeSeries18.getMaximumItemCount();
        int int25 = timeSeries18.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries18.getRawDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 1711911599999L + "'", comparable19, 1711911599999L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year2.previous();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) year2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = year2.previous();
        java.lang.Object obj7 = null;
        int int8 = year2.compareTo(obj7);
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = year2.getLastMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        timeSeries1.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        long long8 = fixedMillisecond7.getFirstMillisecond();
        java.util.Date date9 = fixedMillisecond7.getTime();
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date9);
        java.util.TimeZone timeZone11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year13 = new org.jfree.data.time.Year(date9, timeZone11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711868400000L + "'", long8 == 1711868400000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 1711911599999L);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1711911599999L, "31-March-2024", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        timeSeries20.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day29 = new org.jfree.data.time.Day();
        timeSeries28.add((org.jfree.data.time.RegularTimePeriod) day29, (double) (short) 0, false);
        java.util.Date date33 = day29.getStart();
        int int34 = timeSeries20.getIndex((org.jfree.data.time.RegularTimePeriod) day29);
        java.lang.Class class35 = timeSeries20.timePeriodClass;
        org.jfree.data.time.Day day36 = new org.jfree.data.time.Day();
        int int37 = day36.getMonth();
        java.util.Date date38 = day36.getEnd();
        java.util.TimeZone timeZone39 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = org.jfree.data.time.RegularTimePeriod.createInstance(class35, date38, timeZone39);
        boolean boolean41 = timeSeries18.equals((java.lang.Object) timeZone39);
        java.lang.Object obj42 = timeSeries18.clone();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day45 = new org.jfree.data.time.Day();
        timeSeries44.add((org.jfree.data.time.RegularTimePeriod) day45, (double) (short) 0, false);
        timeSeries44.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = timeSeries44.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries44.addChangeListener(seriesChangeListener52);
        timeSeries44.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day58 = new org.jfree.data.time.Day();
        timeSeries57.add((org.jfree.data.time.RegularTimePeriod) day58, (double) (short) 0, false);
        java.util.Date date62 = day58.getStart();
        java.lang.Number number63 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem64 = timeSeries44.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day58, number63);
        java.lang.Number number65 = timeSeriesDataItem64.getValue();
        timeSeriesDataItem64.setValue((java.lang.Number) 1.0f);
        timeSeries18.add(timeSeriesDataItem64, false);
        int int70 = timeSeries18.getItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sun Mar 31 23:59:59 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(regularTimePeriod51);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem64);
        org.junit.Assert.assertEquals("'" + number65 + "' != '" + 0.0d + "'", number65, 0.0d);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month();
        long long3 = month2.getFirstMillisecond();
        long long4 = month2.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, 0.0d);
        timeSeries1.add(timeSeriesDataItem6, false);
        timeSeries1.clear();
        java.lang.Class class10 = timeSeries1.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries1.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1709280000000L + "'", long3 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 24291L + "'", long4 == 24291L);
        org.junit.Assert.assertNull(class10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        org.jfree.data.time.SerialDate serialDate15 = day10.getSerialDate();
        java.lang.Number number16 = null;
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day10, number16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day();
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) day20, (double) (short) 0, false);
        java.util.Date date24 = day20.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond25 = new org.jfree.data.time.FixedMillisecond(date24);
        long long26 = fixedMillisecond25.getFirstMillisecond();
        java.util.Date date27 = fixedMillisecond25.getTime();
        int int28 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) fixedMillisecond25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries30.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries30.addChangeListener(seriesChangeListener38);
        timeSeries30.setDomainDescription("hi!");
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        int int44 = day42.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = day42.next();
        timeSeries30.add(regularTimePeriod45, (java.lang.Number) 1);
        java.lang.Number number48 = null;
        timeSeries1.add(regularTimePeriod45, number48);
        org.jfree.data.time.Month month50 = new org.jfree.data.time.Month();
        long long51 = month50.getFirstMillisecond();
        long long52 = month50.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem54 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month50, 0.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod55 = month50.next();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem56 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) month50);
        java.lang.Object obj57 = null;
        boolean boolean58 = timeSeries1.equals(obj57);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1711868400000L + "'", long26 == 1711868400000L);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod45);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1709280000000L + "'", long51 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 24291L + "'", long52 == 24291L);
        org.junit.Assert.assertNotNull(regularTimePeriod55);
        org.junit.Assert.assertNotNull(timeSeriesDataItem56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        long long3 = day0.getMiddleMillisecond();
        int int4 = day0.getYear();
        boolean boolean6 = day0.equals((java.lang.Object) 5);
        int int7 = day0.getDayOfMonth();
        long long8 = day0.getSerialIndex();
        long long9 = day0.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = day0.previous();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1711911599999L + "'", long3 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2024 + "'", int4 == 2024);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 45382L + "'", long8 == 45382L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711868400000L + "'", long9 == 1711868400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day22 = new org.jfree.data.time.Day();
        timeSeries21.add((org.jfree.data.time.RegularTimePeriod) day22, (double) (short) 0, false);
        timeSeries21.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = timeSeries21.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent30 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean31 = timeSeries21.equals((java.lang.Object) seriesChangeEvent30);
        org.jfree.data.time.Day day32 = new org.jfree.data.time.Day();
        int int34 = day32.compareTo((java.lang.Object) (short) 100);
        java.lang.String str35 = day32.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries21.getDataItem((org.jfree.data.time.RegularTimePeriod) day32);
        timeSeriesDataItem36.setSelected(false);
        timeSeriesDataItem36.setValue((java.lang.Number) (byte) 100);
        boolean boolean41 = timeSeriesDataItem36.isSelected();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries1.addOrUpdate(timeSeriesDataItem36);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day45 = new org.jfree.data.time.Day();
        timeSeries44.add((org.jfree.data.time.RegularTimePeriod) day45, (double) (short) 0, false);
        java.util.Date date49 = day45.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond50 = new org.jfree.data.time.FixedMillisecond(date49);
        java.util.Date date51 = fixedMillisecond50.getTime();
        java.util.Calendar calendar52 = null;
        long long53 = fixedMillisecond50.getLastMillisecond(calendar52);
        long long54 = fixedMillisecond50.getMiddleMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem56 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond50, (double) (byte) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = fixedMillisecond50.previous();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) fixedMillisecond50, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "31-March-2024" + "'", str35, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(timeSeriesDataItem42);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1711868400000L + "'", long53 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1711868400000L + "'", long54 == 1711868400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod57);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day9, (java.lang.Number) (byte) 10);
        timeSeriesDataItem11.setValue((java.lang.Number) 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries1.addOrUpdate(timeSeriesDataItem11);
        java.lang.Number number15 = timeSeriesDataItem11.getValue();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(timeSeriesDataItem14);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100 + "'", number15, 100);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        java.util.Calendar calendar9 = null;
        long long10 = fixedMillisecond7.getLastMillisecond(calendar9);
        java.util.Calendar calendar11 = null;
        long long12 = fixedMillisecond7.getLastMillisecond(calendar11);
        java.util.Calendar calendar13 = null;
        long long14 = fixedMillisecond7.getMiddleMillisecond(calendar13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = fixedMillisecond7.next();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711868400000L + "'", long12 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1711868400000L + "'", long14 == 1711868400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.Class class0 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        java.util.Date date7 = day3.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond8 = new org.jfree.data.time.FixedMillisecond(date7);
        java.util.TimeZone timeZone9 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = org.jfree.data.time.RegularTimePeriod.createInstance(class0, date7, timeZone9);
        org.jfree.data.time.FixedMillisecond fixedMillisecond11 = new org.jfree.data.time.FixedMillisecond(date7);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day(date7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = day12.next();
        java.util.Calendar calendar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            day12.peg(calendar14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod10);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.data.general.SeriesException seriesException1 = new org.jfree.data.general.SeriesException("10");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number3 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, number3);
        java.util.Date date5 = month2.getEnd();
        org.jfree.data.time.Year year6 = month2.getYear();
        long long7 = year6.getSerialIndex();
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Oct 31 23:59:59 PST 9");
        org.junit.Assert.assertNotNull(year6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        timeSeries7.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries7.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries7.addChangeListener(seriesChangeListener15);
        timeSeries7.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        java.util.Date date25 = day21.getStart();
        java.lang.Number number26 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day21, number26);
        timeSeries1.add(timeSeriesDataItem27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = timeSeries1.getNextTimePeriod();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem27);
        org.junit.Assert.assertNotNull(regularTimePeriod29);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        timeSeries1.setDescription("hi!");
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        int int11 = day9.compareTo((java.lang.Object) (short) 100);
        long long12 = day9.getMiddleMillisecond();
        int int13 = day9.getYear();
        boolean boolean15 = day9.equals((java.lang.Object) 5);
        int int16 = day9.getDayOfMonth();
        long long17 = day9.getSerialIndex();
        long long18 = day9.getFirstMillisecond();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day9, (java.lang.Number) 1711868400001L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: There is no existing value for the specified 'period'.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711911599999L + "'", long12 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2024 + "'", int13 == 2024);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 31 + "'", int16 == 31);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 45382L + "'", long17 == 45382L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711868400000L + "'", long18 == 1711868400000L);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double14 = timeSeries13.getMaxY();
        java.lang.Comparable comparable15 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries1.addAndOrUpdate(timeSeries13);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries13.addChangeListener(seriesChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.delete(2024, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 100L + "'", comparable15, 100L);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getSerialIndex();
        int int3 = month0.getYearValue();
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException5 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException7 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException5.addSuppressed((java.lang.Throwable) timePeriodFormatException7);
        int int9 = month0.compareTo((java.lang.Object) timePeriodFormatException5);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) int9, "org.jfree.data.event.SeriesChangeEvent[source=true]", "March 2024");
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        java.lang.Object obj14 = timeSeries12.clone();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24291L + "'", long2 == 24291L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2024 + "'", int3 == 2024);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        java.lang.Object obj7 = timeSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries1.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day(serialDate7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = day8.previous();
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = day8.getFirstMillisecond(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        java.util.Date date19 = day15.getStart();
        java.lang.Number number20 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, number20);
        java.util.Date date22 = day15.getStart();
        java.util.TimeZone timeZone23 = null;
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year25 = new org.jfree.data.time.Year(date22, timeZone23, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        timeSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getTimePeriod(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double7 = timeSeries6.getMaxY();
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        java.lang.Number number9 = null;
        timeSeries6.add((org.jfree.data.time.RegularTimePeriod) day8, number9, false);
        double double12 = timeSeries6.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries6.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, (java.lang.Number) 1711911599999L);
        int int22 = timeSeriesDataItem20.compareTo((java.lang.Object) (byte) -1);
        timeSeries1.add(timeSeriesDataItem20);
        boolean boolean24 = timeSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) ' ', (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(timeSeriesDataItem20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number3 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, number3);
        java.util.Date date5 = month2.getEnd();
        org.jfree.data.time.Year year6 = month2.getYear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, (java.lang.Number) (byte) 1);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Oct 31 23:59:59 PST 9");
        org.junit.Assert.assertNotNull(year6);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.data.time.Year year2 = new org.jfree.data.time.Year(0);
        long long3 = year2.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year2.previous();
        org.jfree.data.time.Month month5 = new org.jfree.data.time.Month(1, year2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        java.lang.String str8 = day2.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = day2.next();
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = day2.getFirstMillisecond(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31-March-2024" + "'", str8, "31-March-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        java.util.List list17 = timeSeries1.data;
        java.lang.String str18 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        timeSeries20.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries20.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent29 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean30 = timeSeries20.equals((java.lang.Object) seriesChangeEvent29);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        int int33 = day31.compareTo((java.lang.Object) (short) 100);
        java.lang.String str34 = day31.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries20.getDataItem((org.jfree.data.time.RegularTimePeriod) day31);
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) day31);
        boolean boolean38 = timeSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int40 = timeSeries1.getIndex(regularTimePeriod39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertNotNull(regularTimePeriod27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "31-March-2024" + "'", str34, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = month0.previous();
        boolean boolean4 = month0.equals((java.lang.Object) 10.0d);
        long long5 = month0.getSerialIndex();
        long long6 = month0.getMiddleMillisecond();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 24291L + "'", long5 == 24291L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1710617399999L + "'", long6 == 1710617399999L);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException1 = new org.jfree.data.time.TimePeriodFormatException("October 9");
        java.lang.Throwable[] throwableArray2 = timePeriodFormatException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day0, (java.lang.Number) (byte) 10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day0, (java.lang.Number) 0L);
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = day0.getFirstMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        java.lang.String str20 = timeSeries19.getRangeDescription();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number3 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, number3);
        java.util.Date date5 = month2.getStart();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, 0.0d);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Oct 01 00:00:00 PST 9");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent4 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries1);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo5 = seriesChangeEvent4.getSummary();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.event.SeriesChangeEvent seriesChangeEvent6 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) seriesChangeInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null source");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertNull(seriesChangeInfo5);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year2.previous();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) year2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = year2.previous();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        java.util.Date date13 = day9.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond14 = new org.jfree.data.time.FixedMillisecond(date13);
        java.util.Calendar calendar15 = null;
        long long16 = fixedMillisecond14.getMiddleMillisecond(calendar15);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond14, (double) (byte) 0);
        int int19 = year2.compareTo((java.lang.Object) fixedMillisecond14);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1711868400000L + "'", long16 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year2.previous();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) year2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = year2.previous();
        java.util.Date date7 = year2.getStart();
        long long8 = year2.getSerialIndex();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Mon Jan 01 00:00:00 PST 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2024L + "'", long8 == 2024L);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number3 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, number3);
        long long5 = month2.getSerialIndex();
        org.jfree.data.time.Year year6 = month2.getYear();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 118L + "'", long5 == 118L);
        org.junit.Assert.assertNotNull(year6);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        timeSeries7.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries7.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries7.addChangeListener(seriesChangeListener15);
        timeSeries7.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        java.util.Date date25 = day21.getStart();
        java.lang.Number number26 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day21, number26);
        timeSeries1.add(timeSeriesDataItem27);
        double double29 = timeSeries1.getMinY();
        double double30 = timeSeries1.getMinY();
        timeSeries1.removeAgedItems(false);
        double double33 = timeSeries1.getMaxY();
        int int34 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries1.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.Month month18 = new org.jfree.data.time.Month();
        long long19 = month18.getFirstMillisecond();
        long long20 = month18.getSerialIndex();
        java.lang.String str21 = month18.toString();
        java.lang.Object obj22 = null;
        boolean boolean23 = month18.equals(obj22);
        long long24 = month18.getSerialIndex();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) month18, (java.lang.Number) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1709280000000L + "'", long19 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 24291L + "'", long20 == 24291L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "March 2024" + "'", str21, "March 2024");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 24291L + "'", long24 == 24291L);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        int int15 = day13.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = day13.next();
        timeSeries1.add(regularTimePeriod16, (java.lang.Number) 1);
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number22 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month21, number22);
        long long24 = month21.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) month21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries1.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 118L + "'", long24 == 118L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem25);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            day2.peg(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day22 = new org.jfree.data.time.Day();
        timeSeries21.add((org.jfree.data.time.RegularTimePeriod) day22, (double) (short) 0, false);
        timeSeries21.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = timeSeries21.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent30 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean31 = timeSeries21.equals((java.lang.Object) seriesChangeEvent30);
        org.jfree.data.time.Day day32 = new org.jfree.data.time.Day();
        int int34 = day32.compareTo((java.lang.Object) (short) 100);
        java.lang.String str35 = day32.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries21.getDataItem((org.jfree.data.time.RegularTimePeriod) day32);
        timeSeriesDataItem36.setSelected(false);
        timeSeriesDataItem36.setValue((java.lang.Number) (byte) 100);
        boolean boolean41 = timeSeriesDataItem36.isSelected();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries1.addOrUpdate(timeSeriesDataItem36);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(9999, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9999, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "31-March-2024" + "'", str35, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(timeSeriesDataItem42);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        int int11 = timeSeries1.getMaximumItemCount();
        java.lang.Class class12 = timeSeries1.getTimePeriodClass();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        int int6 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        java.util.Date date13 = day9.getStart();
        org.jfree.data.time.SerialDate serialDate14 = day9.getSerialDate();
        java.lang.String str15 = day9.toString();
        java.lang.Number number16 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day9, number16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.removeChangeListener(seriesChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day24 = new org.jfree.data.time.Day();
        timeSeries23.add((org.jfree.data.time.RegularTimePeriod) day24, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries19.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day24, (java.lang.Number) 10L);
        int int30 = timeSeries19.getItemCount();
        java.util.List list31 = timeSeries19.getItems();
        timeSeries1.data = list31;
        int int33 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = regularTimePeriod34.next();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNull(timeSeriesDataItem29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod34);
        org.junit.Assert.assertNotNull(regularTimePeriod35);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year2.previous();
        long long5 = year2.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year2, (java.lang.Number) 1711868400000L);
        java.lang.Object obj8 = timeSeriesDataItem7.clone();
        java.lang.Number number9 = timeSeriesDataItem7.getValue();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2024L + "'", long5 == 2024L);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 1711868400000L + "'", number9, 1711868400000L);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        timeSeries1.removeAgedItems(1L, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemAge((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        int int6 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        java.util.Date date13 = day9.getStart();
        org.jfree.data.time.SerialDate serialDate14 = day9.getSerialDate();
        java.lang.String str15 = day9.toString();
        java.lang.Number number16 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day9, number16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.removeChangeListener(seriesChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day24 = new org.jfree.data.time.Day();
        timeSeries23.add((org.jfree.data.time.RegularTimePeriod) day24, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries19.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day24, (java.lang.Number) 10L);
        int int30 = timeSeries19.getItemCount();
        java.util.List list31 = timeSeries19.getItems();
        timeSeries1.data = list31;
        int int33 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = timeSeries1.getNextTimePeriod();
        java.util.Calendar calendar35 = null;
        // The following exception was thrown during execution in test generation
        try {
            regularTimePeriod34.peg(calendar35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNull(timeSeriesDataItem29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod34);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        double double2 = timeSeries1.getMinY();
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        java.lang.Class class4 = null;
        timeSeries1.timePeriodClass = class4;
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        long long6 = timeSeries3.getMaximumItemAge();
        java.lang.String str7 = timeSeries3.getDescription();
        int int8 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day11 = new org.jfree.data.time.Day();
        timeSeries10.add((org.jfree.data.time.RegularTimePeriod) day11, (double) (short) 0, false);
        java.util.Date date15 = day11.getStart();
        org.jfree.data.time.SerialDate serialDate16 = day11.getSerialDate();
        java.lang.String str17 = day11.toString();
        java.lang.Number number18 = null;
        timeSeries3.add((org.jfree.data.time.RegularTimePeriod) day11, number18);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day11, (double) (short) 0, true);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries24.addChangeListener(seriesChangeListener25);
        long long27 = timeSeries24.getMaximumItemAge();
        java.lang.String str28 = timeSeries24.getDescription();
        int int29 = timeSeries24.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day32 = new org.jfree.data.time.Day();
        timeSeries31.add((org.jfree.data.time.RegularTimePeriod) day32, (double) (short) 0, false);
        java.util.Date date36 = day32.getStart();
        org.jfree.data.time.SerialDate serialDate37 = day32.getSerialDate();
        java.lang.String str38 = day32.toString();
        java.lang.Number number39 = null;
        timeSeries24.add((org.jfree.data.time.RegularTimePeriod) day32, number39);
        boolean boolean41 = timeSeries24.isEmpty();
        boolean boolean42 = day11.equals((java.lang.Object) timeSeries24);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = timeSeries24.getRawDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "31-March-2024" + "'", str17, "31-March-2024");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "31-March-2024" + "'", str38, "31-March-2024");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year(0);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        int int3 = day2.getMonth();
        java.util.Date date4 = day2.getEnd();
        boolean boolean5 = year1.equals((java.lang.Object) day2);
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            day2.peg(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sun Mar 31 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        java.util.List list17 = timeSeries1.data;
        java.lang.String str18 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        timeSeries20.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries20.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent29 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean30 = timeSeries20.equals((java.lang.Object) seriesChangeEvent29);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        int int33 = day31.compareTo((java.lang.Object) (short) 100);
        java.lang.String str34 = day31.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries20.getDataItem((org.jfree.data.time.RegularTimePeriod) day31);
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) day31);
        boolean boolean38 = timeSeries1.equals((java.lang.Object) 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemCount((-9999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertNotNull(regularTimePeriod27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "31-March-2024" + "'", str34, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        int int8 = timeSeries1.getItemCount();
        double double9 = timeSeries1.getMinY();
        double double10 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        timeSeries12.add((org.jfree.data.time.RegularTimePeriod) day13, (double) (short) 0, false);
        timeSeries12.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeries12.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries12.addChangeListener(seriesChangeListener20);
        timeSeries12.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        java.util.Date date30 = day26.getStart();
        java.lang.Number number31 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries12.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, number31);
        long long33 = day26.getFirstMillisecond();
        long long34 = day26.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day26);
        boolean boolean36 = timeSeries1.getNotify();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(regularTimePeriod19);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1711868400000L + "'", long33 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1711868400000L + "'", long34 == 1711868400000L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.data.general.SeriesException seriesException1 = new org.jfree.data.general.SeriesException("org.jfree.data.event.SeriesChangeEvent[source=true]");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = day3.getLastMillisecond(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getLastMillisecond();
        long long3 = month0.getFirstMillisecond();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1711954799999L + "'", long2 == 1711954799999L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1709280000000L + "'", long3 == 1709280000000L);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year2.previous();
        int int5 = year2.getYear();
        long long6 = year2.getFirstMillisecond();
        java.lang.String str7 = year2.toString();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries9.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day14 = new org.jfree.data.time.Day();
        timeSeries13.add((org.jfree.data.time.RegularTimePeriod) day14, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries9.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day14, (java.lang.Number) 10L);
        long long20 = day14.getSerialIndex();
        long long21 = day14.getLastMillisecond();
        boolean boolean22 = year2.equals((java.lang.Object) day14);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2024 + "'", int5 == 2024);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1704096000000L + "'", long6 == 1704096000000L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2024" + "'", str7, "2024");
        org.junit.Assert.assertNull(timeSeriesDataItem19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 45382L + "'", long20 == 45382L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1711954799999L + "'", long21 == 1711954799999L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        long long8 = fixedMillisecond7.getFirstMillisecond();
        java.util.Date date9 = fixedMillisecond7.getTime();
        long long10 = fixedMillisecond7.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = fixedMillisecond7.next();
        long long12 = fixedMillisecond7.getSerialIndex();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711868400000L + "'", long8 == 1711868400000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711868400000L + "'", long12 == 1711868400000L);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        org.jfree.data.time.FixedMillisecond fixedMillisecond9 = new org.jfree.data.time.FixedMillisecond(date8);
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month12 = new org.jfree.data.time.Month(date8, timeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        java.util.List list17 = timeSeries1.data;
        int int18 = timeSeries1.getItemCount();
        java.util.Collection collection19 = timeSeries1.getTimePeriods();
        java.lang.Class class20 = timeSeries1.timePeriodClass;
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        int int22 = day21.getMonth();
        org.jfree.data.time.SerialDate serialDate23 = day21.getSerialDate();
        java.util.Date date24 = day21.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond25 = new org.jfree.data.time.FixedMillisecond(date24);
        boolean boolean26 = timeSeries1.equals((java.lang.Object) fixedMillisecond25);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(serialDate23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        timeSeries1.setDomainDescription("");
        int int22 = timeSeries1.getItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries1.addChangeListener(seriesChangeListener23);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.Date date0 = null;
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day2 = new org.jfree.data.time.Day(date0, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'time' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 1711911599999L);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1711911599999L, "31-March-2024", "");
        java.lang.Comparable comparable19 = timeSeries18.getKey();
        timeSeries18.setDomainDescription("");
        org.jfree.data.time.Year year23 = new org.jfree.data.time.Year((int) (short) 10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries18.getRawDataItem((org.jfree.data.time.RegularTimePeriod) year23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = year23.next();
        java.util.Calendar calendar26 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long27 = regularTimePeriod25.getLastMillisecond(calendar26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 1711911599999L + "'", comparable19, 1711911599999L);
        org.junit.Assert.assertNull(timeSeriesDataItem24);
        org.junit.Assert.assertNotNull(regularTimePeriod25);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        int int6 = timeSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        java.util.List list17 = timeSeries1.data;
        java.lang.String str18 = timeSeries1.getDomainDescription();
        timeSeries1.setDescription("hi!");
        java.lang.Comparable comparable21 = timeSeries1.getKey();
        timeSeries1.setDescription("2024");
        org.jfree.data.time.Month month24 = new org.jfree.data.time.Month();
        long long25 = month24.getFirstMillisecond();
        long long26 = month24.getSerialIndex();
        long long27 = month24.getSerialIndex();
        int int28 = month24.getMonth();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        int int31 = timeSeries30.getMaximumItemCount();
        int int32 = month24.compareTo((java.lang.Object) timeSeries30);
        java.util.Collection collection33 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries30.addChangeListener(seriesChangeListener34);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 100 + "'", comparable21, (short) 100);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1709280000000L + "'", long25 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 24291L + "'", long26 == 24291L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 24291L + "'", long27 == 24291L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        long long12 = day6.getSerialIndex();
        long long13 = day6.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = day6.next();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent15 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) day6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = day6.next();
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 45382L + "'", long12 == 45382L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711954799999L + "'", long13 == 1711954799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = month0.previous();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            month0.peg(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        long long8 = day2.getMiddleMillisecond();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = day2.getFirstMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711911599999L + "'", long8 == 1711911599999L);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year2.previous();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) year2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = year2.previous();
        java.util.Date date7 = year2.getStart();
        java.util.TimeZone timeZone8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month9 = new org.jfree.data.time.Month(date7, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Mon Jan 01 00:00:00 PST 2024");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        timeSeriesDataItem16.setSelected(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeriesDataItem16.getPeriod();
        boolean boolean20 = timeSeriesDataItem16.isSelected();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day23 = new org.jfree.data.time.Day();
        timeSeries22.add((org.jfree.data.time.RegularTimePeriod) day23, (double) (short) 0, false);
        java.util.Date date27 = day23.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond28 = new org.jfree.data.time.FixedMillisecond(date27);
        long long29 = fixedMillisecond28.getFirstMillisecond();
        java.util.Date date30 = fixedMillisecond28.getTime();
        org.jfree.data.time.FixedMillisecond fixedMillisecond31 = new org.jfree.data.time.FixedMillisecond(date30);
        int int32 = timeSeriesDataItem16.compareTo((java.lang.Object) fixedMillisecond31);
        long long33 = fixedMillisecond31.getLastMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1711868400000L + "'", long29 == 1711868400000L);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1711868400000L + "'", long33 == 1711868400000L);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        java.util.Calendar calendar9 = null;
        long long10 = fixedMillisecond7.getLastMillisecond(calendar9);
        long long11 = fixedMillisecond7.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = fixedMillisecond7.next();
        java.util.Calendar calendar13 = null;
        long long14 = fixedMillisecond7.getMiddleMillisecond(calendar13);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        double double17 = timeSeries16.getMinY();
        timeSeries16.setDescription("March 2024");
        timeSeries16.removeAgedItems(0L, true);
        double double23 = timeSeries16.getMaxY();
        int int24 = fixedMillisecond7.compareTo((java.lang.Object) timeSeries16);
        java.lang.String str25 = timeSeries16.getDescription();
        timeSeries16.setRangeDescription("31-March-2024");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1711868400000L + "'", long11 == 1711868400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1711868400000L + "'", long14 == 1711868400000L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "March 2024" + "'", str25, "March 2024");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        timeSeries1.clear();
        timeSeries1.removeAgedItems((long) 5, false);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries8.addChangeListener(seriesChangeListener9);
        long long11 = timeSeries8.getMaximumItemAge();
        java.lang.String str12 = timeSeries8.getDescription();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        java.util.Date date19 = day15.getStart();
        long long20 = day15.getFirstMillisecond();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day15, (java.lang.Number) 10, false);
        java.util.List list24 = timeSeries8.data;
        int int25 = timeSeries8.getItemCount();
        org.jfree.data.time.Month month26 = new org.jfree.data.time.Month();
        long long27 = month26.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = month26.previous();
        timeSeries8.setKey((java.lang.Comparable) regularTimePeriod28);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries1.addOrUpdate(regularTimePeriod28, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1711868400000L + "'", long20 == 1711868400000L);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1709280000000L + "'", long27 == 1709280000000L);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException1 = new org.jfree.data.time.TimePeriodFormatException("");
        java.lang.String str2 = timePeriodFormatException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: " + "'", str2, "org.jfree.data.time.TimePeriodFormatException: ");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        timeSeries1.setMaximumItemCount((int) ' ');
        timeSeries1.fireSeriesChanged();
        timeSeries1.removeAgedItems(1688327999999L, true);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.data.general.SeriesException seriesException1 = new org.jfree.data.general.SeriesException("March 2024");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException3 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException5 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException3.addSuppressed((java.lang.Throwable) timePeriodFormatException5);
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException8 = new org.jfree.data.time.TimePeriodFormatException("");
        java.lang.Throwable[] throwableArray9 = timePeriodFormatException8.getSuppressed();
        timePeriodFormatException3.addSuppressed((java.lang.Throwable) timePeriodFormatException8);
        seriesException1.addSuppressed((java.lang.Throwable) timePeriodFormatException3);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year1 = org.jfree.data.time.Year.parseYear("");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException; message: Cannot parse string.");
        } catch (org.jfree.data.time.TimePeriodFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.util.Date date3 = month2.getStart();
        org.jfree.data.time.Day day4 = new org.jfree.data.time.Day();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = day4.previous();
        boolean boolean6 = month2.equals((java.lang.Object) day4);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean5 = timeSeries1.equals((java.lang.Object) 100);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        java.util.Date date13 = day9.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond14 = new org.jfree.data.time.FixedMillisecond(date13);
        java.util.TimeZone timeZone15 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = org.jfree.data.time.RegularTimePeriod.createInstance(class6, date13, timeZone15);
        org.jfree.data.time.FixedMillisecond fixedMillisecond17 = new org.jfree.data.time.FixedMillisecond(date13);
        long long18 = fixedMillisecond17.getFirstMillisecond();
        java.lang.Number number19 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) fixedMillisecond17, number19);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711868400000L + "'", long18 == 1711868400000L);
        org.junit.Assert.assertNull(timeSeriesDataItem20);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        long long8 = day2.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = day2.previous();
        long long10 = regularTimePeriod9.getLastMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = new org.jfree.data.time.TimeSeriesDataItem(regularTimePeriod9, (double) 3);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.Day day16 = new org.jfree.data.time.Day();
        java.lang.Number number17 = null;
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day16, number17, false);
        double double20 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day23 = new org.jfree.data.time.Day();
        timeSeries22.add((org.jfree.data.time.RegularTimePeriod) day23, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries14.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day23, (java.lang.Number) 1711911599999L);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) timeSeriesDataItem28);
        boolean boolean30 = timeSeriesDataItem12.equals((java.lang.Object) timeSeriesDataItem28);
        boolean boolean31 = timeSeriesDataItem28.isSelected();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day34 = new org.jfree.data.time.Day();
        timeSeries33.add((org.jfree.data.time.RegularTimePeriod) day34, (double) (short) 0, false);
        java.util.Date date38 = day34.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond39 = new org.jfree.data.time.FixedMillisecond(date38);
        java.util.Date date40 = fixedMillisecond39.getTime();
        java.util.Calendar calendar41 = null;
        long long42 = fixedMillisecond39.getLastMillisecond(calendar41);
        long long43 = fixedMillisecond39.getMiddleMillisecond();
        java.util.Date date44 = fixedMillisecond39.getTime();
        org.jfree.data.time.Day day45 = new org.jfree.data.time.Day(date44);
        long long46 = day45.getLastMillisecond();
        boolean boolean47 = timeSeriesDataItem28.equals((java.lang.Object) day45);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711911599999L + "'", long8 == 1711911599999L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868399999L + "'", long10 == 1711868399999L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeriesDataItem28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1711868400000L + "'", long42 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1711868400000L + "'", long43 == 1711868400000L);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1711954799999L + "'", long46 == 1711954799999L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month1 = org.jfree.data.time.Month.parseMonth("org.jfree.data.time.TimePeriodFormatException: 9");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException; message: Can't evaluate the month.");
        } catch (org.jfree.data.time.TimePeriodFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        timeSeries9.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        java.util.Date date22 = day18.getStart();
        org.jfree.data.time.SerialDate serialDate23 = day18.getSerialDate();
        java.lang.Number number24 = null;
        timeSeries9.update((org.jfree.data.time.RegularTimePeriod) day18, number24);
        java.lang.Number number26 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) day18);
        java.util.Calendar calendar27 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long28 = day18.getMiddleMillisecond(calendar27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate23);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 0.0d + "'", number26, 0.0d);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year(0);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        int int3 = day2.getMonth();
        java.util.Date date4 = day2.getEnd();
        boolean boolean5 = year1.equals((java.lang.Object) day2);
        long long6 = year1.getFirstMillisecond();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = year1.getMiddleMillisecond(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sun Mar 31 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-62167363200000L) + "'", long6 == (-62167363200000L));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        long long8 = fixedMillisecond7.getFirstMillisecond();
        java.util.Date date9 = fixedMillisecond7.getTime();
        long long10 = fixedMillisecond7.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = fixedMillisecond7.next();
        org.jfree.data.time.Month month12 = new org.jfree.data.time.Month();
        long long13 = month12.getFirstMillisecond();
        org.jfree.data.time.Year year14 = month12.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = year14.previous();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries17.addChangeListener(seriesChangeListener18);
        long long20 = timeSeries17.getMaximumItemAge();
        java.lang.String str21 = timeSeries17.getDescription();
        double double22 = timeSeries17.getMaxY();
        java.lang.Object obj23 = timeSeries17.clone();
        int int24 = year14.compareTo(obj23);
        boolean boolean25 = fixedMillisecond7.equals((java.lang.Object) int24);
        long long26 = fixedMillisecond7.getSerialIndex();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711868400000L + "'", long8 == 1711868400000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1709280000000L + "'", long13 == 1709280000000L);
        org.junit.Assert.assertNotNull(year14);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1711868400000L + "'", long26 == 1711868400000L);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        long long16 = day10.getFirstMillisecond();
        org.jfree.data.time.SerialDate serialDate17 = day10.getSerialDate();
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day(serialDate17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day(serialDate17);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1711868400000L + "'", long16 == 1711868400000L);
        org.junit.Assert.assertNotNull(serialDate17);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year((int) (byte) -1);
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = year1.getMiddleMillisecond(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9999);
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month();
        long long3 = month2.getFirstMillisecond();
        org.jfree.data.time.Year year4 = month2.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = year4.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = year4.previous();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) year4);
        boolean boolean8 = timeSeries1.equals((java.lang.Object) year4);
        timeSeries1.setRangeDescription("Time");
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1709280000000L + "'", long3 == 1709280000000L);
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month1 = org.jfree.data.time.Month.parseMonth("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.Month month24 = new org.jfree.data.time.Month();
        long long25 = month24.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries27.removeChangeListener(seriesChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day32 = new org.jfree.data.time.Day();
        timeSeries31.add((org.jfree.data.time.RegularTimePeriod) day32, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries27.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day32, (java.lang.Number) 10L);
        long long38 = day32.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries21.createCopy((org.jfree.data.time.RegularTimePeriod) month24, (org.jfree.data.time.RegularTimePeriod) day32);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        timeSeries41.add((org.jfree.data.time.RegularTimePeriod) day42, (double) (short) 0, false);
        timeSeries41.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = timeSeries41.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent50 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean51 = timeSeries41.equals((java.lang.Object) seriesChangeEvent50);
        org.jfree.data.time.Day day52 = new org.jfree.data.time.Day();
        int int54 = day52.compareTo((java.lang.Object) (short) 100);
        java.lang.String str55 = day52.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem56 = timeSeries41.getDataItem((org.jfree.data.time.RegularTimePeriod) day52);
        timeSeriesDataItem56.setSelected(false);
        timeSeriesDataItem56.setValue((java.lang.Number) (byte) 100);
        boolean boolean61 = timeSeriesDataItem56.isSelected();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = timeSeries21.addOrUpdate(timeSeriesDataItem56);
        org.jfree.data.time.Day day63 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem65 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day63, (java.lang.Number) (byte) 10);
        int int66 = timeSeriesDataItem56.compareTo((java.lang.Object) (byte) 10);
        boolean boolean67 = month4.equals((java.lang.Object) timeSeriesDataItem56);
        long long68 = month4.getFirstMillisecond();
        java.util.Date date69 = month4.getStart();
        java.util.Calendar calendar70 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long71 = month4.getLastMillisecond(calendar70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1709280000000L + "'", long25 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1711911599999L + "'", long38 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(regularTimePeriod48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "31-March-2024" + "'", str55, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(timeSeriesDataItem62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1709280000000L + "'", long68 == 1709280000000L);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Fri Mar 01 00:00:00 PST 2024");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        java.util.List list17 = timeSeries1.data;
        java.lang.String str18 = timeSeries1.getDomainDescription();
        timeSeries1.setDescription("hi!");
        java.lang.Class class21 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertNotNull(class21);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries1.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        java.lang.Number number22 = null;
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) day21, number22, false);
        double double25 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        timeSeries27.add((org.jfree.data.time.RegularTimePeriod) day28, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries19.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day28, (java.lang.Number) 1711911599999L);
        int int35 = timeSeriesDataItem33.compareTo((java.lang.Object) (byte) -1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = timeSeriesDataItem33.getPeriod();
        java.lang.Number number37 = timeSeries1.getValue(regularTimePeriod36);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries40 = timeSeries1.createCopy(0, (-9999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(timeSeriesDataItem33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod36);
        org.junit.Assert.assertEquals("'" + number37 + "' != '" + 0.0d + "'", number37, 0.0d);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        timeSeries1.setRangeDescription("31-March-2024");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        java.util.Date date16 = day12.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond17 = new org.jfree.data.time.FixedMillisecond(date16);
        java.util.Calendar calendar18 = null;
        long long19 = fixedMillisecond17.getMiddleMillisecond(calendar18);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond17, (double) (byte) 0);
        timeSeriesDataItem21.setValue((java.lang.Number) (short) 100);
        java.lang.Object obj24 = timeSeriesDataItem21.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem21);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1711868400000L + "'", long19 == 1711868400000L);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        int int15 = day13.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = day13.next();
        timeSeries1.add(regularTimePeriod16, (java.lang.Number) 1);
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number22 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month21, number22);
        long long24 = month21.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) month21);
        org.jfree.data.time.Year year26 = month21.getYear();
        long long27 = year26.getMiddleMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 118L + "'", long24 == 118L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem25);
        org.junit.Assert.assertNotNull(year26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-61867512000001L) + "'", long27 == (-61867512000001L));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.data.general.SeriesException seriesException1 = new org.jfree.data.general.SeriesException("2024");
        java.lang.Throwable[] throwableArray2 = seriesException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year(0);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        int int3 = day2.getMonth();
        java.util.Date date4 = day2.getEnd();
        boolean boolean5 = year1.equals((java.lang.Object) day2);
        int int6 = year1.getYear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sun Mar 31 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.getDataItem(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.lang.String str6 = timeSeries1.getDescription();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        int int8 = timeSeries1.getItemCount();
        double double9 = timeSeries1.getMinY();
        double double10 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        timeSeries12.add((org.jfree.data.time.RegularTimePeriod) day13, (double) (short) 0, false);
        timeSeries12.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeries12.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries12.addChangeListener(seriesChangeListener20);
        timeSeries12.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        java.util.Date date30 = day26.getStart();
        java.lang.Number number31 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries12.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, number31);
        long long33 = day26.getFirstMillisecond();
        long long34 = day26.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day26);
        java.lang.Object obj36 = null;
        int int37 = timeSeriesDataItem35.compareTo(obj36);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(regularTimePeriod19);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1711868400000L + "'", long33 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1711868400000L + "'", long34 == 1711868400000L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        java.util.List list17 = timeSeries1.data;
        int int18 = timeSeries1.getItemCount();
        java.lang.Class class19 = timeSeries1.timePeriodClass;
        timeSeries1.setNotify(false);
        timeSeries1.setNotify(false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(class19);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        java.lang.Comparable comparable11 = timeSeries1.getKey();
        double double12 = timeSeries1.getMinY();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries14.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.Month month17 = new org.jfree.data.time.Month();
        long long18 = month17.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries20.removeChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        timeSeries24.add((org.jfree.data.time.RegularTimePeriod) day25, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries20.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day25, (java.lang.Number) 10L);
        long long31 = day25.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries14.createCopy((org.jfree.data.time.RegularTimePeriod) month17, (org.jfree.data.time.RegularTimePeriod) day25);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries34.addChangeListener(seriesChangeListener35);
        org.jfree.data.time.Month month37 = new org.jfree.data.time.Month();
        long long38 = month37.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries40.removeChangeListener(seriesChangeListener41);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day45 = new org.jfree.data.time.Day();
        timeSeries44.add((org.jfree.data.time.RegularTimePeriod) day45, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = timeSeries40.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day45, (java.lang.Number) 10L);
        long long51 = day45.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries34.createCopy((org.jfree.data.time.RegularTimePeriod) month37, (org.jfree.data.time.RegularTimePeriod) day45);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day55 = new org.jfree.data.time.Day();
        timeSeries54.add((org.jfree.data.time.RegularTimePeriod) day55, (double) (short) 0, false);
        timeSeries54.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod61 = timeSeries54.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent63 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean64 = timeSeries54.equals((java.lang.Object) seriesChangeEvent63);
        org.jfree.data.time.Day day65 = new org.jfree.data.time.Day();
        int int67 = day65.compareTo((java.lang.Object) (short) 100);
        java.lang.String str68 = day65.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem69 = timeSeries54.getDataItem((org.jfree.data.time.RegularTimePeriod) day65);
        timeSeriesDataItem69.setSelected(false);
        timeSeriesDataItem69.setValue((java.lang.Number) (byte) 100);
        boolean boolean74 = timeSeriesDataItem69.isSelected();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem75 = timeSeries34.addOrUpdate(timeSeriesDataItem69);
        org.jfree.data.time.Day day76 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem78 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day76, (java.lang.Number) (byte) 10);
        int int79 = timeSeriesDataItem69.compareTo((java.lang.Object) (byte) 10);
        boolean boolean80 = month17.equals((java.lang.Object) timeSeriesDataItem69);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem81 = timeSeries1.addOrUpdate(timeSeriesDataItem69);
        int int82 = timeSeries1.getItemCount();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 100L + "'", comparable11, 100L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1709280000000L + "'", long18 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1711911599999L + "'", long31 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1709280000000L + "'", long38 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1711911599999L + "'", long51 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(regularTimePeriod61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "31-March-2024" + "'", str68, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(timeSeriesDataItem75);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(timeSeriesDataItem81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        long long6 = timeSeries3.getMaximumItemAge();
        java.lang.String str7 = timeSeries3.getDescription();
        int int8 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day11 = new org.jfree.data.time.Day();
        timeSeries10.add((org.jfree.data.time.RegularTimePeriod) day11, (double) (short) 0, false);
        java.util.Date date15 = day11.getStart();
        org.jfree.data.time.SerialDate serialDate16 = day11.getSerialDate();
        java.lang.String str17 = day11.toString();
        java.lang.Number number18 = null;
        timeSeries3.add((org.jfree.data.time.RegularTimePeriod) day11, number18);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day11, (double) (short) 0, true);
        org.jfree.data.time.FixedMillisecond fixedMillisecond23 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day27 = new org.jfree.data.time.Day();
        timeSeries26.add((org.jfree.data.time.RegularTimePeriod) day27, (double) (short) 0, false);
        java.util.Date date31 = day27.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond32 = new org.jfree.data.time.FixedMillisecond(date31);
        java.util.Date date33 = fixedMillisecond32.getTime();
        java.util.Calendar calendar34 = null;
        long long35 = fixedMillisecond32.getLastMillisecond(calendar34);
        java.util.Calendar calendar36 = null;
        long long37 = fixedMillisecond32.getFirstMillisecond(calendar36);
        java.util.Calendar calendar38 = null;
        long long39 = fixedMillisecond32.getFirstMillisecond(calendar38);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond32);
        long long41 = fixedMillisecond32.getSerialIndex();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "31-March-2024" + "'", str17, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem24);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1711868400000L + "'", long35 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1711868400000L + "'", long37 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1711868400000L + "'", long39 == 1711868400000L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1711868400000L + "'", long41 == 1711868400000L);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        java.util.Date date19 = day15.getStart();
        java.lang.Number number20 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, number20);
        boolean boolean22 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        java.lang.Number number24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod23, number24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.util.List list3 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) 12, false);
        org.jfree.data.time.Day day7 = new org.jfree.data.time.Day();
        int int9 = day7.compareTo((java.lang.Object) (short) 100);
        long long10 = day7.getMiddleMillisecond();
        int int11 = day7.getYear();
        boolean boolean13 = day7.equals((java.lang.Object) 5);
        int int14 = day7.getDayOfMonth();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day7, (double) 3);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries1.addChangeListener(seriesChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = timeSeries1.getValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711911599999L + "'", long10 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2024 + "'", int11 == 2024);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
        org.junit.Assert.assertNull(timeSeriesDataItem16);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year((int) (short) 10);
        long long2 = year1.getFirstMillisecond();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-61851744000000L) + "'", long2 == (-61851744000000L));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 1711911599999L);
        java.lang.Object obj16 = timeSeriesDataItem15.clone();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries18.addChangeListener(seriesChangeListener19);
        long long21 = timeSeries18.getMaximumItemAge();
        java.lang.String str22 = timeSeries18.getDescription();
        java.util.List list23 = timeSeries18.getItems();
        boolean boolean24 = timeSeriesDataItem15.equals((java.lang.Object) timeSeries18);
        java.lang.Object obj25 = timeSeriesDataItem15.clone();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day3 = new org.jfree.data.time.Day(6, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day3);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        timeSeries9.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries9.getNextTimePeriod();
        timeSeries9.setMaximumItemCount((int) ' ');
        org.jfree.data.time.Year year20 = new org.jfree.data.time.Year(0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries9.getRawDataItem((org.jfree.data.time.RegularTimePeriod) year20);
        java.util.Collection collection22 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        java.lang.String str23 = timeSeries9.getRangeDescription();
        timeSeries9.removeAgedItems(false);
        timeSeries9.clear();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo27 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent28 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries9, seriesChangeInfo27);
        java.lang.Object obj29 = seriesChangeEvent28.getSource();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = month0.previous();
        boolean boolean4 = month0.equals((java.lang.Object) 10.0d);
        long long5 = month0.getSerialIndex();
        java.lang.Object obj6 = null;
        int int7 = month0.compareTo(obj6);
        long long8 = month0.getFirstMillisecond();
        long long9 = month0.getFirstMillisecond();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 24291L + "'", long5 == 24291L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1709280000000L + "'", long8 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1709280000000L + "'", long9 == 1709280000000L);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        java.util.List list5 = timeSeries1.getItems();
        double double6 = timeSeries1.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        java.lang.Object obj9 = timeSeries1.clone();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        long long8 = fixedMillisecond7.getFirstMillisecond();
        java.util.Date date9 = fixedMillisecond7.getTime();
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = month10.previous();
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            month10.peg(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711868400000L + "'", long8 == 1711868400000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod11);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getSerialIndex();
        long long3 = month0.getFirstMillisecond();
        long long4 = month0.getLastMillisecond();
        long long5 = month0.getSerialIndex();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            month0.peg(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24291L + "'", long2 == 24291L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1709280000000L + "'", long3 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1711954799999L + "'", long4 == 1711954799999L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 24291L + "'", long5 == 24291L);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent1 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo2 = null;
        seriesChangeEvent1.setSummary(seriesChangeInfo2);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo4 = seriesChangeEvent1.getSummary();
        java.lang.String str5 = seriesChangeEvent1.toString();
        org.junit.Assert.assertNull(seriesChangeInfo4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jfree.data.event.SeriesChangeEvent[source=10.0]" + "'", str5, "org.jfree.data.event.SeriesChangeEvent[source=10.0]");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        int int8 = timeSeries1.getItemCount();
        double double9 = timeSeries1.getMinY();
        double double10 = timeSeries1.getMaxY();
        int int11 = timeSeries1.getItemCount();
        java.util.Collection collection12 = timeSeries1.getTimePeriods();
        org.jfree.data.time.Month month15 = new org.jfree.data.time.Month(10, 9);
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) month15, (java.lang.Number) 11);
        java.util.Calendar calendar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = month15.getFirstMillisecond(calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMinY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries8.addChangeListener(seriesChangeListener9);
        long long11 = timeSeries8.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        long long16 = timeSeries13.getMaximumItemAge();
        java.lang.String str17 = timeSeries13.getDescription();
        double double18 = timeSeries13.getMinY();
        java.util.Collection collection19 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        java.util.Collection collection20 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        java.lang.Class class21 = timeSeries8.getTimePeriodClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(class21);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        timeSeries1.clear();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        timeSeries7.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries7.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries7.addChangeListener(seriesChangeListener15);
        timeSeries7.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        java.util.Date date25 = day21.getStart();
        java.lang.Number number26 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day21, number26);
        timeSeries1.add(timeSeriesDataItem27);
        org.jfree.data.time.Month month31 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number32 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month31, number32);
        long long34 = month31.getSerialIndex();
        java.util.Date date35 = month31.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = month31.previous();
        org.jfree.data.time.Month month37 = new org.jfree.data.time.Month();
        long long38 = month37.getFirstMillisecond();
        org.jfree.data.time.Year year39 = month37.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = year39.next();
        long long41 = year39.getSerialIndex();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries1.createCopy(regularTimePeriod36, (org.jfree.data.time.RegularTimePeriod) year39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number44 = timeSeries42.getValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem27);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 118L + "'", long34 == 118L);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertNotNull(regularTimePeriod36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1709280000000L + "'", long38 == 1709280000000L);
        org.junit.Assert.assertNotNull(year39);
        org.junit.Assert.assertNotNull(regularTimePeriod40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 2024L + "'", long41 == 2024L);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        java.lang.String str8 = day2.toString();
        java.lang.String str9 = day2.toString();
        java.lang.String str10 = day2.toString();
        org.jfree.data.time.SerialDate serialDate11 = day2.getSerialDate();
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day(serialDate11);
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day(serialDate11);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31-March-2024" + "'", str8, "31-March-2024");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-March-2024" + "'", str9, "31-March-2024");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "31-March-2024" + "'", str10, "31-March-2024");
        org.junit.Assert.assertNotNull(serialDate11);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        timeSeries1.setRangeDescription("org.jfree.data.general.SeriesException: 31-March-2024");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        timeSeries1.setMaximumItemCount((int) ' ');
        timeSeries1.fireSeriesChanged();
        timeSeries1.setMaximumItemAge((long) 2);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        long long18 = timeSeries15.getMaximumItemAge();
        java.lang.String str19 = timeSeries15.getDescription();
        int int20 = timeSeries15.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day23 = new org.jfree.data.time.Day();
        timeSeries22.add((org.jfree.data.time.RegularTimePeriod) day23, (double) (short) 0, false);
        java.util.Date date27 = day23.getStart();
        org.jfree.data.time.SerialDate serialDate28 = day23.getSerialDate();
        java.lang.String str29 = day23.toString();
        java.lang.Number number30 = null;
        timeSeries15.add((org.jfree.data.time.RegularTimePeriod) day23, number30);
        java.lang.String str32 = timeSeries15.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries1.addAndOrUpdate(timeSeries15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries36 = timeSeries1.createCopy(3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "31-March-2024" + "'", str29, "31-March-2024");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Time" + "'", str32, "Time");
        org.junit.Assert.assertNotNull(timeSeries33);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year(3);
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = year1.getFirstMillisecond(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException1 = new org.jfree.data.time.TimePeriodFormatException("March 2024");
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodFormatException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        timeSeries16.add((org.jfree.data.time.RegularTimePeriod) day17, (double) (short) 0, false);
        java.util.Date date21 = day17.getStart();
        int int22 = timeSeries8.getIndex((org.jfree.data.time.RegularTimePeriod) day17);
        java.lang.Class class23 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        java.util.Date date30 = day26.getStart();
        java.util.TimeZone timeZone31 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = org.jfree.data.time.RegularTimePeriod.createInstance(class23, date30, timeZone31);
        timeSeries1.timePeriodClass = class23;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries35.removeChangeListener(seriesChangeListener36);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day40 = new org.jfree.data.time.Day();
        timeSeries39.add((org.jfree.data.time.RegularTimePeriod) day40, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries35.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day40, (java.lang.Number) 10L);
        int int46 = timeSeries35.getItemCount();
        java.util.List list47 = timeSeries35.getItems();
        timeSeries1.data = list47;
        java.lang.Comparable comparable49 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setKey(comparable49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod32);
        org.junit.Assert.assertNull(timeSeriesDataItem45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(list47);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getSerialIndex();
        int int3 = month0.getYearValue();
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException5 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException7 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException5.addSuppressed((java.lang.Throwable) timePeriodFormatException7);
        int int9 = month0.compareTo((java.lang.Object) timePeriodFormatException5);
        java.lang.String str10 = timePeriodFormatException5.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24291L + "'", long2 == 24291L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2024 + "'", int3 == 2024);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: " + "'", str10, "org.jfree.data.time.TimePeriodFormatException: ");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        int int15 = day13.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = day13.next();
        timeSeries1.add(regularTimePeriod16, (java.lang.Number) 1);
        double double19 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.addChangeListener(seriesChangeListener22);
        long long24 = timeSeries21.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        long long29 = timeSeries26.getMaximumItemAge();
        java.lang.String str30 = timeSeries26.getDescription();
        double double31 = timeSeries26.getMinY();
        java.util.Collection collection32 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries26.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day37 = new org.jfree.data.time.Day();
        timeSeries36.add((org.jfree.data.time.RegularTimePeriod) day37, (double) (short) 0, false);
        java.util.Date date41 = day37.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond42 = new org.jfree.data.time.FixedMillisecond(date41);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = fixedMillisecond42.next();
        int int44 = timeSeries26.getIndex(regularTimePeriod43);
        boolean boolean45 = timeSeries1.equals((java.lang.Object) int44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day48 = new org.jfree.data.time.Day();
        timeSeries47.add((org.jfree.data.time.RegularTimePeriod) day48, (double) (short) 0, false);
        timeSeries47.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod54 = timeSeries47.getNextTimePeriod();
        java.util.Collection collection55 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries47);
        timeSeries47.removeAgedItems(true);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod54);
        org.junit.Assert.assertNotNull(collection55);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        int int6 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        java.util.Date date13 = day9.getStart();
        org.jfree.data.time.SerialDate serialDate14 = day9.getSerialDate();
        java.lang.String str15 = day9.toString();
        java.lang.Number number16 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day9, number16);
        boolean boolean18 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = timeSeries1.getTimePeriod(0);
        timeSeries1.setRangeDescription("9");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod20);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        long long4 = year2.getLastMillisecond();
        boolean boolean6 = year2.equals((java.lang.Object) "October 9");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries10.addChangeListener(seriesChangeListener11);
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.String str14 = timeSeries10.getDescription();
        int int15 = timeSeries10.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        java.util.Date date22 = day18.getStart();
        org.jfree.data.time.SerialDate serialDate23 = day18.getSerialDate();
        java.lang.String str24 = day18.toString();
        java.lang.Number number25 = null;
        timeSeries10.add((org.jfree.data.time.RegularTimePeriod) day18, number25);
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, true);
        org.jfree.data.time.FixedMillisecond fixedMillisecond30 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries8.getRawDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond30);
        int int32 = year2.compareTo((java.lang.Object) timeSeriesDataItem31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = timeSeriesDataItem31.getPeriod();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1735718399999L + "'", long4 == 1735718399999L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "31-March-2024" + "'", str24, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod33);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.data.time.Year year2 = new org.jfree.data.time.Year(3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month3 = new org.jfree.data.time.Month((int) (byte) 0, year2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Month outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number3 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, number3);
        java.util.Date date5 = month2.getStart();
        org.jfree.data.time.Month month6 = new org.jfree.data.time.Month();
        long long7 = month6.getFirstMillisecond();
        org.jfree.data.time.Year year8 = month6.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = year8.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = year8.previous();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) year8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = year8.previous();
        int int13 = month2.compareTo((java.lang.Object) year8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = year8.next();
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1709280000000L + "'", long7 == 1709280000000L);
        org.junit.Assert.assertNotNull(year8);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        boolean boolean17 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        long long22 = timeSeries19.getMaximumItemAge();
        boolean boolean23 = timeSeries1.equals((java.lang.Object) timeSeries19);
        timeSeries19.removeAgedItems((long) (short) 0, false);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.util.Date date3 = month2.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = month2.next();
        int int5 = month2.getMonth();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent4 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries1);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo5 = seriesChangeEvent4.getSummary();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = seriesChangeInfo5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertNull(seriesChangeInfo5);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = month0.previous();
        int int3 = month0.getYearValue();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2024 + "'", int3 == 2024);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getSerialIndex();
        long long3 = month0.getSerialIndex();
        int int4 = month0.getMonth();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        int int7 = timeSeries6.getMaximumItemCount();
        int int8 = month0.compareTo((java.lang.Object) timeSeries6);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.delete(7, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24291L + "'", long2 == 24291L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 24291L + "'", long3 == 24291L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        long long3 = day0.getMiddleMillisecond();
        int int4 = day0.getYear();
        boolean boolean6 = day0.equals((java.lang.Object) 5);
        int int7 = day0.getDayOfMonth();
        java.lang.String str8 = day0.toString();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day0, "Value", "hi!");
        timeSeries11.setDescription("8");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day16 = new org.jfree.data.time.Day();
        timeSeries15.add((org.jfree.data.time.RegularTimePeriod) day16, (double) (short) 0, false);
        timeSeries15.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries15.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent24 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean25 = timeSeries15.equals((java.lang.Object) seriesChangeEvent24);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        int int28 = day26.compareTo((java.lang.Object) (short) 100);
        java.lang.String str29 = day26.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries15.getDataItem((org.jfree.data.time.RegularTimePeriod) day26);
        long long31 = day26.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries11.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 0);
        int int34 = day26.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1711911599999L + "'", long3 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2024 + "'", int4 == 2024);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31-March-2024" + "'", str8, "31-March-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "31-March-2024" + "'", str29, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 45382L + "'", long31 == 45382L);
        org.junit.Assert.assertNull(timeSeriesDataItem33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2024 + "'", int34 == 2024);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        java.lang.Object obj17 = timeSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) '#', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        java.lang.String str3 = month0.toString();
        org.jfree.data.time.Year year4 = month0.getYear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "March 2024" + "'", str3, "March 2024");
        org.junit.Assert.assertNotNull(year4);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        timeSeries2.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries2.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent11 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean12 = timeSeries2.equals((java.lang.Object) seriesChangeEvent11);
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        int int15 = day13.compareTo((java.lang.Object) (short) 100);
        java.lang.String str16 = day13.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries2.getDataItem((org.jfree.data.time.RegularTimePeriod) day13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = day13.next();
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month(10, 9);
        java.util.Date date22 = month21.getStart();
        org.jfree.data.time.Year year23 = month21.getYear();
        int int24 = day13.compareTo((java.lang.Object) year23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month25 = new org.jfree.data.time.Month((int) (short) 100, year23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Month outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "31-March-2024" + "'", str16, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem17);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertNotNull(year23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.Month month24 = new org.jfree.data.time.Month();
        long long25 = month24.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries27.removeChangeListener(seriesChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day32 = new org.jfree.data.time.Day();
        timeSeries31.add((org.jfree.data.time.RegularTimePeriod) day32, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries27.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day32, (java.lang.Number) 10L);
        long long38 = day32.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries21.createCopy((org.jfree.data.time.RegularTimePeriod) month24, (org.jfree.data.time.RegularTimePeriod) day32);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        timeSeries41.add((org.jfree.data.time.RegularTimePeriod) day42, (double) (short) 0, false);
        timeSeries41.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = timeSeries41.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent50 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean51 = timeSeries41.equals((java.lang.Object) seriesChangeEvent50);
        org.jfree.data.time.Day day52 = new org.jfree.data.time.Day();
        int int54 = day52.compareTo((java.lang.Object) (short) 100);
        java.lang.String str55 = day52.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem56 = timeSeries41.getDataItem((org.jfree.data.time.RegularTimePeriod) day52);
        timeSeriesDataItem56.setSelected(false);
        timeSeriesDataItem56.setValue((java.lang.Number) (byte) 100);
        boolean boolean61 = timeSeriesDataItem56.isSelected();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = timeSeries21.addOrUpdate(timeSeriesDataItem56);
        org.jfree.data.time.Day day63 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem65 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day63, (java.lang.Number) (byte) 10);
        int int66 = timeSeriesDataItem56.compareTo((java.lang.Object) (byte) 10);
        boolean boolean67 = month4.equals((java.lang.Object) timeSeriesDataItem56);
        long long68 = month4.getFirstMillisecond();
        java.util.Calendar calendar69 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long70 = month4.getFirstMillisecond(calendar69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1709280000000L + "'", long25 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1711911599999L + "'", long38 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(regularTimePeriod48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "31-March-2024" + "'", str55, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(timeSeriesDataItem62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1709280000000L + "'", long68 == 1709280000000L);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day22 = new org.jfree.data.time.Day();
        timeSeries21.add((org.jfree.data.time.RegularTimePeriod) day22, (double) (short) 0, false);
        timeSeries21.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = timeSeries21.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent30 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean31 = timeSeries21.equals((java.lang.Object) seriesChangeEvent30);
        org.jfree.data.time.Day day32 = new org.jfree.data.time.Day();
        int int34 = day32.compareTo((java.lang.Object) (short) 100);
        java.lang.String str35 = day32.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries21.getDataItem((org.jfree.data.time.RegularTimePeriod) day32);
        timeSeriesDataItem36.setSelected(false);
        timeSeriesDataItem36.setValue((java.lang.Number) (byte) 100);
        boolean boolean41 = timeSeriesDataItem36.isSelected();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries1.addOrUpdate(timeSeriesDataItem36);
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day46 = new org.jfree.data.time.Day();
        timeSeries45.add((org.jfree.data.time.RegularTimePeriod) day46, (double) (short) 0, false);
        java.util.Date date50 = day46.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond51 = new org.jfree.data.time.FixedMillisecond(date50);
        java.util.TimeZone timeZone52 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod53 = org.jfree.data.time.RegularTimePeriod.createInstance(class43, date50, timeZone52);
        org.jfree.data.time.FixedMillisecond fixedMillisecond54 = new org.jfree.data.time.FixedMillisecond(date50);
        timeSeries1.setKey((java.lang.Comparable) fixedMillisecond54);
        java.util.Calendar calendar56 = null;
        long long57 = fixedMillisecond54.getLastMillisecond(calendar56);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "31-March-2024" + "'", str35, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(timeSeriesDataItem42);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod53);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1711868400000L + "'", long57 == 1711868400000L);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day9, (java.lang.Number) (byte) 10);
        timeSeriesDataItem11.setValue((java.lang.Number) 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries1.addOrUpdate(timeSeriesDataItem11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double17 = timeSeries16.getMaxY();
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        java.lang.Number number19 = null;
        timeSeries16.add((org.jfree.data.time.RegularTimePeriod) day18, number19, false);
        double double22 = timeSeries16.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        timeSeries24.add((org.jfree.data.time.RegularTimePeriod) day25, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries16.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day25, (java.lang.Number) 1711911599999L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = day25.next();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day25);
        java.lang.Object obj33 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day36 = new org.jfree.data.time.Day();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) day36, (double) (short) 0, false);
        timeSeries35.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = timeSeries35.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries35.addChangeListener(seriesChangeListener43);
        timeSeries35.setDomainDescription("hi!");
        org.jfree.data.time.Day day47 = new org.jfree.data.time.Day();
        int int49 = day47.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = day47.next();
        timeSeries35.add(regularTimePeriod50, (java.lang.Number) 1);
        org.jfree.data.time.Month month55 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number56 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem57 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month55, number56);
        long long58 = month55.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem59 = timeSeries35.getDataItem((org.jfree.data.time.RegularTimePeriod) month55);
        org.jfree.data.time.Year year60 = month55.getYear();
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day63 = new org.jfree.data.time.Day();
        timeSeries62.add((org.jfree.data.time.RegularTimePeriod) day63, (double) (short) 0, false);
        java.util.Date date67 = day63.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond68 = new org.jfree.data.time.FixedMillisecond(date67);
        long long69 = fixedMillisecond68.getFirstMillisecond();
        java.util.Date date70 = fixedMillisecond68.getTime();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod71 = fixedMillisecond68.next();
        int int72 = year60.compareTo((java.lang.Object) fixedMillisecond68);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) fixedMillisecond68, (java.lang.Number) 1711939031241L, true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(timeSeriesDataItem14);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(timeSeriesDataItem30);
        org.junit.Assert.assertNotNull(regularTimePeriod31);
        org.junit.Assert.assertNotNull(timeSeriesDataItem32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(regularTimePeriod42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod50);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 118L + "'", long58 == 118L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem59);
        org.junit.Assert.assertNotNull(year60);
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1711868400000L + "'", long69 == 1711868400000L);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year(9999);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        long long8 = fixedMillisecond7.getFirstMillisecond();
        java.util.Date date9 = fixedMillisecond7.getTime();
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date9);
        int int11 = month10.getMonth();
        java.util.Date date12 = month10.getStart();
        java.util.TimeZone timeZone13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year14 = new org.jfree.data.time.Year(date12, timeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711868400000L + "'", long8 == 1711868400000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 01 00:00:00 PST 2024");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 1711911599999L);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1711911599999L, "31-March-2024", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        timeSeries20.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day29 = new org.jfree.data.time.Day();
        timeSeries28.add((org.jfree.data.time.RegularTimePeriod) day29, (double) (short) 0, false);
        java.util.Date date33 = day29.getStart();
        int int34 = timeSeries20.getIndex((org.jfree.data.time.RegularTimePeriod) day29);
        java.lang.Class class35 = timeSeries20.timePeriodClass;
        org.jfree.data.time.Day day36 = new org.jfree.data.time.Day();
        int int37 = day36.getMonth();
        java.util.Date date38 = day36.getEnd();
        java.util.TimeZone timeZone39 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = org.jfree.data.time.RegularTimePeriod.createInstance(class35, date38, timeZone39);
        boolean boolean41 = timeSeries18.equals((java.lang.Object) timeZone39);
        java.lang.Object obj42 = timeSeries18.clone();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day45 = new org.jfree.data.time.Day();
        timeSeries44.add((org.jfree.data.time.RegularTimePeriod) day45, (double) (short) 0, false);
        timeSeries44.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = timeSeries44.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries44.addChangeListener(seriesChangeListener52);
        timeSeries44.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day58 = new org.jfree.data.time.Day();
        timeSeries57.add((org.jfree.data.time.RegularTimePeriod) day58, (double) (short) 0, false);
        java.util.Date date62 = day58.getStart();
        java.lang.Number number63 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem64 = timeSeries44.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day58, number63);
        java.lang.Number number65 = timeSeriesDataItem64.getValue();
        timeSeriesDataItem64.setValue((java.lang.Number) 1.0f);
        timeSeries18.add(timeSeriesDataItem64, false);
        java.lang.Number number70 = timeSeriesDataItem64.getValue();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sun Mar 31 23:59:59 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(regularTimePeriod51);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem64);
        org.junit.Assert.assertEquals("'" + number65 + "' != '" + 0.0d + "'", number65, 0.0d);
        org.junit.Assert.assertEquals("'" + number70 + "' != '" + 1.0f + "'", number70, 1.0f);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year2.previous();
        int int5 = year2.getYear();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            year2.peg(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2024 + "'", int5 == 2024);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        boolean boolean17 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        long long22 = timeSeries19.getMaximumItemAge();
        boolean boolean23 = timeSeries1.equals((java.lang.Object) timeSeries19);
        boolean boolean24 = timeSeries1.isEmpty();
        int int25 = timeSeries1.getItemCount();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year6 = month4.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = year6.next();
        long long8 = year6.getLastMillisecond();
        java.lang.Number number9 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) year6, number9);
        int int11 = year6.getYear();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) year6);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update((-1), (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNotNull(year6);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1735718399999L + "'", long8 == 1735718399999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2024 + "'", int11 == 2024);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        boolean boolean17 = timeSeries1.isEmpty();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        java.util.Date date25 = day21.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond26 = new org.jfree.data.time.FixedMillisecond(date25);
        java.util.TimeZone timeZone27 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = org.jfree.data.time.RegularTimePeriod.createInstance(class18, date25, timeZone27);
        org.jfree.data.time.FixedMillisecond fixedMillisecond29 = new org.jfree.data.time.FixedMillisecond(date25);
        java.util.Calendar calendar30 = null;
        long long31 = fixedMillisecond29.getLastMillisecond(calendar30);
        java.lang.Number number32 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) fixedMillisecond29);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = fixedMillisecond29.next();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day36 = new org.jfree.data.time.Day();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) day36, (double) (short) 0, false);
        java.util.Date date40 = day36.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond41 = new org.jfree.data.time.FixedMillisecond(date40);
        java.util.Date date42 = fixedMillisecond41.getTime();
        java.util.Calendar calendar43 = null;
        long long44 = fixedMillisecond41.getLastMillisecond(calendar43);
        long long45 = fixedMillisecond41.getMiddleMillisecond();
        boolean boolean46 = fixedMillisecond29.equals((java.lang.Object) long45);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1711868400000L + "'", long31 == 1711868400000L);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + 0.0d + "'", number32, 0.0d);
        org.junit.Assert.assertNotNull(regularTimePeriod33);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1711868400000L + "'", long44 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1711868400000L + "'", long45 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        timeSeries7.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries7.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries7.addChangeListener(seriesChangeListener15);
        timeSeries7.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        java.util.Date date25 = day21.getStart();
        java.lang.Number number26 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day21, number26);
        timeSeries1.add(timeSeriesDataItem27);
        double double29 = timeSeries1.getMinY();
        double double30 = timeSeries1.getMinY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day33 = new org.jfree.data.time.Day();
        timeSeries32.add((org.jfree.data.time.RegularTimePeriod) day33, (double) (short) 0, false);
        java.util.Date date37 = day33.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond38 = new org.jfree.data.time.FixedMillisecond(date37);
        long long39 = fixedMillisecond38.getFirstMillisecond();
        java.util.Date date40 = fixedMillisecond38.getTime();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) fixedMillisecond38, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1711868400000L + "'", long39 == 1711868400000L);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.Year year12 = new org.jfree.data.time.Year(0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) year12);
        long long14 = year12.getSerialIndex();
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = year12.getFirstMillisecond(calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(timeSeriesDataItem13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        int int12 = timeSeries1.getItemCount();
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day16 = new org.jfree.data.time.Day();
        timeSeries15.add((org.jfree.data.time.RegularTimePeriod) day16, (double) (short) 0, false);
        timeSeries15.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries15.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent24 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean25 = timeSeries15.equals((java.lang.Object) seriesChangeEvent24);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double28 = timeSeries27.getMaxY();
        java.lang.Comparable comparable29 = timeSeries27.getKey();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries15.addAndOrUpdate(timeSeries27);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries15.addChangeListener(seriesChangeListener31);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries1.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day36 = new org.jfree.data.time.Day();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) day36, (double) (short) 0, false);
        java.util.Date date40 = day36.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond41 = new org.jfree.data.time.FixedMillisecond(date40);
        long long42 = fixedMillisecond41.getFirstMillisecond();
        java.util.Date date43 = fixedMillisecond41.getTime();
        org.jfree.data.time.Month month44 = new org.jfree.data.time.Month(date43);
        int int45 = month44.getMonth();
        java.util.Date date46 = month44.getStart();
        int int47 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) month44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries49.addChangeListener(seriesChangeListener50);
        org.jfree.data.time.Month month52 = new org.jfree.data.time.Month();
        long long53 = month52.getFirstMillisecond();
        org.jfree.data.time.Year year54 = month52.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod55 = year54.next();
        long long56 = year54.getLastMillisecond();
        java.lang.Number number57 = null;
        timeSeries49.add((org.jfree.data.time.RegularTimePeriod) year54, number57);
        int int59 = year54.getYear();
        java.lang.String str60 = year54.toString();
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day63 = new org.jfree.data.time.Day();
        timeSeries62.add((org.jfree.data.time.RegularTimePeriod) day63, (double) (short) 0, false);
        java.util.Date date67 = day63.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond68 = new org.jfree.data.time.FixedMillisecond(date67);
        java.util.Date date69 = fixedMillisecond68.getTime();
        java.util.Calendar calendar70 = null;
        long long71 = fixedMillisecond68.getLastMillisecond(calendar70);
        java.util.Calendar calendar72 = null;
        long long73 = fixedMillisecond68.getFirstMillisecond(calendar72);
        java.util.Calendar calendar74 = null;
        long long75 = fixedMillisecond68.getFirstMillisecond(calendar74);
        java.util.Calendar calendar76 = null;
        long long77 = fixedMillisecond68.getMiddleMillisecond(calendar76);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod78 = fixedMillisecond68.previous();
        boolean boolean79 = year54.equals((java.lang.Object) fixedMillisecond68);
        timeSeries1.setKey((java.lang.Comparable) boolean79);
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + 100L + "'", comparable29, 100L);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1711868400000L + "'", long42 == 1711868400000L);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Fri Mar 01 00:00:00 PST 2024");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1709280000000L + "'", long53 == 1709280000000L);
        org.junit.Assert.assertNotNull(year54);
        org.junit.Assert.assertNotNull(regularTimePeriod55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1735718399999L + "'", long56 == 1735718399999L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2024 + "'", int59 == 2024);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "2024" + "'", str60, "2024");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1711868400000L + "'", long71 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1711868400000L + "'", long73 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1711868400000L + "'", long75 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 1711868400000L + "'", long77 == 1711868400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        long long17 = day8.getFirstMillisecond();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1711868400000L + "'", long17 == 1711868400000L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        int int8 = timeSeries1.getItemCount();
        double double9 = timeSeries1.getMinY();
        double double10 = timeSeries1.getMaxY();
        int int11 = timeSeries1.getItemCount();
        java.util.Collection collection12 = timeSeries1.getTimePeriods();
        org.jfree.data.time.Month month15 = new org.jfree.data.time.Month(10, 9);
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) month15, (java.lang.Number) 11);
        long long18 = month15.getLastMillisecond();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-61857014400001L) + "'", long18 == (-61857014400001L));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.Day day5 = new org.jfree.data.time.Day();
        java.lang.Number number6 = null;
        timeSeries3.add((org.jfree.data.time.RegularTimePeriod) day5, number6, false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day5);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        timeSeries11.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = timeSeries11.getNextTimePeriod();
        timeSeries11.setMaximumItemCount((int) ' ');
        org.jfree.data.time.Year year22 = new org.jfree.data.time.Year(0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries11.getRawDataItem((org.jfree.data.time.RegularTimePeriod) year22);
        java.util.Collection collection24 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        java.lang.String str25 = timeSeries11.getRangeDescription();
        timeSeries11.removeAgedItems(false);
        timeSeries11.clear();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo29 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent30 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries11, seriesChangeInfo29);
        java.util.Collection collection31 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        timeSeries1.setNotify(false);
        org.jfree.data.time.Year year35 = new org.jfree.data.time.Year();
        long long36 = year35.getLastMillisecond();
        org.jfree.data.time.Month month37 = new org.jfree.data.time.Month((int) (short) 10, year35);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((org.jfree.data.time.RegularTimePeriod) year35, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: There is no existing value for the specified 'period'.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(regularTimePeriod18);
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1735718399999L + "'", long36 == 1735718399999L);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        int int15 = day13.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = day13.next();
        timeSeries1.add(regularTimePeriod16, (java.lang.Number) 1);
        double double19 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day();
        int int22 = day20.compareTo((java.lang.Object) (short) 100);
        long long23 = day20.getMiddleMillisecond();
        int int24 = day20.getYear();
        boolean boolean26 = day20.equals((java.lang.Object) 5);
        int int27 = day20.getDayOfMonth();
        long long28 = day20.getSerialIndex();
        long long29 = day20.getFirstMillisecond();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day20, (java.lang.Number) 1711954799999L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 31-March-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711911599999L + "'", long23 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2024 + "'", int24 == 2024);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31 + "'", int27 == 31);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 45382L + "'", long28 == 45382L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1711868400000L + "'", long29 == 1711868400000L);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day(serialDate7);
        boolean boolean10 = day8.equals((java.lang.Object) 1.0d);
        org.jfree.data.time.SerialDate serialDate11 = day8.getSerialDate();
        java.util.Date date12 = day8.getEnd();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serialDate11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 23:59:59 PDT 2024");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        timeSeries1.setKey((java.lang.Comparable) "31-March-2024");
        java.util.List list22 = timeSeries1.getItems();
        timeSeries1.setMaximumItemAge((long) (byte) 0);
        long long25 = timeSeries1.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries1.addChangeListener(seriesChangeListener26);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double27 = timeSeries26.getMaxY();
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        java.lang.Number number29 = null;
        timeSeries26.add((org.jfree.data.time.RegularTimePeriod) day28, number29, false);
        double double32 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day35 = new org.jfree.data.time.Day();
        timeSeries34.add((org.jfree.data.time.RegularTimePeriod) day35, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries26.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day35, (java.lang.Number) 1711911599999L);
        int int42 = timeSeriesDataItem40.compareTo((java.lang.Object) (byte) -1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries1.addOrUpdate(timeSeriesDataItem40);
        timeSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number47 = timeSeries1.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "31-March-2024" + "'", str22, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeriesDataItem40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(timeSeriesDataItem43);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        java.util.Date date19 = day15.getStart();
        java.lang.Number number20 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, number20);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.time.Year year1 = org.jfree.data.time.Year.parseYear("8");
        org.junit.Assert.assertNotNull(year1);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        double double17 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day();
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) day20, (double) (short) 0, false);
        java.util.Date date24 = day20.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond25 = new org.jfree.data.time.FixedMillisecond(date24);
        java.util.Date date26 = fixedMillisecond25.getTime();
        java.util.Calendar calendar27 = null;
        long long28 = fixedMillisecond25.getLastMillisecond(calendar27);
        long long29 = fixedMillisecond25.getMiddleMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond25, (double) (byte) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = fixedMillisecond25.previous();
        java.util.Calendar calendar33 = null;
        long long34 = fixedMillisecond25.getLastMillisecond(calendar33);
        java.util.Calendar calendar35 = null;
        fixedMillisecond25.peg(calendar35);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) fixedMillisecond25, (java.lang.Number) 24290L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1711868400000L + "'", long28 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1711868400000L + "'", long29 == 1711868400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1711868400000L + "'", long34 == 1711868400000L);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        int int17 = day8.getYear();
        int int18 = day8.getYear();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2024 + "'", int17 == 2024);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2024 + "'", int18 == 2024);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double7 = timeSeries6.getMaxY();
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        java.lang.Number number9 = null;
        timeSeries6.add((org.jfree.data.time.RegularTimePeriod) day8, number9, false);
        double double12 = timeSeries6.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries6.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, (java.lang.Number) 1711911599999L);
        int int22 = timeSeriesDataItem20.compareTo((java.lang.Object) (byte) -1);
        timeSeries1.add(timeSeriesDataItem20);
        boolean boolean24 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(timeSeriesDataItem20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number3 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, number3);
        java.util.Date date5 = month2.getStart();
        java.util.TimeZone timeZone6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year7 = new org.jfree.data.time.Year(date5, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Tue Oct 01 00:00:00 PST 9");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        int int12 = timeSeries1.getItemCount();
        timeSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener14);
        java.lang.Comparable comparable16 = timeSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 100L + "'", comparable16, 100L);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number3 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, number3);
        long long5 = month2.getSerialIndex();
        java.util.Date date6 = month2.getStart();
        long long7 = month2.getLastMillisecond();
        java.lang.String str8 = month2.toString();
        long long9 = month2.getLastMillisecond();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 118L + "'", long5 == 118L);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-61857014400001L) + "'", long7 == (-61857014400001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "October 9" + "'", str8, "October 9");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-61857014400001L) + "'", long9 == (-61857014400001L));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        java.util.List list17 = timeSeries1.data;
        java.lang.String str18 = timeSeries1.getDomainDescription();
        timeSeries1.setDescription("hi!");
        java.lang.Comparable comparable21 = timeSeries1.getKey();
        timeSeries1.setDescription("2024");
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.addChangeListener(seriesChangeListener26);
        timeSeries25.clear();
        org.jfree.data.time.Day day29 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day29, (java.lang.Number) (byte) 10);
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day29, (java.lang.Number) 12, true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day29, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 31-March-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 100 + "'", comparable21, (short) 100);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        int int8 = timeSeries1.getItemCount();
        double double9 = timeSeries1.getMinY();
        double double10 = timeSeries1.getMaxY();
        int int11 = timeSeries1.getMaximumItemCount();
        boolean boolean12 = timeSeries1.getNotify();
        boolean boolean13 = timeSeries1.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.util.List list3 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) 12, false);
        org.jfree.data.time.Day day7 = new org.jfree.data.time.Day();
        int int9 = day7.compareTo((java.lang.Object) (short) 100);
        long long10 = day7.getMiddleMillisecond();
        int int11 = day7.getYear();
        boolean boolean13 = day7.equals((java.lang.Object) 5);
        int int14 = day7.getDayOfMonth();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day7, (double) 3);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries1.addChangeListener(seriesChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemAge((-61859692800000L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711911599999L + "'", long10 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2024 + "'", int11 == 2024);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
        org.junit.Assert.assertNull(timeSeriesDataItem16);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        boolean boolean17 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        long long22 = timeSeries19.getMaximumItemAge();
        boolean boolean23 = timeSeries1.equals((java.lang.Object) timeSeries19);
        boolean boolean24 = timeSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries1.getTimePeriod(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 31, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 10, false);
        java.util.List list17 = timeSeries1.data;
        java.lang.String str18 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        timeSeries20.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries20.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent29 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean30 = timeSeries20.equals((java.lang.Object) seriesChangeEvent29);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        int int33 = day31.compareTo((java.lang.Object) (short) 100);
        java.lang.String str34 = day31.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries20.getDataItem((org.jfree.data.time.RegularTimePeriod) day31);
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) day31);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        timeSeries38.add((org.jfree.data.time.RegularTimePeriod) day39, (double) (short) 0, false);
        java.util.Date date43 = day39.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond44 = new org.jfree.data.time.FixedMillisecond(date43);
        java.util.Date date45 = fixedMillisecond44.getTime();
        java.util.Calendar calendar46 = null;
        long long47 = fixedMillisecond44.getLastMillisecond(calendar46);
        java.util.Calendar calendar48 = null;
        long long49 = fixedMillisecond44.getFirstMillisecond(calendar48);
        java.util.Calendar calendar50 = null;
        long long51 = fixedMillisecond44.getFirstMillisecond(calendar50);
        java.util.Calendar calendar52 = null;
        long long53 = fixedMillisecond44.getMiddleMillisecond(calendar52);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem55 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond44, (java.lang.Number) Double.NaN);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem57 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) fixedMillisecond44, (java.lang.Number) 7);
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double60 = timeSeries59.getMaxY();
        org.jfree.data.time.Day day61 = new org.jfree.data.time.Day();
        java.lang.Number number62 = null;
        timeSeries59.add((org.jfree.data.time.RegularTimePeriod) day61, number62, false);
        timeSeries59.removeAgedItems(1L, false);
        boolean boolean68 = timeSeries59.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries69 = timeSeries1.addAndOrUpdate(timeSeries59);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.Day, but the TimeSeries is expecting an instance of org.jfree.data.time.FixedMillisecond.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertNotNull(regularTimePeriod27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "31-March-2024" + "'", str34, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem35);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1711868400000L + "'", long47 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1711868400000L + "'", long49 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1711868400000L + "'", long51 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1711868400000L + "'", long53 == 1711868400000L);
        org.junit.Assert.assertNull(timeSeriesDataItem57);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        int int6 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        java.util.Date date13 = day9.getStart();
        org.jfree.data.time.SerialDate serialDate14 = day9.getSerialDate();
        java.lang.String str15 = day9.toString();
        java.lang.Number number16 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day9, number16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.removeChangeListener(seriesChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day24 = new org.jfree.data.time.Day();
        timeSeries23.add((org.jfree.data.time.RegularTimePeriod) day24, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries19.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day24, (java.lang.Number) 10L);
        int int30 = timeSeries19.getItemCount();
        java.util.List list31 = timeSeries19.getItems();
        timeSeries1.data = list31;
        int int33 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection35 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNull(timeSeriesDataItem29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.util.List list3 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) 12, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        long long4 = year2.getLastMillisecond();
        long long5 = year2.getFirstMillisecond();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = year2.getFirstMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1735718399999L + "'", long4 == 1735718399999L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1704096000000L + "'", long5 == 1704096000000L);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        timeSeries1.setMaximumItemCount((int) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        long long22 = timeSeries19.getMaximumItemAge();
        java.lang.String str23 = timeSeries19.getDescription();
        double double24 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day27 = new org.jfree.data.time.Day();
        timeSeries26.add((org.jfree.data.time.RegularTimePeriod) day27, (double) (short) 0, false);
        timeSeries26.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = timeSeries26.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent35 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean36 = timeSeries26.equals((java.lang.Object) seriesChangeEvent35);
        org.jfree.data.time.Day day37 = new org.jfree.data.time.Day();
        int int39 = day37.compareTo((java.lang.Object) (short) 100);
        java.lang.String str40 = day37.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = timeSeries26.getDataItem((org.jfree.data.time.RegularTimePeriod) day37);
        timeSeries19.add(timeSeriesDataItem41);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double45 = timeSeries44.getMaxY();
        org.jfree.data.time.Day day46 = new org.jfree.data.time.Day();
        java.lang.Number number47 = null;
        timeSeries44.add((org.jfree.data.time.RegularTimePeriod) day46, number47, false);
        double double50 = timeSeries44.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day53 = new org.jfree.data.time.Day();
        timeSeries52.add((org.jfree.data.time.RegularTimePeriod) day53, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem58 = timeSeries44.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day53, (java.lang.Number) 1711911599999L);
        int int60 = timeSeriesDataItem58.compareTo((java.lang.Object) (byte) -1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem61 = timeSeries19.addOrUpdate(timeSeriesDataItem58);
        boolean boolean62 = timeSeriesDataItem61.isSelected();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem61);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 31-March-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(regularTimePeriod33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "31-March-2024" + "'", str40, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem41);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(timeSeriesDataItem58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(timeSeriesDataItem61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year(3);
        long long2 = year1.getLastMillisecond();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-62041132800001L) + "'", long2 == (-62041132800001L));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getSerialIndex();
        long long3 = month0.getSerialIndex();
        int int4 = month0.getMonth();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        int int7 = timeSeries6.getMaximumItemCount();
        int int8 = month0.compareTo((java.lang.Object) timeSeries6);
        java.lang.String str9 = month0.toString();
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = month0.getFirstMillisecond(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24291L + "'", long2 == 24291L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 24291L + "'", long3 == 24291L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "March 2024" + "'", str9, "March 2024");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class8 = timeSeries1.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries1.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        int int15 = day13.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = day13.next();
        timeSeries1.add(regularTimePeriod16, (java.lang.Number) 1);
        double double19 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.addChangeListener(seriesChangeListener22);
        long long24 = timeSeries21.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        long long29 = timeSeries26.getMaximumItemAge();
        java.lang.String str30 = timeSeries26.getDescription();
        double double31 = timeSeries26.getMinY();
        java.util.Collection collection32 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries26.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day37 = new org.jfree.data.time.Day();
        timeSeries36.add((org.jfree.data.time.RegularTimePeriod) day37, (double) (short) 0, false);
        java.util.Date date41 = day37.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond42 = new org.jfree.data.time.FixedMillisecond(date41);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = fixedMillisecond42.next();
        int int44 = timeSeries26.getIndex(regularTimePeriod43);
        boolean boolean45 = timeSeries1.equals((java.lang.Object) int44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day48 = new org.jfree.data.time.Day();
        timeSeries47.add((org.jfree.data.time.RegularTimePeriod) day48, (double) (short) 0, false);
        timeSeries47.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod54 = timeSeries47.getNextTimePeriod();
        java.util.Collection collection55 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries47);
        boolean boolean56 = timeSeries1.getNotify();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        int int6 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        java.util.Date date13 = day9.getStart();
        org.jfree.data.time.SerialDate serialDate14 = day9.getSerialDate();
        java.lang.String str15 = day9.toString();
        java.lang.Number number16 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day9, number16);
        org.jfree.data.time.SerialDate serialDate18 = day9.getSerialDate();
        java.util.Calendar calendar19 = null;
        // The following exception was thrown during execution in test generation
        try {
            day9.peg(calendar19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(serialDate18);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        timeSeries9.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        java.util.Date date22 = day18.getStart();
        org.jfree.data.time.SerialDate serialDate23 = day18.getSerialDate();
        java.lang.Number number24 = null;
        timeSeries9.update((org.jfree.data.time.RegularTimePeriod) day18, number24);
        java.lang.Number number26 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) day18);
        int int27 = timeSeries1.getItemCount();
        timeSeries1.setDescription("org.jfree.data.event.SeriesChangeEvent[source=true]");
        timeSeries1.removeAgedItems(true);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate23);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 0.0d + "'", number26, 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        long long12 = day6.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = day6.previous();
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711911599999L + "'", long12 == 1711911599999L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        long long20 = month4.getSerialIndex();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 24291L + "'", long20 == 24291L);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year2.previous();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) year2);
        java.lang.String str6 = year2.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2024" + "'", str6, "2024");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        int int15 = day13.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = day13.next();
        timeSeries1.add(regularTimePeriod16, (java.lang.Number) 1);
        java.lang.String str19 = timeSeries1.getDescription();
        double double20 = timeSeries1.getMinY();
        long long21 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        org.jfree.data.time.SerialDate serialDate15 = day10.getSerialDate();
        java.lang.Number number16 = null;
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day10, number16);
        int int18 = day10.getDayOfMonth();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = day10.next();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year1 = org.jfree.data.time.Year.parseYear("org.jfree.data.general.SeriesException: 31-March-2024");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException; message: Cannot parse string.");
        } catch (org.jfree.data.time.TimePeriodFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        int int12 = timeSeries1.getItemCount();
        java.util.List list13 = timeSeries1.getItems();
        org.jfree.data.time.Day day14 = new org.jfree.data.time.Day();
        int int16 = day14.compareTo((java.lang.Object) (short) 100);
        long long17 = day14.getMiddleMillisecond();
        int int18 = day14.getYear();
        boolean boolean20 = day14.equals((java.lang.Object) 5);
        int int21 = day14.getDayOfMonth();
        java.lang.String str22 = day14.toString();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day14, "Value", "hi!");
        timeSeries25.setMaximumItemAge(10L);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        timeSeries29.add((org.jfree.data.time.RegularTimePeriod) day30, (double) (short) 0, false);
        timeSeries29.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = timeSeries29.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent38 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean39 = timeSeries29.equals((java.lang.Object) seriesChangeEvent38);
        org.jfree.data.time.Day day40 = new org.jfree.data.time.Day();
        int int42 = day40.compareTo((java.lang.Object) (short) 100);
        java.lang.String str43 = day40.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = timeSeries29.getDataItem((org.jfree.data.time.RegularTimePeriod) day40);
        timeSeriesDataItem44.setSelected(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = timeSeriesDataItem44.getPeriod();
        boolean boolean48 = timeSeriesDataItem44.isSelected();
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day51 = new org.jfree.data.time.Day();
        timeSeries50.add((org.jfree.data.time.RegularTimePeriod) day51, (double) (short) 0, false);
        java.util.Date date55 = day51.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond56 = new org.jfree.data.time.FixedMillisecond(date55);
        long long57 = fixedMillisecond56.getFirstMillisecond();
        java.util.Date date58 = fixedMillisecond56.getTime();
        org.jfree.data.time.FixedMillisecond fixedMillisecond59 = new org.jfree.data.time.FixedMillisecond(date58);
        int int60 = timeSeriesDataItem44.compareTo((java.lang.Object) fixedMillisecond59);
        org.jfree.data.time.Month month63 = new org.jfree.data.time.Month(10, 9);
        java.util.Date date64 = month63.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod65 = month63.next();
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries25.createCopy((org.jfree.data.time.RegularTimePeriod) fixedMillisecond59, regularTimePeriod65);
        java.util.Calendar calendar67 = null;
        fixedMillisecond59.peg(calendar67);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) fixedMillisecond59, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1711911599999L + "'", long17 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2024 + "'", int18 == 2024);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "31-March-2024" + "'", str22, "31-March-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "31-March-2024" + "'", str43, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem44);
        org.junit.Assert.assertNotNull(regularTimePeriod47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1711868400000L + "'", long57 == 1711868400000L);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertNotNull(regularTimePeriod65);
        org.junit.Assert.assertNotNull(timeSeries66);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.util.List list3 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) 12, false);
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.removeAgedItems(true);
        java.lang.String str10 = timeSeries1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener11);
        timeSeries1.setMaximumItemCount(0);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        int int17 = day15.compareTo((java.lang.Object) (short) 100);
        long long18 = day15.getMiddleMillisecond();
        int int19 = day15.getYear();
        boolean boolean21 = day15.equals((java.lang.Object) 5);
        int int22 = day15.getDayOfMonth();
        long long23 = day15.getSerialIndex();
        long long24 = day15.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day15);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        timeSeries27.add((org.jfree.data.time.RegularTimePeriod) day28, (double) (short) 0, false);
        java.util.Date date32 = day28.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond33 = new org.jfree.data.time.FixedMillisecond(date32);
        long long34 = fixedMillisecond33.getFirstMillisecond();
        java.util.Calendar calendar35 = null;
        fixedMillisecond33.peg(calendar35);
        long long37 = fixedMillisecond33.getMiddleMillisecond();
        long long38 = fixedMillisecond33.getSerialIndex();
        long long39 = fixedMillisecond33.getLastMillisecond();
        boolean boolean40 = day15.equals((java.lang.Object) long39);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 100L + "'", comparable7, 100L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2024 + "'", int19 == 2024);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 31 + "'", int22 == 31);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 45382L + "'", long23 == 45382L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1711868400000L + "'", long24 == 1711868400000L);
        org.junit.Assert.assertNull(timeSeriesDataItem25);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1711868400000L + "'", long34 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1711868400000L + "'", long37 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1711868400000L + "'", long38 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1711868400000L + "'", long39 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        java.util.Calendar calendar9 = null;
        long long10 = fixedMillisecond7.getLastMillisecond(calendar9);
        long long11 = fixedMillisecond7.getMiddleMillisecond();
        java.util.Date date12 = fixedMillisecond7.getTime();
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day(date12);
        long long14 = day13.getFirstMillisecond();
        java.util.Date date15 = day13.getStart();
        int int16 = day13.getYear();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1711868400000L + "'", long11 == 1711868400000L);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1711868400000L + "'", long14 == 1711868400000L);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2024 + "'", int16 == 2024);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year2.previous();
        int int5 = year2.getYear();
        long long6 = year2.getFirstMillisecond();
        int int7 = year2.getYear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2024 + "'", int5 == 2024);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1704096000000L + "'", long6 == 1704096000000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2024 + "'", int7 == 2024);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = month0.previous();
        boolean boolean4 = month0.equals((java.lang.Object) 10.0d);
        long long5 = month0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = month0.next();
        org.jfree.data.time.Year year7 = month0.getYear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 24291L + "'", long5 == 24291L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(year7);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        int int12 = timeSeries1.getItemCount();
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day16 = new org.jfree.data.time.Day();
        timeSeries15.add((org.jfree.data.time.RegularTimePeriod) day16, (double) (short) 0, false);
        timeSeries15.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries15.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent24 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean25 = timeSeries15.equals((java.lang.Object) seriesChangeEvent24);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double28 = timeSeries27.getMaxY();
        java.lang.Comparable comparable29 = timeSeries27.getKey();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries15.addAndOrUpdate(timeSeries27);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries15.addChangeListener(seriesChangeListener31);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries1.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day36 = new org.jfree.data.time.Day();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) day36, (double) (short) 0, false);
        java.util.Date date40 = day36.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond41 = new org.jfree.data.time.FixedMillisecond(date40);
        long long42 = fixedMillisecond41.getFirstMillisecond();
        java.util.Date date43 = fixedMillisecond41.getTime();
        org.jfree.data.time.Month month44 = new org.jfree.data.time.Month(date43);
        int int45 = month44.getMonth();
        java.util.Date date46 = month44.getStart();
        int int47 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) month44);
        java.util.Calendar calendar48 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long49 = month44.getFirstMillisecond(calendar48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + 100L + "'", comparable29, 100L);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1711868400000L + "'", long42 == 1711868400000L);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Fri Mar 01 00:00:00 PST 2024");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        timeSeries1.setDomainDescription("");
        int int22 = timeSeries1.getItemCount();
        int int23 = timeSeries1.getItemCount();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent24 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries1);
        java.lang.Object obj25 = seriesChangeEvent24.getSource();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getSerialIndex();
        long long3 = month0.getFirstMillisecond();
        boolean boolean5 = month0.equals((java.lang.Object) 100);
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            month0.peg(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24291L + "'", long2 == 24291L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1709280000000L + "'", long3 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        long long4 = year2.getLastMillisecond();
        long long5 = year2.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.addChangeListener(seriesChangeListener8);
        long long10 = timeSeries7.getMaximumItemAge();
        java.lang.String str11 = timeSeries7.getDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day14 = new org.jfree.data.time.Day();
        timeSeries13.add((org.jfree.data.time.RegularTimePeriod) day14, (double) (short) 0, false);
        java.util.Date date18 = day14.getStart();
        long long19 = day14.getFirstMillisecond();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day14, (java.lang.Number) 10, false);
        boolean boolean23 = year2.equals((java.lang.Object) timeSeries7);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.addChangeListener(seriesChangeListener26);
        long long28 = timeSeries25.getMaximumItemAge();
        java.lang.String str29 = timeSeries25.getDescription();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day32 = new org.jfree.data.time.Day();
        timeSeries31.add((org.jfree.data.time.RegularTimePeriod) day32, (double) (short) 0, false);
        java.util.Date date36 = day32.getStart();
        long long37 = day32.getFirstMillisecond();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day32, (java.lang.Number) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day32, (java.lang.Number) 2147483647, true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 31-March-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1735718399999L + "'", long4 == 1735718399999L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1704096000000L + "'", long5 == 1704096000000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1711868400000L + "'", long19 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 9223372036854775807L + "'", long28 == 9223372036854775807L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1711868400000L + "'", long37 == 1711868400000L);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        long long16 = day10.getFirstMillisecond();
        java.lang.String str17 = day10.toString();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1711868400000L + "'", long16 == 1711868400000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "31-March-2024" + "'", str17, "31-March-2024");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.util.List list3 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) 12, false);
        org.jfree.data.time.Day day7 = new org.jfree.data.time.Day();
        int int9 = day7.compareTo((java.lang.Object) (short) 100);
        long long10 = day7.getMiddleMillisecond();
        int int11 = day7.getYear();
        boolean boolean13 = day7.equals((java.lang.Object) 5);
        int int14 = day7.getDayOfMonth();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day7, (double) 3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711911599999L + "'", long10 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2024 + "'", int11 == 2024);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
        org.junit.Assert.assertNull(timeSeriesDataItem16);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        long long3 = day0.getMiddleMillisecond();
        int int4 = day0.getYear();
        boolean boolean6 = day0.equals((java.lang.Object) 5);
        int int7 = day0.getDayOfMonth();
        java.lang.String str8 = day0.toString();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day0, "Value", "hi!");
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.delete((int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1711911599999L + "'", long3 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2024 + "'", int4 == 2024);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31-March-2024" + "'", str8, "31-March-2024");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.util.List list3 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) 12, false);
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.removeAgedItems(false);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 100L + "'", comparable7, 100L);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.data.time.Year year1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(10, year1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        java.util.Calendar calendar9 = null;
        long long10 = fixedMillisecond7.getLastMillisecond(calendar9);
        long long11 = fixedMillisecond7.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = fixedMillisecond7.next();
        long long13 = fixedMillisecond7.getFirstMillisecond();
        java.util.Calendar calendar14 = null;
        long long15 = fixedMillisecond7.getFirstMillisecond(calendar14);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1711868400000L + "'", long11 == 1711868400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1711868400000L + "'", long15 == 1711868400000L);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        java.util.Calendar calendar9 = null;
        long long10 = fixedMillisecond7.getLastMillisecond(calendar9);
        java.util.Calendar calendar11 = null;
        long long12 = fixedMillisecond7.getFirstMillisecond(calendar11);
        java.util.Calendar calendar13 = null;
        long long14 = fixedMillisecond7.getFirstMillisecond(calendar13);
        long long15 = fixedMillisecond7.getFirstMillisecond();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711868400000L + "'", long12 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1711868400000L + "'", long14 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1711868400000L + "'", long15 == 1711868400000L);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        int int5 = day3.compareTo((java.lang.Object) (short) 100);
        long long6 = day3.getMiddleMillisecond();
        int int7 = day3.getYear();
        boolean boolean9 = day3.equals((java.lang.Object) 5);
        int int10 = day3.getDayOfMonth();
        java.lang.String str11 = day3.toString();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day3, "Value", "hi!");
        int int15 = day0.compareTo((java.lang.Object) day3);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day0, "hi!", "2024");
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener19);
        java.lang.Object obj21 = timeSeries18.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1711911599999L + "'", long6 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2024 + "'", int7 == 2024);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "31-March-2024" + "'", str11, "31-March-2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day3);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        timeSeries9.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries9.getNextTimePeriod();
        timeSeries9.setMaximumItemCount((int) ' ');
        org.jfree.data.time.Year year20 = new org.jfree.data.time.Year(0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries9.getRawDataItem((org.jfree.data.time.RegularTimePeriod) year20);
        java.util.Collection collection22 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        java.lang.String str23 = timeSeries9.getRangeDescription();
        timeSeries9.removeAgedItems(false);
        java.lang.Object obj26 = timeSeries9.clone();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        long long12 = day6.getSerialIndex();
        long long13 = day6.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = day6.next();
        java.lang.String str15 = day6.toString();
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 45382L + "'", long12 == 45382L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711954799999L + "'", long13 == 1711954799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        timeSeriesDataItem16.setSelected(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeriesDataItem16.getPeriod();
        boolean boolean20 = timeSeriesDataItem16.isSelected();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day23 = new org.jfree.data.time.Day();
        timeSeries22.add((org.jfree.data.time.RegularTimePeriod) day23, (double) (short) 0, false);
        java.util.Date date27 = day23.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond28 = new org.jfree.data.time.FixedMillisecond(date27);
        long long29 = fixedMillisecond28.getFirstMillisecond();
        java.util.Date date30 = fixedMillisecond28.getTime();
        org.jfree.data.time.FixedMillisecond fixedMillisecond31 = new org.jfree.data.time.FixedMillisecond(date30);
        int int32 = timeSeriesDataItem16.compareTo((java.lang.Object) fixedMillisecond31);
        long long33 = fixedMillisecond31.getMiddleMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1711868400000L + "'", long29 == 1711868400000L);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1711868400000L + "'", long33 == 1711868400000L);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month();
        long long3 = month2.getFirstMillisecond();
        long long4 = month2.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, 0.0d);
        timeSeries1.add(timeSeriesDataItem6, false);
        timeSeries1.clear();
        java.lang.Class class10 = timeSeries1.timePeriodClass;
        java.lang.Class class11 = null;
        timeSeries1.timePeriodClass = class11;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1709280000000L + "'", long3 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 24291L + "'", long4 == 24291L);
        org.junit.Assert.assertNull(class10);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMinY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries8.addChangeListener(seriesChangeListener9);
        long long11 = timeSeries8.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        long long16 = timeSeries13.getMaximumItemAge();
        java.lang.String str17 = timeSeries13.getDescription();
        double double18 = timeSeries13.getMinY();
        java.util.Collection collection19 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        java.util.Collection collection20 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        java.util.Collection collection21 = timeSeries8.getTimePeriods();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries8.addChangeListener(seriesChangeListener9);
        long long11 = timeSeries8.getMaximumItemAge();
        java.lang.String str12 = timeSeries8.getDescription();
        double double13 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day16 = new org.jfree.data.time.Day();
        timeSeries15.add((org.jfree.data.time.RegularTimePeriod) day16, (double) (short) 0, false);
        timeSeries15.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries15.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent24 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean25 = timeSeries15.equals((java.lang.Object) seriesChangeEvent24);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        int int28 = day26.compareTo((java.lang.Object) (short) 100);
        java.lang.String str29 = day26.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries15.getDataItem((org.jfree.data.time.RegularTimePeriod) day26);
        timeSeries8.add(timeSeriesDataItem30);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double34 = timeSeries33.getMaxY();
        org.jfree.data.time.Day day35 = new org.jfree.data.time.Day();
        java.lang.Number number36 = null;
        timeSeries33.add((org.jfree.data.time.RegularTimePeriod) day35, number36, false);
        double double39 = timeSeries33.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        timeSeries41.add((org.jfree.data.time.RegularTimePeriod) day42, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries33.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day42, (java.lang.Number) 1711911599999L);
        int int49 = timeSeriesDataItem47.compareTo((java.lang.Object) (byte) -1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = timeSeries8.addOrUpdate(timeSeriesDataItem47);
        java.util.Collection collection51 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        boolean boolean53 = timeSeries1.equals((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "31-March-2024" + "'", str29, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem30);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(timeSeriesDataItem47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(timeSeriesDataItem50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.lang.Class class0 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        java.util.Date date7 = day3.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond8 = new org.jfree.data.time.FixedMillisecond(date7);
        java.util.TimeZone timeZone9 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = org.jfree.data.time.RegularTimePeriod.createInstance(class0, date7, timeZone9);
        org.jfree.data.time.FixedMillisecond fixedMillisecond11 = new org.jfree.data.time.FixedMillisecond(date7);
        java.util.Calendar calendar12 = null;
        long long13 = fixedMillisecond11.getLastMillisecond(calendar12);
        java.util.Date date14 = fixedMillisecond11.getStart();
        java.util.TimeZone timeZone15 = null;
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year17 = new org.jfree.data.time.Year(date14, timeZone15, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        int int6 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        java.util.Date date13 = day9.getStart();
        org.jfree.data.time.SerialDate serialDate14 = day9.getSerialDate();
        java.lang.String str15 = day9.toString();
        java.lang.Number number16 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day9, number16);
        boolean boolean18 = timeSeries1.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries1.addChangeListener(seriesChangeListener19);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-March-2024" + "'", str15, "31-March-2024");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        boolean boolean17 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        long long22 = timeSeries19.getMaximumItemAge();
        boolean boolean23 = timeSeries1.equals((java.lang.Object) timeSeries19);
        java.lang.String str24 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries1.createCopy((int) (byte) 0, 0);
        timeSeries1.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = timeSeries1.getValue(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(timeSeries27);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        long long3 = day0.getMiddleMillisecond();
        int int4 = day0.getYear();
        boolean boolean6 = day0.equals((java.lang.Object) 5);
        int int7 = day0.getDayOfMonth();
        java.lang.String str8 = day0.toString();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day0, "Value", "hi!");
        timeSeries11.setMaximumItemAge(10L);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day16 = new org.jfree.data.time.Day();
        timeSeries15.add((org.jfree.data.time.RegularTimePeriod) day16, (double) (short) 0, false);
        timeSeries15.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries15.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent24 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean25 = timeSeries15.equals((java.lang.Object) seriesChangeEvent24);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        int int28 = day26.compareTo((java.lang.Object) (short) 100);
        java.lang.String str29 = day26.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries15.getDataItem((org.jfree.data.time.RegularTimePeriod) day26);
        timeSeriesDataItem30.setSelected(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = timeSeriesDataItem30.getPeriod();
        boolean boolean34 = timeSeriesDataItem30.isSelected();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day37 = new org.jfree.data.time.Day();
        timeSeries36.add((org.jfree.data.time.RegularTimePeriod) day37, (double) (short) 0, false);
        java.util.Date date41 = day37.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond42 = new org.jfree.data.time.FixedMillisecond(date41);
        long long43 = fixedMillisecond42.getFirstMillisecond();
        java.util.Date date44 = fixedMillisecond42.getTime();
        org.jfree.data.time.FixedMillisecond fixedMillisecond45 = new org.jfree.data.time.FixedMillisecond(date44);
        int int46 = timeSeriesDataItem30.compareTo((java.lang.Object) fixedMillisecond45);
        org.jfree.data.time.Month month49 = new org.jfree.data.time.Month(10, 9);
        java.util.Date date50 = month49.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = month49.next();
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries11.createCopy((org.jfree.data.time.RegularTimePeriod) fixedMillisecond45, regularTimePeriod51);
        java.util.List list53 = timeSeries11.getItems();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1711911599999L + "'", long3 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2024 + "'", int4 == 2024);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31-March-2024" + "'", str8, "31-March-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "31-March-2024" + "'", str29, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem30);
        org.junit.Assert.assertNotNull(regularTimePeriod33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1711868400000L + "'", long43 == 1711868400000L);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertNotNull(regularTimePeriod51);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(list53);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        int int15 = day13.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = day13.next();
        timeSeries1.add(regularTimePeriod16, (java.lang.Number) 1);
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number22 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month21, number22);
        long long24 = month21.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) month21);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries27.addChangeListener(seriesChangeListener28);
        timeSeries27.clear();
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day31, (java.lang.Number) (byte) 10);
        timeSeries27.add((org.jfree.data.time.RegularTimePeriod) day31, (java.lang.Number) 12, true);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        timeSeries38.add((org.jfree.data.time.RegularTimePeriod) day39, (double) (short) 0, false);
        java.util.Date date43 = day39.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond44 = new org.jfree.data.time.FixedMillisecond(date43);
        java.util.Date date45 = fixedMillisecond44.getTime();
        java.util.Calendar calendar46 = null;
        long long47 = fixedMillisecond44.getLastMillisecond(calendar46);
        long long48 = fixedMillisecond44.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = fixedMillisecond44.next();
        java.util.Calendar calendar50 = null;
        long long51 = fixedMillisecond44.getMiddleMillisecond(calendar50);
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        double double54 = timeSeries53.getMinY();
        timeSeries53.setDescription("March 2024");
        timeSeries53.removeAgedItems(0L, true);
        double double60 = timeSeries53.getMaxY();
        int int61 = fixedMillisecond44.compareTo((java.lang.Object) timeSeries53);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = timeSeries27.getDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond44);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem62, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 31-March-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 118L + "'", long24 == 118L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem25);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1711868400000L + "'", long47 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1711868400000L + "'", long48 == 1711868400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1711868400000L + "'", long51 == 1711868400000L);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(timeSeriesDataItem62);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries1.removeChangeListener(seriesChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.event.SeriesChangeEvent seriesChangeEvent18 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) seriesChangeListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null source");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        java.lang.String str8 = day2.toString();
        java.lang.String str9 = day2.toString();
        java.lang.String str10 = day2.toString();
        org.jfree.data.time.SerialDate serialDate11 = day2.getSerialDate();
        int int12 = day2.getMonth();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31-March-2024" + "'", str8, "31-March-2024");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-March-2024" + "'", str9, "31-March-2024");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "31-March-2024" + "'", str10, "31-March-2024");
        org.junit.Assert.assertNotNull(serialDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        java.util.Calendar calendar20 = null;
        // The following exception was thrown during execution in test generation
        try {
            month4.peg(calendar20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        boolean boolean17 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        long long22 = timeSeries19.getMaximumItemAge();
        boolean boolean23 = timeSeries1.equals((java.lang.Object) timeSeries19);
        long long24 = timeSeries19.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double27 = timeSeries26.getMaxY();
        java.util.List list28 = timeSeries26.data;
        timeSeries26.removeAgedItems((long) 12, false);
        java.lang.Comparable comparable32 = timeSeries26.getKey();
        timeSeries26.removeAgedItems(true);
        java.util.Collection collection35 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day38 = new org.jfree.data.time.Day();
        timeSeries37.add((org.jfree.data.time.RegularTimePeriod) day38, (double) (short) 0, false);
        java.util.Date date42 = day38.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond43 = new org.jfree.data.time.FixedMillisecond(date42);
        timeSeries19.setKey((java.lang.Comparable) fixedMillisecond43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number46 = timeSeries19.getValue(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + 100L + "'", comparable32, 100L);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sun Mar 31 00:00:00 PDT 2024");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year((int) (short) 100);
        int int2 = year1.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        org.jfree.data.time.SerialDate serialDate15 = day10.getSerialDate();
        java.lang.Number number16 = null;
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day10, number16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day();
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) day20, (double) (short) 0, false);
        java.util.Date date24 = day20.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond25 = new org.jfree.data.time.FixedMillisecond(date24);
        long long26 = fixedMillisecond25.getFirstMillisecond();
        java.util.Date date27 = fixedMillisecond25.getTime();
        int int28 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) fixedMillisecond25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries30.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries30.addChangeListener(seriesChangeListener38);
        timeSeries30.setDomainDescription("hi!");
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        int int44 = day42.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = day42.next();
        timeSeries30.add(regularTimePeriod45, (java.lang.Number) 1);
        java.lang.Number number48 = null;
        timeSeries1.add(regularTimePeriod45, number48);
        org.jfree.data.time.Month month50 = new org.jfree.data.time.Month();
        long long51 = month50.getFirstMillisecond();
        long long52 = month50.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem54 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month50, 0.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod55 = month50.next();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem56 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) month50);
        java.lang.String str57 = month50.toString();
        long long58 = month50.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod59 = month50.previous();
        boolean boolean61 = month50.equals((java.lang.Object) 10);
        long long62 = month50.getFirstMillisecond();
        java.util.Calendar calendar63 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long64 = month50.getFirstMillisecond(calendar63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1711868400000L + "'", long26 == 1711868400000L);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod45);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1709280000000L + "'", long51 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 24291L + "'", long52 == 24291L);
        org.junit.Assert.assertNotNull(regularTimePeriod55);
        org.junit.Assert.assertNotNull(timeSeriesDataItem56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "March 2024" + "'", str57, "March 2024");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1711954799999L + "'", long58 == 1711954799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1709280000000L + "'", long62 == 1709280000000L);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        int int12 = day6.getYear();
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2024 + "'", int12 == 2024);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Calendar calendar8 = null;
        long long9 = fixedMillisecond7.getMiddleMillisecond(calendar8);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond7, (double) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        java.lang.Comparable comparable13 = timeSeries12.getKey();
        boolean boolean14 = timeSeries12.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        timeSeries16.add((org.jfree.data.time.RegularTimePeriod) day17, (double) (short) 0, false);
        java.util.Date date21 = day17.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond22 = new org.jfree.data.time.FixedMillisecond(date21);
        java.util.Date date23 = fixedMillisecond22.getTime();
        java.util.Calendar calendar24 = null;
        long long25 = fixedMillisecond22.getLastMillisecond(calendar24);
        long long26 = fixedMillisecond22.getMiddleMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond22, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update((org.jfree.data.time.RegularTimePeriod) fixedMillisecond22, (java.lang.Number) (-61189056000000L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: There is no existing value for the specified 'period'.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711868400000L + "'", long9 == 1711868400000L);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (byte) 0 + "'", comparable13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1711868400000L + "'", long25 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1711868400000L + "'", long26 == 1711868400000L);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        boolean boolean17 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        long long22 = timeSeries19.getMaximumItemAge();
        boolean boolean23 = timeSeries1.equals((java.lang.Object) timeSeries19);
        java.lang.String str24 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries1.createCopy((int) (byte) 0, 0);
        org.jfree.data.time.Month month28 = new org.jfree.data.time.Month();
        long long29 = month28.getFirstMillisecond();
        org.jfree.data.time.Year year30 = month28.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = year30.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = year30.previous();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) year30);
        long long34 = year30.getFirstMillisecond();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries27.add((org.jfree.data.time.RegularTimePeriod) year30, (double) 10, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1709280000000L + "'", long29 == 1709280000000L);
        org.junit.Assert.assertNotNull(year30);
        org.junit.Assert.assertNotNull(regularTimePeriod31);
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1704096000000L + "'", long34 == 1704096000000L);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        org.jfree.data.time.SerialDate serialDate15 = day10.getSerialDate();
        java.lang.Number number16 = null;
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day10, number16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day();
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) day20, (double) (short) 0, false);
        java.util.Date date24 = day20.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond25 = new org.jfree.data.time.FixedMillisecond(date24);
        long long26 = fixedMillisecond25.getFirstMillisecond();
        java.util.Date date27 = fixedMillisecond25.getTime();
        int int28 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) fixedMillisecond25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries30.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries30.addChangeListener(seriesChangeListener38);
        timeSeries30.setDomainDescription("hi!");
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        int int44 = day42.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = day42.next();
        timeSeries30.add(regularTimePeriod45, (java.lang.Number) 1);
        java.lang.Number number48 = null;
        timeSeries1.add(regularTimePeriod45, number48);
        org.jfree.data.time.Month month50 = new org.jfree.data.time.Month();
        long long51 = month50.getFirstMillisecond();
        long long52 = month50.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem54 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month50, 0.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod55 = month50.next();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem56 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) month50);
        java.lang.String str57 = month50.toString();
        long long58 = month50.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod59 = month50.previous();
        boolean boolean61 = month50.equals((java.lang.Object) 10);
        long long62 = month50.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = month50.next();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1711868400000L + "'", long26 == 1711868400000L);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod45);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1709280000000L + "'", long51 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 24291L + "'", long52 == 24291L);
        org.junit.Assert.assertNotNull(regularTimePeriod55);
        org.junit.Assert.assertNotNull(timeSeriesDataItem56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "March 2024" + "'", str57, "March 2024");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1711954799999L + "'", long58 == 1711954799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1709280000000L + "'", long62 == 1709280000000L);
        org.junit.Assert.assertNotNull(regularTimePeriod63);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("March 2024");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        java.util.Date date25 = day21.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond26 = new org.jfree.data.time.FixedMillisecond(date25);
        java.util.Calendar calendar27 = null;
        long long28 = fixedMillisecond26.getMiddleMillisecond(calendar27);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond26, (double) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        java.lang.Comparable comparable32 = timeSeries31.getKey();
        boolean boolean33 = timeSeries31.isEmpty();
        boolean boolean34 = timeSeries1.equals((java.lang.Object) boolean33);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1711868400000L + "'", long28 == 1711868400000L);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (byte) 0 + "'", comparable32, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day22 = new org.jfree.data.time.Day();
        timeSeries21.add((org.jfree.data.time.RegularTimePeriod) day22, (double) (short) 0, false);
        timeSeries21.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = timeSeries21.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent30 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean31 = timeSeries21.equals((java.lang.Object) seriesChangeEvent30);
        org.jfree.data.time.Day day32 = new org.jfree.data.time.Day();
        int int34 = day32.compareTo((java.lang.Object) (short) 100);
        java.lang.String str35 = day32.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries21.getDataItem((org.jfree.data.time.RegularTimePeriod) day32);
        timeSeriesDataItem36.setSelected(false);
        timeSeriesDataItem36.setValue((java.lang.Number) (byte) 100);
        boolean boolean41 = timeSeriesDataItem36.isSelected();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries1.addOrUpdate(timeSeriesDataItem36);
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day46 = new org.jfree.data.time.Day();
        timeSeries45.add((org.jfree.data.time.RegularTimePeriod) day46, (double) (short) 0, false);
        java.util.Date date50 = day46.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond51 = new org.jfree.data.time.FixedMillisecond(date50);
        java.util.TimeZone timeZone52 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod53 = org.jfree.data.time.RegularTimePeriod.createInstance(class43, date50, timeZone52);
        org.jfree.data.time.FixedMillisecond fixedMillisecond54 = new org.jfree.data.time.FixedMillisecond(date50);
        timeSeries1.setKey((java.lang.Comparable) fixedMillisecond54);
        boolean boolean56 = timeSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711911599999L + "'", long18 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "31-March-2024" + "'", str35, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(timeSeriesDataItem42);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        java.util.List list6 = timeSeries1.getItems();
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number10 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month9, number10);
        long long12 = month9.getSerialIndex();
        java.util.Date date13 = month9.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = month9.previous();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries1.getValue(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 118L + "'", long12 == 118L);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Tue Oct 01 00:00:00 PST 9");
        org.junit.Assert.assertNotNull(regularTimePeriod14);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Calendar calendar8 = null;
        long long9 = fixedMillisecond7.getMiddleMillisecond(calendar8);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond7, (double) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        java.lang.Comparable comparable13 = timeSeries12.getKey();
        java.lang.Comparable comparable14 = timeSeries12.getKey();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711868400000L + "'", long9 == 1711868400000L);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (byte) 0 + "'", comparable13, (byte) 0);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 0 + "'", comparable14, (byte) 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        int int12 = timeSeries1.getItemCount();
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day16 = new org.jfree.data.time.Day();
        timeSeries15.add((org.jfree.data.time.RegularTimePeriod) day16, (double) (short) 0, false);
        timeSeries15.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries15.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent24 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean25 = timeSeries15.equals((java.lang.Object) seriesChangeEvent24);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double28 = timeSeries27.getMaxY();
        java.lang.Comparable comparable29 = timeSeries27.getKey();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries15.addAndOrUpdate(timeSeries27);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries15.addChangeListener(seriesChangeListener31);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries1.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double36 = timeSeries35.getMaxY();
        org.jfree.data.time.Day day37 = new org.jfree.data.time.Day();
        java.lang.Number number38 = null;
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) day37, number38, false);
        timeSeries35.removeAgedItems(1L, false);
        boolean boolean44 = timeSeries35.getNotify();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener47 = null;
        timeSeries46.removeChangeListener(seriesChangeListener47);
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day51 = new org.jfree.data.time.Day();
        timeSeries50.add((org.jfree.data.time.RegularTimePeriod) day51, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem56 = timeSeries46.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day51, (java.lang.Number) 10L);
        long long57 = day51.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem58 = timeSeries35.getDataItem((org.jfree.data.time.RegularTimePeriod) day51);
        org.jfree.data.time.Month month59 = new org.jfree.data.time.Month();
        long long60 = month59.getFirstMillisecond();
        org.jfree.data.time.Year year61 = month59.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod62 = year61.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = year61.previous();
        long long64 = year61.getSerialIndex();
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) day51, (org.jfree.data.time.RegularTimePeriod) year61);
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day68 = new org.jfree.data.time.Day();
        timeSeries67.add((org.jfree.data.time.RegularTimePeriod) day68, (double) (short) 0, false);
        java.util.Date date72 = day68.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond73 = new org.jfree.data.time.FixedMillisecond(date72);
        java.util.Date date74 = fixedMillisecond73.getTime();
        java.util.Calendar calendar75 = null;
        long long76 = fixedMillisecond73.getLastMillisecond(calendar75);
        long long77 = fixedMillisecond73.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod78 = fixedMillisecond73.next();
        java.util.Calendar calendar79 = null;
        long long80 = fixedMillisecond73.getMiddleMillisecond(calendar79);
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) fixedMillisecond73);
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + 100L + "'", comparable29, 100L);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(timeSeriesDataItem56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 45382L + "'", long57 == 45382L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem58);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1709280000000L + "'", long60 == 1709280000000L);
        org.junit.Assert.assertNotNull(year61);
        org.junit.Assert.assertNotNull(regularTimePeriod62);
        org.junit.Assert.assertNotNull(regularTimePeriod63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 2024L + "'", long64 == 2024L);
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1711868400000L + "'", long76 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 1711868400000L + "'", long77 == 1711868400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod78);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1711868400000L + "'", long80 == 1711868400000L);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9999);
        timeSeries1.removeAgedItems(true);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        org.jfree.data.time.SerialDate serialDate13 = day8.getSerialDate();
        long long14 = day8.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = day8.previous();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries17.addChangeListener(seriesChangeListener18);
        long long20 = timeSeries17.getMaximumItemAge();
        java.lang.String str21 = timeSeries17.getDescription();
        double double22 = timeSeries17.getMaxY();
        java.lang.Object obj23 = timeSeries17.clone();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        timeSeries25.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = timeSeries25.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries25.addChangeListener(seriesChangeListener33);
        timeSeries25.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        timeSeries38.add((org.jfree.data.time.RegularTimePeriod) day39, (double) (short) 0, false);
        java.util.Date date43 = day39.getStart();
        java.lang.Number number44 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries25.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day39, number44);
        java.util.Date date46 = day39.getEnd();
        boolean boolean47 = timeSeries17.equals((java.lang.Object) day39);
        boolean boolean48 = day8.equals((java.lang.Object) timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries1.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod50, (java.lang.Number) (-62167363200000L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1711911599999L + "'", long14 == 1711911599999L);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem45);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Sun Mar 31 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(timeSeries49);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.util.List list3 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) 12, false);
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        double double8 = timeSeries1.getMaxY();
        java.util.Collection collection9 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 100L + "'", comparable7, 100L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        java.util.Date date19 = day15.getStart();
        java.lang.Number number20 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, number20);
        boolean boolean22 = timeSeries1.isEmpty();
        java.lang.Object obj23 = timeSeries1.clone();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        java.util.Calendar calendar9 = null;
        long long10 = fixedMillisecond7.getLastMillisecond(calendar9);
        java.util.Calendar calendar11 = null;
        long long12 = fixedMillisecond7.getLastMillisecond(calendar11);
        long long13 = fixedMillisecond7.getMiddleMillisecond();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711868400000L + "'", long12 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
    }
}
