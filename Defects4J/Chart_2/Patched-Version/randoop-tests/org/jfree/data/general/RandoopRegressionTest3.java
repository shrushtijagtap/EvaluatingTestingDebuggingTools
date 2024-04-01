package org.jfree.data.general;

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
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries4 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj6 = null;
        xYIntervalSeries4.firePropertyChange("", obj6, (java.lang.Object) "hi!");
        java.lang.Comparable comparable9 = xYIntervalSeries4.getKey();
        int int11 = xYIntervalSeries4.indexOf((java.lang.Comparable) 0.0f);
        xYIntervalSeries4.setKey((java.lang.Comparable) (short) 10);
        org.jfree.data.ComparableObjectItem comparableObjectItem14 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) 244.0d, (java.lang.Object) xYIntervalSeries4);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection15 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset17 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo18 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent19 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset17, datasetChangeInfo18);
        xYIntervalSeriesCollection15.notifyListeners(datasetChangeEvent19);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState21 = xYIntervalSeriesCollection15.getSelectionState();
        int int23 = xYIntervalSeriesCollection15.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState24 = null;
        xYIntervalSeriesCollection15.setSelectionState(xYDatasetSelectionState24);
        int int27 = xYIntervalSeriesCollection15.indexOf((java.lang.Comparable) "org.jfree.data.general.SeriesException: hi!1");
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
        boolean boolean53 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset49);
        org.jfree.data.Range range55 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset49, true);
        boolean boolean57 = range55.contains((double) (byte) 1);
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range55, 1.0d, true);
        org.jfree.data.Range range61 = null;
        org.jfree.data.Range range63 = org.jfree.data.Range.expandToInclude(range61, (double) 100);
        double double65 = range63.constrain((double) '4');
        org.jfree.data.Range range68 = org.jfree.data.Range.shift(range63, (double) (byte) 1, false);
        org.jfree.data.Range range69 = org.jfree.data.Range.combine(range55, range68);
        org.jfree.data.Range range70 = null;
        org.jfree.data.Range range72 = org.jfree.data.Range.expandToInclude(range70, (double) 100);
        double double74 = range72.constrain((double) '4');
        double double75 = range72.getLength();
        org.jfree.data.Range range78 = org.jfree.data.Range.shift(range72, (double) 100, false);
        org.jfree.data.Range range79 = org.jfree.data.Range.combine(range68, range72);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent80 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) range68);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo81 = null;
        seriesChangeEvent80.setSummary(seriesChangeInfo81);
        xYIntervalSeriesCollection15.seriesChanged(seriesChangeEvent80);
        int int85 = xYIntervalSeriesCollection15.indexOf((java.lang.Comparable) "Range[100.0,100.0]");
        xYIntervalSeriesCollection15.removeAllSeries();
        boolean boolean87 = comparableObjectItem14.equals((java.lang.Object) xYIntervalSeriesCollection15);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10 + "'", comparable9, 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(xYDatasetSelectionState21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberArray41);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(categoryDataset49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertNotNull(range72);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 100.0d + "'", double74 == 100.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1502");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) 1, (double) 1L, (double) (byte) 100, (double) 1, (double) 'a', 52.0d);
        double[] doubleArray16 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray17 = new double[][] { doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray17);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.general.SeriesException: ", doubleArray17);
        org.jfree.data.ComparableObjectItem comparableObjectItem21 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) 'a', (java.lang.Object) "org.jfree.data.general.SeriesException: ");
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray30 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray43 = new java.lang.Number[][] { numberArray27, numberArray30, numberArray33, numberArray36, numberArray39, numberArray42 };
        org.jfree.data.category.CategoryDataset categoryDataset44 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray43);
        java.util.List list45 = categoryDataset44.getRowKeys();
        org.jfree.data.Range range47 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset44, false);
        int int49 = categoryDataset44.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset51 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo52 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent53 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset51, datasetChangeInfo52);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent54 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset44, datasetChangeInfo52);
        java.lang.Number number55 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset44);
        java.lang.Number number56 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset44);
        org.jfree.data.Range range58 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset44, true);
        java.lang.Number number59 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset44);
        org.jfree.data.pie.PieDataset pieDataset61 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset44, 0);
        org.jfree.data.category.CategoryDataset categoryDataset62 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) comparableObjectItem21, (org.jfree.data.KeyedValues) pieDataset61);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection63 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset65 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo66 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent67 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset65, datasetChangeInfo66);
        xYIntervalSeriesCollection63.notifyListeners(datasetChangeEvent67);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState69 = xYIntervalSeriesCollection63.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener70 = null;
        xYIntervalSeriesCollection63.removeChangeListener(datasetChangeListener70);
        java.lang.Number number72 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection63);
        org.jfree.data.Range range74 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection63, true);
        xYIntervalSeriesCollection63.validateObject();
        boolean boolean76 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection63);
        org.jfree.data.ComparableObjectItem comparableObjectItem77 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) comparableObjectItem21, (java.lang.Object) xYIntervalSeriesCollection63);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(categoryDataset44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertEquals("'" + number55 + "' != '" + 192.0d + "'", number55, 192.0d);
        org.junit.Assert.assertEquals("'" + number56 + "' != '" + 192.0d + "'", number56, 192.0d);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertEquals("'" + number59 + "' != '" + (-6.0d) + "'", number59, (-6.0d));
        org.junit.Assert.assertNotNull(pieDataset61);
        org.junit.Assert.assertNotNull(categoryDataset62);
        org.junit.Assert.assertNull(xYDatasetSelectionState69);
        org.junit.Assert.assertNull(number72);
        org.junit.Assert.assertNull(range74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1503");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState3 = xYIntervalSeriesCollection0.getSelectionState();
        java.lang.Object obj4 = xYIntervalSeriesCollection0.clone();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = xYIntervalSeriesCollection0.getEndXValue(100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNull(xYDatasetSelectionState3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1504");
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
        int int43 = pieDataset41.getItemCount();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent44 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) pieDataset41);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState45 = pieDataset41.getSelectionState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number47 = pieDataset41.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertNotNull(pieDataset36);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState37);
        org.junit.Assert.assertNotNull(pieDataset41);
        org.junit.Assert.assertNotNull(categoryDataset42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState45);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1505");
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
        org.jfree.data.Range range46 = null;
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range46, (double) 100);
        double double50 = range48.constrain((double) '4');
        boolean boolean52 = range48.contains((double) 0.0f);
        org.jfree.data.Range range54 = org.jfree.data.Range.scale(range48, (double) (byte) 100);
        org.jfree.data.Range range55 = org.jfree.data.Range.combine(range45, range48);
        double double57 = range45.constrain(32.0d);
        org.jfree.data.Range range59 = org.jfree.data.Range.scale(range45, 52.0d);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 93.0d + "'", double32 == 93.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-6.0d) + "'", double33 == (-6.0d));
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(range59);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1506");
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
        java.lang.Object obj64 = xYIntervalSeriesCollection0.clone();
        // The following exception was thrown during execution in test generation
        try {
            double double67 = xYIntervalSeriesCollection0.getXValue(3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberArray51);
        org.junit.Assert.assertNotNull(numberArray54);
        org.junit.Assert.assertNotNull(numberArray57);
        org.junit.Assert.assertNotNull(numberArray58);
        org.junit.Assert.assertNotNull(categoryDataset59);
        org.junit.Assert.assertNotNull(categoryDataset60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(obj64);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1507");
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
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = xYIntervalSeriesCollection0.getEndYValue(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNull(range14);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1508");
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
        org.jfree.data.general.DatasetGroup datasetGroup28 = categoryDataset21.getGroup();
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset21, true);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (-1.0d) + "'", number26, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(datasetGroup28);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1509");
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
        xYIntervalSeriesCollection0.removeAllSeries();
        // The following exception was thrown during execution in test generation
        try {
            double double72 = xYIntervalSeriesCollection0.getEndYValue((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertNull(xYDatasetSelectionState21);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertNotNull(domainOrder28);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertNotNull(numberArray49);
        org.junit.Assert.assertNotNull(numberArray52);
        org.junit.Assert.assertNotNull(numberArray53);
        org.junit.Assert.assertNotNull(categoryDataset54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(dataset65);
        org.junit.Assert.assertNotNull(dataset66);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 10L + "'", obj67, 10L);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1510");
        double[] doubleArray7 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray8 = new double[][] { doubleArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("org.jfree.data.general.SeriesException: ", "", doubleArray8);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset10, (int) (byte) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset34, true);
        org.jfree.data.general.DatasetGroup datasetGroup37 = categoryDataset34.getGroup();
        boolean boolean38 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset34);
        boolean boolean39 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset34);
        java.lang.Number number40 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset34);
        org.jfree.data.general.DatasetGroup datasetGroup42 = new org.jfree.data.general.DatasetGroup("org.jfree.data.event.DatasetChangeEvent[source=-1]");
        java.lang.Object obj43 = datasetGroup42.clone();
        categoryDataset34.setGroup(datasetGroup42);
        pieDataset12.setGroup(datasetGroup42);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(datasetGroup37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + number40 + "' != '" + (-1.0d) + "'", number40, (-1.0d));
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1511");
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
        xYIntervalSeriesCollection0.removeAllSeries();
        int int70 = xYIntervalSeriesCollection0.getSeriesCount();
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertNull(xYDatasetSelectionState21);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertNotNull(domainOrder28);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertNotNull(numberArray49);
        org.junit.Assert.assertNotNull(numberArray52);
        org.junit.Assert.assertNotNull(numberArray53);
        org.junit.Assert.assertNotNull(categoryDataset54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(dataset65);
        org.junit.Assert.assertNotNull(dataset66);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 10L + "'", obj67, 10L);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1512");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries3.setMaximumItemCount((int) (short) 1);
        boolean boolean6 = xYIntervalSeries3.getAllowDuplicateXValues();
        xYIntervalSeries3.setDescription("hi!");
        xYIntervalSeries3.setDescription("NOID");
        boolean boolean11 = xYIntervalSeries3.getNotify();
        boolean boolean12 = xYIntervalSeries3.getAllowDuplicateXValues();
        java.lang.Object obj14 = null;
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection15 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset17 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo18 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent19 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset17, datasetChangeInfo18);
        xYIntervalSeriesCollection15.notifyListeners(datasetChangeEvent19);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState21 = xYIntervalSeriesCollection15.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener22 = null;
        xYIntervalSeriesCollection15.removeChangeListener(datasetChangeListener22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection15);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection15, true);
        xYIntervalSeriesCollection15.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup28 = xYIntervalSeriesCollection15.getGroup();
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
        double double77 = xYIntervalDataItem35.getXHighValue();
        int int78 = xYIntervalSeriesCollection15.indexOf((java.lang.Comparable) double77);
        org.jfree.data.Range range79 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection15);
        xYIntervalSeries3.firePropertyChange("Range[100.0,100.0]", obj14, (java.lang.Object) xYIntervalSeriesCollection15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(xYDatasetSelectionState21);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertNull(range26);
        org.junit.Assert.assertNotNull(datasetGroup28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(numberArray57);
        org.junit.Assert.assertNotNull(numberArray60);
        org.junit.Assert.assertNotNull(numberArray63);
        org.junit.Assert.assertNotNull(numberArray66);
        org.junit.Assert.assertNotNull(numberArray69);
        org.junit.Assert.assertNotNull(numberArray72);
        org.junit.Assert.assertNotNull(numberArray73);
        org.junit.Assert.assertNotNull(categoryDataset74);
        org.junit.Assert.assertNotNull(categoryDataset75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 100.0d + "'", double77 == 100.0d);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNull(range79);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1513");
        double[] doubleArray9 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.general.SeriesException: ", doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = categoryDataset13.getValue(0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1514");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = null;
        xYIntervalSeriesCollection0.setSelectionState(xYDatasetSelectionState9);
        java.lang.Number number11 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries15 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj17 = null;
        xYIntervalSeries15.firePropertyChange("", obj17, (java.lang.Object) "hi!");
        xYIntervalSeries15.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries15.firePropertyChange("", (java.lang.Object) 100L, (java.lang.Object) 100.0f);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries29 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean30 = xYIntervalSeries29.getNotify();
        int int31 = xYIntervalSeries29.getItemCount();
        xYIntervalSeries29.clear();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries36 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries36.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo39 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent40 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo39);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo41 = null;
        seriesChangeEvent40.setSummary(seriesChangeInfo41);
        java.lang.Object obj43 = seriesChangeEvent40.getSource();
        xYIntervalSeries29.notifyListeners(seriesChangeEvent40);
        xYIntervalSeries15.notifyListeners(seriesChangeEvent40);
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries15);
        java.lang.Number number47 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range48 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = xYIntervalSeriesCollection0.getItemCount((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + ' ' + "'", obj43, ' ');
        org.junit.Assert.assertNull(number47);
        org.junit.Assert.assertNull(range48);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1515");
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
        // The following exception was thrown during execution in test generation
        try {
            double double56 = xYIntervalSeries21.getYLowValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(domainOrder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNull(range16);
        org.junit.Assert.assertNull(xYDatasetSelectionState17);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1516");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset21);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        int int27 = categoryDataset21.getColumnCount();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 192.0d + "'", number24, 192.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1517");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        int int4 = xYIntervalSeriesCollection0.getSeriesCount();
        boolean boolean5 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener6 = null;
        xYIntervalSeriesCollection0.addChangeListener(datasetChangeListener6);
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1518");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.DomainOrder domainOrder2 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection3 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset5 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo6 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent7 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset5, datasetChangeInfo6);
        xYIntervalSeriesCollection3.notifyListeners(datasetChangeEvent7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection3.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener10 = null;
        xYIntervalSeriesCollection3.removeChangeListener(datasetChangeListener10);
        java.lang.Number number12 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection3);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo13 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection3.fireDatasetChanged(datasetChangeInfo13);
        xYIntervalSeriesCollection0.fireDatasetChanged(datasetChangeInfo13);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        int int17 = xYIntervalSeriesCollection0.getSeriesCount();
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = xYIntervalSeriesCollection0.getSeriesKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertNotNull(domainOrder2);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNull(range16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(range18);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1519");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.DomainOrder domainOrder2 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection3 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset5 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo6 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent7 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset5, datasetChangeInfo6);
        xYIntervalSeriesCollection3.notifyListeners(datasetChangeEvent7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection3.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener10 = null;
        xYIntervalSeriesCollection3.removeChangeListener(datasetChangeListener10);
        java.lang.Number number12 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection3);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo13 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection3.fireDatasetChanged(datasetChangeInfo13);
        xYIntervalSeriesCollection0.fireDatasetChanged(datasetChangeInfo13);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 2);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState18 = xYIntervalSeriesCollection0.getSelectionState();
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertNotNull(domainOrder2);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(xYDatasetSelectionState18);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1520");
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
        xYIntervalSeriesCollection0.removeAllSeries();
        org.jfree.data.general.DatasetGroup datasetGroup25 = xYIntervalSeriesCollection0.getGroup();
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + ' ' + "'", obj21, ' ');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(datasetGroup25);
        org.junit.Assert.assertNull(number26);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1521");
        org.jfree.data.xy.XYInterval xYInterval5 = new org.jfree.data.xy.XYInterval((double) 10, 93.0d, (double) (-1L), (double) 0, (double) ' ');
        double double6 = xYInterval5.getY();
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
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem46 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int48 = xYIntervalDataItem46.compareTo((java.lang.Object) 1.0f);
        int int49 = categoryDataset29.getColumnIndex((java.lang.Comparable) xYIntervalDataItem46);
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset29, true);
        boolean boolean52 = xYInterval5.equals((java.lang.Object) range51);
        double double53 = xYInterval5.getY();
        double double54 = xYInterval5.getYHigh();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 32.0d + "'", double54 == 32.0d);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1522");
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
        java.lang.Comparable comparable53 = categoryDataset46.getColumnKey(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertEquals("'" + comparable53 + "' != '" + "hi!1" + "'", comparable53, "hi!1");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1523");
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
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset21);
        java.lang.Comparable comparable28 = categoryDataset21.getRowKey(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = categoryDataset21.getValue(6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + (-1.0d) + "'", number25, (-1.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + "hi!1" + "'", comparable28, "hi!1");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1524");
        double[] doubleArray7 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray8 = new double[][] { doubleArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryDataset10);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1525");
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
        java.lang.Comparable comparable26 = categoryDataset21.getRowKey((int) (short) 0);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem33 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int35 = xYIntervalDataItem33.compareTo((java.lang.Object) 1.0f);
        double double36 = xYIntervalDataItem33.getXHighValue();
        org.jfree.data.Range range37 = null;
        org.jfree.data.Range range39 = org.jfree.data.Range.expandToInclude(range37, (double) 100);
        double double41 = range39.constrain((double) '4');
        boolean boolean42 = xYIntervalDataItem33.equals((java.lang.Object) '4');
        org.jfree.data.Range range43 = null;
        org.jfree.data.Range range45 = org.jfree.data.Range.expandToInclude(range43, (double) 100);
        double double47 = range45.constrain((double) '4');
        int int48 = xYIntervalDataItem33.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray55 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray58 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray61 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray64 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray67 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray70 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray71 = new java.lang.Number[][] { numberArray55, numberArray58, numberArray61, numberArray64, numberArray67, numberArray70 };
        org.jfree.data.category.CategoryDataset categoryDataset72 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray71);
        org.jfree.data.category.CategoryDataset categoryDataset73 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray71);
        int int74 = xYIntervalDataItem33.compareTo((java.lang.Object) categoryDataset73);
        java.util.List list75 = categoryDataset73.getColumnKeys();
        java.util.List list76 = categoryDataset73.getColumnKeys();
        org.jfree.data.Range range78 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset21, list76, false);
        org.jfree.data.KeyToGroupMap keyToGroupMap79 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range80 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, keyToGroupMap79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + "hi!1" + "'", comparable26, "hi!1");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(numberArray55);
        org.junit.Assert.assertNotNull(numberArray58);
        org.junit.Assert.assertNotNull(numberArray61);
        org.junit.Assert.assertNotNull(numberArray64);
        org.junit.Assert.assertNotNull(numberArray67);
        org.junit.Assert.assertNotNull(numberArray70);
        org.junit.Assert.assertNotNull(numberArray71);
        org.junit.Assert.assertNotNull(categoryDataset72);
        org.junit.Assert.assertNotNull(categoryDataset73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(list75);
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertNotNull(range78);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1526");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState2 = xYIntervalSeriesCollection0.getSelectionState();
        int int3 = xYIntervalSeriesCollection0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = xYIntervalSeriesCollection0.getEndXValue((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range1);
        org.junit.Assert.assertNull(xYDatasetSelectionState2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1527");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray9, numberArray12, numberArray15, numberArray18, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset24);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset24, false);
        org.jfree.data.Range range29 = org.jfree.data.Range.scale(range27, (double) 1L);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem36 = new org.jfree.data.xy.XYIntervalDataItem((double) 1, 93.0d, 0.0d, 67.0d, (double) 2, (-1.0d));
        double double37 = xYIntervalDataItem36.getXLowValue();
        boolean boolean38 = range29.equals((java.lang.Object) xYIntervalDataItem36);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(categoryDataset24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 32.0d + "'", number25, 32.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 93.0d + "'", double37 == 93.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1528");
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
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries36 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean37 = xYIntervalSeries36.getNotify();
        int int38 = xYIntervalSeries36.getItemCount();
        xYIntervalSeries36.setKey((java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            xYIntervalSeriesCollection0.addSeries(xYIntervalSeries36);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener org.jfree.data.xy.XYIntervalSeriesCollection@53fa333e is not of type class org.jfree.data.xy.XYIntervalSeries");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + ' ' + "'", obj21, ' ');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertNull(dataset31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1529");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.DomainOrder domainOrder2 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection3 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset5 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo6 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent7 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset5, datasetChangeInfo6);
        xYIntervalSeriesCollection3.notifyListeners(datasetChangeEvent7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection3.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener10 = null;
        xYIntervalSeriesCollection3.removeChangeListener(datasetChangeListener10);
        java.lang.Number number12 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection3);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo13 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection3.fireDatasetChanged(datasetChangeInfo13);
        xYIntervalSeriesCollection0.fireDatasetChanged(datasetChangeInfo13);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertNotNull(domainOrder2);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNull(range16);
        org.junit.Assert.assertNull(range17);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1530");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj4 = xYIntervalSeriesCollection0.clone();
        java.lang.Comparable comparable5 = null;
        int int6 = xYIntervalSeriesCollection0.indexOf(comparable5);
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1531");
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
        java.lang.Number[] numberArray30 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray46 = new java.lang.Number[][] { numberArray30, numberArray33, numberArray36, numberArray39, numberArray42, numberArray45 };
        org.jfree.data.category.CategoryDataset categoryDataset47 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray46);
        org.jfree.data.Range range49 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset47, true);
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset47, 0.0d);
        java.util.List list52 = categoryDataset47.getRowKeys();
        org.jfree.data.Range range54 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, list52, false);
        java.lang.Number number55 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset21);
        org.jfree.data.Range range56 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertNotNull(categoryDataset47);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertEquals("'" + number55 + "' != '" + 32.0d + "'", number55, 32.0d);
        org.junit.Assert.assertNotNull(range56);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1532");
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
        int int20 = xYIntervalSeriesCollection0.getSeriesCount();
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(domainOrder18);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1533");
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
        org.jfree.data.event.DatasetChangeListener datasetChangeListener12 = null;
        xYIntervalSeriesCollection0.addChangeListener(datasetChangeListener12);
        int int14 = xYIntervalSeriesCollection0.getSeriesCount();
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1534");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj5 = null;
        xYIntervalSeries3.firePropertyChange("", obj5, (java.lang.Object) "hi!");
        xYIntervalSeries3.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries3.firePropertyChange("", (java.lang.Object) 100L, (java.lang.Object) 100.0f);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries17 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean18 = xYIntervalSeries17.getNotify();
        int int19 = xYIntervalSeries17.getItemCount();
        xYIntervalSeries17.clear();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries24 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries24.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo27 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent28 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo27);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo29 = null;
        seriesChangeEvent28.setSummary(seriesChangeInfo29);
        java.lang.Object obj31 = seriesChangeEvent28.getSource();
        xYIntervalSeries17.notifyListeners(seriesChangeEvent28);
        xYIntervalSeries3.notifyListeners(seriesChangeEvent28);
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
        org.jfree.data.event.DatasetChangeListener datasetChangeListener68 = null;
        categoryDataset56.removeChangeListener(datasetChangeListener68);
        boolean boolean70 = xYIntervalSeries3.equals((java.lang.Object) datasetChangeListener68);
        xYIntervalSeries3.setNotify(true);
        int int74 = xYIntervalSeries3.indexOf((java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double76 = xYIntervalSeries3.getYLowValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + ' ' + "'", obj31, ' ');
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberArray51);
        org.junit.Assert.assertNotNull(numberArray54);
        org.junit.Assert.assertNotNull(numberArray55);
        org.junit.Assert.assertNotNull(categoryDataset56);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1535");
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
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset21);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        int int31 = categoryDataset21.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries35 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj37 = null;
        xYIntervalSeries35.firePropertyChange("", obj37, (java.lang.Object) "hi!");
        xYIntervalSeries35.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries35.add((double) 100, (double) 0, (double) (byte) -1, (double) (short) -1, (double) 100, (double) 0);
        java.lang.String str49 = xYIntervalSeries35.getDescription();
        boolean boolean50 = xYIntervalSeries35.getNotify();
        boolean boolean51 = xYIntervalSeries35.getAllowDuplicateXValues();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem58 = new org.jfree.data.xy.XYIntervalDataItem((double) 1, 93.0d, 0.0d, 67.0d, (double) 2, (-1.0d));
        double double59 = xYIntervalDataItem58.getXLowValue();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection60 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range62 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection60, true);
        org.jfree.data.Range range63 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection60);
        int int64 = xYIntervalDataItem58.compareTo((java.lang.Object) range63);
        int int65 = xYIntervalSeries35.indexOf((java.lang.Comparable) xYIntervalDataItem58);
        int int66 = categoryDataset21.getRowIndex((java.lang.Comparable) xYIntervalDataItem58);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (-1.0d) + "'", number26, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 93.0d + "'", double59 == 93.0d);
        org.junit.Assert.assertNull(range62);
        org.junit.Assert.assertNull(range63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1536");
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
        java.lang.Comparable comparable61 = null;
        int int62 = xYIntervalSeriesCollection10.indexOf(comparable61);
        org.jfree.data.DomainOrder domainOrder63 = xYIntervalSeriesCollection10.getDomainOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable65 = xYIntervalSeriesCollection10.getSeriesKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(range2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(xYDatasetSelectionState16);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNull(dataset24);
        org.junit.Assert.assertNotNull(datasetChangeInfo25);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberArray41);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(categoryDataset49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(domainOrder63);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1537");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1538");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj5 = null;
        xYIntervalSeries3.firePropertyChange("", obj5, (java.lang.Object) "hi!");
        xYIntervalSeries3.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries3.add((double) 100, (double) 0, (double) (byte) -1, (double) (short) -1, (double) 100, (double) 0);
        java.lang.String str17 = xYIntervalSeries3.getDescription();
        boolean boolean18 = xYIntervalSeries3.getNotify();
        boolean boolean19 = xYIntervalSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem26 = new org.jfree.data.xy.XYIntervalDataItem((double) 1, 93.0d, 0.0d, 67.0d, (double) 2, (-1.0d));
        double double27 = xYIntervalDataItem26.getXLowValue();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection28 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection28, true);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection28);
        int int32 = xYIntervalDataItem26.compareTo((java.lang.Object) range31);
        int int33 = xYIntervalSeries3.indexOf((java.lang.Comparable) xYIntervalDataItem26);
        double double34 = xYIntervalDataItem26.getYValue();
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 93.0d + "'", double27 == 93.0d);
        org.junit.Assert.assertNull(range30);
        org.junit.Assert.assertNull(range31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 67.0d + "'", double34 == 67.0d);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1539");
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
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNull(range18);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1540");
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
        double double26 = range25.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range25, (double) (-1), true);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 33.0d + "'", double26 == 33.0d);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1541");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState2 = xYIntervalSeriesCollection0.getSelectionState();
        int int3 = xYIntervalSeriesCollection0.getSeriesCount();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener4 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener4);
        org.junit.Assert.assertNull(range1);
        org.junit.Assert.assertNull(xYDatasetSelectionState2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1542");
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
        categoryDataset22.removeChangeListener(datasetChangeListener34);
        java.util.List list36 = categoryDataset22.getColumnKeys();
        org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset22, true);
        org.jfree.data.Range range40 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset22, true);
        java.util.List list41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range43 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset22, list41, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range40);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1543");
        org.jfree.data.ComparableObjectSeries comparableObjectSeries3 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) 198.0d, false, true);
        comparableObjectSeries3.setNotify(true);
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray29 = new java.lang.Number[][] { numberArray13, numberArray16, numberArray19, numberArray22, numberArray25, numberArray28 };
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("NOID", "org.jfree.data.event.SeriesChangeEvent[source= ]", numberArray29);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset31, false);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset31, 52.0d);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range35, (double) (short) 0, true);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection39 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder40 = xYIntervalSeriesCollection39.getDomainOrder();
        org.jfree.data.DomainOrder domainOrder41 = xYIntervalSeriesCollection39.getDomainOrder();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener42 = null;
        xYIntervalSeriesCollection39.addChangeListener(datasetChangeListener42);
        comparableObjectSeries3.firePropertyChange("org.jfree.data.general.SeriesException: ", (java.lang.Object) true, (java.lang.Object) datasetChangeListener42);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(categoryDataset30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(domainOrder40);
        org.junit.Assert.assertNotNull(domainOrder41);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1544");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) '#', 4.0d, 31.0d, 35.0d, 192.0d, (double) 2);
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
        java.util.List list32 = categoryDataset28.getRowKeys();
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset28, false);
        int int35 = xYIntervalDataItem6.compareTo((java.lang.Object) false);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1545");
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
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range33, (double) 10.0f, true);
        double double38 = range36.constrain((double) 3);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range36, (double) (byte) -1);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.0d + "'", double38 == 4.0d);
        org.junit.Assert.assertNotNull(range40);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1546");
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
        java.lang.Object obj20 = xYIntervalDataItem16.clone();
        double double21 = xYIntervalDataItem16.getXHighValue();
        int int22 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem16);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection23 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset25 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo26 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent27 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset25, datasetChangeInfo26);
        xYIntervalSeriesCollection23.notifyListeners(datasetChangeEvent27);
        int int30 = xYIntervalSeriesCollection23.indexOf((java.lang.Comparable) 100L);
        int int31 = xYIntervalSeriesCollection23.getSeriesCount();
        boolean boolean32 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection23);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState33 = xYIntervalSeriesCollection0.getSelectionState();
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(xYDatasetSelectionState33);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1547");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        int int24 = categoryDataset21.getRowCount();
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + (-1.0d) + "'", number25, (-1.0d));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1548");
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
        java.lang.Number number63 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset22);
        org.jfree.data.Range range65 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset22, false);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertNotNull(numberArray49);
        org.junit.Assert.assertNotNull(numberArray52);
        org.junit.Assert.assertNotNull(numberArray53);
        org.junit.Assert.assertNotNull(categoryDataset54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertEquals("'" + number63 + "' != '" + (-1.0d) + "'", number63, (-1.0d));
        org.junit.Assert.assertNotNull(range65);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1549");
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
        // The following exception was thrown during execution in test generation
        try {
            double double28 = xYIntervalSeriesCollection0.getEndXValue(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(domainOrder13);
        org.junit.Assert.assertNull(dataset20);
        org.junit.Assert.assertNotNull(datasetChangeInfo21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1L) + "'", obj22, (-1L));
        org.junit.Assert.assertNull(dataset23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1L) + "'", obj24, (-1L));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1550");
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
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset21, false);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset21);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 192.0d + "'", number27, 192.0d);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1551");
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
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj14 = xYIntervalSeriesCollection0.clone();
        int int16 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 0.0f);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries22 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean23 = xYIntervalSeries22.getNotify();
        int int24 = xYIntervalSeries22.getItemCount();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo25 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent26 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) xYIntervalSeries22, seriesChangeInfo25);
        boolean boolean27 = xYIntervalSeries22.getAutoSort();
        int int28 = xYIntervalSeries22.getMaximumItemCount();
        xYIntervalSeries22.fireSeriesChanged();
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray49 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray50 = new java.lang.Number[][] { numberArray34, numberArray37, numberArray40, numberArray43, numberArray46, numberArray49 };
        org.jfree.data.category.CategoryDataset categoryDataset51 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray50);
        java.util.List list52 = categoryDataset51.getRowKeys();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem59 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int61 = xYIntervalDataItem59.compareTo((java.lang.Object) 1.0f);
        double double62 = xYIntervalDataItem59.getXHighValue();
        java.lang.Object obj63 = xYIntervalDataItem59.clone();
        boolean boolean65 = xYIntervalDataItem59.equals((java.lang.Object) 0);
        java.lang.Object obj66 = xYIntervalDataItem59.clone();
        int int67 = categoryDataset51.getColumnIndex((java.lang.Comparable) xYIntervalDataItem59);
        xYIntervalSeries22.setKey((java.lang.Comparable) int67);
        boolean boolean69 = xYIntervalSeries22.getNotify();
        java.lang.String str70 = xYIntervalSeries22.getDescription();
        boolean boolean71 = xYIntervalSeriesCollection0.equals((java.lang.Object) str70);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertNotNull(numberArray49);
        org.junit.Assert.assertNotNull(numberArray50);
        org.junit.Assert.assertNotNull(categoryDataset51);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1552");
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
        org.jfree.data.general.DatasetGroup datasetGroup32 = xYIntervalSeriesCollection0.getGroup();
        boolean boolean33 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(datasetGroup32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1553");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        double double10 = xYIntervalDataItem6.getXLowValue();
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
        java.lang.Number number37 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset32);
        boolean boolean38 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset32);
        org.jfree.data.Range range39 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset32);
        org.jfree.data.Range range40 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset32);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection41 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset43 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo44 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent45 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset43, datasetChangeInfo44);
        xYIntervalSeriesCollection41.notifyListeners(datasetChangeEvent45);
        org.jfree.data.general.Dataset dataset47 = datasetChangeEvent45.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo48 = datasetChangeEvent45.getInfo();
        java.lang.Object obj49 = datasetChangeEvent45.getSource();
        org.jfree.data.general.Dataset dataset50 = datasetChangeEvent45.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo51 = datasetChangeEvent45.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent52 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) double10, (org.jfree.data.general.Dataset) categoryDataset32, datasetChangeInfo51);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo53 = datasetChangeEvent52.getInfo();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(categoryDataset32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertEquals("'" + number37 + "' != '" + (-1.0d) + "'", number37, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNull(dataset47);
        org.junit.Assert.assertNotNull(datasetChangeInfo48);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1L) + "'", obj49, (-1L));
        org.junit.Assert.assertNull(dataset50);
        org.junit.Assert.assertNotNull(datasetChangeInfo51);
        org.junit.Assert.assertNotNull(datasetChangeInfo53);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1554");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.DatasetGroup datasetGroup1 = xYIntervalSeriesCollection0.getGroup();
        int int3 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) (-6.0d));
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
        boolean boolean29 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset25);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset25, (double) (byte) 0);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset25);
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range34, 198.0d);
        boolean boolean37 = xYIntervalSeriesCollection0.equals((java.lang.Object) range36);
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1555");
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
        xYIntervalSeriesCollection0.removeAllSeries();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = xYIntervalSeriesCollection0.getYValue((int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(range9);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1556");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        boolean boolean10 = xYIntervalDataItem6.equals((java.lang.Object) 32);
        double double11 = xYIntervalDataItem6.getYValue();
        java.lang.Object obj12 = xYIntervalDataItem6.clone();
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
        org.jfree.data.Range range40 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset34);
        org.jfree.data.Range range43 = org.jfree.data.Range.expand(range40, (double) (byte) -1, 200.0d);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries45 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) "");
        boolean boolean46 = xYIntervalSeries45.getAllowDuplicateXValues();
        boolean boolean47 = range43.equals((java.lang.Object) xYIntervalSeries45);
        org.jfree.data.ComparableObjectItem comparableObjectItem48 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) xYIntervalDataItem6, (java.lang.Object) xYIntervalSeries45);
        double double49 = xYIntervalDataItem6.getYHighValue();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1557");
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
        double double29 = xYIntervalDataItem6.getXLowValue();
        java.lang.Number[] numberArray35 = new java.lang.Number[] { 93.0d, 192.0d, 2 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { 93.0d, 192.0d, 2 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { 93.0d, 192.0d, 2 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { 93.0d, 192.0d, 2 };
        java.lang.Number[][] numberArray48 = new java.lang.Number[][] { numberArray35, numberArray39, numberArray43, numberArray47 };
        org.jfree.data.category.CategoryDataset categoryDataset49 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "NOID", numberArray48);
        int int51 = categoryDataset49.getColumnIndex((java.lang.Comparable) "NOID");
        boolean boolean52 = xYIntervalDataItem6.equals((java.lang.Object) int51);
        double double53 = xYIntervalDataItem6.getYValue();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries54 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem6);
        double double55 = xYIntervalDataItem6.getYHighValue();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(categoryDataset49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1558");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj4 = xYIntervalSeriesCollection0.clone();
        xYIntervalSeriesCollection0.removeAllSeries();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = xYIntervalSeriesCollection0.getEndYValue(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNull(range3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1559");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset21);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection27 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        xYIntervalSeriesCollection27.notifyListeners(datasetChangeEvent31);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState33 = xYIntervalSeriesCollection27.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener34 = null;
        xYIntervalSeriesCollection27.removeChangeListener(datasetChangeListener34);
        java.lang.Number number36 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection27);
        org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection27, true);
        org.jfree.data.Range range40 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection27, true);
        org.jfree.data.Range range42 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection27, true);
        org.jfree.data.Range range43 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection27);
        java.lang.Object obj44 = xYIntervalSeriesCollection27.clone();
        boolean boolean45 = range26.equals((java.lang.Object) xYIntervalSeriesCollection27);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 192.0d + "'", number24, 192.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNull(xYDatasetSelectionState33);
        org.junit.Assert.assertNull(number36);
        org.junit.Assert.assertNull(range38);
        org.junit.Assert.assertNull(range40);
        org.junit.Assert.assertNull(range42);
        org.junit.Assert.assertNull(range43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1560");
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
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState59 = null;
        xYIntervalSeriesCollection0.setSelectionState(xYDatasetSelectionState59);
        java.lang.Number number61 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number64 = xYIntervalSeriesCollection0.getX(2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(number61);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1561");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("Range[100.0,100.0]");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection2 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder3 = xYIntervalSeriesCollection2.getDomainOrder();
        org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection2);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem11 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int13 = xYIntervalDataItem11.compareTo((java.lang.Object) 1.0f);
        double double14 = xYIntervalDataItem11.getXHighValue();
        org.jfree.data.Range range15 = null;
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range15, (double) 100);
        double double19 = range17.constrain((double) '4');
        boolean boolean20 = xYIntervalDataItem11.equals((java.lang.Object) '4');
        org.jfree.data.Range range21 = null;
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range21, (double) 100);
        double double25 = range23.constrain((double) '4');
        int int26 = xYIntervalDataItem11.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray49 = new java.lang.Number[][] { numberArray33, numberArray36, numberArray39, numberArray42, numberArray45, numberArray48 };
        org.jfree.data.category.CategoryDataset categoryDataset50 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray49);
        org.jfree.data.category.CategoryDataset categoryDataset51 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray49);
        int int52 = xYIntervalDataItem11.compareTo((java.lang.Object) categoryDataset51);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener53 = null;
        categoryDataset51.removeChangeListener(datasetChangeListener53);
        org.jfree.data.general.DatasetGroup datasetGroup55 = categoryDataset51.getGroup();
        xYIntervalSeriesCollection2.setGroup(datasetGroup55);
        boolean boolean57 = datasetGroup1.equals((java.lang.Object) xYIntervalSeriesCollection2);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState58 = xYIntervalSeriesCollection2.getSelectionState();
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState59 = xYIntervalSeriesCollection2.getSelectionState();
        org.jfree.data.Range range60 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection2);
        org.junit.Assert.assertNotNull(domainOrder3);
        org.junit.Assert.assertNull(range4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberArray49);
        org.junit.Assert.assertNotNull(categoryDataset50);
        org.junit.Assert.assertNotNull(categoryDataset51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(datasetGroup55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(xYDatasetSelectionState58);
        org.junit.Assert.assertNull(xYDatasetSelectionState59);
        org.junit.Assert.assertNull(range60);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1562");
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
        org.jfree.data.event.DatasetChangeListener datasetChangeListener12 = null;
        xYIntervalSeriesCollection0.addChangeListener(datasetChangeListener12);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries17 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj19 = null;
        xYIntervalSeries17.firePropertyChange("", obj19, (java.lang.Object) "hi!");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries25 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean26 = xYIntervalSeries17.equals((java.lang.Object) false);
        int int27 = xYIntervalSeries17.getItemCount();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection28 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset30 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo31 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset30, datasetChangeInfo31);
        xYIntervalSeriesCollection28.notifyListeners(datasetChangeEvent32);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState34 = xYIntervalSeriesCollection28.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener35 = null;
        xYIntervalSeriesCollection28.removeChangeListener(datasetChangeListener35);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState37 = xYIntervalSeriesCollection28.getSelectionState();
        boolean boolean38 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection28);
        org.jfree.data.Range range39 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection28);
        boolean boolean40 = xYIntervalSeries17.equals((java.lang.Object) range39);
        java.lang.Comparable comparable41 = xYIntervalSeries17.getKey();
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries17);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(xYDatasetSelectionState34);
        org.junit.Assert.assertNull(xYDatasetSelectionState37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(range39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + 10 + "'", comparable41, 10);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1563");
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
        java.lang.Number number31 = pieDataset23.getValue(0);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState32 = pieDataset23.getSelectionState();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(domainOrder25);
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + (short) -1 + "'", number31, (short) -1);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState32);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1564");
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
        xYIntervalSeriesCollection0.removeAllSeries();
        java.lang.Number number12 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYIntervalSeriesCollection0.getStartX(1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1565");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.DomainOrder domainOrder9 = xYIntervalSeriesCollection0.getDomainOrder();
        boolean boolean10 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = xYIntervalSeriesCollection0.getY(2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(domainOrder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1566");
        double[] doubleArray9 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!2", "", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("NOID", "", doubleArray10);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset13, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset13);
        org.jfree.data.Range range17 = null;
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (double) 100);
        org.jfree.data.Range range21 = org.jfree.data.Range.scale(range19, (double) (byte) 0);
        boolean boolean24 = range21.intersects((double) 100.0f, 100.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.scale(range21, 32.0d);
        double double27 = range21.getLowerBound();
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range21, 2.147483839E9d);
        boolean boolean30 = range16.intersects(range29);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1567");
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
        org.jfree.data.general.Dataset dataset20 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo21 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent22 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset20, datasetChangeInfo21);
        boolean boolean23 = xYIntervalSeriesCollection0.equals((java.lang.Object) datasetChangeInfo21);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState24 = null;
        xYIntervalSeriesCollection0.setSelectionState(xYDatasetSelectionState24);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = xYIntervalSeriesCollection0.getStartYValue((int) ' ', 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1568");
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
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Comparable comparable21 = null;
        int int22 = xYIntervalSeriesCollection0.indexOf(comparable21);
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(domainOrder18);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1569");
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
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset21);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset21);
        double double30 = range29.getUpperBound();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 32.0d + "'", number28, 32.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 31.0d + "'", double30 == 31.0d);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1570");
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
        org.jfree.data.DomainOrder domainOrder13 = xYIntervalSeriesCollection0.getDomainOrder();
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries18 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries18.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo21 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent22 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo21);
        java.lang.Object obj23 = seriesChangeEvent22.getSource();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo24 = null;
        seriesChangeEvent22.setSummary(seriesChangeInfo24);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo26 = null;
        seriesChangeEvent22.setSummary(seriesChangeInfo26);
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent22);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(domainOrder13);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + ' ' + "'", obj23, ' ');
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1571");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYIntervalSeriesCollection0.getX(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1572");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        int int4 = xYIntervalSeriesCollection0.getSeriesCount();
        int int6 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 100.0d);
        org.jfree.data.DomainOrder domainOrder7 = xYIntervalSeriesCollection0.getDomainOrder();
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener9 = null;
        xYIntervalSeriesCollection0.addChangeListener(datasetChangeListener9);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent11 = null;
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent11);
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(domainOrder7);
        org.junit.Assert.assertNull(number8);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1573");
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
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset22);
        double double34 = range33.getLength();
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 198.0d + "'", double34 == 198.0d);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1574");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj5 = null;
        xYIntervalSeries3.firePropertyChange("", obj5, (java.lang.Object) "hi!");
        xYIntervalSeries3.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries3.add((double) 100, (double) 0, (double) (byte) -1, (double) (short) -1, (double) 100, (double) 0);
        org.jfree.data.Range range18 = null;
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range18, (double) 100);
        double double22 = range20.constrain((double) '4');
        boolean boolean24 = range20.contains((double) 0.0f);
        xYIntervalSeries3.firePropertyChange("org.jfree.data.event.DatasetChangeEvent[source=-1]", (java.lang.Object) 0.0f, (java.lang.Object) true);
        int int27 = xYIntervalSeries3.getMaximumItemCount();
        org.jfree.data.Range range28 = null;
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range28, (double) 100);
        double double32 = range30.constrain((double) '4');
        double double33 = range30.getLength();
        double double34 = range30.getCentralValue();
        java.lang.String str35 = range30.toString();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent36 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) str35);
        xYIntervalSeries3.notifyListeners(seriesChangeEvent36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYIntervalSeries3.addPropertyChangeListener(propertyChangeListener38);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection40 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset42 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo43 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent44 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset42, datasetChangeInfo43);
        xYIntervalSeriesCollection40.notifyListeners(datasetChangeEvent44);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState46 = xYIntervalSeriesCollection40.getSelectionState();
        int int48 = xYIntervalSeriesCollection40.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener49 = null;
        xYIntervalSeriesCollection40.removeChangeListener(datasetChangeListener49);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries54 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries54.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo57 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent58 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo57);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo59 = null;
        seriesChangeEvent58.setSummary(seriesChangeInfo59);
        java.lang.Object obj61 = seriesChangeEvent58.getSource();
        xYIntervalSeriesCollection40.seriesChanged(seriesChangeEvent58);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener63 = null;
        xYIntervalSeriesCollection40.addChangeListener(datasetChangeListener63);
        org.jfree.data.Range range65 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection40);
        org.jfree.data.Range range67 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection40, true);
        // The following exception was thrown during execution in test generation
        try {
            xYIntervalSeries3.removeChangeListener((org.jfree.data.event.SeriesChangeListener) xYIntervalSeriesCollection40);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener org.jfree.data.xy.XYIntervalSeriesCollection@4f7dc3ad is not of type class org.jfree.data.xy.XYIntervalSeries");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Range[100.0,100.0]" + "'", str35, "Range[100.0,100.0]");
        org.junit.Assert.assertNull(xYDatasetSelectionState46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + ' ' + "'", obj61, ' ');
        org.junit.Assert.assertNull(range65);
        org.junit.Assert.assertNull(range67);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1575");
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
        java.lang.Comparable comparable28 = categoryDataset21.getColumnKey((int) (short) 0);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + "1" + "'", comparable28, "1");
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1576");
        double[] doubleArray10 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.general.SeriesException: ", doubleArray11);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset14, 0);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (short) 1, (org.jfree.data.KeyedValues) pieDataset16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener19 = null;
        categoryDataset17.addChangeListener(datasetChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(pieDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 1.0d + "'", number18, 1.0d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1577");
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
        java.lang.Comparable comparable28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = categoryDataset21.getColumnIndex(comparable28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (-1.0d) + "'", number26, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1578");
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
        org.jfree.data.Range range43 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection34, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number46 = xYIntervalSeriesCollection34.getStartX(2147483647, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(xYDatasetSelectionState32);
        org.junit.Assert.assertNull(range33);
        org.junit.Assert.assertNotNull(domainOrder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(xYDatasetSelectionState40);
        org.junit.Assert.assertNull(range41);
        org.junit.Assert.assertNull(range43);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1579");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        int int24 = categoryDataset21.getRowCount();
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, (double) (-1));
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries32 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries32.setMaximumItemCount((int) (short) 1);
        xYIntervalSeries32.fireSeriesChanged();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries39 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries39.setMaximumItemCount((int) ' ');
        int int42 = xYIntervalSeries39.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYIntervalSeries39.removePropertyChangeListener(propertyChangeListener43);
        boolean boolean45 = xYIntervalSeries32.equals((java.lang.Object) xYIntervalSeries39);
        boolean boolean46 = range26.equals((java.lang.Object) xYIntervalSeries39);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1580");
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
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState12 = null;
        xYIntervalSeriesCollection8.setSelectionState(xYDatasetSelectionState12);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = xYIntervalSeriesCollection8.getEndYValue(3, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(domainOrder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1581");
        double[] doubleArray11 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.event.SeriesChangeEvent[source= ]", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray12);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset16, 1);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection19 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset21 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo22 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent23 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset21, datasetChangeInfo22);
        xYIntervalSeriesCollection19.notifyListeners(datasetChangeEvent23);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState25 = xYIntervalSeriesCollection19.getSelectionState();
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection19);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection19, false);
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
        java.lang.Object obj77 = xYIntervalDataItem35.clone();
        int int78 = xYIntervalSeriesCollection19.indexOf((java.lang.Comparable) xYIntervalDataItem35);
        int int79 = categoryDataset16.getRowIndex((java.lang.Comparable) xYIntervalDataItem35);
        boolean boolean80 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable82 = categoryDataset16.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(pieDataset18);
        org.junit.Assert.assertNull(xYDatasetSelectionState25);
        org.junit.Assert.assertNull(range26);
        org.junit.Assert.assertNull(range28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(numberArray57);
        org.junit.Assert.assertNotNull(numberArray60);
        org.junit.Assert.assertNotNull(numberArray63);
        org.junit.Assert.assertNotNull(numberArray66);
        org.junit.Assert.assertNotNull(numberArray69);
        org.junit.Assert.assertNotNull(numberArray72);
        org.junit.Assert.assertNotNull(numberArray73);
        org.junit.Assert.assertNotNull(categoryDataset74);
        org.junit.Assert.assertNotNull(categoryDataset75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1582");
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
        org.jfree.data.event.DatasetChangeListener datasetChangeListener23 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener23);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1583");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        int int24 = categoryDataset21.getRowCount();
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset21);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1584");
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
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset21, true);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset21);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + (-1.0d) + "'", number23, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 192.0d + "'", number28, 192.0d);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1585");
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
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries45 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries45.setMaximumItemCount((int) (short) 1);
        boolean boolean48 = xYIntervalSeries45.getAllowDuplicateXValues();
        xYIntervalSeriesCollection34.removeSeries(xYIntervalSeries45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable51 = xYIntervalSeriesCollection34.getSeriesKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(xYDatasetSelectionState32);
        org.junit.Assert.assertNull(range33);
        org.junit.Assert.assertNotNull(domainOrder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(xYDatasetSelectionState40);
        org.junit.Assert.assertNull(range41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1586");
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
        int int26 = categoryDataset21.getRowIndex((java.lang.Comparable) "org.jfree.data.general.SeriesException: ");
        int int27 = categoryDataset21.getRowCount();
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset21);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener30 = null;
        categoryDataset21.addChangeListener(datasetChangeListener30);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + (-1.0d) + "'", number28, (-1.0d));
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1587");
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
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries20 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem6);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem28 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int30 = xYIntervalDataItem28.compareTo((java.lang.Object) 1.0f);
        double double31 = xYIntervalDataItem28.getXHighValue();
        double double32 = xYIntervalDataItem28.getYLowValue();
        java.lang.Comparable[] comparableArray33 = new java.lang.Comparable[] { xYIntervalDataItem6, (byte) 1, double32 };
        java.lang.Comparable[] comparableArray34 = null;
        double[] doubleArray46 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray47 = new double[][] { doubleArray46 };
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray47);
        org.jfree.data.category.CategoryDataset categoryDataset49 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray47);
        org.jfree.data.category.CategoryDataset categoryDataset50 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.general.SeriesException: ", doubleArray47);
        org.jfree.data.category.CategoryDataset categoryDataset51 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "hi!1", doubleArray47);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset52 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray33, comparableArray34, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertNotNull(comparableArray33);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(categoryDataset48);
        org.junit.Assert.assertNotNull(categoryDataset49);
        org.junit.Assert.assertNotNull(categoryDataset50);
        org.junit.Assert.assertNotNull(categoryDataset51);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1588");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Object obj13 = xYIntervalDataItem6.clone();
        double double14 = xYIntervalDataItem6.getYValue();
        double double15 = xYIntervalDataItem6.getYHighValue();
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray36 = new java.lang.Number[][] { numberArray20, numberArray23, numberArray26, numberArray29, numberArray32, numberArray35 };
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray36);
        org.jfree.data.pie.PieDataset pieDataset39 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset37, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState40 = pieDataset39.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset44 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset39, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number46 = pieDataset44.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset49 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset44, (java.lang.Comparable) 'a', (double) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener50 = null;
        pieDataset44.removeChangeListener(datasetChangeListener50);
        java.util.List list52 = pieDataset44.getKeys();
        org.jfree.data.category.CategoryDataset categoryDataset53 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) double15, (org.jfree.data.KeyedValues) pieDataset44);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener54 = null;
        pieDataset44.addChangeListener(datasetChangeListener54);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState56 = pieDataset44.getSelectionState();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(categoryDataset37);
        org.junit.Assert.assertNotNull(pieDataset39);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState40);
        org.junit.Assert.assertNotNull(pieDataset44);
        org.junit.Assert.assertNull(number46);
        org.junit.Assert.assertNotNull(pieDataset49);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(categoryDataset53);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState56);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1589");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray11, numberArray14, numberArray17, numberArray20, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "org.jfree.data.general.SeriesException: ", numberArray24);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(categoryDataset27);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1590");
        org.jfree.data.xy.XYInterval xYInterval5 = new org.jfree.data.xy.XYInterval(0.0d, (double) 1.0f, (double) (-1), (double) '#', (double) 100L);
        double double6 = xYInterval5.getYHigh();
        double double7 = xYInterval5.getXLow();
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray15, numberArray18, numberArray21, numberArray24, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset29);
        boolean boolean31 = xYInterval5.equals((java.lang.Object) boolean30);
        double double32 = xYInterval5.getYHigh();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1591");
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
        // The following exception was thrown during execution in test generation
        try {
            double double24 = xYIntervalSeries15.getXLowValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1592");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 0.0d, 0.0d, 4, (java.lang.Comparable) 93.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1593");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        int int8 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = null;
        xYIntervalSeriesCollection0.setSelectionState(xYDatasetSelectionState9);
        int int12 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) "org.jfree.data.general.SeriesException: hi!1");
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent15 = null;
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent15);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(range14);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1594");
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
        org.jfree.data.Range range53 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem60 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int62 = xYIntervalDataItem60.compareTo((java.lang.Object) 1.0f);
        double double63 = xYIntervalDataItem60.getXHighValue();
        java.lang.Object obj64 = xYIntervalDataItem60.clone();
        boolean boolean66 = xYIntervalDataItem60.equals((java.lang.Object) 0);
        java.lang.Object obj67 = xYIntervalDataItem60.clone();
        double double68 = xYIntervalDataItem60.getYValue();
        double double69 = xYIntervalDataItem60.getYHighValue();
        double double70 = xYIntervalDataItem60.getYLowValue();
        double double71 = xYIntervalDataItem60.getYValue();
        double double72 = xYIntervalDataItem60.getYLowValue();
        int int73 = categoryDataset21.getColumnIndex((java.lang.Comparable) xYIntervalDataItem60);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertNotNull(categoryDataset48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 100.0d + "'", double63 == 100.0d);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 100.0d + "'", double69 == 100.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 100.0d + "'", double70 == 100.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 100.0d + "'", double72 == 100.0d);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1595");
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
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset21);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        int int30 = categoryDataset21.getColumnCount();
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset21);
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray52 = new java.lang.Number[][] { numberArray36, numberArray39, numberArray42, numberArray45, numberArray48, numberArray51 };
        org.jfree.data.category.CategoryDataset categoryDataset53 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray52);
        org.jfree.data.pie.PieDataset pieDataset55 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset53, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState56 = pieDataset55.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset60 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset55, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number62 = pieDataset60.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset65 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset60, (java.lang.Comparable) 'a', (double) 100L);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener66 = null;
        pieDataset60.removeChangeListener(datasetChangeListener66);
        java.util.List list68 = pieDataset60.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range70 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset21, list68, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (-1.0d) + "'", number26, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + (-1.0d) + "'", number29, (-1.0d));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 192.0d + "'", number31, 192.0d);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberArray51);
        org.junit.Assert.assertNotNull(numberArray52);
        org.junit.Assert.assertNotNull(categoryDataset53);
        org.junit.Assert.assertNotNull(pieDataset55);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState56);
        org.junit.Assert.assertNotNull(pieDataset60);
        org.junit.Assert.assertNull(number62);
        org.junit.Assert.assertNotNull(pieDataset65);
        org.junit.Assert.assertNotNull(list68);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1596");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        xYIntervalSeriesCollection0.removeAllSeries();
        xYIntervalSeriesCollection0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup14 = xYIntervalSeriesCollection0.getGroup();
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(datasetGroup14);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1597");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, 0.0d);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range26, 127.0d, true);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1598");
        double[] doubleArray9 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("2", "org.jfree.data.general.SeriesException: ", doubleArray10);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset13, false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1599");
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
        // The following exception was thrown during execution in test generation
        try {
            double double44 = xYIntervalSeriesCollection34.getEndXValue(2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(xYDatasetSelectionState32);
        org.junit.Assert.assertNull(range33);
        org.junit.Assert.assertNotNull(domainOrder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(xYDatasetSelectionState40);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1600");
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
        org.jfree.data.event.DatasetChangeListener datasetChangeListener57 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener57);
        org.jfree.data.general.DatasetGroup datasetGroup60 = new org.jfree.data.general.DatasetGroup("hi!");
        java.lang.Object obj61 = null;
        boolean boolean62 = datasetGroup60.equals(obj61);
        xYIntervalSeriesCollection0.setGroup(datasetGroup60);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(domainOrder54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1601");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = pieDataset28.getValue((java.lang.Comparable) 31.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: The key (31.0) is not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState24);
        org.junit.Assert.assertNotNull(pieDataset28);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState29);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1602");
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
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState59 = null;
        xYIntervalSeriesCollection0.setSelectionState(xYDatasetSelectionState59);
        java.lang.Number number61 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            double double64 = xYIntervalSeriesCollection0.getEndYValue((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(number61);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1603");
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
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        int int20 = xYIntervalSeriesCollection0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = xYIntervalSeriesCollection0.getEndX(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1604");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        xYIntervalSeriesCollection0.removeAllSeries();
        int int13 = xYIntervalSeriesCollection0.getSeriesCount();
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1605");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset22, (double) (short) -1);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset22);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset22);
        java.util.List list28 = categoryDataset22.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds(xYDataset0, list28, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (-1.0d) + "'", number26, (-1.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1606");
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
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertNull(number16);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1607");
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
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset21);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21);
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray49 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray50 = new java.lang.Number[][] { numberArray34, numberArray37, numberArray40, numberArray43, numberArray46, numberArray49 };
        org.jfree.data.category.CategoryDataset categoryDataset51 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray50);
        java.util.List list52 = categoryDataset51.getRowKeys();
        org.jfree.data.Range range54 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset51, false);
        int int56 = categoryDataset51.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset58 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo59 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent60 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset58, datasetChangeInfo59);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent61 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset51, datasetChangeInfo59);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem68 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int70 = xYIntervalDataItem68.compareTo((java.lang.Object) 1.0f);
        int int71 = categoryDataset51.getColumnIndex((java.lang.Comparable) xYIntervalDataItem68);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries74 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem68, false, false);
        double double75 = xYIntervalDataItem68.getYLowValue();
        java.lang.Object obj76 = xYIntervalDataItem68.clone();
        int int77 = categoryDataset21.getRowIndex((java.lang.Comparable) xYIntervalDataItem68);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + (-6.0d) + "'", number25, (-6.0d));
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (-6.0d) + "'", number26, (-6.0d));
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + (-1.0d) + "'", number27, (-1.0d));
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertNotNull(numberArray49);
        org.junit.Assert.assertNotNull(numberArray50);
        org.junit.Assert.assertNotNull(categoryDataset51);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 100.0d + "'", double75 == 100.0d);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1608");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState3 = xYIntervalSeriesCollection0.getSelectionState();
        java.lang.Number number4 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNull(xYDatasetSelectionState3);
        org.junit.Assert.assertNull(number4);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1609");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem14 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int16 = xYIntervalDataItem14.compareTo((java.lang.Object) 1.0f);
        double double17 = xYIntervalDataItem14.getXHighValue();
        org.jfree.data.Range range18 = null;
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range18, (double) 100);
        double double22 = range20.constrain((double) '4');
        boolean boolean23 = xYIntervalDataItem14.equals((java.lang.Object) '4');
        org.jfree.data.Range range24 = null;
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range24, (double) 100);
        double double28 = range26.constrain((double) '4');
        int int29 = xYIntervalDataItem14.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray52 = new java.lang.Number[][] { numberArray36, numberArray39, numberArray42, numberArray45, numberArray48, numberArray51 };
        org.jfree.data.category.CategoryDataset categoryDataset53 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray52);
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray52);
        int int55 = xYIntervalDataItem14.compareTo((java.lang.Object) categoryDataset54);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener56 = null;
        categoryDataset54.removeChangeListener(datasetChangeListener56);
        org.jfree.data.general.DatasetGroup datasetGroup58 = categoryDataset54.getGroup();
        xYIntervalSeriesCollection0.setGroup(datasetGroup58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number62 = xYIntervalSeriesCollection0.getStartY(32, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberArray51);
        org.junit.Assert.assertNotNull(numberArray52);
        org.junit.Assert.assertNotNull(categoryDataset53);
        org.junit.Assert.assertNotNull(categoryDataset54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(datasetGroup58);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1610");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries3.setMaximumItemCount((int) (short) 1);
        boolean boolean6 = xYIntervalSeries3.getAllowDuplicateXValues();
        boolean boolean7 = xYIntervalSeries3.getNotify();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem14 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int16 = xYIntervalDataItem14.compareTo((java.lang.Object) 1.0f);
        double double17 = xYIntervalDataItem14.getXHighValue();
        org.jfree.data.Range range18 = null;
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range18, (double) 100);
        double double22 = range20.constrain((double) '4');
        boolean boolean23 = xYIntervalDataItem14.equals((java.lang.Object) '4');
        org.jfree.data.Range range24 = null;
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range24, (double) 100);
        double double28 = range26.constrain((double) '4');
        int int29 = xYIntervalDataItem14.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray52 = new java.lang.Number[][] { numberArray36, numberArray39, numberArray42, numberArray45, numberArray48, numberArray51 };
        org.jfree.data.category.CategoryDataset categoryDataset53 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray52);
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray52);
        int int55 = xYIntervalDataItem14.compareTo((java.lang.Object) categoryDataset54);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener56 = null;
        categoryDataset54.removeChangeListener(datasetChangeListener56);
        java.util.List list58 = categoryDataset54.getColumnKeys();
        org.jfree.data.Range range60 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset54, false);
        java.lang.Number number61 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset54);
        org.jfree.data.Range range63 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset54, false);
        boolean boolean64 = xYIntervalSeries3.equals((java.lang.Object) categoryDataset54);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberArray51);
        org.junit.Assert.assertNotNull(numberArray52);
        org.junit.Assert.assertNotNull(categoryDataset53);
        org.junit.Assert.assertNotNull(categoryDataset54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertEquals("'" + number61 + "' != '" + (-6.0d) + "'", number61, (-6.0d));
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1611");
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
        org.jfree.data.Range range53 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        org.jfree.data.general.DatasetGroup datasetGroup55 = new org.jfree.data.general.DatasetGroup("Range[100.0,100.0]");
        categoryDataset21.setGroup(datasetGroup55);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertNotNull(categoryDataset48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range53);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1612");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        double[] doubleArray11 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.general.SeriesException: ", doubleArray12);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset15, 0);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (short) 1, (org.jfree.data.KeyedValues) pieDataset17);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset18);
        java.util.List list20 = categoryDataset18.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds(xYDataset0, list20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 1.0d + "'", number19, 1.0d);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1613");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = xYIntervalSeriesCollection0.getStartX(6, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1614");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem12 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int14 = xYIntervalDataItem12.compareTo((java.lang.Object) 1.0f);
        double double15 = xYIntervalDataItem12.getXHighValue();
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        boolean boolean21 = xYIntervalDataItem12.equals((java.lang.Object) '4');
        boolean boolean23 = xYIntervalDataItem12.equals((java.lang.Object) 0.0f);
        java.lang.Object obj24 = xYIntervalDataItem12.clone();
        java.lang.Object obj25 = xYIntervalDataItem12.clone();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries26 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem12);
        int int27 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem12);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1615");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj8 = xYIntervalSeriesCollection0.clone();
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1616");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number56 = categoryDataset46.getValue(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(pieDataset53);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1617");
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
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.DomainOrder domainOrder15 = xYIntervalSeriesCollection0.getDomainOrder();
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(domainOrder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(domainOrder15);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1618");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(xYDataset0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1619");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.general.DatasetGroup datasetGroup2 = xYIntervalSeriesCollection0.getGroup();
        boolean boolean3 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = xYIntervalSeriesCollection0.getYValue((int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1620");
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
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent25 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) false);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1621");
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
        org.jfree.data.Range range44 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, true);
        org.jfree.data.Range range46 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset22, false);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range46);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1622");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        int int4 = xYIntervalSeriesCollection0.getSeriesCount();
        boolean boolean5 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries10 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries10.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo13 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent14 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo13);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo15 = null;
        seriesChangeEvent14.setSummary(seriesChangeInfo15);
        java.lang.Object obj17 = seriesChangeEvent14.getSource();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo18 = null;
        seriesChangeEvent14.setSummary(seriesChangeInfo18);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo20 = seriesChangeEvent14.getSummary();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo21 = seriesChangeEvent14.getSummary();
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent14);
        int int23 = xYIntervalSeriesCollection0.getSeriesCount();
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + ' ' + "'", obj17, ' ');
        org.junit.Assert.assertNull(seriesChangeInfo20);
        org.junit.Assert.assertNull(seriesChangeInfo21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1623");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries3.setMaximumItemCount((int) (short) 1);
        boolean boolean6 = xYIntervalSeries3.getAllowDuplicateXValues();
        xYIntervalSeries3.setDescription("org.jfree.data.general.SeriesException: ");
        xYIntervalSeries3.add((double) 0L, 0.0d, (double) '#', (double) 1L, (double) 100L, (double) 0);
        java.lang.Object obj16 = xYIntervalSeries3.clone();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection17 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset19 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo20 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent21 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset19, datasetChangeInfo20);
        xYIntervalSeriesCollection17.notifyListeners(datasetChangeEvent21);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState23 = xYIntervalSeriesCollection17.getSelectionState();
        int int25 = xYIntervalSeriesCollection17.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener26 = null;
        xYIntervalSeriesCollection17.removeChangeListener(datasetChangeListener26);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries31 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries31.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo34 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent35 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo34);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo36 = null;
        seriesChangeEvent35.setSummary(seriesChangeInfo36);
        java.lang.Object obj38 = seriesChangeEvent35.getSource();
        xYIntervalSeriesCollection17.seriesChanged(seriesChangeEvent35);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener40 = null;
        xYIntervalSeriesCollection17.addChangeListener(datasetChangeListener40);
        org.jfree.data.Range range42 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection17);
        java.lang.Number number43 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection17);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState44 = null;
        xYIntervalSeriesCollection17.setSelectionState(xYDatasetSelectionState44);
        xYIntervalSeries3.removeChangeListener((org.jfree.data.event.SeriesChangeListener) xYIntervalSeriesCollection17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(xYDatasetSelectionState23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + ' ' + "'", obj38, ' ');
        org.junit.Assert.assertNull(range42);
        org.junit.Assert.assertNull(number43);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1624");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection10 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder11 = xYIntervalSeriesCollection10.getDomainOrder();
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem19 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int21 = xYIntervalDataItem19.compareTo((java.lang.Object) 1.0f);
        double double22 = xYIntervalDataItem19.getXHighValue();
        org.jfree.data.Range range23 = null;
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range23, (double) 100);
        double double27 = range25.constrain((double) '4');
        boolean boolean28 = xYIntervalDataItem19.equals((java.lang.Object) '4');
        org.jfree.data.Range range29 = null;
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range29, (double) 100);
        double double33 = range31.constrain((double) '4');
        int int34 = xYIntervalDataItem19.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray56 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray57 = new java.lang.Number[][] { numberArray41, numberArray44, numberArray47, numberArray50, numberArray53, numberArray56 };
        org.jfree.data.category.CategoryDataset categoryDataset58 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray57);
        org.jfree.data.category.CategoryDataset categoryDataset59 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray57);
        int int60 = xYIntervalDataItem19.compareTo((java.lang.Object) categoryDataset59);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener61 = null;
        categoryDataset59.removeChangeListener(datasetChangeListener61);
        org.jfree.data.general.DatasetGroup datasetGroup63 = categoryDataset59.getGroup();
        xYIntervalSeriesCollection10.setGroup(datasetGroup63);
        java.lang.String str65 = datasetGroup63.getID();
        xYIntervalSeriesCollection0.setGroup(datasetGroup63);
        org.jfree.data.general.DatasetGroup datasetGroup68 = new org.jfree.data.general.DatasetGroup("Range[-0.0,0.0]");
        xYIntervalSeriesCollection0.setGroup(datasetGroup68);
        // The following exception was thrown during execution in test generation
        try {
            double double72 = xYIntervalSeriesCollection0.getEndXValue((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertNotNull(domainOrder11);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(numberArray41);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertNotNull(numberArray50);
        org.junit.Assert.assertNotNull(numberArray53);
        org.junit.Assert.assertNotNull(numberArray56);
        org.junit.Assert.assertNotNull(numberArray57);
        org.junit.Assert.assertNotNull(categoryDataset58);
        org.junit.Assert.assertNotNull(categoryDataset59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(datasetGroup63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "NOID" + "'", str65, "NOID");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1625");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries3.setMaximumItemCount((int) (short) 1);
        boolean boolean6 = xYIntervalSeries3.getAllowDuplicateXValues();
        xYIntervalSeries3.setDescription("org.jfree.data.general.SeriesException: ");
        java.lang.Object obj9 = null;
        boolean boolean10 = xYIntervalSeries3.equals(obj9);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection12 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset14 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo15 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent16 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset14, datasetChangeInfo15);
        xYIntervalSeriesCollection12.notifyListeners(datasetChangeEvent16);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState18 = xYIntervalSeriesCollection12.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener19 = null;
        xYIntervalSeriesCollection12.removeChangeListener(datasetChangeListener19);
        org.jfree.data.DomainOrder domainOrder21 = xYIntervalSeriesCollection12.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries25 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean26 = xYIntervalSeries25.getNotify();
        int int27 = xYIntervalSeries25.getItemCount();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo28 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent29 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) xYIntervalSeries25, seriesChangeInfo28);
        boolean boolean30 = xYIntervalSeries25.getAutoSort();
        java.lang.Number[] numberArray35 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray51 = new java.lang.Number[][] { numberArray35, numberArray38, numberArray41, numberArray44, numberArray47, numberArray50 };
        org.jfree.data.category.CategoryDataset categoryDataset52 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray51);
        boolean boolean53 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset52);
        java.lang.Number number54 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset52);
        java.util.List list55 = categoryDataset52.getColumnKeys();
        boolean boolean56 = xYIntervalSeries25.equals((java.lang.Object) list55);
        xYIntervalSeries3.firePropertyChange("org.jfree.data.general.SeriesException: ", (java.lang.Object) domainOrder21, (java.lang.Object) xYIntervalSeries25);
        // The following exception was thrown during execution in test generation
        try {
            double double59 = xYIntervalSeries3.getYValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(xYDatasetSelectionState18);
        org.junit.Assert.assertNotNull(domainOrder21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberArray41);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertNotNull(numberArray50);
        org.junit.Assert.assertNotNull(numberArray51);
        org.junit.Assert.assertNotNull(categoryDataset52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + number54 + "' != '" + (-1.0d) + "'", number54, (-1.0d));
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1626");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries3.setMaximumItemCount((int) ' ');
        xYIntervalSeries3.setDescription("");
        boolean boolean8 = xYIntervalSeries3.isEmpty();
        int int9 = xYIntervalSeries3.getItemCount();
        xYIntervalSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection12 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection12, true);
        java.lang.Object obj15 = xYIntervalSeriesCollection12.clone();
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray36 = new java.lang.Number[][] { numberArray20, numberArray23, numberArray26, numberArray29, numberArray32, numberArray35 };
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray36);
        java.util.List list38 = categoryDataset37.getRowKeys();
        org.jfree.data.Range range40 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset37, false);
        int int42 = categoryDataset37.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean43 = xYIntervalSeriesCollection12.equals((java.lang.Object) categoryDataset37);
        org.jfree.data.Range range45 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection12, true);
        java.lang.Number number46 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection12);
        org.jfree.data.DomainOrder domainOrder47 = xYIntervalSeriesCollection12.getDomainOrder();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries51 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries51.setMaximumItemCount((int) ' ');
        xYIntervalSeries51.setDescription("");
        xYIntervalSeries3.firePropertyChange("Range[-0.0,0.0]", (java.lang.Object) xYIntervalSeriesCollection12, (java.lang.Object) xYIntervalSeries51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number59 = xYIntervalSeriesCollection12.getY((int) (byte) 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(categoryDataset37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(range45);
        org.junit.Assert.assertNull(number46);
        org.junit.Assert.assertNotNull(domainOrder47);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1627");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = xYIntervalSeriesCollection0.getGroup();
        org.jfree.data.Range range8 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection9 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset11 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo12 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent13 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset11, datasetChangeInfo12);
        xYIntervalSeriesCollection9.notifyListeners(datasetChangeEvent13);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState15 = xYIntervalSeriesCollection9.getSelectionState();
        int int17 = xYIntervalSeriesCollection9.indexOf((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState18 = null;
        xYIntervalSeriesCollection9.setSelectionState(xYDatasetSelectionState18);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem26 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int28 = xYIntervalDataItem26.compareTo((java.lang.Object) 1.0f);
        double double29 = xYIntervalDataItem26.getXHighValue();
        java.lang.Object obj30 = xYIntervalDataItem26.clone();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo31 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent32 = new org.jfree.data.event.SeriesChangeEvent(obj30, seriesChangeInfo31);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo33 = seriesChangeEvent32.getSummary();
        xYIntervalSeriesCollection9.seriesChanged(seriesChangeEvent32);
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent32);
        org.jfree.data.general.DatasetGroup datasetGroup36 = xYIntervalSeriesCollection0.getGroup();
        org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertNull(xYDatasetSelectionState15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(seriesChangeInfo33);
        org.junit.Assert.assertNotNull(datasetGroup36);
        org.junit.Assert.assertNull(range38);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1628");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        int int2 = xYIntervalSeriesCollection0.getSeriesCount();
        java.lang.Number number3 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Number number4 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Number number5 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYIntervalSeriesCollection0.getStartY(10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(number3);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertNull(number5);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1629");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo4 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent5 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) xYIntervalSeriesCollection0, seriesChangeInfo4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(number6);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1630");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem14 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int16 = xYIntervalDataItem14.compareTo((java.lang.Object) 1.0f);
        double double17 = xYIntervalDataItem14.getXHighValue();
        org.jfree.data.Range range18 = null;
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range18, (double) 100);
        double double22 = range20.constrain((double) '4');
        boolean boolean23 = xYIntervalDataItem14.equals((java.lang.Object) '4');
        org.jfree.data.Range range24 = null;
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range24, (double) 100);
        double double28 = range26.constrain((double) '4');
        int int29 = xYIntervalDataItem14.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray52 = new java.lang.Number[][] { numberArray36, numberArray39, numberArray42, numberArray45, numberArray48, numberArray51 };
        org.jfree.data.category.CategoryDataset categoryDataset53 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray52);
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray52);
        int int55 = xYIntervalDataItem14.compareTo((java.lang.Object) categoryDataset54);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener56 = null;
        categoryDataset54.removeChangeListener(datasetChangeListener56);
        org.jfree.data.general.DatasetGroup datasetGroup58 = categoryDataset54.getGroup();
        xYIntervalSeriesCollection0.setGroup(datasetGroup58);
        org.jfree.data.Range range60 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberArray51);
        org.junit.Assert.assertNotNull(numberArray52);
        org.junit.Assert.assertNotNull(categoryDataset53);
        org.junit.Assert.assertNotNull(categoryDataset54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(datasetGroup58);
        org.junit.Assert.assertNull(range60);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1631");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        int int4 = xYIntervalSeriesCollection0.getSeriesCount();
        int int6 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = xYIntervalSeriesCollection0.getEndXValue(0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1632");
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
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset21, false);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (-1.0d) + "'", number26, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(pieDataset29);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1633");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj5 = null;
        xYIntervalSeries3.firePropertyChange("", obj5, (java.lang.Object) "hi!");
        java.lang.Comparable comparable8 = xYIntervalSeries3.getKey();
        int int9 = xYIntervalSeries3.getItemCount();
        xYIntervalSeries3.setNotify(true);
        int int12 = xYIntervalSeries3.getItemCount();
        xYIntervalSeries3.add((double) (short) 100, (double) ' ', (-1.0d), 192.0d, (double) (short) 100, (double) 100L);
        java.lang.Number[] numberArray24 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray30 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray40 = new java.lang.Number[][] { numberArray24, numberArray27, numberArray30, numberArray33, numberArray36, numberArray39 };
        org.jfree.data.category.CategoryDataset categoryDataset41 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray40);
        org.jfree.data.Range range43 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset41, true);
        org.jfree.data.general.DatasetGroup datasetGroup44 = categoryDataset41.getGroup();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener45 = null;
        categoryDataset41.removeChangeListener(datasetChangeListener45);
        boolean boolean47 = xYIntervalSeries3.equals((java.lang.Object) datasetChangeListener45);
        int int48 = xYIntervalSeries3.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10 + "'", comparable8, 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(categoryDataset41);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(datasetGroup44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1634");
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
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj14 = xYIntervalSeriesCollection0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = xYIntervalSeriesCollection0.getEndX(32, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1635");
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
        org.jfree.data.Range range49 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset46);
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset46, false);
        int int53 = categoryDataset46.getColumnIndex((java.lang.Comparable) 1.0d);
        java.lang.Number number54 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset46);
        java.lang.Number number55 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(datasetGroup48);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertEquals("'" + number54 + "' != '" + 192.0d + "'", number54, 192.0d);
        org.junit.Assert.assertEquals("'" + number55 + "' != '" + 32.0d + "'", number55, 32.0d);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1636");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries3.setMaximumItemCount((int) ' ');
        int int6 = xYIntervalSeries3.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYIntervalSeries3.removePropertyChangeListener(propertyChangeListener7);
        int int9 = xYIntervalSeries3.getMaximumItemCount();
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
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection36 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset38 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo39 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent40 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset38, datasetChangeInfo39);
        xYIntervalSeriesCollection36.notifyListeners(datasetChangeEvent40);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState42 = xYIntervalSeriesCollection36.getSelectionState();
        org.jfree.data.Range range43 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection36);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection44 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder45 = xYIntervalSeriesCollection44.getDomainOrder();
        int int46 = xYIntervalSeriesCollection44.getSeriesCount();
        boolean boolean47 = xYIntervalSeriesCollection36.hasListener((java.util.EventListener) xYIntervalSeriesCollection44);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo48 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent49 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) list35, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection44, datasetChangeInfo48);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState50 = xYIntervalSeriesCollection44.getSelectionState();
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection44);
        org.jfree.data.Range range53 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection44, true);
        org.jfree.data.Range range54 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection44);
        xYIntervalSeries3.removeChangeListener((org.jfree.data.event.SeriesChangeListener) xYIntervalSeriesCollection44);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNull(xYDatasetSelectionState42);
        org.junit.Assert.assertNull(range43);
        org.junit.Assert.assertNotNull(domainOrder45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(xYDatasetSelectionState50);
        org.junit.Assert.assertNull(range51);
        org.junit.Assert.assertNull(range53);
        org.junit.Assert.assertNull(range54);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1637");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, 15.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1638");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number10);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1639");
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
        java.lang.Number number21 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = xYIntervalSeriesCollection0.getEndY(4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(domainOrder18);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNull(number21);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1640");
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
        xYIntervalSeriesCollection0.removeAllSeries();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable27 = xYIntervalSeriesCollection0.getSeriesKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + ' ' + "'", obj21, ' ');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(number24);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1641");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (-1L), 31.0d, (-1.0d), (-1) };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (-1L), 31.0d, (-1.0d), (-1) };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (-1L), 31.0d, (-1.0d), (-1) };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (-1L), 31.0d, (-1.0d), (-1) };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (-1L), 31.0d, (-1.0d), (-1) };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (-1L), 31.0d, (-1.0d), (-1) };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "2", numberArray32);
        int int34 = categoryDataset33.getColumnCount();
        int int35 = categoryDataset33.getRowCount();
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(categoryDataset33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6 + "'", int35 == 6);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1642");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray13, numberArray16, numberArray19, numberArray22, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("NOID", "org.jfree.data.event.DatasetChangeEvent[source=-1]", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[-6.0,192.0]", "org.jfree.data.event.SeriesChangeEvent[source=class org.jfree.data.xy.XYIntervalSeries]", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("org.jfree.data.event.SeriesChangeEvent[source=100]", "Range[46.0,244.0]", numberArray26);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(categoryDataset30);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1643");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        xYIntervalSeriesCollection0.removeAllSeries();
        int int4 = xYIntervalSeriesCollection0.getSeriesCount();
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1644");
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
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState30 = xYIntervalSeriesCollection15.getSelectionState();
        // The following exception was thrown during execution in test generation
        try {
            double double33 = xYIntervalSeriesCollection15.getStartYValue((int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(xYDatasetSelectionState21);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertNull(number28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(xYDatasetSelectionState30);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1645");
        org.jfree.data.xy.XYInterval xYInterval5 = new org.jfree.data.xy.XYInterval((double) 100L, (double) 10L, (double) (-1.0f), (double) 100L, 0.0d);
        double double6 = xYInterval5.getXHigh();
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
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset28);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset28);
        java.util.List list34 = categoryDataset28.getColumnKeys();
        boolean boolean35 = xYInterval5.equals((java.lang.Object) list34);
        double double36 = xYInterval5.getYLow();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + (-1.0d) + "'", number32, (-1.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1646");
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
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(range31);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1647");
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
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 2);
        java.lang.Number number30 = pieDataset28.getValue(0);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(pieDataset28);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + (short) -1 + "'", number30, (short) -1);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1648");
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
        org.jfree.data.event.DatasetChangeListener datasetChangeListener23 = null;
        xYIntervalSeriesCollection0.addChangeListener(datasetChangeListener23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + ' ' + "'", obj21, ' ');
        org.junit.Assert.assertNull(number25);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1649");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection0.getSelectionState();
        int int10 = xYIntervalSeriesCollection0.getSeriesCount();
        java.lang.Number number11 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        int int12 = xYIntervalSeriesCollection0.getSeriesCount();
        java.lang.Comparable comparable13 = null;
        int int14 = xYIntervalSeriesCollection0.indexOf(comparable13);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1650");
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
        org.jfree.data.event.DatasetChangeListener datasetChangeListener23 = null;
        xYIntervalSeriesCollection0.addChangeListener(datasetChangeListener23);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj26 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState27 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.general.Dataset dataset32 = datasetChangeEvent31.getDataset();
        org.jfree.data.general.Dataset dataset33 = datasetChangeEvent31.getDataset();
        org.jfree.data.general.Dataset dataset34 = datasetChangeEvent31.getDataset();
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent31);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + ' ' + "'", obj21, ' ');
        org.junit.Assert.assertNull(range25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(xYDatasetSelectionState27);
        org.junit.Assert.assertNull(dataset32);
        org.junit.Assert.assertNull(dataset33);
        org.junit.Assert.assertNull(dataset34);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1651");
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
        org.jfree.data.ComparableObjectSeries comparableObjectSeries51 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) false);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(domainOrder45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1652");
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
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(xYDatasetSelectionState21);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertNull(number28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(range30);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1653");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = xYIntervalSeriesCollection0.getEndX(0, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertNull(range16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1654");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        double[][] doubleArray7 = new double[][] { doubleArray2, doubleArray3, doubleArray4, doubleArray5, doubleArray6 };
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.general.SeriesException: org.jfree.data.general.SeriesException: hi!1", doubleArray7);
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
        org.jfree.data.pie.PieDataset pieDataset56 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset8, (java.lang.Comparable) comparableObjectItem55);
        org.jfree.data.Range range57 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(categoryDataset8);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(domainOrder54);
        org.junit.Assert.assertNotNull(pieDataset56);
        org.junit.Assert.assertNull(range57);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1655");
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
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, 67.0d, 0.0d);
        double double34 = range33.getCentralValue();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-4356.0d) + "'", double34 == (-4356.0d));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1656");
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
        org.jfree.data.Range range57 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range58 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(domainOrder54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(range57);
        org.junit.Assert.assertNull(range58);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1657");
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
        java.util.List list48 = categoryDataset46.getColumnKeys();
        org.jfree.data.Range range50 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset46, (double) 1L);
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset46);
        java.lang.Number number52 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset46);
        java.lang.Comparable comparable54 = categoryDataset46.getColumnKey(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertEquals("'" + number52 + "' != '" + (-1.0d) + "'", number52, (-1.0d));
        org.junit.Assert.assertEquals("'" + comparable54 + "' != '" + "hi!1" + "'", comparable54, "hi!1");
    }
}
