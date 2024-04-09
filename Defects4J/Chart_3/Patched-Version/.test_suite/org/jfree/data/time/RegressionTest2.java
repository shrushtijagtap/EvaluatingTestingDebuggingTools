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
        java.lang.Class class0 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        java.util.Date date7 = day3.getStart();
        long long8 = day3.getFirstMillisecond();
        java.util.Date date9 = day3.getEnd();
        org.jfree.data.time.Year year10 = new org.jfree.data.time.Year(date9);
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month(date9);
        java.util.TimeZone timeZone12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = org.jfree.data.time.RegularTimePeriod.createInstance(class0, date9, timeZone12);
        org.jfree.data.time.FixedMillisecond fixedMillisecond14 = new org.jfree.data.time.FixedMillisecond(date9);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        timeSeries16.add((org.jfree.data.time.RegularTimePeriod) day17, (double) (short) 0, false);
        timeSeries16.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        timeSeries24.add((org.jfree.data.time.RegularTimePeriod) day25, (double) (short) 0, false);
        java.util.Date date29 = day25.getStart();
        org.jfree.data.time.SerialDate serialDate30 = day25.getSerialDate();
        java.lang.Number number31 = null;
        timeSeries16.update((org.jfree.data.time.RegularTimePeriod) day25, number31);
        java.util.List list33 = timeSeries16.getItems();
        boolean boolean34 = fixedMillisecond14.equals((java.lang.Object) timeSeries16);
        java.lang.Object obj35 = null;
        boolean boolean36 = fixedMillisecond14.equals(obj35);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean39 = timeSeries38.isEmpty();
        long long40 = timeSeries38.getMaximumItemAge();
        timeSeries38.removeAgedItems(1711954800000L, false);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries45.removeChangeListener(seriesChangeListener46);
        java.lang.String str48 = timeSeries45.getRangeDescription();
        boolean boolean49 = timeSeries45.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries38.addAndOrUpdate(timeSeries45);
        int int51 = timeSeries45.getItemCount();
        int int52 = fixedMillisecond14.compareTo((java.lang.Object) int51);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1712386800000L + "'", long8 == 1712386800000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod13);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate30);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 9223372036854775807L + "'", long40 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Value" + "'", str48, "Value");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.Day day5 = new org.jfree.data.time.Day();
        java.lang.Number number6 = null;
        timeSeries3.add((org.jfree.data.time.RegularTimePeriod) day5, number6, false);
        int int9 = day5.getMonth();
        int int10 = day5.getYear();
        boolean boolean11 = year1.equals((java.lang.Object) day5);
        org.jfree.data.time.Month month12 = new org.jfree.data.time.Month(7, year1);
        java.util.Calendar calendar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            year1.peg(calendar13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2024 + "'", int10 == 2024);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        long long6 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        double double10 = timeSeries1.getMinY();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        timeSeries12.add((org.jfree.data.time.RegularTimePeriod) day13, (double) (short) 0, false);
        timeSeries12.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeries12.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent21 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean22 = timeSeries12.equals((java.lang.Object) seriesChangeEvent21);
        org.jfree.data.time.Day day23 = new org.jfree.data.time.Day();
        int int25 = day23.compareTo((java.lang.Object) (short) 100);
        java.lang.String str26 = day23.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries12.getDataItem((org.jfree.data.time.RegularTimePeriod) day23);
        java.lang.Number number28 = timeSeriesDataItem27.getValue();
        java.lang.Object obj29 = timeSeriesDataItem27.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = timeSeriesDataItem27.getPeriod();
        java.lang.Object obj31 = timeSeriesDataItem27.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem27);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 6-April-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "6-April-2024" + "'", str26, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem27);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 0.0d + "'", number28, 0.0d);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(regularTimePeriod30);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        long long6 = month4.getLastMillisecond();
        long long7 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year8 = month4.getYear();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month4);
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
        java.lang.Class<?> wildcardClass27 = day22.getClass();
        int int28 = month4.compareTo((java.lang.Object) day22);
        long long29 = month4.getLastMillisecond();
        long long30 = month4.getSerialIndex();
        java.lang.String str31 = month4.toString();
        long long32 = month4.getFirstMillisecond();
        java.util.Calendar calendar33 = null;
        // The following exception was thrown during execution in test generation
        try {
            month4.peg(calendar33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNotNull(year8);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "6-April-2024" + "'", str25, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1714546799999L + "'", long29 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 24292L + "'", long30 == 24292L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "April 2024" + "'", str31, "April 2024");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1711954800000L + "'", long32 == 1711954800000L);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        boolean boolean5 = timeSeries1.isEmpty();
        long long6 = timeSeries1.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent7 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        boolean boolean4 = timeSeries1.getNotify();
        java.lang.Object obj5 = timeSeries1.clone();
        int int6 = timeSeries1.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        int int9 = timeSeries1.getItemCount();
        timeSeries1.clear();
        timeSeries1.setMaximumItemAge(2024L);
        java.lang.Class class13 = timeSeries1.getTimePeriodClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        timeSeries19.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries19.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent28 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean29 = timeSeries19.equals((java.lang.Object) seriesChangeEvent28);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        int int32 = day30.compareTo((java.lang.Object) (short) 100);
        java.lang.String str33 = day30.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries19.getDataItem((org.jfree.data.time.RegularTimePeriod) day30);
        int int35 = day10.compareTo((java.lang.Object) day30);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Value");
        java.util.List list40 = timeSeries39.data;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double43 = timeSeries42.getMaxY();
        java.lang.Comparable comparable44 = timeSeries42.getKey();
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
        int int62 = day57.getDayOfMonth();
        java.lang.Number number63 = null;
        timeSeries42.add((org.jfree.data.time.RegularTimePeriod) day57, number63);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem65 = timeSeries39.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day57);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod66 = day57.next();
        long long67 = regularTimePeriod66.getSerialIndex();
        int int68 = day10.compareTo((java.lang.Object) regularTimePeriod66);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertNotNull(regularTimePeriod26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "6-April-2024" + "'", str33, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + 100L + "'", comparable44, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "6-April-2024" + "'", str60, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 6 + "'", int62 == 6);
        org.junit.Assert.assertNull(timeSeriesDataItem65);
        org.junit.Assert.assertNotNull(regularTimePeriod66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 45389L + "'", long67 == 45389L);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        int int17 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        long long22 = timeSeries19.getMaximumItemAge();
        org.jfree.data.time.Year year23 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.Day day27 = new org.jfree.data.time.Day();
        java.lang.Number number28 = null;
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day27, number28, false);
        int int31 = day27.getMonth();
        int int32 = day27.getYear();
        boolean boolean33 = year23.equals((java.lang.Object) day27);
        long long34 = year23.getSerialIndex();
        timeSeries19.delete((org.jfree.data.time.RegularTimePeriod) year23);
        java.util.Collection collection36 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double39 = timeSeries38.getMaxY();
        java.lang.Comparable comparable40 = timeSeries38.getKey();
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
        int int58 = day53.getDayOfMonth();
        java.lang.Number number59 = null;
        timeSeries38.add((org.jfree.data.time.RegularTimePeriod) day53, number59);
        java.lang.String str61 = day53.toString();
        org.jfree.data.time.SerialDate serialDate62 = day53.getSerialDate();
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day65 = new org.jfree.data.time.Day();
        timeSeries64.add((org.jfree.data.time.RegularTimePeriod) day65, (double) (short) 0, false);
        timeSeries64.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod71 = timeSeries64.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent73 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean74 = timeSeries64.equals((java.lang.Object) seriesChangeEvent73);
        org.jfree.data.time.Day day75 = new org.jfree.data.time.Day();
        int int77 = day75.compareTo((java.lang.Object) (short) 100);
        java.lang.String str78 = day75.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem79 = timeSeries64.getDataItem((org.jfree.data.time.RegularTimePeriod) day75);
        java.lang.Number number80 = timeSeriesDataItem79.getValue();
        java.lang.Object obj81 = timeSeriesDataItem79.clone();
        int int82 = day53.compareTo(obj81);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.update((org.jfree.data.time.RegularTimePeriod) day53, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: There is no existing value for the specified 'period'.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2024 + "'", int32 == 2024);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 2024L + "'", long34 == 2024L);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + 100L + "'", comparable40, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "6-April-2024" + "'", str56, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 6 + "'", int58 == 6);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "6-April-2024" + "'", str61, "6-April-2024");
        org.junit.Assert.assertNotNull(serialDate62);
        org.junit.Assert.assertNotNull(regularTimePeriod71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "6-April-2024" + "'", str78, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem79);
        org.junit.Assert.assertEquals("'" + number80 + "' != '" + 0.0d + "'", number80, 0.0d);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        boolean boolean5 = timeSeries1.isEmpty();
        long long6 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries8.removeChangeListener(seriesChangeListener9);
        java.lang.String str11 = timeSeries8.getRangeDescription();
        org.jfree.data.time.Month month12 = new org.jfree.data.time.Month();
        long long13 = month12.getFirstMillisecond();
        long long14 = month12.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = month12.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = month12.next();
        org.jfree.data.time.Year year18 = new org.jfree.data.time.Year((int) (short) -1);
        long long19 = year18.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year18, (java.lang.Number) 9223372036854775807L);
        long long22 = year18.getSerialIndex();
        java.util.Date date23 = year18.getEnd();
        int int24 = month12.compareTo((java.lang.Object) year18);
        int int25 = timeSeries8.getIndex((org.jfree.data.time.RegularTimePeriod) year18);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) year18);
        long long27 = year18.getFirstMillisecond();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711954800000L + "'", long13 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1714546799999L + "'", long14 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-62198899200000L) + "'", long19 == (-62198899200000L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Dec 31 23:59:59 PST 2");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(timeSeriesDataItem26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-62198899200000L) + "'", long27 == (-62198899200000L));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getLastMillisecond();
        long long3 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year4 = month0.getYear();
        long long5 = year4.getSerialIndex();
        long long6 = year4.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = year4.next();
        long long8 = regularTimePeriod7.getMiddleMillisecond();
        java.util.Date date9 = regularTimePeriod7.getStart();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714546799999L + "'", long2 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1711954800000L + "'", long3 == 1711954800000L);
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2024L + "'", long5 == 2024L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1704096000000L + "'", long6 == 1704096000000L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1751486399999L + "'", long8 == 1751486399999L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Jan 01 00:00:00 PST 2025");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        timeSeries1.setMaximumItemCount(100);
        org.jfree.data.time.Year year10 = new org.jfree.data.time.Year((int) (short) -1);
        long long11 = year10.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year10, (java.lang.Number) 9223372036854775807L);
        long long14 = year10.getSerialIndex();
        java.util.Date date15 = year10.getEnd();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) year10);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries1.addChangeListener(seriesChangeListener17);
        org.jfree.data.time.Month month20 = new org.jfree.data.time.Month();
        long long21 = month20.getFirstMillisecond();
        long long22 = month20.getLastMillisecond();
        long long23 = month20.getFirstMillisecond();
        org.jfree.data.time.Year year24 = month20.getYear();
        org.jfree.data.time.Month month25 = new org.jfree.data.time.Month(10, year24);
        long long26 = month25.getFirstMillisecond();
        org.jfree.data.time.Year year27 = month25.getYear();
        java.lang.Number number28 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) month25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = timeSeries1.getTimePeriod(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-62198899200000L) + "'", long11 == (-62198899200000L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Dec 31 23:59:59 PST 2");
        org.junit.Assert.assertNull(timeSeriesDataItem16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1711954800000L + "'", long21 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1714546799999L + "'", long22 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711954800000L + "'", long23 == 1711954800000L);
        org.junit.Assert.assertNotNull(year24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1727766000000L + "'", long26 == 1727766000000L);
        org.junit.Assert.assertNotNull(year27);
        org.junit.Assert.assertNull(number28);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        long long20 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month();
        long long22 = month21.getFirstMillisecond();
        long long23 = month21.getLastMillisecond();
        boolean boolean24 = timeSeries1.equals((java.lang.Object) month21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        long long29 = timeSeries26.getMaximumItemAge();
        java.lang.String str30 = timeSeries26.getDescription();
        double double31 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day34 = new org.jfree.data.time.Day();
        timeSeries33.add((org.jfree.data.time.RegularTimePeriod) day34, (double) (short) 0, false);
        timeSeries33.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = timeSeries33.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent42 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean43 = timeSeries33.equals((java.lang.Object) seriesChangeEvent42);
        org.jfree.data.time.Day day44 = new org.jfree.data.time.Day();
        int int46 = day44.compareTo((java.lang.Object) (short) 100);
        java.lang.String str47 = day44.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem48 = timeSeries33.getDataItem((org.jfree.data.time.RegularTimePeriod) day44);
        timeSeries26.add(timeSeriesDataItem48);
        java.util.List list50 = timeSeries26.getItems();
        int int51 = timeSeries26.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day54 = new org.jfree.data.time.Day();
        timeSeries53.add((org.jfree.data.time.RegularTimePeriod) day54, (double) (short) 0, false);
        timeSeries53.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = timeSeries53.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent62 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean63 = timeSeries53.equals((java.lang.Object) seriesChangeEvent62);
        org.jfree.data.time.Day day64 = new org.jfree.data.time.Day();
        int int66 = day64.compareTo((java.lang.Object) (short) 100);
        java.lang.String str67 = day64.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem68 = timeSeries53.getDataItem((org.jfree.data.time.RegularTimePeriod) day64);
        java.lang.Class<?> wildcardClass69 = day64.getClass();
        timeSeries26.timePeriodClass = wildcardClass69;
        timeSeries26.removeAgedItems(true);
        java.util.Collection collection73 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries26.setMaximumItemCount(9999);
        java.lang.Comparable comparable76 = timeSeries26.getKey();
        int int77 = timeSeries26.getItemCount();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1711954800000L + "'", long22 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1714546799999L + "'", long23 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(regularTimePeriod40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "6-April-2024" + "'", str47, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem48);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "6-April-2024" + "'", str67, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertEquals("'" + comparable76 + "' != '" + (short) 100 + "'", comparable76, (short) 100);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
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
        timeSeries1.setDescription("");
        timeSeries1.setDescription("6-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries30.addChangeListener(seriesChangeListener31);
        org.jfree.data.time.Month month33 = new org.jfree.data.time.Month();
        long long34 = month33.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries36.removeChangeListener(seriesChangeListener37);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day41 = new org.jfree.data.time.Day();
        timeSeries40.add((org.jfree.data.time.RegularTimePeriod) day41, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem46 = timeSeries36.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day41, (java.lang.Number) 10L);
        long long47 = day41.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries30.createCopy((org.jfree.data.time.RegularTimePeriod) month33, (org.jfree.data.time.RegularTimePeriod) day41);
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries50.removeChangeListener(seriesChangeListener51);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day55 = new org.jfree.data.time.Day();
        timeSeries54.add((org.jfree.data.time.RegularTimePeriod) day55, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem60 = timeSeries50.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day55, (java.lang.Number) 10L);
        long long61 = day55.getMiddleMillisecond();
        timeSeries30.setKey((java.lang.Comparable) long61);
        java.lang.String str63 = timeSeries30.getDomainDescription();
        java.util.List list64 = timeSeries30.getItems();
        double double65 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries1.addAndOrUpdate(timeSeries30);
        boolean boolean68 = timeSeries66.equals((java.lang.Object) true);
        double double69 = timeSeries66.getMinY();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1711954800000L + "'", long34 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1712429999999L + "'", long47 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNull(timeSeriesDataItem60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1712429999999L + "'", long61 == 1712429999999L);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Time" + "'", str63, "Time");
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Year year5 = new org.jfree.data.time.Year((int) (short) -1);
        long long6 = year5.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year5, (java.lang.Number) 9223372036854775807L);
        timeSeries3.add((org.jfree.data.time.RegularTimePeriod) year5, 0.0d);
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month((int) (byte) 10, year5);
        org.jfree.data.time.Month month12 = new org.jfree.data.time.Month((int) (byte) 1, year5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-62198899200000L) + "'", long6 == (-62198899200000L));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        timeSeries1.setDescription("6-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries1.addAndOrUpdate(timeSeries30);
        double double38 = timeSeries37.getMinY();
        timeSeries37.clear();
        double double40 = timeSeries37.getMinY();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Date date8 = day2.getEnd();
        org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date8);
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = month10.previous();
        long long12 = month10.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = month10.next();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712386800000L + "'", long7 == 1712386800000L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 24292L + "'", long12 == 24292L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getLastMillisecond();
        long long3 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year4 = month0.getYear();
        org.jfree.data.time.Month month6 = new org.jfree.data.time.Month();
        long long7 = month6.getFirstMillisecond();
        long long8 = month6.getLastMillisecond();
        long long9 = month6.getFirstMillisecond();
        org.jfree.data.time.Year year10 = month6.getYear();
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month(10, year10);
        boolean boolean12 = year4.equals((java.lang.Object) 10);
        java.lang.String str13 = year4.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = year4.next();
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = year4.getFirstMillisecond(calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714546799999L + "'", long2 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1711954800000L + "'", long3 == 1711954800000L);
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1714546799999L + "'", long8 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711954800000L + "'", long9 == 1711954800000L);
        org.junit.Assert.assertNotNull(year10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2024" + "'", str13, "2024");
        org.junit.Assert.assertNotNull(regularTimePeriod14);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        java.lang.String str34 = timeSeries1.getDomainDescription();
        java.util.List list35 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day38 = new org.jfree.data.time.Day();
        timeSeries37.add((org.jfree.data.time.RegularTimePeriod) day38, (double) (short) 0, false);
        timeSeries37.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = timeSeries37.getNextTimePeriod();
        long long45 = regularTimePeriod44.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries1.addOrUpdate(regularTimePeriod44, (java.lang.Number) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = timeSeries1.getNextTimePeriod();
        int int49 = timeSeries1.getItemCount();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent50 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712429999999L + "'", long32 == 1712429999999L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Time" + "'", str34, "Time");
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(regularTimePeriod44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 45389L + "'", long45 == 45389L);
        org.junit.Assert.assertNull(timeSeriesDataItem47);
        org.junit.Assert.assertNotNull(regularTimePeriod48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = month0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = month0.next();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = month0.getLastMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714546799999L + "'", long2 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        int int6 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries8.addChangeListener(seriesChangeListener9);
        long long11 = timeSeries8.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        long long18 = timeSeries15.getMaximumItemAge();
        java.lang.String str19 = timeSeries15.getDescription();
        double double20 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day23 = new org.jfree.data.time.Day();
        timeSeries22.add((org.jfree.data.time.RegularTimePeriod) day23, (double) (short) 0, false);
        timeSeries22.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = timeSeries22.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent31 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean32 = timeSeries22.equals((java.lang.Object) seriesChangeEvent31);
        org.jfree.data.time.Day day33 = new org.jfree.data.time.Day();
        int int35 = day33.compareTo((java.lang.Object) (short) 100);
        java.lang.String str36 = day33.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries22.getDataItem((org.jfree.data.time.RegularTimePeriod) day33);
        timeSeries15.add(timeSeriesDataItem37);
        timeSeries8.add(timeSeriesDataItem37, false);
        timeSeriesDataItem37.setValue((java.lang.Number) 0);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list45 = timeSeries44.data;
        int int46 = timeSeries44.getItemCount();
        org.jfree.data.time.Month month47 = new org.jfree.data.time.Month();
        long long48 = month47.getFirstMillisecond();
        long long49 = month47.getLastMillisecond();
        long long50 = month47.getFirstMillisecond();
        org.jfree.data.time.Year year51 = month47.getYear();
        timeSeries44.delete((org.jfree.data.time.RegularTimePeriod) month47);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list55 = timeSeries54.data;
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
        boolean boolean73 = timeSeriesDataItem72.isSelected();
        int int75 = timeSeriesDataItem72.compareTo((java.lang.Object) 2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem76 = timeSeries54.addOrUpdate(timeSeriesDataItem72);
        org.jfree.data.time.TimeSeries timeSeries77 = timeSeries44.addAndOrUpdate(timeSeries54);
        org.jfree.data.time.Year year78 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries80 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double81 = timeSeries80.getMaxY();
        org.jfree.data.time.Day day82 = new org.jfree.data.time.Day();
        java.lang.Number number83 = null;
        timeSeries80.add((org.jfree.data.time.RegularTimePeriod) day82, number83, false);
        int int86 = day82.getMonth();
        int int87 = day82.getYear();
        boolean boolean88 = year78.equals((java.lang.Object) day82);
        long long89 = year78.getSerialIndex();
        long long90 = year78.getLastMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem91 = timeSeries44.getDataItem((org.jfree.data.time.RegularTimePeriod) year78);
        org.jfree.data.time.TimeSeries timeSeries92 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) timeSeriesDataItem91);
        boolean boolean93 = timeSeriesDataItem37.equals((java.lang.Object) timeSeriesDataItem91);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem94 = timeSeries1.addOrUpdate(timeSeriesDataItem91);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(regularTimePeriod29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "6-April-2024" + "'", str36, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem37);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1711954800000L + "'", long48 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1714546799999L + "'", long49 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1711954800000L + "'", long50 == 1711954800000L);
        org.junit.Assert.assertNotNull(year51);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(regularTimePeriod64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "6-April-2024" + "'", str71, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem76);
        org.junit.Assert.assertNotNull(timeSeries77);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 4 + "'", int86 == 4);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2024 + "'", int87 == 2024);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 2024L + "'", long89 == 2024L);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1735718399999L + "'", long90 == 1735718399999L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(timeSeriesDataItem94);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        java.lang.Number number17 = timeSeriesDataItem16.getValue();
        java.lang.Object obj18 = timeSeriesDataItem16.clone();
        java.lang.Number number19 = timeSeriesDataItem16.getValue();
        timeSeriesDataItem16.setValue((java.lang.Number) 10.0f);
        java.lang.Number number22 = timeSeriesDataItem16.getValue();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 0.0d + "'", number17, 0.0d);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 0.0d + "'", number19, 0.0d);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 10.0f + "'", number22, 10.0f);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        timeSeries1.clear();
        java.lang.String str4 = timeSeries1.getDomainDescription();
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
        long long25 = month9.getFirstMillisecond();
        org.jfree.data.time.Year year26 = month9.getYear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((org.jfree.data.time.RegularTimePeriod) year26, (java.lang.Number) 1712559599999L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: There is no existing value for the specified 'period'.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711954800000L + "'", long10 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1712429999999L + "'", long23 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1711954800000L + "'", long25 == 1711954800000L);
        org.junit.Assert.assertNotNull(year26);
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
        timeSeries1.setDescription("");
        timeSeries1.setDescription("6-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries1.addAndOrUpdate(timeSeries30);
        double double38 = timeSeries1.getMinY();
        timeSeries1.setMaximumItemCount((int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener41);
        java.lang.String str43 = timeSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "6-April-2024" + "'", str43, "6-April-2024");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        java.util.List list18 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries20.removeChangeListener(seriesChangeListener21);
        java.lang.String str23 = timeSeries20.getRangeDescription();
        java.util.List list24 = timeSeries20.getItems();
        java.util.List list25 = timeSeries20.data;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        timeSeries27.add((org.jfree.data.time.RegularTimePeriod) day28, (double) (short) 0, false);
        timeSeries27.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = timeSeries27.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent36 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean37 = timeSeries27.equals((java.lang.Object) seriesChangeEvent36);
        org.jfree.data.time.Day day38 = new org.jfree.data.time.Day();
        int int40 = day38.compareTo((java.lang.Object) (short) 100);
        java.lang.String str41 = day38.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries27.getDataItem((org.jfree.data.time.RegularTimePeriod) day38);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = day38.previous();
        java.util.Date date44 = regularTimePeriod43.getStart();
        org.jfree.data.time.Month month45 = new org.jfree.data.time.Month(date44);
        org.jfree.data.time.FixedMillisecond fixedMillisecond46 = new org.jfree.data.time.FixedMillisecond(date44);
        org.jfree.data.time.Day day47 = new org.jfree.data.time.Day();
        int int49 = day47.compareTo((java.lang.Object) (short) 100);
        java.lang.String str50 = day47.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = day47.next();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day47, "Time", "Value");
        boolean boolean55 = fixedMillisecond46.equals((java.lang.Object) day47);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem57 = timeSeries20.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day47, (java.lang.Number) (byte) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod58 = day47.next();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem60 = timeSeries1.addOrUpdate(regularTimePeriod58, (double) 1712440598296L);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(regularTimePeriod34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "6-April-2024" + "'", str41, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem42);
        org.junit.Assert.assertNotNull(regularTimePeriod43);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "6-April-2024" + "'", str50, "6-April-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(timeSeriesDataItem57);
        org.junit.Assert.assertNotNull(regularTimePeriod58);
        org.junit.Assert.assertNull(timeSeriesDataItem60);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        java.lang.String str1 = year0.toString();
        long long2 = year0.getLastMillisecond();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2024" + "'", str1, "2024");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1735718399999L + "'", long2 == 1735718399999L);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day4 = new org.jfree.data.time.Day();
        timeSeries3.add((org.jfree.data.time.RegularTimePeriod) day4, (double) (short) 0, false);
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries3.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent12 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean13 = timeSeries3.equals((java.lang.Object) seriesChangeEvent12);
        org.jfree.data.time.Day day14 = new org.jfree.data.time.Day();
        int int16 = day14.compareTo((java.lang.Object) (short) 100);
        java.lang.String str17 = day14.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries3.getDataItem((org.jfree.data.time.RegularTimePeriod) day14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = day14.previous();
        java.util.Date date20 = regularTimePeriod19.getStart();
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month(date20);
        org.jfree.data.time.FixedMillisecond fixedMillisecond22 = new org.jfree.data.time.FixedMillisecond(date20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = fixedMillisecond22.previous();
        long long24 = fixedMillisecond22.getMiddleMillisecond();
        java.util.Calendar calendar25 = null;
        long long26 = fixedMillisecond22.getLastMillisecond(calendar25);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) fixedMillisecond22, (double) (byte) 1);
        java.lang.String str29 = timeSeries1.getDescription();
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "6-April-2024" + "'", str17, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem18);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1712300400000L + "'", long24 == 1712300400000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1712300400000L + "'", long26 == 1712300400000L);
        org.junit.Assert.assertNull(timeSeriesDataItem28);
        org.junit.Assert.assertNull(str29);
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = day12.previous();
        java.util.Calendar calendar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            regularTimePeriod17.peg(calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.lang.Class class0 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        java.util.Date date7 = day3.getStart();
        long long8 = day3.getFirstMillisecond();
        java.util.Date date9 = day3.getEnd();
        org.jfree.data.time.Year year10 = new org.jfree.data.time.Year(date9);
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month(date9);
        java.util.TimeZone timeZone12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = org.jfree.data.time.RegularTimePeriod.createInstance(class0, date9, timeZone12);
        org.jfree.data.time.FixedMillisecond fixedMillisecond14 = new org.jfree.data.time.FixedMillisecond(date9);
        java.util.Calendar calendar15 = null;
        long long16 = fixedMillisecond14.getMiddleMillisecond(calendar15);
        long long17 = fixedMillisecond14.getSerialIndex();
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1712386800000L + "'", long8 == 1712386800000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1712473199999L + "'", long16 == 1712473199999L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1712473199999L + "'", long17 == 1712473199999L);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Value");
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        timeSeries12.add((org.jfree.data.time.RegularTimePeriod) day13, (double) (short) 0, false);
        java.util.Date date17 = day13.getStart();
        long long18 = day13.getFirstMillisecond();
        java.util.Date date19 = day13.getEnd();
        org.jfree.data.time.Year year20 = new org.jfree.data.time.Year(date19);
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month(date19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = month21.previous();
        timeSeries10.add(regularTimePeriod22, (double) '4', true);
        int int26 = timeSeries1.getIndex(regularTimePeriod22);
        boolean boolean27 = timeSeries1.getNotify();
        java.lang.Object obj28 = timeSeries1.clone();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712386800000L + "'", long18 == 1712386800000L);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        long long20 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month();
        long long22 = month21.getFirstMillisecond();
        long long23 = month21.getLastMillisecond();
        boolean boolean24 = timeSeries1.equals((java.lang.Object) month21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        long long29 = timeSeries26.getMaximumItemAge();
        java.lang.String str30 = timeSeries26.getDescription();
        double double31 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day34 = new org.jfree.data.time.Day();
        timeSeries33.add((org.jfree.data.time.RegularTimePeriod) day34, (double) (short) 0, false);
        timeSeries33.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = timeSeries33.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent42 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean43 = timeSeries33.equals((java.lang.Object) seriesChangeEvent42);
        org.jfree.data.time.Day day44 = new org.jfree.data.time.Day();
        int int46 = day44.compareTo((java.lang.Object) (short) 100);
        java.lang.String str47 = day44.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem48 = timeSeries33.getDataItem((org.jfree.data.time.RegularTimePeriod) day44);
        timeSeries26.add(timeSeriesDataItem48);
        java.util.List list50 = timeSeries26.getItems();
        int int51 = timeSeries26.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day54 = new org.jfree.data.time.Day();
        timeSeries53.add((org.jfree.data.time.RegularTimePeriod) day54, (double) (short) 0, false);
        timeSeries53.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = timeSeries53.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent62 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean63 = timeSeries53.equals((java.lang.Object) seriesChangeEvent62);
        org.jfree.data.time.Day day64 = new org.jfree.data.time.Day();
        int int66 = day64.compareTo((java.lang.Object) (short) 100);
        java.lang.String str67 = day64.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem68 = timeSeries53.getDataItem((org.jfree.data.time.RegularTimePeriod) day64);
        java.lang.Class<?> wildcardClass69 = day64.getClass();
        timeSeries26.timePeriodClass = wildcardClass69;
        timeSeries26.removeAgedItems(true);
        java.util.Collection collection73 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries26.setMaximumItemCount(9999);
        long long76 = timeSeries26.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean79 = timeSeries78.isEmpty();
        timeSeries78.clear();
        java.util.List list81 = timeSeries78.getItems();
        org.jfree.data.time.Day day82 = new org.jfree.data.time.Day();
        int int84 = day82.compareTo((java.lang.Object) (short) 100);
        java.util.Date date85 = day82.getEnd();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem87 = timeSeries78.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day82, (java.lang.Number) 0.0f);
        org.jfree.data.time.TimeSeries timeSeries88 = timeSeries26.addAndOrUpdate(timeSeries78);
        java.lang.Object obj89 = timeSeries26.clone();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo90 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent91 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries26, seriesChangeInfo90);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1711954800000L + "'", long22 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1714546799999L + "'", long23 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(regularTimePeriod40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "6-April-2024" + "'", str47, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem48);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "6-April-2024" + "'", str67, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 9223372036854775807L + "'", long76 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNull(timeSeriesDataItem87);
        org.junit.Assert.assertNotNull(timeSeries88);
        org.junit.Assert.assertNotNull(obj89);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.lang.Class class0 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        java.util.Date date7 = day3.getStart();
        long long8 = day3.getFirstMillisecond();
        java.util.Date date9 = day3.getEnd();
        org.jfree.data.time.Year year10 = new org.jfree.data.time.Year(date9);
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month(date9);
        java.util.TimeZone timeZone12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = org.jfree.data.time.RegularTimePeriod.createInstance(class0, date9, timeZone12);
        org.jfree.data.time.Year year14 = new org.jfree.data.time.Year(date9);
        java.util.Date date15 = year14.getEnd();
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1712386800000L + "'", long8 == 1712386800000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod13);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Dec 31 23:59:59 PST 2024");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        long long20 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month();
        long long22 = month21.getFirstMillisecond();
        long long23 = month21.getLastMillisecond();
        boolean boolean24 = timeSeries1.equals((java.lang.Object) month21);
        java.lang.Object obj25 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries27.addChangeListener(seriesChangeListener28);
        long long30 = timeSeries27.getMaximumItemAge();
        java.lang.String str31 = timeSeries27.getDescription();
        double double32 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day35 = new org.jfree.data.time.Day();
        timeSeries34.add((org.jfree.data.time.RegularTimePeriod) day35, (double) (short) 0, false);
        timeSeries34.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = timeSeries34.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent43 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean44 = timeSeries34.equals((java.lang.Object) seriesChangeEvent43);
        org.jfree.data.time.Day day45 = new org.jfree.data.time.Day();
        int int47 = day45.compareTo((java.lang.Object) (short) 100);
        java.lang.String str48 = day45.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = timeSeries34.getDataItem((org.jfree.data.time.RegularTimePeriod) day45);
        timeSeries27.add(timeSeriesDataItem49);
        java.util.List list51 = timeSeries27.getItems();
        timeSeries1.data = list51;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day55 = new org.jfree.data.time.Day();
        timeSeries54.add((org.jfree.data.time.RegularTimePeriod) day55, (double) (short) 0, false);
        java.util.Date date59 = day55.getStart();
        long long60 = day55.getFirstMillisecond();
        org.jfree.data.time.SerialDate serialDate61 = day55.getSerialDate();
        org.jfree.data.time.Day day62 = new org.jfree.data.time.Day(serialDate61);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem63 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day62);
        int int64 = timeSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1711954800000L + "'", long22 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1714546799999L + "'", long23 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(regularTimePeriod41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "6-April-2024" + "'", str48, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem49);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1712386800000L + "'", long60 == 1712386800000L);
        org.junit.Assert.assertNotNull(serialDate61);
        org.junit.Assert.assertNotNull(timeSeriesDataItem63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
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
        int int7 = day3.getMonth();
        int int8 = day3.getYear();
        long long9 = day3.getFirstMillisecond();
        long long10 = day3.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = day3.previous();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2024 + "'", int8 == 2024);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1712386800000L + "'", long9 == 1712386800000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 45388L + "'", long10 == 45388L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        java.util.Date date7 = day3.getStart();
        long long8 = day3.getFirstMillisecond();
        java.util.Date date9 = day3.getEnd();
        org.jfree.data.time.Year year10 = new org.jfree.data.time.Year(date9);
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month(10, year10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = month11.previous();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) month11);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1712386800000L + "'", long8 == 1712386800000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getLastMillisecond();
        long long3 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year4 = month0.getYear();
        org.jfree.data.time.Month month6 = new org.jfree.data.time.Month();
        long long7 = month6.getFirstMillisecond();
        long long8 = month6.getLastMillisecond();
        long long9 = month6.getFirstMillisecond();
        org.jfree.data.time.Year year10 = month6.getYear();
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month(10, year10);
        boolean boolean12 = year4.equals((java.lang.Object) 10);
        java.lang.String str13 = year4.toString();
        long long14 = year4.getLastMillisecond();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714546799999L + "'", long2 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1711954800000L + "'", long3 == 1711954800000L);
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1714546799999L + "'", long8 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711954800000L + "'", long9 == 1711954800000L);
        org.junit.Assert.assertNotNull(year10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2024" + "'", str13, "2024");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1735718399999L + "'", long14 == 1735718399999L);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        java.util.Date date18 = regularTimePeriod17.getStart();
        org.jfree.data.time.Month month19 = new org.jfree.data.time.Month(date18);
        org.jfree.data.time.FixedMillisecond fixedMillisecond20 = new org.jfree.data.time.FixedMillisecond(date18);
        java.util.Calendar calendar21 = null;
        fixedMillisecond20.peg(calendar21);
        java.util.Calendar calendar23 = null;
        fixedMillisecond20.peg(calendar23);
        long long25 = fixedMillisecond20.getFirstMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1712300400000L + "'", long25 == 1712300400000L);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jfree.data.time.Month month1 = org.jfree.data.time.Month.parseMonth("April 2024");
        java.lang.String str2 = month1.toString();
        long long3 = month1.getLastMillisecond();
        org.jfree.data.time.Year year4 = month1.getYear();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double7 = timeSeries6.getMaxY();
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        java.lang.Number number9 = null;
        timeSeries6.add((org.jfree.data.time.RegularTimePeriod) day8, number9, false);
        boolean boolean12 = year4.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(month1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "April 2024" + "'", str2, "April 2024");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1714546799999L + "'", long3 == 1714546799999L);
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        boolean boolean25 = timeSeries1.getNotify();
        org.jfree.data.time.Month month28 = new org.jfree.data.time.Month(3, 0);
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) month28, (java.lang.Number) 1711954800000L);
        java.util.Date date31 = month28.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = month28.previous();
        java.util.Calendar calendar33 = null;
        // The following exception was thrown during execution in test generation
        try {
            month28.peg(calendar33);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 31 23:59:59 PST 1");
        org.junit.Assert.assertNotNull(regularTimePeriod32);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        int int8 = day2.getYear();
        long long9 = day2.getLastMillisecond();
        org.jfree.data.time.SerialDate serialDate10 = day2.getSerialDate();
        org.jfree.data.time.Day day11 = new org.jfree.data.time.Day(serialDate10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day(serialDate10);
        long long13 = day12.getSerialIndex();
        org.jfree.data.time.FixedMillisecond fixedMillisecond15 = new org.jfree.data.time.FixedMillisecond(1714546799999L);
        long long16 = fixedMillisecond15.getLastMillisecond();
        java.util.Calendar calendar17 = null;
        long long18 = fixedMillisecond15.getFirstMillisecond(calendar17);
        java.util.Date date19 = fixedMillisecond15.getEnd();
        boolean boolean20 = day12.equals((java.lang.Object) fixedMillisecond15);
        java.util.Date date21 = fixedMillisecond15.getTime();
        long long22 = fixedMillisecond15.getMiddleMillisecond();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2024 + "'", int8 == 2024);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1712473199999L + "'", long9 == 1712473199999L);
        org.junit.Assert.assertNotNull(serialDate10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 45388L + "'", long13 == 45388L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1714546799999L + "'", long16 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1714546799999L + "'", long18 == 1714546799999L);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Tue Apr 30 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Apr 30 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1714546799999L + "'", long22 == 1714546799999L);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Date date8 = day2.getEnd();
        org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date8);
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = month10.previous();
        java.lang.String str12 = month10.toString();
        long long13 = month10.getLastMillisecond();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712386800000L + "'", long7 == 1712386800000L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "April 2024" + "'", str12, "April 2024");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1714546799999L + "'", long13 == 1714546799999L);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jfree.data.time.Year year2 = new org.jfree.data.time.Year((int) (short) -1);
        long long3 = year2.getFirstMillisecond();
        boolean boolean5 = year2.equals((java.lang.Object) (-1.0d));
        org.jfree.data.time.Month month6 = new org.jfree.data.time.Month(2, year2);
        java.lang.String str7 = month6.toString();
        long long8 = month6.getSerialIndex();
        org.jfree.data.time.Year year10 = new org.jfree.data.time.Year((int) (short) -1);
        long long11 = year10.getFirstMillisecond();
        java.util.Date date12 = year10.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = year10.previous();
        int int14 = month6.compareTo((java.lang.Object) regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-62198899200000L) + "'", long3 == (-62198899200000L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "February -1" + "'", str7, "February -1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-10L) + "'", long8 == (-10L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-62198899200000L) + "'", long11 == (-62198899200000L));
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Dec 31 23:59:59 PST 2");
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
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
        timeSeries1.add(timeSeriesDataItem30, false);
        boolean boolean34 = timeSeriesDataItem30.isSelected();
        timeSeriesDataItem30.setSelected(true);
        java.lang.Number number37 = timeSeriesDataItem30.getValue();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "6-April-2024" + "'", str29, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + number37 + "' != '" + 0.0d + "'", number37, 0.0d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(1711954800000L, false);
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
        timeSeries8.setKey((java.lang.Comparable) 45388L);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list31 = timeSeries30.data;
        int int32 = timeSeries30.getItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries30.addChangeListener(seriesChangeListener33);
        timeSeries30.clear();
        org.jfree.data.time.Month month36 = new org.jfree.data.time.Month();
        long long37 = month36.getFirstMillisecond();
        long long38 = month36.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = month36.previous();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = timeSeries30.addOrUpdate((org.jfree.data.time.RegularTimePeriod) month36, (double) 24292L);
        java.lang.Number number42 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries8.addOrUpdate((org.jfree.data.time.RegularTimePeriod) month36, number42);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries1.addAndOrUpdate(timeSeries8);
        timeSeries1.removeAgedItems(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711954800000L + "'", long12 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1712429999999L + "'", long25 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1711954800000L + "'", long37 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1714546799999L + "'", long38 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod39);
        org.junit.Assert.assertNull(timeSeriesDataItem41);
        org.junit.Assert.assertNull(timeSeriesDataItem43);
        org.junit.Assert.assertNotNull(timeSeries44);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        timeSeries1.setDescription("6-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries1.addAndOrUpdate(timeSeries30);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener38);
        int int40 = timeSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        timeSeries19.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries19.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent28 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean29 = timeSeries19.equals((java.lang.Object) seriesChangeEvent28);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        int int32 = day30.compareTo((java.lang.Object) (short) 100);
        java.lang.String str33 = day30.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries19.getDataItem((org.jfree.data.time.RegularTimePeriod) day30);
        int int35 = day10.compareTo((java.lang.Object) day30);
        org.jfree.data.time.SerialDate serialDate36 = day10.getSerialDate();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = day10.next();
        java.lang.String str38 = day10.toString();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertNotNull(regularTimePeriod26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "6-April-2024" + "'", str33, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(serialDate36);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "6-April-2024" + "'", str38, "6-April-2024");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        int int2 = timeSeries1.getItemCount();
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        double double34 = timeSeries1.getMinY();
        java.util.List list35 = timeSeries1.data;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712429999999L + "'", long32 == 1712429999999L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day7 = new org.jfree.data.time.Day();
        timeSeries6.add((org.jfree.data.time.RegularTimePeriod) day7, (double) (short) 0, false);
        timeSeries6.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries6.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent15 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean16 = timeSeries6.equals((java.lang.Object) seriesChangeEvent15);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        int int19 = day17.compareTo((java.lang.Object) (short) 100);
        java.lang.String str20 = day17.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries6.getDataItem((org.jfree.data.time.RegularTimePeriod) day17);
        int int22 = day17.getDayOfMonth();
        java.lang.Number number23 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) day17);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries1.createCopy(0, 0);
        java.lang.Comparable comparable27 = timeSeries26.getKey();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "6-April-2024" + "'", str20, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNull(number23);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + 100L + "'", comparable27, 100L);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond(1714546799999L);
        long long2 = fixedMillisecond1.getLastMillisecond();
        java.util.Calendar calendar3 = null;
        fixedMillisecond1.peg(calendar3);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = fixedMillisecond1.previous();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714546799999L + "'", long2 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries1.addChangeListener(seriesChangeListener34);
        timeSeries1.setDomainDescription("-1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712429999999L + "'", long32 == 1712429999999L);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        long long6 = month4.getLastMillisecond();
        long long7 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year8 = month4.getYear();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month4);
        long long10 = month4.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = month4.previous();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month4, (java.lang.Number) 4);
        int int14 = month4.getMonth();
        long long15 = month4.getSerialIndex();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNotNull(year8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 24292L + "'", long10 == 24292L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 24292L + "'", long15 == 24292L);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month0, (java.lang.Number) (short) 100);
        java.lang.String str3 = month0.toString();
        org.jfree.data.time.Year year4 = month0.getYear();
        long long5 = month0.getFirstMillisecond();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "April 2024" + "'", str3, "April 2024");
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        long long6 = month4.getLastMillisecond();
        long long7 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year8 = month4.getYear();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month4);
        long long10 = month4.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = month4.previous();
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = month4.getLastMillisecond(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNotNull(year8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 24292L + "'", long10 == 24292L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
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
        long long20 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month();
        long long22 = month21.getFirstMillisecond();
        long long23 = month21.getLastMillisecond();
        boolean boolean24 = timeSeries1.equals((java.lang.Object) month21);
        java.lang.Object obj25 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries27.addChangeListener(seriesChangeListener28);
        long long30 = timeSeries27.getMaximumItemAge();
        java.lang.String str31 = timeSeries27.getDescription();
        double double32 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day35 = new org.jfree.data.time.Day();
        timeSeries34.add((org.jfree.data.time.RegularTimePeriod) day35, (double) (short) 0, false);
        timeSeries34.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = timeSeries34.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent43 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean44 = timeSeries34.equals((java.lang.Object) seriesChangeEvent43);
        org.jfree.data.time.Day day45 = new org.jfree.data.time.Day();
        int int47 = day45.compareTo((java.lang.Object) (short) 100);
        java.lang.String str48 = day45.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = timeSeries34.getDataItem((org.jfree.data.time.RegularTimePeriod) day45);
        timeSeries27.add(timeSeriesDataItem49);
        java.util.List list51 = timeSeries27.getItems();
        timeSeries1.data = list51;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day55 = new org.jfree.data.time.Day();
        timeSeries54.add((org.jfree.data.time.RegularTimePeriod) day55, (double) (short) 0, false);
        java.util.Date date59 = day55.getStart();
        long long60 = day55.getFirstMillisecond();
        org.jfree.data.time.SerialDate serialDate61 = day55.getSerialDate();
        org.jfree.data.time.Day day62 = new org.jfree.data.time.Day(serialDate61);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem63 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day62);
        long long64 = day62.getSerialIndex();
        java.util.Date date65 = day62.getEnd();
        org.jfree.data.time.Month month66 = new org.jfree.data.time.Month(date65);
        org.jfree.data.time.Day day67 = new org.jfree.data.time.Day(date65);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1711954800000L + "'", long22 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1714546799999L + "'", long23 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(regularTimePeriod41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "6-April-2024" + "'", str48, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem49);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1712386800000L + "'", long60 == 1712386800000L);
        org.junit.Assert.assertNotNull(serialDate61);
        org.junit.Assert.assertNotNull(timeSeriesDataItem63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 45388L + "'", long64 == 45388L);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Sat Apr 06 23:59:59 PDT 2024");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        int int7 = day3.getMonth();
        int int8 = day3.getYear();
        org.jfree.data.time.SerialDate serialDate9 = day3.getSerialDate();
        org.jfree.data.time.FixedMillisecond fixedMillisecond11 = new org.jfree.data.time.FixedMillisecond(1714546799999L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = fixedMillisecond11.previous();
        java.util.Calendar calendar13 = null;
        long long14 = fixedMillisecond11.getLastMillisecond(calendar13);
        java.util.Calendar calendar15 = null;
        long long16 = fixedMillisecond11.getFirstMillisecond(calendar15);
        int int17 = day3.compareTo((java.lang.Object) fixedMillisecond11);
        long long18 = day3.getSerialIndex();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2024 + "'", int8 == 2024);
        org.junit.Assert.assertNotNull(serialDate9);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1714546799999L + "'", long14 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1714546799999L + "'", long16 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 45388L + "'", long18 == 45388L);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        java.util.List list18 = timeSeries1.data;
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = day31.next();
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException38 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException40 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException38.addSuppressed((java.lang.Throwable) timePeriodFormatException40);
        boolean boolean42 = day31.equals((java.lang.Object) timePeriodFormatException38);
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day31, (java.lang.Number) 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(regularTimePeriod27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "6-April-2024" + "'", str34, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem35);
        org.junit.Assert.assertNotNull(regularTimePeriod36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        timeSeries19.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day24 = new org.jfree.data.time.Day();
        timeSeries23.add((org.jfree.data.time.RegularTimePeriod) day24, (double) (short) 0, false);
        timeSeries23.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = timeSeries23.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent32 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean33 = timeSeries23.equals((java.lang.Object) seriesChangeEvent32);
        org.jfree.data.time.Day day34 = new org.jfree.data.time.Day();
        int int36 = day34.compareTo((java.lang.Object) (short) 100);
        java.lang.String str37 = day34.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = timeSeries23.getDataItem((org.jfree.data.time.RegularTimePeriod) day34);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = day34.previous();
        java.util.Date date40 = regularTimePeriod39.getStart();
        org.jfree.data.time.Month month41 = new org.jfree.data.time.Month(date40);
        org.jfree.data.time.FixedMillisecond fixedMillisecond42 = new org.jfree.data.time.FixedMillisecond(date40);
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) fixedMillisecond42, (double) 11);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day47 = new org.jfree.data.time.Day();
        timeSeries46.add((org.jfree.data.time.RegularTimePeriod) day47, (double) (short) 0, false);
        java.util.Date date51 = day47.getStart();
        long long52 = day47.getFirstMillisecond();
        java.util.Date date53 = day47.getEnd();
        org.jfree.data.time.Year year54 = new org.jfree.data.time.Year(date53);
        org.jfree.data.time.Month month55 = new org.jfree.data.time.Month(date53);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod56 = month55.previous();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem58 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month55, (java.lang.Number) (-9999));
        timeSeries19.setKey((java.lang.Comparable) (-9999));
        boolean boolean60 = timeSeries19.isEmpty();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(regularTimePeriod30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "6-April-2024" + "'", str37, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem38);
        org.junit.Assert.assertNotNull(regularTimePeriod39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1712386800000L + "'", long52 == 1712386800000L);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
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
        timeSeries1.add(timeSeriesDataItem30, false);
        java.lang.Object obj34 = timeSeriesDataItem30.clone();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "6-April-2024" + "'", str29, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem30);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Date date8 = day2.getEnd();
        org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date8);
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date8);
        int int11 = month10.getYearValue();
        long long12 = month10.getSerialIndex();
        long long13 = month10.getLastMillisecond();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712386800000L + "'", long7 == 1712386800000L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2024 + "'", int11 == 2024);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 24292L + "'", long12 == 24292L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1714546799999L + "'", long13 == 1714546799999L);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list5 = timeSeries4.data;
        int int6 = timeSeries4.getItemCount();
        org.jfree.data.time.Month month7 = new org.jfree.data.time.Month();
        long long8 = month7.getFirstMillisecond();
        long long9 = month7.getLastMillisecond();
        long long10 = month7.getFirstMillisecond();
        org.jfree.data.time.Year year11 = month7.getYear();
        timeSeries4.delete((org.jfree.data.time.RegularTimePeriod) month7);
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
        long long33 = timeSeries14.getMaximumItemAge();
        org.jfree.data.time.Month month34 = new org.jfree.data.time.Month();
        long long35 = month34.getFirstMillisecond();
        long long36 = month34.getLastMillisecond();
        boolean boolean37 = timeSeries14.equals((java.lang.Object) month34);
        java.lang.Object obj38 = timeSeries14.clone();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries40.addChangeListener(seriesChangeListener41);
        long long43 = timeSeries40.getMaximumItemAge();
        java.lang.String str44 = timeSeries40.getDescription();
        double double45 = timeSeries40.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day48 = new org.jfree.data.time.Day();
        timeSeries47.add((org.jfree.data.time.RegularTimePeriod) day48, (double) (short) 0, false);
        timeSeries47.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod54 = timeSeries47.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent56 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean57 = timeSeries47.equals((java.lang.Object) seriesChangeEvent56);
        org.jfree.data.time.Day day58 = new org.jfree.data.time.Day();
        int int60 = day58.compareTo((java.lang.Object) (short) 100);
        java.lang.String str61 = day58.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = timeSeries47.getDataItem((org.jfree.data.time.RegularTimePeriod) day58);
        timeSeries40.add(timeSeriesDataItem62);
        java.util.List list64 = timeSeries40.getItems();
        timeSeries14.data = list64;
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day68 = new org.jfree.data.time.Day();
        timeSeries67.add((org.jfree.data.time.RegularTimePeriod) day68, (double) (short) 0, false);
        java.util.Date date72 = day68.getStart();
        long long73 = day68.getFirstMillisecond();
        org.jfree.data.time.SerialDate serialDate74 = day68.getSerialDate();
        org.jfree.data.time.Day day75 = new org.jfree.data.time.Day(serialDate74);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem76 = timeSeries14.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day75);
        int int77 = month7.compareTo((java.lang.Object) timeSeriesDataItem76);
        boolean boolean78 = month0.equals((java.lang.Object) timeSeriesDataItem76);
        java.lang.String str79 = month0.toString();
        java.lang.String str80 = month0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1711954800000L + "'", long2 == 1711954800000L);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711954800000L + "'", long8 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1714546799999L + "'", long9 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711954800000L + "'", long10 == 1711954800000L);
        org.junit.Assert.assertNotNull(year11);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711954800000L + "'", long18 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1712429999999L + "'", long31 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1711954800000L + "'", long35 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1714546799999L + "'", long36 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 9223372036854775807L + "'", long43 == 9223372036854775807L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(regularTimePeriod54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "6-April-2024" + "'", str61, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem62);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1712386800000L + "'", long73 == 1712386800000L);
        org.junit.Assert.assertNotNull(serialDate74);
        org.junit.Assert.assertNotNull(timeSeriesDataItem76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "April 2024" + "'", str79, "April 2024");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "April 2024" + "'", str80, "April 2024");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        java.util.Date date18 = regularTimePeriod17.getStart();
        org.jfree.data.time.Month month19 = new org.jfree.data.time.Month(date18);
        org.jfree.data.time.FixedMillisecond fixedMillisecond20 = new org.jfree.data.time.FixedMillisecond(date18);
        java.util.Calendar calendar21 = null;
        fixedMillisecond20.peg(calendar21);
        long long23 = fixedMillisecond20.getFirstMillisecond();
        java.util.Calendar calendar24 = null;
        long long25 = fixedMillisecond20.getMiddleMillisecond(calendar24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = fixedMillisecond20.previous();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1712300400000L + "'", long23 == 1712300400000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1712300400000L + "'", long25 == 1712300400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod26);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jfree.data.general.SeriesException seriesException1 = new org.jfree.data.general.SeriesException("Value");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException3 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException5 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException3.addSuppressed((java.lang.Throwable) timePeriodFormatException5);
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException8 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException10 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException8.addSuppressed((java.lang.Throwable) timePeriodFormatException10);
        timePeriodFormatException5.addSuppressed((java.lang.Throwable) timePeriodFormatException10);
        org.jfree.data.general.SeriesException seriesException14 = new org.jfree.data.general.SeriesException("org.jfree.data.event.SeriesChangeEvent[source=10.0]");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException16 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException18 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException16.addSuppressed((java.lang.Throwable) timePeriodFormatException18);
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException21 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException23 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException21.addSuppressed((java.lang.Throwable) timePeriodFormatException23);
        timePeriodFormatException18.addSuppressed((java.lang.Throwable) timePeriodFormatException23);
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException27 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException29 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException27.addSuppressed((java.lang.Throwable) timePeriodFormatException29);
        timePeriodFormatException18.addSuppressed((java.lang.Throwable) timePeriodFormatException27);
        seriesException14.addSuppressed((java.lang.Throwable) timePeriodFormatException18);
        timePeriodFormatException5.addSuppressed((java.lang.Throwable) timePeriodFormatException18);
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException35 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException37 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException35.addSuppressed((java.lang.Throwable) timePeriodFormatException37);
        timePeriodFormatException18.addSuppressed((java.lang.Throwable) timePeriodFormatException37);
        seriesException1.addSuppressed((java.lang.Throwable) timePeriodFormatException37);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        timeSeries19.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day24 = new org.jfree.data.time.Day();
        timeSeries23.add((org.jfree.data.time.RegularTimePeriod) day24, (double) (short) 0, false);
        timeSeries23.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = timeSeries23.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent32 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean33 = timeSeries23.equals((java.lang.Object) seriesChangeEvent32);
        org.jfree.data.time.Day day34 = new org.jfree.data.time.Day();
        int int36 = day34.compareTo((java.lang.Object) (short) 100);
        java.lang.String str37 = day34.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = timeSeries23.getDataItem((org.jfree.data.time.RegularTimePeriod) day34);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = day34.previous();
        java.util.Date date40 = regularTimePeriod39.getStart();
        org.jfree.data.time.Month month41 = new org.jfree.data.time.Month(date40);
        org.jfree.data.time.FixedMillisecond fixedMillisecond42 = new org.jfree.data.time.FixedMillisecond(date40);
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) fixedMillisecond42, (double) 11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = fixedMillisecond42.previous();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day48 = new org.jfree.data.time.Day();
        timeSeries47.add((org.jfree.data.time.RegularTimePeriod) day48, (double) (short) 0, false);
        timeSeries47.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod54 = timeSeries47.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent56 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean57 = timeSeries47.equals((java.lang.Object) seriesChangeEvent56);
        org.jfree.data.time.Day day58 = new org.jfree.data.time.Day();
        int int60 = day58.compareTo((java.lang.Object) (short) 100);
        java.lang.String str61 = day58.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = timeSeries47.getDataItem((org.jfree.data.time.RegularTimePeriod) day58);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = day58.previous();
        java.util.Date date64 = regularTimePeriod63.getStart();
        org.jfree.data.time.Month month65 = new org.jfree.data.time.Month(date64);
        org.jfree.data.time.FixedMillisecond fixedMillisecond66 = new org.jfree.data.time.FixedMillisecond(date64);
        long long67 = fixedMillisecond66.getMiddleMillisecond();
        long long68 = fixedMillisecond66.getFirstMillisecond();
        java.util.Date date69 = fixedMillisecond66.getTime();
        org.jfree.data.time.Day day70 = new org.jfree.data.time.Day(date69);
        boolean boolean71 = fixedMillisecond42.equals((java.lang.Object) day70);
        long long72 = day70.getSerialIndex();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(regularTimePeriod30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "6-April-2024" + "'", str37, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem38);
        org.junit.Assert.assertNotNull(regularTimePeriod39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod45);
        org.junit.Assert.assertNotNull(regularTimePeriod54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "6-April-2024" + "'", str61, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem62);
        org.junit.Assert.assertNotNull(regularTimePeriod63);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1712300400000L + "'", long67 == 1712300400000L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1712300400000L + "'", long68 == 1712300400000L);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 45387L + "'", long72 == 45387L);
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
        timeSeries1.removeAgedItems(true);
        int int9 = timeSeries1.getMaximumItemCount();
        java.util.List list10 = timeSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.createCopy((int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        int int17 = day12.getDayOfMonth();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day12);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries18.addChangeListener(seriesChangeListener19);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Year year24 = new org.jfree.data.time.Year((int) (short) -1);
        long long25 = year24.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year24, (java.lang.Number) 9223372036854775807L);
        timeSeries22.add((org.jfree.data.time.RegularTimePeriod) year24, 0.0d);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day32 = new org.jfree.data.time.Day();
        timeSeries31.add((org.jfree.data.time.RegularTimePeriod) day32, (double) (short) 0, false);
        timeSeries31.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day40 = new org.jfree.data.time.Day();
        timeSeries39.add((org.jfree.data.time.RegularTimePeriod) day40, (double) (short) 0, false);
        java.util.Date date44 = day40.getStart();
        org.jfree.data.time.SerialDate serialDate45 = day40.getSerialDate();
        java.lang.Number number46 = null;
        timeSeries31.update((org.jfree.data.time.RegularTimePeriod) day40, number46);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day50 = new org.jfree.data.time.Day();
        timeSeries49.add((org.jfree.data.time.RegularTimePeriod) day50, (double) (short) 0, false);
        timeSeries49.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod56 = timeSeries49.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent58 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean59 = timeSeries49.equals((java.lang.Object) seriesChangeEvent58);
        org.jfree.data.time.Day day60 = new org.jfree.data.time.Day();
        int int62 = day60.compareTo((java.lang.Object) (short) 100);
        java.lang.String str63 = day60.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem64 = timeSeries49.getDataItem((org.jfree.data.time.RegularTimePeriod) day60);
        int int65 = day40.compareTo((java.lang.Object) day60);
        org.jfree.data.time.Month month66 = new org.jfree.data.time.Month();
        long long67 = month66.getFirstMillisecond();
        long long68 = month66.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod69 = month66.next();
        boolean boolean70 = day60.equals((java.lang.Object) regularTimePeriod69);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem71 = timeSeries22.getDataItem(regularTimePeriod69);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener72 = null;
        timeSeries22.removeChangeListener(seriesChangeListener72);
        java.util.Collection collection74 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        boolean boolean75 = timeSeries22.isEmpty();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-62198899200000L) + "'", long25 == (-62198899200000L));
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate45);
        org.junit.Assert.assertNotNull(regularTimePeriod56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "6-April-2024" + "'", str63, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1711954800000L + "'", long67 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1714546799999L + "'", long68 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(timeSeriesDataItem71);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        java.util.List list25 = timeSeries1.getItems();
        int int26 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day29 = new org.jfree.data.time.Day();
        timeSeries28.add((org.jfree.data.time.RegularTimePeriod) day29, (double) (short) 0, false);
        timeSeries28.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = timeSeries28.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent37 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean38 = timeSeries28.equals((java.lang.Object) seriesChangeEvent37);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        int int41 = day39.compareTo((java.lang.Object) (short) 100);
        java.lang.String str42 = day39.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries28.getDataItem((org.jfree.data.time.RegularTimePeriod) day39);
        java.lang.Class<?> wildcardClass44 = day39.getClass();
        timeSeries1.timePeriodClass = wildcardClass44;
        int int46 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day49 = new org.jfree.data.time.Day();
        timeSeries48.add((org.jfree.data.time.RegularTimePeriod) day49, (double) (short) 0, false);
        timeSeries48.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod55 = timeSeries48.getNextTimePeriod();
        java.util.List list56 = timeSeries48.data;
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day59 = new org.jfree.data.time.Day();
        timeSeries58.add((org.jfree.data.time.RegularTimePeriod) day59, (double) (short) 0, false);
        java.util.Date date63 = day59.getStart();
        long long64 = day59.getFirstMillisecond();
        java.util.Date date65 = day59.getEnd();
        org.jfree.data.time.Year year66 = new org.jfree.data.time.Year(date65);
        org.jfree.data.time.Month month67 = new org.jfree.data.time.Month(date65);
        java.lang.String str68 = month67.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem70 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month67, (double) '#');
        timeSeries48.delete((org.jfree.data.time.RegularTimePeriod) month67);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem72 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) month67);
        long long73 = month67.getSerialIndex();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "6-April-2024" + "'", str42, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertNotNull(regularTimePeriod55);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1712386800000L + "'", long64 == 1712386800000L);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "April 2024" + "'", str68, "April 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem72);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 24292L + "'", long73 == 24292L);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
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
        timeSeries1.add(timeSeriesDataItem30, false);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener34);
        java.util.List list36 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries1.getNextTimePeriod();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "6-April-2024" + "'", str29, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem30);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
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
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        int int12 = day8.getDayOfMonth();
        long long13 = day8.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day8, (double) 45389L);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day18, (double) (short) 0, false);
        timeSeries17.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        java.util.Date date30 = day26.getStart();
        int int31 = timeSeries17.getIndex((org.jfree.data.time.RegularTimePeriod) day26);
        java.util.Date date32 = day26.getStart();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent33 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) date32);
        org.jfree.data.time.Day day34 = new org.jfree.data.time.Day(date32);
        timeSeries1.setKey((java.lang.Comparable) date32);
        java.util.TimeZone timeZone36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year37 = new org.jfree.data.time.Year(date32, timeZone36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1712386800000L + "'", long13 == 1712386800000L);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Sat Apr 06 00:00:00 PDT 2024");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        boolean boolean4 = timeSeries1.getNotify();
        java.lang.Object obj5 = timeSeries1.clone();
        int int6 = timeSeries1.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        int int9 = timeSeries1.getItemCount();
        timeSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
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
        timeSeries1.add(timeSeriesDataItem30, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = timeSeriesDataItem30.getPeriod();
        timeSeriesDataItem30.setSelected(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeriesDataItem30.getPeriod();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "6-April-2024" + "'", str29, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem30);
        org.junit.Assert.assertNotNull(regularTimePeriod34);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        java.lang.String str34 = timeSeries1.getDomainDescription();
        boolean boolean35 = timeSeries1.isEmpty();
        timeSeries1.setDomainDescription("Value");
        timeSeries1.setDescription("April 2024");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = timeSeries1.getValue(regularTimePeriod40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712429999999L + "'", long32 == 1712429999999L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Time" + "'", str34, "Time");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
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
        timeSeries1.setDescription("");
        timeSeries1.setDescription("6-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries1.addAndOrUpdate(timeSeries30);
        double double38 = timeSeries37.getMinY();
        timeSeries37.clear();
        org.jfree.data.time.Year year41 = new org.jfree.data.time.Year((int) (short) -1);
        long long42 = year41.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year41, (java.lang.Number) 9223372036854775807L);
        long long45 = year41.getSerialIndex();
        java.util.Date date46 = year41.getStart();
        timeSeries37.add((org.jfree.data.time.RegularTimePeriod) year41, (java.lang.Number) (-62198899200000L), false);
        timeSeries37.setRangeDescription("org.jfree.data.event.SeriesChangeEvent[source=1711954800000]");
        java.lang.String str52 = timeSeries37.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener55 = null;
        timeSeries54.addChangeListener(seriesChangeListener55);
        long long57 = timeSeries54.getMaximumItemAge();
        java.lang.String str58 = timeSeries54.getDescription();
        double double59 = timeSeries54.getMaxY();
        timeSeries54.removeAgedItems(1712386800000L, false);
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener65 = null;
        timeSeries64.removeChangeListener(seriesChangeListener65);
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day69 = new org.jfree.data.time.Day();
        timeSeries68.add((org.jfree.data.time.RegularTimePeriod) day69, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem74 = timeSeries64.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day69, (java.lang.Number) 10L);
        long long75 = day69.getMiddleMillisecond();
        boolean boolean76 = timeSeries54.equals((java.lang.Object) day69);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem77 = timeSeries37.getDataItem((org.jfree.data.time.RegularTimePeriod) day69);
        java.lang.Object obj78 = timeSeriesDataItem77.clone();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-62198899200000L) + "'", long42 == (-62198899200000L));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Wed Jan 01 00:00:00 PST 2");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org.jfree.data.event.SeriesChangeEvent[source=1711954800000]" + "'", str52, "org.jfree.data.event.SeriesChangeEvent[source=1711954800000]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 9223372036854775807L + "'", long57 == 9223372036854775807L);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNull(timeSeriesDataItem74);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1712429999999L + "'", long75 == 1712429999999L);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(timeSeriesDataItem77);
        org.junit.Assert.assertNotNull(obj78);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        java.lang.String str18 = day10.toString();
        java.lang.Object obj19 = null;
        boolean boolean20 = day10.equals(obj19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = day10.previous();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "6-April-2024" + "'", str18, "6-April-2024");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        timeSeries1.removeAgedItems((long) (short) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries1.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Year year3 = new org.jfree.data.time.Year((int) (short) -1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) year3);
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
        java.util.List list23 = timeSeries6.getItems();
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = day36.previous();
        java.util.Date date42 = regularTimePeriod41.getStart();
        org.jfree.data.time.Month month43 = new org.jfree.data.time.Month(date42);
        org.jfree.data.time.FixedMillisecond fixedMillisecond44 = new org.jfree.data.time.FixedMillisecond(date42);
        org.jfree.data.time.Day day45 = new org.jfree.data.time.Day();
        int int47 = day45.compareTo((java.lang.Object) (short) 100);
        java.lang.String str48 = day45.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = day45.next();
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day45, "Time", "Value");
        boolean boolean53 = fixedMillisecond44.equals((java.lang.Object) day45);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem54 = timeSeries6.getRawDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond44);
        java.lang.Number number55 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) fixedMillisecond44);
        java.lang.Class class56 = timeSeries1.getTimePeriodClass();
        org.junit.Assert.assertNull(timeSeriesDataItem4);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "6-April-2024" + "'", str39, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem40);
        org.junit.Assert.assertNotNull(regularTimePeriod41);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "6-April-2024" + "'", str48, "6-April-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(timeSeriesDataItem54);
        org.junit.Assert.assertNull(number55);
        org.junit.Assert.assertNull(class56);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent3 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo4 = null;
        seriesChangeEvent3.setSummary(seriesChangeInfo4);
        int int6 = month0.compareTo((java.lang.Object) seriesChangeInfo4);
        java.lang.String str7 = month0.toString();
        org.jfree.data.time.Month month8 = new org.jfree.data.time.Month();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month8, (java.lang.Number) (short) 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month8, (java.lang.Number) 1.0d);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        int int19 = day15.getDayOfMonth();
        long long20 = day15.getFirstMillisecond();
        long long21 = day15.getFirstMillisecond();
        int int22 = timeSeriesDataItem12.compareTo((java.lang.Object) day15);
        int int23 = month0.compareTo((java.lang.Object) timeSeriesDataItem12);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "April 2024" + "'", str7, "April 2024");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1712386800000L + "'", long20 == 1712386800000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1712386800000L + "'", long21 == 1712386800000L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getLastMillisecond();
        long long3 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year4 = month0.getYear();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries6.removeChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day11 = new org.jfree.data.time.Day();
        timeSeries10.add((org.jfree.data.time.RegularTimePeriod) day11, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries6.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day11, (java.lang.Number) 10L);
        long long17 = day11.getMiddleMillisecond();
        int int18 = day11.getMonth();
        boolean boolean19 = month0.equals((java.lang.Object) day11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = month0.previous();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714546799999L + "'", long2 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1711954800000L + "'", long3 == 1711954800000L);
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertNull(timeSeriesDataItem16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1712429999999L + "'", long17 == 1712429999999L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod20);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond(1712440541340L);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Value");
        java.util.List list4 = timeSeries3.data;
        org.jfree.data.time.Year year6 = new org.jfree.data.time.Year((int) (byte) -1);
        long long7 = year6.getLastMillisecond();
        timeSeries3.delete((org.jfree.data.time.RegularTimePeriod) year6);
        org.jfree.data.time.Year year11 = new org.jfree.data.time.Year((int) (short) -1);
        long long12 = year11.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year11, (java.lang.Number) 9223372036854775807L);
        long long15 = year11.getSerialIndex();
        java.util.Date date16 = year11.getEnd();
        java.lang.String str17 = year11.toString();
        org.jfree.data.time.Month month18 = new org.jfree.data.time.Month(9, year11);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries3.getDataItem((org.jfree.data.time.RegularTimePeriod) year11);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-62072668800001L) + "'", long7 == (-62072668800001L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-62198899200000L) + "'", long12 == (-62198899200000L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Dec 31 23:59:59 PST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertNull(timeSeriesDataItem19);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(1711954800000L, false);
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
        timeSeries8.setKey((java.lang.Comparable) 45388L);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list31 = timeSeries30.data;
        int int32 = timeSeries30.getItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries30.addChangeListener(seriesChangeListener33);
        timeSeries30.clear();
        org.jfree.data.time.Month month36 = new org.jfree.data.time.Month();
        long long37 = month36.getFirstMillisecond();
        long long38 = month36.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = month36.previous();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = timeSeries30.addOrUpdate((org.jfree.data.time.RegularTimePeriod) month36, (double) 24292L);
        java.lang.Number number42 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries8.addOrUpdate((org.jfree.data.time.RegularTimePeriod) month36, number42);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries1.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener47 = null;
        timeSeries46.addChangeListener(seriesChangeListener47);
        long long49 = timeSeries46.getMaximumItemAge();
        java.lang.String str50 = timeSeries46.getDescription();
        double double51 = timeSeries46.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day54 = new org.jfree.data.time.Day();
        timeSeries53.add((org.jfree.data.time.RegularTimePeriod) day54, (double) (short) 0, false);
        timeSeries53.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = timeSeries53.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent62 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean63 = timeSeries53.equals((java.lang.Object) seriesChangeEvent62);
        org.jfree.data.time.Day day64 = new org.jfree.data.time.Day();
        int int66 = day64.compareTo((java.lang.Object) (short) 100);
        java.lang.String str67 = day64.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem68 = timeSeries53.getDataItem((org.jfree.data.time.RegularTimePeriod) day64);
        timeSeries46.add(timeSeriesDataItem68);
        timeSeries46.setDescription("");
        timeSeries46.setDescription("6-April-2024");
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day76 = new org.jfree.data.time.Day();
        timeSeries75.add((org.jfree.data.time.RegularTimePeriod) day76, (double) (short) 0, false);
        timeSeries75.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod82 = timeSeries75.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent84 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean85 = timeSeries75.equals((java.lang.Object) seriesChangeEvent84);
        org.jfree.data.time.Day day86 = new org.jfree.data.time.Day();
        int int88 = day86.compareTo((java.lang.Object) (short) 100);
        java.lang.String str89 = day86.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem90 = timeSeries75.getDataItem((org.jfree.data.time.RegularTimePeriod) day86);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem92 = timeSeries46.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day86, (double) 4);
        int int93 = day86.getDayOfMonth();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod94 = day86.next();
        boolean boolean95 = timeSeries1.equals((java.lang.Object) regularTimePeriod94);
        java.lang.String str96 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711954800000L + "'", long12 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1712429999999L + "'", long25 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1711954800000L + "'", long37 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1714546799999L + "'", long38 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod39);
        org.junit.Assert.assertNull(timeSeriesDataItem41);
        org.junit.Assert.assertNull(timeSeriesDataItem43);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 9223372036854775807L + "'", long49 == 9223372036854775807L);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(regularTimePeriod60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "6-April-2024" + "'", str67, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem68);
        org.junit.Assert.assertNotNull(regularTimePeriod82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "6-April-2024" + "'", str89, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem90);
        org.junit.Assert.assertNotNull(timeSeriesDataItem92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 6 + "'", int93 == 6);
        org.junit.Assert.assertNotNull(regularTimePeriod94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "Value" + "'", str96, "Value");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        long long20 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month();
        long long22 = month21.getFirstMillisecond();
        long long23 = month21.getLastMillisecond();
        boolean boolean24 = timeSeries1.equals((java.lang.Object) month21);
        java.lang.Object obj25 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries27.addChangeListener(seriesChangeListener28);
        long long30 = timeSeries27.getMaximumItemAge();
        java.lang.String str31 = timeSeries27.getDescription();
        double double32 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day35 = new org.jfree.data.time.Day();
        timeSeries34.add((org.jfree.data.time.RegularTimePeriod) day35, (double) (short) 0, false);
        timeSeries34.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = timeSeries34.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent43 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean44 = timeSeries34.equals((java.lang.Object) seriesChangeEvent43);
        org.jfree.data.time.Day day45 = new org.jfree.data.time.Day();
        int int47 = day45.compareTo((java.lang.Object) (short) 100);
        java.lang.String str48 = day45.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = timeSeries34.getDataItem((org.jfree.data.time.RegularTimePeriod) day45);
        timeSeries27.add(timeSeriesDataItem49);
        java.util.List list51 = timeSeries27.getItems();
        timeSeries1.data = list51;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day55 = new org.jfree.data.time.Day();
        timeSeries54.add((org.jfree.data.time.RegularTimePeriod) day55, (double) (short) 0, false);
        java.util.Date date59 = day55.getStart();
        long long60 = day55.getFirstMillisecond();
        org.jfree.data.time.SerialDate serialDate61 = day55.getSerialDate();
        org.jfree.data.time.Day day62 = new org.jfree.data.time.Day(serialDate61);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem63 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day62);
        long long64 = day62.getSerialIndex();
        java.util.Date date65 = day62.getEnd();
        org.jfree.data.time.Month month66 = new org.jfree.data.time.Month(date65);
        java.util.TimeZone timeZone67 = null;
        java.util.Locale locale68 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month69 = new org.jfree.data.time.Month(date65, timeZone67, locale68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1711954800000L + "'", long22 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1714546799999L + "'", long23 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(regularTimePeriod41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "6-April-2024" + "'", str48, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem49);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1712386800000L + "'", long60 == 1712386800000L);
        org.junit.Assert.assertNotNull(serialDate61);
        org.junit.Assert.assertNotNull(timeSeriesDataItem63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 45388L + "'", long64 == 45388L);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Sat Apr 06 23:59:59 PDT 2024");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        long long6 = month4.getLastMillisecond();
        long long7 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year8 = month4.getYear();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month4);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list12 = timeSeries11.data;
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
        boolean boolean30 = timeSeriesDataItem29.isSelected();
        int int32 = timeSeriesDataItem29.compareTo((java.lang.Object) 2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries11.addOrUpdate(timeSeriesDataItem29);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries1.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.Year year35 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double38 = timeSeries37.getMaxY();
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        java.lang.Number number40 = null;
        timeSeries37.add((org.jfree.data.time.RegularTimePeriod) day39, number40, false);
        int int43 = day39.getMonth();
        int int44 = day39.getYear();
        boolean boolean45 = year35.equals((java.lang.Object) day39);
        long long46 = year35.getSerialIndex();
        long long47 = year35.getLastMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem48 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) year35);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) timeSeriesDataItem48);
        java.lang.Comparable comparable50 = timeSeries49.getKey();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNotNull(year8);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "6-April-2024" + "'", str28, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem33);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2024 + "'", int44 == 2024);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 2024L + "'", long46 == 2024L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1735718399999L + "'", long47 == 1735718399999L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem48);
        org.junit.Assert.assertNotNull(comparable50);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getLastMillisecond();
        long long3 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year4 = month0.getYear();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list7 = timeSeries6.data;
        int int8 = timeSeries6.getItemCount();
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month();
        long long10 = month9.getFirstMillisecond();
        long long11 = month9.getLastMillisecond();
        long long12 = month9.getFirstMillisecond();
        org.jfree.data.time.Year year13 = month9.getYear();
        timeSeries6.delete((org.jfree.data.time.RegularTimePeriod) month9);
        java.lang.String str15 = month9.toString();
        int int16 = month0.compareTo((java.lang.Object) month9);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month9, (java.lang.Number) 45387L);
        int int19 = month9.getYearValue();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714546799999L + "'", long2 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1711954800000L + "'", long3 == 1711954800000L);
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711954800000L + "'", long10 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1714546799999L + "'", long11 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711954800000L + "'", long12 == 1711954800000L);
        org.junit.Assert.assertNotNull(year13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "April 2024" + "'", str15, "April 2024");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2024 + "'", int19 == 2024);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        java.lang.String str34 = timeSeries1.getDomainDescription();
        java.util.List list35 = timeSeries1.getItems();
        double double36 = timeSeries1.getMaxY();
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod54 = day49.next();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day49, 0.0d, false);
        java.util.Date date58 = day49.getStart();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712429999999L + "'", long32 == 1712429999999L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Time" + "'", str34, "Time");
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(regularTimePeriod45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "6-April-2024" + "'", str52, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem53);
        org.junit.Assert.assertNotNull(regularTimePeriod54);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Sat Apr 06 00:00:00 PDT 2024");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list5 = timeSeries4.data;
        int int6 = timeSeries4.getItemCount();
        org.jfree.data.time.Month month7 = new org.jfree.data.time.Month();
        long long8 = month7.getFirstMillisecond();
        long long9 = month7.getLastMillisecond();
        long long10 = month7.getFirstMillisecond();
        org.jfree.data.time.Year year11 = month7.getYear();
        timeSeries4.delete((org.jfree.data.time.RegularTimePeriod) month7);
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
        long long33 = timeSeries14.getMaximumItemAge();
        org.jfree.data.time.Month month34 = new org.jfree.data.time.Month();
        long long35 = month34.getFirstMillisecond();
        long long36 = month34.getLastMillisecond();
        boolean boolean37 = timeSeries14.equals((java.lang.Object) month34);
        java.lang.Object obj38 = timeSeries14.clone();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries40.addChangeListener(seriesChangeListener41);
        long long43 = timeSeries40.getMaximumItemAge();
        java.lang.String str44 = timeSeries40.getDescription();
        double double45 = timeSeries40.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day48 = new org.jfree.data.time.Day();
        timeSeries47.add((org.jfree.data.time.RegularTimePeriod) day48, (double) (short) 0, false);
        timeSeries47.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod54 = timeSeries47.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent56 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean57 = timeSeries47.equals((java.lang.Object) seriesChangeEvent56);
        org.jfree.data.time.Day day58 = new org.jfree.data.time.Day();
        int int60 = day58.compareTo((java.lang.Object) (short) 100);
        java.lang.String str61 = day58.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = timeSeries47.getDataItem((org.jfree.data.time.RegularTimePeriod) day58);
        timeSeries40.add(timeSeriesDataItem62);
        java.util.List list64 = timeSeries40.getItems();
        timeSeries14.data = list64;
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day68 = new org.jfree.data.time.Day();
        timeSeries67.add((org.jfree.data.time.RegularTimePeriod) day68, (double) (short) 0, false);
        java.util.Date date72 = day68.getStart();
        long long73 = day68.getFirstMillisecond();
        org.jfree.data.time.SerialDate serialDate74 = day68.getSerialDate();
        org.jfree.data.time.Day day75 = new org.jfree.data.time.Day(serialDate74);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem76 = timeSeries14.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day75);
        int int77 = month7.compareTo((java.lang.Object) timeSeriesDataItem76);
        boolean boolean78 = month0.equals((java.lang.Object) timeSeriesDataItem76);
        java.lang.String str79 = month0.toString();
        java.lang.Object obj80 = null;
        int int81 = month0.compareTo(obj80);
        java.util.Calendar calendar82 = null;
        // The following exception was thrown during execution in test generation
        try {
            month0.peg(calendar82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1711954800000L + "'", long2 == 1711954800000L);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711954800000L + "'", long8 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1714546799999L + "'", long9 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711954800000L + "'", long10 == 1711954800000L);
        org.junit.Assert.assertNotNull(year11);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711954800000L + "'", long18 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1712429999999L + "'", long31 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1711954800000L + "'", long35 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1714546799999L + "'", long36 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 9223372036854775807L + "'", long43 == 9223372036854775807L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(regularTimePeriod54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "6-April-2024" + "'", str61, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem62);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1712386800000L + "'", long73 == 1712386800000L);
        org.junit.Assert.assertNotNull(serialDate74);
        org.junit.Assert.assertNotNull(timeSeriesDataItem76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "April 2024" + "'", str79, "April 2024");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        java.lang.Object obj8 = timeSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries1.createCopy((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        java.lang.Object obj17 = timeSeriesDataItem16.clone();
        timeSeriesDataItem16.setValue((java.lang.Number) 1712386800000L);
        timeSeriesDataItem16.setValue((java.lang.Number) 45389L);
        java.text.DateFormat dateFormat22 = org.jfree.data.time.Day.DATE_FORMAT_LONG;
        boolean boolean23 = timeSeriesDataItem16.equals((java.lang.Object) dateFormat22);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        java.lang.String str3 = day0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = day0.next();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day0, "Time", "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries7.getRawDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6-April-2024" + "'", str3, "6-April-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond(1714546799999L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = fixedMillisecond1.previous();
        java.util.Calendar calendar3 = null;
        long long4 = fixedMillisecond1.getLastMillisecond(calendar3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day7 = new org.jfree.data.time.Day();
        timeSeries6.add((org.jfree.data.time.RegularTimePeriod) day7, (double) (short) 0, false);
        timeSeries6.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries6.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent15 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean16 = timeSeries6.equals((java.lang.Object) seriesChangeEvent15);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        int int19 = day17.compareTo((java.lang.Object) (short) 100);
        java.lang.String str20 = day17.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries6.getDataItem((org.jfree.data.time.RegularTimePeriod) day17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = day17.previous();
        java.util.Date date23 = regularTimePeriod22.getStart();
        org.jfree.data.time.Month month24 = new org.jfree.data.time.Month(date23);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day(date23);
        int int26 = fixedMillisecond1.compareTo((java.lang.Object) date23);
        org.jfree.data.time.Year year27 = new org.jfree.data.time.Year(date23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = year27.previous();
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1714546799999L + "'", long4 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "6-April-2024" + "'", str20, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        boolean boolean25 = timeSeries1.getNotify();
        org.jfree.data.time.Month month28 = new org.jfree.data.time.Month(3, 0);
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) month28, (java.lang.Number) 1711954800000L);
        java.util.Date date31 = month28.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = month28.previous();
        java.util.Date date33 = regularTimePeriod32.getEnd();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 31 23:59:59 PST 1");
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Tue Mar 01 23:59:59 PST 1");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        org.jfree.data.time.Day day27 = new org.jfree.data.time.Day();
        timeSeries26.add((org.jfree.data.time.RegularTimePeriod) day27, (double) (short) 0, false);
        java.util.Date date31 = day27.getStart();
        org.jfree.data.time.Month month32 = new org.jfree.data.time.Month(date31);
        java.lang.String str33 = month32.toString();
        java.lang.Number number34 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month32, number34);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) month32, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "April 2024" + "'", str33, "April 2024");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        double double27 = timeSeries1.getMaxY();
        timeSeries1.setMaximumItemCount((int) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day32 = new org.jfree.data.time.Day();
        timeSeries31.add((org.jfree.data.time.RegularTimePeriod) day32, (double) (short) 0, false);
        timeSeries31.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = timeSeries31.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent40 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean41 = timeSeries31.equals((java.lang.Object) seriesChangeEvent40);
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        int int44 = day42.compareTo((java.lang.Object) (short) 100);
        java.lang.String str45 = day42.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem46 = timeSeries31.getDataItem((org.jfree.data.time.RegularTimePeriod) day42);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = day42.previous();
        java.util.Date date48 = regularTimePeriod47.getStart();
        org.jfree.data.time.Month month49 = new org.jfree.data.time.Month(date48);
        org.jfree.data.time.FixedMillisecond fixedMillisecond50 = new org.jfree.data.time.FixedMillisecond(date48);
        long long51 = fixedMillisecond50.getMiddleMillisecond();
        long long52 = fixedMillisecond50.getFirstMillisecond();
        java.util.Date date53 = fixedMillisecond50.getTime();
        java.util.Calendar calendar54 = null;
        long long55 = fixedMillisecond50.getMiddleMillisecond(calendar54);
        java.util.Calendar calendar56 = null;
        long long57 = fixedMillisecond50.getLastMillisecond(calendar56);
        java.util.Calendar calendar58 = null;
        fixedMillisecond50.peg(calendar58);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) fixedMillisecond50, (double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(regularTimePeriod38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "6-April-2024" + "'", str45, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem46);
        org.junit.Assert.assertNotNull(regularTimePeriod47);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1712300400000L + "'", long51 == 1712300400000L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1712300400000L + "'", long52 == 1712300400000L);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1712300400000L + "'", long55 == 1712300400000L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1712300400000L + "'", long57 == 1712300400000L);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        java.lang.Object obj1 = null;
        boolean boolean2 = month0.equals(obj1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = month0.previous();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent1 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo2 = seriesChangeEvent1.getSummary();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo3 = seriesChangeEvent1.getSummary();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo4 = null;
        seriesChangeEvent1.setSummary(seriesChangeInfo4);
        org.junit.Assert.assertNull(seriesChangeInfo2);
        org.junit.Assert.assertNull(seriesChangeInfo3);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        timeSeries1.setDescription("6-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries30.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent39 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean40 = timeSeries30.equals((java.lang.Object) seriesChangeEvent39);
        org.jfree.data.time.Day day41 = new org.jfree.data.time.Day();
        int int43 = day41.compareTo((java.lang.Object) (short) 100);
        java.lang.String str44 = day41.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries30.getDataItem((org.jfree.data.time.RegularTimePeriod) day41);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day41, (double) 4);
        long long48 = day41.getLastMillisecond();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day41);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "6-April-2024" + "'", str44, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem45);
        org.junit.Assert.assertNotNull(timeSeriesDataItem47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1712473199999L + "'", long48 == 1712473199999L);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        boolean boolean4 = timeSeries1.getNotify();
        java.lang.Object obj5 = timeSeries1.clone();
        int int6 = timeSeries1.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.lang.Object obj9 = timeSeries1.clone();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(1711954800000L, false);
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
        timeSeries8.setKey((java.lang.Comparable) 45388L);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list31 = timeSeries30.data;
        int int32 = timeSeries30.getItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries30.addChangeListener(seriesChangeListener33);
        timeSeries30.clear();
        org.jfree.data.time.Month month36 = new org.jfree.data.time.Month();
        long long37 = month36.getFirstMillisecond();
        long long38 = month36.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = month36.previous();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = timeSeries30.addOrUpdate((org.jfree.data.time.RegularTimePeriod) month36, (double) 24292L);
        java.lang.Number number42 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries8.addOrUpdate((org.jfree.data.time.RegularTimePeriod) month36, number42);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries1.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener47 = null;
        timeSeries46.addChangeListener(seriesChangeListener47);
        long long49 = timeSeries46.getMaximumItemAge();
        java.lang.String str50 = timeSeries46.getDescription();
        double double51 = timeSeries46.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day54 = new org.jfree.data.time.Day();
        timeSeries53.add((org.jfree.data.time.RegularTimePeriod) day54, (double) (short) 0, false);
        timeSeries53.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = timeSeries53.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent62 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean63 = timeSeries53.equals((java.lang.Object) seriesChangeEvent62);
        org.jfree.data.time.Day day64 = new org.jfree.data.time.Day();
        int int66 = day64.compareTo((java.lang.Object) (short) 100);
        java.lang.String str67 = day64.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem68 = timeSeries53.getDataItem((org.jfree.data.time.RegularTimePeriod) day64);
        timeSeries46.add(timeSeriesDataItem68);
        timeSeries46.setDescription("");
        timeSeries46.setDescription("6-April-2024");
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day76 = new org.jfree.data.time.Day();
        timeSeries75.add((org.jfree.data.time.RegularTimePeriod) day76, (double) (short) 0, false);
        timeSeries75.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod82 = timeSeries75.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent84 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean85 = timeSeries75.equals((java.lang.Object) seriesChangeEvent84);
        org.jfree.data.time.Day day86 = new org.jfree.data.time.Day();
        int int88 = day86.compareTo((java.lang.Object) (short) 100);
        java.lang.String str89 = day86.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem90 = timeSeries75.getDataItem((org.jfree.data.time.RegularTimePeriod) day86);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem92 = timeSeries46.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day86, (double) 4);
        int int93 = day86.getDayOfMonth();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod94 = day86.next();
        boolean boolean95 = timeSeries1.equals((java.lang.Object) regularTimePeriod94);
        timeSeries1.setMaximumItemAge(10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711954800000L + "'", long12 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1712429999999L + "'", long25 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1711954800000L + "'", long37 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1714546799999L + "'", long38 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod39);
        org.junit.Assert.assertNull(timeSeriesDataItem41);
        org.junit.Assert.assertNull(timeSeriesDataItem43);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 9223372036854775807L + "'", long49 == 9223372036854775807L);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(regularTimePeriod60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "6-April-2024" + "'", str67, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem68);
        org.junit.Assert.assertNotNull(regularTimePeriod82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "6-April-2024" + "'", str89, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem90);
        org.junit.Assert.assertNotNull(timeSeriesDataItem92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 6 + "'", int93 == 6);
        org.junit.Assert.assertNotNull(regularTimePeriod94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Year year7 = new org.jfree.data.time.Year((int) (short) -1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries5.getDataItem((org.jfree.data.time.RegularTimePeriod) year7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list11 = timeSeries10.data;
        timeSeries5.data = list11;
        timeSeries1.data = list11;
        java.lang.Comparable comparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setKey(comparable14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(timeSeriesDataItem8);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        java.lang.String str34 = timeSeries1.getDomainDescription();
        java.util.List list35 = timeSeries1.getItems();
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener36);
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
        long long58 = timeSeries39.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries1.addAndOrUpdate(timeSeries39);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries39.update(0, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712429999999L + "'", long32 == 1712429999999L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Time" + "'", str34, "Time");
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1711954800000L + "'", long43 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1712429999999L + "'", long56 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 9223372036854775807L + "'", long58 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries59);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day7 = new org.jfree.data.time.Day();
        timeSeries6.add((org.jfree.data.time.RegularTimePeriod) day7, (double) (short) 0, false);
        timeSeries6.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries6.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent15 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean16 = timeSeries6.equals((java.lang.Object) seriesChangeEvent15);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        int int19 = day17.compareTo((java.lang.Object) (short) 100);
        java.lang.String str20 = day17.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries6.getDataItem((org.jfree.data.time.RegularTimePeriod) day17);
        int int22 = day17.getDayOfMonth();
        java.lang.Number number23 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) day17);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "6-April-2024" + "'", str20, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNull(number23);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Value");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        java.util.Date date10 = day6.getStart();
        long long11 = day6.getFirstMillisecond();
        java.util.Date date12 = day6.getEnd();
        org.jfree.data.time.Year year13 = new org.jfree.data.time.Year(date12);
        org.jfree.data.time.Month month14 = new org.jfree.data.time.Month(date12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = month14.previous();
        timeSeries3.add(regularTimePeriod15, (double) '4', true);
        timeSeries3.setNotify(true);
        int int21 = timeSeries3.getItemCount();
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1712386800000L + "'", long11 == 1712386800000L);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jfree.data.time.Month month1 = org.jfree.data.time.Month.parseMonth("April 2024");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = month1.previous();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month1, (double) 9223372036854775807L);
        long long5 = month1.getSerialIndex();
        org.junit.Assert.assertNotNull(month1);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 24292L + "'", long5 == 24292L);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day5 = new org.jfree.data.time.Day();
        timeSeries4.add((org.jfree.data.time.RegularTimePeriod) day5, (double) (short) 0, false);
        timeSeries4.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries4.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent13 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean14 = timeSeries4.equals((java.lang.Object) seriesChangeEvent13);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        int int17 = day15.compareTo((java.lang.Object) (short) 100);
        java.lang.String str18 = day15.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries4.getDataItem((org.jfree.data.time.RegularTimePeriod) day15);
        boolean boolean20 = timeSeriesDataItem19.isSelected();
        int int22 = timeSeriesDataItem19.compareTo((java.lang.Object) 2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries1.addOrUpdate(timeSeriesDataItem19);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.removeChangeListener(seriesChangeListener26);
        java.lang.String str28 = timeSeries25.getRangeDescription();
        java.util.List list29 = timeSeries25.getItems();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day32 = new org.jfree.data.time.Day();
        timeSeries31.add((org.jfree.data.time.RegularTimePeriod) day32, (double) (short) 0, false);
        timeSeries31.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = timeSeries31.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent40 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean41 = timeSeries31.equals((java.lang.Object) seriesChangeEvent40);
        org.jfree.data.time.Day day42 = new org.jfree.data.time.Day();
        int int44 = day42.compareTo((java.lang.Object) (short) 100);
        java.lang.String str45 = day42.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem46 = timeSeries31.getDataItem((org.jfree.data.time.RegularTimePeriod) day42);
        java.lang.Number number47 = timeSeriesDataItem46.getValue();
        boolean boolean48 = timeSeries25.equals((java.lang.Object) number47);
        java.util.Collection collection49 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list52 = timeSeries51.data;
        int int53 = timeSeries51.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        timeSeries51.removePropertyChangeListener(propertyChangeListener54);
        long long56 = timeSeries51.getMaximumItemAge();
        org.jfree.data.time.Day day57 = new org.jfree.data.time.Day();
        int int59 = day57.compareTo((java.lang.Object) (short) 100);
        java.lang.String str60 = day57.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod61 = day57.next();
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day57, "Time", "Value");
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day67 = new org.jfree.data.time.Day();
        timeSeries66.add((org.jfree.data.time.RegularTimePeriod) day67, (double) (short) 0, false);
        java.util.Date date71 = day67.getStart();
        long long72 = day67.getFirstMillisecond();
        java.util.Date date73 = day67.getEnd();
        org.jfree.data.time.Year year74 = new org.jfree.data.time.Year(date73);
        org.jfree.data.time.Month month75 = new org.jfree.data.time.Month(date73);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod76 = month75.previous();
        java.lang.Number number77 = timeSeries64.getValue(regularTimePeriod76);
        org.jfree.data.time.TimeSeries timeSeries78 = timeSeries51.addAndOrUpdate(timeSeries64);
        boolean boolean79 = timeSeries25.equals((java.lang.Object) timeSeries51);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "6-April-2024" + "'", str18, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(regularTimePeriod38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "6-April-2024" + "'", str45, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem46);
        org.junit.Assert.assertEquals("'" + number47 + "' != '" + 0.0d + "'", number47, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 9223372036854775807L + "'", long56 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "6-April-2024" + "'", str60, "6-April-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod61);
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1712386800000L + "'", long72 == 1712386800000L);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod76);
        org.junit.Assert.assertNull(number77);
        org.junit.Assert.assertNotNull(timeSeries78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        long long6 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        double double10 = timeSeries1.getMinY();
        double double11 = timeSeries1.getMaxY();
        timeSeries1.setMaximumItemAge((long) 2024);
        java.lang.Number number15 = timeSeries1.getValue(0);
        timeSeries1.setMaximumItemAge(1712440480938L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 0.0d + "'", number15, 0.0d);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        long long20 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month();
        long long22 = month21.getFirstMillisecond();
        long long23 = month21.getLastMillisecond();
        boolean boolean24 = timeSeries1.equals((java.lang.Object) month21);
        timeSeries1.removeAgedItems(false);
        boolean boolean27 = timeSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1711954800000L + "'", long22 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1714546799999L + "'", long23 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.lang.Class class0 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        java.util.Date date7 = day3.getStart();
        long long8 = day3.getFirstMillisecond();
        java.util.Date date9 = day3.getEnd();
        org.jfree.data.time.Year year10 = new org.jfree.data.time.Year(date9);
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month(date9);
        java.util.TimeZone timeZone12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = org.jfree.data.time.RegularTimePeriod.createInstance(class0, date9, timeZone12);
        org.jfree.data.time.Year year14 = new org.jfree.data.time.Year(date9);
        java.util.TimeZone timeZone15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month16 = new org.jfree.data.time.Month(date9, timeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1712386800000L + "'", long8 == 1712386800000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod13);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond(1714546799999L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = fixedMillisecond1.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = fixedMillisecond1.next();
        java.util.Calendar calendar4 = null;
        long long5 = fixedMillisecond1.getLastMillisecond(calendar4);
        java.util.Calendar calendar6 = null;
        long long7 = fixedMillisecond1.getMiddleMillisecond(calendar6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = fixedMillisecond1.next();
        long long9 = fixedMillisecond1.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = fixedMillisecond1.next();
        java.util.Calendar calendar11 = null;
        fixedMillisecond1.peg(calendar11);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1714546799999L + "'", long5 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1714546799999L + "'", long7 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1714546799999L + "'", long9 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        java.util.Date date18 = regularTimePeriod17.getStart();
        org.jfree.data.time.Month month19 = new org.jfree.data.time.Month(date18);
        org.jfree.data.time.FixedMillisecond fixedMillisecond20 = new org.jfree.data.time.FixedMillisecond(date18);
        long long21 = fixedMillisecond20.getMiddleMillisecond();
        java.util.Date date22 = fixedMillisecond20.getStart();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1712300400000L + "'", long21 == 1712300400000L);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Fri Apr 05 00:00:00 PDT 2024");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
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
        int int21 = day16.getDayOfMonth();
        java.lang.Number number22 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day16, number22);
        java.lang.String str24 = day16.toString();
        java.lang.String str25 = day16.toString();
        java.util.Date date26 = day16.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond27 = new org.jfree.data.time.FixedMillisecond(date26);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "6-April-2024" + "'", str19, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "6-April-2024" + "'", str24, "6-April-2024");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "6-April-2024" + "'", str25, "6-April-2024");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Apr 06 00:00:00 PDT 2024");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean18 = timeSeries17.isEmpty();
        timeSeries17.clear();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double24 = timeSeries23.getMaxY();
        java.lang.Comparable comparable25 = timeSeries23.getKey();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        timeSeries27.add((org.jfree.data.time.RegularTimePeriod) day28, (double) (short) 0, false);
        timeSeries27.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = timeSeries27.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent36 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean37 = timeSeries27.equals((java.lang.Object) seriesChangeEvent36);
        org.jfree.data.time.Day day38 = new org.jfree.data.time.Day();
        int int40 = day38.compareTo((java.lang.Object) (short) 100);
        java.lang.String str41 = day38.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries27.getDataItem((org.jfree.data.time.RegularTimePeriod) day38);
        int int43 = day38.getDayOfMonth();
        java.lang.Number number44 = null;
        timeSeries23.add((org.jfree.data.time.RegularTimePeriod) day38, number44);
        java.lang.String str46 = day38.toString();
        timeSeries17.setKey((java.lang.Comparable) day38);
        boolean boolean48 = day10.equals((java.lang.Object) day38);
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double51 = timeSeries50.getMaxY();
        org.jfree.data.time.Day day52 = new org.jfree.data.time.Day();
        java.lang.Number number53 = null;
        timeSeries50.add((org.jfree.data.time.RegularTimePeriod) day52, number53, false);
        int int56 = day52.getMonth();
        int int57 = day52.getYear();
        long long58 = day52.getFirstMillisecond();
        int int59 = day10.compareTo((java.lang.Object) day52);
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) int59, "org.jfree.data.event.SeriesChangeEvent[source=Sat Apr 06 00:00:00 PDT 2024]", "org.jfree.data.event.SeriesChangeEvent[source=1711954800000]");
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list65 = timeSeries64.data;
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day68 = new org.jfree.data.time.Day();
        timeSeries67.add((org.jfree.data.time.RegularTimePeriod) day68, (double) (short) 0, false);
        timeSeries67.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod74 = timeSeries67.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent76 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean77 = timeSeries67.equals((java.lang.Object) seriesChangeEvent76);
        org.jfree.data.time.Day day78 = new org.jfree.data.time.Day();
        int int80 = day78.compareTo((java.lang.Object) (short) 100);
        java.lang.String str81 = day78.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem82 = timeSeries67.getDataItem((org.jfree.data.time.RegularTimePeriod) day78);
        boolean boolean83 = timeSeriesDataItem82.isSelected();
        int int85 = timeSeriesDataItem82.compareTo((java.lang.Object) 2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem86 = timeSeries64.addOrUpdate(timeSeriesDataItem82);
        java.lang.Object obj87 = timeSeriesDataItem82.clone();
        timeSeries62.add(timeSeriesDataItem82, false);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 100L + "'", comparable25, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "6-April-2024" + "'", str41, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 6 + "'", int43 == 6);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "6-April-2024" + "'", str46, "6-April-2024");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 4 + "'", int56 == 4);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2024 + "'", int57 == 2024);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1712386800000L + "'", long58 == 1712386800000L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertNotNull(regularTimePeriod74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "6-April-2024" + "'", str81, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem86);
        org.junit.Assert.assertNotNull(obj87);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list7 = timeSeries6.data;
        int int8 = timeSeries6.getItemCount();
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month();
        long long10 = month9.getFirstMillisecond();
        long long11 = month9.getLastMillisecond();
        long long12 = month9.getFirstMillisecond();
        org.jfree.data.time.Year year13 = month9.getYear();
        timeSeries6.delete((org.jfree.data.time.RegularTimePeriod) month9);
        long long15 = month9.getSerialIndex();
        int int16 = month9.getMonth();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) month9, (java.lang.Number) 1712559599999L);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711954800000L + "'", long10 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1714546799999L + "'", long11 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711954800000L + "'", long12 == 1711954800000L);
        org.junit.Assert.assertNotNull(year13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 24292L + "'", long15 == 24292L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        long long20 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        java.util.List list23 = timeSeries22.getItems();
        timeSeries1.data = list23;
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries28.addChangeListener(seriesChangeListener29);
        long long31 = timeSeries28.getMaximumItemAge();
        java.lang.String str32 = timeSeries28.getDescription();
        double double33 = timeSeries28.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day36 = new org.jfree.data.time.Day();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) day36, (double) (short) 0, false);
        timeSeries35.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = timeSeries35.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent44 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean45 = timeSeries35.equals((java.lang.Object) seriesChangeEvent44);
        org.jfree.data.time.Day day46 = new org.jfree.data.time.Day();
        int int48 = day46.compareTo((java.lang.Object) (short) 100);
        java.lang.String str49 = day46.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = timeSeries35.getDataItem((org.jfree.data.time.RegularTimePeriod) day46);
        timeSeries28.add(timeSeriesDataItem50);
        java.util.List list52 = timeSeries28.getItems();
        int int53 = timeSeries28.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day56 = new org.jfree.data.time.Day();
        timeSeries55.add((org.jfree.data.time.RegularTimePeriod) day56, (double) (short) 0, false);
        timeSeries55.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod62 = timeSeries55.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent64 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean65 = timeSeries55.equals((java.lang.Object) seriesChangeEvent64);
        org.jfree.data.time.Day day66 = new org.jfree.data.time.Day();
        int int68 = day66.compareTo((java.lang.Object) (short) 100);
        java.lang.String str69 = day66.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem70 = timeSeries55.getDataItem((org.jfree.data.time.RegularTimePeriod) day66);
        java.lang.Class<?> wildcardClass71 = day66.getClass();
        timeSeries28.timePeriodClass = wildcardClass71;
        timeSeries28.removeAgedItems(true);
        int int75 = timeSeries28.getItemCount();
        timeSeries28.fireSeriesChanged();
        java.util.Collection collection77 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(regularTimePeriod42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "6-April-2024" + "'", str49, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem50);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "6-April-2024" + "'", str69, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(collection77);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent1 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo2 = null;
        seriesChangeEvent1.setSummary(seriesChangeInfo2);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo4 = null;
        seriesChangeEvent1.setSummary(seriesChangeInfo4);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo6 = seriesChangeEvent1.getSummary();
        org.junit.Assert.assertNull(seriesChangeInfo6);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        java.lang.Object obj17 = timeSeriesDataItem16.clone();
        timeSeriesDataItem16.setValue((java.lang.Number) 1712386800000L);
        timeSeriesDataItem16.setValue((java.lang.Number) 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        long long8 = day2.getLastMillisecond();
        long long9 = day2.getSerialIndex();
        long long10 = day2.getLastMillisecond();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712386800000L + "'", long7 == 1712386800000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1712473199999L + "'", long8 == 1712473199999L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 45388L + "'", long9 == 45388L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1712473199999L + "'", long10 == 1712473199999L);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        java.lang.String str3 = day0.toString();
        int int4 = day0.getMonth();
        java.util.Date date5 = day0.getStart();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent6 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) date5);
        java.lang.Object obj7 = seriesChangeEvent6.getSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6-April-2024" + "'", str3, "6-April-2024");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "Sat Apr 06 00:00:00 PDT 2024");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        int int17 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.addChangeListener(seriesChangeListener20);
        long long22 = timeSeries19.getMaximumItemAge();
        org.jfree.data.time.Year year23 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.Day day27 = new org.jfree.data.time.Day();
        java.lang.Number number28 = null;
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day27, number28, false);
        int int31 = day27.getMonth();
        int int32 = day27.getYear();
        boolean boolean33 = year23.equals((java.lang.Object) day27);
        long long34 = year23.getSerialIndex();
        timeSeries19.delete((org.jfree.data.time.RegularTimePeriod) year23);
        java.util.Collection collection36 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        double double37 = timeSeries1.getMinY();
        java.lang.String str38 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries1.getRawDataItem(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2024 + "'", int32 == 2024);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 2024L + "'", long34 == 2024L);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double7 = timeSeries6.getMaxY();
        java.lang.Comparable comparable8 = timeSeries6.getKey();
        boolean boolean9 = timeSeries6.getNotify();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        java.lang.Number number14 = null;
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day13, number14, false);
        long long17 = day13.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries6.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day13, (java.lang.Number) 9999);
        long long20 = day13.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = day13.next();
        long long23 = day13.getLastMillisecond();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100L + "'", comparable8, 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 45388L + "'", long17 == 45388L);
        org.junit.Assert.assertNull(timeSeriesDataItem19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 45388L + "'", long20 == 45388L);
        org.junit.Assert.assertNull(timeSeriesDataItem21);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1712473199999L + "'", long23 == 1712473199999L);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jfree.data.time.Year year2 = new org.jfree.data.time.Year((int) (short) -1);
        long long3 = year2.getFirstMillisecond();
        long long4 = year2.getFirstMillisecond();
        org.jfree.data.time.Month month5 = new org.jfree.data.time.Month(6, year2);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) month5, "org.jfree.data.event.SeriesChangeEvent[source=1711954800000]", "org.jfree.data.event.SeriesChangeEvent[source=1711954800000]");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day11 = new org.jfree.data.time.Day();
        timeSeries10.add((org.jfree.data.time.RegularTimePeriod) day11, (double) (short) 0, false);
        timeSeries10.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries10.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent19 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean20 = timeSeries10.equals((java.lang.Object) seriesChangeEvent19);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        int int23 = day21.compareTo((java.lang.Object) (short) 100);
        java.lang.String str24 = day21.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries10.getDataItem((org.jfree.data.time.RegularTimePeriod) day21);
        java.lang.Number number26 = timeSeriesDataItem25.getValue();
        java.lang.Number number27 = timeSeriesDataItem25.getValue();
        timeSeriesDataItem25.setSelected(true);
        org.jfree.data.time.Month month30 = new org.jfree.data.time.Month();
        long long31 = month30.getFirstMillisecond();
        long long32 = month30.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = month30.next();
        long long34 = month30.getLastMillisecond();
        int int35 = timeSeriesDataItem25.compareTo((java.lang.Object) month30);
        timeSeries8.add(timeSeriesDataItem25);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-62198899200000L) + "'", long3 == (-62198899200000L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-62198899200000L) + "'", long4 == (-62198899200000L));
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "6-April-2024" + "'", str24, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 0.0d + "'", number26, 0.0d);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 0.0d + "'", number27, 0.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1711954800000L + "'", long31 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1714546799999L + "'", long32 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1714546799999L + "'", long34 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
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
        timeSeries1.add(timeSeriesDataItem30, false);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener34);
        boolean boolean36 = timeSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "6-April-2024" + "'", str29, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        java.util.Date date18 = regularTimePeriod17.getStart();
        org.jfree.data.time.Month month19 = new org.jfree.data.time.Month(date18);
        org.jfree.data.time.FixedMillisecond fixedMillisecond20 = new org.jfree.data.time.FixedMillisecond(date18);
        long long21 = fixedMillisecond20.getMiddleMillisecond();
        long long22 = fixedMillisecond20.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        timeSeries24.add((org.jfree.data.time.RegularTimePeriod) day25, (double) (short) 0, false);
        java.util.Date date29 = day25.getStart();
        long long30 = day25.getFirstMillisecond();
        java.util.Date date31 = day25.getEnd();
        org.jfree.data.time.Year year32 = new org.jfree.data.time.Year(date31);
        org.jfree.data.time.Month month33 = new org.jfree.data.time.Month(date31);
        int int34 = month33.getYearValue();
        int int35 = fixedMillisecond20.compareTo((java.lang.Object) month33);
        java.util.Date date36 = month33.getEnd();
        org.jfree.data.time.Month month37 = new org.jfree.data.time.Month();
        long long38 = month37.getFirstMillisecond();
        long long39 = month37.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = month37.next();
        long long41 = month37.getSerialIndex();
        int int42 = month37.getMonth();
        int int43 = month33.compareTo((java.lang.Object) int42);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1712300400000L + "'", long21 == 1712300400000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1712300400000L + "'", long22 == 1712300400000L);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1712386800000L + "'", long30 == 1712386800000L);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2024 + "'", int34 == 2024);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Tue Apr 30 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1711954800000L + "'", long38 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1714546799999L + "'", long39 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 24292L + "'", long41 == 24292L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        int int27 = day25.compareTo((java.lang.Object) (short) 100);
        long long28 = day25.getMiddleMillisecond();
        int int30 = day25.compareTo((java.lang.Object) 45388L);
        java.util.Date date31 = day25.getEnd();
        java.util.Date date32 = day25.getEnd();
        int int33 = timeSeriesDataItem23.compareTo((java.lang.Object) date32);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1712429999999L + "'", long28 == 1712429999999L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = month0.next();
        long long4 = month0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = month0.next();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = month0.getLastMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714546799999L + "'", long2 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1714546799999L + "'", long4 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
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
        timeSeries1.setDescription("6-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries30.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent39 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean40 = timeSeries30.equals((java.lang.Object) seriesChangeEvent39);
        org.jfree.data.time.Day day41 = new org.jfree.data.time.Day();
        int int43 = day41.compareTo((java.lang.Object) (short) 100);
        java.lang.String str44 = day41.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries30.getDataItem((org.jfree.data.time.RegularTimePeriod) day41);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day41, (double) 4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = timeSeriesDataItem47.getPeriod();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = timeSeriesDataItem47.getPeriod();
        timeSeriesDataItem47.setSelected(true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "6-April-2024" + "'", str44, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem45);
        org.junit.Assert.assertNotNull(timeSeriesDataItem47);
        org.junit.Assert.assertNotNull(regularTimePeriod48);
        org.junit.Assert.assertNotNull(regularTimePeriod49);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        int int27 = timeSeries1.getItemCount();
        boolean boolean28 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = day31.next();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day31, (double) 9223372036854775807L);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day40 = new org.jfree.data.time.Day();
        timeSeries39.add((org.jfree.data.time.RegularTimePeriod) day40, (double) (short) 0, false);
        java.util.Date date44 = day40.getStart();
        org.jfree.data.time.SerialDate serialDate45 = day40.getSerialDate();
        int int46 = day40.getYear();
        long long47 = day40.getLastMillisecond();
        org.jfree.data.time.SerialDate serialDate48 = day40.getSerialDate();
        org.jfree.data.time.Day day49 = new org.jfree.data.time.Day(serialDate48);
        org.jfree.data.time.Day day50 = new org.jfree.data.time.Day(serialDate48);
        long long51 = day50.getSerialIndex();
        int int52 = day50.getDayOfMonth();
        boolean boolean53 = day31.equals((java.lang.Object) day50);
        java.util.Calendar calendar54 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long55 = day50.getFirstMillisecond(calendar54);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod35);
        org.junit.Assert.assertNotNull(timeSeriesDataItem37);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2024 + "'", int46 == 2024);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1712473199999L + "'", long47 == 1712473199999L);
        org.junit.Assert.assertNotNull(serialDate48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 45388L + "'", long51 == 45388L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 6 + "'", int52 == 6);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        java.lang.String str34 = timeSeries1.getDomainDescription();
        java.util.List list35 = timeSeries1.getItems();
        double double36 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries38.removeChangeListener(seriesChangeListener39);
        java.lang.String str41 = timeSeries38.getRangeDescription();
        java.util.List list42 = timeSeries38.getItems();
        java.util.List list43 = timeSeries38.data;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day46 = new org.jfree.data.time.Day();
        timeSeries45.add((org.jfree.data.time.RegularTimePeriod) day46, (double) (short) 0, false);
        timeSeries45.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod52 = timeSeries45.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent54 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean55 = timeSeries45.equals((java.lang.Object) seriesChangeEvent54);
        org.jfree.data.time.Day day56 = new org.jfree.data.time.Day();
        int int58 = day56.compareTo((java.lang.Object) (short) 100);
        java.lang.String str59 = day56.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem60 = timeSeries45.getDataItem((org.jfree.data.time.RegularTimePeriod) day56);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod61 = day56.previous();
        java.util.Date date62 = regularTimePeriod61.getStart();
        org.jfree.data.time.Month month63 = new org.jfree.data.time.Month(date62);
        org.jfree.data.time.FixedMillisecond fixedMillisecond64 = new org.jfree.data.time.FixedMillisecond(date62);
        org.jfree.data.time.Day day65 = new org.jfree.data.time.Day();
        int int67 = day65.compareTo((java.lang.Object) (short) 100);
        java.lang.String str68 = day65.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod69 = day65.next();
        org.jfree.data.time.TimeSeries timeSeries72 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day65, "Time", "Value");
        boolean boolean73 = fixedMillisecond64.equals((java.lang.Object) day65);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem75 = timeSeries38.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day65, (java.lang.Number) (byte) 100);
        timeSeries38.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries77 = timeSeries1.addAndOrUpdate(timeSeries38);
        int int78 = timeSeries38.getMaximumItemCount();
        timeSeries38.setNotify(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712429999999L + "'", long32 == 1712429999999L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Time" + "'", str34, "Time");
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value" + "'", str41, "Value");
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(regularTimePeriod52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "6-April-2024" + "'", str59, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem60);
        org.junit.Assert.assertNotNull(regularTimePeriod61);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "6-April-2024" + "'", str68, "6-April-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(timeSeriesDataItem75);
        org.junit.Assert.assertNotNull(timeSeries77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2147483647 + "'", int78 == 2147483647);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        java.util.Date date18 = regularTimePeriod17.getStart();
        org.jfree.data.time.Month month19 = new org.jfree.data.time.Month(date18);
        org.jfree.data.time.FixedMillisecond fixedMillisecond20 = new org.jfree.data.time.FixedMillisecond(date18);
        java.util.Calendar calendar21 = null;
        fixedMillisecond20.peg(calendar21);
        long long23 = fixedMillisecond20.getFirstMillisecond();
        java.util.Calendar calendar24 = null;
        long long25 = fixedMillisecond20.getFirstMillisecond(calendar24);
        long long26 = fixedMillisecond20.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = fixedMillisecond20.previous();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1712300400000L + "'", long23 == 1712300400000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1712300400000L + "'", long25 == 1712300400000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1712300400000L + "'", long26 == 1712300400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod27);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        java.lang.String str34 = timeSeries1.getDomainDescription();
        boolean boolean35 = timeSeries1.isEmpty();
        timeSeries1.setDomainDescription("Value");
        timeSeries1.clear();
        timeSeries1.setDescription("February -1");
        java.lang.String str41 = timeSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712429999999L + "'", long32 == 1712429999999L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Time" + "'", str34, "Time");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "February -1" + "'", str41, "February -1");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year((int) (short) -1);
        long long2 = year1.getFirstMillisecond();
        java.util.Date date3 = year1.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = year1.previous();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year1, (java.lang.Number) 24298L);
        java.lang.String str7 = year1.toString();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = year1.getFirstMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-62198899200000L) + "'", long2 == (-62198899200000L));
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sun Dec 31 23:59:59 PST 2");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        java.lang.String str8 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        java.lang.Number number13 = null;
        timeSeries10.add((org.jfree.data.time.RegularTimePeriod) day12, number13, false);
        double double16 = timeSeries10.getMaxY();
        java.lang.Object obj17 = timeSeries10.clone();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean20 = timeSeries19.isEmpty();
        long long21 = timeSeries19.getMaximumItemAge();
        timeSeries19.removeAgedItems(1711954800000L, false);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = timeSeries26.getRangeDescription();
        boolean boolean30 = timeSeries26.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries19.addAndOrUpdate(timeSeries26);
        java.lang.Class class32 = timeSeries31.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries10.addAndOrUpdate(timeSeries31);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries1.addAndOrUpdate(timeSeries31);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNull(class32);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        timeSeries1.setDescription("6-April-2024");
        java.lang.String str29 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries31.addChangeListener(seriesChangeListener32);
        long long34 = timeSeries31.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries31.removePropertyChangeListener(propertyChangeListener35);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries38.addChangeListener(seriesChangeListener39);
        long long41 = timeSeries38.getMaximumItemAge();
        java.lang.String str42 = timeSeries38.getDescription();
        double double43 = timeSeries38.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day46 = new org.jfree.data.time.Day();
        timeSeries45.add((org.jfree.data.time.RegularTimePeriod) day46, (double) (short) 0, false);
        timeSeries45.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod52 = timeSeries45.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent54 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean55 = timeSeries45.equals((java.lang.Object) seriesChangeEvent54);
        org.jfree.data.time.Day day56 = new org.jfree.data.time.Day();
        int int58 = day56.compareTo((java.lang.Object) (short) 100);
        java.lang.String str59 = day56.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem60 = timeSeries45.getDataItem((org.jfree.data.time.RegularTimePeriod) day56);
        timeSeries38.add(timeSeriesDataItem60);
        timeSeries31.add(timeSeriesDataItem60, false);
        boolean boolean64 = timeSeriesDataItem60.isSelected();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem60);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 6-April-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Time" + "'", str29, "Time");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 9223372036854775807L + "'", long41 == 9223372036854775807L);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(regularTimePeriod52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "6-April-2024" + "'", str59, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        timeSeries1.setDescription("6-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries1.addAndOrUpdate(timeSeries30);
        double double38 = timeSeries37.getMinY();
        java.util.List list39 = timeSeries37.getItems();
        java.lang.Object obj40 = timeSeries37.clone();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        long long6 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        double double10 = timeSeries1.getMinY();
        double double11 = timeSeries1.getMaxY();
        timeSeries1.setMaximumItemAge((long) 2024);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener14);
        timeSeries1.removeAgedItems(false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jfree.data.general.SeriesException seriesException1 = new org.jfree.data.general.SeriesException("Wed May 01 00:00:00 PDT 2024");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.Month month7 = new org.jfree.data.time.Month(date6);
        long long8 = month7.getSerialIndex();
        java.util.Date date9 = month7.getEnd();
        java.util.Date date10 = month7.getStart();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 24292L + "'", long8 == 24292L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Apr 30 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Mon Apr 01 00:00:00 PDT 2024");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        java.util.Date date18 = regularTimePeriod17.getStart();
        org.jfree.data.time.Month month19 = new org.jfree.data.time.Month(date18);
        org.jfree.data.time.FixedMillisecond fixedMillisecond20 = new org.jfree.data.time.FixedMillisecond(date18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = fixedMillisecond20.previous();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries23.addChangeListener(seriesChangeListener24);
        org.jfree.data.time.Month month26 = new org.jfree.data.time.Month();
        long long27 = month26.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries29.removeChangeListener(seriesChangeListener30);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day34 = new org.jfree.data.time.Day();
        timeSeries33.add((org.jfree.data.time.RegularTimePeriod) day34, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = timeSeries29.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day34, (java.lang.Number) 10L);
        long long40 = day34.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries23.createCopy((org.jfree.data.time.RegularTimePeriod) month26, (org.jfree.data.time.RegularTimePeriod) day34);
        long long42 = timeSeries23.getMaximumItemAge();
        org.jfree.data.time.Month month43 = new org.jfree.data.time.Month();
        long long44 = month43.getFirstMillisecond();
        long long45 = month43.getLastMillisecond();
        boolean boolean46 = timeSeries23.equals((java.lang.Object) month43);
        java.lang.Object obj47 = timeSeries23.clone();
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
        java.util.List list73 = timeSeries49.getItems();
        timeSeries23.data = list73;
        int int75 = fixedMillisecond20.compareTo((java.lang.Object) timeSeries23);
        org.jfree.data.time.Day day76 = new org.jfree.data.time.Day();
        int int78 = day76.compareTo((java.lang.Object) (short) 100);
        java.lang.String str79 = day76.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod80 = day76.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod81 = day76.next();
        int int82 = fixedMillisecond20.compareTo((java.lang.Object) day76);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod21);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1711954800000L + "'", long27 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1712429999999L + "'", long40 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 9223372036854775807L + "'", long42 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1711954800000L + "'", long44 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1714546799999L + "'", long45 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 9223372036854775807L + "'", long52 == 9223372036854775807L);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(regularTimePeriod63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "6-April-2024" + "'", str70, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem71);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "6-April-2024" + "'", str79, "6-April-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod80);
        org.junit.Assert.assertNotNull(regularTimePeriod81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        java.util.Date date18 = regularTimePeriod17.getStart();
        org.jfree.data.time.Month month19 = new org.jfree.data.time.Month(date18);
        org.jfree.data.time.FixedMillisecond fixedMillisecond20 = new org.jfree.data.time.FixedMillisecond(date18);
        long long21 = fixedMillisecond20.getMiddleMillisecond();
        long long22 = fixedMillisecond20.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        timeSeries24.add((org.jfree.data.time.RegularTimePeriod) day25, (double) (short) 0, false);
        java.util.Date date29 = day25.getStart();
        long long30 = day25.getFirstMillisecond();
        java.util.Date date31 = day25.getEnd();
        org.jfree.data.time.Year year32 = new org.jfree.data.time.Year(date31);
        org.jfree.data.time.Month month33 = new org.jfree.data.time.Month(date31);
        int int34 = month33.getYearValue();
        int int35 = fixedMillisecond20.compareTo((java.lang.Object) month33);
        java.util.Calendar calendar36 = null;
        fixedMillisecond20.peg(calendar36);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1712300400000L + "'", long21 == 1712300400000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1712300400000L + "'", long22 == 1712300400000L);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1712386800000L + "'", long30 == 1712386800000L);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2024 + "'", int34 == 2024);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.Year year9 = new org.jfree.data.time.Year((int) (short) -1);
        long long10 = year9.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year9, (java.lang.Number) 9223372036854775807L);
        long long13 = year9.getSerialIndex();
        boolean boolean15 = year9.equals((java.lang.Object) 9999);
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) year9, (java.lang.Number) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = timeSeries1.getNextTimePeriod();
        timeSeries1.setDomainDescription("org.jfree.data.event.SeriesChangeEvent[source=10.0]");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day23 = new org.jfree.data.time.Day();
        timeSeries22.add((org.jfree.data.time.RegularTimePeriod) day23, (double) (short) 0, false);
        timeSeries22.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = timeSeries22.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent31 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean32 = timeSeries22.equals((java.lang.Object) seriesChangeEvent31);
        org.jfree.data.time.Day day33 = new org.jfree.data.time.Day();
        int int35 = day33.compareTo((java.lang.Object) (short) 100);
        java.lang.String str36 = day33.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries22.getDataItem((org.jfree.data.time.RegularTimePeriod) day33);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = day33.previous();
        java.util.Date date39 = regularTimePeriod38.getStart();
        org.jfree.data.time.Month month40 = new org.jfree.data.time.Month(date39);
        org.jfree.data.time.FixedMillisecond fixedMillisecond41 = new org.jfree.data.time.FixedMillisecond(date39);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries43.removeChangeListener(seriesChangeListener44);
        java.lang.String str46 = timeSeries43.getRangeDescription();
        boolean boolean47 = timeSeries43.isEmpty();
        timeSeries43.removeAgedItems((-1L), false);
        boolean boolean51 = fixedMillisecond41.equals((java.lang.Object) timeSeries43);
        java.util.Calendar calendar52 = null;
        long long53 = fixedMillisecond41.getMiddleMillisecond(calendar52);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod54 = fixedMillisecond41.next();
        int int55 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) fixedMillisecond41);
        timeSeries1.setRangeDescription("org.jfree.data.general.SeriesException: ");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-62198899200000L) + "'", long10 == (-62198899200000L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
        org.junit.Assert.assertNotNull(regularTimePeriod29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "6-April-2024" + "'", str36, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem37);
        org.junit.Assert.assertNotNull(regularTimePeriod38);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value" + "'", str46, "Value");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1712300400000L + "'", long53 == 1712300400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        java.util.List list25 = timeSeries1.getItems();
        int int26 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day29 = new org.jfree.data.time.Day();
        timeSeries28.add((org.jfree.data.time.RegularTimePeriod) day29, (double) (short) 0, false);
        timeSeries28.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = timeSeries28.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent37 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean38 = timeSeries28.equals((java.lang.Object) seriesChangeEvent37);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        int int41 = day39.compareTo((java.lang.Object) (short) 100);
        java.lang.String str42 = day39.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries28.getDataItem((org.jfree.data.time.RegularTimePeriod) day39);
        java.lang.Class<?> wildcardClass44 = day39.getClass();
        timeSeries1.timePeriodClass = wildcardClass44;
        int int46 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day49 = new org.jfree.data.time.Day();
        timeSeries48.add((org.jfree.data.time.RegularTimePeriod) day49, (double) (short) 0, false);
        timeSeries48.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod55 = timeSeries48.getNextTimePeriod();
        java.util.List list56 = timeSeries48.data;
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day59 = new org.jfree.data.time.Day();
        timeSeries58.add((org.jfree.data.time.RegularTimePeriod) day59, (double) (short) 0, false);
        java.util.Date date63 = day59.getStart();
        long long64 = day59.getFirstMillisecond();
        java.util.Date date65 = day59.getEnd();
        org.jfree.data.time.Year year66 = new org.jfree.data.time.Year(date65);
        org.jfree.data.time.Month month67 = new org.jfree.data.time.Month(date65);
        java.lang.String str68 = month67.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem70 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month67, (double) '#');
        timeSeries48.delete((org.jfree.data.time.RegularTimePeriod) month67);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem72 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) month67);
        java.lang.Object obj73 = timeSeriesDataItem72.clone();
        java.lang.Class<?> wildcardClass74 = timeSeriesDataItem72.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "6-April-2024" + "'", str42, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertNotNull(regularTimePeriod55);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1712386800000L + "'", long64 == 1712386800000L);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "April 2024" + "'", str68, "April 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem72);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        java.lang.String str3 = day0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = day0.next();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day0, "Time", "Value");
        boolean boolean8 = timeSeries7.isEmpty();
        timeSeries7.setMaximumItemAge(45388L);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Value");
        java.util.List list15 = timeSeries14.data;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double18 = timeSeries17.getMaxY();
        java.lang.Comparable comparable19 = timeSeries17.getKey();
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
        int int37 = day32.getDayOfMonth();
        java.lang.Number number38 = null;
        timeSeries17.add((org.jfree.data.time.RegularTimePeriod) day32, number38);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries14.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day32);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = day32.next();
        java.util.Date date42 = regularTimePeriod41.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond44 = new org.jfree.data.time.FixedMillisecond(1714546799999L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = fixedMillisecond44.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = fixedMillisecond44.next();
        java.util.Calendar calendar47 = null;
        long long48 = fixedMillisecond44.getLastMillisecond(calendar47);
        java.util.Calendar calendar49 = null;
        long long50 = fixedMillisecond44.getMiddleMillisecond(calendar49);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = fixedMillisecond44.next();
        long long52 = fixedMillisecond44.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod53 = fixedMillisecond44.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod54 = fixedMillisecond44.next();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries7.createCopy(regularTimePeriod41, (org.jfree.data.time.RegularTimePeriod) fixedMillisecond44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6-April-2024" + "'", str3, "6-April-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 100L + "'", comparable19, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "6-April-2024" + "'", str35, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6 + "'", int37 == 6);
        org.junit.Assert.assertNull(timeSeriesDataItem40);
        org.junit.Assert.assertNotNull(regularTimePeriod41);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sun Apr 07 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod45);
        org.junit.Assert.assertNotNull(regularTimePeriod46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1714546799999L + "'", long48 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1714546799999L + "'", long50 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1714546799999L + "'", long52 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod53);
        org.junit.Assert.assertNotNull(regularTimePeriod54);
        org.junit.Assert.assertNotNull(timeSeries55);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        timeSeries1.setDescription("6-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries1.addAndOrUpdate(timeSeries30);
        double double38 = timeSeries37.getMinY();
        timeSeries37.clear();
        org.jfree.data.time.Year year41 = new org.jfree.data.time.Year((int) (short) -1);
        long long42 = year41.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year41, (java.lang.Number) 9223372036854775807L);
        long long45 = year41.getSerialIndex();
        java.util.Date date46 = year41.getStart();
        timeSeries37.add((org.jfree.data.time.RegularTimePeriod) year41, (java.lang.Number) (-62198899200000L), false);
        timeSeries37.setRangeDescription("org.jfree.data.event.SeriesChangeEvent[source=1711954800000]");
        java.lang.String str52 = timeSeries37.getRangeDescription();
        java.util.Collection collection53 = timeSeries37.getTimePeriods();
        timeSeries37.setDescription("org.jfree.data.general.SeriesException: ");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-62198899200000L) + "'", long42 == (-62198899200000L));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Wed Jan 01 00:00:00 PST 2");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org.jfree.data.event.SeriesChangeEvent[source=1711954800000]" + "'", str52, "org.jfree.data.event.SeriesChangeEvent[source=1711954800000]");
        org.junit.Assert.assertNotNull(collection53);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        java.util.Date date18 = regularTimePeriod17.getStart();
        org.jfree.data.time.Month month19 = new org.jfree.data.time.Month(date18);
        org.jfree.data.time.FixedMillisecond fixedMillisecond20 = new org.jfree.data.time.FixedMillisecond(date18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = fixedMillisecond20.previous();
        long long22 = fixedMillisecond20.getMiddleMillisecond();
        java.util.Calendar calendar23 = null;
        long long24 = fixedMillisecond20.getLastMillisecond(calendar23);
        java.util.Date date25 = fixedMillisecond20.getEnd();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1712300400000L + "'", long22 == 1712300400000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1712300400000L + "'", long24 == 1712300400000L);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Fri Apr 05 00:00:00 PDT 2024");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        double double34 = timeSeries1.getMinY();
        int int35 = timeSeries1.getItemCount();
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
        boolean boolean61 = timeSeries37.getNotify();
        org.jfree.data.time.Month month64 = new org.jfree.data.time.Month(3, 0);
        timeSeries37.update((org.jfree.data.time.RegularTimePeriod) month64, (java.lang.Number) 1711954800000L);
        java.util.Date date67 = month64.getEnd();
        org.jfree.data.time.FixedMillisecond fixedMillisecond68 = new org.jfree.data.time.FixedMillisecond(date67);
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day71 = new org.jfree.data.time.Day();
        timeSeries70.add((org.jfree.data.time.RegularTimePeriod) day71, (double) (short) 0, false);
        java.util.Date date75 = day71.getStart();
        long long76 = day71.getFirstMillisecond();
        java.util.Date date77 = day71.getEnd();
        int int78 = fixedMillisecond68.compareTo((java.lang.Object) date77);
        java.util.Calendar calendar79 = null;
        fixedMillisecond68.peg(calendar79);
        java.util.Calendar calendar81 = null;
        fixedMillisecond68.peg(calendar81);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) fixedMillisecond68, 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712429999999L + "'", long32 == 1712429999999L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 9223372036854775807L + "'", long40 == 9223372036854775807L);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(regularTimePeriod51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "6-April-2024" + "'", str58, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Mar 31 23:59:59 PST 1");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1712386800000L + "'", long76 == 1712386800000L);
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Value");
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        timeSeries12.add((org.jfree.data.time.RegularTimePeriod) day13, (double) (short) 0, false);
        java.util.Date date17 = day13.getStart();
        long long18 = day13.getFirstMillisecond();
        java.util.Date date19 = day13.getEnd();
        org.jfree.data.time.Year year20 = new org.jfree.data.time.Year(date19);
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month(date19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = month21.previous();
        timeSeries10.add(regularTimePeriod22, (double) '4', true);
        int int26 = timeSeries1.getIndex(regularTimePeriod22);
        boolean boolean27 = timeSeries1.getNotify();
        java.lang.Comparable comparable28 = timeSeries1.getKey();
        timeSeries1.setMaximumItemAge(1712440626178L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712386800000L + "'", long18 == 1712386800000L);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + (short) 100 + "'", comparable28, (short) 100);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jfree.data.time.Month month1 = org.jfree.data.time.Month.parseMonth("April 2024");
        java.lang.String str2 = month1.toString();
        long long3 = month1.getLastMillisecond();
        org.jfree.data.time.Year year4 = month1.getYear();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        int int7 = timeSeries6.getItemCount();
        int int8 = timeSeries6.getItemCount();
        boolean boolean9 = year4.equals((java.lang.Object) timeSeries6);
        timeSeries6.setDomainDescription("org.jfree.data.event.SeriesChangeEvent[source=1711954800000]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries6.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(month1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "April 2024" + "'", str2, "April 2024");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1714546799999L + "'", long3 == 1714546799999L);
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jfree.data.time.Year year2 = new org.jfree.data.time.Year((int) (short) -1);
        long long3 = year2.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year2, (java.lang.Number) 9223372036854775807L);
        long long6 = year2.getSerialIndex();
        java.util.Date date7 = year2.getEnd();
        java.lang.String str8 = year2.toString();
        org.jfree.data.time.Month month9 = new org.jfree.data.time.Month(9, year2);
        long long10 = year2.getLastMillisecond();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-62198899200000L) + "'", long3 == (-62198899200000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sun Dec 31 23:59:59 PST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-62072668800001L) + "'", long10 == (-62072668800001L));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        java.util.List list5 = timeSeries1.getItems();
        java.util.List list6 = timeSeries1.data;
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = day19.previous();
        java.util.Date date25 = regularTimePeriod24.getStart();
        org.jfree.data.time.Month month26 = new org.jfree.data.time.Month(date25);
        org.jfree.data.time.FixedMillisecond fixedMillisecond27 = new org.jfree.data.time.FixedMillisecond(date25);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        int int30 = day28.compareTo((java.lang.Object) (short) 100);
        java.lang.String str31 = day28.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = day28.next();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day28, "Time", "Value");
        boolean boolean36 = fixedMillisecond27.equals((java.lang.Object) day28);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day28, (java.lang.Number) (byte) 100);
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries41.addChangeListener(seriesChangeListener42);
        long long44 = timeSeries41.getMaximumItemAge();
        java.lang.String str45 = timeSeries41.getDescription();
        double double46 = timeSeries41.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day49 = new org.jfree.data.time.Day();
        timeSeries48.add((org.jfree.data.time.RegularTimePeriod) day49, (double) (short) 0, false);
        timeSeries48.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod55 = timeSeries48.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent57 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean58 = timeSeries48.equals((java.lang.Object) seriesChangeEvent57);
        org.jfree.data.time.Day day59 = new org.jfree.data.time.Day();
        int int61 = day59.compareTo((java.lang.Object) (short) 100);
        java.lang.String str62 = day59.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem63 = timeSeries48.getDataItem((org.jfree.data.time.RegularTimePeriod) day59);
        timeSeries41.add(timeSeriesDataItem63);
        timeSeries41.setDescription("");
        timeSeries41.setDescription("6-April-2024");
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day71 = new org.jfree.data.time.Day();
        timeSeries70.add((org.jfree.data.time.RegularTimePeriod) day71, (double) (short) 0, false);
        timeSeries70.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries77 = timeSeries41.addAndOrUpdate(timeSeries70);
        java.beans.PropertyChangeListener propertyChangeListener78 = null;
        timeSeries41.removePropertyChangeListener(propertyChangeListener78);
        org.jfree.data.time.TimeSeries timeSeries80 = timeSeries1.addAndOrUpdate(timeSeries41);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries83 = timeSeries80.createCopy(10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "6-April-2024" + "'", str22, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "6-April-2024" + "'", str31, "6-April-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(timeSeriesDataItem38);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 9223372036854775807L + "'", long44 == 9223372036854775807L);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(regularTimePeriod55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "6-April-2024" + "'", str62, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem63);
        org.junit.Assert.assertNotNull(timeSeries77);
        org.junit.Assert.assertNotNull(timeSeries80);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
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
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean26 = timeSeries25.isEmpty();
        long long27 = timeSeries25.getMaximumItemAge();
        boolean boolean28 = timeSeries5.equals((java.lang.Object) long27);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list31 = timeSeries30.data;
        int int32 = timeSeries30.getItemCount();
        org.jfree.data.time.Month month33 = new org.jfree.data.time.Month();
        long long34 = month33.getFirstMillisecond();
        long long35 = month33.getLastMillisecond();
        long long36 = month33.getFirstMillisecond();
        org.jfree.data.time.Year year37 = month33.getYear();
        timeSeries30.delete((org.jfree.data.time.RegularTimePeriod) month33);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list41 = timeSeries40.data;
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
        boolean boolean59 = timeSeriesDataItem58.isSelected();
        int int61 = timeSeriesDataItem58.compareTo((java.lang.Object) 2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = timeSeries40.addOrUpdate(timeSeriesDataItem58);
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries30.addAndOrUpdate(timeSeries40);
        org.jfree.data.time.Year year64 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double67 = timeSeries66.getMaxY();
        org.jfree.data.time.Day day68 = new org.jfree.data.time.Day();
        java.lang.Number number69 = null;
        timeSeries66.add((org.jfree.data.time.RegularTimePeriod) day68, number69, false);
        int int72 = day68.getMonth();
        int int73 = day68.getYear();
        boolean boolean74 = year64.equals((java.lang.Object) day68);
        long long75 = year64.getSerialIndex();
        long long76 = year64.getLastMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem77 = timeSeries30.getDataItem((org.jfree.data.time.RegularTimePeriod) year64);
        long long78 = year64.getLastMillisecond();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) year64, (java.lang.Number) 3);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) year64, (java.lang.Number) 1712440541340L);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711954800000L + "'", long9 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1712429999999L + "'", long22 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1711954800000L + "'", long34 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1714546799999L + "'", long35 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1711954800000L + "'", long36 == 1711954800000L);
        org.junit.Assert.assertNotNull(year37);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(regularTimePeriod50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "6-April-2024" + "'", str57, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem62);
        org.junit.Assert.assertNotNull(timeSeries63);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 4 + "'", int72 == 4);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2024 + "'", int73 == 2024);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 2024L + "'", long75 == 2024L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1735718399999L + "'", long76 == 1735718399999L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem77);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1735718399999L + "'", long78 == 1735718399999L);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
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
        timeSeries1.add(timeSeriesDataItem30, false);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener34);
        java.lang.Class class36 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Value");
        java.util.List list41 = timeSeries40.data;
        org.jfree.data.time.Year year43 = new org.jfree.data.time.Year((int) (byte) -1);
        long long44 = year43.getLastMillisecond();
        timeSeries40.delete((org.jfree.data.time.RegularTimePeriod) year43);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day48 = new org.jfree.data.time.Day();
        timeSeries47.add((org.jfree.data.time.RegularTimePeriod) day48, (double) (short) 0, false);
        timeSeries47.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod54 = timeSeries47.getNextTimePeriod();
        java.util.List list55 = timeSeries47.data;
        java.lang.Class class56 = timeSeries47.timePeriodClass;
        boolean boolean57 = year43.equals((java.lang.Object) timeSeries47);
        org.jfree.data.time.Day day58 = new org.jfree.data.time.Day();
        int int60 = day58.compareTo((java.lang.Object) (short) 100);
        java.lang.String str61 = day58.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod62 = day58.next();
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day58, "Time", "Value");
        timeSeries47.setKey((java.lang.Comparable) day58);
        java.util.Date date67 = day58.getStart();
        java.util.TimeZone timeZone68 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod69 = org.jfree.data.time.RegularTimePeriod.createInstance(class36, date67, timeZone68);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "6-April-2024" + "'", str29, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem30);
        org.junit.Assert.assertNotNull(class36);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-62072668800001L) + "'", long44 == (-62072668800001L));
        org.junit.Assert.assertNotNull(regularTimePeriod54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(class56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "6-April-2024" + "'", str61, "6-April-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod62);
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod69);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        java.lang.Number number17 = timeSeriesDataItem16.getValue();
        java.lang.Object obj18 = timeSeriesDataItem16.clone();
        boolean boolean19 = timeSeriesDataItem16.isSelected();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.addChangeListener(seriesChangeListener22);
        long long24 = timeSeries21.getMaximumItemAge();
        java.lang.String str25 = timeSeries21.getDescription();
        double double26 = timeSeries21.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day29 = new org.jfree.data.time.Day();
        timeSeries28.add((org.jfree.data.time.RegularTimePeriod) day29, (double) (short) 0, false);
        timeSeries28.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = timeSeries28.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent37 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean38 = timeSeries28.equals((java.lang.Object) seriesChangeEvent37);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        int int41 = day39.compareTo((java.lang.Object) (short) 100);
        java.lang.String str42 = day39.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries28.getDataItem((org.jfree.data.time.RegularTimePeriod) day39);
        timeSeries21.add(timeSeriesDataItem43);
        timeSeries21.setDescription("");
        timeSeries21.setDescription("6-April-2024");
        int int49 = timeSeriesDataItem16.compareTo((java.lang.Object) timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Value");
        java.util.List list54 = timeSeries53.data;
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double57 = timeSeries56.getMaxY();
        java.lang.Comparable comparable58 = timeSeries56.getKey();
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day61 = new org.jfree.data.time.Day();
        timeSeries60.add((org.jfree.data.time.RegularTimePeriod) day61, (double) (short) 0, false);
        timeSeries60.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod67 = timeSeries60.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent69 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean70 = timeSeries60.equals((java.lang.Object) seriesChangeEvent69);
        org.jfree.data.time.Day day71 = new org.jfree.data.time.Day();
        int int73 = day71.compareTo((java.lang.Object) (short) 100);
        java.lang.String str74 = day71.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem75 = timeSeries60.getDataItem((org.jfree.data.time.RegularTimePeriod) day71);
        int int76 = day71.getDayOfMonth();
        java.lang.Number number77 = null;
        timeSeries56.add((org.jfree.data.time.RegularTimePeriod) day71, number77);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem79 = timeSeries53.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day71);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod80 = day71.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod81 = day71.next();
        boolean boolean82 = timeSeriesDataItem16.equals((java.lang.Object) regularTimePeriod81);
        java.lang.Number number83 = null;
        timeSeriesDataItem16.setValue(number83);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 0.0d + "'", number17, 0.0d);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(regularTimePeriod35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "6-April-2024" + "'", str42, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem43);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertEquals("'" + comparable58 + "' != '" + 100L + "'", comparable58, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "6-April-2024" + "'", str74, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 6 + "'", int76 == 6);
        org.junit.Assert.assertNull(timeSeriesDataItem79);
        org.junit.Assert.assertNotNull(regularTimePeriod80);
        org.junit.Assert.assertNotNull(regularTimePeriod81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.Day day5 = new org.jfree.data.time.Day();
        java.lang.Number number6 = null;
        timeSeries3.add((org.jfree.data.time.RegularTimePeriod) day5, number6, false);
        int int9 = day5.getMonth();
        int int10 = day5.getYear();
        boolean boolean11 = year1.equals((java.lang.Object) day5);
        org.jfree.data.time.Month month12 = new org.jfree.data.time.Month(7, year1);
        long long13 = year1.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = year1.next();
        java.util.Date date15 = year1.getStart();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2024 + "'", int10 == 2024);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1704096000000L + "'", long13 == 1704096000000L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Mon Jan 01 00:00:00 PST 2024");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = month0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = month0.next();
        org.jfree.data.time.Year year6 = new org.jfree.data.time.Year((int) (short) -1);
        long long7 = year6.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year6, (java.lang.Number) 9223372036854775807L);
        long long10 = year6.getSerialIndex();
        java.util.Date date11 = year6.getEnd();
        int int12 = month0.compareTo((java.lang.Object) year6);
        long long13 = month0.getSerialIndex();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714546799999L + "'", long2 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-62198899200000L) + "'", long7 == (-62198899200000L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sun Dec 31 23:59:59 PST 2");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 24292L + "'", long13 == 24292L);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
            long long19 = day12.getLastMillisecond(calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6-April-2024" + "'", str15, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        timeSeries19.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day24 = new org.jfree.data.time.Day();
        timeSeries23.add((org.jfree.data.time.RegularTimePeriod) day24, (double) (short) 0, false);
        timeSeries23.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = timeSeries23.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent32 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean33 = timeSeries23.equals((java.lang.Object) seriesChangeEvent32);
        org.jfree.data.time.Day day34 = new org.jfree.data.time.Day();
        int int36 = day34.compareTo((java.lang.Object) (short) 100);
        java.lang.String str37 = day34.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = timeSeries23.getDataItem((org.jfree.data.time.RegularTimePeriod) day34);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = day34.previous();
        java.util.Date date40 = regularTimePeriod39.getStart();
        org.jfree.data.time.Month month41 = new org.jfree.data.time.Month(date40);
        org.jfree.data.time.FixedMillisecond fixedMillisecond42 = new org.jfree.data.time.FixedMillisecond(date40);
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) fixedMillisecond42, (double) 11);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day47 = new org.jfree.data.time.Day();
        timeSeries46.add((org.jfree.data.time.RegularTimePeriod) day47, (double) (short) 0, false);
        java.util.Date date51 = day47.getStart();
        long long52 = day47.getFirstMillisecond();
        java.util.Date date53 = day47.getEnd();
        org.jfree.data.time.Year year54 = new org.jfree.data.time.Year(date53);
        org.jfree.data.time.Month month55 = new org.jfree.data.time.Month(date53);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod56 = month55.previous();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem58 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month55, (java.lang.Number) (-9999));
        timeSeries19.setKey((java.lang.Comparable) (-9999));
        int int60 = timeSeries19.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries63 = timeSeries19.createCopy(8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712429999999L + "'", long18 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(regularTimePeriod30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "6-April-2024" + "'", str37, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem38);
        org.junit.Assert.assertNotNull(regularTimePeriod39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Fri Apr 05 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1712386800000L + "'", long52 == 1712386800000L);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 32 + "'", int60 == 32);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        double double16 = timeSeries1.getMinY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list19 = timeSeries18.data;
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
        boolean boolean37 = timeSeriesDataItem36.isSelected();
        int int39 = timeSeriesDataItem36.compareTo((java.lang.Object) 2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries18.addOrUpdate(timeSeriesDataItem36);
        org.jfree.data.time.FixedMillisecond fixedMillisecond42 = new org.jfree.data.time.FixedMillisecond(1714546799999L);
        long long43 = fixedMillisecond42.getLastMillisecond();
        org.jfree.data.time.FixedMillisecond fixedMillisecond45 = new org.jfree.data.time.FixedMillisecond(1714546799999L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = fixedMillisecond45.previous();
        java.util.Calendar calendar47 = null;
        long long48 = fixedMillisecond45.getLastMillisecond(calendar47);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries18.createCopy((org.jfree.data.time.RegularTimePeriod) fixedMillisecond42, (org.jfree.data.time.RegularTimePeriod) fixedMillisecond45);
        java.util.Calendar calendar50 = null;
        long long51 = fixedMillisecond42.getFirstMillisecond(calendar50);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem52 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond42);
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "6-April-2024" + "'", str35, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1714546799999L + "'", long43 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1714546799999L + "'", long48 == 1714546799999L);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1714546799999L + "'", long51 == 1714546799999L);
        org.junit.Assert.assertNotNull(timeSeriesDataItem52);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        org.jfree.data.time.Month month7 = new org.jfree.data.time.Month();
        long long8 = month7.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries10.removeChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries10.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, (java.lang.Number) 10L);
        long long21 = day15.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries4.createCopy((org.jfree.data.time.RegularTimePeriod) month7, (org.jfree.data.time.RegularTimePeriod) day15);
        long long23 = month7.getFirstMillisecond();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) month7, (java.lang.Number) (short) 0, true);
        org.jfree.data.time.Month month28 = new org.jfree.data.time.Month();
        long long29 = month28.getFirstMillisecond();
        long long30 = month28.getLastMillisecond();
        long long31 = month28.getFirstMillisecond();
        org.jfree.data.time.Year year32 = month28.getYear();
        org.jfree.data.time.Month month33 = new org.jfree.data.time.Month(10, year32);
        long long34 = month33.getFirstMillisecond();
        org.jfree.data.time.Year year35 = month33.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = month33.next();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod36, (java.lang.Number) 1722495599999L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: There is no existing value for the specified 'period'.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711954800000L + "'", long8 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1712429999999L + "'", long21 == 1712429999999L);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711954800000L + "'", long23 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1711954800000L + "'", long29 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1714546799999L + "'", long30 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1711954800000L + "'", long31 == 1711954800000L);
        org.junit.Assert.assertNotNull(year32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1727766000000L + "'", long34 == 1727766000000L);
        org.junit.Assert.assertNotNull(year35);
        org.junit.Assert.assertNotNull(regularTimePeriod36);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
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
        timeSeries1.add(timeSeriesDataItem30, false);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener34);
        java.lang.String str36 = timeSeries1.getDescription();
        java.lang.Object obj37 = timeSeries1.clone();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "6-April-2024" + "'", str29, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem30);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        timeSeries19.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries19.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent28 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean29 = timeSeries19.equals((java.lang.Object) seriesChangeEvent28);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        int int32 = day30.compareTo((java.lang.Object) (short) 100);
        java.lang.String str33 = day30.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries19.getDataItem((org.jfree.data.time.RegularTimePeriod) day30);
        int int35 = day10.compareTo((java.lang.Object) day30);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day38 = new org.jfree.data.time.Day();
        timeSeries37.add((org.jfree.data.time.RegularTimePeriod) day38, (double) (short) 0, false);
        timeSeries37.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = timeSeries37.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent46 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean47 = timeSeries37.equals((java.lang.Object) seriesChangeEvent46);
        org.jfree.data.time.Day day48 = new org.jfree.data.time.Day();
        int int50 = day48.compareTo((java.lang.Object) (short) 100);
        java.lang.String str51 = day48.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem52 = timeSeries37.getDataItem((org.jfree.data.time.RegularTimePeriod) day48);
        java.lang.Number number53 = timeSeriesDataItem52.getValue();
        java.lang.Object obj54 = timeSeriesDataItem52.clone();
        timeSeriesDataItem52.setValue((java.lang.Number) 45389L);
        boolean boolean57 = day10.equals((java.lang.Object) timeSeriesDataItem52);
        java.util.Date date58 = day10.getStart();
        org.jfree.data.time.Month month59 = new org.jfree.data.time.Month(date58);
        org.jfree.data.time.Day day60 = new org.jfree.data.time.Day(date58);
        java.util.TimeZone timeZone61 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month62 = new org.jfree.data.time.Month(date58, timeZone61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertNotNull(regularTimePeriod26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "6-April-2024" + "'", str33, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "6-April-2024" + "'", str51, "6-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem52);
        org.junit.Assert.assertEquals("'" + number53 + "' != '" + 0.0d + "'", number53, 0.0d);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Sat Apr 06 00:00:00 PDT 2024");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.lang.Class class0 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        java.util.Date date7 = day3.getStart();
        long long8 = day3.getFirstMillisecond();
        java.util.Date date9 = day3.getEnd();
        org.jfree.data.time.Year year10 = new org.jfree.data.time.Year(date9);
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month(date9);
        java.util.TimeZone timeZone12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = org.jfree.data.time.RegularTimePeriod.createInstance(class0, date9, timeZone12);
        org.jfree.data.time.FixedMillisecond fixedMillisecond14 = new org.jfree.data.time.FixedMillisecond(date9);
        java.util.Calendar calendar15 = null;
        long long16 = fixedMillisecond14.getLastMillisecond(calendar15);
        java.util.Calendar calendar17 = null;
        long long18 = fixedMillisecond14.getLastMillisecond(calendar17);
        java.util.Calendar calendar19 = null;
        long long20 = fixedMillisecond14.getMiddleMillisecond(calendar19);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1712386800000L + "'", long8 == 1712386800000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1712473199999L + "'", long16 == 1712473199999L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712473199999L + "'", long18 == 1712473199999L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1712473199999L + "'", long20 == 1712473199999L);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jfree.data.time.Month month1 = new org.jfree.data.time.Month();
        long long2 = month1.getFirstMillisecond();
        long long3 = month1.getLastMillisecond();
        long long4 = month1.getFirstMillisecond();
        org.jfree.data.time.Year year5 = month1.getYear();
        org.jfree.data.time.Month month6 = new org.jfree.data.time.Month(10, year5);
        java.util.Date date7 = month6.getEnd();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month6, (double) (-62198899200000L));
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        timeSeries12.add((org.jfree.data.time.RegularTimePeriod) day13, (double) (short) 0, false);
        java.util.Date date17 = day13.getStart();
        long long18 = day13.getFirstMillisecond();
        java.util.Date date19 = day13.getEnd();
        org.jfree.data.time.Year year20 = new org.jfree.data.time.Year(date19);
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month(date19);
        java.util.TimeZone timeZone22 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = org.jfree.data.time.RegularTimePeriod.createInstance(class10, date19, timeZone22);
        org.jfree.data.time.FixedMillisecond fixedMillisecond24 = new org.jfree.data.time.FixedMillisecond(date19);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day27 = new org.jfree.data.time.Day();
        timeSeries26.add((org.jfree.data.time.RegularTimePeriod) day27, (double) (short) 0, false);
        timeSeries26.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day35 = new org.jfree.data.time.Day();
        timeSeries34.add((org.jfree.data.time.RegularTimePeriod) day35, (double) (short) 0, false);
        java.util.Date date39 = day35.getStart();
        org.jfree.data.time.SerialDate serialDate40 = day35.getSerialDate();
        java.lang.Number number41 = null;
        timeSeries26.update((org.jfree.data.time.RegularTimePeriod) day35, number41);
        java.util.List list43 = timeSeries26.getItems();
        boolean boolean44 = fixedMillisecond24.equals((java.lang.Object) timeSeries26);
        int int45 = timeSeriesDataItem9.compareTo((java.lang.Object) boolean44);
        java.lang.Number number46 = timeSeriesDataItem9.getValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1711954800000L + "'", long2 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1714546799999L + "'", long3 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1711954800000L + "'", long4 == 1711954800000L);
        org.junit.Assert.assertNotNull(year5);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Oct 31 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712386800000L + "'", long18 == 1712386800000L);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Apr 06 23:59:59 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod23);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Sat Apr 06 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate40);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + number46 + "' != '" + (-6.21988992E13d) + "'", number46, (-6.21988992E13d));
    }
}

