package org.jfree.data.time;

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
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.time.FixedMillisecond fixedMillisecond2 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = fixedMillisecond2.next();
        timeSeries1.setKey((java.lang.Comparable) fixedMillisecond2);
        org.jfree.data.time.Month month5 = new org.jfree.data.time.Month();
        long long6 = month5.getLastMillisecond();
        org.jfree.data.time.Month month7 = new org.jfree.data.time.Month();
        int int8 = month5.compareTo((java.lang.Object) month7);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) month5, (java.lang.Number) 1735718399999L, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries1.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod14, (double) 1712041200000L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 2);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        timeSeries17.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.addChangeListener(seriesChangeListener26);
        long long28 = timeSeries25.getMaximumItemAge();
        java.lang.String str29 = timeSeries25.getDescription();
        double double30 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day33 = new org.jfree.data.time.Day();
        timeSeries32.add((org.jfree.data.time.RegularTimePeriod) day33, (double) (short) 0, false);
        timeSeries32.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = timeSeries32.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent41 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean42 = timeSeries32.equals((java.lang.Object) seriesChangeEvent41);
        org.jfree.data.time.Day day43 = new org.jfree.data.time.Day();
        int int45 = day43.compareTo((java.lang.Object) (short) 100);
        java.lang.String str46 = day43.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries32.getDataItem((org.jfree.data.time.RegularTimePeriod) day43);
        timeSeries25.add(timeSeriesDataItem47);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries17.addAndOrUpdate(timeSeries25);
        java.lang.String str50 = timeSeries17.getDescription();
        boolean boolean51 = timeSeries1.equals((java.lang.Object) timeSeries17);
        java.lang.Comparable comparable52 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setKey(comparable52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 9223372036854775807L + "'", long28 == 9223372036854775807L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(regularTimePeriod39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1-April-2024" + "'", str46, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem47);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        java.lang.String str8 = day2.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day2, (double) 1711995703697L);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1-April-2024" + "'", str8, "1-April-2024");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        timeSeries1.setDescription("hi!");
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.Day day11 = new org.jfree.data.time.Day();
        int int13 = day11.compareTo((java.lang.Object) (short) 100);
        java.util.Date date14 = day11.getEnd();
        long long15 = day11.getLastMillisecond();
        int int16 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day11);
        java.lang.Object obj17 = timeSeries1.clone();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Apr 01 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1712041199999L + "'", long15 == 1712041199999L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = day12.previous();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day12);
        org.jfree.data.time.SerialDate serialDate19 = day12.getSerialDate();
        long long20 = day12.getSerialIndex();
        int int21 = day12.getDayOfMonth();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = day12.next();
        org.jfree.data.time.Month month23 = new org.jfree.data.time.Month();
        long long24 = month23.getFirstMillisecond();
        long long25 = month23.getLastMillisecond();
        int int26 = month23.getYearValue();
        int int27 = day12.compareTo((java.lang.Object) int26);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1-April-2024" + "'", str15, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(serialDate19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 45383L + "'", long20 == 45383L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1711954800000L + "'", long24 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1714546799999L + "'", long25 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2024 + "'", int26 == 2024);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = fixedMillisecond0.next();
        java.lang.Object obj2 = null;
        boolean boolean3 = fixedMillisecond0.equals(obj2);
        java.util.Date date4 = fixedMillisecond0.getTime();
        java.util.Date date5 = fixedMillisecond0.getStart();
        long long6 = fixedMillisecond0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = fixedMillisecond0.previous();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries9.addChangeListener(seriesChangeListener10);
        long long12 = timeSeries9.getMaximumItemAge();
        java.lang.String str13 = timeSeries9.getDescription();
        double double14 = timeSeries9.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        timeSeries16.add((org.jfree.data.time.RegularTimePeriod) day17, (double) (short) 0, false);
        timeSeries16.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = timeSeries16.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent25 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean26 = timeSeries16.equals((java.lang.Object) seriesChangeEvent25);
        org.jfree.data.time.Day day27 = new org.jfree.data.time.Day();
        int int29 = day27.compareTo((java.lang.Object) (short) 100);
        java.lang.String str30 = day27.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries16.getDataItem((org.jfree.data.time.RegularTimePeriod) day27);
        timeSeries9.add(timeSeriesDataItem31);
        timeSeries9.setDescription("");
        timeSeries9.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        timeSeries38.add((org.jfree.data.time.RegularTimePeriod) day39, (double) (short) 0, false);
        timeSeries38.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = timeSeries38.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent47 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean48 = timeSeries38.equals((java.lang.Object) seriesChangeEvent47);
        org.jfree.data.time.Day day49 = new org.jfree.data.time.Day();
        int int51 = day49.compareTo((java.lang.Object) (short) 100);
        java.lang.String str52 = day49.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = timeSeries38.getDataItem((org.jfree.data.time.RegularTimePeriod) day49);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem54 = timeSeries9.addOrUpdate(timeSeriesDataItem53);
        boolean boolean55 = fixedMillisecond0.equals((java.lang.Object) timeSeriesDataItem53);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Apr 01 11:24:44 PDT 2024");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 01 11:24:44 PDT 2024");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1711995884796L + "'", long6 == 1711995884796L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(regularTimePeriod23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1-April-2024" + "'", str30, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem31);
        org.junit.Assert.assertNotNull(regularTimePeriod45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1-April-2024" + "'", str52, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem53);
        org.junit.Assert.assertNotNull(timeSeriesDataItem54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries9.addChangeListener(seriesChangeListener10);
        long long12 = timeSeries9.getMaximumItemAge();
        java.lang.String str13 = timeSeries9.getDescription();
        double double14 = timeSeries9.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        timeSeries16.add((org.jfree.data.time.RegularTimePeriod) day17, (double) (short) 0, false);
        timeSeries16.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = timeSeries16.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent25 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean26 = timeSeries16.equals((java.lang.Object) seriesChangeEvent25);
        org.jfree.data.time.Day day27 = new org.jfree.data.time.Day();
        int int29 = day27.compareTo((java.lang.Object) (short) 100);
        java.lang.String str30 = day27.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries16.getDataItem((org.jfree.data.time.RegularTimePeriod) day27);
        timeSeries9.add(timeSeriesDataItem31);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries1.addAndOrUpdate(timeSeries9);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo34 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent35 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries9, seriesChangeInfo34);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day38 = new org.jfree.data.time.Day();
        timeSeries37.add((org.jfree.data.time.RegularTimePeriod) day38, (double) (short) 0, false);
        int int42 = day38.getDayOfMonth();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries9.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day38);
        java.util.Calendar calendar44 = null;
        // The following exception was thrown during execution in test generation
        try {
            day38.peg(calendar44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(regularTimePeriod23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1-April-2024" + "'", str30, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem31);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(timeSeriesDataItem43);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge(1711995810082L);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        timeSeries2.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries10.addChangeListener(seriesChangeListener11);
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.String str14 = timeSeries10.getDescription();
        double double15 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        timeSeries17.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries17.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean27 = timeSeries17.equals((java.lang.Object) seriesChangeEvent26);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        int int30 = day28.compareTo((java.lang.Object) (short) 100);
        java.lang.String str31 = day28.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries17.getDataItem((org.jfree.data.time.RegularTimePeriod) day28);
        timeSeries10.add(timeSeriesDataItem32);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries2.addAndOrUpdate(timeSeries10);
        timeSeries34.fireSeriesChanged();
        boolean boolean36 = fixedMillisecond0.equals((java.lang.Object) timeSeries34);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = fixedMillisecond0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = fixedMillisecond0.previous();
        java.util.Date date39 = fixedMillisecond0.getEnd();
        org.jfree.data.time.FixedMillisecond fixedMillisecond40 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day43 = new org.jfree.data.time.Day();
        timeSeries42.add((org.jfree.data.time.RegularTimePeriod) day43, (double) (short) 0, false);
        timeSeries42.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries50.addChangeListener(seriesChangeListener51);
        long long53 = timeSeries50.getMaximumItemAge();
        java.lang.String str54 = timeSeries50.getDescription();
        double double55 = timeSeries50.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day58 = new org.jfree.data.time.Day();
        timeSeries57.add((org.jfree.data.time.RegularTimePeriod) day58, (double) (short) 0, false);
        timeSeries57.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod64 = timeSeries57.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent66 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean67 = timeSeries57.equals((java.lang.Object) seriesChangeEvent66);
        org.jfree.data.time.Day day68 = new org.jfree.data.time.Day();
        int int70 = day68.compareTo((java.lang.Object) (short) 100);
        java.lang.String str71 = day68.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem72 = timeSeries57.getDataItem((org.jfree.data.time.RegularTimePeriod) day68);
        timeSeries50.add(timeSeriesDataItem72);
        org.jfree.data.time.TimeSeries timeSeries74 = timeSeries42.addAndOrUpdate(timeSeries50);
        timeSeries74.fireSeriesChanged();
        boolean boolean76 = fixedMillisecond40.equals((java.lang.Object) timeSeries74);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod77 = fixedMillisecond40.previous();
        java.util.Calendar calendar78 = null;
        long long79 = fixedMillisecond40.getFirstMillisecond(calendar78);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod80 = fixedMillisecond40.next();
        int int81 = fixedMillisecond0.compareTo((java.lang.Object) regularTimePeriod80);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1-April-2024" + "'", str31, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem32);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertNotNull(regularTimePeriod38);
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Mon Apr 01 11:24:45 PDT 2024");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 9223372036854775807L + "'", long53 == 9223372036854775807L);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(regularTimePeriod64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "1-April-2024" + "'", str71, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem72);
        org.junit.Assert.assertNotNull(timeSeries74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod77);
// flaky:         org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1711995885143L + "'", long79 == 1711995885143L);
        org.junit.Assert.assertNotNull(regularTimePeriod80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        timeSeries1.setDomainDescription("hi!");
        long long7 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        timeSeries9.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries17.addChangeListener(seriesChangeListener18);
        long long20 = timeSeries17.getMaximumItemAge();
        java.lang.String str21 = timeSeries17.getDescription();
        double double22 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        timeSeries24.add((org.jfree.data.time.RegularTimePeriod) day25, (double) (short) 0, false);
        timeSeries24.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = timeSeries24.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent33 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean34 = timeSeries24.equals((java.lang.Object) seriesChangeEvent33);
        org.jfree.data.time.Day day35 = new org.jfree.data.time.Day();
        int int37 = day35.compareTo((java.lang.Object) (short) 100);
        java.lang.String str38 = day35.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = timeSeries24.getDataItem((org.jfree.data.time.RegularTimePeriod) day35);
        timeSeries17.add(timeSeriesDataItem39);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries9.addAndOrUpdate(timeSeries17);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo42 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent43 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries17, seriesChangeInfo42);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day46 = new org.jfree.data.time.Day();
        timeSeries45.add((org.jfree.data.time.RegularTimePeriod) day46, (double) (short) 0, false);
        int int50 = day46.getDayOfMonth();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem51 = timeSeries17.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day46);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem52 = timeSeries1.addOrUpdate(timeSeriesDataItem51);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(regularTimePeriod31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1-April-2024" + "'", str38, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem39);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(timeSeriesDataItem51);
        org.junit.Assert.assertNull(timeSeriesDataItem52);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries6.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month();
        long long10 = month9.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries12.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        timeSeries16.add((org.jfree.data.time.RegularTimePeriod) day17, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries12.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day17, (java.lang.Number) 10L);
        long long23 = day17.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries6.createCopy((org.jfree.data.time.RegularTimePeriod) month9, (org.jfree.data.time.RegularTimePeriod) day17);
        timeSeries6.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries6.removeChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries1.addAndOrUpdate(timeSeries6);
        boolean boolean30 = timeSeries1.getNotify();
        timeSeries1.removeAgedItems(1711995858741L, true);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711954800000L + "'", long10 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711997999999L + "'", long23 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        long long29 = timeSeries26.getMaximumItemAge();
        java.lang.String str30 = timeSeries26.getDescription();
        timeSeries26.fireSeriesChanged();
        timeSeries26.removeAgedItems(false);
        java.lang.String str34 = timeSeries26.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries1.addAndOrUpdate(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries37.addChangeListener(seriesChangeListener38);
        org.jfree.data.time.Month month40 = new org.jfree.data.time.Month();
        long long41 = month40.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries43.removeChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day48 = new org.jfree.data.time.Day();
        timeSeries47.add((org.jfree.data.time.RegularTimePeriod) day48, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = timeSeries43.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day48, (java.lang.Number) 10L);
        long long54 = day48.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries37.createCopy((org.jfree.data.time.RegularTimePeriod) month40, (org.jfree.data.time.RegularTimePeriod) day48);
        long long56 = month40.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = month40.next();
        org.jfree.data.time.Year year58 = month40.getYear();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) month40, (java.lang.Number) 10, true);
        boolean boolean63 = month40.equals((java.lang.Object) ' ');
        java.util.Calendar calendar64 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long65 = month40.getLastMillisecond(calendar64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1-April-2024" + "'", str22, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1711954800000L + "'", long41 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1711997999999L + "'", long54 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 24292L + "'", long56 == 24292L);
        org.junit.Assert.assertNotNull(regularTimePeriod57);
        org.junit.Assert.assertNotNull(year58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        timeSeries1.setKey((java.lang.Comparable) "hi!");
        boolean boolean18 = timeSeries1.getNotify();
        java.util.List list19 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day22 = new org.jfree.data.time.Day();
        timeSeries21.add((org.jfree.data.time.RegularTimePeriod) day22, (double) (short) 0, false);
        timeSeries21.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = timeSeries21.getNextTimePeriod();
        org.jfree.data.time.Month month29 = new org.jfree.data.time.Month();
        long long30 = month29.getLastMillisecond();
        org.jfree.data.time.Month month31 = new org.jfree.data.time.Month();
        int int32 = month29.compareTo((java.lang.Object) month31);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list35 = timeSeries34.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries34.addChangeListener(seriesChangeListener36);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries39.addChangeListener(seriesChangeListener40);
        org.jfree.data.time.Month month42 = new org.jfree.data.time.Month();
        long long43 = month42.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries45.removeChangeListener(seriesChangeListener46);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day50 = new org.jfree.data.time.Day();
        timeSeries49.add((org.jfree.data.time.RegularTimePeriod) day50, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem55 = timeSeries45.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day50, (java.lang.Number) 10L);
        long long56 = day50.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries39.createCopy((org.jfree.data.time.RegularTimePeriod) month42, (org.jfree.data.time.RegularTimePeriod) day50);
        timeSeries39.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries39.removeChangeListener(seriesChangeListener60);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries34.addAndOrUpdate(timeSeries39);
        int int63 = month29.compareTo((java.lang.Object) timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener66 = null;
        timeSeries65.removeChangeListener(seriesChangeListener66);
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day70 = new org.jfree.data.time.Day();
        timeSeries69.add((org.jfree.data.time.RegularTimePeriod) day70, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem75 = timeSeries65.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day70, (java.lang.Number) 10L);
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries21.createCopy((org.jfree.data.time.RegularTimePeriod) month29, (org.jfree.data.time.RegularTimePeriod) day70);
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day79 = new org.jfree.data.time.Day();
        timeSeries78.add((org.jfree.data.time.RegularTimePeriod) day79, (double) (short) 0, false);
        java.util.Date date83 = day79.getStart();
        org.jfree.data.time.SerialDate serialDate84 = day79.getSerialDate();
        org.jfree.data.time.SerialDate serialDate85 = day79.getSerialDate();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem86 = timeSeries21.getDataItem((org.jfree.data.time.RegularTimePeriod) day79);
        org.jfree.data.time.Year year88 = new org.jfree.data.time.Year(9999);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem89 = timeSeries21.getDataItem((org.jfree.data.time.RegularTimePeriod) year88);
        java.lang.Object obj90 = timeSeriesDataItem89.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem89);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 1-April-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1714546799999L + "'", long30 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1711954800000L + "'", long43 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1711997999999L + "'", long56 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertNotNull(timeSeries62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem75);
        org.junit.Assert.assertNotNull(timeSeries76);
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate84);
        org.junit.Assert.assertNotNull(serialDate85);
        org.junit.Assert.assertNotNull(timeSeriesDataItem86);
        org.junit.Assert.assertNotNull(timeSeriesDataItem89);
        org.junit.Assert.assertNotNull(obj90);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemCount(2024);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day7 = new org.jfree.data.time.Day();
        timeSeries6.add((org.jfree.data.time.RegularTimePeriod) day7, (double) (short) 0, false);
        java.util.Date date11 = day7.getStart();
        boolean boolean12 = timeSeries1.equals((java.lang.Object) date11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        timeSeries14.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries14.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent23 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean24 = timeSeries14.equals((java.lang.Object) seriesChangeEvent23);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        int int27 = day25.compareTo((java.lang.Object) (short) 100);
        java.lang.String str28 = day25.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries14.getDataItem((org.jfree.data.time.RegularTimePeriod) day25);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = day25.previous();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries32.addChangeListener(seriesChangeListener33);
        long long35 = timeSeries32.getMaximumItemAge();
        java.lang.String str36 = timeSeries32.getDescription();
        timeSeries32.fireSeriesChanged();
        boolean boolean38 = day25.equals((java.lang.Object) timeSeries32);
        org.jfree.data.time.FixedMillisecond fixedMillisecond39 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = fixedMillisecond39.next();
        java.util.Calendar calendar41 = null;
        long long42 = fixedMillisecond39.getMiddleMillisecond(calendar41);
        timeSeries32.delete((org.jfree.data.time.RegularTimePeriod) fixedMillisecond39);
        java.lang.Number number44 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) fixedMillisecond39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1-April-2024" + "'", str28, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem29);
        org.junit.Assert.assertNotNull(regularTimePeriod30);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9223372036854775807L + "'", long35 == 9223372036854775807L);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod40);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1711995886223L + "'", long42 == 1711995886223L);
        org.junit.Assert.assertNull(number44);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        java.lang.String str7 = timeSeries1.getDescription();
        org.jfree.data.time.Month month8 = new org.jfree.data.time.Month();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) month8, (java.lang.Number) 1711995827464L);
        java.util.Date date11 = month8.getEnd();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(timeSeriesDataItem10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 23:59:59 PDT 2024");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.Year year19 = new org.jfree.data.time.Year(2);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day22 = new org.jfree.data.time.Day();
        timeSeries21.add((org.jfree.data.time.RegularTimePeriod) day22, (double) (short) 0, false);
        java.util.Date date26 = day22.getStart();
        org.jfree.data.time.SerialDate serialDate27 = day22.getSerialDate();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo29 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent30 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) true, seriesChangeInfo29);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo31 = seriesChangeEvent30.getSummary();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo32 = null;
        seriesChangeEvent30.setSummary(seriesChangeInfo32);
        int int34 = day22.compareTo((java.lang.Object) seriesChangeEvent30);
        int int35 = year19.compareTo((java.lang.Object) seriesChangeEvent30);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries37.addChangeListener(seriesChangeListener38);
        org.jfree.data.time.Month month40 = new org.jfree.data.time.Month();
        long long41 = month40.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries43.removeChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day48 = new org.jfree.data.time.Day();
        timeSeries47.add((org.jfree.data.time.RegularTimePeriod) day48, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = timeSeries43.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day48, (java.lang.Number) 10L);
        long long54 = day48.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries37.createCopy((org.jfree.data.time.RegularTimePeriod) month40, (org.jfree.data.time.RegularTimePeriod) day48);
        long long56 = month40.getSerialIndex();
        boolean boolean57 = year19.equals((java.lang.Object) month40);
        timeSeries1.setKey((java.lang.Comparable) year19);
        timeSeries1.fireSeriesChanged();
        java.util.Collection collection60 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1-April-2024" + "'", str15, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate27);
        org.junit.Assert.assertNull(seriesChangeInfo31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1711954800000L + "'", long41 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1711997999999L + "'", long54 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 24292L + "'", long56 == 24292L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        timeSeries1.setMaximumItemAge(1711995698965L);
        int int4 = timeSeries1.getItemCount();
        timeSeries1.removeAgedItems(1711995714112L, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        timeSeries1.setDomainDescription("hi!");
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.util.List list6 = timeSeries1.data;
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(class5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        java.util.List list5 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list8 = timeSeries7.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries12.addChangeListener(seriesChangeListener13);
        org.jfree.data.time.Month month15 = new org.jfree.data.time.Month();
        long long16 = month15.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries18.removeChangeListener(seriesChangeListener19);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day23 = new org.jfree.data.time.Day();
        timeSeries22.add((org.jfree.data.time.RegularTimePeriod) day23, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries18.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day23, (java.lang.Number) 10L);
        long long29 = day23.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries12.createCopy((org.jfree.data.time.RegularTimePeriod) month15, (org.jfree.data.time.RegularTimePeriod) day23);
        timeSeries12.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries12.removeChangeListener(seriesChangeListener33);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries7.addAndOrUpdate(timeSeries12);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries1.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries36.removePropertyChangeListener(propertyChangeListener37);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN, "", "Value");
        org.jfree.data.time.FixedMillisecond fixedMillisecond43 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = fixedMillisecond43.next();
        java.util.Date date45 = fixedMillisecond43.getTime();
        long long46 = fixedMillisecond43.getSerialIndex();
        java.util.Calendar calendar47 = null;
        long long48 = fixedMillisecond43.getMiddleMillisecond(calendar47);
        timeSeries42.add((org.jfree.data.time.RegularTimePeriod) fixedMillisecond43, (double) 1711995769608L);
        java.util.Date date51 = fixedMillisecond43.getEnd();
        int int52 = timeSeries36.getIndex((org.jfree.data.time.RegularTimePeriod) fixedMillisecond43);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1711954800000L + "'", long16 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1711997999999L + "'", long29 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(regularTimePeriod44);
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Mon Apr 01 11:24:46 PDT 2024");
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1711995886746L + "'", long46 == 1711995886746L);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1711995886746L + "'", long48 == 1711995886746L);
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Mon Apr 01 11:24:46 PDT 2024");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.time.Year year1 = month0.getYear();
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.Month month6 = new org.jfree.data.time.Month();
        long long7 = month6.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries9.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day14 = new org.jfree.data.time.Day();
        timeSeries13.add((org.jfree.data.time.RegularTimePeriod) day14, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries9.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day14, (java.lang.Number) 10L);
        long long20 = day14.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.createCopy((org.jfree.data.time.RegularTimePeriod) month6, (org.jfree.data.time.RegularTimePeriod) day14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = month6.next();
        int int23 = year1.compareTo((java.lang.Object) month6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = year1.next();
        int int25 = year1.getYear();
        int int26 = year1.getYear();
        long long27 = year1.getSerialIndex();
        org.junit.Assert.assertNotNull(year1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1711997999999L + "'", long20 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2024 + "'", int25 == 2024);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2024 + "'", int26 == 2024);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 2024L + "'", long27 == 2024L);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        timeSeries1.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        java.lang.Number number13 = null;
        timeSeries10.add((org.jfree.data.time.RegularTimePeriod) day12, number13, false);
        double double16 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        timeSeries18.add((org.jfree.data.time.RegularTimePeriod) day19, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries10.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day19, (java.lang.Number) 2);
        int int26 = timeSeriesDataItem24.compareTo((java.lang.Object) (short) 100);
        timeSeries1.add(timeSeriesDataItem24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        timeSeries29.add((org.jfree.data.time.RegularTimePeriod) day30, (double) (short) 0, false);
        timeSeries29.setMaximumItemAge((long) 1);
        int int36 = timeSeriesDataItem24.compareTo((java.lang.Object) timeSeries29);
        java.lang.Comparable comparable37 = timeSeries29.getKey();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent38 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries29);
        java.lang.Class class39 = timeSeries29.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries41.addChangeListener(seriesChangeListener42);
        org.jfree.data.time.Month month44 = new org.jfree.data.time.Month();
        long long45 = month44.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener48 = null;
        timeSeries47.removeChangeListener(seriesChangeListener48);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day52 = new org.jfree.data.time.Day();
        timeSeries51.add((org.jfree.data.time.RegularTimePeriod) day52, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem57 = timeSeries47.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day52, (java.lang.Number) 10L);
        long long58 = day52.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries41.createCopy((org.jfree.data.time.RegularTimePeriod) month44, (org.jfree.data.time.RegularTimePeriod) day52);
        long long60 = month44.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod61 = month44.next();
        org.jfree.data.time.Year year62 = month44.getYear();
        long long63 = year62.getFirstMillisecond();
        int int65 = year62.compareTo((java.lang.Object) Double.NaN);
        long long66 = year62.getLastMillisecond();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries29.add((org.jfree.data.time.RegularTimePeriod) year62, (java.lang.Number) 1711995812954L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(timeSeriesDataItem24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 100L + "'", comparable37, 100L);
        org.junit.Assert.assertNotNull(class39);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1711954800000L + "'", long45 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1711997999999L + "'", long58 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 24292L + "'", long60 == 24292L);
        org.junit.Assert.assertNotNull(regularTimePeriod61);
        org.junit.Assert.assertNotNull(year62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1704096000000L + "'", long63 == 1704096000000L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1735718399999L + "'", long66 == 1735718399999L);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        long long29 = timeSeries26.getMaximumItemAge();
        java.lang.String str30 = timeSeries26.getDescription();
        timeSeries26.fireSeriesChanged();
        timeSeries26.removeAgedItems(false);
        java.lang.String str34 = timeSeries26.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries1.addAndOrUpdate(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries37.addChangeListener(seriesChangeListener38);
        org.jfree.data.time.Month month40 = new org.jfree.data.time.Month();
        long long41 = month40.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries43.removeChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day48 = new org.jfree.data.time.Day();
        timeSeries47.add((org.jfree.data.time.RegularTimePeriod) day48, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = timeSeries43.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day48, (java.lang.Number) 10L);
        long long54 = day48.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries37.createCopy((org.jfree.data.time.RegularTimePeriod) month40, (org.jfree.data.time.RegularTimePeriod) day48);
        long long56 = month40.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = month40.next();
        org.jfree.data.time.Year year58 = month40.getYear();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) month40, (java.lang.Number) 10, true);
        timeSeries35.setRangeDescription("hi!");
        int int64 = timeSeries35.getMaximumItemCount();
        java.lang.Object obj65 = timeSeries35.clone();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1-April-2024" + "'", str22, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1711954800000L + "'", long41 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1711997999999L + "'", long54 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 24292L + "'", long56 == 24292L);
        org.junit.Assert.assertNotNull(regularTimePeriod57);
        org.junit.Assert.assertNotNull(year58);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertNotNull(obj65);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        timeSeries2.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries10.addChangeListener(seriesChangeListener11);
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.String str14 = timeSeries10.getDescription();
        double double15 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        timeSeries17.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries17.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean27 = timeSeries17.equals((java.lang.Object) seriesChangeEvent26);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        int int30 = day28.compareTo((java.lang.Object) (short) 100);
        java.lang.String str31 = day28.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries17.getDataItem((org.jfree.data.time.RegularTimePeriod) day28);
        timeSeries10.add(timeSeriesDataItem32);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries2.addAndOrUpdate(timeSeries10);
        timeSeries34.fireSeriesChanged();
        boolean boolean36 = fixedMillisecond0.equals((java.lang.Object) timeSeries34);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = fixedMillisecond0.previous();
        java.util.Calendar calendar38 = null;
        fixedMillisecond0.peg(calendar38);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = fixedMillisecond0.previous();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1-April-2024" + "'", str31, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem32);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertNotNull(regularTimePeriod40);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        long long27 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        boolean boolean30 = timeSeries1.getNotify();
        int int31 = timeSeries1.getItemCount();
        double double32 = timeSeries1.getMinY();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1-April-2024" + "'", str22, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean3 = timeSeries2.isEmpty();
        timeSeries2.setMaximumItemCount(2024);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        java.util.Date date12 = day8.getStart();
        boolean boolean13 = timeSeries2.equals((java.lang.Object) date12);
        org.jfree.data.time.Day day14 = new org.jfree.data.time.Day(date12);
        org.jfree.data.time.Month month15 = new org.jfree.data.time.Month(date12);
        org.jfree.data.time.Year year16 = new org.jfree.data.time.Year(date12);
        long long17 = year16.getLastMillisecond();
        org.jfree.data.time.Month month18 = new org.jfree.data.time.Month(9, year16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1735718399999L + "'", long17 == 1735718399999L);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.Month month18 = new org.jfree.data.time.Month();
        long long19 = month18.getLastMillisecond();
        org.jfree.data.time.Month month20 = new org.jfree.data.time.Month();
        int int21 = month18.compareTo((java.lang.Object) month20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list24 = timeSeries23.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries23.addChangeListener(seriesChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries28.addChangeListener(seriesChangeListener29);
        org.jfree.data.time.Month month31 = new org.jfree.data.time.Month();
        long long32 = month31.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries34.removeChangeListener(seriesChangeListener35);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        timeSeries38.add((org.jfree.data.time.RegularTimePeriod) day39, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = timeSeries34.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day39, (java.lang.Number) 10L);
        long long45 = day39.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries28.createCopy((org.jfree.data.time.RegularTimePeriod) month31, (org.jfree.data.time.RegularTimePeriod) day39);
        timeSeries28.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries28.removeChangeListener(seriesChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries23.addAndOrUpdate(timeSeries28);
        int int52 = month18.compareTo((java.lang.Object) timeSeries28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod53 = month18.next();
        org.jfree.data.time.FixedMillisecond fixedMillisecond55 = new org.jfree.data.time.FixedMillisecond((long) ' ');
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries1.createCopy(regularTimePeriod53, (org.jfree.data.time.RegularTimePeriod) fixedMillisecond55);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = fixedMillisecond55.next();
        java.util.Calendar calendar58 = null;
        long long59 = fixedMillisecond55.getMiddleMillisecond(calendar58);
        long long60 = fixedMillisecond55.getLastMillisecond();
        java.util.Date date61 = fixedMillisecond55.getTime();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod62 = fixedMillisecond55.next();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1-April-2024" + "'", str15, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1714546799999L + "'", long19 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1711954800000L + "'", long32 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1711997999999L + "'", long45 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod53);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(regularTimePeriod57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 32L + "'", long59 == 32L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 32L + "'", long60 == 32L);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Wed Dec 31 16:00:00 PST 1969");
        org.junit.Assert.assertNotNull(regularTimePeriod62);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException1 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException3 = new org.jfree.data.time.TimePeriodFormatException("");
        java.lang.Throwable[] throwableArray4 = timePeriodFormatException3.getSuppressed();
        timePeriodFormatException1.addSuppressed((java.lang.Throwable) timePeriodFormatException3);
        java.lang.Throwable[] throwableArray6 = timePeriodFormatException1.getSuppressed();
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException8 = new org.jfree.data.time.TimePeriodFormatException("");
        java.lang.Throwable[] throwableArray9 = timePeriodFormatException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = timePeriodFormatException8.getSuppressed();
        timePeriodFormatException1.addSuppressed((java.lang.Throwable) timePeriodFormatException8);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries6.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month();
        long long10 = month9.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries12.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        timeSeries16.add((org.jfree.data.time.RegularTimePeriod) day17, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries12.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day17, (java.lang.Number) 10L);
        long long23 = day17.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries6.createCopy((org.jfree.data.time.RegularTimePeriod) month9, (org.jfree.data.time.RegularTimePeriod) day17);
        timeSeries6.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries6.removeChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent30 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries29);
        org.jfree.data.time.FixedMillisecond fixedMillisecond31 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = fixedMillisecond31.next();
        java.lang.Object obj33 = null;
        boolean boolean34 = fixedMillisecond31.equals(obj33);
        java.util.Date date35 = fixedMillisecond31.getTime();
        java.util.Date date36 = fixedMillisecond31.getStart();
        timeSeries29.setKey((java.lang.Comparable) date36);
        org.jfree.data.time.Month month38 = new org.jfree.data.time.Month(date36);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711954800000L + "'", long10 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711997999999L + "'", long23 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Mon Apr 01 11:24:48 PDT 2024");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Mon Apr 01 11:24:48 PDT 2024");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month(3, (int) '4');
        java.lang.String str3 = month2.toString();
        java.util.Date date4 = month2.getEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "March 52" + "'", str3, "March 52");
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 31 23:59:59 PST 52");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = month4.next();
        org.jfree.data.time.Year year22 = month4.getYear();
        long long23 = month4.getSerialIndex();
        long long24 = month4.getLastMillisecond();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711997999999L + "'", long18 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 24292L + "'", long20 == 24292L);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
        org.junit.Assert.assertNotNull(year22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 24292L + "'", long23 == 24292L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1714546799999L + "'", long24 == 1714546799999L);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day5 = new org.jfree.data.time.Day();
        timeSeries4.add((org.jfree.data.time.RegularTimePeriod) day5, (double) (short) 0, false);
        java.util.Date date9 = day5.getStart();
        org.jfree.data.time.SerialDate serialDate10 = day5.getSerialDate();
        org.jfree.data.time.Day day11 = new org.jfree.data.time.Day();
        int int13 = day11.compareTo((java.lang.Object) (short) 100);
        java.util.Date date14 = day11.getEnd();
        long long15 = day11.getLastMillisecond();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) day5, (org.jfree.data.time.RegularTimePeriod) day11);
        java.util.List list17 = timeSeries1.getItems();
        boolean boolean18 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems(1711995749887L, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = timeSeries1.getTimePeriod(9999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9999, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Apr 01 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1712041199999L + "'", long15 == 1712041199999L);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = day10.previous();
        int int17 = day10.getMonth();
        long long18 = day10.getFirstMillisecond();
        long long19 = day10.getMiddleMillisecond();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711954800000L + "'", long18 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1711997999999L + "'", long19 == 1711997999999L);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jfree.data.time.Day day1 = org.jfree.data.time.Day.parseDay("November -1");
        org.junit.Assert.assertNull(day1);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        java.util.Date date13 = day9.getStart();
        org.jfree.data.time.SerialDate serialDate14 = day9.getSerialDate();
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day(serialDate14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = day15.next();
        boolean boolean17 = timeSeries1.equals((java.lang.Object) regularTimePeriod16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = regularTimePeriod16.next();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate14);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        timeSeries1.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries1.removeChangeListener(seriesChangeListener22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener24);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711997999999L + "'", long18 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        java.lang.String str7 = timeSeries1.getDescription();
        org.jfree.data.time.Month month8 = new org.jfree.data.time.Month();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) month8, (java.lang.Number) 1711995827464L);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        timeSeries12.add((org.jfree.data.time.RegularTimePeriod) day13, (double) (short) 0, false);
        java.util.Date date17 = day13.getStart();
        org.jfree.data.time.SerialDate serialDate18 = day13.getSerialDate();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo20 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent21 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) true, seriesChangeInfo20);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo22 = seriesChangeEvent21.getSummary();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo23 = null;
        seriesChangeEvent21.setSummary(seriesChangeInfo23);
        int int25 = day13.compareTo((java.lang.Object) seriesChangeEvent21);
        java.lang.String str26 = day13.toString();
        long long27 = day13.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = day13.previous();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries1.getRawDataItem(regularTimePeriod28);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(timeSeriesDataItem10);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate18);
        org.junit.Assert.assertNull(seriesChangeInfo22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1-April-2024" + "'", str26, "1-April-2024");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1711997999999L + "'", long27 == 1711997999999L);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
        org.junit.Assert.assertNotNull(timeSeriesDataItem29);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        long long3 = day0.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries5.addChangeListener(seriesChangeListener6);
        long long8 = timeSeries5.getMaximumItemAge();
        java.lang.String str9 = timeSeries5.getDescription();
        double double10 = timeSeries5.getMaxY();
        timeSeries5.setDescription("hi!");
        boolean boolean13 = day0.equals((java.lang.Object) timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries5.addChangeListener(seriesChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries5.createCopy(2147483647, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1711997999999L + "'", long3 == 1711997999999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day7 = new org.jfree.data.time.Day();
        timeSeries6.add((org.jfree.data.time.RegularTimePeriod) day7, (double) (short) 0, false);
        timeSeries6.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        java.util.Date date19 = day15.getStart();
        org.jfree.data.time.SerialDate serialDate20 = day15.getSerialDate();
        java.lang.Number number21 = null;
        timeSeries6.update((org.jfree.data.time.RegularTimePeriod) day15, number21);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries24.removeChangeListener(seriesChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day29 = new org.jfree.data.time.Day();
        timeSeries28.add((org.jfree.data.time.RegularTimePeriod) day29, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries24.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day29, (java.lang.Number) 10L);
        long long35 = day29.getMiddleMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries6.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day29, (java.lang.Number) (byte) 10);
        double double38 = timeSeries6.getMaxY();
        java.lang.Object obj39 = timeSeries6.clone();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        timeSeries41.add((org.jfree.data.time.RegularTimePeriod) day42, (double) (short) 0, false);
        timeSeries41.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day50 = new org.jfree.data.time.Day();
        timeSeries49.add((org.jfree.data.time.RegularTimePeriod) day50, (double) (short) 0, false);
        java.util.Date date54 = day50.getStart();
        int int55 = timeSeries41.getIndex((org.jfree.data.time.RegularTimePeriod) day50);
        java.util.Date date56 = day50.getEnd();
        int int57 = timeSeries6.getIndex((org.jfree.data.time.RegularTimePeriod) day50);
        long long58 = day50.getSerialIndex();
        java.lang.String str59 = day50.toString();
        org.jfree.data.time.Month month60 = new org.jfree.data.time.Month();
        org.jfree.data.time.Year year61 = month60.getYear();
        long long62 = month60.getFirstMillisecond();
        long long63 = month60.getSerialIndex();
        int int64 = month60.getYearValue();
        org.jfree.data.time.Year year65 = month60.getYear();
        long long66 = year65.getSerialIndex();
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) day50, (org.jfree.data.time.RegularTimePeriod) year65);
        boolean boolean69 = day50.equals((java.lang.Object) false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod70 = day50.next();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo71 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent72 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) regularTimePeriod70, seriesChangeInfo71);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate20);
        org.junit.Assert.assertNull(timeSeriesDataItem34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1711997999999L + "'", long35 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Mon Apr 01 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 45383L + "'", long58 == 45383L);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1-April-2024" + "'", str59, "1-April-2024");
        org.junit.Assert.assertNotNull(year61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1711954800000L + "'", long62 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 24292L + "'", long63 == 24292L);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2024 + "'", int64 == 2024);
        org.junit.Assert.assertNotNull(year65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 2024L + "'", long66 == 2024L);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod70);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        timeSeriesDataItem16.setValue((java.lang.Number) 1711995745559L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1-April-2024" + "'", str15, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        long long27 = timeSeries1.getMaximumItemAge();
        java.lang.Object obj28 = timeSeries1.clone();
        timeSeries1.setDomainDescription("");
        int int31 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj32 = null;
        boolean boolean33 = timeSeries1.equals(obj32);
        java.util.List list34 = timeSeries1.getItems();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1-April-2024" + "'", str22, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemCount(2024);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day7 = new org.jfree.data.time.Day();
        timeSeries6.add((org.jfree.data.time.RegularTimePeriod) day7, (double) (short) 0, false);
        java.util.Date date11 = day7.getStart();
        boolean boolean12 = timeSeries1.equals((java.lang.Object) date11);
        org.jfree.data.time.FixedMillisecond fixedMillisecond13 = new org.jfree.data.time.FixedMillisecond(date11);
        java.util.TimeZone timeZone14 = null;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month16 = new org.jfree.data.time.Month(date11, timeZone14, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        timeSeries2.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries10.addChangeListener(seriesChangeListener11);
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.String str14 = timeSeries10.getDescription();
        double double15 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        timeSeries17.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries17.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean27 = timeSeries17.equals((java.lang.Object) seriesChangeEvent26);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        int int30 = day28.compareTo((java.lang.Object) (short) 100);
        java.lang.String str31 = day28.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries17.getDataItem((org.jfree.data.time.RegularTimePeriod) day28);
        timeSeries10.add(timeSeriesDataItem32);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries2.addAndOrUpdate(timeSeries10);
        timeSeries34.fireSeriesChanged();
        boolean boolean36 = fixedMillisecond0.equals((java.lang.Object) timeSeries34);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = fixedMillisecond0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = fixedMillisecond0.previous();
        java.util.Date date39 = fixedMillisecond0.getEnd();
        org.jfree.data.time.FixedMillisecond fixedMillisecond40 = new org.jfree.data.time.FixedMillisecond(date39);
        org.jfree.data.time.Month month41 = new org.jfree.data.time.Month(date39);
        int int42 = month41.getYearValue();
        java.lang.Object obj43 = null;
        int int44 = month41.compareTo(obj43);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1-April-2024" + "'", str31, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem32);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertNotNull(regularTimePeriod38);
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Mon Apr 01 11:24:50 PDT 2024");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2024 + "'", int42 == 2024);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        timeSeries1.setNotify(false);
        org.jfree.data.time.Month month18 = new org.jfree.data.time.Month();
        long long19 = month18.getLastMillisecond();
        org.jfree.data.time.Month month20 = new org.jfree.data.time.Month();
        int int21 = month18.compareTo((java.lang.Object) month20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list24 = timeSeries23.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries23.addChangeListener(seriesChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries28.addChangeListener(seriesChangeListener29);
        org.jfree.data.time.Month month31 = new org.jfree.data.time.Month();
        long long32 = month31.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries34.removeChangeListener(seriesChangeListener35);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        timeSeries38.add((org.jfree.data.time.RegularTimePeriod) day39, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = timeSeries34.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day39, (java.lang.Number) 10L);
        long long45 = day39.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries28.createCopy((org.jfree.data.time.RegularTimePeriod) month31, (org.jfree.data.time.RegularTimePeriod) day39);
        timeSeries28.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries28.removeChangeListener(seriesChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries23.addAndOrUpdate(timeSeries28);
        int int52 = month18.compareTo((java.lang.Object) timeSeries28);
        java.lang.Number number53 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) month18);
        timeSeries1.fireSeriesChanged();
        java.lang.String str55 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1714546799999L + "'", long19 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1711954800000L + "'", long32 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1711997999999L + "'", long45 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertEquals("'" + number53 + "' != '" + 0.0d + "'", number53, 0.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Time" + "'", str55, "Time");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.time.Year year1 = month0.getYear();
        long long2 = month0.getFirstMillisecond();
        java.util.Date date3 = month0.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond4 = new org.jfree.data.time.FixedMillisecond(date3);
        org.jfree.data.time.Year year5 = new org.jfree.data.time.Year(date3);
        long long6 = year5.getSerialIndex();
        org.junit.Assert.assertNotNull(year1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1711954800000L + "'", long2 == 1711954800000L);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2024L + "'", long6 == 2024L);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        org.jfree.data.time.Year year19 = new org.jfree.data.time.Year(2);
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) year19);
        int int21 = year19.getYear();
        long long22 = year19.getFirstMillisecond();
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException24 = new org.jfree.data.time.TimePeriodFormatException("");
        java.lang.Throwable[] throwableArray25 = timePeriodFormatException24.getSuppressed();
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException27 = new org.jfree.data.time.TimePeriodFormatException("31-March-2024");
        timePeriodFormatException24.addSuppressed((java.lang.Throwable) timePeriodFormatException27);
        boolean boolean29 = year19.equals((java.lang.Object) timePeriodFormatException24);
        long long30 = year19.getLastMillisecond();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-62104204800000L) + "'", long22 == (-62104204800000L));
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-62072668800001L) + "'", long30 == (-62072668800001L));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getLastMillisecond();
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month();
        int int3 = month0.compareTo((java.lang.Object) month2);
        int int4 = month0.getYearValue();
        long long5 = month0.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = month0.previous();
        int int7 = month0.getMonth();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month0, (double) 1711995683606L);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        timeSeries11.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = timeSeries11.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent20 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) seriesChangeEvent20);
        org.jfree.data.time.Day day22 = new org.jfree.data.time.Day();
        int int24 = day22.compareTo((java.lang.Object) (short) 100);
        java.lang.String str25 = day22.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries11.getDataItem((org.jfree.data.time.RegularTimePeriod) day22);
        boolean boolean27 = timeSeriesDataItem9.equals((java.lang.Object) timeSeriesDataItem26);
        timeSeriesDataItem9.setSelected(false);
        timeSeriesDataItem9.setSelected(false);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1714546799999L + "'", long1 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2024 + "'", int4 == 2024);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1-April-2024" + "'", str25, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        long long29 = timeSeries26.getMaximumItemAge();
        java.lang.String str30 = timeSeries26.getDescription();
        timeSeries26.fireSeriesChanged();
        timeSeries26.removeAgedItems(false);
        java.lang.String str34 = timeSeries26.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries1.addAndOrUpdate(timeSeries26);
        timeSeries35.setDescription("September 100");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries35.add(regularTimePeriod38, (double) 1711995827955L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1-April-2024" + "'", str22, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertNotNull(timeSeries35);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.time.FixedMillisecond fixedMillisecond2 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = fixedMillisecond2.next();
        timeSeries1.setKey((java.lang.Comparable) fixedMillisecond2);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        timeSeries9.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries17.addChangeListener(seriesChangeListener18);
        long long20 = timeSeries17.getMaximumItemAge();
        java.lang.String str21 = timeSeries17.getDescription();
        double double22 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        timeSeries24.add((org.jfree.data.time.RegularTimePeriod) day25, (double) (short) 0, false);
        timeSeries24.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = timeSeries24.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent33 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean34 = timeSeries24.equals((java.lang.Object) seriesChangeEvent33);
        org.jfree.data.time.Day day35 = new org.jfree.data.time.Day();
        int int37 = day35.compareTo((java.lang.Object) (short) 100);
        java.lang.String str38 = day35.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = timeSeries24.getDataItem((org.jfree.data.time.RegularTimePeriod) day35);
        timeSeries17.add(timeSeriesDataItem39);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries9.addAndOrUpdate(timeSeries17);
        timeSeries41.fireSeriesChanged();
        boolean boolean43 = fixedMillisecond7.equals((java.lang.Object) timeSeries41);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = fixedMillisecond7.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = fixedMillisecond7.previous();
        long long46 = fixedMillisecond7.getFirstMillisecond();
        long long47 = fixedMillisecond7.getMiddleMillisecond();
        long long48 = fixedMillisecond7.getLastMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) fixedMillisecond7, (java.lang.Number) 1711995698965L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(regularTimePeriod31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1-April-2024" + "'", str38, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem39);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod44);
        org.junit.Assert.assertNotNull(regularTimePeriod45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1711995891670L + "'", long46 == 1711995891670L);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1711995891670L + "'", long47 == 1711995891670L);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1711995891670L + "'", long48 == 1711995891670L);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = day16.previous();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day16);
        org.jfree.data.time.SerialDate serialDate23 = day16.getSerialDate();
        long long24 = day16.getSerialIndex();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day27 = new org.jfree.data.time.Day();
        timeSeries26.add((org.jfree.data.time.RegularTimePeriod) day27, (double) (short) 0, false);
        java.util.Date date31 = day27.getStart();
        org.jfree.data.time.SerialDate serialDate32 = day27.getSerialDate();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo34 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent35 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) true, seriesChangeInfo34);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo36 = seriesChangeEvent35.getSummary();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo37 = null;
        seriesChangeEvent35.setSummary(seriesChangeInfo37);
        int int39 = day27.compareTo((java.lang.Object) seriesChangeEvent35);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) day16, (org.jfree.data.time.RegularTimePeriod) day27);
        org.jfree.data.time.SerialDate serialDate41 = day27.getSerialDate();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day44 = new org.jfree.data.time.Day();
        timeSeries43.add((org.jfree.data.time.RegularTimePeriod) day44, (double) (short) 0, false);
        timeSeries43.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = timeSeries43.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent52 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean53 = timeSeries43.equals((java.lang.Object) seriesChangeEvent52);
        org.jfree.data.time.Day day54 = new org.jfree.data.time.Day();
        int int56 = day54.compareTo((java.lang.Object) (short) 100);
        java.lang.String str57 = day54.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem58 = timeSeries43.getDataItem((org.jfree.data.time.RegularTimePeriod) day54);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod59 = day54.previous();
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries61.addChangeListener(seriesChangeListener62);
        long long64 = timeSeries61.getMaximumItemAge();
        java.lang.String str65 = timeSeries61.getDescription();
        timeSeries61.fireSeriesChanged();
        boolean boolean67 = day54.equals((java.lang.Object) timeSeries61);
        org.jfree.data.time.FixedMillisecond fixedMillisecond68 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod69 = fixedMillisecond68.next();
        java.util.Calendar calendar70 = null;
        long long71 = fixedMillisecond68.getMiddleMillisecond(calendar70);
        timeSeries61.delete((org.jfree.data.time.RegularTimePeriod) fixedMillisecond68);
        org.jfree.data.time.FixedMillisecond fixedMillisecond74 = new org.jfree.data.time.FixedMillisecond(1711997999999L);
        long long75 = fixedMillisecond74.getLastMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem77 = timeSeries61.addOrUpdate((org.jfree.data.time.RegularTimePeriod) fixedMillisecond74, 0.0d);
        java.util.Calendar calendar78 = null;
        fixedMillisecond74.peg(calendar78);
        boolean boolean80 = day27.equals((java.lang.Object) fixedMillisecond74);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1-April-2024" + "'", str19, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem20);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
        org.junit.Assert.assertNotNull(serialDate23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 45383L + "'", long24 == 45383L);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate32);
        org.junit.Assert.assertNull(seriesChangeInfo36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(serialDate41);
        org.junit.Assert.assertNotNull(regularTimePeriod50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1-April-2024" + "'", str57, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem58);
        org.junit.Assert.assertNotNull(regularTimePeriod59);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 9223372036854775807L + "'", long64 == 9223372036854775807L);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod69);
