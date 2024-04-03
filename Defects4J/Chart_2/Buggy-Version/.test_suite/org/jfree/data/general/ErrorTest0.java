package org.jfree.data.general;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 1.0f, 1.0d);
        int int32 = pieDataset31.getItemCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray11, numberArray14, numberArray17, numberArray20, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray24);
        java.util.List list26 = categoryDataset25.getRowKeys();
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, false);
        int int30 = categoryDataset25.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean31 = xYIntervalSeriesCollection0.equals((java.lang.Object) categoryDataset25);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj3", xYIntervalSeriesCollection0.equals(obj3) ? xYIntervalSeriesCollection0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 1.0f, 1.0d);
        boolean boolean32 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset31", pieDataset23.equals(pieDataset31) ? pieDataset23.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        org.jfree.data.ComparableObjectSeries comparableObjectSeries18 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) xYIntervalDataItem10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj3", xYIntervalSeriesCollection0.equals(obj3) ? xYIntervalSeriesCollection0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (double) 100);
        double double4 = range2.constrain((double) '4');
        double double5 = range2.getLength();
        double double6 = range2.getCentralValue();
        java.lang.String str7 = range2.toString();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection8 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset10 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo11 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent12 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset10, datasetChangeInfo11);
        xYIntervalSeriesCollection8.notifyListeners(datasetChangeEvent12);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState14 = xYIntervalSeriesCollection8.getSelectionState();
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray36 = new java.lang.Number[][] { numberArray20, numberArray23, numberArray26, numberArray29, numberArray32, numberArray35 };
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray36);
        java.util.List list38 = categoryDataset37.getRowKeys();
        org.jfree.data.Range range40 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset37, (double) (short) -1);
        java.util.List list41 = categoryDataset37.getRowKeys();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection42 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset44 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo45 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent46 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset44, datasetChangeInfo45);
        xYIntervalSeriesCollection42.notifyListeners(datasetChangeEvent46);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState48 = xYIntervalSeriesCollection42.getSelectionState();
        org.jfree.data.Range range49 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection42);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection50 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder51 = xYIntervalSeriesCollection50.getDomainOrder();
        int int52 = xYIntervalSeriesCollection50.getSeriesCount();
        boolean boolean53 = xYIntervalSeriesCollection42.hasListener((java.util.EventListener) xYIntervalSeriesCollection50);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo54 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent55 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) list41, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection50, datasetChangeInfo54);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent56 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) range2, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection8, datasetChangeInfo54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection42 and xYIntervalSeriesCollection50", xYIntervalSeriesCollection42.equals(xYIntervalSeriesCollection50) ? xYIntervalSeriesCollection42.hashCode() == xYIntervalSeriesCollection50.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray36 = new java.lang.Number[][] { numberArray20, numberArray23, numberArray26, numberArray29, numberArray32, numberArray35 };
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray36);
        java.util.List list38 = categoryDataset37.getRowKeys();
        org.jfree.data.Range range40 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset37, (double) (short) -1);
        java.util.List list41 = categoryDataset37.getRowKeys();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection42 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset44 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo45 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent46 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset44, datasetChangeInfo45);
        xYIntervalSeriesCollection42.notifyListeners(datasetChangeEvent46);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState48 = xYIntervalSeriesCollection42.getSelectionState();
        org.jfree.data.Range range49 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection42);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection50 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder51 = xYIntervalSeriesCollection50.getDomainOrder();
        int int52 = xYIntervalSeriesCollection50.getSeriesCount();
        boolean boolean53 = xYIntervalSeriesCollection42.hasListener((java.util.EventListener) xYIntervalSeriesCollection50);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo54 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent55 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) list41, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection50, datasetChangeInfo54);
        xYIntervalSeriesCollection0.fireDatasetChanged(datasetChangeInfo54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection42 and xYIntervalSeriesCollection50", xYIntervalSeriesCollection42.equals(xYIntervalSeriesCollection50) ? xYIntervalSeriesCollection42.hashCode() == xYIntervalSeriesCollection50.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        double double18 = xYIntervalDataItem10.getYValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj3", xYIntervalSeriesCollection0.equals(obj3) ? xYIntervalSeriesCollection0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener43 = null;
        categoryDataset42.removeChangeListener(datasetChangeListener43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset41", pieDataset36.equals(pieDataset41) ? pieDataset36.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj5 = null;
        xYIntervalSeries3.firePropertyChange("", obj5, (java.lang.Object) "hi!");
        java.lang.Comparable comparable8 = xYIntervalSeries3.getKey();
        int int9 = xYIntervalSeries3.getItemCount();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection10 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10, true);
        java.lang.Object obj13 = xYIntervalSeriesCollection10.clone();
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray30 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray34 = new java.lang.Number[][] { numberArray18, numberArray21, numberArray24, numberArray27, numberArray30, numberArray33 };
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray34);
        java.util.List list36 = categoryDataset35.getRowKeys();
        org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset35, false);
        int int40 = categoryDataset35.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean41 = xYIntervalSeriesCollection10.equals((java.lang.Object) categoryDataset35);
        boolean boolean42 = xYIntervalSeries3.equals((java.lang.Object) categoryDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection10 and obj13", xYIntervalSeriesCollection10.equals(obj13) ? xYIntervalSeriesCollection10.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        int int4 = xYIntervalSeriesCollection0.getSeriesCount();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection5 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset7 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo8 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent9 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset7, datasetChangeInfo8);
        xYIntervalSeriesCollection5.notifyListeners(datasetChangeEvent9);
        org.jfree.data.general.Dataset dataset11 = datasetChangeEvent9.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo12 = datasetChangeEvent9.getInfo();
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and xYIntervalSeriesCollection5", obj3.equals(xYIntervalSeriesCollection5) ? obj3.hashCode() == xYIntervalSeriesCollection5.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState29 = pieDataset28.getSelectionState();
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState30 = pieDataset28.getSelectionState();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDatasetSelectionState30", pieDataset23.equals(pieDatasetSelectionState30) ? pieDataset23.hashCode() == pieDatasetSelectionState30.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (byte) 10, (double) 10L, (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray11, numberArray14, numberArray17, numberArray20, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray24);
        java.util.List list26 = categoryDataset25.getRowKeys();
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, false);
        int int30 = categoryDataset25.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean31 = xYIntervalSeriesCollection0.equals((java.lang.Object) categoryDataset25);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem38 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int40 = xYIntervalDataItem38.compareTo((java.lang.Object) 1.0f);
        double double41 = xYIntervalDataItem38.getXHighValue();
        org.jfree.data.Range range42 = null;
        org.jfree.data.Range range44 = org.jfree.data.Range.expandToInclude(range42, (double) 100);
        double double46 = range44.constrain((double) '4');
        boolean boolean47 = xYIntervalDataItem38.equals((java.lang.Object) '4');
        boolean boolean49 = xYIntervalDataItem38.equals((java.lang.Object) 0.0f);
        java.lang.Object obj50 = xYIntervalDataItem38.clone();
        java.lang.Object obj51 = xYIntervalDataItem38.clone();
        int int52 = categoryDataset25.getRowIndex((java.lang.Comparable) xYIntervalDataItem38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj3", xYIntervalSeriesCollection0.equals(obj3) ? xYIntervalSeriesCollection0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem39 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int41 = xYIntervalDataItem39.compareTo((java.lang.Object) 1.0f);
        int int42 = categoryDataset22.getColumnIndex((java.lang.Comparable) xYIntervalDataItem39);
        double double43 = xYIntervalDataItem39.getXLowValue();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection44 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder45 = xYIntervalSeriesCollection44.getDomainOrder();
        org.jfree.data.ComparableObjectItem comparableObjectItem46 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) xYIntervalDataItem39, (java.lang.Object) domainOrder45);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection47 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset49 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo50 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent51 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset49, datasetChangeInfo50);
        xYIntervalSeriesCollection47.notifyListeners(datasetChangeEvent51);
        org.jfree.data.general.Dataset dataset53 = datasetChangeEvent51.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo54 = datasetChangeEvent51.getInfo();
        java.lang.Object obj55 = datasetChangeEvent51.getSource();
        int int56 = xYIntervalDataItem39.compareTo((java.lang.Object) datasetChangeEvent51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection44 and xYIntervalSeriesCollection47", xYIntervalSeriesCollection44.equals(xYIntervalSeriesCollection47) ? xYIntervalSeriesCollection44.hashCode() == xYIntervalSeriesCollection47.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray11, numberArray14, numberArray17, numberArray20, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray24);
        java.util.List list26 = categoryDataset25.getRowKeys();
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, false);
        int int30 = categoryDataset25.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean31 = xYIntervalSeriesCollection0.equals((java.lang.Object) categoryDataset25);
        int int32 = categoryDataset25.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj3", xYIntervalSeriesCollection0.equals(obj3) ? xYIntervalSeriesCollection0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray49 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray52 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray53 = new java.lang.Number[][] { numberArray37, numberArray40, numberArray43, numberArray46, numberArray49, numberArray52 };
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray53);
        java.util.List list55 = categoryDataset54.getRowKeys();
        org.jfree.data.Range range57 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset54, (double) (short) -1);
        java.util.List list58 = categoryDataset54.getRowKeys();
        org.jfree.data.Range range60 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, list58, false);
        org.jfree.data.Range range63 = org.jfree.data.Range.expand(range60, (double) (byte) -1, 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset22 and categoryDataset54", categoryDataset22.equals(categoryDataset54) ? categoryDataset22.hashCode() == categoryDataset54.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        boolean boolean46 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset45);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem53 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int55 = xYIntervalDataItem53.compareTo((java.lang.Object) 1.0f);
        double double56 = xYIntervalDataItem53.getXHighValue();
        org.jfree.data.Range range57 = null;
        org.jfree.data.Range range59 = org.jfree.data.Range.expandToInclude(range57, (double) 100);
        double double61 = range59.constrain((double) '4');
        boolean boolean62 = xYIntervalDataItem53.equals((java.lang.Object) '4');
        org.jfree.data.Range range63 = null;
        org.jfree.data.Range range65 = org.jfree.data.Range.expandToInclude(range63, (double) 100);
        double double67 = range65.constrain((double) '4');
        int int68 = xYIntervalDataItem53.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray75 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray78 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray81 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray84 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray87 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray90 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray91 = new java.lang.Number[][] { numberArray75, numberArray78, numberArray81, numberArray84, numberArray87, numberArray90 };
        org.jfree.data.category.CategoryDataset categoryDataset92 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray91);
        org.jfree.data.category.CategoryDataset categoryDataset93 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray91);
        int int94 = xYIntervalDataItem53.compareTo((java.lang.Object) categoryDataset93);
        java.util.List list95 = categoryDataset93.getColumnKeys();
        org.jfree.data.Range range97 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset45, list95, true);
        org.jfree.data.Range range99 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, list95, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset45 and categoryDataset92", categoryDataset45.equals(categoryDataset92) ? categoryDataset45.hashCode() == categoryDataset92.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection19 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset21 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo22 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent23 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset21, datasetChangeInfo22);
        xYIntervalSeriesCollection19.notifyListeners(datasetChangeEvent23);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState25 = xYIntervalSeriesCollection19.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener26 = null;
        xYIntervalSeriesCollection19.removeChangeListener(datasetChangeListener26);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem34 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int36 = xYIntervalDataItem34.compareTo((java.lang.Object) 1.0f);
        double double37 = xYIntervalDataItem34.getXHighValue();
        java.lang.Object obj38 = xYIntervalDataItem34.clone();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo39 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent40 = new org.jfree.data.event.SeriesChangeEvent(obj38, seriesChangeInfo39);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo41 = seriesChangeEvent40.getSummary();
        xYIntervalSeriesCollection19.seriesChanged(seriesChangeEvent40);
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and xYIntervalSeriesCollection19", obj3.equals(xYIntervalSeriesCollection19) ? obj3.hashCode() == xYIntervalSeriesCollection19.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem35 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int37 = xYIntervalDataItem35.compareTo((java.lang.Object) 1.0f);
        double double38 = xYIntervalDataItem35.getXHighValue();
        org.jfree.data.Range range39 = null;
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range39, (double) 100);
        double double43 = range41.constrain((double) '4');
        boolean boolean44 = xYIntervalDataItem35.equals((java.lang.Object) '4');
        org.jfree.data.Range range45 = null;
        org.jfree.data.Range range47 = org.jfree.data.Range.expandToInclude(range45, (double) 100);
        double double49 = range47.constrain((double) '4');
        int int50 = xYIntervalDataItem35.compareTo((java.lang.Object) '4');
        org.jfree.data.pie.PieDataset pieDataset52 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) xYIntervalDataItem35, (double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        java.util.List list25 = categoryDataset21.getRowKeys();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection26 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset28 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo29 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent30 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset28, datasetChangeInfo29);
        xYIntervalSeriesCollection26.notifyListeners(datasetChangeEvent30);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState32 = xYIntervalSeriesCollection26.getSelectionState();
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection26);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection34 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder35 = xYIntervalSeriesCollection34.getDomainOrder();
        int int36 = xYIntervalSeriesCollection34.getSeriesCount();
        boolean boolean37 = xYIntervalSeriesCollection26.hasListener((java.util.EventListener) xYIntervalSeriesCollection34);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo38 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent39 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) list25, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection34, datasetChangeInfo38);
        java.lang.String str40 = datasetChangeEvent39.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection26 and xYIntervalSeriesCollection34", xYIntervalSeriesCollection26.equals(xYIntervalSeriesCollection34) ? xYIntervalSeriesCollection26.hashCode() == xYIntervalSeriesCollection34.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection8 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder9 = xYIntervalSeriesCollection8.getDomainOrder();
        int int10 = xYIntervalSeriesCollection8.getSeriesCount();
        boolean boolean11 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection8);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection12 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset14 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo15 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent16 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset14, datasetChangeInfo15);
        xYIntervalSeriesCollection12.notifyListeners(datasetChangeEvent16);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo18 = datasetChangeEvent16.getInfo();
        xYIntervalSeriesCollection8.notifyListeners(datasetChangeEvent16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and xYIntervalSeriesCollection12", xYIntervalSeriesCollection0.equals(xYIntervalSeriesCollection12) ? xYIntervalSeriesCollection0.hashCode() == xYIntervalSeriesCollection12.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray63 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray64 = new java.lang.Number[][] { numberArray48, numberArray51, numberArray54, numberArray57, numberArray60, numberArray63 };
        org.jfree.data.category.CategoryDataset categoryDataset65 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray64);
        java.util.List list66 = categoryDataset65.getRowKeys();
        org.jfree.data.Range range68 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset65, false);
        int int70 = categoryDataset65.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset72 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo73 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent74 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset72, datasetChangeInfo73);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent75 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset65, datasetChangeInfo73);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem82 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int84 = xYIntervalDataItem82.compareTo((java.lang.Object) 1.0f);
        int int85 = categoryDataset65.getColumnIndex((java.lang.Comparable) xYIntervalDataItem82);
        double double86 = xYIntervalDataItem82.getXLowValue();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection87 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder88 = xYIntervalSeriesCollection87.getDomainOrder();
        org.jfree.data.ComparableObjectItem comparableObjectItem89 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) xYIntervalDataItem82, (java.lang.Object) domainOrder88);
        double double90 = xYIntervalDataItem82.getYValue();
        org.jfree.data.pie.PieDataset pieDataset92 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset41, (java.lang.Comparable) xYIntervalDataItem82, (double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset34 and categoryDataset65", categoryDataset34.equals(categoryDataset65) ? categoryDataset34.hashCode() == categoryDataset65.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        int int29 = pieDataset23.getItemCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jfree.data.xy.XYInterval xYInterval5 = new org.jfree.data.xy.XYInterval(0.0d, (double) 1.0f, (double) (-1), (double) '#', (double) 100L);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries9 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries9.setMaximumItemCount((int) ' ');
        xYIntervalSeries9.setDescription("hi!");
        boolean boolean14 = xYInterval5.equals((java.lang.Object) xYIntervalSeries9);
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray36 = new java.lang.Number[][] { numberArray20, numberArray23, numberArray26, numberArray29, numberArray32, numberArray35 };
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray36);
        java.util.List list38 = categoryDataset37.getRowKeys();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem45 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int47 = xYIntervalDataItem45.compareTo((java.lang.Object) 1.0f);
        double double48 = xYIntervalDataItem45.getXHighValue();
        java.lang.Object obj49 = xYIntervalDataItem45.clone();
        boolean boolean51 = xYIntervalDataItem45.equals((java.lang.Object) 0);
        java.lang.Object obj52 = xYIntervalDataItem45.clone();
        int int53 = categoryDataset37.getColumnIndex((java.lang.Comparable) xYIntervalDataItem45);
        java.lang.Number[] numberArray58 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray61 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray64 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray67 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray70 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray73 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray74 = new java.lang.Number[][] { numberArray58, numberArray61, numberArray64, numberArray67, numberArray70, numberArray73 };
        org.jfree.data.category.CategoryDataset categoryDataset75 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray74);
        org.jfree.data.Range range77 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset75, true);
        org.jfree.data.Range range79 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset75, 0.0d);
        java.util.List list80 = categoryDataset75.getRowKeys();
        xYIntervalSeries9.firePropertyChange("org.jfree.data.event.SeriesChangeEvent[source= ]", (java.lang.Object) int53, (java.lang.Object) list80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset37 and categoryDataset75", categoryDataset37.equals(categoryDataset75) ? categoryDataset37.hashCode() == categoryDataset75.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray49 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray52 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray53 = new java.lang.Number[][] { numberArray37, numberArray40, numberArray43, numberArray46, numberArray49, numberArray52 };
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray53);
        java.util.List list55 = categoryDataset54.getRowKeys();
        org.jfree.data.Range range57 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset54, (double) (short) -1);
        java.util.List list58 = categoryDataset54.getRowKeys();
        org.jfree.data.Range range60 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, list58, false);
        org.jfree.data.Range range62 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset22, 67.0d);
        double double63 = range62.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset22 and categoryDataset54", categoryDataset22.equals(categoryDataset54) ? categoryDataset22.hashCode() == categoryDataset54.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (byte) 0);
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range29, 0.0d);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem39 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int41 = xYIntervalDataItem39.compareTo((java.lang.Object) 1.0f);
        double double42 = xYIntervalDataItem39.getXHighValue();
        java.lang.Object obj43 = xYIntervalDataItem39.clone();
        boolean boolean45 = xYIntervalDataItem39.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray56 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray59 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray62 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray65 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray66 = new java.lang.Number[][] { numberArray50, numberArray53, numberArray56, numberArray59, numberArray62, numberArray65 };
        org.jfree.data.category.CategoryDataset categoryDataset67 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray66);
        org.jfree.data.pie.PieDataset pieDataset69 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset67, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState70 = pieDataset69.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset74 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset69, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset75 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem39, (org.jfree.data.KeyedValues) pieDataset74);
        boolean boolean76 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset74);
        org.jfree.data.category.CategoryDataset categoryDataset77 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 1, (org.jfree.data.KeyedValues) pieDataset74);
        boolean boolean78 = range31.equals((java.lang.Object) pieDataset74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset67", categoryDataset21.equals(categoryDataset67) ? categoryDataset21.hashCode() == categoryDataset67.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        boolean boolean29 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries3.setMaximumItemCount((int) ' ');
        xYIntervalSeries3.setDescription("");
        boolean boolean8 = xYIntervalSeries3.isEmpty();
        int int9 = xYIntervalSeries3.getItemCount();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.scale(range12, (double) (byte) 0);
        boolean boolean17 = range14.intersects((double) 100.0f, 100.0d);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range14, (double) 10.0f);
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range14, (double) (byte) -1);
        boolean boolean22 = xYIntervalSeries3.equals((java.lang.Object) (byte) -1);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection23 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection23, true);
        java.lang.Object obj26 = xYIntervalSeriesCollection23.clone();
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection23, false);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection23);
        boolean boolean30 = xYIntervalSeries3.equals((java.lang.Object) range29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection23 and obj26", xYIntervalSeriesCollection23.equals(obj26) ? xYIntervalSeriesCollection23.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset21);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection26 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection26, true);
        java.lang.Object obj29 = xYIntervalSeriesCollection26.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem36 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int38 = xYIntervalDataItem36.compareTo((java.lang.Object) 1.0f);
        double double39 = xYIntervalDataItem36.getXHighValue();
        java.lang.Object obj40 = xYIntervalDataItem36.clone();
        boolean boolean42 = xYIntervalDataItem36.equals((java.lang.Object) 0);
        int int43 = xYIntervalSeriesCollection26.indexOf((java.lang.Comparable) xYIntervalDataItem36);
        int int44 = categoryDataset21.getColumnIndex((java.lang.Comparable) int43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection26 and obj29", xYIntervalSeriesCollection26.equals(obj29) ? xYIntervalSeriesCollection26.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 'a', (double) 100L);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState34 = pieDataset33.getSelectionState();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        java.lang.Double double9 = xYIntervalDataItem6.getX();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray30 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray31 = new java.lang.Number[][] { numberArray15, numberArray18, numberArray21, numberArray24, numberArray27, numberArray30 };
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray31);
        java.util.List list33 = categoryDataset32.getRowKeys();
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset32, (double) (short) -1);
        java.util.List list36 = categoryDataset32.getRowKeys();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection37 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset39 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo40 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent41 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset39, datasetChangeInfo40);
        xYIntervalSeriesCollection37.notifyListeners(datasetChangeEvent41);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState43 = xYIntervalSeriesCollection37.getSelectionState();
        org.jfree.data.Range range44 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection37);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection45 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder46 = xYIntervalSeriesCollection45.getDomainOrder();
        int int47 = xYIntervalSeriesCollection45.getSeriesCount();
        boolean boolean48 = xYIntervalSeriesCollection37.hasListener((java.util.EventListener) xYIntervalSeriesCollection45);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo49 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent50 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) list36, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection45, datasetChangeInfo49);
        boolean boolean51 = xYIntervalDataItem6.equals((java.lang.Object) list36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection37 and xYIntervalSeriesCollection45", xYIntervalSeriesCollection37.equals(xYIntervalSeriesCollection45) ? xYIntervalSeriesCollection37.hashCode() == xYIntervalSeriesCollection45.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (byte) 0);
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range29, 0.0d);
        double double32 = range29.getCentralValue();
        double double33 = range29.getLowerBound();
        org.jfree.data.Range range34 = null;
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range34, (double) 100);
        double double38 = range36.constrain((double) '4');
        double double39 = range36.getLength();
        double double40 = range36.getCentralValue();
        double double42 = range36.constrain(1.0d);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range29, range36);
        org.jfree.data.Range range45 = org.jfree.data.Range.scale(range43, (double) 0);
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray56 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray59 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray62 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray65 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray66 = new java.lang.Number[][] { numberArray50, numberArray53, numberArray56, numberArray59, numberArray62, numberArray65 };
        org.jfree.data.category.CategoryDataset categoryDataset67 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray66);
        org.jfree.data.Range range69 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset67, true);
        org.jfree.data.Range range71 = org.jfree.data.Range.shift(range69, 0.0d);
        double double72 = range71.getCentralValue();
        org.jfree.data.Range range73 = org.jfree.data.Range.combine(range45, range71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset67", categoryDataset21.equals(categoryDataset67) ? categoryDataset21.hashCode() == categoryDataset67.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        org.jfree.data.Range range44 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset42, (double) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset41", pieDataset36.equals(pieDataset41) ? pieDataset36.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.DomainOrder domainOrder2 = xYIntervalSeriesCollection0.getDomainOrder();
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        java.lang.Object obj4 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj4", obj3.equals(obj4) ? obj3.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries14 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj16 = null;
        xYIntervalSeries14.firePropertyChange("", obj16, (java.lang.Object) "hi!");
        xYIntervalSeries14.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries14.add((double) 100, (double) 0, (double) (byte) -1, (double) (short) -1, (double) 100, (double) 0);
        boolean boolean28 = xYIntervalDataItem6.equals((java.lang.Object) 100);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection29 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection29, true);
        java.lang.Object obj32 = xYIntervalSeriesCollection29.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem39 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int41 = xYIntervalDataItem39.compareTo((java.lang.Object) 1.0f);
        double double42 = xYIntervalDataItem39.getXHighValue();
        java.lang.Object obj43 = xYIntervalDataItem39.clone();
        boolean boolean45 = xYIntervalDataItem39.equals((java.lang.Object) 0);
        int int46 = xYIntervalSeriesCollection29.indexOf((java.lang.Comparable) xYIntervalDataItem39);
        org.jfree.data.DomainOrder domainOrder47 = xYIntervalSeriesCollection29.getDomainOrder();
        java.lang.Number number48 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection29);
        java.lang.Object obj49 = xYIntervalSeriesCollection29.clone();
        int int50 = xYIntervalDataItem6.compareTo(obj49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and xYIntervalDataItem39", obj10.equals(xYIntervalDataItem39) ? obj10.hashCode() == xYIntervalDataItem39.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        org.jfree.data.DomainOrder domainOrder18 = xYIntervalSeriesCollection0.getDomainOrder();
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection20 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset22 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo23 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent24 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset22, datasetChangeInfo23);
        xYIntervalSeriesCollection20.notifyListeners(datasetChangeEvent24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = xYIntervalSeriesCollection20.getGroup();
        xYIntervalSeriesCollection0.setGroup(datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and xYIntervalSeriesCollection20", obj3.equals(xYIntervalSeriesCollection20) ? obj3.hashCode() == xYIntervalSeriesCollection20.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (double) 100);
        double double4 = range2.constrain((double) '4');
        double double5 = range2.getLength();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) (short) 0);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (double) (short) 0, false);
        org.jfree.data.Range range12 = null;
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range12, (double) 100);
        double double16 = range14.constrain((double) '4');
        double double17 = range14.getLength();
        double double18 = range14.getCentralValue();
        boolean boolean21 = range14.intersects((double) 2147483647, (double) (short) 10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection22 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset24 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo25 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent26 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset24, datasetChangeInfo25);
        xYIntervalSeriesCollection22.notifyListeners(datasetChangeEvent26);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState28 = xYIntervalSeriesCollection22.getSelectionState();
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection22);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection30 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset32 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo33 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent34 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset32, datasetChangeInfo33);
        xYIntervalSeriesCollection30.notifyListeners(datasetChangeEvent34);
        org.jfree.data.general.Dataset dataset36 = datasetChangeEvent34.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo37 = datasetChangeEvent34.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent38 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) range14, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection22, datasetChangeInfo37);
        org.jfree.data.Range range39 = org.jfree.data.Range.combine(range2, range14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection22 and xYIntervalSeriesCollection30", xYIntervalSeriesCollection22.equals(xYIntervalSeriesCollection30) ? xYIntervalSeriesCollection22.hashCode() == xYIntervalSeriesCollection30.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, 0.0d);
        double double26 = range25.getCentralValue();
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray47 = new java.lang.Number[][] { numberArray31, numberArray34, numberArray37, numberArray40, numberArray43, numberArray46 };
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray47);
        java.util.List list49 = categoryDataset48.getRowKeys();
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset48, false);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range51, 0.0d);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, (double) '#', true);
        double double57 = range56.getUpperBound();
        org.jfree.data.Range range58 = org.jfree.data.Range.combine(range25, range56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset48", categoryDataset21.equals(categoryDataset48) ? categoryDataset21.hashCode() == categoryDataset48.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        java.util.List list25 = categoryDataset21.getRowKeys();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection26 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset28 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo29 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent30 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset28, datasetChangeInfo29);
        xYIntervalSeriesCollection26.notifyListeners(datasetChangeEvent30);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState32 = xYIntervalSeriesCollection26.getSelectionState();
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection26);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection34 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder35 = xYIntervalSeriesCollection34.getDomainOrder();
        int int36 = xYIntervalSeriesCollection34.getSeriesCount();
        boolean boolean37 = xYIntervalSeriesCollection26.hasListener((java.util.EventListener) xYIntervalSeriesCollection34);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo38 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent39 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) list25, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection34, datasetChangeInfo38);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState40 = xYIntervalSeriesCollection34.getSelectionState();
        org.jfree.data.Range range41 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection34);
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray56 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray59 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray62 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray63 = new java.lang.Number[][] { numberArray47, numberArray50, numberArray53, numberArray56, numberArray59, numberArray62 };
        org.jfree.data.category.CategoryDataset categoryDataset64 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray63);
        java.util.List list65 = categoryDataset64.getRowKeys();
        org.jfree.data.Range range67 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset64, false);
        int int69 = categoryDataset64.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset71 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo72 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent73 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset71, datasetChangeInfo72);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent74 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset64, datasetChangeInfo72);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem81 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int83 = xYIntervalDataItem81.compareTo((java.lang.Object) 1.0f);
        int int84 = categoryDataset64.getColumnIndex((java.lang.Comparable) xYIntervalDataItem81);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries87 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem81, false, false);
        int int88 = xYIntervalSeriesCollection34.indexOf((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset64", categoryDataset21.equals(categoryDataset64) ? categoryDataset21.hashCode() == categoryDataset64.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) (short) 10, (double) 100, 100);
        double double35 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem9 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int11 = xYIntervalDataItem9.compareTo((java.lang.Object) 1.0f);
        double double12 = xYIntervalDataItem9.getXHighValue();
        org.jfree.data.Range range13 = null;
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, (double) 100);
        double double17 = range15.constrain((double) '4');
        boolean boolean18 = xYIntervalDataItem9.equals((java.lang.Object) '4');
        org.jfree.data.Range range19 = null;
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range19, (double) 100);
        double double23 = range21.constrain((double) '4');
        int int24 = xYIntervalDataItem9.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray47 = new java.lang.Number[][] { numberArray31, numberArray34, numberArray37, numberArray40, numberArray43, numberArray46 };
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray47);
        org.jfree.data.category.CategoryDataset categoryDataset49 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray47);
        int int50 = xYIntervalDataItem9.compareTo((java.lang.Object) categoryDataset49);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener51 = null;
        categoryDataset49.removeChangeListener(datasetChangeListener51);
        org.jfree.data.general.DatasetGroup datasetGroup53 = categoryDataset49.getGroup();
        xYIntervalSeriesCollection0.setGroup(datasetGroup53);
        java.lang.Number[] numberArray59 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray62 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray65 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray68 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray71 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray74 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray75 = new java.lang.Number[][] { numberArray59, numberArray62, numberArray65, numberArray68, numberArray71, numberArray74 };
        org.jfree.data.category.CategoryDataset categoryDataset76 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray75);
        org.jfree.data.pie.PieDataset pieDataset78 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset76, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState79 = pieDataset78.getSelectionState();
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState80 = pieDataset78.getSelectionState();
        org.jfree.data.general.DatasetGroup datasetGroup81 = pieDataset78.getGroup();
        xYIntervalSeriesCollection0.setGroup(datasetGroup81);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset48 and categoryDataset76", categoryDataset48.equals(categoryDataset76) ? categoryDataset48.hashCode() == categoryDataset76.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState7 = null;
        xYIntervalSeriesCollection0.setSelectionState(xYDatasetSelectionState7);
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray17, numberArray20, numberArray23, numberArray26, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        java.util.List list32 = categoryDataset31.getRowKeys();
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset31, false);
        int int36 = categoryDataset31.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset38 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo39 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent40 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset38, datasetChangeInfo39);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent41 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset31, datasetChangeInfo39);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem48 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int50 = xYIntervalDataItem48.compareTo((java.lang.Object) 1.0f);
        int int51 = categoryDataset31.getColumnIndex((java.lang.Comparable) xYIntervalDataItem48);
        double double52 = xYIntervalDataItem48.getXLowValue();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection53 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder54 = xYIntervalSeriesCollection53.getDomainOrder();
        org.jfree.data.ComparableObjectItem comparableObjectItem55 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) xYIntervalDataItem48, (java.lang.Object) domainOrder54);
        int int56 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) comparableObjectItem55);
        java.lang.Object obj57 = comparableObjectItem55.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and xYIntervalSeriesCollection53", xYIntervalSeriesCollection0.equals(xYIntervalSeriesCollection53) ? xYIntervalSeriesCollection0.hashCode() == xYIntervalSeriesCollection53.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        boolean boolean29 = range27.contains((double) (byte) 1);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range27, 1.0d, true);
        org.jfree.data.Range range33 = null;
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, (double) 100);
        double double37 = range35.constrain((double) '4');
        double double38 = range35.getLength();
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range35, (double) 100, false);
        org.jfree.data.Range range42 = null;
        org.jfree.data.Range range44 = org.jfree.data.Range.expandToInclude(range42, (double) 100);
        double double46 = range44.constrain((double) '4');
        double double47 = range44.getLength();
        org.jfree.data.Range range48 = null;
        org.jfree.data.Range range50 = org.jfree.data.Range.expandToInclude(range48, (double) 100);
        double double52 = range50.constrain((double) '4');
        boolean boolean53 = range44.intersects(range50);
        boolean boolean54 = range35.intersects(range44);
        org.jfree.data.Range range55 = null;
        org.jfree.data.Range range57 = org.jfree.data.Range.expandToInclude(range55, (double) 100);
        double double59 = range57.constrain((double) '4');
        double double60 = range57.getLength();
        double double61 = range57.getCentralValue();
        java.lang.Number[] numberArray66 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray69 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray72 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray75 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray78 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray81 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray82 = new java.lang.Number[][] { numberArray66, numberArray69, numberArray72, numberArray75, numberArray78, numberArray81 };
        org.jfree.data.category.CategoryDataset categoryDataset83 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray82);
        java.util.List list84 = categoryDataset83.getRowKeys();
        org.jfree.data.Range range86 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset83, (double) (short) -1);
        java.lang.Number number87 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset83);
        org.jfree.data.Range range88 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset83);
        boolean boolean89 = range57.intersects(range88);
        boolean boolean90 = range35.intersects(range88);
        org.jfree.data.Range range93 = org.jfree.data.Range.expand(range35, (double) (short) -1, 93.0d);
        org.jfree.data.Range range94 = org.jfree.data.Range.combine(range32, range35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset83", categoryDataset21.equals(categoryDataset83) ? categoryDataset21.hashCode() == categoryDataset83.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.ComparableObjectSeries comparableObjectSeries8 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) (short) 0, false, true);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem15 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int17 = xYIntervalDataItem15.compareTo((java.lang.Object) 1.0f);
        double double18 = xYIntervalDataItem15.getXHighValue();
        org.jfree.data.Range range19 = null;
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range19, (double) 100);
        double double23 = range21.constrain((double) '4');
        boolean boolean24 = xYIntervalDataItem15.equals((java.lang.Object) '4');
        boolean boolean26 = xYIntervalDataItem15.equals((java.lang.Object) 0.0f);
        java.lang.Object obj27 = xYIntervalDataItem15.clone();
        int int28 = comparableObjectSeries8.indexOf((java.lang.Comparable) xYIntervalDataItem15);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection29 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset31 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo32 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent33 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset31, datasetChangeInfo32);
        xYIntervalSeriesCollection29.notifyListeners(datasetChangeEvent33);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState35 = xYIntervalSeriesCollection29.getSelectionState();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection36 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset38 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo39 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent40 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset38, datasetChangeInfo39);
        xYIntervalSeriesCollection36.notifyListeners(datasetChangeEvent40);
        org.jfree.data.general.Dataset dataset42 = datasetChangeEvent40.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo43 = datasetChangeEvent40.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent44 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) int28, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection29, datasetChangeInfo43);
        xYIntervalSeriesCollection0.fireDatasetChanged(datasetChangeInfo43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and xYIntervalSeriesCollection29", obj3.equals(xYIntervalSeriesCollection29) ? obj3.hashCode() == xYIntervalSeriesCollection29.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener25 = null;
        categoryDataset21.removeChangeListener(datasetChangeListener25);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset21);
        java.lang.Class<?> wildcardClass28 = categoryDataset21.getClass();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection29 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset31 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo32 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent33 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset31, datasetChangeInfo32);
        xYIntervalSeriesCollection29.notifyListeners(datasetChangeEvent33);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState35 = xYIntervalSeriesCollection29.getSelectionState();
        int int37 = xYIntervalSeriesCollection29.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener38 = null;
        xYIntervalSeriesCollection29.removeChangeListener(datasetChangeListener38);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries43 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries43.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo46 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent47 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo46);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo48 = null;
        seriesChangeEvent47.setSummary(seriesChangeInfo48);
        java.lang.Object obj50 = seriesChangeEvent47.getSource();
        xYIntervalSeriesCollection29.seriesChanged(seriesChangeEvent47);
        boolean boolean52 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection29);
        java.lang.Number number53 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection29);
        java.lang.Number[] numberArray58 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray61 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray64 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray67 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray70 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray73 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray74 = new java.lang.Number[][] { numberArray58, numberArray61, numberArray64, numberArray67, numberArray70, numberArray73 };
        org.jfree.data.category.CategoryDataset categoryDataset75 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray74);
        java.util.List list76 = categoryDataset75.getRowKeys();
        org.jfree.data.Range range78 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset75, (double) (short) -1);
        java.util.List list79 = categoryDataset75.getRowKeys();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection80 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset82 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo83 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent84 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset82, datasetChangeInfo83);
        xYIntervalSeriesCollection80.notifyListeners(datasetChangeEvent84);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState86 = xYIntervalSeriesCollection80.getSelectionState();
        org.jfree.data.Range range87 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection80);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection88 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder89 = xYIntervalSeriesCollection88.getDomainOrder();
        int int90 = xYIntervalSeriesCollection88.getSeriesCount();
        boolean boolean91 = xYIntervalSeriesCollection80.hasListener((java.util.EventListener) xYIntervalSeriesCollection88);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo92 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent93 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) list79, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection88, datasetChangeInfo92);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent94 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) wildcardClass28, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection29, datasetChangeInfo92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset75", categoryDataset21.equals(categoryDataset75) ? categoryDataset21.hashCode() == categoryDataset75.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (double) 100);
        double double4 = range2.constrain((double) '4');
        double double5 = range2.getLength();
        double double6 = range2.getCentralValue();
        boolean boolean9 = range2.intersects((double) 2147483647, (double) (short) 10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection10 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset12 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo13 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent14 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset12, datasetChangeInfo13);
        xYIntervalSeriesCollection10.notifyListeners(datasetChangeEvent14);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState16 = xYIntervalSeriesCollection10.getSelectionState();
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection18 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset20 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo21 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent22 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset20, datasetChangeInfo21);
        xYIntervalSeriesCollection18.notifyListeners(datasetChangeEvent22);
        org.jfree.data.general.Dataset dataset24 = datasetChangeEvent22.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo25 = datasetChangeEvent22.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent26 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) range2, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection10, datasetChangeInfo25);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range2, 15.5d, (double) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection10 and xYIntervalSeriesCollection18", xYIntervalSeriesCollection10.equals(xYIntervalSeriesCollection18) ? xYIntervalSeriesCollection10.hashCode() == xYIntervalSeriesCollection18.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.util.List list29 = pieDataset28.getKeys();
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) '4', (double) (byte) 0, (-1));
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem40 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int42 = xYIntervalDataItem40.compareTo((java.lang.Object) 1.0f);
        double double43 = xYIntervalDataItem40.getXHighValue();
        java.lang.Object obj44 = xYIntervalDataItem40.clone();
        boolean boolean46 = xYIntervalDataItem40.equals((java.lang.Object) 0);
        java.lang.Object obj47 = xYIntervalDataItem40.clone();
        double double48 = xYIntervalDataItem40.getYValue();
        org.jfree.data.pie.PieDataset pieDataset51 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) double48, (double) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range24, 0.0d);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range26, (double) '#', true);
        double double30 = range29.getUpperBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.scale(range29, (double) 10L);
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray54 = new java.lang.Number[][] { numberArray38, numberArray41, numberArray44, numberArray47, numberArray50, numberArray53 };
        org.jfree.data.category.CategoryDataset categoryDataset55 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray54);
        java.util.List list56 = categoryDataset55.getRowKeys();
        org.jfree.data.Range range58 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset55, false);
        int int60 = categoryDataset55.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset62 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo63 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent64 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset62, datasetChangeInfo63);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent65 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset55, datasetChangeInfo63);
        org.jfree.data.Range range66 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset55);
        boolean boolean67 = range29.equals((java.lang.Object) categoryDataset55);
        org.jfree.data.Range range69 = org.jfree.data.Range.scale(range29, 52.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset55", categoryDataset21.equals(categoryDataset55) ? categoryDataset21.hashCode() == categoryDataset55.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        java.lang.Object obj9 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener10 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection12 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset14 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo15 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent16 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset14, datasetChangeInfo15);
        xYIntervalSeriesCollection12.notifyListeners(datasetChangeEvent16);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState18 = xYIntervalSeriesCollection12.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener19 = null;
        xYIntervalSeriesCollection12.removeChangeListener(datasetChangeListener19);
        java.lang.Number number21 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection12);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo22 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection12.fireDatasetChanged(datasetChangeInfo22);
        boolean boolean24 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection12);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState25 = xYIntervalSeriesCollection0.getSelectionState();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and xYIntervalSeriesCollection12", obj9.equals(xYIntervalSeriesCollection12) ? obj9.hashCode() == xYIntervalSeriesCollection12.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 192.0d, 0.0d);
        int int33 = pieDataset31.getIndex((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) (short) 10, (double) 100, 100);
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset34, (java.lang.Comparable) 10, 67.0d, (int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 1.0f, 1.0d);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState32 = pieDataset31.getSelectionState();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj17 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection18 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder19 = xYIntervalSeriesCollection18.getDomainOrder();
        org.jfree.data.DomainOrder domainOrder20 = xYIntervalSeriesCollection18.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection21 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset23 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo24 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent25 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset23, datasetChangeInfo24);
        xYIntervalSeriesCollection21.notifyListeners(datasetChangeEvent25);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState27 = xYIntervalSeriesCollection21.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener28 = null;
        xYIntervalSeriesCollection21.removeChangeListener(datasetChangeListener28);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection21);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo31 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection21.fireDatasetChanged(datasetChangeInfo31);
        xYIntervalSeriesCollection18.fireDatasetChanged(datasetChangeInfo31);
        xYIntervalSeriesCollection0.fireDatasetChanged(datasetChangeInfo31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj17 and xYIntervalSeriesCollection18", obj17.equals(xYIntervalSeriesCollection18) ? obj17.hashCode() == xYIntervalSeriesCollection18.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        org.jfree.data.DomainOrder domainOrder18 = xYIntervalSeriesCollection0.getDomainOrder();
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj20 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup21 = xYIntervalSeriesCollection0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj20", obj3.equals(obj20) ? obj3.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 'a', (double) 100L);
        int int34 = pieDataset33.getItemCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        java.util.List list29 = pieDataset23.getKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        org.jfree.data.DomainOrder domainOrder18 = xYIntervalSeriesCollection0.getDomainOrder();
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj20 = xYIntervalSeriesCollection0.clone();
        java.lang.Comparable comparable21 = null;
        int int22 = xYIntervalSeriesCollection0.indexOf(comparable21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj20", obj3.equals(obj20) ? obj3.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState31 = pieDataset28.getSelectionState();
        int int32 = pieDataset28.getItemCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj5 = null;
        xYIntervalSeries3.firePropertyChange("", obj5, (java.lang.Object) "hi!");
        xYIntervalSeries3.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries3.firePropertyChange("", (java.lang.Object) 100L, (java.lang.Object) 100.0f);
        int int14 = xYIntervalSeries3.getItemCount();
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray35 = new java.lang.Number[][] { numberArray19, numberArray22, numberArray25, numberArray28, numberArray31, numberArray34 };
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray35);
        org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset36, true);
        org.jfree.data.general.DatasetGroup datasetGroup39 = categoryDataset36.getGroup();
        java.util.List list40 = categoryDataset36.getRowKeys();
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray61 = new java.lang.Number[][] { numberArray45, numberArray48, numberArray51, numberArray54, numberArray57, numberArray60 };
        org.jfree.data.category.CategoryDataset categoryDataset62 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray61);
        java.util.List list63 = categoryDataset62.getRowKeys();
        org.jfree.data.Range range65 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset62, (double) (short) -1);
        java.util.List list66 = categoryDataset62.getRowKeys();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection67 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset69 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo70 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent71 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset69, datasetChangeInfo70);
        xYIntervalSeriesCollection67.notifyListeners(datasetChangeEvent71);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState73 = xYIntervalSeriesCollection67.getSelectionState();
        org.jfree.data.Range range74 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection67);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection75 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder76 = xYIntervalSeriesCollection75.getDomainOrder();
        int int77 = xYIntervalSeriesCollection75.getSeriesCount();
        boolean boolean78 = xYIntervalSeriesCollection67.hasListener((java.util.EventListener) xYIntervalSeriesCollection75);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo79 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent80 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) list66, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection75, datasetChangeInfo79);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent81 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) int14, (org.jfree.data.general.Dataset) categoryDataset36, datasetChangeInfo79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection67 and xYIntervalSeriesCollection75", xYIntervalSeriesCollection67.equals(xYIntervalSeriesCollection75) ? xYIntervalSeriesCollection67.hashCode() == xYIntervalSeriesCollection75.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        int int44 = pieDataset41.getIndex((java.lang.Comparable) 100L);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem51 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int53 = xYIntervalDataItem51.compareTo((java.lang.Object) 1.0f);
        double double54 = xYIntervalDataItem51.getXHighValue();
        org.jfree.data.Range range55 = null;
        org.jfree.data.Range range57 = org.jfree.data.Range.expandToInclude(range55, (double) 100);
        double double59 = range57.constrain((double) '4');
        boolean boolean60 = xYIntervalDataItem51.equals((java.lang.Object) '4');
        boolean boolean62 = xYIntervalDataItem51.equals((java.lang.Object) 0.0f);
        java.lang.Object obj63 = xYIntervalDataItem51.clone();
        int int64 = pieDataset41.getIndex((java.lang.Comparable) xYIntervalDataItem51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalDataItem6 and obj63", xYIntervalDataItem6.equals(obj63) ? xYIntervalDataItem6.hashCode() == obj63.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries14 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj16 = null;
        xYIntervalSeries14.firePropertyChange("", obj16, (java.lang.Object) "hi!");
        xYIntervalSeries14.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries14.add((double) 100, (double) 0, (double) (byte) -1, (double) (short) -1, (double) 100, (double) 0);
        boolean boolean28 = xYIntervalDataItem6.equals((java.lang.Object) 100);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem35 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int37 = xYIntervalDataItem35.compareTo((java.lang.Object) 1.0f);
        double double38 = xYIntervalDataItem35.getXHighValue();
        org.jfree.data.Range range39 = null;
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range39, (double) 100);
        double double43 = range41.constrain((double) '4');
        boolean boolean44 = xYIntervalDataItem35.equals((java.lang.Object) '4');
        org.jfree.data.Range range45 = null;
        org.jfree.data.Range range47 = org.jfree.data.Range.expandToInclude(range45, (double) 100);
        double double49 = range47.constrain((double) '4');
        int int50 = xYIntervalDataItem35.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray63 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray66 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray69 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray72 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray73 = new java.lang.Number[][] { numberArray57, numberArray60, numberArray63, numberArray66, numberArray69, numberArray72 };
        org.jfree.data.category.CategoryDataset categoryDataset74 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray73);
        org.jfree.data.category.CategoryDataset categoryDataset75 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray73);
        int int76 = xYIntervalDataItem35.compareTo((java.lang.Object) categoryDataset75);
        int int78 = categoryDataset75.getRowIndex((java.lang.Comparable) "org.jfree.data.event.DatasetChangeEvent[source=-1]");
        int int79 = xYIntervalDataItem6.compareTo((java.lang.Object) "org.jfree.data.event.DatasetChangeEvent[source=-1]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and xYIntervalDataItem35", obj10.equals(xYIntervalDataItem35) ? obj10.hashCode() == xYIntervalDataItem35.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        int int44 = pieDataset41.getIndex((java.lang.Comparable) 100L);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem51 = new org.jfree.data.xy.XYIntervalDataItem(100.0d, (double) (byte) 1, (double) (byte) 1, 0.0d, 0.0d, 33.0d);
        int int52 = pieDataset41.getIndex((java.lang.Comparable) xYIntervalDataItem51);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent53 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) pieDataset41);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo54 = null;
        seriesChangeEvent53.setSummary(seriesChangeInfo54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset41", pieDataset36.equals(pieDataset41) ? pieDataset36.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem7 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int9 = xYIntervalDataItem7.compareTo((java.lang.Object) 1.0f);
        double double10 = xYIntervalDataItem7.getXHighValue();
        java.lang.Object obj11 = xYIntervalDataItem7.clone();
        boolean boolean13 = xYIntervalDataItem7.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray30 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray34 = new java.lang.Number[][] { numberArray18, numberArray21, numberArray24, numberArray27, numberArray30, numberArray33 };
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray34);
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset35, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState38 = pieDataset37.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset42 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset37, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset43 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem7, (org.jfree.data.KeyedValues) pieDataset42);
        boolean boolean44 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset42);
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 1, (org.jfree.data.KeyedValues) pieDataset42);
        org.jfree.data.Range range46 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset37 and pieDataset42", pieDataset37.equals(pieDataset42) ? pieDataset37.hashCode() == pieDataset42.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        java.lang.Comparable[] comparableArray7 = new java.lang.Comparable[] { xYIntervalDataItem6 };
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem16 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int18 = xYIntervalDataItem16.compareTo((java.lang.Object) 1.0f);
        double double19 = xYIntervalDataItem16.getXHighValue();
        java.lang.Object obj20 = xYIntervalDataItem16.clone();
        boolean boolean22 = xYIntervalDataItem16.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray30 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray43 = new java.lang.Number[][] { numberArray27, numberArray30, numberArray33, numberArray36, numberArray39, numberArray42 };
        org.jfree.data.category.CategoryDataset categoryDataset44 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray43);
        org.jfree.data.pie.PieDataset pieDataset46 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset44, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState47 = pieDataset46.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset51 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset46, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset52 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem16, (org.jfree.data.KeyedValues) pieDataset51);
        java.lang.Comparable[] comparableArray53 = new java.lang.Comparable[] { "org.jfree.data.event.SeriesChangeEvent[source=true]", 6, xYIntervalDataItem16 };
        double[] doubleArray61 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray62 = new double[][] { doubleArray61 };
        org.jfree.data.category.CategoryDataset categoryDataset63 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray62);
        org.jfree.data.category.CategoryDataset categoryDataset64 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray62);
        org.jfree.data.category.CategoryDataset categoryDataset65 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray7, comparableArray53, doubleArray62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalDataItem6 and xYIntervalDataItem16", xYIntervalDataItem6.equals(xYIntervalDataItem16) ? xYIntervalDataItem6.hashCode() == xYIntervalDataItem16.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries43 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset41", pieDataset36.equals(pieDataset41) ? pieDataset36.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener9 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener9);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries14 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries14.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo17 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent18 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo17);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo19 = null;
        seriesChangeEvent18.setSummary(seriesChangeInfo19);
        java.lang.Object obj21 = seriesChangeEvent18.getSource();
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent18);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj25 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection28 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset30 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo31 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset30, datasetChangeInfo31);
        xYIntervalSeriesCollection28.notifyListeners(datasetChangeEvent32);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries37 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries37.setMaximumItemCount((int) ' ');
        org.jfree.data.Range range41 = null;
        org.jfree.data.Range range43 = org.jfree.data.Range.expandToInclude(range41, (double) 100);
        double double45 = range43.constrain((double) '4');
        double double46 = range43.getLength();
        org.jfree.data.Range range47 = null;
        org.jfree.data.Range range49 = org.jfree.data.Range.expandToInclude(range47, (double) 100);
        double double51 = range49.constrain((double) '4');
        boolean boolean52 = range43.intersects(range49);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries56 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries56.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo59 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent60 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo59);
        xYIntervalSeries37.firePropertyChange("", (java.lang.Object) boolean52, (java.lang.Object) ' ');
        xYIntervalSeriesCollection28.removeSeries(xYIntervalSeries37);
        xYIntervalSeries37.fireSeriesChanged();
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj25 and xYIntervalSeriesCollection28", obj25.equals(xYIntervalSeriesCollection28) ? obj25.hashCode() == xYIntervalSeriesCollection28.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem16 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int18 = xYIntervalDataItem16.compareTo((java.lang.Object) 1.0f);
        double double19 = xYIntervalDataItem16.getXHighValue();
        org.jfree.data.Range range20 = null;
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range20, (double) 100);
        double double24 = range22.constrain((double) '4');
        boolean boolean25 = xYIntervalDataItem16.equals((java.lang.Object) '4');
        boolean boolean27 = xYIntervalDataItem16.equals((java.lang.Object) 0.0f);
        java.lang.Object obj28 = xYIntervalDataItem16.clone();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries29 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem16);
        int int30 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem16);
        java.lang.Number[] numberArray35 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray51 = new java.lang.Number[][] { numberArray35, numberArray38, numberArray41, numberArray44, numberArray47, numberArray50 };
        org.jfree.data.category.CategoryDataset categoryDataset52 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray51);
        org.jfree.data.pie.PieDataset pieDataset54 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset52, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState55 = pieDataset54.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset59 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset54, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number61 = pieDataset59.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset64 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset59, (java.lang.Comparable) 'a', (double) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener65 = null;
        pieDataset59.removeChangeListener(datasetChangeListener65);
        java.util.List list67 = pieDataset59.getKeys();
        org.jfree.data.category.CategoryDataset categoryDataset68 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) int30, (org.jfree.data.KeyedValues) pieDataset59);
        int int69 = categoryDataset68.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset54 and pieDataset59", pieDataset54.equals(pieDataset59) ? pieDataset54.hashCode() == pieDataset59.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.general.SeriesException seriesException11 = new org.jfree.data.general.SeriesException("");
        org.jfree.data.general.SeriesException seriesException13 = new org.jfree.data.general.SeriesException("");
        org.jfree.data.general.SeriesException seriesException15 = new org.jfree.data.general.SeriesException("");
        seriesException13.addSuppressed((java.lang.Throwable) seriesException15);
        seriesException11.addSuppressed((java.lang.Throwable) seriesException15);
        java.lang.Throwable[] throwableArray18 = seriesException15.getSuppressed();
        boolean boolean19 = xYIntervalDataItem6.equals((java.lang.Object) seriesException15);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection20 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection20, true);
        java.lang.Object obj23 = xYIntervalSeriesCollection20.clone();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection20);
        int int25 = xYIntervalDataItem6.compareTo((java.lang.Object) range24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection20 and obj23", xYIntervalSeriesCollection20.equals(obj23) ? xYIntervalSeriesCollection20.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        boolean boolean43 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset41);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState44 = pieDataset41.getSelectionState();
        java.lang.Comparable comparable46 = pieDataset41.getKey(1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset41", pieDataset36.equals(pieDataset41) ? pieDataset36.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener5 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener5);
        java.lang.Object obj7 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection8 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset10 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo11 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent12 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset10, datasetChangeInfo11);
        xYIntervalSeriesCollection8.notifyListeners(datasetChangeEvent12);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState14 = xYIntervalSeriesCollection8.getSelectionState();
        int int16 = xYIntervalSeriesCollection8.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener17 = null;
        xYIntervalSeriesCollection8.removeChangeListener(datasetChangeListener17);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries22 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries22.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo25 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo25);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo27 = null;
        seriesChangeEvent26.setSummary(seriesChangeInfo27);
        java.lang.Object obj29 = seriesChangeEvent26.getSource();
        xYIntervalSeriesCollection8.seriesChanged(seriesChangeEvent26);
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        boolean boolean33 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection8);
        xYIntervalSeriesCollection8.removeAllSeries();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj7", xYIntervalSeriesCollection0.equals(obj7) ? xYIntervalSeriesCollection0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj19 = xYIntervalSeriesCollection0.clone();
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj19", obj3.equals(obj19) ? obj3.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        int int44 = pieDataset41.getIndex((java.lang.Comparable) 100L);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem51 = new org.jfree.data.xy.XYIntervalDataItem(100.0d, (double) (byte) 1, (double) (byte) 1, 0.0d, 0.0d, 33.0d);
        int int52 = pieDataset41.getIndex((java.lang.Comparable) xYIntervalDataItem51);
        double double53 = xYIntervalDataItem51.getYLowValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset41", pieDataset36.equals(pieDataset41) ? pieDataset36.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, 0.0d);
        double double26 = range25.getCentralValue();
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray47 = new java.lang.Number[][] { numberArray31, numberArray34, numberArray37, numberArray40, numberArray43, numberArray46 };
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray47);
        java.util.List list49 = categoryDataset48.getRowKeys();
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset48, false);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range51, 0.0d);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, (double) '#', true);
        double double57 = range56.getUpperBound();
        boolean boolean58 = range25.intersects(range56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset48", categoryDataset21.equals(categoryDataset48) ? categoryDataset21.hashCode() == categoryDataset48.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem28 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        double double29 = xYIntervalDataItem28.getYLowValue();
        java.lang.Object obj30 = xYIntervalDataItem28.clone();
        java.lang.Comparable[] comparableArray34 = new java.lang.Comparable[] { int21, xYIntervalDataItem28, 31.0d, 100L, 0L };
        java.lang.Comparable[] comparableArray35 = new java.lang.Comparable[] {};
        double[] doubleArray38 = new double[] {};
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = new double[] {};
        double[][] doubleArray43 = new double[][] { doubleArray38, doubleArray39, doubleArray40, doubleArray41, doubleArray42 };
        org.jfree.data.category.CategoryDataset categoryDataset44 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.general.SeriesException: org.jfree.data.general.SeriesException: hi!1", doubleArray43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray34, comparableArray35, doubleArray43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalDataItem6 and xYIntervalDataItem28", xYIntervalDataItem6.equals(xYIntervalDataItem28) ? xYIntervalDataItem6.hashCode() == xYIntervalDataItem28.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range3 = null;
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range3, (double) 100);
        double double7 = range5.constrain((double) '4');
        double double8 = range5.getLength();
        double double9 = range5.getCentralValue();
        boolean boolean12 = range5.intersects((double) 2147483647, (double) (short) 10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection13 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset15 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo16 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent17 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset15, datasetChangeInfo16);
        xYIntervalSeriesCollection13.notifyListeners(datasetChangeEvent17);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState19 = xYIntervalSeriesCollection13.getSelectionState();
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection13);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection21 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset23 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo24 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent25 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset23, datasetChangeInfo24);
        xYIntervalSeriesCollection21.notifyListeners(datasetChangeEvent25);
        org.jfree.data.general.Dataset dataset27 = datasetChangeEvent25.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo28 = datasetChangeEvent25.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent29 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) range5, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection13, datasetChangeInfo28);
        xYIntervalSeriesCollection0.fireDatasetChanged(datasetChangeInfo28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection13 and xYIntervalSeriesCollection21", xYIntervalSeriesCollection13.equals(xYIntervalSeriesCollection21) ? xYIntervalSeriesCollection13.hashCode() == xYIntervalSeriesCollection21.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        java.lang.Object obj9 = xYIntervalSeriesCollection0.clone();
        int int10 = xYIntervalSeriesCollection0.getSeriesCount();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries14 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean15 = xYIntervalSeries14.getNotify();
        int int16 = xYIntervalSeries14.getItemCount();
        boolean boolean17 = xYIntervalSeries14.getAutoSort();
        xYIntervalSeries14.fireSeriesChanged();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries23 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj25 = null;
        xYIntervalSeries23.firePropertyChange("", obj25, (java.lang.Object) "hi!");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries31 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries31.setMaximumItemCount((int) ' ');
        org.jfree.data.Range range35 = null;
        org.jfree.data.Range range37 = org.jfree.data.Range.expandToInclude(range35, (double) 100);
        double double39 = range37.constrain((double) '4');
        double double40 = range37.getLength();
        org.jfree.data.Range range41 = null;
        org.jfree.data.Range range43 = org.jfree.data.Range.expandToInclude(range41, (double) 100);
        double double45 = range43.constrain((double) '4');
        boolean boolean46 = range37.intersects(range43);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries50 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries50.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo53 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent54 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo53);
        xYIntervalSeries31.firePropertyChange("", (java.lang.Object) boolean46, (java.lang.Object) ' ');
        xYIntervalSeries31.fireSeriesChanged();
        xYIntervalSeries14.firePropertyChange("org.jfree.data.event.DatasetChangeEvent[source=-1]", (java.lang.Object) "hi!", (java.lang.Object) xYIntervalSeries31);
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries14);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection59 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range61 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection59, true);
        java.lang.Object obj62 = xYIntervalSeriesCollection59.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem69 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int71 = xYIntervalDataItem69.compareTo((java.lang.Object) 1.0f);
        double double72 = xYIntervalDataItem69.getXHighValue();
        java.lang.Object obj73 = xYIntervalDataItem69.clone();
        boolean boolean75 = xYIntervalDataItem69.equals((java.lang.Object) 0);
        int int76 = xYIntervalSeriesCollection59.indexOf((java.lang.Comparable) xYIntervalDataItem69);
        org.jfree.data.DomainOrder domainOrder77 = xYIntervalSeriesCollection59.getDomainOrder();
        java.lang.Number number78 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection59);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent79 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) xYIntervalSeriesCollection59);
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and xYIntervalSeriesCollection59", obj9.equals(xYIntervalSeriesCollection59) ? obj9.hashCode() == xYIntervalSeriesCollection59.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries9 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries9.setMaximumItemCount((int) ' ');
        org.jfree.data.Range range13 = null;
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, (double) 100);
        double double17 = range15.constrain((double) '4');
        double double18 = range15.getLength();
        org.jfree.data.Range range19 = null;
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range19, (double) 100);
        double double23 = range21.constrain((double) '4');
        boolean boolean24 = range15.intersects(range21);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries28 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries28.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo31 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent32 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo31);
        xYIntervalSeries9.firePropertyChange("", (java.lang.Object) boolean24, (java.lang.Object) ' ');
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries9);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection35 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection35, true);
        java.lang.Object obj38 = xYIntervalSeriesCollection35.clone();
        boolean boolean39 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection35);
        xYIntervalSeriesCollection0.removeAllSeries();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection35 and obj38", xYIntervalSeriesCollection35.equals(obj38) ? xYIntervalSeriesCollection35.hashCode() == obj38.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = xYIntervalSeriesCollection0.getGroup();
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray15, numberArray18, numberArray21, numberArray24, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        java.util.List list30 = categoryDataset29.getRowKeys();
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset29, false);
        int int34 = categoryDataset29.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset36 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo37 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent38 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset36, datasetChangeInfo37);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent39 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset29, datasetChangeInfo37);
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray56 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray59 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray60 = new java.lang.Number[][] { numberArray44, numberArray47, numberArray50, numberArray53, numberArray56, numberArray59 };
        org.jfree.data.category.CategoryDataset categoryDataset61 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray60);
        java.util.List list62 = categoryDataset61.getRowKeys();
        org.jfree.data.Range range64 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset61, (double) (short) -1);
        java.util.List list65 = categoryDataset61.getRowKeys();
        org.jfree.data.Range range67 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset29, list65, false);
        boolean boolean68 = xYIntervalSeriesCollection0.equals((java.lang.Object) list65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset61", categoryDataset29.equals(categoryDataset61) ? categoryDataset29.hashCode() == categoryDataset61.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        java.lang.Object obj9 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener10 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection12 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset14 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo15 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent16 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset14, datasetChangeInfo15);
        xYIntervalSeriesCollection12.notifyListeners(datasetChangeEvent16);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState18 = xYIntervalSeriesCollection12.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener19 = null;
        xYIntervalSeriesCollection12.removeChangeListener(datasetChangeListener19);
        java.lang.Number number21 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection12);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo22 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection12.fireDatasetChanged(datasetChangeInfo22);
        boolean boolean24 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection12);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection12, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj9", xYIntervalSeriesCollection0.equals(obj9) ? xYIntervalSeriesCollection0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        boolean boolean43 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset41);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState44 = pieDataset41.getSelectionState();
        java.lang.Number number46 = pieDataset41.getValue(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset41", pieDataset36.equals(pieDataset41) ? pieDataset36.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        xYIntervalSeriesCollection0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup13 = xYIntervalSeriesCollection0.getGroup();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem20 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int22 = xYIntervalDataItem20.compareTo((java.lang.Object) 1.0f);
        double double23 = xYIntervalDataItem20.getXHighValue();
        org.jfree.data.Range range24 = null;
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range24, (double) 100);
        double double28 = range26.constrain((double) '4');
        boolean boolean29 = xYIntervalDataItem20.equals((java.lang.Object) '4');
        org.jfree.data.Range range30 = null;
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range30, (double) 100);
        double double34 = range32.constrain((double) '4');
        int int35 = xYIntervalDataItem20.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray58 = new java.lang.Number[][] { numberArray42, numberArray45, numberArray48, numberArray51, numberArray54, numberArray57 };
        org.jfree.data.category.CategoryDataset categoryDataset59 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray58);
        org.jfree.data.category.CategoryDataset categoryDataset60 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray58);
        int int61 = xYIntervalDataItem20.compareTo((java.lang.Object) categoryDataset60);
        double double62 = xYIntervalDataItem20.getXHighValue();
        int int63 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) double62);
        org.jfree.data.Range range64 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj65 = xYIntervalSeriesCollection0.clone();
        java.lang.Number[] numberArray70 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray73 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray76 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray79 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray82 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray85 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray86 = new java.lang.Number[][] { numberArray70, numberArray73, numberArray76, numberArray79, numberArray82, numberArray85 };
        org.jfree.data.category.CategoryDataset categoryDataset87 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray86);
        org.jfree.data.Range range89 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset87, true);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener90 = null;
        categoryDataset87.removeChangeListener(datasetChangeListener90);
        boolean boolean92 = xYIntervalSeriesCollection0.equals((java.lang.Object) datasetChangeListener90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset59 and categoryDataset87", categoryDataset59.equals(categoryDataset87) ? categoryDataset59.hashCode() == categoryDataset87.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState31 = pieDataset28.getSelectionState();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem38 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int40 = xYIntervalDataItem38.compareTo((java.lang.Object) 1.0f);
        double double41 = xYIntervalDataItem38.getXHighValue();
        org.jfree.data.general.SeriesException seriesException43 = new org.jfree.data.general.SeriesException("");
        org.jfree.data.general.SeriesException seriesException45 = new org.jfree.data.general.SeriesException("");
        org.jfree.data.general.SeriesException seriesException47 = new org.jfree.data.general.SeriesException("");
        seriesException45.addSuppressed((java.lang.Throwable) seriesException47);
        seriesException43.addSuppressed((java.lang.Throwable) seriesException47);
        java.lang.Throwable[] throwableArray50 = seriesException47.getSuppressed();
        boolean boolean51 = xYIntervalDataItem38.equals((java.lang.Object) seriesException47);
        int int52 = pieDataset28.getIndex((java.lang.Comparable) boolean51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        java.util.List list25 = categoryDataset21.getRowKeys();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection26 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset28 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo29 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent30 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset28, datasetChangeInfo29);
        xYIntervalSeriesCollection26.notifyListeners(datasetChangeEvent30);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState32 = xYIntervalSeriesCollection26.getSelectionState();
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection26);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection34 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder35 = xYIntervalSeriesCollection34.getDomainOrder();
        int int36 = xYIntervalSeriesCollection34.getSeriesCount();
        boolean boolean37 = xYIntervalSeriesCollection26.hasListener((java.util.EventListener) xYIntervalSeriesCollection34);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo38 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent39 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) list25, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection34, datasetChangeInfo38);
        org.jfree.data.general.Dataset dataset40 = datasetChangeEvent39.getDataset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection26 and dataset40", xYIntervalSeriesCollection26.equals(dataset40) ? xYIntervalSeriesCollection26.hashCode() == dataset40.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.DomainOrder domainOrder2 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener3 = null;
        xYIntervalSeriesCollection0.addChangeListener(datasetChangeListener3);
        org.jfree.data.DomainOrder domainOrder5 = xYIntervalSeriesCollection0.getDomainOrder();
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray13, numberArray16, numberArray19, numberArray22, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        java.util.List list28 = categoryDataset27.getRowKeys();
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset27, (double) (short) -1);
        java.util.List list31 = categoryDataset27.getRowKeys();
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset27);
        boolean boolean33 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset27);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset27);
        java.lang.Number number35 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset27);
        org.jfree.data.ComparableObjectSeries comparableObjectSeries39 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) (short) 0, false, true);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem46 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int48 = xYIntervalDataItem46.compareTo((java.lang.Object) 1.0f);
        double double49 = xYIntervalDataItem46.getXHighValue();
        org.jfree.data.Range range50 = null;
        org.jfree.data.Range range52 = org.jfree.data.Range.expandToInclude(range50, (double) 100);
        double double54 = range52.constrain((double) '4');
        boolean boolean55 = xYIntervalDataItem46.equals((java.lang.Object) '4');
        boolean boolean57 = xYIntervalDataItem46.equals((java.lang.Object) 0.0f);
        java.lang.Object obj58 = xYIntervalDataItem46.clone();
        int int59 = comparableObjectSeries39.indexOf((java.lang.Comparable) xYIntervalDataItem46);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection60 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset62 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo63 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent64 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset62, datasetChangeInfo63);
        xYIntervalSeriesCollection60.notifyListeners(datasetChangeEvent64);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState66 = xYIntervalSeriesCollection60.getSelectionState();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection67 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset69 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo70 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent71 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset69, datasetChangeInfo70);
        xYIntervalSeriesCollection67.notifyListeners(datasetChangeEvent71);
        org.jfree.data.general.Dataset dataset73 = datasetChangeEvent71.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo74 = datasetChangeEvent71.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent75 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) int59, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection60, datasetChangeInfo74);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent76 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) xYIntervalSeriesCollection0, (org.jfree.data.general.Dataset) categoryDataset27, datasetChangeInfo74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection60 and xYIntervalSeriesCollection67", xYIntervalSeriesCollection60.equals(xYIntervalSeriesCollection67) ? xYIntervalSeriesCollection60.hashCode() == xYIntervalSeriesCollection67.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Object obj13 = xYIntervalDataItem6.clone();
        double double14 = xYIntervalDataItem6.getYValue();
        double double15 = xYIntervalDataItem6.getYHighValue();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem22 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int24 = xYIntervalDataItem22.compareTo((java.lang.Object) 1.0f);
        double double25 = xYIntervalDataItem22.getXHighValue();
        java.lang.Object obj26 = xYIntervalDataItem22.clone();
        boolean boolean28 = xYIntervalDataItem22.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray49 = new java.lang.Number[][] { numberArray33, numberArray36, numberArray39, numberArray42, numberArray45, numberArray48 };
        org.jfree.data.category.CategoryDataset categoryDataset50 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray49);
        org.jfree.data.pie.PieDataset pieDataset52 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset50, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState53 = pieDataset52.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset57 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset52, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset58 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem22, (org.jfree.data.KeyedValues) pieDataset57);
        org.jfree.data.category.CategoryDataset categoryDataset59 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and xYIntervalDataItem22", obj10.equals(xYIntervalDataItem22) ? obj10.hashCode() == xYIntervalDataItem22.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jfree.data.ComparableObjectSeries comparableObjectSeries3 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) 100.0f, false, false);
        boolean boolean4 = comparableObjectSeries3.isEmpty();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem11 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int13 = xYIntervalDataItem11.compareTo((java.lang.Object) 1.0f);
        double double14 = xYIntervalDataItem11.getXHighValue();
        java.lang.Object obj15 = xYIntervalDataItem11.clone();
        boolean boolean17 = xYIntervalDataItem11.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray22 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray38 = new java.lang.Number[][] { numberArray22, numberArray25, numberArray28, numberArray31, numberArray34, numberArray37 };
        org.jfree.data.category.CategoryDataset categoryDataset39 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray38);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset39, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState42 = pieDataset41.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset46 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset41, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset47 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem11, (org.jfree.data.KeyedValues) pieDataset46);
        int int49 = pieDataset46.getIndex((java.lang.Comparable) 100L);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem56 = new org.jfree.data.xy.XYIntervalDataItem(100.0d, (double) (byte) 1, (double) (byte) 1, 0.0d, 0.0d, 33.0d);
        int int57 = pieDataset46.getIndex((java.lang.Comparable) xYIntervalDataItem56);
        comparableObjectSeries3.setKey((java.lang.Comparable) int57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset41 and pieDataset46", pieDataset41.equals(pieDataset46) ? pieDataset41.hashCode() == pieDataset46.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        java.util.List list25 = categoryDataset21.getRowKeys();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection26 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset28 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo29 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent30 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset28, datasetChangeInfo29);
        xYIntervalSeriesCollection26.notifyListeners(datasetChangeEvent30);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState32 = xYIntervalSeriesCollection26.getSelectionState();
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection26);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection34 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder35 = xYIntervalSeriesCollection34.getDomainOrder();
        int int36 = xYIntervalSeriesCollection34.getSeriesCount();
        boolean boolean37 = xYIntervalSeriesCollection26.hasListener((java.util.EventListener) xYIntervalSeriesCollection34);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo38 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent39 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) list25, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection34, datasetChangeInfo38);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo40 = datasetChangeEvent39.getInfo();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection26 and xYIntervalSeriesCollection34", xYIntervalSeriesCollection26.equals(xYIntervalSeriesCollection34) ? xYIntervalSeriesCollection26.hashCode() == xYIntervalSeriesCollection34.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jfree.data.ComparableObjectSeries comparableObjectSeries1 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) "org.jfree.data.event.DatasetChangeEvent[source=-1]");
        double[] doubleArray12 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.general.SeriesException: ", doubleArray13);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset16, 0);
        java.lang.Number[] numberArray24 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray30 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray40 = new java.lang.Number[][] { numberArray24, numberArray27, numberArray30, numberArray33, numberArray36, numberArray39 };
        org.jfree.data.category.CategoryDataset categoryDataset41 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray40);
        java.util.List list42 = categoryDataset41.getRowKeys();
        org.jfree.data.Range range44 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset41, false);
        int int46 = categoryDataset41.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset48 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo49 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent50 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset48, datasetChangeInfo49);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent51 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset41, datasetChangeInfo49);
        org.jfree.data.Range range52 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset41);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener53 = null;
        categoryDataset41.addChangeListener(datasetChangeListener53);
        java.lang.Number[] numberArray59 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray62 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray65 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray68 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray71 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray74 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray75 = new java.lang.Number[][] { numberArray59, numberArray62, numberArray65, numberArray68, numberArray71, numberArray74 };
        org.jfree.data.category.CategoryDataset categoryDataset76 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray75);
        java.util.List list77 = categoryDataset76.getRowKeys();
        org.jfree.data.Range range79 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset76, (double) (short) -1);
        java.util.List list80 = categoryDataset76.getRowKeys();
        java.lang.Number number81 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset76);
        boolean boolean82 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset76);
        org.jfree.data.Range range83 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset76);
        java.lang.Number number84 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset76);
        int int85 = categoryDataset76.getColumnCount();
        java.util.List list86 = categoryDataset76.getRowKeys();
        org.jfree.data.Range range88 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset41, list86, false);
        comparableObjectSeries1.firePropertyChange("hi!", (java.lang.Object) pieDataset18, (java.lang.Object) list86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset41 and categoryDataset76", categoryDataset41.equals(categoryDataset76) ? categoryDataset41.hashCode() == categoryDataset76.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 1.0f, 1.0d);
        org.jfree.data.general.DatasetGroup datasetGroup33 = new org.jfree.data.general.DatasetGroup("org.jfree.data.event.DatasetChangeEvent[source=-1]");
        java.lang.Object obj34 = datasetGroup33.clone();
        pieDataset28.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset31", pieDataset23.equals(pieDataset31) ? pieDataset23.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem7 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int9 = xYIntervalDataItem7.compareTo((java.lang.Object) 1.0f);
        double double10 = xYIntervalDataItem7.getXHighValue();
        java.lang.Object obj11 = xYIntervalDataItem7.clone();
        boolean boolean13 = xYIntervalDataItem7.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray30 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray34 = new java.lang.Number[][] { numberArray18, numberArray21, numberArray24, numberArray27, numberArray30, numberArray33 };
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray34);
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset35, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState38 = pieDataset37.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset42 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset37, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset43 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem7, (org.jfree.data.KeyedValues) pieDataset42);
        boolean boolean44 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset42);
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 1, (org.jfree.data.KeyedValues) pieDataset42);
        java.util.List list46 = categoryDataset45.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset37 and pieDataset42", pieDataset37.equals(pieDataset42) ? pieDataset37.hashCode() == pieDataset42.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        int int44 = pieDataset41.getIndex((java.lang.Comparable) 100L);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem51 = new org.jfree.data.xy.XYIntervalDataItem(100.0d, (double) (byte) 1, (double) (byte) 1, 0.0d, 0.0d, 33.0d);
        int int52 = pieDataset41.getIndex((java.lang.Comparable) xYIntervalDataItem51);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent53 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) pieDataset41);
        java.lang.String str54 = seriesChangeEvent53.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset41", pieDataset36.equals(pieDataset41) ? pieDataset36.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        double[] doubleArray13 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.event.SeriesChangeEvent[source= ]", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[-1.0,32.0]", "org.jfree.data.event.DatasetChangeEvent[source=-1]", doubleArray14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset18", categoryDataset16.equals(categoryDataset18) ? categoryDataset16.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (double) 100);
        double double4 = range2.constrain((double) '4');
        double double5 = range2.getLength();
        double double6 = range2.getCentralValue();
        boolean boolean9 = range2.intersects((double) 2147483647, (double) (short) 10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection10 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset12 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo13 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent14 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset12, datasetChangeInfo13);
        xYIntervalSeriesCollection10.notifyListeners(datasetChangeEvent14);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState16 = xYIntervalSeriesCollection10.getSelectionState();
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection18 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset20 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo21 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent22 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset20, datasetChangeInfo21);
        xYIntervalSeriesCollection18.notifyListeners(datasetChangeEvent22);
        org.jfree.data.general.Dataset dataset24 = datasetChangeEvent22.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo25 = datasetChangeEvent22.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent26 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) range2, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection10, datasetChangeInfo25);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range2, 67.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection10 and xYIntervalSeriesCollection18", xYIntervalSeriesCollection10.equals(xYIntervalSeriesCollection18) ? xYIntervalSeriesCollection10.hashCode() == xYIntervalSeriesCollection18.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState29 = pieDataset28.getSelectionState();
        double double30 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.DatasetGroup datasetGroup1 = xYIntervalSeriesCollection0.getGroup();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection2 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder3 = xYIntervalSeriesCollection2.getDomainOrder();
        org.jfree.data.DomainOrder domainOrder4 = xYIntervalSeriesCollection2.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection5 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset7 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo8 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent9 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset7, datasetChangeInfo8);
        xYIntervalSeriesCollection5.notifyListeners(datasetChangeEvent9);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState11 = xYIntervalSeriesCollection5.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener12 = null;
        xYIntervalSeriesCollection5.removeChangeListener(datasetChangeListener12);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection5);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo15 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection5.fireDatasetChanged(datasetChangeInfo15);
        xYIntervalSeriesCollection2.fireDatasetChanged(datasetChangeInfo15);
        xYIntervalSeriesCollection0.fireDatasetChanged(datasetChangeInfo15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection2 and xYIntervalSeriesCollection5", xYIntervalSeriesCollection2.equals(xYIntervalSeriesCollection5) ? xYIntervalSeriesCollection2.hashCode() == xYIntervalSeriesCollection5.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        org.jfree.data.DomainOrder domainOrder18 = xYIntervalSeriesCollection0.getDomainOrder();
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent20 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) xYIntervalSeriesCollection0);
        java.lang.Object obj21 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent22 = null;
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj21", obj3.equals(obj21) ? obj3.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        double[] doubleArray13 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.event.SeriesChangeEvent[source= ]", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("org.jfree.data.event.SeriesChangeEvent[source=100]", "Range[-1.0,32.0]", doubleArray14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset18", categoryDataset16.equals(categoryDataset18) ? categoryDataset16.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj8 = xYIntervalSeriesCollection0.clone();
        java.lang.Object obj9 = xYIntervalSeriesCollection0.clone();
        int int10 = xYIntervalSeriesCollection0.getSeriesCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj9", obj8.equals(obj9) ? obj8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("hi!1");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray9, numberArray12, numberArray15, numberArray18, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray22);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState26 = pieDataset25.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number32 = pieDataset30.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset30, (java.lang.Comparable) 'a', (double) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener36 = null;
        pieDataset30.removeChangeListener(datasetChangeListener36);
        java.util.List list38 = pieDataset30.getKeys();
        boolean boolean39 = datasetGroup1.equals((java.lang.Object) list38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset25 and pieDataset30", pieDataset25.equals(pieDataset30) ? pieDataset25.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Object obj13 = xYIntervalDataItem6.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem20 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int22 = xYIntervalDataItem20.compareTo((java.lang.Object) 1.0f);
        double double23 = xYIntervalDataItem20.getXHighValue();
        org.jfree.data.Range range24 = null;
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range24, (double) 100);
        double double28 = range26.constrain((double) '4');
        boolean boolean29 = xYIntervalDataItem20.equals((java.lang.Object) '4');
        org.jfree.data.Range range30 = null;
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range30, (double) 100);
        double double34 = range32.constrain((double) '4');
        int int35 = xYIntervalDataItem20.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray58 = new java.lang.Number[][] { numberArray42, numberArray45, numberArray48, numberArray51, numberArray54, numberArray57 };
        org.jfree.data.category.CategoryDataset categoryDataset59 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray58);
        org.jfree.data.category.CategoryDataset categoryDataset60 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray58);
        int int61 = xYIntervalDataItem20.compareTo((java.lang.Object) categoryDataset60);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener62 = null;
        categoryDataset60.removeChangeListener(datasetChangeListener62);
        org.jfree.data.general.DatasetGroup datasetGroup64 = categoryDataset60.getGroup();
        boolean boolean65 = xYIntervalDataItem6.equals((java.lang.Object) datasetGroup64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and xYIntervalDataItem20", obj10.equals(xYIntervalDataItem20) ? obj10.hashCode() == xYIntervalDataItem20.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem16 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int18 = xYIntervalDataItem16.compareTo((java.lang.Object) 1.0f);
        double double19 = xYIntervalDataItem16.getXHighValue();
        org.jfree.data.Range range20 = null;
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range20, (double) 100);
        double double24 = range22.constrain((double) '4');
        boolean boolean25 = xYIntervalDataItem16.equals((java.lang.Object) '4');
        boolean boolean27 = xYIntervalDataItem16.equals((java.lang.Object) 0.0f);
        java.lang.Object obj28 = xYIntervalDataItem16.clone();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries29 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem16);
        int int30 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem16);
        java.lang.Number[] numberArray35 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray51 = new java.lang.Number[][] { numberArray35, numberArray38, numberArray41, numberArray44, numberArray47, numberArray50 };
        org.jfree.data.category.CategoryDataset categoryDataset52 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray51);
        org.jfree.data.pie.PieDataset pieDataset54 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset52, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState55 = pieDataset54.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset59 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset54, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number61 = pieDataset59.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset64 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset59, (java.lang.Comparable) 'a', (double) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener65 = null;
        pieDataset59.removeChangeListener(datasetChangeListener65);
        java.util.List list67 = pieDataset59.getKeys();
        org.jfree.data.category.CategoryDataset categoryDataset68 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) int30, (org.jfree.data.KeyedValues) pieDataset59);
        org.jfree.data.general.DatasetGroup datasetGroup69 = categoryDataset68.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset54 and pieDataset59", pieDataset54.equals(pieDataset59) ? pieDataset54.hashCode() == pieDataset59.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        double[] doubleArray11 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.event.SeriesChangeEvent[source= ]", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray12);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset16, true);
        double double20 = range18.constrain(31.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset16", categoryDataset14.equals(categoryDataset16) ? categoryDataset14.hashCode() == categoryDataset16.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener9 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener9);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries14 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries14.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo17 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent18 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo17);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo19 = null;
        seriesChangeEvent18.setSummary(seriesChangeInfo19);
        java.lang.Object obj21 = seriesChangeEvent18.getSource();
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent18);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection25 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset27 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo28 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent29 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset27, datasetChangeInfo28);
        xYIntervalSeriesCollection25.notifyListeners(datasetChangeEvent29);
        org.jfree.data.general.Dataset dataset31 = datasetChangeEvent29.getDataset();
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent29);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo33 = datasetChangeEvent29.getInfo();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and xYIntervalSeriesCollection25", xYIntervalSeriesCollection0.equals(xYIntervalSeriesCollection25) ? xYIntervalSeriesCollection0.hashCode() == xYIntervalSeriesCollection25.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries9 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries9.setMaximumItemCount((int) ' ');
        org.jfree.data.Range range13 = null;
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, (double) 100);
        double double17 = range15.constrain((double) '4');
        double double18 = range15.getLength();
        org.jfree.data.Range range19 = null;
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range19, (double) 100);
        double double23 = range21.constrain((double) '4');
        boolean boolean24 = range15.intersects(range21);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries28 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries28.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo31 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent32 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo31);
        xYIntervalSeries9.firePropertyChange("", (java.lang.Object) boolean24, (java.lang.Object) ' ');
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries9);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection35 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection35, true);
        java.lang.Object obj38 = xYIntervalSeriesCollection35.clone();
        boolean boolean39 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection35);
        int int40 = xYIntervalSeriesCollection0.getSeriesCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection35 and obj38", xYIntervalSeriesCollection35.equals(obj38) ? xYIntervalSeriesCollection35.hashCode() == obj38.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj19 = xYIntervalSeriesCollection0.clone();
        int int21 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj19", obj3.equals(obj19) ? obj3.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jfree.data.ComparableObjectSeries comparableObjectSeries3 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) (short) 0, false, true);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        org.jfree.data.Range range14 = null;
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range14, (double) 100);
        double double18 = range16.constrain((double) '4');
        boolean boolean19 = xYIntervalDataItem10.equals((java.lang.Object) '4');
        boolean boolean21 = xYIntervalDataItem10.equals((java.lang.Object) 0.0f);
        java.lang.Object obj22 = xYIntervalDataItem10.clone();
        int int23 = comparableObjectSeries3.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        double[] doubleArray33 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray34 = new double[][] { doubleArray33 };
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray34);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray34);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.general.SeriesException: ", doubleArray34);
        org.jfree.data.pie.PieDataset pieDataset39 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset37, 0);
        org.jfree.data.category.CategoryDataset categoryDataset40 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) int23, (org.jfree.data.KeyedValues) pieDataset39);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection41 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range43 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection41, true);
        java.lang.Object obj44 = xYIntervalSeriesCollection41.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem51 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int53 = xYIntervalDataItem51.compareTo((java.lang.Object) 1.0f);
        double double54 = xYIntervalDataItem51.getXHighValue();
        java.lang.Object obj55 = xYIntervalDataItem51.clone();
        boolean boolean57 = xYIntervalDataItem51.equals((java.lang.Object) 0);
        int int58 = xYIntervalSeriesCollection41.indexOf((java.lang.Comparable) xYIntervalDataItem51);
        org.jfree.data.pie.PieDataset pieDataset61 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset39, (java.lang.Comparable) xYIntervalDataItem51, 0.0d, 2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalDataItem10 and obj55", xYIntervalDataItem10.equals(obj55) ? xYIntervalDataItem10.hashCode() == obj55.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState29 = pieDataset28.getSelectionState();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem36 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int38 = xYIntervalDataItem36.compareTo((java.lang.Object) 1.0f);
        double double39 = xYIntervalDataItem36.getXHighValue();
        org.jfree.data.Range range40 = null;
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range40, (double) 100);
        double double44 = range42.constrain((double) '4');
        boolean boolean45 = xYIntervalDataItem36.equals((java.lang.Object) '4');
        org.jfree.data.Range range46 = null;
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range46, (double) 100);
        double double50 = range48.constrain((double) '4');
        int int51 = xYIntervalDataItem36.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray58 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray61 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray64 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray67 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray70 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray73 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray74 = new java.lang.Number[][] { numberArray58, numberArray61, numberArray64, numberArray67, numberArray70, numberArray73 };
        org.jfree.data.category.CategoryDataset categoryDataset75 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray74);
        org.jfree.data.category.CategoryDataset categoryDataset76 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray74);
        int int77 = xYIntervalDataItem36.compareTo((java.lang.Object) categoryDataset76);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener78 = null;
        categoryDataset76.removeChangeListener(datasetChangeListener78);
        org.jfree.data.general.DatasetGroup datasetGroup80 = categoryDataset76.getGroup();
        java.lang.Object obj81 = datasetGroup80.clone();
        pieDataset28.setGroup(datasetGroup80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset75", categoryDataset21.equals(categoryDataset75) ? categoryDataset21.hashCode() == categoryDataset75.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        int int7 = xYIntervalSeriesCollection0.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = xYIntervalSeriesCollection0.getGroup();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection9 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset11 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo12 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent13 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset11, datasetChangeInfo12);
        xYIntervalSeriesCollection9.notifyListeners(datasetChangeEvent13);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState15 = xYIntervalSeriesCollection9.getSelectionState();
        int int17 = xYIntervalSeriesCollection9.indexOf((java.lang.Comparable) 10.0f);
        java.lang.Object obj18 = xYIntervalSeriesCollection9.clone();
        int int19 = xYIntervalSeriesCollection9.getSeriesCount();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries23 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean24 = xYIntervalSeries23.getNotify();
        int int25 = xYIntervalSeries23.getItemCount();
        boolean boolean26 = xYIntervalSeries23.getAutoSort();
        xYIntervalSeries23.fireSeriesChanged();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries32 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj34 = null;
        xYIntervalSeries32.firePropertyChange("", obj34, (java.lang.Object) "hi!");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries40 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries40.setMaximumItemCount((int) ' ');
        org.jfree.data.Range range44 = null;
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range44, (double) 100);
        double double48 = range46.constrain((double) '4');
        double double49 = range46.getLength();
        org.jfree.data.Range range50 = null;
        org.jfree.data.Range range52 = org.jfree.data.Range.expandToInclude(range50, (double) 100);
        double double54 = range52.constrain((double) '4');
        boolean boolean55 = range46.intersects(range52);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries59 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries59.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo62 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent63 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo62);
        xYIntervalSeries40.firePropertyChange("", (java.lang.Object) boolean55, (java.lang.Object) ' ');
        xYIntervalSeries40.fireSeriesChanged();
        xYIntervalSeries23.firePropertyChange("org.jfree.data.event.DatasetChangeEvent[source=-1]", (java.lang.Object) "hi!", (java.lang.Object) xYIntervalSeries40);
        xYIntervalSeriesCollection9.removeSeries(xYIntervalSeries23);
        boolean boolean68 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection9);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries72 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries72.setMaximumItemCount((int) (short) 1);
        boolean boolean75 = xYIntervalSeries72.getAllowDuplicateXValues();
        int int76 = xYIntervalSeries72.getItemCount();
        xYIntervalSeriesCollection9.removeSeries(xYIntervalSeries72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj18", xYIntervalSeriesCollection0.equals(obj18) ? xYIntervalSeriesCollection0.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem16 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int18 = xYIntervalDataItem16.compareTo((java.lang.Object) 1.0f);
        double double19 = xYIntervalDataItem16.getXHighValue();
        org.jfree.data.Range range20 = null;
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range20, (double) 100);
        double double24 = range22.constrain((double) '4');
        boolean boolean25 = xYIntervalDataItem16.equals((java.lang.Object) '4');
        boolean boolean27 = xYIntervalDataItem16.equals((java.lang.Object) 0.0f);
        java.lang.Object obj28 = xYIntervalDataItem16.clone();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries29 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem16);
        int int30 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem16);
        java.lang.Number[] numberArray35 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray51 = new java.lang.Number[][] { numberArray35, numberArray38, numberArray41, numberArray44, numberArray47, numberArray50 };
        org.jfree.data.category.CategoryDataset categoryDataset52 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray51);
        org.jfree.data.pie.PieDataset pieDataset54 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset52, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState55 = pieDataset54.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset59 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset54, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number61 = pieDataset59.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset64 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset59, (java.lang.Comparable) 'a', (double) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener65 = null;
        pieDataset59.removeChangeListener(datasetChangeListener65);
        java.util.List list67 = pieDataset59.getKeys();
        org.jfree.data.category.CategoryDataset categoryDataset68 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) int30, (org.jfree.data.KeyedValues) pieDataset59);
        org.jfree.data.Range range70 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset68, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset54 and pieDataset59", pieDataset54.equals(pieDataset59) ? pieDataset54.hashCode() == pieDataset59.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray11, numberArray14, numberArray17, numberArray20, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray24);
        java.util.List list26 = categoryDataset25.getRowKeys();
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, false);
        int int30 = categoryDataset25.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean31 = xYIntervalSeriesCollection0.equals((java.lang.Object) categoryDataset25);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        xYIntervalSeriesCollection0.removeAllSeries();
        java.lang.Number number35 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection38 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset40 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo41 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent42 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset40, datasetChangeInfo41);
        xYIntervalSeriesCollection38.notifyListeners(datasetChangeEvent42);
        org.jfree.data.general.Dataset dataset44 = datasetChangeEvent42.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo45 = datasetChangeEvent42.getInfo();
        xYIntervalSeriesCollection0.fireDatasetChanged(datasetChangeInfo45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and xYIntervalSeriesCollection38", obj3.equals(xYIntervalSeriesCollection38) ? obj3.hashCode() == xYIntervalSeriesCollection38.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener5 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener5);
        java.lang.Object obj7 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection8 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset10 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo11 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent12 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset10, datasetChangeInfo11);
        xYIntervalSeriesCollection8.notifyListeners(datasetChangeEvent12);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState14 = xYIntervalSeriesCollection8.getSelectionState();
        int int16 = xYIntervalSeriesCollection8.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener17 = null;
        xYIntervalSeriesCollection8.removeChangeListener(datasetChangeListener17);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries22 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries22.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo25 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo25);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo27 = null;
        seriesChangeEvent26.setSummary(seriesChangeInfo27);
        java.lang.Object obj29 = seriesChangeEvent26.getSource();
        xYIntervalSeriesCollection8.seriesChanged(seriesChangeEvent26);
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        boolean boolean33 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection8);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and xYIntervalSeriesCollection8", obj7.equals(xYIntervalSeriesCollection8) ? obj7.hashCode() == xYIntervalSeriesCollection8.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        int int4 = xYIntervalSeriesCollection0.getSeriesCount();
        int int6 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 100.0d);
        org.jfree.data.DomainOrder domainOrder7 = xYIntervalSeriesCollection0.getDomainOrder();
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener9 = null;
        xYIntervalSeriesCollection0.addChangeListener(datasetChangeListener9);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection12 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset14 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo15 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent16 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset14, datasetChangeInfo15);
        xYIntervalSeriesCollection12.notifyListeners(datasetChangeEvent16);
        org.jfree.data.general.Dataset dataset18 = datasetChangeEvent16.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo19 = datasetChangeEvent16.getInfo();
        java.lang.Object obj20 = datasetChangeEvent16.getSource();
        org.jfree.data.general.Dataset dataset21 = datasetChangeEvent16.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo22 = datasetChangeEvent16.getInfo();
        org.jfree.data.general.Dataset dataset23 = datasetChangeEvent16.getDataset();
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and xYIntervalSeriesCollection12", obj3.equals(xYIntervalSeriesCollection12) ? obj3.hashCode() == xYIntervalSeriesCollection12.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries21 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean22 = xYIntervalSeries21.getNotify();
        int int23 = xYIntervalSeries21.getItemCount();
        boolean boolean24 = xYIntervalSeries21.getAutoSort();
        xYIntervalSeries21.fireSeriesChanged();
        xYIntervalSeries21.setMaximumItemCount((int) (short) 0);
        xYIntervalSeries21.clear();
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries21);
        boolean boolean30 = xYIntervalSeries21.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj3", xYIntervalSeriesCollection0.equals(obj3) ? xYIntervalSeriesCollection0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        boolean boolean29 = range27.contains((double) (byte) 1);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range27, 1.0d, true);
        org.jfree.data.Range range33 = null;
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, (double) 100);
        double double37 = range35.constrain((double) '4');
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range35, (double) (byte) 1, false);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range27, range40);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection42 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset44 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo45 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent46 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset44, datasetChangeInfo45);
        xYIntervalSeriesCollection42.notifyListeners(datasetChangeEvent46);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState48 = xYIntervalSeriesCollection42.getSelectionState();
        org.jfree.data.Range range49 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection42);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection50 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder51 = xYIntervalSeriesCollection50.getDomainOrder();
        int int52 = xYIntervalSeriesCollection50.getSeriesCount();
        boolean boolean53 = xYIntervalSeriesCollection42.hasListener((java.util.EventListener) xYIntervalSeriesCollection50);
        xYIntervalSeriesCollection50.validateObject();
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState55 = xYIntervalSeriesCollection50.getSelectionState();
        java.lang.Number[] numberArray61 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray64 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray67 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray70 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray73 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray76 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray77 = new java.lang.Number[][] { numberArray61, numberArray64, numberArray67, numberArray70, numberArray73, numberArray76 };
        org.jfree.data.category.CategoryDataset categoryDataset78 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray77);
        java.util.List list79 = categoryDataset78.getRowKeys();
        org.jfree.data.Range range81 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset78, false);
        int int83 = categoryDataset78.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset85 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo86 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent87 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset85, datasetChangeInfo86);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent88 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset78, datasetChangeInfo86);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent89 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) range27, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection50, datasetChangeInfo86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset78", categoryDataset21.equals(categoryDataset78) ? categoryDataset21.hashCode() == categoryDataset78.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        double double29 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 'a', (double) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener34 = null;
        pieDataset28.removeChangeListener(datasetChangeListener34);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState36 = pieDataset28.getSelectionState();
        java.lang.Comparable comparable37 = null;
        org.jfree.data.pie.PieDataset pieDataset40 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, comparable37, 35.0d, (int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 1.0f, 1.0d);
        double double32 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        boolean boolean43 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset41);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState44 = pieDataset41.getSelectionState();
        int int46 = pieDataset41.getIndex((java.lang.Comparable) "1");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset41", pieDataset36.equals(pieDataset41) ? pieDataset36.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range3 = null;
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range3, (double) 100);
        double double7 = range5.constrain((double) '4');
        double double8 = range5.getLength();
        double double9 = range5.getCentralValue();
        boolean boolean12 = range5.intersects((double) 2147483647, (double) (short) 10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection13 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset15 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo16 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent17 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset15, datasetChangeInfo16);
        xYIntervalSeriesCollection13.notifyListeners(datasetChangeEvent17);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState19 = xYIntervalSeriesCollection13.getSelectionState();
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection13);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection21 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset23 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo24 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent25 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset23, datasetChangeInfo24);
        xYIntervalSeriesCollection21.notifyListeners(datasetChangeEvent25);
        org.jfree.data.general.Dataset dataset27 = datasetChangeEvent25.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo28 = datasetChangeEvent25.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent29 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) range5, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection13, datasetChangeInfo28);
        xYIntervalSeriesCollection0.fireDatasetChanged(datasetChangeInfo28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection13 and xYIntervalSeriesCollection21", xYIntervalSeriesCollection13.equals(xYIntervalSeriesCollection21) ? xYIntervalSeriesCollection13.hashCode() == xYIntervalSeriesCollection21.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo10 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection0.fireDatasetChanged(datasetChangeInfo10);
        xYIntervalSeriesCollection0.removeAllSeries();
        org.jfree.data.DomainOrder domainOrder13 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection14 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset16 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo17 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent18 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset16, datasetChangeInfo17);
        xYIntervalSeriesCollection14.notifyListeners(datasetChangeEvent18);
        org.jfree.data.general.Dataset dataset20 = datasetChangeEvent18.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo21 = datasetChangeEvent18.getInfo();
        java.lang.Object obj22 = datasetChangeEvent18.getSource();
        org.jfree.data.general.Dataset dataset23 = datasetChangeEvent18.getDataset();
        java.lang.Object obj24 = datasetChangeEvent18.getSource();
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent18);
        org.jfree.data.ComparableObjectSeries comparableObjectSeries29 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) (short) 0, false, true);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem36 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int38 = xYIntervalDataItem36.compareTo((java.lang.Object) 1.0f);
        double double39 = xYIntervalDataItem36.getXHighValue();
        org.jfree.data.Range range40 = null;
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range40, (double) 100);
        double double44 = range42.constrain((double) '4');
        boolean boolean45 = xYIntervalDataItem36.equals((java.lang.Object) '4');
        boolean boolean47 = xYIntervalDataItem36.equals((java.lang.Object) 0.0f);
        java.lang.Object obj48 = xYIntervalDataItem36.clone();
        int int49 = comparableObjectSeries29.indexOf((java.lang.Comparable) xYIntervalDataItem36);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection50 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset52 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo53 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent54 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset52, datasetChangeInfo53);
        xYIntervalSeriesCollection50.notifyListeners(datasetChangeEvent54);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState56 = xYIntervalSeriesCollection50.getSelectionState();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection57 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset59 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo60 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent61 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset59, datasetChangeInfo60);
        xYIntervalSeriesCollection57.notifyListeners(datasetChangeEvent61);
        org.jfree.data.general.Dataset dataset63 = datasetChangeEvent61.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo64 = datasetChangeEvent61.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent65 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) int49, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection50, datasetChangeInfo64);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection14 and xYIntervalSeriesCollection50", xYIntervalSeriesCollection14.equals(xYIntervalSeriesCollection50) ? xYIntervalSeriesCollection14.hashCode() == xYIntervalSeriesCollection50.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 1, 35.0d, (int) '4');
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem34 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int36 = xYIntervalDataItem34.compareTo((java.lang.Object) 1.0f);
        boolean boolean38 = xYIntervalDataItem34.equals((java.lang.Object) 32);
        double double39 = xYIntervalDataItem34.getYValue();
        java.lang.Object obj40 = xYIntervalDataItem34.clone();
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray61 = new java.lang.Number[][] { numberArray45, numberArray48, numberArray51, numberArray54, numberArray57, numberArray60 };
        org.jfree.data.category.CategoryDataset categoryDataset62 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray61);
        java.util.List list63 = categoryDataset62.getRowKeys();
        org.jfree.data.Range range65 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset62, false);
        int int67 = categoryDataset62.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.Range range68 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset62);
        org.jfree.data.Range range71 = org.jfree.data.Range.expand(range68, (double) (byte) -1, 200.0d);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries73 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) "");
        boolean boolean74 = xYIntervalSeries73.getAllowDuplicateXValues();
        boolean boolean75 = range71.equals((java.lang.Object) xYIntervalSeries73);
        org.jfree.data.ComparableObjectItem comparableObjectItem76 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) xYIntervalDataItem34, (java.lang.Object) xYIntervalSeries73);
        int int77 = pieDataset23.getIndex((java.lang.Comparable) comparableObjectItem76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset62", categoryDataset21.equals(categoryDataset62) ? categoryDataset21.hashCode() == categoryDataset62.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj5 = null;
        xYIntervalSeries3.firePropertyChange("", obj5, (java.lang.Object) "hi!");
        xYIntervalSeries3.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries3.firePropertyChange("", (java.lang.Object) 100L, (java.lang.Object) 100.0f);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent14 = null;
        xYIntervalSeries3.notifyListeners(seriesChangeEvent14);
        java.lang.Number[] numberArray22 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray38 = new java.lang.Number[][] { numberArray22, numberArray25, numberArray28, numberArray31, numberArray34, numberArray37 };
        org.jfree.data.category.CategoryDataset categoryDataset39 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray38);
        java.util.List list40 = categoryDataset39.getRowKeys();
        org.jfree.data.Range range42 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset39, false);
        int int44 = categoryDataset39.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset46 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo47 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent48 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset46, datasetChangeInfo47);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent49 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset39, datasetChangeInfo47);
        org.jfree.data.Range range50 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset39);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener51 = null;
        categoryDataset39.addChangeListener(datasetChangeListener51);
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray63 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray66 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray69 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray72 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray73 = new java.lang.Number[][] { numberArray57, numberArray60, numberArray63, numberArray66, numberArray69, numberArray72 };
        org.jfree.data.category.CategoryDataset categoryDataset74 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray73);
        java.util.List list75 = categoryDataset74.getRowKeys();
        org.jfree.data.Range range77 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset74, (double) (short) -1);
        java.util.List list78 = categoryDataset74.getRowKeys();
        java.lang.Number number79 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset74);
        boolean boolean80 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset74);
        org.jfree.data.Range range81 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset74);
        java.lang.Number number82 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset74);
        int int83 = categoryDataset74.getColumnCount();
        java.util.List list84 = categoryDataset74.getRowKeys();
        org.jfree.data.Range range86 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset39, list84, false);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries90 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries90.setMaximumItemCount((int) (short) 1);
        boolean boolean93 = xYIntervalSeries90.getAllowDuplicateXValues();
        xYIntervalSeries90.setDescription("hi!");
        xYIntervalSeries3.firePropertyChange("org.jfree.data.event.DatasetChangeEvent[source=-1]", (java.lang.Object) range86, (java.lang.Object) xYIntervalSeries90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset39 and categoryDataset74", categoryDataset39.equals(categoryDataset74) ? categoryDataset39.hashCode() == categoryDataset74.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.general.DatasetGroup datasetGroup24 = categoryDataset21.getGroup();
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection27 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder28 = xYIntervalSeriesCollection27.getDomainOrder();
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection27);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem36 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int38 = xYIntervalDataItem36.compareTo((java.lang.Object) 1.0f);
        double double39 = xYIntervalDataItem36.getXHighValue();
        org.jfree.data.Range range40 = null;
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range40, (double) 100);
        double double44 = range42.constrain((double) '4');
        boolean boolean45 = xYIntervalDataItem36.equals((java.lang.Object) '4');
        org.jfree.data.Range range46 = null;
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range46, (double) 100);
        double double50 = range48.constrain((double) '4');
        int int51 = xYIntervalDataItem36.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray58 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray61 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray64 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray67 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray70 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray73 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray74 = new java.lang.Number[][] { numberArray58, numberArray61, numberArray64, numberArray67, numberArray70, numberArray73 };
        org.jfree.data.category.CategoryDataset categoryDataset75 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray74);
        org.jfree.data.category.CategoryDataset categoryDataset76 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray74);
        int int77 = xYIntervalDataItem36.compareTo((java.lang.Object) categoryDataset76);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener78 = null;
        categoryDataset76.removeChangeListener(datasetChangeListener78);
        org.jfree.data.general.DatasetGroup datasetGroup80 = categoryDataset76.getGroup();
        xYIntervalSeriesCollection27.setGroup(datasetGroup80);
        categoryDataset21.setGroup(datasetGroup80);
        java.lang.Object obj83 = datasetGroup80.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset75", categoryDataset21.equals(categoryDataset75) ? categoryDataset21.hashCode() == categoryDataset75.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        int int16 = xYIntervalSeriesCollection0.getSeriesCount();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener17 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener17);
        org.jfree.data.Range range19 = null;
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range19, (double) 100);
        double double23 = range21.constrain((double) '4');
        double double24 = range21.getLength();
        double double25 = range21.getCentralValue();
        boolean boolean28 = range21.intersects((double) 2147483647, (double) (short) 10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection29 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset31 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo32 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent33 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset31, datasetChangeInfo32);
        xYIntervalSeriesCollection29.notifyListeners(datasetChangeEvent33);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState35 = xYIntervalSeriesCollection29.getSelectionState();
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection29);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection37 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset39 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo40 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent41 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset39, datasetChangeInfo40);
        xYIntervalSeriesCollection37.notifyListeners(datasetChangeEvent41);
        org.jfree.data.general.Dataset dataset43 = datasetChangeEvent41.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo44 = datasetChangeEvent41.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent45 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) range21, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection29, datasetChangeInfo44);
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray63 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray66 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray67 = new java.lang.Number[][] { numberArray51, numberArray54, numberArray57, numberArray60, numberArray63, numberArray66 };
        org.jfree.data.category.CategoryDataset categoryDataset68 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray67);
        java.util.List list69 = categoryDataset68.getRowKeys();
        org.jfree.data.Range range71 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset68, false);
        int int73 = categoryDataset68.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset75 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo76 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent77 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset75, datasetChangeInfo76);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent78 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset68, datasetChangeInfo76);
        xYIntervalSeriesCollection29.notifyListeners(datasetChangeEvent78);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection29 and xYIntervalSeriesCollection37", xYIntervalSeriesCollection29.equals(xYIntervalSeriesCollection37) ? xYIntervalSeriesCollection29.hashCode() == xYIntervalSeriesCollection37.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 'a', (double) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener34 = null;
        pieDataset28.removeChangeListener(datasetChangeListener34);
        org.jfree.data.general.DatasetGroup datasetGroup36 = pieDataset28.getGroup();
        java.lang.Object obj37 = datasetGroup36.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        int int44 = pieDataset41.getIndex((java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset48 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset41, (java.lang.Comparable) (-1.0f), (double) 0.0f, 32);
        int int49 = pieDataset41.getItemCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset48", pieDataset36.equals(pieDataset48) ? pieDataset36.hashCode() == pieDataset48.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (double) 100);
        double double4 = range2.constrain((double) '4');
        double double5 = range2.getLength();
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 100, false);
        org.jfree.data.Range range9 = null;
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range9, (double) 100);
        double double13 = range11.constrain((double) '4');
        double double14 = range11.getLength();
        org.jfree.data.Range range15 = null;
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range15, (double) 100);
        double double19 = range17.constrain((double) '4');
        boolean boolean20 = range11.intersects(range17);
        boolean boolean21 = range2.intersects(range11);
        org.jfree.data.Range range22 = null;
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range22, (double) 100);
        double double26 = range24.constrain((double) '4');
        double double27 = range24.getLength();
        double double28 = range24.getCentralValue();
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray49 = new java.lang.Number[][] { numberArray33, numberArray36, numberArray39, numberArray42, numberArray45, numberArray48 };
        org.jfree.data.category.CategoryDataset categoryDataset50 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray49);
        java.util.List list51 = categoryDataset50.getRowKeys();
        org.jfree.data.Range range53 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset50, (double) (short) -1);
        java.lang.Number number54 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset50);
        org.jfree.data.Range range55 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset50);
        boolean boolean56 = range24.intersects(range55);
        boolean boolean57 = range2.intersects(range55);
        org.jfree.data.Range range60 = org.jfree.data.Range.expand(range2, (double) (short) -1, 93.0d);
        java.lang.Number[] numberArray65 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray68 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray71 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray74 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray77 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray80 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray81 = new java.lang.Number[][] { numberArray65, numberArray68, numberArray71, numberArray74, numberArray77, numberArray80 };
        org.jfree.data.category.CategoryDataset categoryDataset82 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray81);
        org.jfree.data.Range range83 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset82);
        boolean boolean84 = range60.intersects(range83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset50 and categoryDataset82", categoryDataset50.equals(categoryDataset82) ? categoryDataset50.hashCode() == categoryDataset82.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        boolean boolean29 = range27.contains((double) (byte) 1);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range27, 1.0d, true);
        org.jfree.data.Range range33 = null;
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, (double) 100);
        double double37 = range35.constrain((double) '4');
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range35, (double) (byte) 1, false);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range27, range40);
        double double42 = range41.getLowerBound();
        double double43 = range41.getLowerBound();
        double double44 = range41.getCentralValue();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem51 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int53 = xYIntervalDataItem51.compareTo((java.lang.Object) 1.0f);
        double double54 = xYIntervalDataItem51.getXHighValue();
        org.jfree.data.Range range55 = null;
        org.jfree.data.Range range57 = org.jfree.data.Range.expandToInclude(range55, (double) 100);
        double double59 = range57.constrain((double) '4');
        boolean boolean60 = xYIntervalDataItem51.equals((java.lang.Object) '4');
        org.jfree.data.Range range61 = null;
        org.jfree.data.Range range63 = org.jfree.data.Range.expandToInclude(range61, (double) 100);
        double double65 = range63.constrain((double) '4');
        int int66 = xYIntervalDataItem51.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray73 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray76 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray79 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray82 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray85 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray88 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray89 = new java.lang.Number[][] { numberArray73, numberArray76, numberArray79, numberArray82, numberArray85, numberArray88 };
        org.jfree.data.category.CategoryDataset categoryDataset90 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray89);
        org.jfree.data.category.CategoryDataset categoryDataset91 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray89);
        int int92 = xYIntervalDataItem51.compareTo((java.lang.Object) categoryDataset91);
        org.jfree.data.general.DatasetGroup datasetGroup93 = categoryDataset91.getGroup();
        org.jfree.data.Range range94 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset91);
        org.jfree.data.Range range96 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset91, false);
        boolean boolean97 = range41.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset90", categoryDataset21.equals(categoryDataset90) ? categoryDataset21.hashCode() == categoryDataset90.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem(100.0d, (double) (byte) 1, (double) (byte) 1, 0.0d, 0.0d, 33.0d);
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray27 = new java.lang.Number[][] { numberArray11, numberArray14, numberArray17, numberArray20, numberArray23, numberArray26 };
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray27);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset28, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState31 = pieDataset30.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset30, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0.0d, (org.jfree.data.KeyedValues) pieDataset30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset30 and pieDataset35", pieDataset30.equals(pieDataset35) ? pieDataset30.hashCode() == pieDataset35.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (byte) 0);
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range29, 0.0d);
        double double32 = range29.getCentralValue();
        double double33 = range29.getLowerBound();
        org.jfree.data.Range range34 = null;
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range34, (double) 100);
        double double38 = range36.constrain((double) '4');
        double double39 = range36.getLength();
        double double40 = range36.getCentralValue();
        double double42 = range36.constrain(1.0d);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range29, range36);
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray63 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray64 = new java.lang.Number[][] { numberArray48, numberArray51, numberArray54, numberArray57, numberArray60, numberArray63 };
        org.jfree.data.category.CategoryDataset categoryDataset65 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray64);
        java.util.List list66 = categoryDataset65.getRowKeys();
        org.jfree.data.Range range68 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset65, (double) (short) -1);
        boolean boolean69 = range36.intersects(range68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset65", categoryDataset21.equals(categoryDataset65) ? categoryDataset21.hashCode() == categoryDataset65.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (double) 100);
        double double4 = range2.constrain((double) '4');
        double double5 = range2.getLength();
        double double6 = range2.getCentralValue();
        boolean boolean9 = range2.intersects((double) 2147483647, (double) (short) 10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection10 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset12 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo13 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent14 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset12, datasetChangeInfo13);
        xYIntervalSeriesCollection10.notifyListeners(datasetChangeEvent14);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState16 = xYIntervalSeriesCollection10.getSelectionState();
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection18 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset20 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo21 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent22 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset20, datasetChangeInfo21);
        xYIntervalSeriesCollection18.notifyListeners(datasetChangeEvent22);
        org.jfree.data.general.Dataset dataset24 = datasetChangeEvent22.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo25 = datasetChangeEvent22.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent26 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) range2, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection10, datasetChangeInfo25);
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray48 = new java.lang.Number[][] { numberArray32, numberArray35, numberArray38, numberArray41, numberArray44, numberArray47 };
        org.jfree.data.category.CategoryDataset categoryDataset49 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray48);
        java.util.List list50 = categoryDataset49.getRowKeys();
        org.jfree.data.Range range52 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset49, false);
        int int54 = categoryDataset49.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset56 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo57 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent58 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset56, datasetChangeInfo57);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent59 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset49, datasetChangeInfo57);
        xYIntervalSeriesCollection10.notifyListeners(datasetChangeEvent59);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo61 = datasetChangeEvent59.getInfo();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection10 and xYIntervalSeriesCollection18", xYIntervalSeriesCollection10.equals(xYIntervalSeriesCollection18) ? xYIntervalSeriesCollection10.hashCode() == xYIntervalSeriesCollection18.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        int int44 = pieDataset41.getIndex((java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState45 = pieDataset41.getSelectionState();
        java.lang.Comparable comparable47 = pieDataset41.getKey(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset41", pieDataset36.equals(pieDataset41) ? pieDataset36.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener25 = null;
        categoryDataset21.removeChangeListener(datasetChangeListener25);
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray47 = new java.lang.Number[][] { numberArray31, numberArray34, numberArray37, numberArray40, numberArray43, numberArray46 };
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray47);
        java.util.List list49 = categoryDataset48.getRowKeys();
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, list49, false);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo52 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent53 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) range51, seriesChangeInfo52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset48", categoryDataset21.equals(categoryDataset48) ? categoryDataset21.hashCode() == categoryDataset48.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 'a', (double) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener34 = null;
        pieDataset28.removeChangeListener(datasetChangeListener34);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState36 = pieDataset28.getSelectionState();
        double double37 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (double) 100);
        double double4 = range2.constrain((double) '4');
        double double5 = range2.getLength();
        double double6 = range2.getCentralValue();
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray27 = new java.lang.Number[][] { numberArray11, numberArray14, numberArray17, numberArray20, numberArray23, numberArray26 };
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray27);
        java.util.List list29 = categoryDataset28.getRowKeys();
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28, (double) (short) -1);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener32 = null;
        categoryDataset28.removeChangeListener(datasetChangeListener32);
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray54 = new java.lang.Number[][] { numberArray38, numberArray41, numberArray44, numberArray47, numberArray50, numberArray53 };
        org.jfree.data.category.CategoryDataset categoryDataset55 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray54);
        java.util.List list56 = categoryDataset55.getRowKeys();
        org.jfree.data.Range range58 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset28, list56, false);
        boolean boolean59 = range2.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset28 and categoryDataset55", categoryDataset28.equals(categoryDataset55) ? categoryDataset28.hashCode() == categoryDataset55.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener25 = null;
        categoryDataset21.removeChangeListener(datasetChangeListener25);
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray47 = new java.lang.Number[][] { numberArray31, numberArray34, numberArray37, numberArray40, numberArray43, numberArray46 };
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray47);
        java.util.List list49 = categoryDataset48.getRowKeys();
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, list49, false);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range51, 198.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset48", categoryDataset21.equals(categoryDataset48) ? categoryDataset21.hashCode() == categoryDataset48.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        double double7 = xYIntervalDataItem6.getYLowValue();
        java.lang.Object obj8 = xYIntervalDataItem6.clone();
        java.lang.Object obj9 = xYIntervalDataItem6.clone();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection10 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset12 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo13 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent14 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset12, datasetChangeInfo13);
        xYIntervalSeriesCollection10.notifyListeners(datasetChangeEvent14);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState16 = xYIntervalSeriesCollection10.getSelectionState();
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10, false);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem26 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int28 = xYIntervalDataItem26.compareTo((java.lang.Object) 1.0f);
        double double29 = xYIntervalDataItem26.getXHighValue();
        org.jfree.data.Range range30 = null;
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range30, (double) 100);
        double double34 = range32.constrain((double) '4');
        boolean boolean35 = xYIntervalDataItem26.equals((java.lang.Object) '4');
        boolean boolean37 = xYIntervalDataItem26.equals((java.lang.Object) 0.0f);
        java.lang.Object obj38 = xYIntervalDataItem26.clone();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries39 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem26);
        int int40 = xYIntervalSeriesCollection10.indexOf((java.lang.Comparable) xYIntervalDataItem26);
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray61 = new java.lang.Number[][] { numberArray45, numberArray48, numberArray51, numberArray54, numberArray57, numberArray60 };
        org.jfree.data.category.CategoryDataset categoryDataset62 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray61);
        org.jfree.data.pie.PieDataset pieDataset64 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset62, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState65 = pieDataset64.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset69 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset64, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number71 = pieDataset69.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset74 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset69, (java.lang.Comparable) 'a', (double) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener75 = null;
        pieDataset69.removeChangeListener(datasetChangeListener75);
        java.util.List list77 = pieDataset69.getKeys();
        org.jfree.data.category.CategoryDataset categoryDataset78 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) int40, (org.jfree.data.KeyedValues) pieDataset69);
        boolean boolean79 = xYIntervalDataItem6.equals((java.lang.Object) int40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and xYIntervalDataItem26", obj8.equals(xYIntervalDataItem26) ? obj8.hashCode() == xYIntervalDataItem26.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries3.setMaximumItemCount((int) (short) 1);
        boolean boolean6 = xYIntervalSeries3.getAllowDuplicateXValues();
        xYIntervalSeries3.setDescription("org.jfree.data.general.SeriesException: ");
        java.lang.Object obj9 = null;
        boolean boolean10 = xYIntervalSeries3.equals(obj9);
        boolean boolean11 = xYIntervalSeries3.getNotify();
        xYIntervalSeries3.add(15.5d, 100.0d, (double) 2147483647, 67.0d, (double) (short) 1, (double) 100L);
        java.lang.Number[] numberArray24 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray30 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray40 = new java.lang.Number[][] { numberArray24, numberArray27, numberArray30, numberArray33, numberArray36, numberArray39 };
        org.jfree.data.category.CategoryDataset categoryDataset41 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray40);
        boolean boolean42 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset41);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem49 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int51 = xYIntervalDataItem49.compareTo((java.lang.Object) 1.0f);
        double double52 = xYIntervalDataItem49.getXHighValue();
        org.jfree.data.Range range53 = null;
        org.jfree.data.Range range55 = org.jfree.data.Range.expandToInclude(range53, (double) 100);
        double double57 = range55.constrain((double) '4');
        boolean boolean58 = xYIntervalDataItem49.equals((java.lang.Object) '4');
        org.jfree.data.Range range59 = null;
        org.jfree.data.Range range61 = org.jfree.data.Range.expandToInclude(range59, (double) 100);
        double double63 = range61.constrain((double) '4');
        int int64 = xYIntervalDataItem49.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray71 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray74 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray77 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray80 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray83 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray86 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray87 = new java.lang.Number[][] { numberArray71, numberArray74, numberArray77, numberArray80, numberArray83, numberArray86 };
        org.jfree.data.category.CategoryDataset categoryDataset88 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray87);
        org.jfree.data.category.CategoryDataset categoryDataset89 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray87);
        int int90 = xYIntervalDataItem49.compareTo((java.lang.Object) categoryDataset89);
        java.util.List list91 = categoryDataset89.getColumnKeys();
        org.jfree.data.Range range93 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset41, list91, true);
        java.lang.Object obj94 = null;
        xYIntervalSeries3.firePropertyChange("org.jfree.data.general.SeriesException: hi!1", (java.lang.Object) range93, obj94);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset41 and categoryDataset88", categoryDataset41.equals(categoryDataset88) ? categoryDataset41.hashCode() == categoryDataset88.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo10 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection0.fireDatasetChanged(datasetChangeInfo10);
        xYIntervalSeriesCollection0.removeAllSeries();
        org.jfree.data.DomainOrder domainOrder13 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection14 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset16 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo17 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent18 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset16, datasetChangeInfo17);
        xYIntervalSeriesCollection14.notifyListeners(datasetChangeEvent18);
        org.jfree.data.general.Dataset dataset20 = datasetChangeEvent18.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo21 = datasetChangeEvent18.getInfo();
        java.lang.Object obj22 = datasetChangeEvent18.getSource();
        org.jfree.data.general.Dataset dataset23 = datasetChangeEvent18.getDataset();
        java.lang.Object obj24 = datasetChangeEvent18.getSource();
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent18);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo26 = datasetChangeEvent18.getInfo();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and xYIntervalSeriesCollection14", xYIntervalSeriesCollection0.equals(xYIntervalSeriesCollection14) ? xYIntervalSeriesCollection0.hashCode() == xYIntervalSeriesCollection14.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener25 = null;
        categoryDataset21.removeChangeListener(datasetChangeListener25);
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray47 = new java.lang.Number[][] { numberArray31, numberArray34, numberArray37, numberArray40, numberArray43, numberArray46 };
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray47);
        java.util.List list49 = categoryDataset48.getRowKeys();
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, list49, false);
        double double52 = range51.getCentralValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset48", categoryDataset21.equals(categoryDataset48) ? categoryDataset21.hashCode() == categoryDataset48.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj8 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.Range range9 = null;
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range9, (double) 100);
        double double13 = range11.constrain((double) '4');
        double double14 = range11.getLength();
        double double15 = range11.getCentralValue();
        boolean boolean18 = range11.intersects((double) 2147483647, (double) (short) 10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection19 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset21 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo22 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent23 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset21, datasetChangeInfo22);
        xYIntervalSeriesCollection19.notifyListeners(datasetChangeEvent23);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState25 = xYIntervalSeriesCollection19.getSelectionState();
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection19);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection27 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        xYIntervalSeriesCollection27.notifyListeners(datasetChangeEvent31);
        org.jfree.data.general.Dataset dataset33 = datasetChangeEvent31.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo34 = datasetChangeEvent31.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent35 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) range11, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection19, datasetChangeInfo34);
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray56 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray57 = new java.lang.Number[][] { numberArray41, numberArray44, numberArray47, numberArray50, numberArray53, numberArray56 };
        org.jfree.data.category.CategoryDataset categoryDataset58 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray57);
        java.util.List list59 = categoryDataset58.getRowKeys();
        org.jfree.data.Range range61 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset58, false);
        int int63 = categoryDataset58.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset65 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo66 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent67 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset65, datasetChangeInfo66);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent68 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset58, datasetChangeInfo66);
        xYIntervalSeriesCollection19.notifyListeners(datasetChangeEvent68);
        org.jfree.data.general.DatasetGroup datasetGroup70 = xYIntervalSeriesCollection19.getGroup();
        boolean boolean71 = xYIntervalSeriesCollection0.equals((java.lang.Object) xYIntervalSeriesCollection19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and xYIntervalSeriesCollection27", obj8.equals(xYIntervalSeriesCollection27) ? obj8.hashCode() == xYIntervalSeriesCollection27.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        org.jfree.data.ComparableObjectSeries comparableObjectSeries46 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) 0L, true, true);
        comparableObjectSeries46.setDescription("org.jfree.data.event.SeriesChangeEvent[source= ]");
        boolean boolean49 = xYIntervalDataItem6.equals((java.lang.Object) comparableObjectSeries46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset41", pieDataset36.equals(pieDataset41) ? pieDataset36.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection9 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder10 = xYIntervalSeriesCollection9.getDomainOrder();
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection9);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem18 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int20 = xYIntervalDataItem18.compareTo((java.lang.Object) 1.0f);
        double double21 = xYIntervalDataItem18.getXHighValue();
        org.jfree.data.Range range22 = null;
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range22, (double) 100);
        double double26 = range24.constrain((double) '4');
        boolean boolean27 = xYIntervalDataItem18.equals((java.lang.Object) '4');
        org.jfree.data.Range range28 = null;
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range28, (double) 100);
        double double32 = range30.constrain((double) '4');
        int int33 = xYIntervalDataItem18.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray49 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray52 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray55 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray56 = new java.lang.Number[][] { numberArray40, numberArray43, numberArray46, numberArray49, numberArray52, numberArray55 };
        org.jfree.data.category.CategoryDataset categoryDataset57 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray56);
        org.jfree.data.category.CategoryDataset categoryDataset58 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray56);
        int int59 = xYIntervalDataItem18.compareTo((java.lang.Object) categoryDataset58);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener60 = null;
        categoryDataset58.removeChangeListener(datasetChangeListener60);
        org.jfree.data.general.DatasetGroup datasetGroup62 = categoryDataset58.getGroup();
        xYIntervalSeriesCollection9.setGroup(datasetGroup62);
        xYIntervalSeriesCollection0.setGroup(datasetGroup62);
        java.lang.String str65 = datasetGroup62.getID();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and xYIntervalSeriesCollection9", xYIntervalSeriesCollection0.equals(xYIntervalSeriesCollection9) ? xYIntervalSeriesCollection0.hashCode() == xYIntervalSeriesCollection9.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray11, numberArray14, numberArray17, numberArray20, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray24);
        java.util.List list26 = categoryDataset25.getRowKeys();
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, false);
        int int30 = categoryDataset25.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean31 = xYIntervalSeriesCollection0.equals((java.lang.Object) categoryDataset25);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener34 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener34);
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection38 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset40 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo41 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent42 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset40, datasetChangeInfo41);
        xYIntervalSeriesCollection38.notifyListeners(datasetChangeEvent42);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState44 = xYIntervalSeriesCollection38.getSelectionState();
        org.jfree.data.Range range45 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection38);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection46 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder47 = xYIntervalSeriesCollection46.getDomainOrder();
        int int48 = xYIntervalSeriesCollection46.getSeriesCount();
        boolean boolean49 = xYIntervalSeriesCollection38.hasListener((java.util.EventListener) xYIntervalSeriesCollection46);
        boolean boolean50 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and xYIntervalSeriesCollection38", obj3.equals(xYIntervalSeriesCollection38) ? obj3.hashCode() == xYIntervalSeriesCollection38.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, 0.0d);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range23, (double) 1L, (double) (-1L));
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range23, (double) (byte) 100);
        java.lang.Number[] numberArray35 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray51 = new java.lang.Number[][] { numberArray35, numberArray38, numberArray41, numberArray44, numberArray47, numberArray50 };
        org.jfree.data.category.CategoryDataset categoryDataset52 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray51);
        org.jfree.data.Range range54 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset52, true);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range54, 0.0d);
        double double57 = range56.getCentralValue();
        org.jfree.data.Range range58 = org.jfree.data.Range.combine(range23, range56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset52", categoryDataset21.equals(categoryDataset52) ? categoryDataset21.hashCode() == categoryDataset52.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem(0.0d, (-6.0d), (double) (short) 0, (double) 100.0f, (double) 10L, (double) (byte) 0);
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray27 = new java.lang.Number[][] { numberArray11, numberArray14, numberArray17, numberArray20, numberArray23, numberArray26 };
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray27);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset28, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState31 = pieDataset30.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset30, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset35, (java.lang.Comparable) 1.0f, 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset39 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset30 and pieDataset38", pieDataset30.equals(pieDataset38) ? pieDataset30.hashCode() == pieDataset38.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener48 = null;
        categoryDataset46.removeChangeListener(datasetChangeListener48);
        java.util.List list50 = categoryDataset46.getColumnKeys();
        org.jfree.data.Range range52 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset46, false);
        java.lang.Number number53 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset46);
        org.jfree.data.Range range54 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset46);
        org.jfree.data.Range range56 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset46, false);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem63 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int65 = xYIntervalDataItem63.compareTo((java.lang.Object) 1.0f);
        boolean boolean67 = xYIntervalDataItem63.equals((java.lang.Object) 32);
        double double68 = xYIntervalDataItem63.getYLowValue();
        int int69 = categoryDataset46.getRowIndex((java.lang.Comparable) double68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalDataItem6 and xYIntervalDataItem63", xYIntervalDataItem6.equals(xYIntervalDataItem63) ? xYIntervalDataItem6.hashCode() == xYIntervalDataItem63.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray13, numberArray16, numberArray19, numberArray22, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        java.util.List list28 = categoryDataset27.getRowKeys();
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset27, false);
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset27);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener32 = null;
        categoryDataset27.removeChangeListener(datasetChangeListener32);
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray55 = new java.lang.Number[][] { numberArray39, numberArray42, numberArray45, numberArray48, numberArray51, numberArray54 };
        org.jfree.data.category.CategoryDataset categoryDataset56 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray55);
        java.util.List list57 = categoryDataset56.getRowKeys();
        org.jfree.data.Range range59 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset56, false);
        int int61 = categoryDataset56.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset63 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo64 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent65 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset63, datasetChangeInfo64);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent66 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset56, datasetChangeInfo64);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent67 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) xYIntervalSeriesCollection0, (org.jfree.data.general.Dataset) categoryDataset27, datasetChangeInfo64);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo68 = datasetChangeEvent67.getInfo();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset56", categoryDataset27.equals(categoryDataset56) ? categoryDataset27.hashCode() == categoryDataset56.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        java.util.List list25 = pieDataset23.getKeys();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem32 = new org.jfree.data.xy.XYIntervalDataItem((double) 1, 93.0d, 0.0d, 67.0d, (double) 2, (-1.0d));
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) xYIntervalDataItem32, 93.0d, 2147483647);
        java.util.List list36 = pieDataset23.getKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset35", pieDataset23.equals(pieDataset35) ? pieDataset23.hashCode() == pieDataset35.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        int int2 = xYIntervalSeriesCollection0.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = xYIntervalSeriesCollection0.getGroup();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection4 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder5 = xYIntervalSeriesCollection4.getDomainOrder();
        org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection4);
        org.jfree.data.Range range8 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection4, false);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener9 = null;
        xYIntervalSeriesCollection4.removeChangeListener(datasetChangeListener9);
        java.lang.Object obj11 = xYIntervalSeriesCollection4.clone();
        boolean boolean12 = xYIntervalSeriesCollection0.equals(obj11);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection4 and obj11", xYIntervalSeriesCollection4.equals(obj11) ? xYIntervalSeriesCollection4.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries21 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean22 = xYIntervalSeries21.getNotify();
        int int23 = xYIntervalSeries21.getItemCount();
        boolean boolean24 = xYIntervalSeries21.getAutoSort();
        xYIntervalSeries21.fireSeriesChanged();
        xYIntervalSeries21.setMaximumItemCount((int) (short) 0);
        xYIntervalSeries21.clear();
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries21);
        xYIntervalSeries21.setDescription("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj3", xYIntervalSeriesCollection0.equals(obj3) ? xYIntervalSeriesCollection0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (double) 100);
        double double4 = range2.constrain((double) '4');
        double double5 = range2.getLength();
        double double6 = range2.getCentralValue();
        boolean boolean9 = range2.intersects((double) 2147483647, (double) (short) 10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection10 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset12 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo13 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent14 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset12, datasetChangeInfo13);
        xYIntervalSeriesCollection10.notifyListeners(datasetChangeEvent14);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState16 = xYIntervalSeriesCollection10.getSelectionState();
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection18 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset20 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo21 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent22 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset20, datasetChangeInfo21);
        xYIntervalSeriesCollection18.notifyListeners(datasetChangeEvent22);
        org.jfree.data.general.Dataset dataset24 = datasetChangeEvent22.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo25 = datasetChangeEvent22.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent26 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) range2, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection10, datasetChangeInfo25);
        int int27 = xYIntervalSeriesCollection10.getSeriesCount();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection28 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset30 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo31 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset30, datasetChangeInfo31);
        xYIntervalSeriesCollection28.notifyListeners(datasetChangeEvent32);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState34 = xYIntervalSeriesCollection28.getSelectionState();
        int int36 = xYIntervalSeriesCollection28.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState37 = null;
        xYIntervalSeriesCollection28.setSelectionState(xYDatasetSelectionState37);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries40 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 32.0d);
        xYIntervalSeriesCollection28.removeSeries(xYIntervalSeries40);
        boolean boolean42 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection28);
        java.lang.Number number43 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection28);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection44 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset46 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo47 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent48 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset46, datasetChangeInfo47);
        xYIntervalSeriesCollection44.notifyListeners(datasetChangeEvent48);
        org.jfree.data.general.Dataset dataset50 = datasetChangeEvent48.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo51 = datasetChangeEvent48.getInfo();
        java.lang.Object obj52 = datasetChangeEvent48.getSource();
        org.jfree.data.general.Dataset dataset53 = datasetChangeEvent48.getDataset();
        java.lang.Object obj54 = datasetChangeEvent48.getSource();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo55 = datasetChangeEvent48.getInfo();
        xYIntervalSeriesCollection28.notifyListeners(datasetChangeEvent48);
        boolean boolean57 = xYIntervalSeriesCollection10.hasListener((java.util.EventListener) xYIntervalSeriesCollection28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection18 and xYIntervalSeriesCollection44", xYIntervalSeriesCollection18.equals(xYIntervalSeriesCollection44) ? xYIntervalSeriesCollection18.hashCode() == xYIntervalSeriesCollection44.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection29 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset31 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo32 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent33 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset31, datasetChangeInfo32);
        xYIntervalSeriesCollection29.notifyListeners(datasetChangeEvent33);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState35 = xYIntervalSeriesCollection29.getSelectionState();
        org.jfree.data.general.DatasetGroup datasetGroup36 = xYIntervalSeriesCollection29.getGroup();
        pieDataset23.setGroup(datasetGroup36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        org.jfree.data.general.DatasetGroup datasetGroup48 = categoryDataset46.getGroup();
        java.lang.Object obj49 = datasetGroup48.clone();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries53 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean54 = xYIntervalSeries53.getNotify();
        int int55 = xYIntervalSeries53.getItemCount();
        boolean boolean56 = xYIntervalSeries53.getAutoSort();
        xYIntervalSeries53.fireSeriesChanged();
        boolean boolean58 = xYIntervalSeries53.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYIntervalSeries53.addPropertyChangeListener(propertyChangeListener59);
        boolean boolean61 = datasetGroup48.equals((java.lang.Object) xYIntervalSeries53);
        java.lang.String str62 = xYIntervalSeries53.getDescription();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup48 and obj49", datasetGroup48.equals(obj49) ? datasetGroup48.hashCode() == obj49.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        int int44 = pieDataset41.getIndex((java.lang.Comparable) 100L);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem51 = new org.jfree.data.xy.XYIntervalDataItem(100.0d, (double) (byte) 1, (double) (byte) 1, 0.0d, 0.0d, 33.0d);
        int int52 = pieDataset41.getIndex((java.lang.Comparable) xYIntervalDataItem51);
        org.jfree.data.pie.PieDataset pieDataset56 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset41, (java.lang.Comparable) 15.5d, (double) 100L, (int) (byte) 1);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection57 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range59 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection57, true);
        java.lang.Object obj60 = xYIntervalSeriesCollection57.clone();
        java.lang.Number[] numberArray65 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray68 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray71 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray74 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray77 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray80 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray81 = new java.lang.Number[][] { numberArray65, numberArray68, numberArray71, numberArray74, numberArray77, numberArray80 };
        org.jfree.data.category.CategoryDataset categoryDataset82 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray81);
        java.util.List list83 = categoryDataset82.getRowKeys();
        org.jfree.data.Range range85 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset82, false);
        int int87 = categoryDataset82.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean88 = xYIntervalSeriesCollection57.equals((java.lang.Object) categoryDataset82);
        org.jfree.data.Range range90 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection57, true);
        xYIntervalSeriesCollection57.removeAllSeries();
        org.jfree.data.general.Dataset dataset93 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo94 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent95 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset93, datasetChangeInfo94);
        org.jfree.data.general.Dataset dataset96 = datasetChangeEvent95.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo97 = datasetChangeEvent95.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent98 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (byte) 1, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection57, datasetChangeInfo97);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset34 and categoryDataset82", categoryDataset34.equals(categoryDataset82) ? categoryDataset34.hashCode() == categoryDataset82.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = null;
        xYIntervalSeriesCollection0.setSelectionState(xYDatasetSelectionState9);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries12 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 32.0d);
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries12);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection15 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset17 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo18 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent19 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset17, datasetChangeInfo18);
        xYIntervalSeriesCollection15.notifyListeners(datasetChangeEvent19);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState21 = xYIntervalSeriesCollection15.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener22 = null;
        xYIntervalSeriesCollection15.removeChangeListener(datasetChangeListener22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection15);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo25 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection15.fireDatasetChanged(datasetChangeInfo25);
        xYIntervalSeriesCollection15.removeAllSeries();
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection15);
        boolean boolean29 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection15);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection15);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries34 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries34.setMaximumItemCount((int) ' ');
        xYIntervalSeries34.setDescription("");
        boolean boolean39 = xYIntervalSeries34.isEmpty();
        boolean boolean40 = xYIntervalSeries34.getAllowDuplicateXValues();
        java.lang.Object obj41 = xYIntervalSeries34.clone();
        xYIntervalSeriesCollection15.removeSeries(xYIntervalSeries34);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection43 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset45 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo46 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent47 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset45, datasetChangeInfo46);
        xYIntervalSeriesCollection43.notifyListeners(datasetChangeEvent47);
        org.jfree.data.general.Dataset dataset49 = datasetChangeEvent47.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo50 = datasetChangeEvent47.getInfo();
        java.lang.Object obj51 = datasetChangeEvent47.getSource();
        org.jfree.data.general.Dataset dataset52 = datasetChangeEvent47.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo53 = datasetChangeEvent47.getInfo();
        org.jfree.data.general.Dataset dataset54 = datasetChangeEvent47.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo55 = datasetChangeEvent47.getInfo();
        boolean boolean56 = xYIntervalSeries34.equals((java.lang.Object) datasetChangeEvent47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and xYIntervalSeriesCollection15", xYIntervalSeriesCollection0.equals(xYIntervalSeriesCollection15) ? xYIntervalSeriesCollection0.hashCode() == xYIntervalSeriesCollection15.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = null;
        xYIntervalSeriesCollection0.setSelectionState(xYDatasetSelectionState9);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries12 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 32.0d);
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries12);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection15 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset17 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo18 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent19 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset17, datasetChangeInfo18);
        xYIntervalSeriesCollection15.notifyListeners(datasetChangeEvent19);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState21 = xYIntervalSeriesCollection15.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener22 = null;
        xYIntervalSeriesCollection15.removeChangeListener(datasetChangeListener22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection15);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo25 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection15.fireDatasetChanged(datasetChangeInfo25);
        xYIntervalSeriesCollection15.removeAllSeries();
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection15);
        boolean boolean29 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection15);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection30 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset32 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo33 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent34 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset32, datasetChangeInfo33);
        xYIntervalSeriesCollection30.notifyListeners(datasetChangeEvent34);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState36 = xYIntervalSeriesCollection30.getSelectionState();
        int int38 = xYIntervalSeriesCollection30.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener39 = null;
        xYIntervalSeriesCollection30.removeChangeListener(datasetChangeListener39);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries44 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries44.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo47 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent48 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo47);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo49 = null;
        seriesChangeEvent48.setSummary(seriesChangeInfo49);
        java.lang.Object obj51 = seriesChangeEvent48.getSource();
        xYIntervalSeriesCollection30.seriesChanged(seriesChangeEvent48);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection53 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset55 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo56 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent57 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset55, datasetChangeInfo56);
        xYIntervalSeriesCollection53.notifyListeners(datasetChangeEvent57);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState59 = xYIntervalSeriesCollection53.getSelectionState();
        org.jfree.data.Range range60 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection53);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection61 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder62 = xYIntervalSeriesCollection61.getDomainOrder();
        int int63 = xYIntervalSeriesCollection61.getSeriesCount();
        boolean boolean64 = xYIntervalSeriesCollection53.hasListener((java.util.EventListener) xYIntervalSeriesCollection61);
        xYIntervalSeriesCollection61.validateObject();
        org.jfree.data.general.Dataset dataset67 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo68 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent69 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset67, datasetChangeInfo68);
        org.jfree.data.general.Dataset dataset70 = datasetChangeEvent69.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo71 = datasetChangeEvent69.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent72 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) xYIntervalSeriesCollection30, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection61, datasetChangeInfo71);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection15 and xYIntervalSeriesCollection30", xYIntervalSeriesCollection15.equals(xYIntervalSeriesCollection30) ? xYIntervalSeriesCollection15.hashCode() == xYIntervalSeriesCollection30.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        java.lang.Object obj9 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener10 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection12 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset14 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo15 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent16 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset14, datasetChangeInfo15);
        xYIntervalSeriesCollection12.notifyListeners(datasetChangeEvent16);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState18 = xYIntervalSeriesCollection12.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener19 = null;
        xYIntervalSeriesCollection12.removeChangeListener(datasetChangeListener19);
        java.lang.Number number21 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection12);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo22 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection12.fireDatasetChanged(datasetChangeInfo22);
        boolean boolean24 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection12);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection25 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder26 = xYIntervalSeriesCollection25.getDomainOrder();
        int int27 = xYIntervalSeriesCollection25.getSeriesCount();
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection25);
        boolean boolean29 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and xYIntervalSeriesCollection12", obj9.equals(xYIntervalSeriesCollection12) ? obj9.hashCode() == xYIntervalSeriesCollection12.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.DomainOrder domainOrder9 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection10 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset12 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo13 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent14 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset12, datasetChangeInfo13);
        xYIntervalSeriesCollection10.notifyListeners(datasetChangeEvent14);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState16 = xYIntervalSeriesCollection10.getSelectionState();
        int int18 = xYIntervalSeriesCollection10.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener19 = null;
        xYIntervalSeriesCollection10.removeChangeListener(datasetChangeListener19);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries24 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries24.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo27 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent28 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo27);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo29 = null;
        seriesChangeEvent28.setSummary(seriesChangeInfo29);
        java.lang.Object obj31 = seriesChangeEvent28.getSource();
        xYIntervalSeriesCollection10.seriesChanged(seriesChangeEvent28);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection33 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset35 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo36 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent37 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset35, datasetChangeInfo36);
        xYIntervalSeriesCollection33.notifyListeners(datasetChangeEvent37);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState39 = xYIntervalSeriesCollection33.getSelectionState();
        org.jfree.data.Range range40 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection33);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection41 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder42 = xYIntervalSeriesCollection41.getDomainOrder();
        int int43 = xYIntervalSeriesCollection41.getSeriesCount();
        boolean boolean44 = xYIntervalSeriesCollection33.hasListener((java.util.EventListener) xYIntervalSeriesCollection41);
        xYIntervalSeriesCollection41.validateObject();
        org.jfree.data.general.Dataset dataset47 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo48 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent49 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset47, datasetChangeInfo48);
        org.jfree.data.general.Dataset dataset50 = datasetChangeEvent49.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo51 = datasetChangeEvent49.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent52 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) xYIntervalSeriesCollection10, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection41, datasetChangeInfo51);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection10 and xYIntervalSeriesCollection33", xYIntervalSeriesCollection10.equals(xYIntervalSeriesCollection33) ? xYIntervalSeriesCollection10.hashCode() == xYIntervalSeriesCollection33.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState25 = pieDataset23.getSelectionState();
        org.jfree.data.general.DatasetGroup datasetGroup26 = pieDataset23.getGroup();
        org.jfree.data.xy.XYInterval xYInterval32 = new org.jfree.data.xy.XYInterval(52.0d, (double) 0L, (double) (short) 0, (double) 10L, (double) 1.0f);
        double double33 = xYInterval32.getYLow();
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray55 = new java.lang.Number[][] { numberArray39, numberArray42, numberArray45, numberArray48, numberArray51, numberArray54 };
        org.jfree.data.category.CategoryDataset categoryDataset56 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray55);
        java.util.List list57 = categoryDataset56.getRowKeys();
        org.jfree.data.Range range59 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset56, false);
        int int61 = categoryDataset56.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset63 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo64 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent65 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset63, datasetChangeInfo64);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent66 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset56, datasetChangeInfo64);
        org.jfree.data.Range range67 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset56);
        boolean boolean68 = xYInterval32.equals((java.lang.Object) range67);
        boolean boolean69 = datasetGroup26.equals((java.lang.Object) range67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset56", categoryDataset21.equals(categoryDataset56) ? categoryDataset21.hashCode() == categoryDataset56.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jfree.data.ComparableObjectSeries comparableObjectSeries3 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) 100.0d, false, false);
        comparableObjectSeries3.setKey((java.lang.Comparable) 10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection6 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range8 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection6, true);
        java.lang.Object obj9 = xYIntervalSeriesCollection6.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem16 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int18 = xYIntervalDataItem16.compareTo((java.lang.Object) 1.0f);
        double double19 = xYIntervalDataItem16.getXHighValue();
        java.lang.Object obj20 = xYIntervalDataItem16.clone();
        boolean boolean22 = xYIntervalDataItem16.equals((java.lang.Object) 0);
        int int23 = xYIntervalSeriesCollection6.indexOf((java.lang.Comparable) xYIntervalDataItem16);
        org.jfree.data.DomainOrder domainOrder24 = xYIntervalSeriesCollection6.getDomainOrder();
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection6);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) xYIntervalSeriesCollection6);
        comparableObjectSeries3.notifyListeners(seriesChangeEvent26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection6 and obj9", xYIntervalSeriesCollection6.equals(obj9) ? xYIntervalSeriesCollection6.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.util.List list29 = pieDataset28.getKeys();
        int int31 = pieDataset28.getIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem38 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int40 = xYIntervalDataItem38.compareTo((java.lang.Object) 1.0f);
        double double41 = xYIntervalDataItem38.getXHighValue();
        java.lang.Object obj42 = xYIntervalDataItem38.clone();
        double double43 = xYIntervalDataItem38.getXHighValue();
        org.jfree.data.pie.PieDataset pieDataset45 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) xYIntervalDataItem38, (double) 0.0f);
        int int46 = pieDataset45.getItemCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.DomainOrder domainOrder9 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries15 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries15.setMaximumItemCount((int) ' ');
        int int18 = xYIntervalSeries15.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYIntervalSeries15.removePropertyChangeListener(propertyChangeListener19);
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries15);
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray42 = new java.lang.Number[][] { numberArray26, numberArray29, numberArray32, numberArray35, numberArray38, numberArray41 };
        org.jfree.data.category.CategoryDataset categoryDataset43 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray42);
        java.util.List list44 = categoryDataset43.getRowKeys();
        org.jfree.data.Range range46 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset43, (double) (short) -1);
        java.util.List list47 = categoryDataset43.getRowKeys();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection48 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset50 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo51 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent52 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset50, datasetChangeInfo51);
        xYIntervalSeriesCollection48.notifyListeners(datasetChangeEvent52);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState54 = xYIntervalSeriesCollection48.getSelectionState();
        org.jfree.data.Range range55 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection48);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection56 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder57 = xYIntervalSeriesCollection56.getDomainOrder();
        int int58 = xYIntervalSeriesCollection56.getSeriesCount();
        boolean boolean59 = xYIntervalSeriesCollection48.hasListener((java.util.EventListener) xYIntervalSeriesCollection56);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo60 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent61 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) list47, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection56, datasetChangeInfo60);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection48 and xYIntervalSeriesCollection56", xYIntervalSeriesCollection48.equals(xYIntervalSeriesCollection56) ? xYIntervalSeriesCollection48.hashCode() == xYIntervalSeriesCollection56.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState3 = xYIntervalSeriesCollection0.getSelectionState();
        java.lang.Object obj4 = xYIntervalSeriesCollection0.clone();
        java.lang.Object obj5 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj5", obj4.equals(obj5) ? obj4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        java.lang.Object obj18 = xYIntervalDataItem10.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj3", xYIntervalSeriesCollection0.equals(obj3) ? xYIntervalSeriesCollection0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = null;
        xYIntervalSeriesCollection0.setSelectionState(xYDatasetSelectionState9);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries12 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 32.0d);
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries12);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Number number15 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.ComparableObjectSeries comparableObjectSeries19 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) (short) 0, false, true);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem26 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int28 = xYIntervalDataItem26.compareTo((java.lang.Object) 1.0f);
        double double29 = xYIntervalDataItem26.getXHighValue();
        org.jfree.data.Range range30 = null;
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range30, (double) 100);
        double double34 = range32.constrain((double) '4');
        boolean boolean35 = xYIntervalDataItem26.equals((java.lang.Object) '4');
        boolean boolean37 = xYIntervalDataItem26.equals((java.lang.Object) 0.0f);
        java.lang.Object obj38 = xYIntervalDataItem26.clone();
        int int39 = comparableObjectSeries19.indexOf((java.lang.Comparable) xYIntervalDataItem26);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection40 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset42 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo43 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent44 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset42, datasetChangeInfo43);
        xYIntervalSeriesCollection40.notifyListeners(datasetChangeEvent44);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState46 = xYIntervalSeriesCollection40.getSelectionState();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection47 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset49 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo50 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent51 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset49, datasetChangeInfo50);
        xYIntervalSeriesCollection47.notifyListeners(datasetChangeEvent51);
        org.jfree.data.general.Dataset dataset53 = datasetChangeEvent51.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo54 = datasetChangeEvent51.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent55 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) int39, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection40, datasetChangeInfo54);
        org.jfree.data.general.DatasetGroup datasetGroup56 = xYIntervalSeriesCollection40.getGroup();
        xYIntervalSeriesCollection0.setGroup(datasetGroup56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection40 and xYIntervalSeriesCollection47", xYIntervalSeriesCollection40.equals(xYIntervalSeriesCollection47) ? xYIntervalSeriesCollection40.hashCode() == xYIntervalSeriesCollection47.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 192.0d, 0.0d);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection32 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset34 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo35 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent36 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset34, datasetChangeInfo35);
        xYIntervalSeriesCollection32.notifyListeners(datasetChangeEvent36);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState38 = xYIntervalSeriesCollection32.getSelectionState();
        org.jfree.data.Range range39 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection32);
        org.jfree.data.Range range41 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection32, false);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem48 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int50 = xYIntervalDataItem48.compareTo((java.lang.Object) 1.0f);
        double double51 = xYIntervalDataItem48.getXHighValue();
        org.jfree.data.Range range52 = null;
        org.jfree.data.Range range54 = org.jfree.data.Range.expandToInclude(range52, (double) 100);
        double double56 = range54.constrain((double) '4');
        boolean boolean57 = xYIntervalDataItem48.equals((java.lang.Object) '4');
        org.jfree.data.Range range58 = null;
        org.jfree.data.Range range60 = org.jfree.data.Range.expandToInclude(range58, (double) 100);
        double double62 = range60.constrain((double) '4');
        int int63 = xYIntervalDataItem48.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray70 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray73 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray76 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray79 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray82 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray85 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray86 = new java.lang.Number[][] { numberArray70, numberArray73, numberArray76, numberArray79, numberArray82, numberArray85 };
        org.jfree.data.category.CategoryDataset categoryDataset87 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray86);
        org.jfree.data.category.CategoryDataset categoryDataset88 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray86);
        int int89 = xYIntervalDataItem48.compareTo((java.lang.Object) categoryDataset88);
        java.lang.Object obj90 = xYIntervalDataItem48.clone();
        int int91 = xYIntervalSeriesCollection32.indexOf((java.lang.Comparable) xYIntervalDataItem48);
        int int92 = pieDataset31.getIndex((java.lang.Comparable) xYIntervalDataItem48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset87", categoryDataset21.equals(categoryDataset87) ? categoryDataset21.hashCode() == categoryDataset87.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset21);
        java.lang.Number[] numberArray30 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray46 = new java.lang.Number[][] { numberArray30, numberArray33, numberArray36, numberArray39, numberArray42, numberArray45 };
        org.jfree.data.category.CategoryDataset categoryDataset47 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray46);
        boolean boolean48 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset47);
        java.lang.Number number49 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset47);
        boolean boolean50 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset47);
        org.jfree.data.Range range52 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset47, false);
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray63 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray66 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray69 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray72 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray73 = new java.lang.Number[][] { numberArray57, numberArray60, numberArray63, numberArray66, numberArray69, numberArray72 };
        org.jfree.data.category.CategoryDataset categoryDataset74 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray73);
        java.util.List list75 = categoryDataset74.getRowKeys();
        org.jfree.data.Range range77 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset47, list75, true);
        org.jfree.data.Range range79 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset21, list75, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset47 and categoryDataset74", categoryDataset47.equals(categoryDataset74) ? categoryDataset47.hashCode() == categoryDataset74.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        boolean boolean43 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset41);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState44 = pieDataset41.getSelectionState();
        double double45 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset41", pieDataset36.equals(pieDataset41) ? pieDataset36.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem25 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int27 = xYIntervalDataItem25.compareTo((java.lang.Object) 1.0f);
        double double28 = xYIntervalDataItem25.getXHighValue();
        org.jfree.data.Range range29 = null;
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range29, (double) 100);
        double double33 = range31.constrain((double) '4');
        boolean boolean34 = xYIntervalDataItem25.equals((java.lang.Object) '4');
        org.jfree.data.Range range35 = null;
        org.jfree.data.Range range37 = org.jfree.data.Range.expandToInclude(range35, (double) 100);
        double double39 = range37.constrain((double) '4');
        int int40 = xYIntervalDataItem25.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray56 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray59 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray62 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray63 = new java.lang.Number[][] { numberArray47, numberArray50, numberArray53, numberArray56, numberArray59, numberArray62 };
        org.jfree.data.category.CategoryDataset categoryDataset64 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray63);
        org.jfree.data.category.CategoryDataset categoryDataset65 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray63);
        int int66 = xYIntervalDataItem25.compareTo((java.lang.Object) categoryDataset65);
        org.jfree.data.general.DatasetGroup datasetGroup67 = categoryDataset65.getGroup();
        java.lang.Object obj68 = datasetGroup67.clone();
        xYIntervalSeriesCollection0.setGroup(datasetGroup67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalDataItem10 and xYIntervalDataItem25", xYIntervalDataItem10.equals(xYIntervalDataItem25) ? xYIntervalDataItem10.hashCode() == xYIntervalDataItem25.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries1 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 6);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection2 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection2, true);
        java.lang.Object obj5 = xYIntervalSeriesCollection2.clone();
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray13, numberArray16, numberArray19, numberArray22, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        java.util.List list28 = categoryDataset27.getRowKeys();
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset27, false);
        int int32 = categoryDataset27.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean33 = xYIntervalSeriesCollection2.equals((java.lang.Object) categoryDataset27);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection2, true);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener36 = null;
        xYIntervalSeriesCollection2.removeChangeListener(datasetChangeListener36);
        org.jfree.data.Range range39 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection2, false);
        boolean boolean40 = xYIntervalSeries1.equals((java.lang.Object) range39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection2 and obj5", xYIntervalSeriesCollection2.equals(obj5) ? xYIntervalSeriesCollection2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        int int44 = pieDataset41.getIndex((java.lang.Comparable) 100L);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem51 = new org.jfree.data.xy.XYIntervalDataItem(100.0d, (double) (byte) 1, (double) (byte) 1, 0.0d, 0.0d, 33.0d);
        int int52 = pieDataset41.getIndex((java.lang.Comparable) xYIntervalDataItem51);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries53 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset41", pieDataset36.equals(pieDataset41) ? pieDataset36.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) (short) 10, (double) 100, 100);
        java.lang.Number number36 = pieDataset34.getValue((int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        boolean boolean22 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem30 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int32 = xYIntervalDataItem30.compareTo((java.lang.Object) 1.0f);
        boolean boolean34 = xYIntervalDataItem30.equals((java.lang.Object) 32);
        double double35 = xYIntervalDataItem30.getYValue();
        java.lang.Object obj36 = xYIntervalDataItem30.clone();
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray56 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray57 = new java.lang.Number[][] { numberArray41, numberArray44, numberArray47, numberArray50, numberArray53, numberArray56 };
        org.jfree.data.category.CategoryDataset categoryDataset58 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray57);
        java.util.List list59 = categoryDataset58.getRowKeys();
        org.jfree.data.Range range61 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset58, false);
        int int63 = categoryDataset58.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.Range range64 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset58);
        org.jfree.data.Range range67 = org.jfree.data.Range.expand(range64, (double) (byte) -1, 200.0d);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries69 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) "");
        boolean boolean70 = xYIntervalSeries69.getAllowDuplicateXValues();
        boolean boolean71 = range67.equals((java.lang.Object) xYIntervalSeries69);
        org.jfree.data.ComparableObjectItem comparableObjectItem72 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) xYIntervalDataItem30, (java.lang.Object) xYIntervalSeries69);
        int int73 = categoryDataset21.getRowIndex((java.lang.Comparable) xYIntervalDataItem30);
        double double74 = xYIntervalDataItem30.getXHighValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset58", categoryDataset21.equals(categoryDataset58) ? categoryDataset21.hashCode() == categoryDataset58.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Comparable comparable30 = pieDataset23.getKey(1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        boolean boolean22 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        boolean boolean24 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset21, false);
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray47 = new java.lang.Number[][] { numberArray31, numberArray34, numberArray37, numberArray40, numberArray43, numberArray46 };
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray47);
        java.util.List list49 = categoryDataset48.getRowKeys();
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, list49, true);
        double double53 = range51.constrain(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset48", categoryDataset21.equals(categoryDataset48) ? categoryDataset21.hashCode() == categoryDataset48.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener5 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener5);
        java.lang.Object obj7 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection8 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset10 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo11 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent12 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset10, datasetChangeInfo11);
        xYIntervalSeriesCollection8.notifyListeners(datasetChangeEvent12);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState14 = xYIntervalSeriesCollection8.getSelectionState();
        int int16 = xYIntervalSeriesCollection8.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener17 = null;
        xYIntervalSeriesCollection8.removeChangeListener(datasetChangeListener17);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries22 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries22.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo25 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo25);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo27 = null;
        seriesChangeEvent26.setSummary(seriesChangeInfo27);
        java.lang.Object obj29 = seriesChangeEvent26.getSource();
        xYIntervalSeriesCollection8.seriesChanged(seriesChangeEvent26);
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        boolean boolean33 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection8);
        java.lang.Number number34 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj7", xYIntervalSeriesCollection0.equals(obj7) ? xYIntervalSeriesCollection0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (byte) 0);
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range29, 0.0d);
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range31, (double) 1L);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem40 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int42 = xYIntervalDataItem40.compareTo((java.lang.Object) 1.0f);
        double double43 = xYIntervalDataItem40.getXHighValue();
        org.jfree.data.Range range44 = null;
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range44, (double) 100);
        double double48 = range46.constrain((double) '4');
        boolean boolean49 = xYIntervalDataItem40.equals((java.lang.Object) '4');
        org.jfree.data.Range range50 = null;
        org.jfree.data.Range range52 = org.jfree.data.Range.expandToInclude(range50, (double) 100);
        double double54 = range52.constrain((double) '4');
        int int55 = xYIntervalDataItem40.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray62 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray65 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray68 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray71 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray74 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray77 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray78 = new java.lang.Number[][] { numberArray62, numberArray65, numberArray68, numberArray71, numberArray74, numberArray77 };
        org.jfree.data.category.CategoryDataset categoryDataset79 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray78);
        org.jfree.data.category.CategoryDataset categoryDataset80 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray78);
        int int81 = xYIntervalDataItem40.compareTo((java.lang.Object) categoryDataset80);
        org.jfree.data.Range range82 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset80);
        org.jfree.data.Range range84 = org.jfree.data.Range.scale(range82, 10.0d);
        boolean boolean85 = range31.equals((java.lang.Object) range84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset79", categoryDataset21.equals(categoryDataset79) ? categoryDataset21.hashCode() == categoryDataset79.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.util.List list29 = pieDataset28.getKeys();
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 100.0f, (double) (-1L), (-1));
        java.lang.Number number35 = pieDataset33.getValue(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries3.setMaximumItemCount((int) ' ');
        org.jfree.data.Range range7 = null;
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range7, (double) 100);
        double double11 = range9.constrain((double) '4');
        double double12 = range9.getLength();
        org.jfree.data.Range range13 = null;
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, (double) 100);
        double double17 = range15.constrain((double) '4');
        boolean boolean18 = range9.intersects(range15);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries22 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries22.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo25 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo25);
        xYIntervalSeries3.firePropertyChange("", (java.lang.Object) boolean18, (java.lang.Object) ' ');
        xYIntervalSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries32 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries32.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo35 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent36 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo35);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo37 = null;
        seriesChangeEvent36.setSummary(seriesChangeInfo37);
        java.lang.Object obj39 = seriesChangeEvent36.getSource();
        java.lang.Object obj40 = seriesChangeEvent36.getSource();
        java.lang.Object obj41 = seriesChangeEvent36.getSource();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo42 = seriesChangeEvent36.getSummary();
        xYIntervalSeries3.notifyListeners(seriesChangeEvent36);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem50 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int52 = xYIntervalDataItem50.compareTo((java.lang.Object) 1.0f);
        double double53 = xYIntervalDataItem50.getXHighValue();
        double double54 = xYIntervalDataItem50.getYValue();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection55 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset57 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo58 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent59 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset57, datasetChangeInfo58);
        xYIntervalSeriesCollection55.notifyListeners(datasetChangeEvent59);
        int int62 = xYIntervalSeriesCollection55.indexOf((java.lang.Comparable) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener63 = null;
        xYIntervalSeriesCollection55.removeChangeListener(datasetChangeListener63);
        org.jfree.data.Range range66 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection55, true);
        org.jfree.data.ComparableObjectItem comparableObjectItem67 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) xYIntervalDataItem50, (java.lang.Object) true);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries69 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) "");
        boolean boolean70 = xYIntervalSeries69.getAllowDuplicateXValues();
        boolean boolean71 = xYIntervalSeries69.isEmpty();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem78 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int80 = xYIntervalDataItem78.compareTo((java.lang.Object) 1.0f);
        double double81 = xYIntervalDataItem78.getXHighValue();
        org.jfree.data.Range range82 = null;
        org.jfree.data.Range range84 = org.jfree.data.Range.expandToInclude(range82, (double) 100);
        double double86 = range84.constrain((double) '4');
        boolean boolean87 = xYIntervalDataItem78.equals((java.lang.Object) '4');
        org.jfree.data.Range range88 = null;
        org.jfree.data.Range range90 = org.jfree.data.Range.expandToInclude(range88, (double) 100);
        double double92 = range90.constrain((double) '4');
        int int93 = xYIntervalDataItem78.compareTo((java.lang.Object) '4');
        double double94 = xYIntervalDataItem78.getXHighValue();
        int int95 = xYIntervalSeries69.indexOf((java.lang.Comparable) double94);
        java.lang.Object obj96 = xYIntervalSeries69.clone();
        boolean boolean97 = xYIntervalDataItem50.equals(obj96);
        xYIntervalSeries3.setKey((java.lang.Comparable) boolean97);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalDataItem50 and xYIntervalDataItem78", xYIntervalDataItem50.equals(xYIntervalDataItem78) ? xYIntervalDataItem50.hashCode() == xYIntervalDataItem78.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener9 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener9);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries14 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries14.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo17 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent18 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo17);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo19 = null;
        seriesChangeEvent18.setSummary(seriesChangeInfo19);
        java.lang.Object obj21 = seriesChangeEvent18.getSource();
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent18);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection23 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset25 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo26 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent27 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset25, datasetChangeInfo26);
        xYIntervalSeriesCollection23.notifyListeners(datasetChangeEvent27);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState29 = xYIntervalSeriesCollection23.getSelectionState();
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection23);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection31 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder32 = xYIntervalSeriesCollection31.getDomainOrder();
        int int33 = xYIntervalSeriesCollection31.getSeriesCount();
        boolean boolean34 = xYIntervalSeriesCollection23.hasListener((java.util.EventListener) xYIntervalSeriesCollection31);
        xYIntervalSeriesCollection31.validateObject();
        org.jfree.data.general.Dataset dataset37 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo38 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent39 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset37, datasetChangeInfo38);
        org.jfree.data.general.Dataset dataset40 = datasetChangeEvent39.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo41 = datasetChangeEvent39.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent42 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) xYIntervalSeriesCollection0, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection31, datasetChangeInfo41);
        org.jfree.data.ComparableObjectSeries comparableObjectSeries46 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) (short) 0, true, false);
        boolean boolean47 = comparableObjectSeries46.isEmpty();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo48 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent49 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) boolean47, seriesChangeInfo48);
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection23 and xYIntervalSeriesCollection31", xYIntervalSeriesCollection23.equals(xYIntervalSeriesCollection31) ? xYIntervalSeriesCollection23.hashCode() == xYIntervalSeriesCollection31.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener34 = null;
        categoryDataset22.addChangeListener(datasetChangeListener34);
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray49 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray52 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray55 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray56 = new java.lang.Number[][] { numberArray40, numberArray43, numberArray46, numberArray49, numberArray52, numberArray55 };
        org.jfree.data.category.CategoryDataset categoryDataset57 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray56);
        java.util.List list58 = categoryDataset57.getRowKeys();
        org.jfree.data.Range range60 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset57, (double) (short) -1);
        java.util.List list61 = categoryDataset57.getRowKeys();
        java.lang.Number number62 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset57);
        boolean boolean63 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset57);
        org.jfree.data.Range range64 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset57);
        java.lang.Number number65 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset57);
        int int66 = categoryDataset57.getColumnCount();
        java.util.List list67 = categoryDataset57.getRowKeys();
        org.jfree.data.Range range69 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, list67, false);
        org.jfree.data.Range range72 = org.jfree.data.Range.expand(range69, 52.0d, 192.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset22 and categoryDataset57", categoryDataset22.equals(categoryDataset57) ? categoryDataset22.hashCode() == categoryDataset57.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray11, numberArray14, numberArray17, numberArray20, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray24);
        java.util.List list26 = categoryDataset25.getRowKeys();
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, false);
        int int30 = categoryDataset25.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean31 = xYIntervalSeriesCollection0.equals((java.lang.Object) categoryDataset25);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj34 = xYIntervalSeriesCollection0.clone();
        java.lang.Object obj35 = xYIntervalSeriesCollection0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj34", obj3.equals(obj34) ? obj3.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.DomainOrder domainOrder9 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection10 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10, true);
        java.lang.Object obj13 = xYIntervalSeriesCollection10.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem20 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int22 = xYIntervalDataItem20.compareTo((java.lang.Object) 1.0f);
        double double23 = xYIntervalDataItem20.getXHighValue();
        java.lang.Object obj24 = xYIntervalDataItem20.clone();
        boolean boolean26 = xYIntervalDataItem20.equals((java.lang.Object) 0);
        int int27 = xYIntervalSeriesCollection10.indexOf((java.lang.Comparable) xYIntervalDataItem20);
        org.jfree.data.DomainOrder domainOrder28 = xYIntervalSeriesCollection10.getDomainOrder();
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent30 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) xYIntervalSeriesCollection10);
        xYIntervalSeriesCollection10.removeAllSeries();
        boolean boolean32 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection10);
        org.jfree.data.DomainOrder domainOrder33 = xYIntervalSeriesCollection0.getDomainOrder();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection10 and obj13", xYIntervalSeriesCollection10.equals(obj13) ? xYIntervalSeriesCollection10.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection8 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder9 = xYIntervalSeriesCollection8.getDomainOrder();
        int int10 = xYIntervalSeriesCollection8.getSeriesCount();
        boolean boolean11 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection8);
        java.lang.Number number12 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        xYIntervalSeriesCollection8.validateObject();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener14 = null;
        xYIntervalSeriesCollection8.addChangeListener(datasetChangeListener14);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState17 = xYIntervalSeriesCollection8.getSelectionState();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries21 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj23 = null;
        xYIntervalSeries21.firePropertyChange("", obj23, (java.lang.Object) "hi!");
        xYIntervalSeries21.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries21.firePropertyChange("", (java.lang.Object) 100L, (java.lang.Object) 100.0f);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem39 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int41 = xYIntervalDataItem39.compareTo((java.lang.Object) 1.0f);
        double double42 = xYIntervalDataItem39.getXHighValue();
        java.lang.Object obj43 = xYIntervalDataItem39.clone();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries47 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean48 = xYIntervalSeries47.getNotify();
        int int49 = xYIntervalSeries47.getItemCount();
        boolean boolean50 = xYIntervalSeries47.getAutoSort();
        xYIntervalSeries47.fireSeriesChanged();
        xYIntervalSeries21.firePropertyChange("", obj43, (java.lang.Object) xYIntervalSeries47);
        java.lang.Object obj53 = xYIntervalSeries21.clone();
        xYIntervalSeriesCollection8.removeSeries(xYIntervalSeries21);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        xYIntervalSeries21.removePropertyChangeListener(propertyChangeListener55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and xYIntervalSeriesCollection8", xYIntervalSeriesCollection0.equals(xYIntervalSeriesCollection8) ? xYIntervalSeriesCollection0.hashCode() == xYIntervalSeriesCollection8.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        boolean boolean22 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        boolean boolean24 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset21, false);
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray47 = new java.lang.Number[][] { numberArray31, numberArray34, numberArray37, numberArray40, numberArray43, numberArray46 };
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray47);
        java.util.List list49 = categoryDataset48.getRowKeys();
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, list49, true);
        org.jfree.data.Range range53 = org.jfree.data.Range.expandToInclude(range51, 15.5d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset48", categoryDataset21.equals(categoryDataset48) ? categoryDataset21.hashCode() == categoryDataset48.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, 0.0d);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range23, (double) 1L, (double) (-1L));
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range23, (double) '#', (double) (-1.0f));
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem38 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int40 = xYIntervalDataItem38.compareTo((java.lang.Object) 1.0f);
        double double41 = xYIntervalDataItem38.getXHighValue();
        org.jfree.data.Range range42 = null;
        org.jfree.data.Range range44 = org.jfree.data.Range.expandToInclude(range42, (double) 100);
        double double46 = range44.constrain((double) '4');
        boolean boolean47 = xYIntervalDataItem38.equals((java.lang.Object) '4');
        org.jfree.data.Range range48 = null;
        org.jfree.data.Range range50 = org.jfree.data.Range.expandToInclude(range48, (double) 100);
        double double52 = range50.constrain((double) '4');
        int int53 = xYIntervalDataItem38.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray63 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray66 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray69 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray72 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray75 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray76 = new java.lang.Number[][] { numberArray60, numberArray63, numberArray66, numberArray69, numberArray72, numberArray75 };
        org.jfree.data.category.CategoryDataset categoryDataset77 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray76);
        org.jfree.data.category.CategoryDataset categoryDataset78 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray76);
        int int79 = xYIntervalDataItem38.compareTo((java.lang.Object) categoryDataset78);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener80 = null;
        categoryDataset78.removeChangeListener(datasetChangeListener80);
        int int82 = categoryDataset78.getColumnCount();
        org.jfree.data.Range range83 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset78);
        org.jfree.data.Range range84 = org.jfree.data.Range.combine(range23, range83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset77", categoryDataset21.equals(categoryDataset77) ? categoryDataset21.hashCode() == categoryDataset77.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        java.util.List list25 = categoryDataset21.getRowKeys();
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset21, 0);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem37 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int39 = xYIntervalDataItem37.compareTo((java.lang.Object) 1.0f);
        double double40 = xYIntervalDataItem37.getXHighValue();
        double double41 = xYIntervalDataItem37.getXLowValue();
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray49 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray52 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray55 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray58 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray61 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray62 = new java.lang.Number[][] { numberArray46, numberArray49, numberArray52, numberArray55, numberArray58, numberArray61 };
        org.jfree.data.category.CategoryDataset categoryDataset63 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray62);
        java.util.List list64 = categoryDataset63.getRowKeys();
        org.jfree.data.Range range66 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset63, (double) (short) -1);
        java.util.List list67 = categoryDataset63.getRowKeys();
        java.lang.Number number68 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset63);
        boolean boolean69 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset63);
        org.jfree.data.Range range70 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset63);
        org.jfree.data.Range range71 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset63);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection72 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset74 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo75 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent76 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset74, datasetChangeInfo75);
        xYIntervalSeriesCollection72.notifyListeners(datasetChangeEvent76);
        org.jfree.data.general.Dataset dataset78 = datasetChangeEvent76.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo79 = datasetChangeEvent76.getInfo();
        java.lang.Object obj80 = datasetChangeEvent76.getSource();
        org.jfree.data.general.Dataset dataset81 = datasetChangeEvent76.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo82 = datasetChangeEvent76.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent83 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) double41, (org.jfree.data.general.Dataset) categoryDataset63, datasetChangeInfo82);
        java.lang.Number number84 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset63);
        org.jfree.data.Range range86 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset63, (double) (-1.0f));
        org.jfree.data.Range range88 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset63, false);
        org.jfree.data.Range range89 = org.jfree.data.Range.combine(range30, range88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset63", categoryDataset21.equals(categoryDataset63) ? categoryDataset21.hashCode() == categoryDataset63.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.DomainOrder domainOrder9 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection10 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10, true);
        java.lang.Object obj13 = xYIntervalSeriesCollection10.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem20 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int22 = xYIntervalDataItem20.compareTo((java.lang.Object) 1.0f);
        double double23 = xYIntervalDataItem20.getXHighValue();
        java.lang.Object obj24 = xYIntervalDataItem20.clone();
        boolean boolean26 = xYIntervalDataItem20.equals((java.lang.Object) 0);
        int int27 = xYIntervalSeriesCollection10.indexOf((java.lang.Comparable) xYIntervalDataItem20);
        org.jfree.data.DomainOrder domainOrder28 = xYIntervalSeriesCollection10.getDomainOrder();
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent30 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) xYIntervalSeriesCollection10);
        xYIntervalSeriesCollection10.removeAllSeries();
        boolean boolean32 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection10);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener33 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection10 and obj13", xYIntervalSeriesCollection10.equals(obj13) ? xYIntervalSeriesCollection10.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        java.lang.Object obj9 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener10 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection12 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset14 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo15 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent16 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset14, datasetChangeInfo15);
        xYIntervalSeriesCollection12.notifyListeners(datasetChangeEvent16);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState18 = xYIntervalSeriesCollection12.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener19 = null;
        xYIntervalSeriesCollection12.removeChangeListener(datasetChangeListener19);
        java.lang.Number number21 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection12);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo22 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection12.fireDatasetChanged(datasetChangeInfo22);
        boolean boolean24 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection12);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem31 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int33 = xYIntervalDataItem31.compareTo((java.lang.Object) 1.0f);
        double double34 = xYIntervalDataItem31.getXHighValue();
        java.lang.Object obj35 = xYIntervalDataItem31.clone();
        boolean boolean37 = xYIntervalDataItem31.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray58 = new java.lang.Number[][] { numberArray42, numberArray45, numberArray48, numberArray51, numberArray54, numberArray57 };
        org.jfree.data.category.CategoryDataset categoryDataset59 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray58);
        org.jfree.data.pie.PieDataset pieDataset61 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset59, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState62 = pieDataset61.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset66 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset61, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset67 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem31, (org.jfree.data.KeyedValues) pieDataset66);
        int int69 = pieDataset66.getIndex((java.lang.Comparable) 100L);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem76 = new org.jfree.data.xy.XYIntervalDataItem(100.0d, (double) (byte) 1, (double) (byte) 1, 0.0d, 0.0d, 33.0d);
        int int77 = pieDataset66.getIndex((java.lang.Comparable) xYIntervalDataItem76);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent78 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) pieDataset66);
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and xYIntervalSeriesCollection12", obj9.equals(xYIntervalSeriesCollection12) ? obj9.hashCode() == xYIntervalSeriesCollection12.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.util.List list29 = pieDataset28.getKeys();
        int int31 = pieDataset28.getIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem38 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int40 = xYIntervalDataItem38.compareTo((java.lang.Object) 1.0f);
        double double41 = xYIntervalDataItem38.getXHighValue();
        java.lang.Object obj42 = xYIntervalDataItem38.clone();
        double double43 = xYIntervalDataItem38.getXHighValue();
        org.jfree.data.pie.PieDataset pieDataset45 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) xYIntervalDataItem38, (double) 0.0f);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem52 = new org.jfree.data.xy.XYIntervalDataItem(0.0d, (double) (byte) 0, 192.0d, 132.0d, (double) '4', 33.0d);
        org.jfree.data.pie.PieDataset pieDataset55 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) (byte) 0, (double) 'a', 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset45", pieDataset23.equals(pieDataset45) ? pieDataset23.hashCode() == pieDataset45.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        java.lang.Double double9 = xYIntervalDataItem6.getX();
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray17, numberArray20, numberArray23, numberArray26, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        java.util.List list32 = categoryDataset31.getRowKeys();
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset31, (double) (short) -1);
        java.util.List list35 = categoryDataset31.getRowKeys();
        java.lang.Number number36 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset31);
        boolean boolean37 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset31);
        org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset31);
        java.lang.Number number39 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset31);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset31, (int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray56 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray59 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray62 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray63 = new java.lang.Number[][] { numberArray47, numberArray50, numberArray53, numberArray56, numberArray59, numberArray62 };
        org.jfree.data.category.CategoryDataset categoryDataset64 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray63);
        org.jfree.data.pie.PieDataset pieDataset66 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset64, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState67 = pieDataset66.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset71 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset66, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number73 = pieDataset71.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset76 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset71, (java.lang.Comparable) 'a', (double) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener77 = null;
        pieDataset71.removeChangeListener(datasetChangeListener77);
        org.jfree.data.general.DatasetGroup datasetGroup79 = pieDataset71.getGroup();
        categoryDataset42.setGroup(datasetGroup79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset64", categoryDataset31.equals(categoryDataset64) ? categoryDataset31.hashCode() == categoryDataset64.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        int int44 = pieDataset41.getIndex((java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset48 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset41, (java.lang.Comparable) (-1.0f), (double) 0.0f, 32);
        java.util.List list49 = pieDataset48.getKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset41", pieDataset36.equals(pieDataset41) ? pieDataset36.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries3.add((double) '4', (double) 1, 0.0d, (double) 10L, (double) (short) 1, (-1.0d));
        xYIntervalSeries3.setKey((java.lang.Comparable) "hi!");
        int int13 = xYIntervalSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection14 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder15 = xYIntervalSeriesCollection14.getDomainOrder();
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection14);
        xYIntervalSeriesCollection14.removeAllSeries();
        org.jfree.data.xy.XYInterval xYInterval23 = new org.jfree.data.xy.XYInterval((double) (byte) 10, (double) 'a', (double) (-1L), (double) (byte) 100, (double) 100);
        double double24 = xYInterval23.getXLow();
        double double25 = xYInterval23.getXLow();
        boolean boolean26 = xYIntervalSeriesCollection14.equals((java.lang.Object) double25);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries30 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries30.clear();
        int int32 = xYIntervalSeries30.getMaximumItemCount();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection33 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset35 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo36 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent37 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset35, datasetChangeInfo36);
        xYIntervalSeriesCollection33.notifyListeners(datasetChangeEvent37);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState39 = xYIntervalSeriesCollection33.getSelectionState();
        int int41 = xYIntervalSeriesCollection33.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState42 = null;
        xYIntervalSeriesCollection33.setSelectionState(xYDatasetSelectionState42);
        org.jfree.data.Range range44 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection33);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries48 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries48.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo51 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent52 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo51);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo53 = null;
        seriesChangeEvent52.setSummary(seriesChangeInfo53);
        xYIntervalSeriesCollection33.seriesChanged(seriesChangeEvent52);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo56 = seriesChangeEvent52.getSummary();
        xYIntervalSeries30.notifyListeners(seriesChangeEvent52);
        xYIntervalSeriesCollection14.seriesChanged(seriesChangeEvent52);
        xYIntervalSeries3.notifyListeners(seriesChangeEvent52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection14 and xYIntervalSeriesCollection33", xYIntervalSeriesCollection14.equals(xYIntervalSeriesCollection33) ? xYIntervalSeriesCollection14.hashCode() == xYIntervalSeriesCollection33.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        boolean boolean43 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset41);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem50 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int52 = xYIntervalDataItem50.compareTo((java.lang.Object) 1.0f);
        boolean boolean54 = xYIntervalDataItem50.equals((java.lang.Object) 32);
        double double55 = xYIntervalDataItem50.getYValue();
        org.jfree.data.pie.PieDataset pieDataset58 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset41, (java.lang.Comparable) xYIntervalDataItem50, (double) (byte) 1, (int) (short) 0);
        boolean boolean59 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalDataItem6 and xYIntervalDataItem50", xYIntervalDataItem6.equals(xYIntervalDataItem50) ? xYIntervalDataItem6.hashCode() == xYIntervalDataItem50.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener9 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener9);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries14 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries14.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo17 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent18 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo17);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo19 = null;
        seriesChangeEvent18.setSummary(seriesChangeInfo19);
        java.lang.Object obj21 = seriesChangeEvent18.getSource();
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent18);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection23 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset25 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo26 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent27 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset25, datasetChangeInfo26);
        xYIntervalSeriesCollection23.notifyListeners(datasetChangeEvent27);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState29 = xYIntervalSeriesCollection23.getSelectionState();
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection23);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection31 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder32 = xYIntervalSeriesCollection31.getDomainOrder();
        int int33 = xYIntervalSeriesCollection31.getSeriesCount();
        boolean boolean34 = xYIntervalSeriesCollection23.hasListener((java.util.EventListener) xYIntervalSeriesCollection31);
        xYIntervalSeriesCollection31.validateObject();
        org.jfree.data.general.Dataset dataset37 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo38 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent39 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset37, datasetChangeInfo38);
        org.jfree.data.general.Dataset dataset40 = datasetChangeEvent39.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo41 = datasetChangeEvent39.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent42 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) xYIntervalSeriesCollection0, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection31, datasetChangeInfo41);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener43 = null;
        xYIntervalSeriesCollection0.addChangeListener(datasetChangeListener43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection23 and xYIntervalSeriesCollection31", xYIntervalSeriesCollection23.equals(xYIntervalSeriesCollection31) ? xYIntervalSeriesCollection23.hashCode() == xYIntervalSeriesCollection31.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("org.jfree.data.event.DatasetChangeEvent[source=-1]");
        java.lang.Object obj2 = datasetGroup1.clone();
        org.jfree.data.xy.XYInterval xYInterval8 = new org.jfree.data.xy.XYInterval(0.0d, (double) 1.0f, (double) (-1), (double) '#', (double) 100L);
        double double9 = xYInterval8.getYHigh();
        boolean boolean10 = datasetGroup1.equals((java.lang.Object) double9);
        org.jfree.data.general.Dataset dataset11 = null;
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection12 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset14 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo15 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent16 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset14, datasetChangeInfo15);
        xYIntervalSeriesCollection12.notifyListeners(datasetChangeEvent16);
        java.lang.Number[] numberArray22 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray38 = new java.lang.Number[][] { numberArray22, numberArray25, numberArray28, numberArray31, numberArray34, numberArray37 };
        org.jfree.data.category.CategoryDataset categoryDataset39 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray38);
        java.util.List list40 = categoryDataset39.getRowKeys();
        org.jfree.data.Range range42 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset39, false);
        boolean boolean43 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset39);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener44 = null;
        categoryDataset39.removeChangeListener(datasetChangeListener44);
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray63 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray66 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray67 = new java.lang.Number[][] { numberArray51, numberArray54, numberArray57, numberArray60, numberArray63, numberArray66 };
        org.jfree.data.category.CategoryDataset categoryDataset68 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray67);
        java.util.List list69 = categoryDataset68.getRowKeys();
        org.jfree.data.Range range71 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset68, false);
        int int73 = categoryDataset68.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset75 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo76 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent77 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset75, datasetChangeInfo76);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent78 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset68, datasetChangeInfo76);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent79 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) xYIntervalSeriesCollection12, (org.jfree.data.general.Dataset) categoryDataset39, datasetChangeInfo76);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent80 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) double9, dataset11, datasetChangeInfo76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup1 and obj2", datasetGroup1.equals(obj2) ? datasetGroup1.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        boolean boolean17 = xYIntervalDataItem6.equals((java.lang.Object) 0.0f);
        java.lang.Object obj18 = xYIntervalDataItem6.clone();
        java.lang.Object obj19 = xYIntervalDataItem6.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem26 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int28 = xYIntervalDataItem26.compareTo((java.lang.Object) 1.0f);
        double double29 = xYIntervalDataItem26.getXHighValue();
        java.lang.Object obj30 = xYIntervalDataItem26.clone();
        boolean boolean32 = xYIntervalDataItem26.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray49 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray52 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray53 = new java.lang.Number[][] { numberArray37, numberArray40, numberArray43, numberArray46, numberArray49, numberArray52 };
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray53);
        org.jfree.data.pie.PieDataset pieDataset56 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset54, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState57 = pieDataset56.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset61 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset56, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset62 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem26, (org.jfree.data.KeyedValues) pieDataset61);
        int int63 = pieDataset61.getItemCount();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent64 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) pieDataset61);
        org.jfree.data.category.CategoryDataset categoryDataset65 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj18 and xYIntervalDataItem26", obj18.equals(xYIntervalDataItem26) ? obj18.hashCode() == xYIntervalDataItem26.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        int int4 = xYIntervalSeriesCollection0.getSeriesCount();
        int int6 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 100.0d);
        org.jfree.data.DomainOrder domainOrder7 = xYIntervalSeriesCollection0.getDomainOrder();
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener9 = null;
        xYIntervalSeriesCollection0.addChangeListener(datasetChangeListener9);
        java.lang.Number number11 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        int int12 = xYIntervalSeriesCollection0.getSeriesCount();
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState13 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection14 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset16 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo17 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent18 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset16, datasetChangeInfo17);
        xYIntervalSeriesCollection14.notifyListeners(datasetChangeEvent18);
        org.jfree.data.general.Dataset dataset20 = datasetChangeEvent18.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo21 = datasetChangeEvent18.getInfo();
        java.lang.Object obj22 = datasetChangeEvent18.getSource();
        org.jfree.data.general.Dataset dataset23 = datasetChangeEvent18.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo24 = datasetChangeEvent18.getInfo();
        xYIntervalSeriesCollection0.fireDatasetChanged(datasetChangeInfo24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and xYIntervalSeriesCollection14", obj3.equals(xYIntervalSeriesCollection14) ? obj3.hashCode() == xYIntervalSeriesCollection14.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        java.util.List list25 = pieDataset23.getKeys();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem32 = new org.jfree.data.xy.XYIntervalDataItem((double) 1, 93.0d, 0.0d, 67.0d, (double) 2, (-1.0d));
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) xYIntervalDataItem32, 93.0d, 2147483647);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener36 = null;
        pieDataset23.addChangeListener(datasetChangeListener36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset35", pieDataset23.equals(pieDataset35) ? pieDataset23.hashCode() == pieDataset35.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray11, numberArray14, numberArray17, numberArray20, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray24);
        java.util.List list26 = categoryDataset25.getRowKeys();
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, false);
        int int30 = categoryDataset25.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean31 = xYIntervalSeriesCollection0.equals((java.lang.Object) categoryDataset25);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        xYIntervalSeriesCollection0.removeAllSeries();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries38 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries38.setMaximumItemCount((int) ' ');
        xYIntervalSeries38.setDescription("");
        boolean boolean43 = xYIntervalSeries38.isEmpty();
        boolean boolean44 = xYIntervalSeries38.getAllowDuplicateXValues();
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries38);
        org.jfree.data.Range range46 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries50 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj52 = null;
        xYIntervalSeries50.firePropertyChange("", obj52, (java.lang.Object) "hi!");
        xYIntervalSeries50.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries50.firePropertyChange("", (java.lang.Object) 100L, (java.lang.Object) 100.0f);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem68 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int70 = xYIntervalDataItem68.compareTo((java.lang.Object) 1.0f);
        double double71 = xYIntervalDataItem68.getXHighValue();
        java.lang.Object obj72 = xYIntervalDataItem68.clone();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries76 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean77 = xYIntervalSeries76.getNotify();
        int int78 = xYIntervalSeries76.getItemCount();
        boolean boolean79 = xYIntervalSeries76.getAutoSort();
        xYIntervalSeries76.fireSeriesChanged();
        xYIntervalSeries50.firePropertyChange("", obj72, (java.lang.Object) xYIntervalSeries76);
        boolean boolean82 = xYIntervalSeries50.isEmpty();
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries50);
        boolean boolean84 = xYIntervalSeries50.isEmpty();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj3", xYIntervalSeriesCollection0.equals(obj3) ? xYIntervalSeriesCollection0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        xYIntervalSeriesCollection0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup13 = xYIntervalSeriesCollection0.getGroup();
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection15 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset17 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo18 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent19 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset17, datasetChangeInfo18);
        xYIntervalSeriesCollection15.notifyListeners(datasetChangeEvent19);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState21 = xYIntervalSeriesCollection15.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener22 = null;
        xYIntervalSeriesCollection15.removeChangeListener(datasetChangeListener22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection15);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo25 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection15.fireDatasetChanged(datasetChangeInfo25);
        xYIntervalSeriesCollection15.removeAllSeries();
        org.jfree.data.DomainOrder domainOrder28 = xYIntervalSeriesCollection15.getDomainOrder();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo29 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent30 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) xYIntervalSeriesCollection15, seriesChangeInfo29);
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent30);
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray49 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray52 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray53 = new java.lang.Number[][] { numberArray37, numberArray40, numberArray43, numberArray46, numberArray49, numberArray52 };
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray53);
        java.util.List list55 = categoryDataset54.getRowKeys();
        org.jfree.data.Range range57 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset54, false);
        int int59 = categoryDataset54.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset61 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo62 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent63 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset61, datasetChangeInfo62);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent64 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset54, datasetChangeInfo62);
        org.jfree.data.general.Dataset dataset65 = datasetChangeEvent64.getDataset();
        org.jfree.data.general.Dataset dataset66 = datasetChangeEvent64.getDataset();
        java.lang.Object obj67 = datasetChangeEvent64.getSource();
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent64);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo69 = datasetChangeEvent64.getInfo();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and xYIntervalSeriesCollection15", xYIntervalSeriesCollection0.equals(xYIntervalSeriesCollection15) ? xYIntervalSeriesCollection0.hashCode() == xYIntervalSeriesCollection15.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem39 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int41 = xYIntervalDataItem39.compareTo((java.lang.Object) 1.0f);
        int int42 = categoryDataset22.getColumnIndex((java.lang.Comparable) xYIntervalDataItem39);
        double double43 = xYIntervalDataItem39.getXLowValue();
        double double44 = xYIntervalDataItem39.getYLowValue();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection45 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset47 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo48 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent49 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset47, datasetChangeInfo48);
        xYIntervalSeriesCollection45.notifyListeners(datasetChangeEvent49);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState51 = xYIntervalSeriesCollection45.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener52 = null;
        xYIntervalSeriesCollection45.removeChangeListener(datasetChangeListener52);
        java.lang.Number number54 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection45);
        org.jfree.data.Range range56 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection45, true);
        xYIntervalSeriesCollection45.validateObject();
        org.jfree.data.Range range58 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection45);
        org.jfree.data.Range range59 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection45);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection60 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset62 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo63 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent64 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset62, datasetChangeInfo63);
        xYIntervalSeriesCollection60.notifyListeners(datasetChangeEvent64);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState66 = xYIntervalSeriesCollection60.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener67 = null;
        xYIntervalSeriesCollection60.removeChangeListener(datasetChangeListener67);
        java.lang.Number number69 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection60);
        org.jfree.data.Range range71 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection60, true);
        org.jfree.data.Range range73 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection60, true);
        org.jfree.data.Range range75 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection60, true);
        java.lang.Number number76 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection60);
        boolean boolean77 = xYIntervalSeriesCollection45.hasListener((java.util.EventListener) xYIntervalSeriesCollection60);
        org.jfree.data.ComparableObjectItem comparableObjectItem78 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) xYIntervalDataItem39, (java.lang.Object) boolean77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection45 and xYIntervalSeriesCollection60", xYIntervalSeriesCollection45.equals(xYIntervalSeriesCollection60) ? xYIntervalSeriesCollection45.hashCode() == xYIntervalSeriesCollection60.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries21 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean22 = xYIntervalSeries21.getNotify();
        int int23 = xYIntervalSeries21.getItemCount();
        boolean boolean24 = xYIntervalSeries21.getAutoSort();
        xYIntervalSeries21.fireSeriesChanged();
        xYIntervalSeries21.setMaximumItemCount((int) (short) 0);
        xYIntervalSeries21.clear();
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries21);
        xYIntervalSeries21.add(10.0d, (double) (byte) -1, (double) ' ', 15.5d, (double) 100L, (double) 32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj3", xYIntervalSeriesCollection0.equals(obj3) ? xYIntervalSeriesCollection0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState31 = pieDataset28.getSelectionState();
        java.lang.Number number33 = pieDataset28.getValue(3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem39 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int41 = xYIntervalDataItem39.compareTo((java.lang.Object) 1.0f);
        int int42 = categoryDataset22.getColumnIndex((java.lang.Comparable) xYIntervalDataItem39);
        double double43 = xYIntervalDataItem39.getXLowValue();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection44 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder45 = xYIntervalSeriesCollection44.getDomainOrder();
        org.jfree.data.ComparableObjectItem comparableObjectItem46 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) xYIntervalDataItem39, (java.lang.Object) domainOrder45);
        double double47 = xYIntervalDataItem39.getYHighValue();
        org.jfree.data.ComparableObjectSeries comparableObjectSeries50 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) xYIntervalDataItem39, false, false);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries53 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem39, true, false);
        java.lang.Number[] numberArray58 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray61 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray64 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray67 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray70 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray73 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray74 = new java.lang.Number[][] { numberArray58, numberArray61, numberArray64, numberArray67, numberArray70, numberArray73 };
        org.jfree.data.category.CategoryDataset categoryDataset75 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray74);
        org.jfree.data.pie.PieDataset pieDataset77 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset75, 1);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection78 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder79 = xYIntervalSeriesCollection78.getDomainOrder();
        org.jfree.data.general.DatasetGroup datasetGroup80 = xYIntervalSeriesCollection78.getGroup();
        java.lang.Object obj81 = null;
        boolean boolean82 = datasetGroup80.equals(obj81);
        pieDataset77.setGroup(datasetGroup80);
        java.lang.String str84 = datasetGroup80.getID();
        boolean boolean85 = xYIntervalSeries53.equals((java.lang.Object) str84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset22 and categoryDataset75", categoryDataset22.equals(categoryDataset75) ? categoryDataset22.hashCode() == categoryDataset75.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray49 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray52 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray53 = new java.lang.Number[][] { numberArray37, numberArray40, numberArray43, numberArray46, numberArray49, numberArray52 };
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray53);
        java.util.List list55 = categoryDataset54.getRowKeys();
        org.jfree.data.Range range57 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset54, (double) (short) -1);
        java.util.List list58 = categoryDataset54.getRowKeys();
        org.jfree.data.Range range60 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, list58, false);
        org.jfree.data.Range range62 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset22, 67.0d);
        org.jfree.data.Range range63 = null;
        org.jfree.data.Range range65 = org.jfree.data.Range.expandToInclude(range63, (double) 100);
        double double67 = range65.constrain((double) '4');
        double double68 = range65.getLength();
        org.jfree.data.Range range71 = org.jfree.data.Range.shift(range65, (double) 100, false);
        double double73 = range71.constrain(15.5d);
        boolean boolean74 = range62.equals((java.lang.Object) double73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset22 and categoryDataset54", categoryDataset22.equals(categoryDataset54) ? categoryDataset22.hashCode() == categoryDataset54.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState31 = pieDataset28.getSelectionState();
        double double32 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries45 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem6, false, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset41", pieDataset36.equals(pieDataset41) ? pieDataset36.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener48 = null;
        categoryDataset46.removeChangeListener(datasetChangeListener48);
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset46, (double) 6);
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray63 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray66 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray69 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray72 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray75 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray76 = new java.lang.Number[][] { numberArray60, numberArray63, numberArray66, numberArray69, numberArray72, numberArray75 };
        org.jfree.data.category.CategoryDataset categoryDataset77 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray76);
        org.jfree.data.category.CategoryDataset categoryDataset78 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray76);
        org.jfree.data.category.CategoryDataset categoryDataset79 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "org.jfree.data.event.SeriesChangeEvent[source= ]", numberArray76);
        java.lang.Comparable comparable81 = categoryDataset79.getRowKey((int) (short) 1);
        java.lang.Number number82 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset79);
        org.jfree.data.Range range83 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset79);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection84 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset86 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo87 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent88 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset86, datasetChangeInfo87);
        xYIntervalSeriesCollection84.notifyListeners(datasetChangeEvent88);
        org.jfree.data.general.Dataset dataset90 = datasetChangeEvent88.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo91 = datasetChangeEvent88.getInfo();
        java.lang.Object obj92 = datasetChangeEvent88.getSource();
        org.jfree.data.general.Dataset dataset93 = datasetChangeEvent88.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo94 = datasetChangeEvent88.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent95 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 6, (org.jfree.data.general.Dataset) categoryDataset79, datasetChangeInfo94);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset45 and categoryDataset77", categoryDataset45.equals(categoryDataset77) ? categoryDataset45.hashCode() == categoryDataset77.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState29 = pieDataset23.getSelectionState();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDatasetSelectionState29 and pieDataset28", pieDatasetSelectionState29.equals(pieDataset28) ? pieDatasetSelectionState29.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.general.DatasetGroup datasetGroup24 = categoryDataset21.getGroup();
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray49 = new java.lang.Number[][] { numberArray33, numberArray36, numberArray39, numberArray42, numberArray45, numberArray48 };
        org.jfree.data.category.CategoryDataset categoryDataset50 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray49);
        java.util.List list51 = categoryDataset50.getRowKeys();
        org.jfree.data.Range range53 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset50, (double) (short) -1);
        java.util.List list54 = categoryDataset50.getRowKeys();
        java.lang.Number[] numberArray59 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray62 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray65 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray68 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray71 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray74 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray75 = new java.lang.Number[][] { numberArray59, numberArray62, numberArray65, numberArray68, numberArray71, numberArray74 };
        org.jfree.data.category.CategoryDataset categoryDataset76 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray75);
        org.jfree.data.Range range78 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset76, true);
        org.jfree.data.Range range80 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset76, 0.0d);
        java.util.List list81 = categoryDataset76.getRowKeys();
        org.jfree.data.Range range83 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset50, list81, false);
        org.jfree.data.Range range85 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset21, list81, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset50 and categoryDataset76", categoryDataset50.equals(categoryDataset76) ? categoryDataset50.hashCode() == categoryDataset76.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener48 = null;
        categoryDataset46.removeChangeListener(datasetChangeListener48);
        int int50 = categoryDataset46.getColumnCount();
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset46);
        org.jfree.data.pie.PieDataset pieDataset53 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset46, (int) (short) 1);
        java.lang.Number number55 = pieDataset53.getValue(0);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem62 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int64 = xYIntervalDataItem62.compareTo((java.lang.Object) 1.0f);
        java.lang.Double double65 = xYIntervalDataItem62.getX();
        double double66 = xYIntervalDataItem62.getXLowValue();
        org.jfree.data.pie.PieDataset pieDataset68 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset53, (java.lang.Comparable) double66, 10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalDataItem6 and xYIntervalDataItem62", xYIntervalDataItem6.equals(xYIntervalDataItem62) ? xYIntervalDataItem6.hashCode() == xYIntervalDataItem62.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection24 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder25 = xYIntervalSeriesCollection24.getDomainOrder();
        org.jfree.data.general.DatasetGroup datasetGroup26 = xYIntervalSeriesCollection24.getGroup();
        java.lang.Object obj27 = null;
        boolean boolean28 = datasetGroup26.equals(obj27);
        pieDataset23.setGroup(datasetGroup26);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem36 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int38 = xYIntervalDataItem36.compareTo((java.lang.Object) 1.0f);
        double double39 = xYIntervalDataItem36.getXHighValue();
        java.lang.Object obj40 = xYIntervalDataItem36.clone();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries44 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj46 = null;
        xYIntervalSeries44.firePropertyChange("", obj46, (java.lang.Object) "hi!");
        xYIntervalSeries44.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries44.add((double) 100, (double) 0, (double) (byte) -1, (double) (short) -1, (double) 100, (double) 0);
        boolean boolean58 = xYIntervalDataItem36.equals((java.lang.Object) 100);
        double double59 = xYIntervalDataItem36.getYLowValue();
        org.jfree.data.pie.PieDataset pieDataset61 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) xYIntervalDataItem36, (double) (byte) 0);
        org.jfree.data.ComparableObjectSeries comparableObjectSeries64 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) (byte) 0, true, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset61", pieDataset23.equals(pieDataset61) ? pieDataset23.hashCode() == pieDataset61.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 'a', (double) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener34 = null;
        pieDataset28.removeChangeListener(datasetChangeListener34);
        org.jfree.data.general.DatasetGroup datasetGroup36 = pieDataset28.getGroup();
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray58 = new java.lang.Number[][] { numberArray42, numberArray45, numberArray48, numberArray51, numberArray54, numberArray57 };
        org.jfree.data.category.CategoryDataset categoryDataset59 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray58);
        java.util.List list60 = categoryDataset59.getRowKeys();
        org.jfree.data.Range range62 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset59, false);
        int int64 = categoryDataset59.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset66 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo67 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent68 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset66, datasetChangeInfo67);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent69 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset59, datasetChangeInfo67);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem76 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int78 = xYIntervalDataItem76.compareTo((java.lang.Object) 1.0f);
        int int79 = categoryDataset59.getColumnIndex((java.lang.Comparable) xYIntervalDataItem76);
        double double80 = xYIntervalDataItem76.getXLowValue();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection81 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder82 = xYIntervalSeriesCollection81.getDomainOrder();
        org.jfree.data.ComparableObjectItem comparableObjectItem83 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) xYIntervalDataItem76, (java.lang.Object) domainOrder82);
        double double84 = xYIntervalDataItem76.getYHighValue();
        org.jfree.data.ComparableObjectSeries comparableObjectSeries87 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) xYIntervalDataItem76, false, false);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries90 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem76, true, false);
        org.jfree.data.pie.PieDataset pieDataset93 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) xYIntervalDataItem76, (double) (short) 10, 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset59", categoryDataset21.equals(categoryDataset59) ? categoryDataset21.hashCode() == categoryDataset59.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener9 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener9);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries14 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries14.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo17 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent18 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo17);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo19 = null;
        seriesChangeEvent18.setSummary(seriesChangeInfo19);
        java.lang.Object obj21 = seriesChangeEvent18.getSource();
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent18);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection25 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset27 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo28 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent29 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset27, datasetChangeInfo28);
        xYIntervalSeriesCollection25.notifyListeners(datasetChangeEvent29);
        org.jfree.data.general.Dataset dataset31 = datasetChangeEvent29.getDataset();
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent29);
        org.jfree.data.general.Dataset dataset33 = datasetChangeEvent29.getDataset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and xYIntervalSeriesCollection25", xYIntervalSeriesCollection0.equals(xYIntervalSeriesCollection25) ? xYIntervalSeriesCollection0.hashCode() == xYIntervalSeriesCollection25.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection10 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset12 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo13 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent14 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset12, datasetChangeInfo13);
        xYIntervalSeriesCollection10.notifyListeners(datasetChangeEvent14);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState16 = xYIntervalSeriesCollection10.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener17 = null;
        xYIntervalSeriesCollection10.removeChangeListener(datasetChangeListener17);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10, true);
        xYIntervalSeriesCollection10.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup23 = xYIntervalSeriesCollection10.getGroup();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem30 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int32 = xYIntervalDataItem30.compareTo((java.lang.Object) 1.0f);
        double double33 = xYIntervalDataItem30.getXHighValue();
        org.jfree.data.Range range34 = null;
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range34, (double) 100);
        double double38 = range36.constrain((double) '4');
        boolean boolean39 = xYIntervalDataItem30.equals((java.lang.Object) '4');
        org.jfree.data.Range range40 = null;
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range40, (double) 100);
        double double44 = range42.constrain((double) '4');
        int int45 = xYIntervalDataItem30.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray52 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray55 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray58 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray61 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray64 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray67 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray68 = new java.lang.Number[][] { numberArray52, numberArray55, numberArray58, numberArray61, numberArray64, numberArray67 };
        org.jfree.data.category.CategoryDataset categoryDataset69 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray68);
        org.jfree.data.category.CategoryDataset categoryDataset70 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray68);
        int int71 = xYIntervalDataItem30.compareTo((java.lang.Object) categoryDataset70);
        double double72 = xYIntervalDataItem30.getXHighValue();
        int int73 = xYIntervalSeriesCollection10.indexOf((java.lang.Comparable) double72);
        java.lang.Number number74 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo76 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent77 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 100, seriesChangeInfo76);
        xYIntervalSeriesCollection10.seriesChanged(seriesChangeEvent77);
        boolean boolean79 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection10);
        org.jfree.data.Range range80 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent81 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) xYIntervalSeriesCollection10);
        java.lang.String str82 = seriesChangeEvent81.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and xYIntervalSeriesCollection10", xYIntervalSeriesCollection0.equals(xYIntervalSeriesCollection10) ? xYIntervalSeriesCollection0.hashCode() == xYIntervalSeriesCollection10.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = null;
        xYIntervalSeriesCollection0.setSelectionState(xYDatasetSelectionState9);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries12 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 32.0d);
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries12);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection15 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset17 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo18 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent19 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset17, datasetChangeInfo18);
        xYIntervalSeriesCollection15.notifyListeners(datasetChangeEvent19);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState21 = xYIntervalSeriesCollection15.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener22 = null;
        xYIntervalSeriesCollection15.removeChangeListener(datasetChangeListener22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection15);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo25 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection15.fireDatasetChanged(datasetChangeInfo25);
        xYIntervalSeriesCollection15.removeAllSeries();
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection15);
        boolean boolean29 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection15);
        int int30 = xYIntervalSeriesCollection15.getSeriesCount();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener31 = null;
        xYIntervalSeriesCollection15.addChangeListener(datasetChangeListener31);
        java.lang.Object obj33 = xYIntervalSeriesCollection15.clone();
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj33", xYIntervalSeriesCollection0.equals(obj33) ? xYIntervalSeriesCollection0.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jfree.data.xy.XYInterval xYInterval5 = new org.jfree.data.xy.XYInterval((double) 10, 93.0d, (double) (-1L), (double) 0, (double) ' ');
        java.lang.Object obj6 = null;
        boolean boolean7 = xYInterval5.equals(obj6);
        double double8 = xYInterval5.getXLow();
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray29 = new java.lang.Number[][] { numberArray13, numberArray16, numberArray19, numberArray22, numberArray25, numberArray28 };
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray29);
        java.util.List list31 = categoryDataset30.getRowKeys();
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset30, (double) (short) -1);
        java.lang.Number number34 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset30);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset30);
        java.util.List list36 = categoryDataset30.getColumnKeys();
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray56 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray57 = new java.lang.Number[][] { numberArray41, numberArray44, numberArray47, numberArray50, numberArray53, numberArray56 };
        org.jfree.data.category.CategoryDataset categoryDataset58 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray57);
        java.util.List list59 = categoryDataset58.getRowKeys();
        org.jfree.data.Range range61 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset30, list59, false);
        boolean boolean62 = xYInterval5.equals((java.lang.Object) list59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset30 and categoryDataset58", categoryDataset30.equals(categoryDataset58) ? categoryDataset30.hashCode() == categoryDataset58.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean4 = xYIntervalSeries3.getNotify();
        int int5 = xYIntervalSeries3.getItemCount();
        boolean boolean6 = xYIntervalSeries3.getAutoSort();
        xYIntervalSeries3.fireSeriesChanged();
        xYIntervalSeries3.setMaximumItemCount(0);
        xYIntervalSeries3.setDescription("");
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        java.util.List list35 = categoryDataset34.getRowKeys();
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset34, false);
        int int39 = categoryDataset34.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset41 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo42 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent43 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset41, datasetChangeInfo42);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent44 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset34, datasetChangeInfo42);
        org.jfree.data.Range range45 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset34);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener46 = null;
        categoryDataset34.addChangeListener(datasetChangeListener46);
        java.lang.Number[] numberArray52 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray55 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray58 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray61 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray64 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray67 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray68 = new java.lang.Number[][] { numberArray52, numberArray55, numberArray58, numberArray61, numberArray64, numberArray67 };
        org.jfree.data.category.CategoryDataset categoryDataset69 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray68);
        java.util.List list70 = categoryDataset69.getRowKeys();
        org.jfree.data.Range range72 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset69, (double) (short) -1);
        java.util.List list73 = categoryDataset69.getRowKeys();
        java.lang.Number number74 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset69);
        boolean boolean75 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset69);
        org.jfree.data.Range range76 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset69);
        java.lang.Number number77 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset69);
        int int78 = categoryDataset69.getColumnCount();
        java.util.List list79 = categoryDataset69.getRowKeys();
        org.jfree.data.Range range81 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset34, list79, false);
        int int82 = categoryDataset34.getRowCount();
        boolean boolean83 = xYIntervalSeries3.equals((java.lang.Object) int82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset34 and categoryDataset69", categoryDataset34.equals(categoryDataset69) ? categoryDataset34.hashCode() == categoryDataset69.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = null;
        xYIntervalSeriesCollection0.setSelectionState(xYDatasetSelectionState9);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries12 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 32.0d);
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries12);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection15 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset17 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo18 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent19 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset17, datasetChangeInfo18);
        xYIntervalSeriesCollection15.notifyListeners(datasetChangeEvent19);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState21 = xYIntervalSeriesCollection15.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener22 = null;
        xYIntervalSeriesCollection15.removeChangeListener(datasetChangeListener22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection15);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo25 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection15.fireDatasetChanged(datasetChangeInfo25);
        xYIntervalSeriesCollection15.removeAllSeries();
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection15);
        boolean boolean29 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection15);
        int int30 = xYIntervalSeriesCollection15.getSeriesCount();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener31 = null;
        xYIntervalSeriesCollection15.addChangeListener(datasetChangeListener31);
        java.lang.Object obj33 = xYIntervalSeriesCollection15.clone();
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection15, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj33", xYIntervalSeriesCollection0.equals(obj33) ? xYIntervalSeriesCollection0.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range24, 0.0d);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range26, (double) '#', true);
        double double30 = range29.getUpperBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.scale(range29, (double) 10L);
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray54 = new java.lang.Number[][] { numberArray38, numberArray41, numberArray44, numberArray47, numberArray50, numberArray53 };
        org.jfree.data.category.CategoryDataset categoryDataset55 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray54);
        java.util.List list56 = categoryDataset55.getRowKeys();
        org.jfree.data.Range range58 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset55, false);
        int int60 = categoryDataset55.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset62 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo63 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent64 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset62, datasetChangeInfo63);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent65 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset55, datasetChangeInfo63);
        org.jfree.data.Range range66 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset55);
        boolean boolean67 = range29.equals((java.lang.Object) categoryDataset55);
        org.jfree.data.Range range70 = org.jfree.data.Range.expand(range29, (double) (byte) 1, 102.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset55", categoryDataset21.equals(categoryDataset55) ? categoryDataset21.hashCode() == categoryDataset55.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jfree.data.xy.XYInterval xYInterval5 = new org.jfree.data.xy.XYInterval((double) (byte) 10, (double) 'a', (double) (-1L), (double) (byte) 100, (double) 100);
        double double6 = xYInterval5.getXLow();
        double double7 = xYInterval5.getXHigh();
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray17, numberArray20, numberArray23, numberArray26, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("NOID", "org.jfree.data.event.SeriesChangeEvent[source= ]", numberArray30);
        boolean boolean33 = xYInterval5.equals((java.lang.Object) "NOID");
        double double34 = xYInterval5.getXLow();
        double double35 = xYInterval5.getXHigh();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection36 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset38 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo39 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent40 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset38, datasetChangeInfo39);
        xYIntervalSeriesCollection36.notifyListeners(datasetChangeEvent40);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState42 = xYIntervalSeriesCollection36.getSelectionState();
        int int44 = xYIntervalSeriesCollection36.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState45 = null;
        xYIntervalSeriesCollection36.setSelectionState(xYDatasetSelectionState45);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries48 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 32.0d);
        xYIntervalSeriesCollection36.removeSeries(xYIntervalSeries48);
        boolean boolean50 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection36);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection51 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset53 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo54 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent55 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset53, datasetChangeInfo54);
        xYIntervalSeriesCollection51.notifyListeners(datasetChangeEvent55);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState57 = xYIntervalSeriesCollection51.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener58 = null;
        xYIntervalSeriesCollection51.removeChangeListener(datasetChangeListener58);
        java.lang.Number number60 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection51);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo61 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection51.fireDatasetChanged(datasetChangeInfo61);
        xYIntervalSeriesCollection51.removeAllSeries();
        java.lang.Number number64 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection51);
        boolean boolean65 = xYIntervalSeriesCollection36.hasListener((java.util.EventListener) xYIntervalSeriesCollection51);
        int int66 = xYIntervalSeriesCollection51.getSeriesCount();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener67 = null;
        xYIntervalSeriesCollection51.addChangeListener(datasetChangeListener67);
        java.lang.Object obj69 = xYIntervalSeriesCollection51.clone();
        boolean boolean70 = xYInterval5.equals((java.lang.Object) xYIntervalSeriesCollection51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection36 and obj69", xYIntervalSeriesCollection36.equals(obj69) ? xYIntervalSeriesCollection36.hashCode() == obj69.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.DomainOrder domainOrder2 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener3 = null;
        xYIntervalSeriesCollection0.addChangeListener(datasetChangeListener3);
        org.jfree.data.DomainOrder domainOrder5 = xYIntervalSeriesCollection0.getDomainOrder();
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray13, numberArray16, numberArray19, numberArray22, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        java.util.List list28 = categoryDataset27.getRowKeys();
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset27, false);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, 0.0d);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range32, (double) '#', true);
        double double36 = range35.getUpperBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.scale(range35, (double) 10L);
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray56 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray59 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray60 = new java.lang.Number[][] { numberArray44, numberArray47, numberArray50, numberArray53, numberArray56, numberArray59 };
        org.jfree.data.category.CategoryDataset categoryDataset61 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray60);
        java.util.List list62 = categoryDataset61.getRowKeys();
        org.jfree.data.Range range64 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset61, false);
        int int66 = categoryDataset61.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset68 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo69 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent70 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset68, datasetChangeInfo69);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent71 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset61, datasetChangeInfo69);
        org.jfree.data.Range range72 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset61);
        boolean boolean73 = range35.equals((java.lang.Object) categoryDataset61);
        boolean boolean74 = xYIntervalSeriesCollection0.equals((java.lang.Object) boolean73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset61", categoryDataset27.equals(categoryDataset61) ? categoryDataset27.hashCode() == categoryDataset61.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries3.setMaximumItemCount((int) (short) 1);
        boolean boolean6 = xYIntervalSeries3.getAllowDuplicateXValues();
        boolean boolean7 = xYIntervalSeries3.getNotify();
        xYIntervalSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection9 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection9, true);
        java.lang.Object obj12 = xYIntervalSeriesCollection9.clone();
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        java.util.List list35 = categoryDataset34.getRowKeys();
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset34, false);
        int int39 = categoryDataset34.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean40 = xYIntervalSeriesCollection9.equals((java.lang.Object) categoryDataset34);
        org.jfree.data.Range range42 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection9, true);
        xYIntervalSeriesCollection9.removeAllSeries();
        java.lang.Number number44 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection9);
        org.jfree.data.Range range46 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection9, true);
        boolean boolean47 = xYIntervalSeries3.equals((java.lang.Object) range46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection9 and obj12", xYIntervalSeriesCollection9.equals(obj12) ? xYIntervalSeriesCollection9.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem15 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int17 = xYIntervalDataItem15.compareTo((java.lang.Object) 1.0f);
        double double18 = xYIntervalDataItem15.getXHighValue();
        java.lang.Object obj19 = xYIntervalDataItem15.clone();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo20 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent21 = new org.jfree.data.event.SeriesChangeEvent(obj19, seriesChangeInfo20);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo22 = seriesChangeEvent21.getSummary();
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent21);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo24 = null;
        seriesChangeEvent21.setSummary(seriesChangeInfo24);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo26 = seriesChangeEvent21.getSummary();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection27 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        xYIntervalSeriesCollection27.notifyListeners(datasetChangeEvent31);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState33 = xYIntervalSeriesCollection27.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener34 = null;
        xYIntervalSeriesCollection27.removeChangeListener(datasetChangeListener34);
        java.lang.Number number36 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection27);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo37 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection27.fireDatasetChanged(datasetChangeInfo37);
        xYIntervalSeriesCollection27.removeAllSeries();
        org.jfree.data.DomainOrder domainOrder40 = xYIntervalSeriesCollection27.getDomainOrder();
        java.lang.Number number41 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection27);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection42 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder43 = xYIntervalSeriesCollection42.getDomainOrder();
        org.jfree.data.DomainOrder domainOrder44 = xYIntervalSeriesCollection42.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection45 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset47 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo48 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent49 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset47, datasetChangeInfo48);
        xYIntervalSeriesCollection45.notifyListeners(datasetChangeEvent49);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState51 = xYIntervalSeriesCollection45.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener52 = null;
        xYIntervalSeriesCollection45.removeChangeListener(datasetChangeListener52);
        java.lang.Number number54 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection45);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo55 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection45.fireDatasetChanged(datasetChangeInfo55);
        xYIntervalSeriesCollection42.fireDatasetChanged(datasetChangeInfo55);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent58 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) seriesChangeEvent21, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection27, datasetChangeInfo55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and xYIntervalSeriesCollection42", xYIntervalSeriesCollection0.equals(xYIntervalSeriesCollection42) ? xYIntervalSeriesCollection0.hashCode() == xYIntervalSeriesCollection42.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        int int7 = xYIntervalSeriesCollection0.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = xYIntervalSeriesCollection0.getGroup();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection9 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset11 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo12 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent13 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset11, datasetChangeInfo12);
        xYIntervalSeriesCollection9.notifyListeners(datasetChangeEvent13);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState15 = xYIntervalSeriesCollection9.getSelectionState();
        int int17 = xYIntervalSeriesCollection9.indexOf((java.lang.Comparable) 10.0f);
        java.lang.Object obj18 = xYIntervalSeriesCollection9.clone();
        int int19 = xYIntervalSeriesCollection9.getSeriesCount();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries23 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean24 = xYIntervalSeries23.getNotify();
        int int25 = xYIntervalSeries23.getItemCount();
        boolean boolean26 = xYIntervalSeries23.getAutoSort();
        xYIntervalSeries23.fireSeriesChanged();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries32 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj34 = null;
        xYIntervalSeries32.firePropertyChange("", obj34, (java.lang.Object) "hi!");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries40 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries40.setMaximumItemCount((int) ' ');
        org.jfree.data.Range range44 = null;
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range44, (double) 100);
        double double48 = range46.constrain((double) '4');
        double double49 = range46.getLength();
        org.jfree.data.Range range50 = null;
        org.jfree.data.Range range52 = org.jfree.data.Range.expandToInclude(range50, (double) 100);
        double double54 = range52.constrain((double) '4');
        boolean boolean55 = range46.intersects(range52);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries59 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries59.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo62 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent63 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo62);
        xYIntervalSeries40.firePropertyChange("", (java.lang.Object) boolean55, (java.lang.Object) ' ');
        xYIntervalSeries40.fireSeriesChanged();
        xYIntervalSeries23.firePropertyChange("org.jfree.data.event.DatasetChangeEvent[source=-1]", (java.lang.Object) "hi!", (java.lang.Object) xYIntervalSeries40);
        xYIntervalSeriesCollection9.removeSeries(xYIntervalSeries23);
        boolean boolean68 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection9);
        org.jfree.data.Range range69 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection9 and obj18", xYIntervalSeriesCollection9.equals(obj18) ? xYIntervalSeriesCollection9.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset22, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState25 = pieDataset24.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset29, (java.lang.Comparable) 192.0d, 0.0d);
        org.jfree.data.ComparableObjectItem comparableObjectItem33 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) (byte) -1, (java.lang.Object) pieDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset32", pieDataset24.equals(pieDataset32) ? pieDataset24.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj8 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        xYIntervalSeriesCollection0.validateObject();
        java.lang.Object obj11 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.DomainOrder domainOrder12 = xYIntervalSeriesCollection0.getDomainOrder();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj11", obj8.equals(obj11) ? obj8.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.util.List list29 = pieDataset28.getKeys();
        int int31 = pieDataset28.getIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem38 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int40 = xYIntervalDataItem38.compareTo((java.lang.Object) 1.0f);
        double double41 = xYIntervalDataItem38.getXHighValue();
        java.lang.Object obj42 = xYIntervalDataItem38.clone();
        double double43 = xYIntervalDataItem38.getXHighValue();
        org.jfree.data.pie.PieDataset pieDataset45 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) xYIntervalDataItem38, (double) 0.0f);
        double double46 = xYIntervalDataItem38.getYHighValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 'a', (double) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener34 = null;
        pieDataset28.removeChangeListener(datasetChangeListener34);
        java.util.List list36 = pieDataset28.getKeys();
        boolean boolean37 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset28);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState38 = pieDataset28.getSelectionState();
        boolean boolean39 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.general.DatasetGroup datasetGroup24 = categoryDataset21.getGroup();
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        org.jfree.data.general.DatasetGroup datasetGroup29 = new org.jfree.data.general.DatasetGroup("org.jfree.data.event.DatasetChangeEvent[source=-1]");
        java.lang.Object obj30 = datasetGroup29.clone();
        categoryDataset21.setGroup(datasetGroup29);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection32 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset34 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo35 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent36 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset34, datasetChangeInfo35);
        xYIntervalSeriesCollection32.notifyListeners(datasetChangeEvent36);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState38 = xYIntervalSeriesCollection32.getSelectionState();
        int int40 = xYIntervalSeriesCollection32.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState41 = null;
        xYIntervalSeriesCollection32.setSelectionState(xYDatasetSelectionState41);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries44 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 32.0d);
        xYIntervalSeriesCollection32.removeSeries(xYIntervalSeries44);
        boolean boolean46 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection32);
        java.lang.Number number47 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection32);
        int int48 = xYIntervalSeriesCollection32.getSeriesCount();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem55 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int57 = xYIntervalDataItem55.compareTo((java.lang.Object) 1.0f);
        double double58 = xYIntervalDataItem55.getXHighValue();
        org.jfree.data.Range range59 = null;
        org.jfree.data.Range range61 = org.jfree.data.Range.expandToInclude(range59, (double) 100);
        double double63 = range61.constrain((double) '4');
        boolean boolean64 = xYIntervalDataItem55.equals((java.lang.Object) '4');
        org.jfree.data.Range range65 = null;
        org.jfree.data.Range range67 = org.jfree.data.Range.expandToInclude(range65, (double) 100);
        double double69 = range67.constrain((double) '4');
        int int70 = xYIntervalDataItem55.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray77 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray80 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray83 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray86 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray89 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray92 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray93 = new java.lang.Number[][] { numberArray77, numberArray80, numberArray83, numberArray86, numberArray89, numberArray92 };
        org.jfree.data.category.CategoryDataset categoryDataset94 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray93);
        org.jfree.data.category.CategoryDataset categoryDataset95 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray93);
        int int96 = xYIntervalDataItem55.compareTo((java.lang.Object) categoryDataset95);
        org.jfree.data.general.DatasetGroup datasetGroup97 = categoryDataset95.getGroup();
        xYIntervalSeriesCollection32.setGroup(datasetGroup97);
        categoryDataset21.setGroup(datasetGroup97);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup29 and obj30", datasetGroup29.equals(obj30) ? datasetGroup29.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener5 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener5);
        java.lang.Object obj7 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection8 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset10 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo11 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent12 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset10, datasetChangeInfo11);
        xYIntervalSeriesCollection8.notifyListeners(datasetChangeEvent12);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState14 = xYIntervalSeriesCollection8.getSelectionState();
        int int16 = xYIntervalSeriesCollection8.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener17 = null;
        xYIntervalSeriesCollection8.removeChangeListener(datasetChangeListener17);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries22 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries22.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo25 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo25);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo27 = null;
        seriesChangeEvent26.setSummary(seriesChangeInfo27);
        java.lang.Object obj29 = seriesChangeEvent26.getSource();
        xYIntervalSeriesCollection8.seriesChanged(seriesChangeEvent26);
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        boolean boolean33 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection8);
        java.lang.Object obj34 = xYIntervalSeriesCollection8.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj7", xYIntervalSeriesCollection0.equals(obj7) ? xYIntervalSeriesCollection0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        double double10 = xYIntervalDataItem6.getYValue();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection11 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset13 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo14 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent15 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset13, datasetChangeInfo14);
        xYIntervalSeriesCollection11.notifyListeners(datasetChangeEvent15);
        int int18 = xYIntervalSeriesCollection11.indexOf((java.lang.Comparable) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener19 = null;
        xYIntervalSeriesCollection11.removeChangeListener(datasetChangeListener19);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection11, true);
        org.jfree.data.ComparableObjectItem comparableObjectItem23 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) xYIntervalDataItem6, (java.lang.Object) true);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries25 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) "");
        boolean boolean26 = xYIntervalSeries25.getAllowDuplicateXValues();
        boolean boolean27 = xYIntervalSeries25.isEmpty();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem34 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int36 = xYIntervalDataItem34.compareTo((java.lang.Object) 1.0f);
        double double37 = xYIntervalDataItem34.getXHighValue();
        org.jfree.data.Range range38 = null;
        org.jfree.data.Range range40 = org.jfree.data.Range.expandToInclude(range38, (double) 100);
        double double42 = range40.constrain((double) '4');
        boolean boolean43 = xYIntervalDataItem34.equals((java.lang.Object) '4');
        org.jfree.data.Range range44 = null;
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range44, (double) 100);
        double double48 = range46.constrain((double) '4');
        int int49 = xYIntervalDataItem34.compareTo((java.lang.Object) '4');
        double double50 = xYIntervalDataItem34.getXHighValue();
        int int51 = xYIntervalSeries25.indexOf((java.lang.Comparable) double50);
        java.lang.Object obj52 = xYIntervalSeries25.clone();
        boolean boolean53 = xYIntervalDataItem6.equals(obj52);
        java.lang.Double double54 = xYIntervalDataItem6.getX();
        java.lang.Number[] numberArray59 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray62 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray65 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray68 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray71 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray74 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray75 = new java.lang.Number[][] { numberArray59, numberArray62, numberArray65, numberArray68, numberArray71, numberArray74 };
        org.jfree.data.category.CategoryDataset categoryDataset76 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray75);
        org.jfree.data.pie.PieDataset pieDataset78 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset76, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState79 = pieDataset78.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset83 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset78, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number85 = pieDataset83.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset89 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset83, (java.lang.Comparable) (short) 10, (double) 100, 100);
        org.jfree.data.category.CategoryDataset categoryDataset90 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) double54, (org.jfree.data.KeyedValues) pieDataset83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalDataItem6 and xYIntervalDataItem34", xYIntervalDataItem6.equals(xYIntervalDataItem34) ? xYIntervalDataItem6.hashCode() == xYIntervalDataItem34.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.DomainOrder domainOrder9 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection10 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10, true);
        java.lang.Object obj13 = xYIntervalSeriesCollection10.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem20 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int22 = xYIntervalDataItem20.compareTo((java.lang.Object) 1.0f);
        double double23 = xYIntervalDataItem20.getXHighValue();
        java.lang.Object obj24 = xYIntervalDataItem20.clone();
        boolean boolean26 = xYIntervalDataItem20.equals((java.lang.Object) 0);
        int int27 = xYIntervalSeriesCollection10.indexOf((java.lang.Comparable) xYIntervalDataItem20);
        org.jfree.data.DomainOrder domainOrder28 = xYIntervalSeriesCollection10.getDomainOrder();
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent30 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) xYIntervalSeriesCollection10);
        xYIntervalSeriesCollection10.removeAllSeries();
        boolean boolean32 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection10);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj13", xYIntervalSeriesCollection0.equals(obj13) ? xYIntervalSeriesCollection0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22);
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray54 = new java.lang.Number[][] { numberArray38, numberArray41, numberArray44, numberArray47, numberArray50, numberArray53 };
        org.jfree.data.category.CategoryDataset categoryDataset55 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray54);
        java.util.List list56 = categoryDataset55.getRowKeys();
        org.jfree.data.Range range58 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset55, false);
        int int60 = categoryDataset55.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.Range range61 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset55);
        java.lang.String str62 = range61.toString();
        org.jfree.data.Range range63 = null;
        org.jfree.data.Range range64 = org.jfree.data.Range.combine(range61, range63);
        org.jfree.data.Range range65 = org.jfree.data.Range.combine(range33, range61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset22 and categoryDataset55", categoryDataset22.equals(categoryDataset55) ? categoryDataset22.hashCode() == categoryDataset55.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem39 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int41 = xYIntervalDataItem39.compareTo((java.lang.Object) 1.0f);
        int int42 = categoryDataset22.getColumnIndex((java.lang.Comparable) xYIntervalDataItem39);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener43 = null;
        categoryDataset22.addChangeListener(datasetChangeListener43);
        java.lang.Number[] numberArray49 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray52 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray55 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray58 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray61 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray64 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray65 = new java.lang.Number[][] { numberArray49, numberArray52, numberArray55, numberArray58, numberArray61, numberArray64 };
        org.jfree.data.category.CategoryDataset categoryDataset66 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray65);
        java.util.List list67 = categoryDataset66.getRowKeys();
        org.jfree.data.Range range69 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset66, false);
        boolean boolean70 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset66);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener71 = null;
        categoryDataset66.removeChangeListener(datasetChangeListener71);
        java.util.List list73 = categoryDataset66.getColumnKeys();
        java.util.List list74 = categoryDataset66.getRowKeys();
        org.jfree.data.Range range76 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, list74, false);
        boolean boolean79 = range76.intersects((double) 3, 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset22 and categoryDataset66", categoryDataset22.equals(categoryDataset66) ? categoryDataset22.hashCode() == categoryDataset66.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener5 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener5);
        java.lang.Object obj7 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection8 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset10 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo11 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent12 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset10, datasetChangeInfo11);
        xYIntervalSeriesCollection8.notifyListeners(datasetChangeEvent12);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState14 = xYIntervalSeriesCollection8.getSelectionState();
        int int16 = xYIntervalSeriesCollection8.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener17 = null;
        xYIntervalSeriesCollection8.removeChangeListener(datasetChangeListener17);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries22 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries22.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo25 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo25);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo27 = null;
        seriesChangeEvent26.setSummary(seriesChangeInfo27);
        java.lang.Object obj29 = seriesChangeEvent26.getSource();
        xYIntervalSeriesCollection8.seriesChanged(seriesChangeEvent26);
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        boolean boolean33 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection8);
        java.lang.Object obj34 = xYIntervalSeriesCollection0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and xYIntervalSeriesCollection8", obj7.equals(xYIntervalSeriesCollection8) ? obj7.hashCode() == xYIntervalSeriesCollection8.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 192.0d, 0.0d);
        java.lang.Number number33 = pieDataset31.getValue(100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 'a', (double) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener34 = null;
        pieDataset28.removeChangeListener(datasetChangeListener34);
        java.util.List list36 = pieDataset28.getKeys();
        boolean boolean37 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset28);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState38 = pieDataset28.getSelectionState();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection39 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset41 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo42 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent43 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset41, datasetChangeInfo42);
        xYIntervalSeriesCollection39.notifyListeners(datasetChangeEvent43);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState45 = xYIntervalSeriesCollection39.getSelectionState();
        org.jfree.data.general.DatasetGroup datasetGroup46 = xYIntervalSeriesCollection39.getGroup();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem53 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int55 = xYIntervalDataItem53.compareTo((java.lang.Object) 1.0f);
        double double56 = xYIntervalDataItem53.getXHighValue();
        java.lang.Object obj57 = xYIntervalDataItem53.clone();
        int int58 = xYIntervalSeriesCollection39.indexOf((java.lang.Comparable) xYIntervalDataItem53);
        org.jfree.data.pie.PieDataset pieDataset60 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) xYIntervalDataItem53, (double) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries9 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries9.setMaximumItemCount((int) ' ');
        org.jfree.data.Range range13 = null;
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, (double) 100);
        double double17 = range15.constrain((double) '4');
        double double18 = range15.getLength();
        org.jfree.data.Range range19 = null;
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range19, (double) 100);
        double double23 = range21.constrain((double) '4');
        boolean boolean24 = range15.intersects(range21);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries28 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries28.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo31 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent32 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo31);
        xYIntervalSeries9.firePropertyChange("", (java.lang.Object) boolean24, (java.lang.Object) ' ');
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries9);
        xYIntervalSeries9.fireSeriesChanged();
        boolean boolean36 = xYIntervalSeries9.getAllowDuplicateXValues();
        double[] doubleArray48 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray49 = new double[][] { doubleArray48 };
        org.jfree.data.category.CategoryDataset categoryDataset50 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray49);
        org.jfree.data.category.CategoryDataset categoryDataset51 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray49);
        org.jfree.data.category.CategoryDataset categoryDataset52 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.event.SeriesChangeEvent[source= ]", doubleArray49);
        org.jfree.data.category.CategoryDataset categoryDataset53 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray49);
        org.jfree.data.Range range55 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset53, true);
        boolean boolean56 = xYIntervalSeries9.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset51 and categoryDataset53", categoryDataset51.equals(categoryDataset53) ? categoryDataset51.hashCode() == categoryDataset53.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray11, numberArray14, numberArray17, numberArray20, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray24);
        java.util.List list26 = categoryDataset25.getRowKeys();
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, false);
        int int30 = categoryDataset25.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean31 = xYIntervalSeriesCollection0.equals((java.lang.Object) categoryDataset25);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        xYIntervalSeriesCollection0.removeAllSeries();
        java.lang.Number number35 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray58 = new java.lang.Number[][] { numberArray42, numberArray45, numberArray48, numberArray51, numberArray54, numberArray57 };
        org.jfree.data.category.CategoryDataset categoryDataset59 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray58);
        java.util.List list60 = categoryDataset59.getRowKeys();
        org.jfree.data.Range range62 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset59, (double) (short) -1);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener63 = null;
        categoryDataset59.removeChangeListener(datasetChangeListener63);
        org.jfree.data.pie.PieDataset pieDataset66 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset59, 2);
        boolean boolean67 = xYIntervalSeriesCollection0.equals((java.lang.Object) pieDataset66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset25 and categoryDataset59", categoryDataset25.equals(categoryDataset59) ? categoryDataset25.hashCode() == categoryDataset59.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.util.List list29 = pieDataset28.getKeys();
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) '4', (double) (byte) 0, (-1));
        java.util.List list34 = pieDataset33.getKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener48 = null;
        categoryDataset46.removeChangeListener(datasetChangeListener48);
        int int50 = categoryDataset46.getColumnCount();
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset46);
        org.jfree.data.pie.PieDataset pieDataset53 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset46, (int) (short) 1);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem60 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int62 = xYIntervalDataItem60.compareTo((java.lang.Object) 1.0f);
        double double63 = xYIntervalDataItem60.getXHighValue();
        org.jfree.data.Range range64 = null;
        org.jfree.data.Range range66 = org.jfree.data.Range.expandToInclude(range64, (double) 100);
        double double68 = range66.constrain((double) '4');
        boolean boolean69 = xYIntervalDataItem60.equals((java.lang.Object) '4');
        java.lang.Double double70 = xYIntervalDataItem60.getX();
        double double71 = xYIntervalDataItem60.getYLowValue();
        org.jfree.data.pie.PieDataset pieDataset74 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset53, (java.lang.Comparable) double71, 0.0d, 6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalDataItem6 and xYIntervalDataItem60", xYIntervalDataItem6.equals(xYIntervalDataItem60) ? xYIntervalDataItem6.hashCode() == xYIntervalDataItem60.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.general.DatasetGroup datasetGroup7 = xYIntervalSeriesCollection0.getGroup();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem14 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int16 = xYIntervalDataItem14.compareTo((java.lang.Object) 1.0f);
        double double17 = xYIntervalDataItem14.getXHighValue();
        java.lang.Object obj18 = xYIntervalDataItem14.clone();
        int int19 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem14);
        org.jfree.data.ComparableObjectSeries comparableObjectSeries23 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) (short) 0, false, true);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem30 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int32 = xYIntervalDataItem30.compareTo((java.lang.Object) 1.0f);
        double double33 = xYIntervalDataItem30.getXHighValue();
        org.jfree.data.Range range34 = null;
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range34, (double) 100);
        double double38 = range36.constrain((double) '4');
        boolean boolean39 = xYIntervalDataItem30.equals((java.lang.Object) '4');
        boolean boolean41 = xYIntervalDataItem30.equals((java.lang.Object) 0.0f);
        java.lang.Object obj42 = xYIntervalDataItem30.clone();
        int int43 = comparableObjectSeries23.indexOf((java.lang.Comparable) xYIntervalDataItem30);
        double[] doubleArray53 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray54 = new double[][] { doubleArray53 };
        org.jfree.data.category.CategoryDataset categoryDataset55 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray54);
        org.jfree.data.category.CategoryDataset categoryDataset56 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray54);
        org.jfree.data.category.CategoryDataset categoryDataset57 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.general.SeriesException: ", doubleArray54);
        org.jfree.data.pie.PieDataset pieDataset59 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset57, 0);
        org.jfree.data.category.CategoryDataset categoryDataset60 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) int43, (org.jfree.data.KeyedValues) pieDataset59);
        org.jfree.data.Range range61 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset60);
        org.jfree.data.ComparableObjectItem comparableObjectItem62 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) int19, (java.lang.Object) range61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalDataItem14 and xYIntervalDataItem30", xYIntervalDataItem14.equals(xYIntervalDataItem30) ? xYIntervalDataItem14.hashCode() == xYIntervalDataItem30.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.general.DatasetGroup datasetGroup30 = new org.jfree.data.general.DatasetGroup("org.jfree.data.event.DatasetChangeEvent[source=-1]");
        java.lang.Object obj31 = datasetGroup30.clone();
        org.jfree.data.xy.XYInterval xYInterval37 = new org.jfree.data.xy.XYInterval(0.0d, (double) 1.0f, (double) (-1), (double) '#', (double) 100L);
        double double38 = xYInterval37.getYHigh();
        boolean boolean39 = datasetGroup30.equals((java.lang.Object) double38);
        java.lang.Object obj40 = datasetGroup30.clone();
        pieDataset28.setGroup(datasetGroup30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj31 and obj40", obj31.equals(obj40) ? obj31.hashCode() == obj40.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 1.0f, 1.0d);
        java.lang.Comparable comparable33 = pieDataset28.getKey((int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset31", pieDataset23.equals(pieDataset31) ? pieDataset23.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        org.jfree.data.Range range48 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset46);
        org.jfree.data.Range range49 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset46);
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray63 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray66 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray69 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray70 = new java.lang.Number[][] { numberArray54, numberArray57, numberArray60, numberArray63, numberArray66, numberArray69 };
        org.jfree.data.category.CategoryDataset categoryDataset71 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray70);
        org.jfree.data.pie.PieDataset pieDataset73 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset71, 1);
        int int74 = categoryDataset71.getRowCount();
        org.jfree.data.Range range75 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset71);
        boolean boolean76 = range49.equals((java.lang.Object) categoryDataset71);
        java.lang.String str77 = range49.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset45 and categoryDataset71", categoryDataset45.equals(categoryDataset71) ? categoryDataset45.hashCode() == categoryDataset71.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) (short) 100, false, true);
        boolean boolean4 = xYIntervalSeries3.getAllowDuplicateXValues();
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray25 = new java.lang.Number[][] { numberArray9, numberArray12, numberArray15, numberArray18, numberArray21, numberArray24 };
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray25);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset26, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState29 = pieDataset28.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.util.List list34 = pieDataset33.getKeys();
        int int36 = pieDataset33.getIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem43 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int45 = xYIntervalDataItem43.compareTo((java.lang.Object) 1.0f);
        double double46 = xYIntervalDataItem43.getXHighValue();
        java.lang.Object obj47 = xYIntervalDataItem43.clone();
        double double48 = xYIntervalDataItem43.getXHighValue();
        org.jfree.data.pie.PieDataset pieDataset50 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) xYIntervalDataItem43, (double) 0.0f);
        boolean boolean51 = xYIntervalSeries3.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset28 and pieDataset33", pieDataset28.equals(pieDataset33) ? pieDataset28.hashCode() == pieDataset33.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        double double18 = xYIntervalDataItem10.getXLowValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj3", xYIntervalSeriesCollection0.equals(obj3) ? xYIntervalSeriesCollection0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        boolean boolean22 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem29 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int31 = xYIntervalDataItem29.compareTo((java.lang.Object) 1.0f);
        double double32 = xYIntervalDataItem29.getXHighValue();
        org.jfree.data.Range range33 = null;
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, (double) 100);
        double double37 = range35.constrain((double) '4');
        boolean boolean38 = xYIntervalDataItem29.equals((java.lang.Object) '4');
        org.jfree.data.Range range39 = null;
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range39, (double) 100);
        double double43 = range41.constrain((double) '4');
        int int44 = xYIntervalDataItem29.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray63 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray66 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray67 = new java.lang.Number[][] { numberArray51, numberArray54, numberArray57, numberArray60, numberArray63, numberArray66 };
        org.jfree.data.category.CategoryDataset categoryDataset68 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray67);
        org.jfree.data.category.CategoryDataset categoryDataset69 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray67);
        int int70 = xYIntervalDataItem29.compareTo((java.lang.Object) categoryDataset69);
        java.util.List list71 = categoryDataset69.getColumnKeys();
        org.jfree.data.Range range73 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset21, list71, true);
        org.jfree.data.Range range75 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, false);
        boolean boolean78 = range75.intersects(191.0d, (double) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset68", categoryDataset21.equals(categoryDataset68) ? categoryDataset21.hashCode() == categoryDataset68.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        int int26 = categoryDataset21.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, (double) (byte) -1, 200.0d);
        double double31 = range27.getLength();
        org.jfree.data.general.Dataset dataset32 = null;
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem39 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int41 = xYIntervalDataItem39.compareTo((java.lang.Object) 1.0f);
        double double42 = xYIntervalDataItem39.getXHighValue();
        double double43 = xYIntervalDataItem39.getXLowValue();
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray63 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray64 = new java.lang.Number[][] { numberArray48, numberArray51, numberArray54, numberArray57, numberArray60, numberArray63 };
        org.jfree.data.category.CategoryDataset categoryDataset65 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray64);
        java.util.List list66 = categoryDataset65.getRowKeys();
        org.jfree.data.Range range68 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset65, (double) (short) -1);
        java.util.List list69 = categoryDataset65.getRowKeys();
        java.lang.Number number70 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset65);
        boolean boolean71 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset65);
        org.jfree.data.Range range72 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset65);
        org.jfree.data.Range range73 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset65);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection74 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset76 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo77 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent78 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset76, datasetChangeInfo77);
        xYIntervalSeriesCollection74.notifyListeners(datasetChangeEvent78);
        org.jfree.data.general.Dataset dataset80 = datasetChangeEvent78.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo81 = datasetChangeEvent78.getInfo();
        java.lang.Object obj82 = datasetChangeEvent78.getSource();
        org.jfree.data.general.Dataset dataset83 = datasetChangeEvent78.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo84 = datasetChangeEvent78.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent85 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) double43, (org.jfree.data.general.Dataset) categoryDataset65, datasetChangeInfo84);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent86 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) double31, dataset32, datasetChangeInfo84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset65", categoryDataset21.equals(categoryDataset65) ? categoryDataset21.hashCode() == categoryDataset65.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        java.util.List list25 = categoryDataset21.getRowKeys();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection26 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset28 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo29 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent30 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset28, datasetChangeInfo29);
        xYIntervalSeriesCollection26.notifyListeners(datasetChangeEvent30);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState32 = xYIntervalSeriesCollection26.getSelectionState();
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection26);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection34 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder35 = xYIntervalSeriesCollection34.getDomainOrder();
        int int36 = xYIntervalSeriesCollection34.getSeriesCount();
        boolean boolean37 = xYIntervalSeriesCollection26.hasListener((java.util.EventListener) xYIntervalSeriesCollection34);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo38 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent39 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) list25, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection34, datasetChangeInfo38);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState40 = xYIntervalSeriesCollection34.getSelectionState();
        java.lang.Object obj41 = xYIntervalSeriesCollection34.clone();
        boolean boolean42 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection26 and obj41", xYIntervalSeriesCollection26.equals(obj41) ? xYIntervalSeriesCollection26.hashCode() == obj41.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj19 = xYIntervalSeriesCollection0.clone();
        int int20 = xYIntervalSeriesCollection0.getSeriesCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj19", obj3.equals(obj19) ? obj3.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Object obj13 = xYIntervalDataItem6.clone();
        double double14 = xYIntervalDataItem6.getYValue();
        java.lang.Comparable[] comparableArray15 = new java.lang.Comparable[] { double14 };
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem23 = new org.jfree.data.xy.XYIntervalDataItem(191.0d, 198.0d, (double) 32, (double) 100L, 15.5d, (double) (short) 0);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem30 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int32 = xYIntervalDataItem30.compareTo((java.lang.Object) 1.0f);
        double double33 = xYIntervalDataItem30.getXHighValue();
        org.jfree.data.Range range34 = null;
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range34, (double) 100);
        double double38 = range36.constrain((double) '4');
        boolean boolean39 = xYIntervalDataItem30.equals((java.lang.Object) '4');
        boolean boolean41 = xYIntervalDataItem30.equals((java.lang.Object) 0.0f);
        java.lang.Object obj42 = xYIntervalDataItem30.clone();
        java.lang.Object obj43 = null;
        int int44 = xYIntervalDataItem30.compareTo(obj43);
        double double45 = xYIntervalDataItem30.getXLowValue();
        org.jfree.data.ComparableObjectSeries comparableObjectSeries46 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) xYIntervalDataItem30);
        org.jfree.data.ComparableObjectItem comparableObjectItem47 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) 198.0d, (java.lang.Object) comparableObjectSeries46);
        java.lang.Comparable[] comparableArray49 = new java.lang.Comparable[] { 0, comparableObjectItem47, 1.0d };
        double[] doubleArray61 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray62 = new double[][] { doubleArray61 };
        org.jfree.data.category.CategoryDataset categoryDataset63 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray62);
        org.jfree.data.category.CategoryDataset categoryDataset64 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray62);
        org.jfree.data.category.CategoryDataset categoryDataset65 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.general.SeriesException: ", doubleArray62);
        org.jfree.data.category.CategoryDataset categoryDataset66 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "hi!1", doubleArray62);
        org.jfree.data.category.CategoryDataset categoryDataset67 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray15, comparableArray49, doubleArray62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalDataItem6 and xYIntervalDataItem30", xYIntervalDataItem6.equals(xYIntervalDataItem30) ? xYIntervalDataItem6.hashCode() == xYIntervalDataItem30.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 1, 35.0d, (int) '4');
        java.lang.Comparable comparable29 = pieDataset23.getKey((int) (short) 0);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem36 = new org.jfree.data.xy.XYIntervalDataItem((double) 0.0f, 100.0d, (double) 1, 1.0d, 1.0d, (double) 10L);
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 10L, 15.0d);
        boolean boolean39 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset27", pieDataset23.equals(pieDataset27) ? pieDataset23.hashCode() == pieDataset27.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 'a', (double) 100L);
        java.util.List list34 = pieDataset33.getKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection8 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder9 = xYIntervalSeriesCollection8.getDomainOrder();
        int int10 = xYIntervalSeriesCollection8.getSeriesCount();
        boolean boolean11 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection8);
        java.lang.Number number12 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        xYIntervalSeriesCollection8.validateObject();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent14 = null;
        xYIntervalSeriesCollection8.notifyListeners(datasetChangeEvent14);
        xYIntervalSeriesCollection8.validateObject();
        int int17 = xYIntervalSeriesCollection8.getSeriesCount();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries21 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj23 = null;
        xYIntervalSeries21.firePropertyChange("", obj23, (java.lang.Object) "hi!");
        xYIntervalSeries21.setKey((java.lang.Comparable) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYIntervalSeries21.addPropertyChangeListener(propertyChangeListener28);
        xYIntervalSeries21.setDescription("org.jfree.data.general.SeriesException: ");
        xYIntervalSeriesCollection8.removeSeries(xYIntervalSeries21);
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray49 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray52 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray53 = new java.lang.Number[][] { numberArray37, numberArray40, numberArray43, numberArray46, numberArray49, numberArray52 };
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray53);
        java.util.List list55 = categoryDataset54.getRowKeys();
        org.jfree.data.Range range57 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset54, false);
        boolean boolean58 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset54);
        org.jfree.data.Range range60 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset54, true);
        org.jfree.data.Range range62 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset54, (double) (byte) 0);
        org.jfree.data.Range range64 = org.jfree.data.Range.expandToInclude(range62, 0.0d);
        double double65 = range62.getCentralValue();
        double double66 = range62.getLowerBound();
        org.jfree.data.Range range67 = null;
        org.jfree.data.Range range69 = org.jfree.data.Range.expandToInclude(range67, (double) 100);
        double double71 = range69.constrain((double) '4');
        double double72 = range69.getLength();
        double double73 = range69.getCentralValue();
        double double75 = range69.constrain(1.0d);
        org.jfree.data.Range range76 = org.jfree.data.Range.combine(range62, range69);
        org.jfree.data.Range range78 = org.jfree.data.Range.scale(range76, (double) 0);
        boolean boolean81 = range76.intersects(93.0d, 0.0d);
        boolean boolean82 = xYIntervalSeries21.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and xYIntervalSeriesCollection8", xYIntervalSeriesCollection0.equals(xYIntervalSeriesCollection8) ? xYIntervalSeriesCollection0.hashCode() == xYIntervalSeriesCollection8.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection24 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder25 = xYIntervalSeriesCollection24.getDomainOrder();
        org.jfree.data.general.DatasetGroup datasetGroup26 = xYIntervalSeriesCollection24.getGroup();
        java.lang.Object obj27 = null;
        boolean boolean28 = datasetGroup26.equals(obj27);
        pieDataset23.setGroup(datasetGroup26);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem36 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int38 = xYIntervalDataItem36.compareTo((java.lang.Object) 1.0f);
        double double39 = xYIntervalDataItem36.getXHighValue();
        java.lang.Object obj40 = xYIntervalDataItem36.clone();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries44 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj46 = null;
        xYIntervalSeries44.firePropertyChange("", obj46, (java.lang.Object) "hi!");
        xYIntervalSeries44.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries44.add((double) 100, (double) 0, (double) (byte) -1, (double) (short) -1, (double) 100, (double) 0);
        boolean boolean58 = xYIntervalDataItem36.equals((java.lang.Object) 100);
        double double59 = xYIntervalDataItem36.getYLowValue();
        org.jfree.data.pie.PieDataset pieDataset61 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) xYIntervalDataItem36, (double) (byte) 0);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem68 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int70 = xYIntervalDataItem68.compareTo((java.lang.Object) 1.0f);
        double double71 = xYIntervalDataItem68.getXHighValue();
        org.jfree.data.Range range72 = null;
        org.jfree.data.Range range74 = org.jfree.data.Range.expandToInclude(range72, (double) 100);
        double double76 = range74.constrain((double) '4');
        boolean boolean77 = xYIntervalDataItem68.equals((java.lang.Object) '4');
        boolean boolean79 = xYIntervalDataItem68.equals((java.lang.Object) 0.0f);
        java.lang.Object obj80 = xYIntervalDataItem68.clone();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries81 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem68);
        double double82 = xYIntervalDataItem68.getXHighValue();
        double double83 = xYIntervalDataItem68.getXHighValue();
        int int84 = pieDataset23.getIndex((java.lang.Comparable) xYIntervalDataItem68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalDataItem36 and obj80", xYIntervalDataItem36.equals(obj80) ? xYIntervalDataItem36.hashCode() == obj80.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.DomainOrder domainOrder9 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection10 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10, true);
        java.lang.Object obj13 = xYIntervalSeriesCollection10.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem20 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int22 = xYIntervalDataItem20.compareTo((java.lang.Object) 1.0f);
        double double23 = xYIntervalDataItem20.getXHighValue();
        java.lang.Object obj24 = xYIntervalDataItem20.clone();
        boolean boolean26 = xYIntervalDataItem20.equals((java.lang.Object) 0);
        int int27 = xYIntervalSeriesCollection10.indexOf((java.lang.Comparable) xYIntervalDataItem20);
        org.jfree.data.DomainOrder domainOrder28 = xYIntervalSeriesCollection10.getDomainOrder();
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent30 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) xYIntervalSeriesCollection10);
        xYIntervalSeriesCollection10.removeAllSeries();
        boolean boolean32 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection10);
        org.jfree.data.ComparableObjectSeries comparableObjectSeries36 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) (short) 0, true, false);
        boolean boolean37 = comparableObjectSeries36.isEmpty();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo38 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent39 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) boolean37, seriesChangeInfo38);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo40 = null;
        seriesChangeEvent39.setSummary(seriesChangeInfo40);
        xYIntervalSeriesCollection10.seriesChanged(seriesChangeEvent39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj13", xYIntervalSeriesCollection0.equals(obj13) ? xYIntervalSeriesCollection0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection0.getSelectionState();
        boolean boolean10 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj11 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries15 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean16 = xYIntervalSeries15.getNotify();
        int int17 = xYIntervalSeries15.getItemCount();
        boolean boolean18 = xYIntervalSeries15.getAutoSort();
        xYIntervalSeries15.fireSeriesChanged();
        int int21 = xYIntervalSeries15.indexOf((java.lang.Comparable) 1.0f);
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries15);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection23 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset25 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo26 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent27 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset25, datasetChangeInfo26);
        xYIntervalSeriesCollection23.notifyListeners(datasetChangeEvent27);
        org.jfree.data.general.Dataset dataset29 = datasetChangeEvent27.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = datasetChangeEvent27.getInfo();
        java.lang.Object obj31 = datasetChangeEvent27.getSource();
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and xYIntervalSeriesCollection23", obj11.equals(xYIntervalSeriesCollection23) ? obj11.hashCode() == xYIntervalSeriesCollection23.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener9 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener9);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries14 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries14.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo17 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent18 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo17);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo19 = null;
        seriesChangeEvent18.setSummary(seriesChangeInfo19);
        java.lang.Object obj21 = seriesChangeEvent18.getSource();
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent18);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection23 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset25 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo26 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent27 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset25, datasetChangeInfo26);
        xYIntervalSeriesCollection23.notifyListeners(datasetChangeEvent27);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState29 = xYIntervalSeriesCollection23.getSelectionState();
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection23);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection31 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder32 = xYIntervalSeriesCollection31.getDomainOrder();
        int int33 = xYIntervalSeriesCollection31.getSeriesCount();
        boolean boolean34 = xYIntervalSeriesCollection23.hasListener((java.util.EventListener) xYIntervalSeriesCollection31);
        xYIntervalSeriesCollection31.validateObject();
        org.jfree.data.general.Dataset dataset37 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo38 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent39 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset37, datasetChangeInfo38);
        org.jfree.data.general.Dataset dataset40 = datasetChangeEvent39.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo41 = datasetChangeEvent39.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent42 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) xYIntervalSeriesCollection0, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection31, datasetChangeInfo41);
        java.lang.Object obj43 = datasetChangeEvent42.getSource();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj43 and xYIntervalSeriesCollection23", obj43.equals(xYIntervalSeriesCollection23) ? obj43.hashCode() == xYIntervalSeriesCollection23.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.DomainOrder domainOrder9 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection10 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10, true);
        java.lang.Object obj13 = xYIntervalSeriesCollection10.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem20 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int22 = xYIntervalDataItem20.compareTo((java.lang.Object) 1.0f);
        double double23 = xYIntervalDataItem20.getXHighValue();
        java.lang.Object obj24 = xYIntervalDataItem20.clone();
        boolean boolean26 = xYIntervalDataItem20.equals((java.lang.Object) 0);
        int int27 = xYIntervalSeriesCollection10.indexOf((java.lang.Comparable) xYIntervalDataItem20);
        org.jfree.data.DomainOrder domainOrder28 = xYIntervalSeriesCollection10.getDomainOrder();
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent30 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) xYIntervalSeriesCollection10);
        xYIntervalSeriesCollection10.removeAllSeries();
        boolean boolean32 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection10);
        java.lang.Number number33 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection10 and obj13", xYIntervalSeriesCollection10.equals(obj13) ? xYIntervalSeriesCollection10.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        java.lang.Object obj9 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener10 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener10);
        java.lang.Object obj12 = xYIntervalSeriesCollection0.clone();
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj9 and obj12", obj9.equals(obj12) ? obj9.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        int int44 = pieDataset41.getIndex((java.lang.Comparable) 100L);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem51 = new org.jfree.data.xy.XYIntervalDataItem(100.0d, (double) (byte) 1, (double) (byte) 1, 0.0d, 0.0d, 33.0d);
        int int52 = pieDataset41.getIndex((java.lang.Comparable) xYIntervalDataItem51);
        org.jfree.data.pie.PieDataset pieDataset56 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset41, (java.lang.Comparable) 15.5d, (double) 100L, (int) (byte) 1);
        java.lang.Number number58 = pieDataset41.getValue((int) ' ');
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection59 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset61 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo62 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent63 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset61, datasetChangeInfo62);
        xYIntervalSeriesCollection59.notifyListeners(datasetChangeEvent63);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState65 = xYIntervalSeriesCollection59.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener66 = null;
        xYIntervalSeriesCollection59.removeChangeListener(datasetChangeListener66);
        java.lang.Number number68 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection59);
        org.jfree.data.Range range70 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection59, true);
        org.jfree.data.Range range72 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection59, true);
        org.jfree.data.Range range74 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection59, false);
        java.lang.Number number75 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection59);
        org.jfree.data.ComparableObjectSeries comparableObjectSeries77 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) "org.jfree.data.event.SeriesChangeEvent[source= ]");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem84 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int86 = xYIntervalDataItem84.compareTo((java.lang.Object) 1.0f);
        java.lang.Double double87 = xYIntervalDataItem84.getX();
        java.lang.Object obj88 = xYIntervalDataItem84.clone();
        comparableObjectSeries77.setKey((java.lang.Comparable) xYIntervalDataItem84);
        int int90 = xYIntervalSeriesCollection59.indexOf((java.lang.Comparable) xYIntervalDataItem84);
        int int91 = pieDataset41.getIndex((java.lang.Comparable) int90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalDataItem6 and xYIntervalDataItem84", xYIntervalDataItem6.equals(xYIntervalDataItem84) ? xYIntervalDataItem6.hashCode() == xYIntervalDataItem84.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray30 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray31 = new java.lang.Number[][] { numberArray15, numberArray18, numberArray21, numberArray24, numberArray27, numberArray30 };
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray31);
        java.util.List list33 = categoryDataset32.getRowKeys();
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset32, (double) (short) -1);
        java.util.List list36 = categoryDataset32.getRowKeys();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection37 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset39 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo40 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent41 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset39, datasetChangeInfo40);
        xYIntervalSeriesCollection37.notifyListeners(datasetChangeEvent41);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState43 = xYIntervalSeriesCollection37.getSelectionState();
        org.jfree.data.Range range44 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection37);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection45 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder46 = xYIntervalSeriesCollection45.getDomainOrder();
        int int47 = xYIntervalSeriesCollection45.getSeriesCount();
        boolean boolean48 = xYIntervalSeriesCollection37.hasListener((java.util.EventListener) xYIntervalSeriesCollection45);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo49 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent50 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) list36, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection45, datasetChangeInfo49);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState51 = xYIntervalSeriesCollection45.getSelectionState();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection52 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset54 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo55 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent56 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset54, datasetChangeInfo55);
        xYIntervalSeriesCollection52.notifyListeners(datasetChangeEvent56);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo58 = datasetChangeEvent56.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent59 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) xYIntervalSeriesCollection0, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection45, datasetChangeInfo58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection37 and xYIntervalSeriesCollection52", xYIntervalSeriesCollection37.equals(xYIntervalSeriesCollection52) ? xYIntervalSeriesCollection37.hashCode() == xYIntervalSeriesCollection52.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) (short) 10, (double) 100, 100);
        java.util.List list35 = pieDataset34.getKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 192.0d, 0.0d);
        double double32 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj5 = null;
        xYIntervalSeries3.firePropertyChange("", obj5, (java.lang.Object) "hi!");
        xYIntervalSeries3.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries3.firePropertyChange("", (java.lang.Object) 100L, (java.lang.Object) 100.0f);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem21 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int23 = xYIntervalDataItem21.compareTo((java.lang.Object) 1.0f);
        double double24 = xYIntervalDataItem21.getXHighValue();
        java.lang.Object obj25 = xYIntervalDataItem21.clone();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries29 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean30 = xYIntervalSeries29.getNotify();
        int int31 = xYIntervalSeries29.getItemCount();
        boolean boolean32 = xYIntervalSeries29.getAutoSort();
        xYIntervalSeries29.fireSeriesChanged();
        xYIntervalSeries3.firePropertyChange("", obj25, (java.lang.Object) xYIntervalSeries29);
        int int36 = xYIntervalSeries3.indexOf((java.lang.Comparable) "");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection37 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range39 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection37, false);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState40 = xYIntervalSeriesCollection37.getSelectionState();
        java.lang.Object obj41 = xYIntervalSeriesCollection37.clone();
        boolean boolean42 = xYIntervalSeries3.equals((java.lang.Object) xYIntervalSeriesCollection37);
        xYIntervalSeries3.setNotify(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection37 and obj41", xYIntervalSeriesCollection37.equals(obj41) ? xYIntervalSeriesCollection37.hashCode() == obj41.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 192.0d, 0.0d);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState32 = pieDataset28.getSelectionState();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset31", pieDataset23.equals(pieDataset31) ? pieDataset23.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        int int7 = xYIntervalSeriesCollection0.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = xYIntervalSeriesCollection0.getGroup();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection9 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset11 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo12 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent13 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset11, datasetChangeInfo12);
        xYIntervalSeriesCollection9.notifyListeners(datasetChangeEvent13);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState15 = xYIntervalSeriesCollection9.getSelectionState();
        int int17 = xYIntervalSeriesCollection9.indexOf((java.lang.Comparable) 10.0f);
        java.lang.Object obj18 = xYIntervalSeriesCollection9.clone();
        int int19 = xYIntervalSeriesCollection9.getSeriesCount();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries23 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean24 = xYIntervalSeries23.getNotify();
        int int25 = xYIntervalSeries23.getItemCount();
        boolean boolean26 = xYIntervalSeries23.getAutoSort();
        xYIntervalSeries23.fireSeriesChanged();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries32 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj34 = null;
        xYIntervalSeries32.firePropertyChange("", obj34, (java.lang.Object) "hi!");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries40 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries40.setMaximumItemCount((int) ' ');
        org.jfree.data.Range range44 = null;
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range44, (double) 100);
        double double48 = range46.constrain((double) '4');
        double double49 = range46.getLength();
        org.jfree.data.Range range50 = null;
        org.jfree.data.Range range52 = org.jfree.data.Range.expandToInclude(range50, (double) 100);
        double double54 = range52.constrain((double) '4');
        boolean boolean55 = range46.intersects(range52);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries59 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries59.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo62 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent63 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo62);
        xYIntervalSeries40.firePropertyChange("", (java.lang.Object) boolean55, (java.lang.Object) ' ');
        xYIntervalSeries40.fireSeriesChanged();
        xYIntervalSeries23.firePropertyChange("org.jfree.data.event.DatasetChangeEvent[source=-1]", (java.lang.Object) "hi!", (java.lang.Object) xYIntervalSeries40);
        xYIntervalSeriesCollection9.removeSeries(xYIntervalSeries23);
        boolean boolean68 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection9);
        java.lang.Object obj69 = xYIntervalSeriesCollection9.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on xYIntervalSeriesCollection0 and obj18", xYIntervalSeriesCollection0.equals(obj18) ? xYIntervalSeriesCollection0.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.util.List list29 = pieDataset28.getKeys();
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 100.0f, (double) (-1L), (-1));
        org.jfree.data.event.DatasetChangeListener datasetChangeListener34 = null;
        pieDataset33.addChangeListener(datasetChangeListener34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 15.5d, (-1.0d));
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) "Range[-1.0,32.0]", 67.0d, 2147483647);
        double double31 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset30", pieDataset26.equals(pieDataset30) ? pieDataset26.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        int int44 = pieDataset41.getIndex((java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset48 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset41, (java.lang.Comparable) (-1.0f), (double) 0.0f, 32);
        double double49 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset48", pieDataset36.equals(pieDataset48) ? pieDataset36.hashCode() == pieDataset48.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj19 = xYIntervalSeriesCollection0.clone();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = xYIntervalSeriesCollection0.hasListener(eventListener20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj19", obj3.equals(obj19) ? obj3.hashCode() == obj19.hashCode() : true);
    }
}

