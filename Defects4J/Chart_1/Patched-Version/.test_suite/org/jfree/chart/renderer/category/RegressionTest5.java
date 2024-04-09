package org.jfree.chart.renderer.category;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        int int5 = defaultCategoryDataset0.getColumnCount();
        java.util.List list6 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.setValue((double) ' ', (java.lang.Comparable) "AxisLocation.BOTTOM_OR_RIGHT", (java.lang.Comparable) 104.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.removeRow((java.lang.Comparable) "ItemLabelAnchor.INSIDE10");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (ItemLabelAnchor.INSIDE10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        java.awt.Stroke stroke11 = lineAndShapeRenderer7.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float15 = categoryAxis14.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = lineAndShapeRenderer19.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis14, valueAxis16, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer19);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = categoryPlot26.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis29 = lineAndShapeRenderer7.getRangeAxis(categoryPlot26, (int) '4');
        double double30 = categoryPlot26.getRangeCrosshairValue();
        java.awt.Paint paint31 = categoryPlot26.getRangeZeroBaselinePaint();
        int int32 = categoryPlot26.getRangeAxisCount();
        categoryPlot26.setForegroundAlpha((float) 3);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer37 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = null;
        lineAndShapeRenderer37.setBaseURLGenerator(categoryURLGenerator38);
        java.awt.Shape shape41 = lineAndShapeRenderer37.getLegendShape(0);
        lineAndShapeRenderer37.setAutoPopulateSeriesStroke(false);
        java.awt.Font font45 = lineAndShapeRenderer37.getSeriesItemLabelFont(0);
        lineAndShapeRenderer37.setUseSeriesOffset(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator48 = null;
        lineAndShapeRenderer37.setBaseToolTipGenerator(categoryToolTipGenerator48);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer53 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color54 = java.awt.Color.BLUE;
        lineAndShapeRenderer53.setBaseItemLabelPaint((java.awt.Paint) color54);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator59 = lineAndShapeRenderer53.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator60 = null;
        lineAndShapeRenderer53.setLegendItemURLGenerator(categorySeriesLabelGenerator60);
        java.awt.Paint paint63 = lineAndShapeRenderer53.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes64 = lineAndShapeRenderer53.getSelectedItemAttributes();
        java.awt.Paint paint65 = renderAttributes64.getDefaultLabelPaint();
        java.awt.Shape shape67 = renderAttributes64.getSeriesShape((-1));
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer70 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator71 = null;
        lineAndShapeRenderer70.setBaseURLGenerator(categoryURLGenerator71);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator74 = null;
        lineAndShapeRenderer70.setSeriesToolTipGenerator(10, categoryToolTipGenerator74);
        boolean boolean76 = lineAndShapeRenderer70.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke78 = null;
        lineAndShapeRenderer70.setSeriesStroke((int) 'a', stroke78, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor82 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color83 = java.awt.Color.yellow;
        boolean boolean84 = itemLabelAnchor82.equals((java.lang.Object) color83);
        lineAndShapeRenderer70.setSeriesFillPaint((int) ' ', (java.awt.Paint) color83);
        renderAttributes64.setDefaultOutlinePaint((java.awt.Paint) color83);
        lineAndShapeRenderer37.setSeriesFillPaint(2, (java.awt.Paint) color83);
        categoryPlot26.setRangeZeroBaselinePaint((java.awt.Paint) color83);
        boolean boolean89 = lineAndShapeRenderer2.equals((java.lang.Object) categoryPlot26);
        int int90 = lineAndShapeRenderer2.getDefaultEntityRadius();
        java.awt.Stroke stroke91 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertNotNull(categoryItemRenderer27);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(shape41);
        org.junit.Assert.assertNull(font45);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNull(categoryItemLabelGenerator59);
        org.junit.Assert.assertNull(paint63);
        org.junit.Assert.assertNotNull(renderAttributes64);
        org.junit.Assert.assertNull(paint65);
        org.junit.Assert.assertNull(shape67);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(itemLabelAnchor82);
        org.junit.Assert.assertNotNull(color83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 3 + "'", int90 == 3);
        org.junit.Assert.assertNotNull(stroke91);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double2 = categoryAxis1.getFixedDimension();
        org.jfree.chart.plot.Plot plot3 = categoryAxis1.getPlot();
        java.lang.String str4 = categoryAxis1.getLabel();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 10);
        org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color12 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem8.setLinePaint((java.awt.Paint) color12);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color17 = java.awt.Color.BLUE;
        lineAndShapeRenderer16.setBaseItemLabelPaint((java.awt.Paint) color17);
        java.awt.Shape shape19 = lineAndShapeRenderer16.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity21 = new org.jfree.chart.entity.ChartEntity(shape19, "");
        legendItem8.setLine(shape19);
        java.awt.Shape shape23 = legendItem8.getShape();
        java.lang.String str24 = legendItem8.getLabel();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean29 = lineAndShapeRenderer27.isSeriesVisibleInLegend(1);
        java.awt.Font font30 = lineAndShapeRenderer27.getBaseItemLabelFont();
        legendItem8.setLabelFont(font30);
        categoryAxis1.setLabelFont(font30);
        categoryAxis1.addCategoryLabelToolTip((java.lang.Comparable) "TextAnchor.BOTTOM_CENTER", "ItemLabelAnchor.INSIDE7");
        float float36 = categoryAxis1.getMaximumCategoryLabelWidthRatio();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(plot3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(5, (java.lang.Boolean) false);
        boolean boolean15 = lineAndShapeRenderer2.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = barRenderer0.getPositiveItemLabelPositionFallback();
        barRenderer0.setMinimumBarLength(0.0d);
        boolean boolean7 = barRenderer0.isSeriesItemLabelsVisible(8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertNull(itemLabelPosition3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        java.awt.Paint paint26 = categoryPlot21.getRangeZeroBaselinePaint();
        categoryPlot21.mapDatasetToDomainAxis((int) (byte) 1, (int) (short) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double32 = rectangleInsets30.calculateBottomInset(0.0d);
        categoryPlot21.setAxisOffset(rectangleInsets30);
        categoryPlot21.setDomainCrosshairColumnKey((java.lang.Comparable) 2.0d, false);
        categoryPlot21.clearDomainMarkers(0);
        boolean boolean39 = categoryPlot21.isRangeMinorGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float44 = categoryAxis43.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer48 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color49 = java.awt.Color.BLUE;
        lineAndShapeRenderer48.setBaseItemLabelPaint((java.awt.Paint) color49);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator54 = lineAndShapeRenderer48.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot55 = new org.jfree.chart.plot.CategoryPlot(categoryDataset41, categoryAxis43, valueAxis45, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer48);
        org.jfree.chart.axis.CategoryAxis categoryAxis56 = categoryPlot55.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        org.jfree.data.Range range58 = categoryPlot55.getDataRange(valueAxis57);
        org.jfree.chart.axis.AxisLocation axisLocation59 = categoryPlot55.getRangeAxisLocation();
        categoryPlot55.clearRangeMarkers(0);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset62 = new org.jfree.data.category.DefaultCategoryDataset();
        int int64 = defaultCategoryDataset62.getColumnIndex((java.lang.Comparable) 3.0d);
        int int66 = defaultCategoryDataset62.getRowIndex((java.lang.Comparable) (byte) 10);
        defaultCategoryDataset62.clearSelection();
        int int68 = categoryPlot55.indexOf((org.jfree.data.category.CategoryDataset) defaultCategoryDataset62);
        defaultCategoryDataset62.validateObject();
        defaultCategoryDataset62.clear();
        java.util.List list71 = defaultCategoryDataset62.getRowKeys();
        categoryPlot21.setDataset((int) ' ', (org.jfree.data.category.CategoryDataset) defaultCategoryDataset62);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable74 = defaultCategoryDataset62.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 3.0d + "'", double32 == 3.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNull(categoryItemLabelGenerator54);
        org.junit.Assert.assertNotNull(categoryAxis56);
        org.junit.Assert.assertNull(range58);
        org.junit.Assert.assertNotNull(axisLocation59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(list71);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        java.awt.Paint paint26 = categoryPlot21.getRangeZeroBaselinePaint();
        categoryPlot21.setDomainGridlinesVisible(false);
        categoryPlot21.setDomainGridlinesVisible(true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        boolean boolean3 = legendItem1.isShapeFilled();
        java.lang.String str4 = legendItem1.getDescription();
        boolean boolean5 = legendItem1.isShapeFilled();
        java.awt.Shape shape6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        legendItem1.setShape(shape6);
        boolean boolean8 = legendItem1.isLineVisible();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType0 = org.jfree.chart.util.GradientPaintTransformType.HORIZONTAL;
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer1 = new org.jfree.chart.util.StandardGradientPaintTransformer(gradientPaintTransformType0);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        java.awt.Stroke stroke8 = lineAndShapeRenderer4.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float12 = categoryAxis11.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color17 = java.awt.Color.BLUE;
        lineAndShapeRenderer16.setBaseItemLabelPaint((java.awt.Paint) color17);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = lineAndShapeRenderer16.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis11, valueAxis13, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer16);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot23.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis26 = lineAndShapeRenderer4.getRangeAxis(categoryPlot23, (int) '4');
        boolean boolean27 = categoryPlot23.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder28 = categoryPlot23.getDatasetRenderingOrder();
        org.jfree.chart.plot.Marker marker30 = null;
        org.jfree.chart.util.Layer layer31 = null;
        boolean boolean33 = categoryPlot23.removeDomainMarker((int) (short) 0, marker30, layer31, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer36 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color37 = java.awt.Color.BLUE;
        lineAndShapeRenderer36.setBaseItemLabelPaint((java.awt.Paint) color37);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator42 = lineAndShapeRenderer36.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = lineAndShapeRenderer36.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean45 = lineAndShapeRenderer36.getBaseItemLabelsVisible();
        org.jfree.chart.LegendItem legendItem47 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color51 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem47.setLinePaint((java.awt.Paint) color51);
        lineAndShapeRenderer36.setBaseItemLabelPaint((java.awt.Paint) color51);
        java.awt.color.ColorSpace colorSpace54 = color51.getColorSpace();
        categoryPlot23.setRangeGridlinePaint((java.awt.Paint) color51);
        boolean boolean56 = gradientPaintTransformType0.equals((java.lang.Object) categoryPlot23);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder57 = categoryPlot23.getDatasetRenderingOrder();
        org.junit.Assert.assertNotNull(gradientPaintTransformType0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertNotNull(categoryItemRenderer24);
        org.junit.Assert.assertNull(valueAxis26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNull(categoryItemLabelGenerator42);
        org.junit.Assert.assertNotNull(itemLabelPosition44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(colorSpace54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder57);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        boolean boolean7 = lineAndShapeRenderer2.getItemVisible((int) (byte) 100, 0);
        lineAndShapeRenderer2.setItemMargin((double) (short) 0);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color13 = java.awt.Color.BLUE;
        lineAndShapeRenderer12.setBaseItemLabelPaint((java.awt.Paint) color13);
        java.awt.Stroke stroke16 = lineAndShapeRenderer12.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float20 = categoryAxis19.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color25 = java.awt.Color.BLUE;
        lineAndShapeRenderer24.setBaseItemLabelPaint((java.awt.Paint) color25);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator30 = lineAndShapeRenderer24.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis19, valueAxis21, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer24);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer32 = categoryPlot31.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis34 = lineAndShapeRenderer12.getRangeAxis(categoryPlot31, (int) '4');
        boolean boolean35 = categoryPlot31.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder36 = categoryPlot31.getDatasetRenderingOrder();
        org.jfree.chart.plot.Marker marker38 = null;
        org.jfree.chart.util.Layer layer39 = null;
        boolean boolean41 = categoryPlot31.removeDomainMarker((int) (short) 0, marker38, layer39, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer44 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color45 = java.awt.Color.BLUE;
        lineAndShapeRenderer44.setBaseItemLabelPaint((java.awt.Paint) color45);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator50 = lineAndShapeRenderer44.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition52 = lineAndShapeRenderer44.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean53 = lineAndShapeRenderer44.getBaseItemLabelsVisible();
        org.jfree.chart.LegendItem legendItem55 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color59 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem55.setLinePaint((java.awt.Paint) color59);
        lineAndShapeRenderer44.setBaseItemLabelPaint((java.awt.Paint) color59);
        java.awt.color.ColorSpace colorSpace62 = color59.getColorSpace();
        categoryPlot31.setRangeGridlinePaint((java.awt.Paint) color59);
        int int64 = color59.getTransparency();
        lineAndShapeRenderer2.setBaseFillPaint((java.awt.Paint) color59);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setItemMargin((double) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires 0.0 <= margin < 1.0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNull(categoryItemLabelGenerator30);
        org.junit.Assert.assertNotNull(categoryItemRenderer32);
        org.junit.Assert.assertNull(valueAxis34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNull(categoryItemLabelGenerator50);
        org.junit.Assert.assertNotNull(itemLabelPosition52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(colorSpace62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean15 = categoryAxis2.isVisible();
        java.awt.Paint paint16 = categoryAxis2.getTickMarkPaint();
        java.lang.Object obj17 = categoryAxis2.clone();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getSeriesStroke((int) (byte) 0);
        boolean boolean18 = lineAndShapeRenderer2.getItemVisible((int) (short) -1, 0);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getItemOutlineStroke((int) (byte) 100, (int) (short) -1, false);
        lineAndShapeRenderer2.setSeriesLinesVisible(0, false);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float22 = categoryAxis21.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color27 = java.awt.Color.BLUE;
        lineAndShapeRenderer26.setBaseItemLabelPaint((java.awt.Paint) color27);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator32 = lineAndShapeRenderer26.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis21, valueAxis23, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer26);
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = categoryPlot33.getDomainAxis();
        org.jfree.chart.event.PlotChangeListener plotChangeListener35 = null;
        categoryPlot33.addChangeListener(plotChangeListener35);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor37 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color38 = java.awt.Color.yellow;
        boolean boolean39 = itemLabelAnchor37.equals((java.lang.Object) color38);
        categoryPlot33.setRangeZeroBaselinePaint((java.awt.Paint) color38);
        lineAndShapeRenderer2.setBaseOutlinePaint((java.awt.Paint) color38);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNull(categoryItemLabelGenerator32);
        org.junit.Assert.assertNotNull(categoryAxis34);
        org.junit.Assert.assertNotNull(itemLabelAnchor37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Font font14 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font14, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = lineAndShapeRenderer19.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = lineAndShapeRenderer19.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean28 = lineAndShapeRenderer19.getBaseItemLabelsVisible();
        org.jfree.chart.LegendItem legendItem30 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color34 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem30.setLinePaint((java.awt.Paint) color34);
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color34);
        java.awt.Paint paint40 = lineAndShapeRenderer19.getItemLabelPaint((int) '#', (int) (byte) 1, true);
        lineAndShapeRenderer2.setBaseItemLabelPaint(paint40);
        java.awt.Shape shape42 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis45 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float46 = categoryAxis45.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer50 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color51 = java.awt.Color.BLUE;
        lineAndShapeRenderer50.setBaseItemLabelPaint((java.awt.Paint) color51);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator56 = lineAndShapeRenderer50.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot57 = new org.jfree.chart.plot.CategoryPlot(categoryDataset43, categoryAxis45, valueAxis47, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer50);
        org.jfree.chart.axis.CategoryAxis categoryAxis58 = categoryPlot57.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.data.Range range60 = categoryPlot57.getDataRange(valueAxis59);
        org.jfree.chart.axis.AxisLocation axisLocation61 = categoryPlot57.getRangeAxisLocation();
        org.jfree.chart.util.RectangleEdge rectangleEdge62 = categoryPlot57.getDomainAxisEdge();
        org.jfree.chart.entity.PlotEntity plotEntity64 = new org.jfree.chart.entity.PlotEntity(shape42, (org.jfree.chart.plot.Plot) categoryPlot57, "{0}");
        java.lang.Object obj65 = plotEntity64.clone();
        plotEntity64.setURLText("NOID");
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.0f + "'", float46 == 0.0f);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNull(categoryItemLabelGenerator56);
        org.junit.Assert.assertNotNull(categoryAxis58);
        org.junit.Assert.assertNull(range60);
        org.junit.Assert.assertNotNull(axisLocation61);
        org.junit.Assert.assertNotNull(rectangleEdge62);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertEquals(obj65.toString(), "PlotEntity: tooltip = {0}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj65), "PlotEntity: tooltip = {0}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj65), "PlotEntity: tooltip = {0}");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        double double25 = categoryPlot21.getRangeCrosshairValue();
        java.awt.Paint paint26 = categoryPlot21.getRangeZeroBaselinePaint();
        int int27 = categoryPlot21.getRangeAxisCount();
        java.awt.Color color28 = java.awt.Color.BLUE;
        categoryPlot21.setRangeMinorGridlinePaint((java.awt.Paint) color28);
        java.awt.Stroke stroke30 = categoryPlot21.getRangeMinorGridlineStroke();
        categoryPlot21.clearRangeMarkers();
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent32 = null;
        categoryPlot21.annotationChanged(annotationChangeEvent32);
        org.jfree.chart.util.SortOrder sortOrder34 = categoryPlot21.getRowRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace35 = categoryPlot21.getFixedRangeAxisSpace();
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = categoryPlot21.getDomainAxisForDataset((int) (short) 100);
        float float38 = categoryAxis37.getTickMarkOutsideLength();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(sortOrder34);
        org.junit.Assert.assertNull(axisSpace35);
        org.junit.Assert.assertNotNull(categoryAxis37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 2.0f + "'", float38 == 2.0f);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        java.awt.Stroke stroke9 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder26 = categoryPlot21.getDatasetRenderingOrder();
        categoryPlot21.setBackgroundImageAlignment(3);
        java.awt.geom.GeneralPath generalPath29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        org.jfree.chart.RenderingSource renderingSource31 = null;
        categoryPlot21.select(generalPath29, rectangle2D30, renderingSource31);
        boolean boolean33 = categoryPlot21.canSelectByPoint();
        org.jfree.chart.plot.CategoryMarker categoryMarker34 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot21.addDomainMarker(categoryMarker34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("ItemLabelAnchor.OUTSIDE6");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        java.awt.Stroke stroke8 = lineAndShapeRenderer4.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float12 = categoryAxis11.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color17 = java.awt.Color.BLUE;
        lineAndShapeRenderer16.setBaseItemLabelPaint((java.awt.Paint) color17);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = lineAndShapeRenderer16.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis11, valueAxis13, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer16);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot23.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis26 = lineAndShapeRenderer4.getRangeAxis(categoryPlot23, (int) '4');
        double double27 = categoryPlot23.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis28 = categoryPlot23.getRangeAxis();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float32 = categoryAxis31.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer36 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color37 = java.awt.Color.BLUE;
        lineAndShapeRenderer36.setBaseItemLabelPaint((java.awt.Paint) color37);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator42 = lineAndShapeRenderer36.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot(categoryDataset29, categoryAxis31, valueAxis33, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer36);
        boolean boolean44 = categoryPlot43.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis46 = categoryPlot43.getRangeAxisForDataset((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation48 = categoryPlot43.getRangeAxisLocation((int) '4');
        boolean boolean49 = categoryPlot43.canSelectByRegion();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer52 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color53 = java.awt.Color.BLUE;
        lineAndShapeRenderer52.setBaseItemLabelPaint((java.awt.Paint) color53);
        java.awt.Stroke stroke56 = lineAndShapeRenderer52.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis59 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float60 = categoryAxis59.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer64 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color65 = java.awt.Color.BLUE;
        lineAndShapeRenderer64.setBaseItemLabelPaint((java.awt.Paint) color65);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator70 = lineAndShapeRenderer64.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot71 = new org.jfree.chart.plot.CategoryPlot(categoryDataset57, categoryAxis59, valueAxis61, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer64);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer72 = categoryPlot71.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis74 = lineAndShapeRenderer52.getRangeAxis(categoryPlot71, (int) '4');
        boolean boolean75 = categoryPlot71.isRangeCrosshairVisible();
        java.awt.Paint paint76 = categoryPlot71.getRangeZeroBaselinePaint();
        categoryPlot71.mapDatasetToDomainAxis((int) (byte) 1, (int) (short) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets80 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double82 = rectangleInsets80.calculateBottomInset(0.0d);
        categoryPlot71.setAxisOffset(rectangleInsets80);
        categoryPlot43.setInsets(rectangleInsets80, true);
        double double87 = rectangleInsets80.extendWidth((double) 8);
        categoryPlot23.setAxisOffset(rectangleInsets80);
        boolean boolean89 = standardCategorySeriesLabelGenerator1.equals((java.lang.Object) rectangleInsets80);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertNotNull(categoryItemRenderer24);
        org.junit.Assert.assertNull(valueAxis26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNull(categoryItemLabelGenerator42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(valueAxis46);
        org.junit.Assert.assertNotNull(axisLocation48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNull(stroke56);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNull(categoryItemLabelGenerator70);
        org.junit.Assert.assertNotNull(categoryItemRenderer72);
        org.junit.Assert.assertNull(valueAxis74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(paint76);
        org.junit.Assert.assertNotNull(rectangleInsets80);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 3.0d + "'", double82 == 3.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 14.0d + "'", double87 == 14.0d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float7 = categoryAxis6.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color12 = java.awt.Color.BLUE;
        lineAndShapeRenderer11.setBaseItemLabelPaint((java.awt.Paint) color12);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = lineAndShapeRenderer11.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset4, categoryAxis6, valueAxis8, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer11);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot18.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.data.Range range21 = categoryPlot18.getDataRange(valueAxis20);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.plot.Marker marker23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        lineAndShapeRenderer2.drawRangeMarker(graphics2D3, categoryPlot18, valueAxis22, marker23, rectangle2D24);
        java.awt.Color color27 = java.awt.Color.GRAY;
        lineAndShapeRenderer2.setSeriesFillPaint(100, (java.awt.Paint) color27, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation30 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator17);
        org.junit.Assert.assertNotNull(categoryAxis19);
        org.junit.Assert.assertNull(range21);
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.awt.Shape shape4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        lineAndShapeRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        java.awt.Shape shape11 = lineAndShapeRenderer7.getLegendShape(0);
        lineAndShapeRenderer7.setAutoPopulateSeriesStroke(false);
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color18 = java.awt.Color.BLUE;
        lineAndShapeRenderer17.setBaseItemLabelPaint((java.awt.Paint) color18);
        java.awt.Stroke stroke21 = lineAndShapeRenderer17.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float25 = categoryAxis24.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color30 = java.awt.Color.BLUE;
        lineAndShapeRenderer29.setBaseItemLabelPaint((java.awt.Paint) color30);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator35 = lineAndShapeRenderer29.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis24, valueAxis26, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer29);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = categoryPlot36.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis39 = lineAndShapeRenderer17.getRangeAxis(categoryPlot36, (int) '4');
        boolean boolean40 = categoryPlot36.isRangeCrosshairVisible();
        java.awt.Paint paint41 = categoryPlot36.getRangeZeroBaselinePaint();
        categoryPlot36.mapDatasetToDomainAxis((int) (byte) 1, (int) (short) 10);
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.plot.Marker marker46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        lineAndShapeRenderer7.drawRangeMarker(graphics2D14, categoryPlot36, valueAxis45, marker46, rectangle2D47);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = lineAndShapeRenderer7.getBaseNegativeItemLabelPosition();
        java.awt.Color color51 = java.awt.Color.BLUE;
        int int52 = color51.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator56 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color51, (float) 1L, 10, (double) 0L);
        lineAndShapeRenderer7.setBaseOutlinePaint((java.awt.Paint) color51, true);
        java.awt.Shape shape60 = lineAndShapeRenderer7.getSeriesShape((int) (byte) 10);
        java.awt.Font font62 = lineAndShapeRenderer7.getSeriesItemLabelFont((int) (byte) 0);
        org.jfree.chart.axis.CategoryAxis categoryAxis65 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj66 = categoryAxis65.clone();
        java.awt.Font font67 = categoryAxis65.getTickLabelFont();
        java.awt.Paint paint68 = categoryAxis65.getLabelPaint();
        java.awt.Stroke stroke69 = categoryAxis65.getTickMarkStroke();
        lineAndShapeRenderer7.setSeriesOutlineStroke(192, stroke69, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer74 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean76 = lineAndShapeRenderer74.isSeriesVisibleInLegend(1);
        java.awt.Font font77 = lineAndShapeRenderer74.getBaseLegendTextFont();
        java.awt.Stroke stroke78 = lineAndShapeRenderer74.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator79 = null;
        lineAndShapeRenderer74.setBaseItemLabelGenerator(categoryItemLabelGenerator79, false);
        lineAndShapeRenderer74.setUseOutlinePaint(true);
        java.awt.Paint paint84 = lineAndShapeRenderer74.getBaseOutlinePaint();
        org.jfree.chart.LegendItem legendItem85 = new org.jfree.chart.LegendItem("rect", "hi!", "java.awt.Color[r=255,g=255,b=255]", "", shape4, stroke69, paint84);
        java.awt.Shape shape86 = legendItem85.getShape();
        java.awt.Font font87 = legendItem85.getLabelFont();
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNull(categoryItemLabelGenerator35);
        org.junit.Assert.assertNotNull(categoryItemRenderer37);
        org.junit.Assert.assertNull(valueAxis39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(itemLabelPosition49);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(shape60);
        org.junit.Assert.assertNull(font62);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(font67);
        org.junit.Assert.assertNotNull(paint68);
        org.junit.Assert.assertNotNull(stroke69);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(font77);
        org.junit.Assert.assertNotNull(stroke78);
        org.junit.Assert.assertNotNull(paint84);
        org.junit.Assert.assertNotNull(shape86);
        org.junit.Assert.assertNull(font87);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        lineAndShapeRenderer15.setBaseURLGenerator(categoryURLGenerator16);
        java.awt.Shape shape19 = lineAndShapeRenderer15.getLegendShape(0);
        lineAndShapeRenderer15.setAutoPopulateSeriesStroke(false);
        java.awt.Font font23 = lineAndShapeRenderer15.getSeriesItemLabelFont(0);
        lineAndShapeRenderer15.setUseSeriesOffset(true);
        java.awt.Shape shape27 = null;
        lineAndShapeRenderer15.setSeriesShape((int) (short) 10, shape27, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = lineAndShapeRenderer15.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor31 = itemLabelPosition30.getTextAnchor();
        barRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition30);
        boolean boolean33 = barRenderer0.getShadowsVisible();
        org.jfree.chart.renderer.category.BarPainter barPainter34 = barRenderer0.getBarPainter();
        barRenderer0.setShadowVisible(false);
        barRenderer0.setSeriesVisible(0, (java.lang.Boolean) true);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis42 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float43 = categoryAxis42.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer47 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color48 = java.awt.Color.BLUE;
        lineAndShapeRenderer47.setBaseItemLabelPaint((java.awt.Paint) color48);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator53 = lineAndShapeRenderer47.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot54 = new org.jfree.chart.plot.CategoryPlot(categoryDataset40, categoryAxis42, valueAxis44, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer47);
        org.jfree.chart.axis.CategoryAxis categoryAxis55 = categoryPlot54.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis56 = null;
        org.jfree.data.Range range57 = categoryPlot54.getDataRange(valueAxis56);
        org.jfree.chart.axis.AxisLocation axisLocation58 = categoryPlot54.getRangeAxisLocation();
        categoryPlot54.clearRangeMarkers(0);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset61 = new org.jfree.data.category.DefaultCategoryDataset();
        int int63 = defaultCategoryDataset61.getColumnIndex((java.lang.Comparable) 3.0d);
        int int65 = defaultCategoryDataset61.getRowIndex((java.lang.Comparable) (byte) 10);
        defaultCategoryDataset61.clearSelection();
        int int67 = categoryPlot54.indexOf((org.jfree.data.category.CategoryDataset) defaultCategoryDataset61);
        defaultCategoryDataset61.validateObject();
        defaultCategoryDataset61.clear();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState70 = defaultCategoryDataset61.getSelectionState();
        org.jfree.data.Range range72 = barRenderer0.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultCategoryDataset61, false);
        defaultCategoryDataset61.setValue((java.lang.Number) (short) -1, (java.lang.Comparable) 50, (java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(font23);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(textAnchor31);
// flaky:         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(barPainter34);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNull(categoryItemLabelGenerator53);
        org.junit.Assert.assertNotNull(categoryAxis55);
        org.junit.Assert.assertNull(range57);
        org.junit.Assert.assertNotNull(axisLocation58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(categoryDatasetSelectionState70);
        org.junit.Assert.assertNull(range72);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot14.getDomainAxis();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot14.getInsets();
        org.jfree.chart.axis.AxisSpace axisSpace17 = null;
        categoryPlot14.setFixedRangeAxisSpace(axisSpace17);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot14.setRangeAxis(valueAxis19);
        categoryPlot14.setDomainCrosshairRowKey((java.lang.Comparable) 192, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot14.getRenderer();
        categoryPlot14.setDomainCrosshairRowKey((java.lang.Comparable) 0.0d, false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(categoryItemRenderer24);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double2 = categoryAxis1.getFixedDimension();
        org.jfree.chart.plot.Plot plot3 = categoryAxis1.getPlot();
        java.lang.String str4 = categoryAxis1.getLabel();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 10);
        int int7 = categoryAxis1.getMaximumCategoryLabelLines();
        categoryAxis1.setTickMarkOutsideLength((float) 128);
        java.awt.Paint paint11 = categoryAxis1.getTickLabelPaint((java.lang.Comparable) (-16.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(plot3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color10 = java.awt.Color.BLUE;
        lineAndShapeRenderer9.setBaseItemLabelPaint((java.awt.Paint) color10);
        java.awt.Shape shape12 = lineAndShapeRenderer9.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity14 = new org.jfree.chart.entity.ChartEntity(shape12, "");
        legendItem1.setLine(shape12);
        java.awt.Shape shape16 = legendItem1.getShape();
        org.jfree.chart.entity.ChartEntity chartEntity19 = new org.jfree.chart.entity.ChartEntity(shape16, "PlotEntity: tooltip = null", "PlotOrientation.VERTICAL");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        lineAndShapeRenderer7.setSeriesVisibleInLegend(3, (java.lang.Boolean) false, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj22 = categoryAxis21.clone();
        java.awt.Font font23 = categoryAxis21.getTickLabelFont();
        lineAndShapeRenderer7.setSeriesItemLabelFont((int) '#', font23);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = lineAndShapeRenderer7.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color10 = java.awt.Color.BLUE;
        lineAndShapeRenderer9.setBaseItemLabelPaint((java.awt.Paint) color10);
        java.awt.Shape shape12 = lineAndShapeRenderer9.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity14 = new org.jfree.chart.entity.ChartEntity(shape12, "");
        legendItem1.setLine(shape12);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset18 = new org.jfree.data.category.DefaultCategoryDataset();
        int int20 = defaultCategoryDataset18.getColumnIndex((java.lang.Comparable) 3.0d);
        int int22 = defaultCategoryDataset18.getRowIndex((java.lang.Comparable) (byte) 10);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color26 = java.awt.Color.BLUE;
        lineAndShapeRenderer25.setBaseItemLabelPaint((java.awt.Paint) color26);
        java.awt.Stroke stroke29 = lineAndShapeRenderer25.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float33 = categoryAxis32.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer37 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color38 = java.awt.Color.BLUE;
        lineAndShapeRenderer37.setBaseItemLabelPaint((java.awt.Paint) color38);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator43 = lineAndShapeRenderer37.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis32, valueAxis34, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer37);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = categoryPlot44.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis47 = lineAndShapeRenderer25.getRangeAxis(categoryPlot44, (int) '4');
        double double48 = categoryPlot44.getRangeCrosshairValue();
        java.awt.Paint paint49 = categoryPlot44.getRangeZeroBaselinePaint();
        int int50 = categoryPlot44.getRangeAxisCount();
        java.awt.Color color51 = java.awt.Color.BLUE;
        categoryPlot44.setRangeMinorGridlinePaint((java.awt.Paint) color51);
        java.awt.Stroke stroke53 = categoryPlot44.getRangeMinorGridlineStroke();
        float float54 = categoryPlot44.getBackgroundAlpha();
        defaultCategoryDataset18.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot44);
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState56 = defaultCategoryDataset18.getSelectionState();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity59 = new org.jfree.chart.entity.CategoryItemEntity(shape12, "TextAnchor.BOTTOM_CENTER", "TextAnchor.BOTTOM_CENTER", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset18, (java.lang.Comparable) "java.awt.Color[r=255,g=255,b=255]", (java.lang.Comparable) (short) -1);
        java.lang.String str60 = categoryItemEntity59.toString();
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis63 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float64 = categoryAxis63.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis65 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer68 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color69 = java.awt.Color.BLUE;
        lineAndShapeRenderer68.setBaseItemLabelPaint((java.awt.Paint) color69);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator74 = lineAndShapeRenderer68.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot75 = new org.jfree.chart.plot.CategoryPlot(categoryDataset61, categoryAxis63, valueAxis65, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer68);
        org.jfree.chart.axis.CategoryAxis categoryAxis76 = categoryPlot75.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis77 = null;
        org.jfree.data.Range range78 = categoryPlot75.getDataRange(valueAxis77);
        org.jfree.chart.axis.AxisLocation axisLocation79 = categoryPlot75.getRangeAxisLocation();
        categoryPlot75.clearRangeMarkers(0);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset82 = new org.jfree.data.category.DefaultCategoryDataset();
        int int84 = defaultCategoryDataset82.getColumnIndex((java.lang.Comparable) 3.0d);
        int int86 = defaultCategoryDataset82.getRowIndex((java.lang.Comparable) (byte) 10);
        defaultCategoryDataset82.clearSelection();
        int int88 = categoryPlot75.indexOf((org.jfree.data.category.CategoryDataset) defaultCategoryDataset82);
        defaultCategoryDataset82.validateObject();
        defaultCategoryDataset82.clear();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState91 = defaultCategoryDataset82.getSelectionState();
        categoryItemEntity59.setDataset((org.jfree.data.category.CategoryDataset) defaultCategoryDataset82);
        categoryItemEntity59.setColumnKey((java.lang.Comparable) (-1));
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNull(stroke29);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNull(categoryItemLabelGenerator43);
        org.junit.Assert.assertNotNull(categoryItemRenderer45);
        org.junit.Assert.assertNull(valueAxis47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 1.0f + "'", float54 == 1.0f);
        org.junit.Assert.assertNotNull(categoryDatasetSelectionState56);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNull(categoryItemLabelGenerator74);
        org.junit.Assert.assertNotNull(categoryAxis76);
        org.junit.Assert.assertNull(range78);
        org.junit.Assert.assertNotNull(axisLocation79);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(categoryDatasetSelectionState91);
    }
}