// flaky:         org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1711995891927L + "'", long71 == 1711995891927L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1711997999999L + "'", long75 == 1711997999999L);
        org.junit.Assert.assertNull(timeSeriesDataItem77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month();
        long long10 = month9.getLastMillisecond();
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month();
        int int12 = month9.compareTo((java.lang.Object) month11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list15 = timeSeries14.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.Month month22 = new org.jfree.data.time.Month();
        long long23 = month22.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.removeChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        timeSeries29.add((org.jfree.data.time.RegularTimePeriod) day30, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries25.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day30, (java.lang.Number) 10L);
        long long36 = day30.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries19.createCopy((org.jfree.data.time.RegularTimePeriod) month22, (org.jfree.data.time.RegularTimePeriod) day30);
        timeSeries19.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries19.removeChangeListener(seriesChangeListener40);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries14.addAndOrUpdate(timeSeries19);
        int int43 = month9.compareTo((java.lang.Object) timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries45.removeChangeListener(seriesChangeListener46);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day50 = new org.jfree.data.time.Day();
        timeSeries49.add((org.jfree.data.time.RegularTimePeriod) day50, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem55 = timeSeries45.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day50, (java.lang.Number) 10L);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month9, (org.jfree.data.time.RegularTimePeriod) day50);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day59 = new org.jfree.data.time.Day();
        timeSeries58.add((org.jfree.data.time.RegularTimePeriod) day59, (double) (short) 0, false);
        java.util.Date date63 = day59.getStart();
        org.jfree.data.time.SerialDate serialDate64 = day59.getSerialDate();
        org.jfree.data.time.SerialDate serialDate65 = day59.getSerialDate();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem66 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day59);
        org.jfree.data.time.Year year68 = new org.jfree.data.time.Year(9999);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem69 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) year68);
        java.util.Collection collection70 = timeSeries1.getTimePeriods();
        org.jfree.data.time.Day day71 = new org.jfree.data.time.Day();
        long long72 = day71.getSerialIndex();
        long long73 = day71.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod74 = day71.previous();
        java.lang.String str75 = day71.toString();
        timeSeries1.setKey((java.lang.Comparable) day71);
        java.lang.String str77 = day71.toString();
        long long78 = day71.getLastMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1714546799999L + "'", long10 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711954800000L + "'", long23 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1711997999999L + "'", long36 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem55);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate64);
        org.junit.Assert.assertNotNull(serialDate65);
        org.junit.Assert.assertNotNull(timeSeriesDataItem66);
        org.junit.Assert.assertNotNull(timeSeriesDataItem69);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 45383L + "'", long72 == 45383L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1712041199999L + "'", long73 == 1712041199999L);
        org.junit.Assert.assertNotNull(regularTimePeriod74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "1-April-2024" + "'", str75, "1-April-2024");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "1-April-2024" + "'", str77, "1-April-2024");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1712041199999L + "'", long78 == 1712041199999L);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries5.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.Month month8 = new org.jfree.data.time.Month();
        long long9 = month8.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries11.removeChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day16 = new org.jfree.data.time.Day();
        timeSeries15.add((org.jfree.data.time.RegularTimePeriod) day16, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries11.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day16, (java.lang.Number) 10L);
        long long22 = day16.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries5.createCopy((org.jfree.data.time.RegularTimePeriod) month8, (org.jfree.data.time.RegularTimePeriod) day16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = month8.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = month8.next();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month8);
        java.lang.Object obj27 = timeSeries1.clone();
        timeSeries1.setDomainDescription("31-March-2024");
        timeSeries1.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener32);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711954800000L + "'", long9 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1711997999999L + "'", long22 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertNotNull(regularTimePeriod25);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.time.Year year1 = month0.getYear();
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.Month month6 = new org.jfree.data.time.Month();
        long long7 = month6.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries9.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day14 = new org.jfree.data.time.Day();
        timeSeries13.add((org.jfree.data.time.RegularTimePeriod) day14, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries9.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day14, (java.lang.Number) 10L);
        long long20 = day14.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.createCopy((org.jfree.data.time.RegularTimePeriod) month6, (org.jfree.data.time.RegularTimePeriod) day14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = month6.next();
        int int23 = year1.compareTo((java.lang.Object) month6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = year1.previous();
        int int25 = year1.getYear();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) int25);
        org.junit.Assert.assertNotNull(year1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1711997999999L + "'", long20 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2024 + "'", int25 == 2024);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = month4.next();
        org.jfree.data.time.Year year22 = month4.getYear();
        long long23 = year22.getFirstMillisecond();
        long long24 = year22.getFirstMillisecond();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711997999999L + "'", long18 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 24292L + "'", long20 == 24292L);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
        org.junit.Assert.assertNotNull(year22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1704096000000L + "'", long23 == 1704096000000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1704096000000L + "'", long24 == 1704096000000L);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond(1711997999999L);
        java.util.Calendar calendar2 = null;
        fixedMillisecond1.peg(calendar2);
        java.util.Calendar calendar4 = null;
        long long5 = fixedMillisecond1.getLastMillisecond(calendar4);
        long long6 = fixedMillisecond1.getFirstMillisecond();
        long long7 = fixedMillisecond1.getSerialIndex();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711997999999L + "'", long5 == 1711997999999L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1711997999999L + "'", long6 == 1711997999999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711997999999L + "'", long7 == 1711997999999L);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        timeSeries1.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries10.addChangeListener(seriesChangeListener11);
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.String str14 = timeSeries10.getDescription();
        double double15 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        timeSeries17.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries17.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean27 = timeSeries17.equals((java.lang.Object) seriesChangeEvent26);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        int int30 = day28.compareTo((java.lang.Object) (short) 100);
        java.lang.String str31 = day28.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries17.getDataItem((org.jfree.data.time.RegularTimePeriod) day28);
        timeSeries10.add(timeSeriesDataItem32);
        java.lang.Number number34 = timeSeriesDataItem32.getValue();
        timeSeriesDataItem32.setValue((java.lang.Number) (byte) 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries1.addOrUpdate(timeSeriesDataItem32);
        int int38 = timeSeries1.getItemCount();
        boolean boolean39 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        timeSeries41.add((org.jfree.data.time.RegularTimePeriod) day42, (double) (short) 0, false);
        timeSeries41.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries49.addChangeListener(seriesChangeListener50);
        long long52 = timeSeries49.getMaximumItemAge();
        java.lang.String str53 = timeSeries49.getDescription();
        double double54 = timeSeries49.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day57 = new org.jfree.data.time.Day();
        timeSeries56.add((org.jfree.data.time.RegularTimePeriod) day57, (double) (short) 0, false);
        timeSeries56.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = timeSeries56.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent65 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean66 = timeSeries56.equals((java.lang.Object) seriesChangeEvent65);
        org.jfree.data.time.Day day67 = new org.jfree.data.time.Day();
        int int69 = day67.compareTo((java.lang.Object) (short) 100);
        java.lang.String str70 = day67.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem71 = timeSeries56.getDataItem((org.jfree.data.time.RegularTimePeriod) day67);
        timeSeries49.add(timeSeriesDataItem71);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries41.addAndOrUpdate(timeSeries49);
        java.lang.Comparable comparable74 = timeSeries73.getKey();
        org.jfree.data.time.TimeSeries timeSeries75 = timeSeries1.addAndOrUpdate(timeSeries73);
        timeSeries73.clear();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1-April-2024" + "'", str31, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem32);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 0.0d + "'", number34, 0.0d);
        org.junit.Assert.assertNull(timeSeriesDataItem37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 9223372036854775807L + "'", long52 == 9223372036854775807L);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(regularTimePeriod63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "1-April-2024" + "'", str70, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem71);
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertEquals("'" + comparable74 + "' != '" + "Overwritten values from: 100" + "'", comparable74, "Overwritten values from: 100");
        org.junit.Assert.assertNotNull(timeSeries75);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year1 = org.jfree.data.time.Year.parseYear("Mon Apr 01 11:21:58 PDT 2024");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException; message: Cannot parse string.");
        } catch (org.jfree.data.time.TimePeriodFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        org.jfree.data.time.Year year19 = new org.jfree.data.time.Year(2);
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) year19);
        long long21 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.Day day22 = new org.jfree.data.time.Day();
        int int24 = day22.compareTo((java.lang.Object) (short) 100);
        java.lang.String str25 = day22.toString();
        int int26 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = timeSeries1.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1-April-2024" + "'", str25, "1-April-2024");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        long long29 = timeSeries26.getMaximumItemAge();
        java.lang.String str30 = timeSeries26.getDescription();
        timeSeries26.fireSeriesChanged();
        timeSeries26.removeAgedItems(false);
        java.lang.String str34 = timeSeries26.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries1.addAndOrUpdate(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries37.addChangeListener(seriesChangeListener38);
        org.jfree.data.time.Month month40 = new org.jfree.data.time.Month();
        long long41 = month40.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries43.removeChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day48 = new org.jfree.data.time.Day();
        timeSeries47.add((org.jfree.data.time.RegularTimePeriod) day48, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = timeSeries43.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day48, (java.lang.Number) 10L);
        long long54 = day48.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries37.createCopy((org.jfree.data.time.RegularTimePeriod) month40, (org.jfree.data.time.RegularTimePeriod) day48);
        long long56 = month40.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = month40.next();
        org.jfree.data.time.Year year58 = month40.getYear();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) month40, (java.lang.Number) 10, true);
        org.jfree.data.time.FixedMillisecond fixedMillisecond63 = new org.jfree.data.time.FixedMillisecond(1711997999999L);
        java.lang.String str64 = fixedMillisecond63.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem66 = timeSeries35.addOrUpdate((org.jfree.data.time.RegularTimePeriod) fixedMillisecond63, (double) 1711995761284L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Month.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1-April-2024" + "'", str22, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1711954800000L + "'", long41 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1711997999999L + "'", long54 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 24292L + "'", long56 == 24292L);
        org.junit.Assert.assertNotNull(regularTimePeriod57);
        org.junit.Assert.assertNotNull(year58);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Mon Apr 01 11:59:59 PDT 2024" + "'", str64, "Mon Apr 01 11:59:59 PDT 2024");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = day12.previous();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        long long22 = timeSeries19.getMaximumItemAge();
        java.lang.String str23 = timeSeries19.getDescription();
        timeSeries19.fireSeriesChanged();
        boolean boolean25 = day12.equals((java.lang.Object) timeSeries19);
        long long26 = day12.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = day12.previous();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 1711995686590L);
        java.lang.Object obj30 = timeSeriesDataItem29.clone();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1-April-2024" + "'", str15, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1711954800000L + "'", long26 == 1711954800000L);
        org.junit.Assert.assertNotNull(regularTimePeriod27);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = fixedMillisecond0.next();
        java.util.Date date2 = fixedMillisecond0.getTime();
        long long3 = fixedMillisecond0.getLastMillisecond();
        java.util.Date date4 = fixedMillisecond0.getTime();
        java.util.Calendar calendar5 = null;
        fixedMillisecond0.peg(calendar5);
        long long7 = fixedMillisecond0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = fixedMillisecond0.next();
        java.util.Date date9 = fixedMillisecond0.getTime();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Apr 01 11:24:53 PDT 2024");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1711995893809L + "'", long3 == 1711995893809L);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Apr 01 11:24:53 PDT 2024");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711995893809L + "'", long7 == 1711995893809L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 01 11:24:53 PDT 2024");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        timeSeries1.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        java.lang.Number number13 = null;
        timeSeries10.add((org.jfree.data.time.RegularTimePeriod) day12, number13, false);
        double double16 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        timeSeries18.add((org.jfree.data.time.RegularTimePeriod) day19, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries10.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day19, (java.lang.Number) 2);
        int int26 = timeSeriesDataItem24.compareTo((java.lang.Object) (short) 100);
        timeSeries1.add(timeSeriesDataItem24);
        java.lang.Object obj28 = timeSeriesDataItem24.clone();
        org.jfree.data.time.FixedMillisecond fixedMillisecond29 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day32 = new org.jfree.data.time.Day();
        timeSeries31.add((org.jfree.data.time.RegularTimePeriod) day32, (double) (short) 0, false);
        timeSeries31.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries39.addChangeListener(seriesChangeListener40);
        long long42 = timeSeries39.getMaximumItemAge();
        java.lang.String str43 = timeSeries39.getDescription();
        double double44 = timeSeries39.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day47 = new org.jfree.data.time.Day();
        timeSeries46.add((org.jfree.data.time.RegularTimePeriod) day47, (double) (short) 0, false);
        timeSeries46.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod53 = timeSeries46.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent55 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean56 = timeSeries46.equals((java.lang.Object) seriesChangeEvent55);
        org.jfree.data.time.Day day57 = new org.jfree.data.time.Day();
        int int59 = day57.compareTo((java.lang.Object) (short) 100);
        java.lang.String str60 = day57.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem61 = timeSeries46.getDataItem((org.jfree.data.time.RegularTimePeriod) day57);
        timeSeries39.add(timeSeriesDataItem61);
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries31.addAndOrUpdate(timeSeries39);
        timeSeries63.fireSeriesChanged();
        boolean boolean65 = fixedMillisecond29.equals((java.lang.Object) timeSeries63);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod66 = fixedMillisecond29.previous();
        long long67 = fixedMillisecond29.getLastMillisecond();
        java.util.Date date68 = fixedMillisecond29.getTime();
        int int69 = timeSeriesDataItem24.compareTo((java.lang.Object) fixedMillisecond29);
        long long70 = fixedMillisecond29.getMiddleMillisecond();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(timeSeriesDataItem24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 9223372036854775807L + "'", long42 == 9223372036854775807L);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(regularTimePeriod53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1-April-2024" + "'", str60, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem61);
        org.junit.Assert.assertNotNull(timeSeries63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod66);
// flaky:         org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1711995893845L + "'", long67 == 1711995893845L);
        org.junit.Assert.assertNotNull(date68);
// flaky:         org.junit.Assert.assertEquals(date68.toString(), "Mon Apr 01 11:24:53 PDT 2024");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1711995893845L + "'", long70 == 1711995893845L);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.Month month29 = new org.jfree.data.time.Month();
        long long30 = month29.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries32.removeChangeListener(seriesChangeListener33);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day37 = new org.jfree.data.time.Day();
        timeSeries36.add((org.jfree.data.time.RegularTimePeriod) day37, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries32.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day37, (java.lang.Number) 10L);
        long long43 = day37.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries26.createCopy((org.jfree.data.time.RegularTimePeriod) month29, (org.jfree.data.time.RegularTimePeriod) day37);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = month29.previous();
        java.lang.Number number46 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) month29);
        long long47 = month29.getLastMillisecond();
        org.jfree.data.time.Year year48 = month29.getYear();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1-April-2024" + "'", str22, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1711954800000L + "'", long30 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1711997999999L + "'", long43 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(regularTimePeriod45);
        org.junit.Assert.assertEquals("'" + number46 + "' != '" + 0.0d + "'", number46, 0.0d);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1714546799999L + "'", long47 == 1714546799999L);
        org.junit.Assert.assertNotNull(year48);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        int int7 = day3.getMonth();
        long long8 = day3.getSerialIndex();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 45383L + "'", long8 == 45383L);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        org.jfree.data.time.FixedMillisecond fixedMillisecond4 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = fixedMillisecond4.next();
        java.util.Date date6 = fixedMillisecond4.getTime();
        long long7 = fixedMillisecond4.getLastMillisecond();
        java.util.Date date8 = fixedMillisecond4.getTime();
        java.util.Date date9 = fixedMillisecond4.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond10 = new org.jfree.data.time.FixedMillisecond(date9);
        java.util.Calendar calendar11 = null;
        fixedMillisecond10.peg(calendar11);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((org.jfree.data.time.RegularTimePeriod) fixedMillisecond10, (java.lang.Number) (-62072668800001L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: There is no existing value for the specified 'period'.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 01 11:24:54 PDT 2024");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711995894276L + "'", long7 == 1711995894276L);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 01 11:24:54 PDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 01 11:24:54 PDT 2024");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.removeChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries17.addChangeListener(seriesChangeListener18);
        org.jfree.data.time.Month month20 = new org.jfree.data.time.Month();
        long long21 = month20.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries23.removeChangeListener(seriesChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        timeSeries27.add((org.jfree.data.time.RegularTimePeriod) day28, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries23.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day28, (java.lang.Number) 10L);
        long long34 = day28.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries17.createCopy((org.jfree.data.time.RegularTimePeriod) month20, (org.jfree.data.time.RegularTimePeriod) day28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = month20.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = month20.next();
        timeSeries13.delete((org.jfree.data.time.RegularTimePeriod) month20);
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) month20, (java.lang.Number) (short) 100);
        org.jfree.data.time.Day day41 = new org.jfree.data.time.Day();
        int int43 = day41.compareTo((java.lang.Object) (short) 100);
        java.util.Date date44 = day41.getEnd();
        org.jfree.data.time.Month month45 = new org.jfree.data.time.Month(date44);
        org.jfree.data.time.Day day46 = new org.jfree.data.time.Day(date44);
        boolean boolean47 = timeSeries1.equals((java.lang.Object) date44);
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1711954800000L + "'", long21 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1711997999999L + "'", long34 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(regularTimePeriod36);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Mon Apr 01 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.time.Year year1 = month0.getYear();
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.Month month6 = new org.jfree.data.time.Month();
        long long7 = month6.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries9.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day14 = new org.jfree.data.time.Day();
        timeSeries13.add((org.jfree.data.time.RegularTimePeriod) day14, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries9.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day14, (java.lang.Number) 10L);
        long long20 = day14.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.createCopy((org.jfree.data.time.RegularTimePeriod) month6, (org.jfree.data.time.RegularTimePeriod) day14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = month6.next();
        int int23 = year1.compareTo((java.lang.Object) month6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = year1.previous();
        int int25 = year1.getYear();
        int int26 = year1.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = year1.previous();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        timeSeries29.add((org.jfree.data.time.RegularTimePeriod) day30, (double) (short) 0, false);
        timeSeries29.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day38 = new org.jfree.data.time.Day();
        timeSeries37.add((org.jfree.data.time.RegularTimePeriod) day38, (double) (short) 0, false);
        java.util.Date date42 = day38.getStart();
        org.jfree.data.time.SerialDate serialDate43 = day38.getSerialDate();
        java.lang.Number number44 = null;
        timeSeries29.update((org.jfree.data.time.RegularTimePeriod) day38, number44);
        org.jfree.data.time.Year year47 = new org.jfree.data.time.Year(2);
        timeSeries29.delete((org.jfree.data.time.RegularTimePeriod) year47);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries29.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean51 = year1.equals((java.lang.Object) propertyChangeListener49);
        org.junit.Assert.assertNotNull(year1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1711997999999L + "'", long20 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2024 + "'", int25 == 2024);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2024 + "'", int26 == 2024);
        org.junit.Assert.assertNotNull(regularTimePeriod27);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate43);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        long long29 = timeSeries26.getMaximumItemAge();
        java.lang.String str30 = timeSeries26.getDescription();
        timeSeries26.fireSeriesChanged();
        timeSeries26.removeAgedItems(false);
        java.lang.String str34 = timeSeries26.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries1.addAndOrUpdate(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries37.addChangeListener(seriesChangeListener38);
        org.jfree.data.time.Month month40 = new org.jfree.data.time.Month();
        long long41 = month40.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries43.removeChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day48 = new org.jfree.data.time.Day();
        timeSeries47.add((org.jfree.data.time.RegularTimePeriod) day48, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = timeSeries43.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day48, (java.lang.Number) 10L);
        long long54 = day48.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries37.createCopy((org.jfree.data.time.RegularTimePeriod) month40, (org.jfree.data.time.RegularTimePeriod) day48);
        long long56 = month40.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = month40.next();
        org.jfree.data.time.Year year58 = month40.getYear();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) month40, (java.lang.Number) 10, true);
        timeSeries35.setRangeDescription("hi!");
        timeSeries35.setDescription("");
        int int66 = timeSeries35.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        timeSeries35.removePropertyChangeListener(propertyChangeListener67);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1-April-2024" + "'", str22, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1711954800000L + "'", long41 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1711997999999L + "'", long54 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 24292L + "'", long56 == 24292L);
        org.junit.Assert.assertNotNull(regularTimePeriod57);
        org.junit.Assert.assertNotNull(year58);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.removeChangeListener(seriesChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day24 = new org.jfree.data.time.Day();
        timeSeries23.add((org.jfree.data.time.RegularTimePeriod) day24, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries19.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day24, (java.lang.Number) 10L);
        long long30 = day24.getMiddleMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day24, (java.lang.Number) (byte) 10);
        java.util.Date date33 = day24.getEnd();
        java.util.TimeZone timeZone34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month35 = new org.jfree.data.time.Month(date33, timeZone34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertNull(timeSeriesDataItem29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1711997999999L + "'", long30 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem32);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Mon Apr 01 23:59:59 PDT 2024");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day2, 10.0d);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 01 00:00:00 PDT 2024");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.time.FixedMillisecond fixedMillisecond31 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = fixedMillisecond31.next();
        timeSeries30.setKey((java.lang.Comparable) fixedMillisecond31);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries35.addChangeListener(seriesChangeListener36);
        long long38 = timeSeries35.getMaximumItemAge();
        java.lang.String str39 = timeSeries35.getDescription();
        double double40 = timeSeries35.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day43 = new org.jfree.data.time.Day();
        timeSeries42.add((org.jfree.data.time.RegularTimePeriod) day43, (double) (short) 0, false);
        timeSeries42.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = timeSeries42.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent51 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean52 = timeSeries42.equals((java.lang.Object) seriesChangeEvent51);
        org.jfree.data.time.Day day53 = new org.jfree.data.time.Day();
        int int55 = day53.compareTo((java.lang.Object) (short) 100);
        java.lang.String str56 = day53.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem57 = timeSeries42.getDataItem((org.jfree.data.time.RegularTimePeriod) day53);
        timeSeries35.add(timeSeriesDataItem57);
        timeSeries30.add(timeSeriesDataItem57);
        boolean boolean60 = timeSeries1.equals((java.lang.Object) timeSeries30);
        timeSeries1.setDomainDescription("1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1-April-2024" + "'", str22, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 9223372036854775807L + "'", long38 == 9223372036854775807L);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(regularTimePeriod49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1-April-2024" + "'", str56, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        long long29 = timeSeries26.getMaximumItemAge();
        java.lang.String str30 = timeSeries26.getDescription();
        timeSeries26.fireSeriesChanged();
        timeSeries26.removeAgedItems(false);
        java.lang.String str34 = timeSeries26.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries1.addAndOrUpdate(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries37.addChangeListener(seriesChangeListener38);
        org.jfree.data.time.Month month40 = new org.jfree.data.time.Month();
        long long41 = month40.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries43.removeChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day48 = new org.jfree.data.time.Day();
        timeSeries47.add((org.jfree.data.time.RegularTimePeriod) day48, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = timeSeries43.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day48, (java.lang.Number) 10L);
        long long54 = day48.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries37.createCopy((org.jfree.data.time.RegularTimePeriod) month40, (org.jfree.data.time.RegularTimePeriod) day48);
        long long56 = month40.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = month40.next();
        org.jfree.data.time.Year year58 = month40.getYear();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) month40, (java.lang.Number) 10, true);
        java.lang.Object obj62 = timeSeries35.clone();
        org.jfree.data.time.Month month63 = new org.jfree.data.time.Month();
        long long64 = month63.getFirstMillisecond();
        long long65 = month63.getSerialIndex();
        java.lang.Object obj66 = null;
        boolean boolean67 = month63.equals(obj66);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod68 = month63.next();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem69 = timeSeries35.getDataItem((org.jfree.data.time.RegularTimePeriod) month63);
        int int70 = month63.getYearValue();
        org.jfree.data.time.FixedMillisecond fixedMillisecond72 = new org.jfree.data.time.FixedMillisecond(1713250799999L);
        boolean boolean73 = month63.equals((java.lang.Object) fixedMillisecond72);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1-April-2024" + "'", str22, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1711954800000L + "'", long41 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1711997999999L + "'", long54 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 24292L + "'", long56 == 24292L);
        org.junit.Assert.assertNotNull(regularTimePeriod57);
        org.junit.Assert.assertNotNull(year58);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1711954800000L + "'", long64 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 24292L + "'", long65 == 24292L);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod68);
        org.junit.Assert.assertNotNull(timeSeriesDataItem69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2024 + "'", int70 == 2024);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        long long29 = timeSeries26.getMaximumItemAge();
        java.lang.String str30 = timeSeries26.getDescription();
        timeSeries26.fireSeriesChanged();
        timeSeries26.removeAgedItems(false);
        java.lang.String str34 = timeSeries26.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries1.addAndOrUpdate(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries37.addChangeListener(seriesChangeListener38);
        org.jfree.data.time.Month month40 = new org.jfree.data.time.Month();
        long long41 = month40.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries43.removeChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day48 = new org.jfree.data.time.Day();
        timeSeries47.add((org.jfree.data.time.RegularTimePeriod) day48, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = timeSeries43.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day48, (java.lang.Number) 10L);
        long long54 = day48.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries37.createCopy((org.jfree.data.time.RegularTimePeriod) month40, (org.jfree.data.time.RegularTimePeriod) day48);
        long long56 = month40.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = month40.next();
        org.jfree.data.time.Year year58 = month40.getYear();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) month40, (java.lang.Number) 10, true);
        boolean boolean63 = month40.equals((java.lang.Object) ' ');
        org.jfree.data.time.Year year64 = month40.getYear();
        org.jfree.data.time.Month month65 = new org.jfree.data.time.Month();
        org.jfree.data.time.Year year66 = month65.getYear();
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener69 = null;
        timeSeries68.addChangeListener(seriesChangeListener69);
        org.jfree.data.time.Month month71 = new org.jfree.data.time.Month();
        long long72 = month71.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries74 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener75 = null;
        timeSeries74.removeChangeListener(seriesChangeListener75);
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day79 = new org.jfree.data.time.Day();
        timeSeries78.add((org.jfree.data.time.RegularTimePeriod) day79, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem84 = timeSeries74.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day79, (java.lang.Number) 10L);
        long long85 = day79.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries86 = timeSeries68.createCopy((org.jfree.data.time.RegularTimePeriod) month71, (org.jfree.data.time.RegularTimePeriod) day79);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod87 = month71.next();
        int int88 = year66.compareTo((java.lang.Object) month71);
        org.jfree.data.time.Year year89 = month71.getYear();
        long long90 = month71.getLastMillisecond();
        int int91 = year64.compareTo((java.lang.Object) long90);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod92 = year64.previous();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1-April-2024" + "'", str22, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1711954800000L + "'", long41 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1711997999999L + "'", long54 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 24292L + "'", long56 == 24292L);
        org.junit.Assert.assertNotNull(regularTimePeriod57);
        org.junit.Assert.assertNotNull(year58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(year64);
        org.junit.Assert.assertNotNull(year66);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1711954800000L + "'", long72 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem84);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 1711997999999L + "'", long85 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries86);
        org.junit.Assert.assertNotNull(regularTimePeriod87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(year89);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1714546799999L + "'", long90 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod92);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jfree.data.time.Day day1 = org.jfree.data.time.Day.parseDay("Mon Apr 01 11:21:58 PDT 2024");
        org.junit.Assert.assertNull(day1);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        timeSeries1.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries10.addChangeListener(seriesChangeListener11);
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.String str14 = timeSeries10.getDescription();
        double double15 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        timeSeries17.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries17.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean27 = timeSeries17.equals((java.lang.Object) seriesChangeEvent26);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        int int30 = day28.compareTo((java.lang.Object) (short) 100);
        java.lang.String str31 = day28.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries17.getDataItem((org.jfree.data.time.RegularTimePeriod) day28);
        timeSeries10.add(timeSeriesDataItem32);
        java.lang.Number number34 = timeSeriesDataItem32.getValue();
        timeSeriesDataItem32.setValue((java.lang.Number) (byte) 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries1.addOrUpdate(timeSeriesDataItem32);
        int int38 = timeSeries1.getItemCount();
        boolean boolean39 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        timeSeries41.add((org.jfree.data.time.RegularTimePeriod) day42, (double) (short) 0, false);
        timeSeries41.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries49.addChangeListener(seriesChangeListener50);
        long long52 = timeSeries49.getMaximumItemAge();
        java.lang.String str53 = timeSeries49.getDescription();
        double double54 = timeSeries49.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day57 = new org.jfree.data.time.Day();
        timeSeries56.add((org.jfree.data.time.RegularTimePeriod) day57, (double) (short) 0, false);
        timeSeries56.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = timeSeries56.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent65 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean66 = timeSeries56.equals((java.lang.Object) seriesChangeEvent65);
        org.jfree.data.time.Day day67 = new org.jfree.data.time.Day();
        int int69 = day67.compareTo((java.lang.Object) (short) 100);
        java.lang.String str70 = day67.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem71 = timeSeries56.getDataItem((org.jfree.data.time.RegularTimePeriod) day67);
        timeSeries49.add(timeSeriesDataItem71);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries41.addAndOrUpdate(timeSeries49);
        java.lang.Comparable comparable74 = timeSeries73.getKey();
        org.jfree.data.time.TimeSeries timeSeries75 = timeSeries1.addAndOrUpdate(timeSeries73);
        java.lang.Object obj76 = timeSeries1.clone();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1-April-2024" + "'", str31, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem32);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 0.0d + "'", number34, 0.0d);
        org.junit.Assert.assertNull(timeSeriesDataItem37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 9223372036854775807L + "'", long52 == 9223372036854775807L);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(regularTimePeriod63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "1-April-2024" + "'", str70, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem71);
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertEquals("'" + comparable74 + "' != '" + "Overwritten values from: 100" + "'", comparable74, "Overwritten values from: 100");
        org.junit.Assert.assertNotNull(timeSeries75);
        org.junit.Assert.assertNotNull(obj76);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month();
        long long10 = month9.getLastMillisecond();
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month();
        int int12 = month9.compareTo((java.lang.Object) month11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list15 = timeSeries14.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.Month month22 = new org.jfree.data.time.Month();
        long long23 = month22.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.removeChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        timeSeries29.add((org.jfree.data.time.RegularTimePeriod) day30, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries25.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day30, (java.lang.Number) 10L);
        long long36 = day30.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries19.createCopy((org.jfree.data.time.RegularTimePeriod) month22, (org.jfree.data.time.RegularTimePeriod) day30);
        timeSeries19.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries19.removeChangeListener(seriesChangeListener40);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries14.addAndOrUpdate(timeSeries19);
        int int43 = month9.compareTo((java.lang.Object) timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries45.removeChangeListener(seriesChangeListener46);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day50 = new org.jfree.data.time.Day();
        timeSeries49.add((org.jfree.data.time.RegularTimePeriod) day50, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem55 = timeSeries45.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day50, (java.lang.Number) 10L);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month9, (org.jfree.data.time.RegularTimePeriod) day50);
        int int57 = month9.getYearValue();
        java.util.Date date58 = month9.getStart();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1714546799999L + "'", long10 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711954800000L + "'", long23 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1711997999999L + "'", long36 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem55);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2024 + "'", int57 == 2024);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Mon Apr 01 00:00:00 PDT 2024");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.removeChangeListener(seriesChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day24 = new org.jfree.data.time.Day();
        timeSeries23.add((org.jfree.data.time.RegularTimePeriod) day24, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries19.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day24, (java.lang.Number) 10L);
        long long30 = day24.getMiddleMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day24, (java.lang.Number) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day35 = new org.jfree.data.time.Day();
        timeSeries34.add((org.jfree.data.time.RegularTimePeriod) day35, (double) (short) 0, false);
        java.util.Date date39 = day35.getStart();
        org.jfree.data.time.SerialDate serialDate40 = day35.getSerialDate();
        java.lang.String str41 = day35.toString();
        boolean boolean42 = timeSeriesDataItem32.equals((java.lang.Object) str41);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) boolean42);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertNull(timeSeriesDataItem29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1711997999999L + "'", long30 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem32);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1-April-2024" + "'", str41, "1-April-2024");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        timeSeries1.setDescription("hi!");
        long long9 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year(9999);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = year1.next();
        java.lang.String str3 = year1.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year1.previous();
        org.junit.Assert.assertNull(regularTimePeriod2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9999" + "'", str3, "9999");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 2);
        java.lang.Comparable comparable16 = timeSeries1.getKey();
        org.jfree.data.time.FixedMillisecond fixedMillisecond17 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = fixedMillisecond17.next();
        java.util.Date date19 = fixedMillisecond17.getTime();
        long long20 = fixedMillisecond17.getSerialIndex();
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) fixedMillisecond17, (java.lang.Number) 1711995804040L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 100L + "'", comparable16, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Mon Apr 01 11:24:57 PDT 2024");
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1711995897361L + "'", long20 == 1711995897361L);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond(1711954800000L);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        timeSeries1.setKey((java.lang.Comparable) "hi!");
        boolean boolean18 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double21 = timeSeries20.getMaxY();
        org.jfree.data.time.Day day22 = new org.jfree.data.time.Day();
        java.lang.Number number23 = null;
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day22, number23, false);
        double double26 = timeSeries20.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day29 = new org.jfree.data.time.Day();
        timeSeries28.add((org.jfree.data.time.RegularTimePeriod) day29, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries20.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day29, (java.lang.Number) 2);
        long long35 = day29.getSerialIndex();
        org.jfree.data.time.Day day36 = new org.jfree.data.time.Day();
        int int38 = day36.compareTo((java.lang.Object) (short) 100);
        int int39 = day29.compareTo((java.lang.Object) day36);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day36);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(timeSeriesDataItem34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 45383L + "'", long35 == 45383L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(timeSeriesDataItem40);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.time.FixedMillisecond fixedMillisecond2 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = fixedMillisecond2.next();
        timeSeries1.setKey((java.lang.Comparable) fixedMillisecond2);
        org.jfree.data.time.Month month5 = new org.jfree.data.time.Month();
        long long6 = month5.getLastMillisecond();
        org.jfree.data.time.Month month7 = new org.jfree.data.time.Month();
        int int8 = month5.compareTo((java.lang.Object) month7);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) month5, (java.lang.Number) 1735718399999L, false);
        org.jfree.data.time.FixedMillisecond fixedMillisecond12 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        timeSeries14.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries22.addChangeListener(seriesChangeListener23);
        long long25 = timeSeries22.getMaximumItemAge();
        java.lang.String str26 = timeSeries22.getDescription();
        double double27 = timeSeries22.getMaxY();
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
        timeSeries22.add(timeSeriesDataItem44);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries14.addAndOrUpdate(timeSeries22);
        timeSeries46.fireSeriesChanged();
        boolean boolean48 = fixedMillisecond12.equals((java.lang.Object) timeSeries46);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = fixedMillisecond12.previous();
        java.util.Calendar calendar50 = null;
        fixedMillisecond12.peg(calendar50);
        long long52 = fixedMillisecond12.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod53 = fixedMillisecond12.next();
        java.util.Calendar calendar54 = null;
        long long55 = fixedMillisecond12.getLastMillisecond(calendar54);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem57 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) fixedMillisecond12, (java.lang.Number) 1672560000000L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Month.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9223372036854775807L + "'", long25 == 9223372036854775807L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(regularTimePeriod36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1-April-2024" + "'", str43, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem44);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod49);
// flaky:         org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1711995897620L + "'", long52 == 1711995897620L);
        org.junit.Assert.assertNotNull(regularTimePeriod53);
// flaky:         org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1711995897620L + "'", long55 == 1711995897620L);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond((long) (-1));
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list4 = timeSeries3.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries3.addChangeListener(seriesChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries8.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month();
        long long12 = month11.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries14.removeChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        timeSeries18.add((org.jfree.data.time.RegularTimePeriod) day19, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries14.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day19, (java.lang.Number) 10L);
        long long25 = day19.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.createCopy((org.jfree.data.time.RegularTimePeriod) month11, (org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries8.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries8.removeChangeListener(seriesChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener32);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries35.addChangeListener(seriesChangeListener36);
        org.jfree.data.time.Month month38 = new org.jfree.data.time.Month();
        long long39 = month38.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries41.removeChangeListener(seriesChangeListener42);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day46 = new org.jfree.data.time.Day();
        timeSeries45.add((org.jfree.data.time.RegularTimePeriod) day46, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem51 = timeSeries41.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day46, (java.lang.Number) 10L);
        long long52 = day46.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries35.createCopy((org.jfree.data.time.RegularTimePeriod) month38, (org.jfree.data.time.RegularTimePeriod) day46);
        timeSeries35.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries35.removeChangeListener(seriesChangeListener56);
        org.jfree.data.time.Day day58 = new org.jfree.data.time.Day();
        long long59 = day58.getSerialIndex();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) day58, (java.lang.Number) 1.0f, true);
        boolean boolean63 = timeSeries3.equals((java.lang.Object) true);
        org.jfree.data.time.FixedMillisecond fixedMillisecond65 = new org.jfree.data.time.FixedMillisecond(1711997999999L);
        java.util.Calendar calendar66 = null;
        fixedMillisecond65.peg(calendar66);
        java.util.Calendar calendar68 = null;
        long long69 = fixedMillisecond65.getLastMillisecond(calendar68);
        timeSeries3.add((org.jfree.data.time.RegularTimePeriod) fixedMillisecond65, (double) 10.0f, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod73 = fixedMillisecond65.next();
        int int74 = fixedMillisecond1.compareTo((java.lang.Object) regularTimePeriod73);
        long long75 = fixedMillisecond1.getSerialIndex();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711954800000L + "'", long12 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1711997999999L + "'", long25 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1711954800000L + "'", long39 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1711997999999L + "'", long52 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 45383L + "'", long59 == 45383L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1711997999999L + "'", long69 == 1711997999999L);
        org.junit.Assert.assertNotNull(regularTimePeriod73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-1L) + "'", long75 == (-1L));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        long long27 = timeSeries1.getMaximumItemAge();
        java.lang.Object obj28 = timeSeries1.clone();
        timeSeries1.setDomainDescription("");
        int int31 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj32 = null;
        boolean boolean33 = timeSeries1.equals(obj32);
        boolean boolean34 = timeSeries1.isEmpty();
        java.lang.Class<?> wildcardClass35 = timeSeries1.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1-April-2024" + "'", str22, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        java.util.List list5 = timeSeries1.getItems();
        boolean boolean6 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries8.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month();
        long long12 = month11.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries14.removeChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        timeSeries18.add((org.jfree.data.time.RegularTimePeriod) day19, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries14.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day19, (java.lang.Number) 10L);
        long long25 = day19.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.createCopy((org.jfree.data.time.RegularTimePeriod) month11, (org.jfree.data.time.RegularTimePeriod) day19);
        long long27 = month11.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = month11.next();
        long long29 = regularTimePeriod28.getLastMillisecond();
        java.lang.Number number30 = timeSeries1.getValue(regularTimePeriod28);
        timeSeries1.setMaximumItemAge((long) 3);
        org.jfree.data.time.Month month33 = new org.jfree.data.time.Month();
        org.jfree.data.time.Year year34 = month33.getYear();
        long long35 = month33.getFirstMillisecond();
        java.util.Date date36 = month33.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond37 = new org.jfree.data.time.FixedMillisecond(date36);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) fixedMillisecond37, (double) 1711995763602L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711954800000L + "'", long12 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1711997999999L + "'", long25 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 24292L + "'", long27 == 24292L);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1717225199999L + "'", long29 == 1717225199999L);
        org.junit.Assert.assertNull(number30);
        org.junit.Assert.assertNotNull(year34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1711954800000L + "'", long35 == 1711954800000L);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Mon Apr 01 00:00:00 PDT 2024");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond(1711995827955L);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        timeSeries1.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries10.addChangeListener(seriesChangeListener11);
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.String str14 = timeSeries10.getDescription();
        double double15 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        timeSeries17.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries17.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean27 = timeSeries17.equals((java.lang.Object) seriesChangeEvent26);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        int int30 = day28.compareTo((java.lang.Object) (short) 100);
        java.lang.String str31 = day28.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries17.getDataItem((org.jfree.data.time.RegularTimePeriod) day28);
        timeSeries10.add(timeSeriesDataItem32);
        java.lang.Number number34 = timeSeriesDataItem32.getValue();
        timeSeriesDataItem32.setValue((java.lang.Number) (byte) 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries1.addOrUpdate(timeSeriesDataItem32);
        int int38 = timeSeries1.getItemCount();
        boolean boolean39 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        timeSeries41.add((org.jfree.data.time.RegularTimePeriod) day42, (double) (short) 0, false);
        timeSeries41.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries49.addChangeListener(seriesChangeListener50);
        long long52 = timeSeries49.getMaximumItemAge();
        java.lang.String str53 = timeSeries49.getDescription();
        double double54 = timeSeries49.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day57 = new org.jfree.data.time.Day();
        timeSeries56.add((org.jfree.data.time.RegularTimePeriod) day57, (double) (short) 0, false);
        timeSeries56.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = timeSeries56.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent65 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean66 = timeSeries56.equals((java.lang.Object) seriesChangeEvent65);
        org.jfree.data.time.Day day67 = new org.jfree.data.time.Day();
        int int69 = day67.compareTo((java.lang.Object) (short) 100);
        java.lang.String str70 = day67.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem71 = timeSeries56.getDataItem((org.jfree.data.time.RegularTimePeriod) day67);
        timeSeries49.add(timeSeriesDataItem71);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries41.addAndOrUpdate(timeSeries49);
        java.lang.Comparable comparable74 = timeSeries73.getKey();
        org.jfree.data.time.TimeSeries timeSeries75 = timeSeries1.addAndOrUpdate(timeSeries73);
        boolean boolean76 = timeSeries73.getNotify();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1-April-2024" + "'", str31, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem32);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 0.0d + "'", number34, 0.0d);
        org.junit.Assert.assertNull(timeSeriesDataItem37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 9223372036854775807L + "'", long52 == 9223372036854775807L);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(regularTimePeriod63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "1-April-2024" + "'", str70, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem71);
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertEquals("'" + comparable74 + "' != '" + "Overwritten values from: 100" + "'", comparable74, "Overwritten values from: 100");
        org.junit.Assert.assertNotNull(timeSeries75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.Month month18 = new org.jfree.data.time.Month();
        long long19 = month18.getLastMillisecond();
        org.jfree.data.time.Month month20 = new org.jfree.data.time.Month();
        int int21 = month18.compareTo((java.lang.Object) month20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list24 = timeSeries23.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries23.addChangeListener(seriesChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries28.addChangeListener(seriesChangeListener29);
        org.jfree.data.time.Month month31 = new org.jfree.data.time.Month();
        long long32 = month31.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries34.removeChangeListener(seriesChangeListener35);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        timeSeries38.add((org.jfree.data.time.RegularTimePeriod) day39, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = timeSeries34.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day39, (java.lang.Number) 10L);
        long long45 = day39.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries28.createCopy((org.jfree.data.time.RegularTimePeriod) month31, (org.jfree.data.time.RegularTimePeriod) day39);
        timeSeries28.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries28.removeChangeListener(seriesChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries23.addAndOrUpdate(timeSeries28);
        int int52 = month18.compareTo((java.lang.Object) timeSeries28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod53 = month18.next();
        org.jfree.data.time.FixedMillisecond fixedMillisecond55 = new org.jfree.data.time.FixedMillisecond((long) ' ');
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries1.createCopy(regularTimePeriod53, (org.jfree.data.time.RegularTimePeriod) fixedMillisecond55);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = fixedMillisecond55.next();
        java.util.Calendar calendar58 = null;
        long long59 = fixedMillisecond55.getFirstMillisecond(calendar58);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1-April-2024" + "'", str15, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1714546799999L + "'", long19 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1711954800000L + "'", long32 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1711997999999L + "'", long45 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod53);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(regularTimePeriod57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 32L + "'", long59 == 32L);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 2);
        java.lang.Comparable comparable16 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        timeSeries18.add((org.jfree.data.time.RegularTimePeriod) day19, (double) (short) 0, false);
        java.util.Date date23 = day19.getStart();
        org.jfree.data.time.SerialDate serialDate24 = day19.getSerialDate();
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day(serialDate24);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day25, (java.lang.Number) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = day25.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = day25.previous();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 100L + "'", comparable16, 100L);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate24);
        org.junit.Assert.assertNotNull(timeSeriesDataItem27);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
        org.junit.Assert.assertNotNull(regularTimePeriod29);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.Month month8 = new org.jfree.data.time.Month();
        long long9 = month8.getLastMillisecond();
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month();
        int int11 = month8.compareTo((java.lang.Object) month10);
        int int12 = month8.getYearValue();
        long long13 = month8.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = month8.previous();
        int int15 = month8.getMonth();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month8, (double) 1711995683606L);
        java.lang.Number number18 = timeSeriesDataItem17.getValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries1.addOrUpdate(timeSeriesDataItem17);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1714546799999L + "'", long9 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2024 + "'", int12 == 2024);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711954800000L + "'", long13 == 1711954800000L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 1.711995683606E12d + "'", number18, 1.711995683606E12d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries9.addChangeListener(seriesChangeListener10);
        long long12 = timeSeries9.getMaximumItemAge();
        java.lang.String str13 = timeSeries9.getDescription();
        double double14 = timeSeries9.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        timeSeries16.add((org.jfree.data.time.RegularTimePeriod) day17, (double) (short) 0, false);
        timeSeries16.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = timeSeries16.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent25 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean26 = timeSeries16.equals((java.lang.Object) seriesChangeEvent25);
        org.jfree.data.time.Day day27 = new org.jfree.data.time.Day();
        int int29 = day27.compareTo((java.lang.Object) (short) 100);
        java.lang.String str30 = day27.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries16.getDataItem((org.jfree.data.time.RegularTimePeriod) day27);
        timeSeries9.add(timeSeriesDataItem31);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries1.addAndOrUpdate(timeSeries9);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo34 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent35 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries9, seriesChangeInfo34);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries37.removeChangeListener(seriesChangeListener38);
        java.lang.String str40 = timeSeries37.getRangeDescription();
        java.util.List list41 = timeSeries37.getItems();
        timeSeries9.data = list41;
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(regularTimePeriod23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1-April-2024" + "'", str30, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem31);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(list41);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        timeSeriesDataItem23.setSelected(false);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean29 = timeSeries28.isEmpty();
        timeSeries28.clear();
        timeSeries28.setNotify(false);
        org.jfree.data.time.Day day33 = new org.jfree.data.time.Day();
        int int34 = timeSeries28.getIndex((org.jfree.data.time.RegularTimePeriod) day33);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double37 = timeSeries36.getMaxY();
        java.util.Collection collection38 = timeSeries36.getTimePeriods();
        boolean boolean39 = timeSeries28.equals((java.lang.Object) collection38);
        boolean boolean40 = timeSeriesDataItem23.equals((java.lang.Object) timeSeries28);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day43 = new org.jfree.data.time.Day();
        timeSeries42.add((org.jfree.data.time.RegularTimePeriod) day43, (double) (short) 0, false);
        int int47 = day43.getDayOfMonth();
        long long48 = day43.getLastMillisecond();
        int int50 = day43.compareTo((java.lang.Object) 10);
        timeSeries28.delete((org.jfree.data.time.RegularTimePeriod) day43);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod52 = day43.next();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1-April-2024" + "'", str22, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1712041199999L + "'", long48 == 1712041199999L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod52);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getLastMillisecond();
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month();
        int int3 = month0.compareTo((java.lang.Object) month2);
        int int4 = month0.getYearValue();
        long long5 = month0.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = month0.previous();
        int int7 = month0.getMonth();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month0, (double) 1711995683606L);
        java.lang.String str10 = month0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1714546799999L + "'", long1 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2024 + "'", int4 == 2024);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "April 2024" + "'", str10, "April 2024");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        java.util.Collection collection9 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        java.util.List list5 = timeSeries1.getItems();
        boolean boolean6 = timeSeries1.getNotify();
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        java.lang.Object obj8 = null;
        boolean boolean9 = timeSeries1.equals(obj8);
        java.lang.Class class10 = timeSeries1.getTimePeriodClass();
        java.util.Collection collection11 = timeSeries1.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod12, (double) 1711995884639L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        timeSeries1.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries1.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.Day day24 = new org.jfree.data.time.Day();
        long long25 = day24.getSerialIndex();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day24, (java.lang.Number) 1.0f, true);
        long long29 = day24.getLastMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day24, (double) (-60518505600001L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711997999999L + "'", long18 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 45383L + "'", long25 == 45383L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1712041199999L + "'", long29 == 1712041199999L);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 2);
        int int17 = timeSeriesDataItem15.compareTo((java.lang.Object) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) int17, "Value", "");
        int int21 = timeSeries20.getItemCount();
        java.lang.Object obj22 = timeSeries20.clone();
        int int23 = timeSeries20.getItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemCount(2024);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day7 = new org.jfree.data.time.Day();
        timeSeries6.add((org.jfree.data.time.RegularTimePeriod) day7, (double) (short) 0, false);
        java.util.Date date11 = day7.getStart();
        boolean boolean12 = timeSeries1.equals((java.lang.Object) date11);
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day(date11);
        org.jfree.data.time.Year year14 = new org.jfree.data.time.Year(date11);
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = year14.getFirstMillisecond(calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.time.Year year1 = month0.getYear();
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.Month month6 = new org.jfree.data.time.Month();
        long long7 = month6.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries9.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day14 = new org.jfree.data.time.Day();
        timeSeries13.add((org.jfree.data.time.RegularTimePeriod) day14, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries9.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day14, (java.lang.Number) 10L);
        long long20 = day14.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.createCopy((org.jfree.data.time.RegularTimePeriod) month6, (org.jfree.data.time.RegularTimePeriod) day14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = month6.next();
        int int23 = year1.compareTo((java.lang.Object) month6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = year1.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = year1.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = year1.previous();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries28.addChangeListener(seriesChangeListener29);
        org.jfree.data.time.Month month31 = new org.jfree.data.time.Month();
        long long32 = month31.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries34.removeChangeListener(seriesChangeListener35);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        timeSeries38.add((org.jfree.data.time.RegularTimePeriod) day39, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = timeSeries34.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day39, (java.lang.Number) 10L);
        long long45 = day39.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries28.createCopy((org.jfree.data.time.RegularTimePeriod) month31, (org.jfree.data.time.RegularTimePeriod) day39);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = month31.next();
        int int48 = year1.compareTo((java.lang.Object) regularTimePeriod47);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = year1.previous();
        org.junit.Assert.assertNotNull(year1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1711997999999L + "'", long20 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertNotNull(regularTimePeriod25);
        org.junit.Assert.assertNotNull(regularTimePeriod26);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1711954800000L + "'", long32 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1711997999999L + "'", long45 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(regularTimePeriod47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod49);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month();
        long long10 = month9.getLastMillisecond();
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month();
        int int12 = month9.compareTo((java.lang.Object) month11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list15 = timeSeries14.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.Month month22 = new org.jfree.data.time.Month();
        long long23 = month22.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.removeChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        timeSeries29.add((org.jfree.data.time.RegularTimePeriod) day30, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries25.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day30, (java.lang.Number) 10L);
        long long36 = day30.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries19.createCopy((org.jfree.data.time.RegularTimePeriod) month22, (org.jfree.data.time.RegularTimePeriod) day30);
        timeSeries19.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries19.removeChangeListener(seriesChangeListener40);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries14.addAndOrUpdate(timeSeries19);
        int int43 = month9.compareTo((java.lang.Object) timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries45.removeChangeListener(seriesChangeListener46);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day50 = new org.jfree.data.time.Day();
        timeSeries49.add((org.jfree.data.time.RegularTimePeriod) day50, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem55 = timeSeries45.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day50, (java.lang.Number) 10L);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month9, (org.jfree.data.time.RegularTimePeriod) day50);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day59 = new org.jfree.data.time.Day();
        timeSeries58.add((org.jfree.data.time.RegularTimePeriod) day59, (double) (short) 0, false);
        java.util.Date date63 = day59.getStart();
        org.jfree.data.time.SerialDate serialDate64 = day59.getSerialDate();
        org.jfree.data.time.SerialDate serialDate65 = day59.getSerialDate();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem66 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day59);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem68 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day59, (double) 1711995721514L);
        java.lang.Number number69 = timeSeriesDataItem68.getValue();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo70 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent71 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeriesDataItem68, seriesChangeInfo70);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo72 = null;
        seriesChangeEvent71.setSummary(seriesChangeInfo72);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1714546799999L + "'", long10 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711954800000L + "'", long23 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1711997999999L + "'", long36 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem55);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate64);
        org.junit.Assert.assertNotNull(serialDate65);
        org.junit.Assert.assertNotNull(timeSeriesDataItem66);
        org.junit.Assert.assertEquals("'" + number69 + "' != '" + 1.711995721514E12d + "'", number69, 1.711995721514E12d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month();
        long long10 = month9.getLastMillisecond();
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month();
        int int12 = month9.compareTo((java.lang.Object) month11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list15 = timeSeries14.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.Month month22 = new org.jfree.data.time.Month();
        long long23 = month22.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.removeChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        timeSeries29.add((org.jfree.data.time.RegularTimePeriod) day30, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries25.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day30, (java.lang.Number) 10L);
        long long36 = day30.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries19.createCopy((org.jfree.data.time.RegularTimePeriod) month22, (org.jfree.data.time.RegularTimePeriod) day30);
        timeSeries19.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries19.removeChangeListener(seriesChangeListener40);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries14.addAndOrUpdate(timeSeries19);
        int int43 = month9.compareTo((java.lang.Object) timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries45.removeChangeListener(seriesChangeListener46);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day50 = new org.jfree.data.time.Day();
        timeSeries49.add((org.jfree.data.time.RegularTimePeriod) day50, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem55 = timeSeries45.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day50, (java.lang.Number) 10L);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month9, (org.jfree.data.time.RegularTimePeriod) day50);
        timeSeries56.removeAgedItems((long) 2024, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries56.addChangeListener(seriesChangeListener60);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1714546799999L + "'", long10 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711954800000L + "'", long23 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1711997999999L + "'", long36 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem55);
        org.junit.Assert.assertNotNull(timeSeries56);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.util.Date date16 = day10.getEnd();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day10, (java.lang.Number) 0L);
        int int19 = day10.getDayOfMonth();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Mon Apr 01 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        long long8 = day2.getFirstMillisecond();
        int int9 = day2.getMonth();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day2, (double) 1711995841776L);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711954800000L + "'", long8 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        org.jfree.data.time.Month month7 = new org.jfree.data.time.Month();
        long long8 = month7.getLastMillisecond();
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month();
        int int10 = month7.compareTo((java.lang.Object) month9);
        java.lang.String str11 = month7.toString();
        long long12 = month7.getLastMillisecond();
        int int13 = day3.compareTo((java.lang.Object) long12);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1714546799999L + "'", long8 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "April 2024" + "'", str11, "April 2024");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1714546799999L + "'", long12 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException1 = new org.jfree.data.time.TimePeriodFormatException("2024");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries6.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month();
        long long10 = month9.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries12.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        timeSeries16.add((org.jfree.data.time.RegularTimePeriod) day17, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries12.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day17, (java.lang.Number) 10L);
        long long23 = day17.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries6.createCopy((org.jfree.data.time.RegularTimePeriod) month9, (org.jfree.data.time.RegularTimePeriod) day17);
        timeSeries6.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries6.removeChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day32 = new org.jfree.data.time.Day();
        timeSeries31.add((org.jfree.data.time.RegularTimePeriod) day32, (double) (short) 0, false);
        timeSeries31.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = timeSeries31.getNextTimePeriod();
        org.jfree.data.time.Month month39 = new org.jfree.data.time.Month();
        long long40 = month39.getLastMillisecond();
        org.jfree.data.time.Month month41 = new org.jfree.data.time.Month();
        int int42 = month39.compareTo((java.lang.Object) month41);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list45 = timeSeries44.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries44.addChangeListener(seriesChangeListener46);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries49.addChangeListener(seriesChangeListener50);
        org.jfree.data.time.Month month52 = new org.jfree.data.time.Month();
        long long53 = month52.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries55.removeChangeListener(seriesChangeListener56);
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day60 = new org.jfree.data.time.Day();
        timeSeries59.add((org.jfree.data.time.RegularTimePeriod) day60, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem65 = timeSeries55.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day60, (java.lang.Number) 10L);
        long long66 = day60.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries49.createCopy((org.jfree.data.time.RegularTimePeriod) month52, (org.jfree.data.time.RegularTimePeriod) day60);
        timeSeries49.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener70 = null;
        timeSeries49.removeChangeListener(seriesChangeListener70);
        org.jfree.data.time.TimeSeries timeSeries72 = timeSeries44.addAndOrUpdate(timeSeries49);
        int int73 = month39.compareTo((java.lang.Object) timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener76 = null;
        timeSeries75.removeChangeListener(seriesChangeListener76);
        org.jfree.data.time.TimeSeries timeSeries79 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day80 = new org.jfree.data.time.Day();
        timeSeries79.add((org.jfree.data.time.RegularTimePeriod) day80, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem85 = timeSeries75.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day80, (java.lang.Number) 10L);
        org.jfree.data.time.TimeSeries timeSeries86 = timeSeries31.createCopy((org.jfree.data.time.RegularTimePeriod) month39, (org.jfree.data.time.RegularTimePeriod) day80);
        org.jfree.data.time.TimeSeries timeSeries87 = timeSeries6.addAndOrUpdate(timeSeries86);
        org.jfree.data.time.FixedMillisecond fixedMillisecond89 = new org.jfree.data.time.FixedMillisecond(1711997999999L);
        long long90 = fixedMillisecond89.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod91 = fixedMillisecond89.previous();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem92 = timeSeries86.getDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond89);
        java.lang.String str93 = timeSeries86.getDomainDescription();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711954800000L + "'", long10 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711997999999L + "'", long23 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(regularTimePeriod38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1714546799999L + "'", long40 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1711954800000L + "'", long53 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1711997999999L + "'", long66 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertNotNull(timeSeries72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem85);
        org.junit.Assert.assertNotNull(timeSeries86);
        org.junit.Assert.assertNotNull(timeSeries87);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1711997999999L + "'", long90 == 1711997999999L);
        org.junit.Assert.assertNotNull(regularTimePeriod91);
        org.junit.Assert.assertNotNull(timeSeriesDataItem92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Time" + "'", str93, "Time");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year(2);
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day4 = new org.jfree.data.time.Day();
        timeSeries3.add((org.jfree.data.time.RegularTimePeriod) day4, (double) (short) 0, false);
        java.util.Date date8 = day4.getStart();
        org.jfree.data.time.SerialDate serialDate9 = day4.getSerialDate();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo11 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent12 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) true, seriesChangeInfo11);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo13 = seriesChangeEvent12.getSummary();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo14 = null;
        seriesChangeEvent12.setSummary(seriesChangeInfo14);
        int int16 = day4.compareTo((java.lang.Object) seriesChangeEvent12);
        int int17 = year1.compareTo((java.lang.Object) seriesChangeEvent12);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo18 = null;
        seriesChangeEvent12.setSummary(seriesChangeInfo18);
        java.lang.Object obj20 = seriesChangeEvent12.getSource();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo21 = seriesChangeEvent12.getSummary();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo22 = seriesChangeEvent12.getSummary();
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate9);
        org.junit.Assert.assertNull(seriesChangeInfo13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + true + "'", obj20, true);
        org.junit.Assert.assertNull(seriesChangeInfo21);
        org.junit.Assert.assertNull(seriesChangeInfo22);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.time.Year year1 = month0.getYear();
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.Month month6 = new org.jfree.data.time.Month();
        long long7 = month6.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries9.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day14 = new org.jfree.data.time.Day();
        timeSeries13.add((org.jfree.data.time.RegularTimePeriod) day14, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries9.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day14, (java.lang.Number) 10L);
        long long20 = day14.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.createCopy((org.jfree.data.time.RegularTimePeriod) month6, (org.jfree.data.time.RegularTimePeriod) day14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = month6.next();
        int int23 = year1.compareTo((java.lang.Object) month6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = year1.previous();
        int int25 = year1.getYear();
        int int26 = year1.getYear();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries28.addChangeListener(seriesChangeListener29);
        long long31 = timeSeries28.getMaximumItemAge();
        java.lang.String str32 = timeSeries28.getDescription();
        timeSeries28.fireSeriesChanged();
        timeSeries28.removeAgedItems(false);
        java.lang.String str36 = timeSeries28.getRangeDescription();
        java.lang.Object obj37 = timeSeries28.clone();
        boolean boolean38 = year1.equals((java.lang.Object) timeSeries28);
        org.junit.Assert.assertNotNull(year1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1711997999999L + "'", long20 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2024 + "'", int25 == 2024);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2024 + "'", int26 == 2024);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month();
        long long10 = month9.getLastMillisecond();
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month();
        int int12 = month9.compareTo((java.lang.Object) month11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list15 = timeSeries14.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.Month month22 = new org.jfree.data.time.Month();
        long long23 = month22.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.removeChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        timeSeries29.add((org.jfree.data.time.RegularTimePeriod) day30, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries25.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day30, (java.lang.Number) 10L);
        long long36 = day30.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries19.createCopy((org.jfree.data.time.RegularTimePeriod) month22, (org.jfree.data.time.RegularTimePeriod) day30);
        timeSeries19.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries19.removeChangeListener(seriesChangeListener40);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries14.addAndOrUpdate(timeSeries19);
        int int43 = month9.compareTo((java.lang.Object) timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries45.removeChangeListener(seriesChangeListener46);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day50 = new org.jfree.data.time.Day();
        timeSeries49.add((org.jfree.data.time.RegularTimePeriod) day50, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem55 = timeSeries45.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day50, (java.lang.Number) 10L);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month9, (org.jfree.data.time.RegularTimePeriod) day50);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day59 = new org.jfree.data.time.Day();
        timeSeries58.add((org.jfree.data.time.RegularTimePeriod) day59, (double) (short) 0, false);
        timeSeries58.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day67 = new org.jfree.data.time.Day();
        timeSeries66.add((org.jfree.data.time.RegularTimePeriod) day67, (double) (short) 0, false);
        java.util.Date date71 = day67.getStart();
        org.jfree.data.time.SerialDate serialDate72 = day67.getSerialDate();
        java.lang.Number number73 = null;
        timeSeries58.update((org.jfree.data.time.RegularTimePeriod) day67, number73);
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener77 = null;
        timeSeries76.removeChangeListener(seriesChangeListener77);
        org.jfree.data.time.TimeSeries timeSeries80 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day81 = new org.jfree.data.time.Day();
        timeSeries80.add((org.jfree.data.time.RegularTimePeriod) day81, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem86 = timeSeries76.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day81, (java.lang.Number) 10L);
        long long87 = day81.getMiddleMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem89 = timeSeries58.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day81, (java.lang.Number) (byte) 10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem90 = timeSeries1.addOrUpdate(timeSeriesDataItem89);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem92 = timeSeries1.getRawDataItem(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1714546799999L + "'", long10 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711954800000L + "'", long23 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1711997999999L + "'", long36 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem55);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate72);
        org.junit.Assert.assertNull(timeSeriesDataItem86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 1711997999999L + "'", long87 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem89);
        org.junit.Assert.assertNotNull(timeSeriesDataItem90);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        timeSeries2.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries10.addChangeListener(seriesChangeListener11);
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.String str14 = timeSeries10.getDescription();
        double double15 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        timeSeries17.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries17.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean27 = timeSeries17.equals((java.lang.Object) seriesChangeEvent26);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        int int30 = day28.compareTo((java.lang.Object) (short) 100);
        java.lang.String str31 = day28.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries17.getDataItem((org.jfree.data.time.RegularTimePeriod) day28);
        timeSeries10.add(timeSeriesDataItem32);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries2.addAndOrUpdate(timeSeries10);
        timeSeries34.fireSeriesChanged();
        boolean boolean36 = fixedMillisecond0.equals((java.lang.Object) timeSeries34);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = fixedMillisecond0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = fixedMillisecond0.previous();
        java.util.Date date39 = fixedMillisecond0.getEnd();
        org.jfree.data.time.FixedMillisecond fixedMillisecond40 = new org.jfree.data.time.FixedMillisecond(date39);
        org.jfree.data.time.Day day41 = new org.jfree.data.time.Day(date39);
        java.util.TimeZone timeZone42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day43 = new org.jfree.data.time.Day(date39, timeZone42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1-April-2024" + "'", str31, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem32);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertNotNull(regularTimePeriod38);
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Mon Apr 01 11:25:04 PDT 2024");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double7 = timeSeries6.getMaxY();
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        java.lang.Number number9 = null;
        timeSeries6.add((org.jfree.data.time.RegularTimePeriod) day8, number9, false);
        int int13 = day8.compareTo((java.lang.Object) 2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day8, (java.lang.Number) 6);
        java.util.Date date16 = day8.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = day8.next();
        java.util.Calendar calendar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = day8.getMiddleMillisecond(calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod17);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.removeChangeListener(seriesChangeListener5);
        java.lang.String str7 = timeSeries4.getRangeDescription();
        timeSeries4.setDomainDescription("hi!");
        java.util.List list10 = timeSeries4.data;
        timeSeries1.data = list10;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.Year year7 = new org.jfree.data.time.Year(date6);
        org.jfree.data.time.Year year8 = new org.jfree.data.time.Year(date6);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries10.addChangeListener(seriesChangeListener11);
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.String str14 = timeSeries10.getDescription();
        double double15 = timeSeries10.getMaxY();
        timeSeries10.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        java.lang.Number number22 = null;
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) day21, number22, false);
        double double25 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        timeSeries27.add((org.jfree.data.time.RegularTimePeriod) day28, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries19.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day28, (java.lang.Number) 2);
        int int35 = timeSeriesDataItem33.compareTo((java.lang.Object) (short) 100);
        timeSeries10.add(timeSeriesDataItem33);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        timeSeries38.add((org.jfree.data.time.RegularTimePeriod) day39, (double) (short) 0, false);
        timeSeries38.setMaximumItemAge((long) 1);
        int int45 = timeSeriesDataItem33.compareTo((java.lang.Object) timeSeries38);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = timeSeriesDataItem33.getPeriod();
        boolean boolean47 = year8.equals((java.lang.Object) timeSeriesDataItem33);
        long long48 = year8.getSerialIndex();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(timeSeriesDataItem33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 2024L + "'", long48 == 2024L);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        timeSeries2.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries10.addChangeListener(seriesChangeListener11);
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.String str14 = timeSeries10.getDescription();
        double double15 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        timeSeries17.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries17.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean27 = timeSeries17.equals((java.lang.Object) seriesChangeEvent26);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        int int30 = day28.compareTo((java.lang.Object) (short) 100);
        java.lang.String str31 = day28.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries17.getDataItem((org.jfree.data.time.RegularTimePeriod) day28);
        timeSeries10.add(timeSeriesDataItem32);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries2.addAndOrUpdate(timeSeries10);
        timeSeries34.fireSeriesChanged();
        boolean boolean36 = fixedMillisecond0.equals((java.lang.Object) timeSeries34);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = fixedMillisecond0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = fixedMillisecond0.previous();
        long long39 = fixedMillisecond0.getFirstMillisecond();
        long long40 = fixedMillisecond0.getMiddleMillisecond();
        long long41 = fixedMillisecond0.getLastMillisecond();
        java.util.Calendar calendar42 = null;
        fixedMillisecond0.peg(calendar42);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1-April-2024" + "'", str31, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem32);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertNotNull(regularTimePeriod38);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1711995904276L + "'", long39 == 1711995904276L);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1711995904276L + "'", long40 == 1711995904276L);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1711995904276L + "'", long41 == 1711995904276L);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.time.Year year1 = month0.getYear();
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.Month month6 = new org.jfree.data.time.Month();
        long long7 = month6.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries9.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day14 = new org.jfree.data.time.Day();
        timeSeries13.add((org.jfree.data.time.RegularTimePeriod) day14, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries9.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day14, (java.lang.Number) 10L);
        long long20 = day14.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.createCopy((org.jfree.data.time.RegularTimePeriod) month6, (org.jfree.data.time.RegularTimePeriod) day14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = month6.next();
        int int23 = year1.compareTo((java.lang.Object) month6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = year1.previous();
        int int25 = year1.getYear();
        int int26 = year1.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = year1.previous();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = new org.jfree.data.time.TimeSeriesDataItem(regularTimePeriod27, (double) 5);
        org.junit.Assert.assertNotNull(year1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1711997999999L + "'", long20 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2024 + "'", int25 == 2024);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2024 + "'", int26 == 2024);
        org.junit.Assert.assertNotNull(regularTimePeriod27);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        org.jfree.data.time.Year year19 = new org.jfree.data.time.Year(2);
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) year19);
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month();
        long long22 = month21.getLastMillisecond();
        org.jfree.data.time.Month month23 = new org.jfree.data.time.Month();
        int int24 = month21.compareTo((java.lang.Object) month23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list27 = timeSeries26.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries26.addChangeListener(seriesChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries31.addChangeListener(seriesChangeListener32);
        org.jfree.data.time.Month month34 = new org.jfree.data.time.Month();
        long long35 = month34.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries37.removeChangeListener(seriesChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        timeSeries41.add((org.jfree.data.time.RegularTimePeriod) day42, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries37.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day42, (java.lang.Number) 10L);
        long long48 = day42.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries31.createCopy((org.jfree.data.time.RegularTimePeriod) month34, (org.jfree.data.time.RegularTimePeriod) day42);
        timeSeries31.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries31.removeChangeListener(seriesChangeListener52);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries26.addAndOrUpdate(timeSeries31);
        int int55 = month21.compareTo((java.lang.Object) timeSeries31);
        boolean boolean56 = timeSeries1.equals((java.lang.Object) int55);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1714546799999L + "'", long22 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1711954800000L + "'", long35 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1711997999999L + "'", long48 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month();
        long long10 = month9.getLastMillisecond();
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month();
        int int12 = month9.compareTo((java.lang.Object) month11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list15 = timeSeries14.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.Month month22 = new org.jfree.data.time.Month();
        long long23 = month22.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.removeChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        timeSeries29.add((org.jfree.data.time.RegularTimePeriod) day30, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries25.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day30, (java.lang.Number) 10L);
        long long36 = day30.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries19.createCopy((org.jfree.data.time.RegularTimePeriod) month22, (org.jfree.data.time.RegularTimePeriod) day30);
        timeSeries19.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries19.removeChangeListener(seriesChangeListener40);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries14.addAndOrUpdate(timeSeries19);
        int int43 = month9.compareTo((java.lang.Object) timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries45.removeChangeListener(seriesChangeListener46);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day50 = new org.jfree.data.time.Day();
        timeSeries49.add((org.jfree.data.time.RegularTimePeriod) day50, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem55 = timeSeries45.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day50, (java.lang.Number) 10L);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month9, (org.jfree.data.time.RegularTimePeriod) day50);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day59 = new org.jfree.data.time.Day();
        timeSeries58.add((org.jfree.data.time.RegularTimePeriod) day59, (double) (short) 0, false);
        java.util.Date date63 = day59.getStart();
        org.jfree.data.time.SerialDate serialDate64 = day59.getSerialDate();
        org.jfree.data.time.SerialDate serialDate65 = day59.getSerialDate();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem66 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day59);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo67 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent68 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries1, seriesChangeInfo67);
        java.lang.Object obj69 = seriesChangeEvent68.getSource();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1714546799999L + "'", long10 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711954800000L + "'", long23 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1711997999999L + "'", long36 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem55);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate64);
        org.junit.Assert.assertNotNull(serialDate65);
        org.junit.Assert.assertNotNull(timeSeriesDataItem66);
        org.junit.Assert.assertNotNull(obj69);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month();
        long long10 = month9.getLastMillisecond();
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month();
        int int12 = month9.compareTo((java.lang.Object) month11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list15 = timeSeries14.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.Month month22 = new org.jfree.data.time.Month();
        long long23 = month22.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.removeChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        timeSeries29.add((org.jfree.data.time.RegularTimePeriod) day30, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries25.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day30, (java.lang.Number) 10L);
        long long36 = day30.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries19.createCopy((org.jfree.data.time.RegularTimePeriod) month22, (org.jfree.data.time.RegularTimePeriod) day30);
        timeSeries19.setKey((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries19.removeChangeListener(seriesChangeListener40);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries14.addAndOrUpdate(timeSeries19);
        int int43 = month9.compareTo((java.lang.Object) timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries45.removeChangeListener(seriesChangeListener46);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day50 = new org.jfree.data.time.Day();
        timeSeries49.add((org.jfree.data.time.RegularTimePeriod) day50, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem55 = timeSeries45.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day50, (java.lang.Number) 10L);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month9, (org.jfree.data.time.RegularTimePeriod) day50);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day59 = new org.jfree.data.time.Day();
        timeSeries58.add((org.jfree.data.time.RegularTimePeriod) day59, (double) (short) 0, false);
        java.util.Date date63 = day59.getStart();
        org.jfree.data.time.SerialDate serialDate64 = day59.getSerialDate();
        org.jfree.data.time.SerialDate serialDate65 = day59.getSerialDate();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem66 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day59);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem68 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day59, (double) 1711995721514L);
        java.lang.Number number69 = timeSeriesDataItem68.getValue();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo70 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent71 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeriesDataItem68, seriesChangeInfo70);
        java.lang.String str72 = seriesChangeEvent71.toString();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1714546799999L + "'", long10 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711954800000L + "'", long23 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1711997999999L + "'", long36 == 1711997999999L);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem55);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate64);
        org.junit.Assert.assertNotNull(serialDate65);
        org.junit.Assert.assertNotNull(timeSeriesDataItem66);
        org.junit.Assert.assertEquals("'" + number69 + "' != '" + 1.711995721514E12d + "'", number69, 1.711995721514E12d);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.time.Year year1 = month0.getYear();
        long long2 = month0.getFirstMillisecond();
        java.util.Date date3 = month0.getStart();
        long long4 = month0.getSerialIndex();
        java.lang.String str5 = month0.toString();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            month0.peg(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(year1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1711954800000L + "'", long2 == 1711954800000L);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 24292L + "'", long4 == 24292L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "April 2024" + "'", str5, "April 2024");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        org.jfree.data.time.FixedMillisecond fixedMillisecond27 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        timeSeries29.add((org.jfree.data.time.RegularTimePeriod) day30, (double) (short) 0, false);
        timeSeries29.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries37.addChangeListener(seriesChangeListener38);
        long long40 = timeSeries37.getMaximumItemAge();
        java.lang.String str41 = timeSeries37.getDescription();
        double double42 = timeSeries37.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day45 = new org.jfree.data.time.Day();
        timeSeries44.add((org.jfree.data.time.RegularTimePeriod) day45, (double) (short) 0, false);
        timeSeries44.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = timeSeries44.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent53 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean54 = timeSeries44.equals((java.lang.Object) seriesChangeEvent53);
        org.jfree.data.time.Day day55 = new org.jfree.data.time.Day();
        int int57 = day55.compareTo((java.lang.Object) (short) 100);
        java.lang.String str58 = day55.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem59 = timeSeries44.getDataItem((org.jfree.data.time.RegularTimePeriod) day55);
        timeSeries37.add(timeSeriesDataItem59);
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries29.addAndOrUpdate(timeSeries37);
        timeSeries61.fireSeriesChanged();
        boolean boolean63 = fixedMillisecond27.equals((java.lang.Object) timeSeries61);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod64 = fixedMillisecond27.previous();
        java.util.Calendar calendar65 = null;
        fixedMillisecond27.peg(calendar65);
        org.jfree.data.time.Year year68 = new org.jfree.data.time.Year(2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod69 = year68.previous();
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) fixedMillisecond27, (org.jfree.data.time.RegularTimePeriod) year68);
        java.lang.Object obj71 = timeSeries70.clone();
        java.util.Collection collection72 = timeSeries70.getTimePeriods();
        org.jfree.data.time.Day day73 = new org.jfree.data.time.Day();
        int int75 = day73.compareTo((java.lang.Object) (short) 100);
        java.util.Date date76 = day73.getEnd();
        org.jfree.data.time.Month month77 = new org.jfree.data.time.Month(date76);
        org.jfree.data.time.FixedMillisecond fixedMillisecond78 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod79 = fixedMillisecond78.next();
        java.util.Date date80 = fixedMillisecond78.getTime();
        long long81 = fixedMillisecond78.getLastMillisecond();
        int int82 = month77.compareTo((java.lang.Object) fixedMillisecond78);
        boolean boolean83 = timeSeries70.equals((java.lang.Object) fixedMillisecond78);
        long long84 = fixedMillisecond78.getMiddleMillisecond();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1-April-2024" + "'", str22, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 9223372036854775807L + "'", long40 == 9223372036854775807L);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(regularTimePeriod51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1-April-2024" + "'", str58, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem59);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod64);
        org.junit.Assert.assertNotNull(regularTimePeriod69);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Mon Apr 01 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod79);
        org.junit.Assert.assertNotNull(date80);
