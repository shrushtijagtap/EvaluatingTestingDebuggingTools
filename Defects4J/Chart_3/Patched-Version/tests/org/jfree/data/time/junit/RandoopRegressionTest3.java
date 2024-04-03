package org.jfree.data.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1501");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.String str3 = timeSeries1.getDescription();
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        long long6 = month4.getSerialIndex();
        int int7 = month4.getYearValue();
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException9 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException11 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException9.addSuppressed((java.lang.Throwable) timePeriodFormatException11);
        int int13 = month4.compareTo((java.lang.Object) timePeriodFormatException9);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) int13, "org.jfree.data.event.SeriesChangeEvent[source=true]", "March 2024");
        java.util.Collection collection17 = timeSeries16.getTimePeriods();
        org.jfree.data.time.Month month18 = new org.jfree.data.time.Month();
        long long19 = month18.getFirstMillisecond();
        org.jfree.data.time.Year year20 = month18.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = year20.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = year20.previous();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) year20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = year20.previous();
        java.lang.Object obj25 = null;
        int int26 = year20.compareTo(obj25);
        java.util.Date date27 = year20.getEnd();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries16.getDataItem((org.jfree.data.time.RegularTimePeriod) year20);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        java.util.Date date35 = day31.getStart();
        org.jfree.data.time.SerialDate serialDate36 = day31.getSerialDate();
        long long37 = day31.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = day31.previous();
        long long39 = regularTimePeriod38.getLastMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = new org.jfree.data.time.TimeSeriesDataItem(regularTimePeriod38, (double) 3);
        int int42 = year20.compareTo((java.lang.Object) timeSeriesDataItem41);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries1.addOrUpdate(timeSeriesDataItem41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 24291L + "'", long6 == 24291L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2024 + "'", int7 == 2024);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1709280000000L + "'", long19 == 1709280000000L);
        org.junit.Assert.assertNotNull(year20);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Tue Dec 31 23:59:59 PST 2024");
        org.junit.Assert.assertNull(timeSeriesDataItem28);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1711911599999L + "'", long37 == 1711911599999L);
        org.junit.Assert.assertNotNull(regularTimePeriod38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1711868399999L + "'", long39 == 1711868399999L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem43);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1502");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemCount((int) (short) 0);
        org.jfree.data.time.Month month5 = new org.jfree.data.time.Month();
        long long6 = month5.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = month5.previous();
        boolean boolean9 = month5.equals((java.lang.Object) 10.0d);
        long long10 = month5.getSerialIndex();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) month5, (double) 2024, false);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day16 = new org.jfree.data.time.Day();
        timeSeries15.add((org.jfree.data.time.RegularTimePeriod) day16, (double) (short) 0, false);
        java.util.Date date20 = day16.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond21 = new org.jfree.data.time.FixedMillisecond(date20);
        java.util.Date date22 = fixedMillisecond21.getTime();
        long long23 = fixedMillisecond21.getFirstMillisecond();
        long long24 = fixedMillisecond21.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = fixedMillisecond21.next();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod25, (double) 24292L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Month.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1709280000000L + "'", long6 == 1709280000000L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 24291L + "'", long10 == 24291L);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711868400000L + "'", long23 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1711868400000L + "'", long24 == 1711868400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod25);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1503");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        long long9 = fixedMillisecond7.getFirstMillisecond();
        long long10 = fixedMillisecond7.getMiddleMillisecond();
        java.util.Calendar calendar11 = null;
        fixedMillisecond7.peg(calendar11);
        long long13 = fixedMillisecond7.getLastMillisecond();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711868400000L + "'", long9 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1504");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        long long8 = fixedMillisecond7.getFirstMillisecond();
        java.util.Date date9 = fixedMillisecond7.getTime();
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date9);
        org.jfree.data.time.Year year11 = month10.getYear();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1711868400000L + "'", long8 == 1711868400000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(year11);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1505");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean5 = timeSeries1.equals((java.lang.Object) 100);
        java.lang.Class class6 = timeSeries1.timePeriodClass;
        boolean boolean7 = timeSeries1.getNotify();
        timeSeries1.removeAgedItems(false);
        timeSeries1.removeAgedItems((long) 'a', false);
        java.lang.Class class13 = timeSeries1.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries1.getValue(9999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9999, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(class6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1506");
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
        java.lang.Object obj33 = timeSeriesDataItem32.clone();
        timeSeriesDataItem32.setSelected(false);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(timeSeriesDataItem14);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(timeSeriesDataItem30);
        org.junit.Assert.assertNotNull(regularTimePeriod31);
        org.junit.Assert.assertNotNull(timeSeriesDataItem32);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1507");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        java.util.List list5 = timeSeries1.getItems();
        double double6 = timeSeries1.getMinY();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.createCopy(0, 0);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        java.util.Date date16 = day12.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond17 = new org.jfree.data.time.FixedMillisecond(date16);
        long long18 = fixedMillisecond17.getFirstMillisecond();
        java.util.Date date19 = fixedMillisecond17.getTime();
        org.jfree.data.time.FixedMillisecond fixedMillisecond20 = new org.jfree.data.time.FixedMillisecond(date19);
        org.jfree.data.time.FixedMillisecond fixedMillisecond21 = new org.jfree.data.time.FixedMillisecond(date19);
        java.util.Calendar calendar22 = null;
        long long23 = fixedMillisecond21.getLastMillisecond(calendar22);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) fixedMillisecond21, (double) 1.0f);
        timeSeries1.setDomainDescription("October 9");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1711868400000L + "'", long18 == 1711868400000L);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1711868400000L + "'", long23 == 1711868400000L);
        org.junit.Assert.assertNull(timeSeriesDataItem25);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1508");
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
        java.util.List list37 = timeSeries35.getItems();
        timeSeries35.setRangeDescription("97");
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries33.addAndOrUpdate(timeSeries35);
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + 100L + "'", comparable29, 100L);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1509");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries14.addChangeListener(seriesChangeListener15);
        long long17 = timeSeries14.getMaximumItemAge();
        java.lang.String str18 = timeSeries14.getDescription();
        int int19 = timeSeries14.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day22 = new org.jfree.data.time.Day();
        timeSeries21.add((org.jfree.data.time.RegularTimePeriod) day22, (double) (short) 0, false);
        java.util.Date date26 = day22.getStart();
        org.jfree.data.time.SerialDate serialDate27 = day22.getSerialDate();
        java.lang.String str28 = day22.toString();
        java.lang.Number number29 = null;
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day22, number29);
        timeSeries12.add((org.jfree.data.time.RegularTimePeriod) day22, (double) (short) 0, true);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries35.addChangeListener(seriesChangeListener36);
        long long38 = timeSeries35.getMaximumItemAge();
        java.lang.String str39 = timeSeries35.getDescription();
        int int40 = timeSeries35.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day43 = new org.jfree.data.time.Day();
        timeSeries42.add((org.jfree.data.time.RegularTimePeriod) day43, (double) (short) 0, false);
        java.util.Date date47 = day43.getStart();
        org.jfree.data.time.SerialDate serialDate48 = day43.getSerialDate();
        java.lang.String str49 = day43.toString();
        java.lang.Number number50 = null;
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) day43, number50);
        boolean boolean52 = timeSeries35.isEmpty();
        boolean boolean53 = day22.equals((java.lang.Object) timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day56 = new org.jfree.data.time.Day();
        timeSeries55.add((org.jfree.data.time.RegularTimePeriod) day56, (double) (short) 0, false);
        java.util.Date date60 = day56.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond61 = new org.jfree.data.time.FixedMillisecond(date60);
        long long62 = fixedMillisecond61.getFirstMillisecond();
        java.util.Date date63 = fixedMillisecond61.getTime();
        org.jfree.data.time.Month month64 = new org.jfree.data.time.Month(date63);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod65 = month64.previous();
        long long66 = month64.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) day22, (org.jfree.data.time.RegularTimePeriod) month64);
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day70 = new org.jfree.data.time.Day();
        timeSeries69.add((org.jfree.data.time.RegularTimePeriod) day70, (double) (short) 0, false);
        java.util.Date date74 = day70.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond75 = new org.jfree.data.time.FixedMillisecond(date74);
        long long76 = fixedMillisecond75.getFirstMillisecond();
        java.util.Date date77 = fixedMillisecond75.getTime();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod78 = fixedMillisecond75.next();
        long long79 = fixedMillisecond75.getLastMillisecond();
        org.jfree.data.time.Month month80 = new org.jfree.data.time.Month();
        long long81 = month80.getFirstMillisecond();
        long long82 = month80.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod83 = month80.next();
        org.jfree.data.time.TimeSeries timeSeries84 = timeSeries67.createCopy((org.jfree.data.time.RegularTimePeriod) fixedMillisecond75, regularTimePeriod83);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "31-March-2024" + "'", str28, "31-March-2024");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 9223372036854775807L + "'", long38 == 9223372036854775807L);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "31-March-2024" + "'", str49, "31-March-2024");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1711868400000L + "'", long62 == 1711868400000L);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1709280000000L + "'", long66 == 1709280000000L);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1711868400000L + "'", long76 == 1711868400000L);
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod78);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1711868400000L + "'", long79 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1709280000000L + "'", long81 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 24291L + "'", long82 == 24291L);
        org.junit.Assert.assertNotNull(regularTimePeriod83);
        org.junit.Assert.assertNotNull(timeSeries84);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1510");
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
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        timeSeries18.add((org.jfree.data.time.RegularTimePeriod) day19, (double) (short) 0, false);
        java.util.Date date23 = day19.getStart();
        org.jfree.data.time.SerialDate serialDate24 = day19.getSerialDate();
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day(serialDate24);
        long long26 = day25.getFirstMillisecond();
        java.lang.String str27 = day25.toString();
        timeSeries16.add((org.jfree.data.time.RegularTimePeriod) day25, 0.0d);
        int int30 = day25.getYear();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(timeSeriesDataItem15);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1711868400000L + "'", long26 == 1711868400000L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "31-March-2024" + "'", str27, "31-March-2024");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2024 + "'", int30 == 2024);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1511");
        java.lang.Class class0 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        java.util.Date date7 = day3.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond8 = new org.jfree.data.time.FixedMillisecond(date7);
        java.util.TimeZone timeZone9 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = org.jfree.data.time.RegularTimePeriod.createInstance(class0, date7, timeZone9);
        org.jfree.data.time.FixedMillisecond fixedMillisecond11 = new org.jfree.data.time.FixedMillisecond(date7);
        long long12 = fixedMillisecond11.getFirstMillisecond();
        boolean boolean14 = fixedMillisecond11.equals((java.lang.Object) 1709280000000L);
        long long15 = fixedMillisecond11.getFirstMillisecond();
        java.util.Calendar calendar16 = null;
        fixedMillisecond11.peg(calendar16);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711868400000L + "'", long12 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1711868400000L + "'", long15 == 1711868400000L);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1512");
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
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day();
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) day20, (double) (short) 0, false);
        timeSeries19.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries19.getNextTimePeriod();
        timeSeries19.setMaximumItemCount((int) ' ');
        org.jfree.data.time.Year year30 = new org.jfree.data.time.Year(0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries19.getRawDataItem((org.jfree.data.time.RegularTimePeriod) year30);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries1.addAndOrUpdate(timeSeries19);
        java.lang.Object obj33 = timeSeries1.clone();
        java.util.List list34 = timeSeries1.getItems();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod26);
        org.junit.Assert.assertNotNull(timeSeriesDataItem31);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1513");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        java.lang.Object obj7 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        timeSeries9.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries9.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries9.addChangeListener(seriesChangeListener17);
        timeSeries9.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day23 = new org.jfree.data.time.Day();
        timeSeries22.add((org.jfree.data.time.RegularTimePeriod) day23, (double) (short) 0, false);
        java.util.Date date27 = day23.getStart();
        java.lang.Number number28 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries9.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day23, number28);
        java.util.Date date30 = day23.getEnd();
        boolean boolean31 = timeSeries1.equals((java.lang.Object) day23);
        boolean boolean32 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day35 = new org.jfree.data.time.Day();
        timeSeries34.add((org.jfree.data.time.RegularTimePeriod) day35, (double) (short) 0, false);
        java.util.Date date39 = day35.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond40 = new org.jfree.data.time.FixedMillisecond(date39);
        java.util.Date date41 = fixedMillisecond40.getTime();
        org.jfree.data.time.FixedMillisecond fixedMillisecond42 = new org.jfree.data.time.FixedMillisecond(date41);
        boolean boolean44 = fixedMillisecond42.equals((java.lang.Object) 100L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = fixedMillisecond42.previous();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem46 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond42);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem29);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sun Mar 31 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod45);
        org.junit.Assert.assertNull(timeSeriesDataItem46);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1514");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getSerialIndex();
        long long3 = month0.getSerialIndex();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = month0.getLastMillisecond(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24291L + "'", long2 == 24291L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 24291L + "'", long3 == 24291L);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1515");
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
        long long17 = day7.getMiddleMillisecond();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711911599999L + "'", long10 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2024 + "'", int11 == 2024);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
        org.junit.Assert.assertNull(timeSeriesDataItem16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1711911599999L + "'", long17 == 1711911599999L);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1516");
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
        int int13 = timeSeries1.getItemCount();
        boolean boolean14 = timeSeries1.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries1.getNextTimePeriod();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1517");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        java.util.Date date7 = day3.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond8 = new org.jfree.data.time.FixedMillisecond(date7);
        long long9 = fixedMillisecond8.getFirstMillisecond();
        java.util.Date date10 = fixedMillisecond8.getTime();
        org.jfree.data.time.FixedMillisecond fixedMillisecond11 = new org.jfree.data.time.FixedMillisecond(date10);
        org.jfree.data.time.Year year12 = new org.jfree.data.time.Year(date10);
        org.jfree.data.time.Month month13 = new org.jfree.data.time.Month((int) (byte) 10, year12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = year12.previous();
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711868400000L + "'", long9 == 1711868400000L);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod14);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1518");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        long long9 = fixedMillisecond7.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = fixedMillisecond7.next();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711868400000L + "'", long9 == 1711868400000L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1519");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Month month2 = new org.jfree.data.time.Month();
        long long3 = month2.getFirstMillisecond();
        long long4 = month2.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month2, 0.0d);
        timeSeries1.add(timeSeriesDataItem6, false);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        int int11 = day9.compareTo((java.lang.Object) (short) 100);
        long long12 = day9.getMiddleMillisecond();
        int int13 = day9.getYear();
        boolean boolean15 = day9.equals((java.lang.Object) 5);
        int int16 = day9.getDayOfMonth();
        java.lang.String str17 = day9.toString();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day9, "Value", "hi!");
        java.lang.Number number21 = timeSeries1.getValue((org.jfree.data.time.RegularTimePeriod) day9);
        timeSeries1.setMaximumItemCount(0);
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
        timeSeriesDataItem40.setSelected(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = timeSeriesDataItem40.getPeriod();
        boolean boolean44 = timeSeriesDataItem40.isSelected();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day47 = new org.jfree.data.time.Day();
        timeSeries46.add((org.jfree.data.time.RegularTimePeriod) day47, (double) (short) 0, false);
        java.util.Date date51 = day47.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond52 = new org.jfree.data.time.FixedMillisecond(date51);
        long long53 = fixedMillisecond52.getFirstMillisecond();
        java.util.Date date54 = fixedMillisecond52.getTime();
        org.jfree.data.time.FixedMillisecond fixedMillisecond55 = new org.jfree.data.time.FixedMillisecond(date54);
        int int56 = timeSeriesDataItem40.compareTo((java.lang.Object) fixedMillisecond55);
        boolean boolean57 = timeSeries1.equals((java.lang.Object) int56);
        org.jfree.data.time.Day day58 = new org.jfree.data.time.Day();
        int int60 = day58.compareTo((java.lang.Object) (short) 100);
        long long61 = day58.getMiddleMillisecond();
        int int62 = day58.getYear();
        boolean boolean64 = day58.equals((java.lang.Object) 5);
        int int65 = day58.getDayOfMonth();
        java.lang.String str66 = day58.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod67 = day58.next();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem69 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day58, (java.lang.Number) 9999L);
        timeSeries1.add(timeSeriesDataItem69);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1709280000000L + "'", long3 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 24291L + "'", long4 == 24291L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1711911599999L + "'", long12 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2024 + "'", int13 == 2024);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 31 + "'", int16 == 31);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "31-March-2024" + "'", str17, "31-March-2024");
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 0.0d + "'", number21, 0.0d);
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "31-March-2024" + "'", str39, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem40);
        org.junit.Assert.assertNotNull(regularTimePeriod43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1711868400000L + "'", long53 == 1711868400000L);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1711911599999L + "'", long61 == 1711911599999L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2024 + "'", int62 == 2024);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 31 + "'", int65 == 31);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "31-March-2024" + "'", str66, "31-March-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod67);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1520");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent4 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries1);
        org.jfree.data.time.Month month7 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number8 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month7, number8);
        timeSeries1.add(timeSeriesDataItem9);
        java.util.Collection collection11 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        org.jfree.data.time.Month month16 = new org.jfree.data.time.Month();
        long long17 = month16.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.removeChangeListener(seriesChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day24 = new org.jfree.data.time.Day();
        timeSeries23.add((org.jfree.data.time.RegularTimePeriod) day24, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries19.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day24, (java.lang.Number) 10L);
        long long30 = day24.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries13.createCopy((org.jfree.data.time.RegularTimePeriod) month16, (org.jfree.data.time.RegularTimePeriod) day24);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries33.addChangeListener(seriesChangeListener34);
        org.jfree.data.time.Month month36 = new org.jfree.data.time.Month();
        long long37 = month36.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries39.removeChangeListener(seriesChangeListener40);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day44 = new org.jfree.data.time.Day();
        timeSeries43.add((org.jfree.data.time.RegularTimePeriod) day44, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = timeSeries39.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day44, (java.lang.Number) 10L);
        long long50 = day44.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries33.createCopy((org.jfree.data.time.RegularTimePeriod) month36, (org.jfree.data.time.RegularTimePeriod) day44);
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
        timeSeriesDataItem68.setSelected(false);
        timeSeriesDataItem68.setValue((java.lang.Number) (byte) 100);
        boolean boolean73 = timeSeriesDataItem68.isSelected();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem74 = timeSeries33.addOrUpdate(timeSeriesDataItem68);
        org.jfree.data.time.Day day75 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem77 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day75, (java.lang.Number) (byte) 10);
        int int78 = timeSeriesDataItem68.compareTo((java.lang.Object) (byte) 10);
        boolean boolean79 = month16.equals((java.lang.Object) timeSeriesDataItem68);
        long long80 = month16.getFirstMillisecond();
        int int82 = month16.compareTo((java.lang.Object) 24291L);
        java.lang.String str83 = month16.toString();
        long long84 = month16.getSerialIndex();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) month16, (java.lang.Number) (-62167363200000L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1709280000000L + "'", long17 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1711911599999L + "'", long30 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1709280000000L + "'", long37 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1711911599999L + "'", long50 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNotNull(regularTimePeriod60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "31-March-2024" + "'", str67, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(timeSeriesDataItem74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1709280000000L + "'", long80 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "March 2024" + "'", str83, "March 2024");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 24291L + "'", long84 == 24291L);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1521");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getLastMillisecond();
        int int2 = month0.getMonth();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954799999L + "'", long1 == 1711954799999L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1522");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        timeSeries9.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries9.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries9.addChangeListener(seriesChangeListener17);
        timeSeries9.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day23 = new org.jfree.data.time.Day();
        timeSeries22.add((org.jfree.data.time.RegularTimePeriod) day23, (double) (short) 0, false);
        java.util.Date date27 = day23.getStart();
        java.lang.Number number28 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries9.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day23, number28);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries1.addAndOrUpdate(timeSeries9);
        int int31 = timeSeries30.getItemCount();
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem29);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1523");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = month0.next();
        java.lang.Object obj4 = null;
        boolean boolean5 = month0.equals(obj4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = month0.next();
        long long7 = regularTimePeriod6.getFirstMillisecond();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24291L + "'", long2 == 24291L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1524");
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
        java.lang.Comparable comparable25 = timeSeries1.getKey();
        java.lang.String str26 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 100L + "'", comparable25, 100L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1525");
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
        java.util.List list11 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day14 = new org.jfree.data.time.Day();
        timeSeries13.add((org.jfree.data.time.RegularTimePeriod) day14, (double) (short) 0, false);
        java.util.Date date18 = day14.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond19 = new org.jfree.data.time.FixedMillisecond(date18);
        java.util.Date date20 = fixedMillisecond19.getTime();
        java.util.Calendar calendar21 = null;
        long long22 = fixedMillisecond19.getLastMillisecond(calendar21);
        java.util.Calendar calendar23 = null;
        long long24 = fixedMillisecond19.getMiddleMillisecond(calendar23);
        java.util.Calendar calendar25 = null;
        long long26 = fixedMillisecond19.getMiddleMillisecond(calendar25);
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) fixedMillisecond19);
        long long28 = fixedMillisecond19.getSerialIndex();
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
        timeSeries30.setDomainDescription("");
        int int51 = timeSeries30.getItemCount();
        org.jfree.data.time.Month month52 = new org.jfree.data.time.Month();
        long long53 = month52.getFirstMillisecond();
        long long54 = month52.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem56 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month52, 0.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = timeSeriesDataItem56.getPeriod();
        java.lang.Number number58 = timeSeriesDataItem56.getValue();
        timeSeriesDataItem56.setValue((java.lang.Number) 118L);
        timeSeries30.add(timeSeriesDataItem56);
        boolean boolean62 = fixedMillisecond19.equals((java.lang.Object) timeSeries30);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1709280000000L + "'", long5 == 1709280000000L);
        org.junit.Assert.assertNotNull(year6);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1735718399999L + "'", long8 == 1735718399999L);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1711868400000L + "'", long22 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1711868400000L + "'", long24 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1711868400000L + "'", long26 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1711868400000L + "'", long28 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1709280000000L + "'", long34 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1711911599999L + "'", long47 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1709280000000L + "'", long53 == 1709280000000L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 24291L + "'", long54 == 24291L);
        org.junit.Assert.assertNotNull(regularTimePeriod57);
        org.junit.Assert.assertEquals("'" + number58 + "' != '" + 0.0d + "'", number58, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1526");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.FixedMillisecond fixedMillisecond7 = new org.jfree.data.time.FixedMillisecond(date6);
        java.util.Date date8 = fixedMillisecond7.getTime();
        long long9 = fixedMillisecond7.getFirstMillisecond();
        long long10 = fixedMillisecond7.getMiddleMillisecond();
        long long11 = fixedMillisecond7.getSerialIndex();
        java.util.Calendar calendar12 = null;
        long long13 = fixedMillisecond7.getMiddleMillisecond(calendar12);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711868400000L + "'", long9 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711868400000L + "'", long10 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1711868400000L + "'", long11 == 1711868400000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1711868400000L + "'", long13 == 1711868400000L);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1527");
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
        org.jfree.data.time.Month month27 = new org.jfree.data.time.Month();
        long long28 = month27.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries30.removeChangeListener(seriesChangeListener31);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day35 = new org.jfree.data.time.Day();
        timeSeries34.add((org.jfree.data.time.RegularTimePeriod) day35, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries30.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day35, (java.lang.Number) 10L);
        long long41 = day35.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries24.createCopy((org.jfree.data.time.RegularTimePeriod) month27, (org.jfree.data.time.RegularTimePeriod) day35);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day45 = new org.jfree.data.time.Day();
        timeSeries44.add((org.jfree.data.time.RegularTimePeriod) day45, (double) (short) 0, false);
        timeSeries44.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day53 = new org.jfree.data.time.Day();
        timeSeries52.add((org.jfree.data.time.RegularTimePeriod) day53, (double) (short) 0, false);
        java.util.Date date57 = day53.getStart();
        int int58 = timeSeries44.getIndex((org.jfree.data.time.RegularTimePeriod) day53);
        java.lang.Class class59 = timeSeries44.timePeriodClass;
        timeSeries42.timePeriodClass = class59;
        int int61 = day11.compareTo((java.lang.Object) timeSeries42);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "31-March-2024" + "'", str17, "31-March-2024");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1709280000000L + "'", long28 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1711911599999L + "'", long41 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(class59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1528");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = month0.previous();
        boolean boolean4 = month0.equals((java.lang.Object) 10.0d);
        long long5 = month0.getSerialIndex();
        java.lang.Object obj6 = null;
        int int7 = month0.compareTo(obj6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = month0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = regularTimePeriod8.previous();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 24291L + "'", long5 == 24291L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1529");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = month0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year2.next();
        long long4 = year2.getSerialIndex();
        int int5 = year2.getYear();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day8 = new org.jfree.data.time.Day();
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day8, (double) (short) 0, false);
        timeSeries7.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries7.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent16 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean17 = timeSeries7.equals((java.lang.Object) seriesChangeEvent16);
        org.jfree.data.time.Day day18 = new org.jfree.data.time.Day();
        int int20 = day18.compareTo((java.lang.Object) (short) 100);
        java.lang.String str21 = day18.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries7.getDataItem((org.jfree.data.time.RegularTimePeriod) day18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = day18.next();
        boolean boolean24 = year2.equals((java.lang.Object) day18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = day18.next();
        long long26 = day18.getLastMillisecond();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1709280000000L + "'", long1 == 1709280000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2024L + "'", long4 == 2024L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2024 + "'", int5 == 2024);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "31-March-2024" + "'", str21, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem22);
        org.junit.Assert.assertNotNull(regularTimePeriod23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1711954799999L + "'", long26 == 1711954799999L);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1530");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month1 = org.jfree.data.time.Month.parseMonth("Sat Mar 30 23:59:59 PDT 2024");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException; message: Can't evaluate the month.");
        } catch (org.jfree.data.time.TimePeriodFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1531");
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
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        long long18 = timeSeries15.getMaximumItemAge();
        java.lang.String str19 = timeSeries15.getDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day22 = new org.jfree.data.time.Day();
        timeSeries21.add((org.jfree.data.time.RegularTimePeriod) day22, (double) (short) 0, false);
        java.util.Date date26 = day22.getStart();
        long long27 = day22.getFirstMillisecond();
        timeSeries15.add((org.jfree.data.time.RegularTimePeriod) day22, (java.lang.Number) 10, false);
        java.util.List list31 = timeSeries15.data;
        int int32 = timeSeries15.getItemCount();
        java.lang.Class class33 = timeSeries15.timePeriodClass;
        timeSeries15.setNotify(false);
        timeSeries15.clear();
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException38 = new org.jfree.data.time.TimePeriodFormatException("9");
        java.lang.Throwable[] throwableArray39 = timePeriodFormatException38.getSuppressed();
        boolean boolean40 = timeSeries15.equals((java.lang.Object) throwableArray39);
        org.jfree.data.time.Month month43 = new org.jfree.data.time.Month(10, 9);
        java.lang.Number number44 = null;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month43, number44);
        boolean boolean46 = timeSeriesDataItem45.isSelected();
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries48.addChangeListener(seriesChangeListener49);
        org.jfree.data.time.Month month51 = new org.jfree.data.time.Month();
        long long52 = month51.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener55 = null;
        timeSeries54.removeChangeListener(seriesChangeListener55);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day59 = new org.jfree.data.time.Day();
        timeSeries58.add((org.jfree.data.time.RegularTimePeriod) day59, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem64 = timeSeries54.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day59, (java.lang.Number) 10L);
        long long65 = day59.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries48.createCopy((org.jfree.data.time.RegularTimePeriod) month51, (org.jfree.data.time.RegularTimePeriod) day59);
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day69 = new org.jfree.data.time.Day();
        timeSeries68.add((org.jfree.data.time.RegularTimePeriod) day69, (double) (short) 0, false);
        timeSeries68.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod75 = timeSeries68.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent77 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean78 = timeSeries68.equals((java.lang.Object) seriesChangeEvent77);
        org.jfree.data.time.Day day79 = new org.jfree.data.time.Day();
        int int81 = day79.compareTo((java.lang.Object) (short) 100);
        java.lang.String str82 = day79.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem83 = timeSeries68.getDataItem((org.jfree.data.time.RegularTimePeriod) day79);
        timeSeriesDataItem83.setSelected(false);
        timeSeriesDataItem83.setValue((java.lang.Number) (byte) 100);
        boolean boolean88 = timeSeriesDataItem83.isSelected();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem89 = timeSeries48.addOrUpdate(timeSeriesDataItem83);
        int int90 = timeSeriesDataItem45.compareTo((java.lang.Object) timeSeriesDataItem83);
        timeSeries15.add(timeSeriesDataItem83);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod92 = timeSeries15.getNextTimePeriod();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem94 = timeSeries12.addOrUpdate(regularTimePeriod92, (java.lang.Number) 1712041199999L);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711868400000L + "'", long9 == 1711868400000L);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (byte) 0 + "'", comparable13, (byte) 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sun Mar 31 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1711868400000L + "'", long27 == 1711868400000L);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1709280000000L + "'", long52 == 1709280000000L);
        org.junit.Assert.assertNull(timeSeriesDataItem64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1711911599999L + "'", long65 == 1711911599999L);
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertNotNull(regularTimePeriod75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "31-March-2024" + "'", str82, "31-March-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem83);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(timeSeriesDataItem89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod92);
        org.junit.Assert.assertNull(timeSeriesDataItem94);
    }
}