// flaky:         org.junit.Assert.assertEquals(date80.toString(), "Mon Apr 01 11:25:06 PDT 2024");
// flaky:         org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1711995906275L + "'", long81 == 1711995906275L);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1711995906275L + "'", long84 == 1711995906275L);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        java.lang.String str8 = day2.toString();
        long long9 = day2.getLastMillisecond();
        long long10 = day2.getSerialIndex();
        long long11 = day2.getFirstMillisecond();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Mon Apr 01 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1-April-2024" + "'", str8, "1-April-2024");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1712041199999L + "'", long9 == 1712041199999L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 45383L + "'", long10 == 45383L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1711954800000L + "'", long11 == 1711954800000L);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month1 = org.jfree.data.time.Month.parseMonth("org.jfree.data.event.SeriesChangeEvent[source=true]");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException; message: Can't evaluate the month.");
        } catch (org.jfree.data.time.TimePeriodFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        long long27 = timeSeries1.getMaximumItemAge();
        java.lang.Object obj28 = timeSeries1.clone();
        timeSeries1.setDomainDescription("");
        int int31 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj32 = null;
        boolean boolean33 = timeSeries1.equals(obj32);
        java.lang.Object obj34 = timeSeries1.clone();
        java.lang.Object obj35 = timeSeries1.clone();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1-April-2024" + "'", str22, "1-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
    }
}
